package com.collections;
import java.util.*;

public class TestCollectionVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			  Vector<String> v=new Vector<String>();//creating vector  
			  v.add("umesh");//method of Collection  
			  v.addElement("irfan");//method of Vector  
			  v.addElement("kumar");  
	  //traversing elements using Enumeration  
			  Enumeration e=v.elements();  
			  while(e.hasMoreElements()){  
			   System.out.println(e.nextElement());  
			  }  
	 }      
}
