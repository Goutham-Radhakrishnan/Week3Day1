package org.system;

public class Desktop extends Computer {
	
	public void desktopSize() 
	{
		System.out.println("DESKTOP SIZE");
	}

	public static void main(String[] args) 
	{
		Desktop object = new Desktop();
		object.desktopSize();
		object.computerModel();
	}
}
