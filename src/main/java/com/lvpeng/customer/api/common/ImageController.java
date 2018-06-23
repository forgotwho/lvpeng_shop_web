package com.lvpeng.customer.api.common;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.lvpeng.customer.dal.model.File;
import com.lvpeng.customer.dal.repository.FileRepository;

@RestController
@RequestMapping("/images")
public class ImageController {

	@Autowired
	private FileRepository fileRepository;

	@ResponseBody
	@RequestMapping(method = {
			RequestMethod.POST }, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Map<String, String> uploadImage(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> map = new HashMap<String, String>();
		response.addHeader("Access-Control-Allow-Origin", "*");
		String contextpath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
				+ request.getContextPath();
		try {
			if (request instanceof MultipartHttpServletRequest) {
				MultipartHttpServletRequest req = (MultipartHttpServletRequest) request;
				Iterator<String> fileNames = req.getFileNames();
				while (fileNames.hasNext()) {
					String fileName = fileNames.next();
					List<MultipartFile> ffs = req.getFiles(fileName);
					for (MultipartFile ff : ffs) {
						File file = new File(ff.getOriginalFilename(), ff.getContentType(), ff.getSize(),
								ff.getBytes());
						file.setMd5(MD5Encoder.encode(file.getContent()));
						file = fileRepository.save(file);
						map.put("id", file.getId());
						map.put("url", contextpath + "/images/" + file.getId());
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return map;
	}

	@RequestMapping(value = "/{fileId}", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
	public byte[] getImage(@PathVariable String fileId) throws IOException {
		File result = fileRepository.findById(fileId).get();
		return result.getContent();
	}
	
	@RequestMapping(value = "/{fileId}/{type}", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
	public byte[] getImageByType(@PathVariable String fileId) throws IOException {
		File result = fileRepository.findById(fileId).get();
		return result.getContent();
	}

}
