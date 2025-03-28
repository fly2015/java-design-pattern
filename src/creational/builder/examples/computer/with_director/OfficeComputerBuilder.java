package creational.builder.examples.computer.with_director;

public class OfficeComputerBuilder implements ComputerBuilder{
    private Computer computer = new Computer();

    public void buildCPU() {
        computer.setCPU("Intel i5");
    }

    public void buildRAM() {
        computer.setRAM("16GB DDR4");
    }

    public void buildStorage() {
        computer.setStorage("512GB SSD");
    }

    public void buildGPU() {
        computer.setGPU("Integrated Graphics");
    }

    public Computer getComputer() {
        return computer;
    }
}
