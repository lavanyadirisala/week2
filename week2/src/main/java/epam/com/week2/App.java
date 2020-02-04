package epam.com.week2;

import java.io.*;
import java.util.*;
class App
{
    public static void main(String []args){
        List<Sweets>l1=new ArrayList<>();
        Sweets c1=new Choco("silk","Fruit and nut",120,150);
        l1.add(c1);
        Sweets c2=new Choco("dark fantasy","Oreo",95,100);
        l1.add(c2);
        Sweets c3=new Candy("milky bar ","Milk",100,20);
        l1.add(c3);
        Sweets c4=new Candy("lolly pop","Alpenliebe",15,5);
        l1.add(c4);
        l1.add(new Candy("Chocolate Truffle"," Chocolate",300,150));
        l1.add(new Candy("Twizzlers","Fruits",150,90));
        l1.add(new Candy("Coffee Crispy","Coffee",50,50));
        l1.add(new Candy("Chocolate fish","Chocolate",500,300));
        l1.add(new Candy("Hershey Bar","Milk",200,100));
        l1.add(new Candy("Lindt","Pure Choco",30,45));
        List<Sweets>l2=new ArrayList<>();
        for(int i=0;i<l1.size();i++){
            if(l1.get(i) instanceof Choco){
                l2.add(l1.get(i));
            }
        }
        
        int sumweight=0;
        for(int i=0;i<l1.size();i++){
            sumweight+=l1.get(i).weight;
        }
        System.out.println("Total weight in gift : "+sumweight);
        Collections.sort(l2,new sortbycost());
        System.out.println("Cost in increasing order : ");
        for(int i=0;i<l2.size();i++){
            System.out.println(l2.get(i).cost);
        }
        int countabove0=0;
        int countabove50=0;
        int countabove100=0;

        for(int i=0;i<l1.size();i++){
            if(l1.get(i) instanceof Candy){
                if(l1.get(i).cost>=0 && l1.get(i).cost<50){
                    countabove0++;
                }
                else if(l1.get(i).cost>=50 && l1.get(i).cost<100){
                    countabove50++;
                }
                else
                {
                    countabove100++;
                }
            }
        }
        System.out.println("Total count of Candies in gift below 50 : "+countabove0);
        System.out.println("Total count of Candies in gift below 100 : "+countabove50);
        System.out.println("Total count of Candies in gift below 200 : "+countabove100);

    }
}

        
