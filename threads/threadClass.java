package threads;

public class threadClass extends  Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1) +" : this is thread : "+ this.getName());
        }
    }
}
