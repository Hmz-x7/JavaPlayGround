package CollectionsAndMapps;

import java.util.LinkedList;

public class LinkedListExample {


    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList<>();
        list.add("this is the first item in the list !!!");
        list.add("this is the second item in the list !!!");
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        //this function to print and remove the first item in the list
        System.out.println(list.poll());
        System.out.println(list);
        //this also the same as poll but the only difference is when you are calling the poll function in empty list
        //it will print null in the console on the other hand pop will give an error no such Element exception
        System.out.println(list.pop());
        System.out.println(list);
        System.out.println(list.poll());
        System.out.println(list.pop());

    }
}
