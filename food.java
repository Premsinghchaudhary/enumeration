package Enum;

import java.util.Scanner;

 enum food   //enumeration class
{
	 //Declared variables in String type
	momus(120),panner_tikka(500),chomin(80),samosha(100),Rasmalai(200),dosha(300),panner_role(140);
	int item_price;//declared variable in int type.........
	food(int item_price)//create constructor of enumeration........
	{
		this.item_price=item_price;//use the this keyword...
	}
	public int show_price()//create  method 
	{
		return item_price;//use return type.........
	}

	public static  void menu() {//crate method for all process
		Scanner sc=new Scanner(System.in);//use scanner to accept the input from user.....
		String item;//Declared variable.....
		 food fo[]=food.values(); 
		    System.out.println("All items are here");
		    for(food f:fo) {//use for loop....
		    	System.out.println(f);
		    }
			
		System.out.print("Enter the item name:");//get input from user......
		item=sc.next();
		//use the try catch block to show the and handle the exception..........
		try {
	    System.out.println("The price of Item is ="+food.valueOf(item).show_price());
	   }
		catch(Exception e) {
			System.out.println("Please! enter the correct item");
		}
	}
     public static void main(String agrs[]) {//This is my main method ......... 

	 menu();//call the method..........

		}
}
