package org.system;

public class AxisBank extends BankInfo 
{
	
  public void deposit() {
	  
	  System.out.println("AxisBank - DEPOSIT ( OVERRIDDING EXAMPLE )");
  }
  
  public static void main(String[] args) {
	
	  AxisBank object = new AxisBank();
	  object.deposit();
}
}
