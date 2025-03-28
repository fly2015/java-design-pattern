package creational.builder.examples.computer.with_director;

public class Client {
    public static void main(String[] args) {
        // Creating a gaming computer
        ComputerBuilder gamingBuilder = new GamingComputerBuilder();
        ComputerDirector director1 = new ComputerDirector(gamingBuilder);
        director1.constructComputer();
        Computer gamingPC = director1.getComputer();
        System.out.println("Gaming PC: " + gamingPC);

        // Creating an office computer
        ComputerBuilder officeBuilder = new OfficeComputerBuilder();
        ComputerDirector director2 = new ComputerDirector(officeBuilder);
        director2.constructComputer();
        Computer officePC = director2.getComputer();
        System.out.println("Office PC: " + officePC);
    }

}
