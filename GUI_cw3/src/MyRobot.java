public class MyRobot {

    private MyService myService;

    public void myLoop(){
        for(int i =0; i<10; i++){
            int rnd = 1 + (int)(Math.random() * 5);
            System.out.println(
                    "MyRobot::myLoop() -> i:" + i +
                            "\trnd: " + rnd
            );
        }
    }

}