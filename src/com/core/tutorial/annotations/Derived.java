package com.core.tutorial.annotations;

class Base 
{ 
  public void display() 
     { 
         System.out.println("Base display()"); 
     } 
} 
class Derived extends Base 
{ 
    /* @Override
     public void display(int x) */
	
    /* @Override
    public void disPlay() */
	
	@Override
	public void display()
     { 
         System.out.println("Derived display(int )"); 
     } 
  
     public static void main(String args[]) 
     { 
         Derived obj = new Derived(); 
         obj.display(); 
     } 
}