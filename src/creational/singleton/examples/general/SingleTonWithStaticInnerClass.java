package creational.singleton.examples.general;

public class SingleTonWithStaticInnerClass {
    private SingleTonWithStaticInnerClass() {
    }

    private static class SingletonHolder {
        private static final SingleTonWithStaticInnerClass INSTANCE = new SingleTonWithStaticInnerClass();
    }

    public static SingleTonWithStaticInnerClass getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
