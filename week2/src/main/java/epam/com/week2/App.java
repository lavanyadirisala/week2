package epam.com.week2;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	List<Sweets>l1=new ArrayList<>();
        Sweets c1=new Choco("silk","fruit and nut",120,150);
        l1.add(c1);
        Sweets c2=new Choco("dark fantasy","oreo",95,100);
        l1.add(c2);
        Sweets c3=new Candy("milky bar ","milk",100,20);
        l1.add(c3);
        Sweets c4=new Candy("lolly pop","alpenliebe",15,5);
        l1.add(c4);
        List<Sweets>l2=new ArrayList<>();
        for(int i=0;i<l1.size();i++){
            if(l1.get(i) instanceof Choco){
                l2.add(l1.get(i));
            }
        }
        Collections.sort(l2,new sortbycost());
        System.out.println("Cost in increasing order : ");
        for(int i=0;i<l2.size();i++){
            System.out.println(l2.get(i).cost);
        }
        int sumweight=0;
        for(int i=0;i<l1.size();i++){
            sumweight+=l1.get(i).weight;
        }
        System.out.println("Total weight in gift : "+sumweight);
        int count=0;
        for(int i=0;i<l1.size();i++){
            if(l1.get(i) instanceof Candy){
                count++;
            }
        }
        System.out.println("Total count of Candies in gift : "+count);
    }
}
