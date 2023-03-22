package com.core.tutorial.misc;

public class BlockTest {
	int ix, iy, iz;
	static int cx, cy, cz;
	public BlockTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int x =0, y=20;
		//int x, y ;
		System.out.println("x: " + x + "   y:  " + y );
		System.out.println("cx: " + cx + "   cy:  " + cy + "   cz:  " + cz);
		
		for (x=0; x<10; x++)
		{
			int z= 30;
			y= y-x;
			z= z-2*x;
			System.out.println("x: " + x + "   y:  " + y + "   z:  " + z);						
		}

		System.out.println("x: " + x + "   y:  " + y );
	}

}
