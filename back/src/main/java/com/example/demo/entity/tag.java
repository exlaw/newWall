package com.example.demo.entity;

public class tag {
   private int JAVA=0;
   private int JS=1;
   private int c =2;
   private int c1=3;

   public String value;

   public String getValue(int key){
       switch (key){
           case 0:
               return "JAVA";
           case 1:
               return "JS";
           case 2:
               return "C";
           case 3:
               return "C++";
           default:
               return "NONE";
       }
   }
}
