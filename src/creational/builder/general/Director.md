Builder (ComputerBuilder): Defines methods to set up parts of the computer.
Concrete Builders (GamingComputerBuilder, OfficeComputerBuilder): Implements the builder with specific configurations.
Product (Computer): The final object being built.
Director (ComputerDirector): Controls the building process and ensures a consistent configuration.