
class Computer {
    private String CPU;
    private String GPU;
    private int RAM;
    private int storage;

    // Private constructor
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
    }

    // Getters
    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", GPU=" + GPU + ", RAM=" + RAM + "GB, Storage=" + storage + "GB]";
    }

    // Builder: Constructs the Product
    public static class Builder {
        private String CPU;
        private String GPU;
        private int RAM;
        private int storage;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this; // Returning this allows method chaining
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            return new Computer(this); // Constructs the product
        }
    }
}

// Client: Uses the Builder
public class Main {
    public static void main(String[] args) {
        // Building the computer object step by step
        Computer gamingPC = new Computer.Builder()
                              .setCPU("Intel i9")
                              .setGPU("NVIDIA RTX 4090")
                              .setRAM(32)
                              .setStorage(2000)
                              .build();

        Computer budgetPC = new Computer.Builder()
                             .setCPU("Intel i5")
                             .setRAM(8)
                             .setStorage(512)
                             .build();

        System.out.println(gamingPC);
        System.out.println(budgetPC);
    }
}
