package com.training.assignments;

import java.util.List;

public class MobileClient {
	public static void main(String[] args) {
		Mobile [] mobiles = new Mobile[] {
				new Mobile(), 
				new Mobile(), 
				new Mobile() 
		}; 
		
		mobiles[0].setImei(123456);
		mobiles[0].setMake("Samsung");
		mobiles[0].setModel("s10");
		
		mobiles[1].setImei(44332211);
		mobiles[1].setMake("Apple");
		mobiles[1].setModel("XS");
		
		mobiles[2].setImei(565656);
		mobiles[2].setMake("OnePlus");
		mobiles[2].setModel("6t-Mclaren");
		
		
		for(Mobile temp : mobiles) {
			System.out.println(temp);
		}
	}
}
