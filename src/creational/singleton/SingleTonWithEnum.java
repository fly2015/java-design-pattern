package creational.singleton;


public class SingleTonWithEnum {
    //Create a singleton class using enum
    public enum Singleton {
        INSTANCE {
            @Override
            void doSomethingElse() {

            }
        };
        public void doSomething() {
            System.out.println("Doing something....");
        }
        abstract void doSomethingElse();
    }
}
