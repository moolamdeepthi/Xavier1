package com.practise.velakani;

public class Nonstatic 
{ 
   int a=9;
   void velankani()
   {
	   System.out.println("hi");
   }
   
   public static void main(String[] args) 
   
   {
	    Nonstatic obj = new Nonstatic();
	    obj.velankani();
	    System.out.println(obj.a);
   }
}
