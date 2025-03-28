package creational.builder.examples.computer.with_director;

public interface ComputerBuilder {
    void buildCPU();
    void buildRAM();
    void buildStorage();
    void buildGPU();
    Computer getComputer();
}
