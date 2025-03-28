package creational.builder.examples.computer.with_director;

public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer = new Computer();

    @Override
    public void buildCPU() { computer.setCPU("Intel i9"); }
    @Override
    public void buildRAM() { computer.setRAM("32GB DDR5"); }
    @Override
    public void buildStorage() { computer.setStorage("1TB NVMe SSD"); }
    @Override
    public void buildGPU() { computer.setGPU("NVIDIA RTX 4090"); }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
