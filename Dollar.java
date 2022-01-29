package currency6.com;

import java.text.DecimalFormat;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class Dollar extends Currency {
	public static final Logger logger= LogManager.getLogger(Currency.class);
	int rupee=0;
	DecimalFormat f = new DecimalFormat("##.##");
	public void compute(int amt){
		logger.info("how much money u want to convert into dollars");
		logger.info(amt+"dollars");
		rupee = amt * 100;
		
		
	}
public void print(){
	logger.info("Your  dollar is : " + f.format(rupee) + " Ruppes");

}
}