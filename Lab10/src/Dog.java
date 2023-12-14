public class Dog extends Animal {
    @Override
    public void run(double distance) {
        if ((distance > 0)) {
            System.out.println("true");
            System.out.println("false");
        }
    }

    @Override
    public void swim(double meters) {
        if ((meters > 0)) {
            System.out.println("true");
            System.out.println("false");
        }
    }

    @Override
    public void jump(double height) {
        if ((height > 0)) {
            System.out.println("true");
            System.out.println("false");
        }
    }
}