import java.util.Arrays;
import java.util.List;

public class generics {

    public static void main(String[] args) {
        Double [] doubles = {32.4,325.3,435.24};
        Integer [] numbers = {4,34,5,6,78,9};
        String [] names = {"Ahmed", "Kosay", "Fahad","Hamzah","Hussam"};

        List<Double> doublesList = convertNumbersArrayToList(doubles);
        List<Integer> numbersList = convertNumbersArrayToList(numbers);
        List<String> namesList = convertAnyArrayToList(names);
        //to display the lists
        System.out.println(numbersList);
        System.out.println(doublesList);
        System.out.println(namesList);
        //as it's shown if we tried to convert the String array in the numbers function it will show an error  says
        // can't convert a String into number
       // List <String> namesList1 = convertNumbersArrayToList(names);
    }
    //this the generic function that accept any array type of data and convert it to list
    // we can modify it to be exclusive for specific type of data or collection of data by using the extends key word
    public static  <T> List<T> convertAnyArrayToList(T [] array){
        return Arrays.asList(array);
    }
    public static  <T extends  Number> List<T> convertNumbersArrayToList(T [] array){
        return Arrays.asList(array);
    }


}
