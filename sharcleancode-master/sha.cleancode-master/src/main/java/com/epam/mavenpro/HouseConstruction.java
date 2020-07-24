package com.epam.mavenpro;
import java.util.*;
public class HouseConstruction {
	public double constructionCost()
	{
        Scanner sc=new Scanner(System.in);
        int materialType=sc.nextInt();
        float area=sc.nextFloat();
        double totalCost[]={12000*area,15000*area,18000*area,25000*area};
        return totalCost[materialType-1];
     }
}
