package org.javabeans;

public class Triangle {
	 private int height;

	public Triangle(int height)
	 {
		 this.height = height;
	 }

   public Integer getHeight() {
	return height;
   }

public void draw()
   {
	   System.out.println("ApplicationContext - Constructor  height vlaue ingeter "+getHeight());
   }
}
