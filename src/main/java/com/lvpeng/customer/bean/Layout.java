/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.customer.bean;
import java.util.List;

/**
 * Auto-generated: 2018-06-23 22:17:23
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Layout {

    private int id;
    private String name;
    private String type;
    private List<Plugins> plugins;
    private List<Components> components;
    public void setId(int id) {
         this.id = id;
     }
     public int getId() {
         return id;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

    public void setPlugins(List<Plugins> plugins) {
         this.plugins = plugins;
     }
     public List<Plugins> getPlugins() {
         return plugins;
     }

    public void setComponents(List<Components> components) {
         this.components = components;
     }
     public List<Components> getComponents() {
         return components;
     }

}