package CompositeDesignPattern.FileSystem;

import CompositeDesignPattern.FileSystem.component;

public class file implements component {

   private String name;
    private int size;
   public file (String name,int size){
            this.name=name;
       this.size=size;}
    @Override
    public int getSize() {
         return size;
}}
