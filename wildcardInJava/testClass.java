package wildcardInJava;

import java.util.ArrayList;
import java.util.List;

public class testClass  {
    public static void main(String[] args) {
        shirt shirt1 = new shirt() ;
        shirt shirt2 = new shirt();
        jacket jacket1 = new jacket();
        jacket jacket2 = new jacket() ;

        List<Clothes> clothe  = new ArrayList<>();
        clothe.add(shirt1);
        clothe.add(shirt2);
        clothe.add(jacket1);
        clothe.add(jacket2);
        List<shirt> shirts  = new ArrayList<>();
        shirts.add(shirt1);
        shirts.add(shirt2);
        //this function is normal to print all the subclasses of Clothes now if we want to print only one specific subclass won't work there is the wildcard to use
        printList(clothe);
        //is it's shown in the example it's not working due to the type of the list
     //   printList(shirts);

        printListUsingWildcard(shirts);
    }


    public static void printList(List<Clothes> clothe){
        for (Clothes lco : clothe){
            System.out.println("this is the clothes name : "+lco.clotheName() + " this is the clothes size : " + lco.clotheSize());
        }
    }
    public static void printListUsingWildcard(List<? extends Clothes> clothe){
        for (Clothes lco : clothe){
            System.out.println("this is the clothes name : "+lco.clotheName() + " this is the clothes size : " + lco.clotheSize());
        }
    }
}
