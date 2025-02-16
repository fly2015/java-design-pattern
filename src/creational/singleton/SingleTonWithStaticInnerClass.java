package creational.singleton;

public class SingleTonWithStaticInnerClass {
    private static SingleTonWithStaticInnerClass instance;

    private SingleTonWithStaticInnerClass() {
    }

    private static class SingletonHolder {
        private static final SingleTonWithStaticInnerClass INSTANCE = new SingleTonWithStaticInnerClass();
    }

    public static SingleTonWithStaticInnerClass getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
