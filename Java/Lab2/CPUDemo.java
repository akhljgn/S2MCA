class CPU{
    int price;

    public CPU(int price){
        this.price = price;
    }

    public void display(){
        System.out.println("CPU Price: " + price);
    }

    class Processor{
        int no_of_cores;
        String manufacturer;
        
        public Processor(int no_of_cores, String manufacturer){
            this.no_of_cores = no_of_cores;
            this.manufacturer = manufacturer;
        }

        public void display_processor(){
            System.out.println("Number of Cores: " + no_of_cores+ "\nManufacturer: " + manufacturer);
        }
    }

    static class Ram{
        int memory;
        String manufacturer;

        public Ram(int memory, String manufacturer){
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        public void display_ram(){
            System.out.println("Capacity: "+ memory + "GB\nManufacturer: " + manufacturer);
        }
    }

}

public class CPUDemo{
    public static void main(String[] args) {
        CPU cpu = new CPU(1000);
        CPU.Processor pro = cpu.new Processor(8, "Intel");
        CPU.Ram ram = new CPU.Ram(16, "Corsair");
        cpu.display();
        pro.display_processor();
        ram.display_ram();
    }
}