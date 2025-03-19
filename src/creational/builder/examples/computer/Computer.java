package creational.builder.examples.computer;

public class Computer {
    private final String cpu;
    private final String ram;
    private final String gpu;
    private final Long storage;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.gpu = builder.gpu;
        this.storage = builder.storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", gpu='" + gpu + '\'' +
                ", storage=" + storage +
                '}';
    }

    public static class Builder {
        private String cpu;
        private String ram;
        private String gpu;
        private Long storage;

        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder gpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder storage(Long storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public static void main(String[] args) {
        Computer computer = new Builder("CPU", "Ram").gpu("G63").storage(500L).build();
        System.out.println(computer);
    }
}
