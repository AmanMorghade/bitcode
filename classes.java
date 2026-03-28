class A extends Thread{

    public void run(){
        for(int i=0;i<50;i++){
            System.out.print("A");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<50;i++){
            System.out.print("  B");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class classes{
    public static void main(String[] args) {
        A obj = new A();
        B obj2 = new B();

        // obj2.setPriority(1);
        // obj.setPriority(10);
        obj.start();
        obj2.start();
    }
}