package lambda;

public class Main {
    public static void main(String[] args) {

        //in here we are using a concrete class to implement the greeting function
        greetingClass greet = new greetingClass();
        greet.message();
        //in this part we are going to use the lambda method to do that
        //and this is how you create a lambda function
        greetingInterface helloWorld = () -> System.out.println("Hello world !!");
        helloWorld.message();
        greetingInterface afternoonGreeting = ( ) ->
        {
    int i = 0;
            if ( i == 0 ){

            System.out.println("Good Afternoom");
            }else {
                System.out.println("Good morning");
            }
        };
        afternoonGreeting.message(); ;
        greetingInterface mello = (hello::hello);
        mello.message();
        System.out.println();
    }


}
