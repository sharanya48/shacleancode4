package com.epam.mavenpro;
import java.util.*;
public class SimpleInterest
{
    public float findingSimpleInterest()
    {
   float principleAmount,time,rateOfInterest;
   Scanner sc=new Scanner(System.in);
   principleAmount=sc.nextFloat();
   time=sc.nextFloat();
   rateOfInterest=sc.nextFloat();
   float simpleInterest=(principleAmount*time* rateOfInterest)/100;
   return simpleInterest;
        
    }
}
