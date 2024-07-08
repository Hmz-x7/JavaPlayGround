package lambda;

public class greetingClass implements greetingInterface {
    @Override
    public void message() {
        System.out.println("greeting from the greeting class implementing the greeting interface using the message function ! : )  ");
    }
}
