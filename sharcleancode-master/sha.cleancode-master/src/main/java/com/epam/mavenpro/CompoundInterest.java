package com.epam.mavenpro;

import java.util.Scanner;

public class CompoundInterest {
	public double findingCompoundInterest()
    {
   float principleAmount,time,rateOfInterest;
   Scanner sc=new Scanner(System.in);
   principleAmount=sc.nextFloat();
   time=sc.nextFloat();
   rateOfInterest=sc.nextFloat();
   double compoundInterest=principleAmount*Math.pow((1.0+(rateOfInterest/100.0)),time);
   return compoundInterest;
        
    }

}
