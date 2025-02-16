package creational.singleton;

public class SingleTonWithLazyLoadFlaw {
    private static SingleTonWithLazyLoadFlaw instance;

    private SingleTonWithLazyLoadFlaw() {
    }

    public static SingleTonWithLazyLoadFlaw getInstance() {
        if (instance == null) {
            instance = new SingleTonWithLazyLoadFlaw();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingleTonWithLazyLoadFlaw instance1 = SingleTonWithLazyLoadFlaw.getInstance();
        SingleTonWithLazyLoadFlaw instance2 = SingleTonWithLazyLoadFlaw.getInstance();
        System.out.println(instance1 == instance2);
    }
}
