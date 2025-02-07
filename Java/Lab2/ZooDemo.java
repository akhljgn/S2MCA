class Zoo{
    String name;
    String[] enclosures;

    public Zoo(String name, String[] enclosures) {
        this.name = name;
        this.enclosures = enclosures;
    }

    public void displayZoo(){
        System.out.println("Welcome to " + name);
        for(String x: enclosures)
            System.out.println("We have " + x);
    }

    class Enclosures{
        String name;
        String Type;
        String[] animals;

        public Enclosures(String name, String Type, String[] animals) {
            this.name = name;
            this.Type = Type;
            this.animals = animals;
        }

        public void displayEnc(){
            System.out.println("Name: " + name);
            System.out.println("Type: " + Type);
            for(int i=0; i<animals.length; i++)
            {
                System.out.println("We have "+animals[i]+ " in " + enclosures[i]);
            }
        }
    }

    static class ZooInfo{
        String address;
        String phone;

        public ZooInfo(String a, String p) {
            address = a;
            phone = p;
        }

        public void displayInfo(){
            System.out.println();
        }
    }

}

public class ZooDemo {
    public static void main(String[] args) {
        String[] animals = {"Simham", "Puli", "Kili"};
        String[] enclosures = {"Simhathinte ghuha", "Pulide ghuha", "Kilikalde maram"};
        Zoo zoo = new Zoo("Kerala Zoo", enclosures);
        Zoo.Enclosures enc = zoo.new Enclosures("OutDoor Kazhchakal", "Wild", animals);
        zoo.displayZoo();
        enc.displayEnc();
    }
}
