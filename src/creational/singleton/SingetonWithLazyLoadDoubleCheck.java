package creational.singleton;

public class SingetonWithLazyLoadDoubleCheck {
    private static SingetonWithLazyLoadDoubleCheck instance;

    private SingetonWithLazyLoadDoubleCheck() {
    }

    public static SingetonWithLazyLoadDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingetonWithLazyLoadDoubleCheck.class) {
                if (instance == null) {
                    instance = new SingetonWithLazyLoadDoubleCheck();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        SingetonWithLazyLoadDoubleCheck instance1 = SingetonWithLazyLoadDoubleCheck.getInstance();
        SingetonWithLazyLoadDoubleCheck instance2 = SingetonWithLazyLoadDoubleCheck.getInstance();
        System.out.println(instance1 == instance2);
    }
}
