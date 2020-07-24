package com.epam.mavenpro;
public class Task 
	{
    public static void main( String[] args )
    {
    	System.out.println("enter principle amount,time and rate of interest to calculate simple interest"); 
    	SimpleInterest si= new SimpleInterest();
        System.out.println("Simple Interest :"+si.findingSimpleInterest());
        System.out.println("enter principle amount,time and rate of interest to calculate compound interest");
        CompoundInterest ci=new CompoundInterest();
        System.out.println("Coumpound Interest :"+ci.findingCompoundInterest());
        HouseConstruction h=new HouseConstruction();
	    System.out.println("enter 1 for standard material \n   2 for above standard material \n   3 for high standard material \n   4 for high standard material and automated home");                         
        System.out.println("enter area");
		System.out.println("Amount for construction :"+h.constructionCost());
      }
}
