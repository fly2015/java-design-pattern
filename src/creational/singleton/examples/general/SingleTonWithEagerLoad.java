package creational.singleton.examples.general;

public class SingleTonWithEagerLoad {
    private static final SingleTonWithEagerLoad instance = new SingleTonWithEagerLoad();

    private SingleTonWithEagerLoad() {
    }

    public static SingleTonWithEagerLoad getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        SingleTonWithEagerLoad instance1 = SingleTonWithEagerLoad.getInstance();
        SingleTonWithEagerLoad instance2 = SingleTonWithEagerLoad.getInstance();
        System.out.println(instance1 == instance2);
    }
}
