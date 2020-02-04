package epam.com.week2;

import java.util.*;
public class Sweets
{
        String name;
        String flavour;
		int weight;
		int cost;
	
	Sweets(String name,String flavour,int weight,int cost){
        this.name=name;
        this.flavour=flavour;
		this.weight=weight;
		this.cost=cost;
    }
}
class sortbycost implements Comparator<Sweets>{
    public int compare(Sweets a,Sweets b){
        return a.cost-b.cost;
    }
}
class sortbyweight implements Comparator<Sweets>{
    public int compare(Sweets a,Sweets b){
        return b.weight-a.weight;
    }
}
