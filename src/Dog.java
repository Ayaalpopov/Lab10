public class Dog extends Animal {
    @Override
    public void run(double distance) {
        if ((distance < 500.1 )) {
            System.out.println("true");
            System.out.println("false");
        }
    }

    @Override
    public void swim(double meters) {
        if ((meters < 10.1)) {
            System.out.println("true");
            System.out.println("false");
        }
    }

    @Override
    public void jump(double height) {
        if ((height < 0.6)) {
            System.out.println("true");
            System.out.println("false");
        }
    }
}