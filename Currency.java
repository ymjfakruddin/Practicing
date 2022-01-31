package currency6.com;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;



public class Currency {
	public static final Logger logger= LogManager.getLogger(Currency.class);
	int  r2000=0, r500=0, r100=0, r50=0, r20=0, r10=0, r5=0, r2=0 , r1=0 ,count=0; 
	int  rd100=0, rd50=0, rd20=0, rd10=0, rd5=0, rd2=0 , rd1=0 ,countd=0;
	int   rp50=0, rp20=0, rp10=0, rp5=0, rp2p=0 , rp1p=0 ,countp=0;
	public void rupees(int amt){

	    while(amt >= 2000) 
	 { 
	  r2000 = amt / 2000 ; 
	  amt = amt % 2000;
	  logger.info("\nTotal Number Of 2000 Rupees Notes :"+ r2000) ;
	  break ; 
	 }
	 while(amt >= 500) 
	 { 
	  r500 = amt / 500 ; 
	  amt = amt % 500;
	  logger.info("\nTotal Number Of 500 Rupees Notes : "+ r500) ;
	  break ; 
	 } 
	 while(amt >= 100) 
	 { 
	  r100 = amt / 100 ; 
	  amt = amt % 100;
	  logger.info("\nTotal Number Of 100 Rupees Notes : "+ r100) ;
	  break ; 
	 } 
	 while(amt >= 50) 
	 { 
	  r50 = amt / 50 ;
	  amt = amt % 50; 
	  logger.info("\nTotal Number Of 50 Rupees Notes : "+ r50) ; 
	  break ; 
	 }  
	 while(amt >= 20) 
	 { 
	  r20 = amt / 20 ; 
	  amt = amt % 20;
	  logger.info("\nTotal Number Of 20 Rupees Notes : "+ r20) ; 
	  break ; 
	 }  
	 while(amt >= 10) 
	 { 
	  r10 = amt / 10 ; 
	  amt = amt % 10;
	  logger.info("\nTotal Number Of 10 Rupees Notes Or Coin : "+ r10) ; 
	  break ; 
	 } 
	 while(amt >= 5) 
	 { 
	  r5 = amt / 5 ; 
	  amt = amt % 5;
	  logger.info("\nTotal Number Of 5 Rupees Notes Or Coin : "+ r5) ; 
	  break ; 
	 } 
	 while(amt >= 2) 
	 { 
	  r2 = amt / 2 ; 
	  amt = amt % 2;
	  logger.info("\nTotal Number Of 2 Rupees Notes Or Coin : "+ r2) ; 
	  break ; 
	 } 
	 while(amt >= 1) 
	 { 
	  r1 = amt / 1 ; 
	  amt = amt % 1;
	  logger.info("\nTotal Number Of 1 Rupees Note Or Coin : "+ r1) ; 
	  break ; 
	 }
	 count = r2000 + r500 + r100 + r50 + r20 + r10 + r5 + r2 + r1;   
	 logger.info("\n\nTotal Number Of Notes Require : "+ count) ; 
	}
	public void dollar(int amt){
		while(amt >= 100) 
		 { 
		  rd100 = amt / 100 ; 
		  amt = amt % 100;
		  logger.info("\nTotal Number Of 100 Dollar : "+ rd100) ;
		  break ; 
		 } 
		 while(amt >= 50) 
		 { 
		  rd50 = amt / 50 ;
		  amt = amt % 50; 
		  logger.info("\nTotal Number Of 50 Dollar : "+ rd50) ; 
		 break ; 
		 }  
		 while(amt >= 20) 
		 { 
		  rd20 = amt / 20 ; 
		  amt = amt % 20;
		  logger.info("\nTotal Number Of 20 Dollar : "+ rd20) ; 
		  break ; 
		 }  
		 while(amt >= 10) 
		 { 
		  rd10 = amt / 10 ; 
		  amt = amt % 10;
		  logger.info("\nTotal Number Of 10 Dollar Or Coin : "+ rd10) ; 
		  break ; 
		 } 
		 while(amt >= 5) 
		 { 
		  rd5 = amt / 5 ; 
		  amt = amt % 5;
		  logger.info("\nTotal Number Of 5 Dollar Or Coin : "+ rd5) ; 
		  break ; 
		 } 
		 while(amt >= 2) 
		 { 
		  rd2 = amt / 2 ; 
		  amt = amt % 2;
		  logger.info("\nTotal Number Of 2 Dollar Or Coin : "+ rd2) ; 
		  break ; 
		 } 
		 while(amt >= 1) 
		 { 
		  rd1 = amt / 1 ; 
		  amt = amt % 1;
		  logger.info("\nTotal Number Of 1 Dollar Or Coin : "+ rd1) ; 
		  break ; 
		 }
		 countd = rd100 + rd50 + rd20 + rd10 + rd5 + rd2 + rd1;   
		 logger.info("\n\nTotal Number Of Dollar Require : "+ countd) ; 
		
		
	}
	public void pound(int amt){
		while(amt >= 50) 
		 { 
		  rp50 = amt / 50 ; 
		  amt = amt % 50;
		  logger.info("\nTotal Number Of 50pounds : "+ rp50) ;
		  break ; 
		 } 
		 
		 while(amt >= 20) 
		 { 
		  rp20 = amt / 20 ; 
		  amt = amt % 20;
		  logger.info("\nTotal Number Of 20 pounds : "+ rp20) ; 
		  break ; 
		 }  
		 while(amt >= 10) 
		 { 
		  rp10 = amt / 10 ; 
		  amt = amt % 10;
		  logger.info("\nTotal Number Of 10 pounds : "+ rp10) ; 
		  break ; 
		 } 
		 while(amt >= 5) 
		 { 
		  rp5 = amt / 5 ; 
		  amt = amt % 5;
		  logger.info("\nTotal Number Of 5 pounds : "+ rp5) ; 
		  break ; 
		 } 
		 while(amt >= 2) 
		 { 
		  rp2p = amt / 2 ; 
		  amt = amt % 2;
		  logger.info("\nTotal Number Of 2 paise : "+ rp2p) ; 
		  break ; 
		 } 
		 while(amt >= 1) 
		 { 
		  rp1p = amt / 1 ; 
		  amt = amt % 1;
		  logger.info("\nTotal Number Of 1 paise : "+ rp1p) ; 
		  break ; 
		 }
		 
		
		 
		 countp =  rp50 + rp20 + rp10 + rp5 + rp2p + rp1p;   
		 logger.info("\n\nTotal Number Of pounds Require : "+ countp) ; 
		
		
	}
	public void compute(int amt)
	{
	}
	public void print()
	{}
}