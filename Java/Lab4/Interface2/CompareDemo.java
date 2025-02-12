interface Comparable{
    public double volume();
    public int compareByVolume(Comparable other);
}

class Cuboid implements Comparable{
    double length, width, height;
    Cuboid(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double volume(){
        return length * width * height;
    }

    public int compareByVolume(Comparable other){
        if(this.volume() > other.volume()){
            return 1;
        }
        else if(this.volume() < other.volume()){
            return -1;
        }
        else{
            return 0;
        }
    }
    @Override
    public String toString(){
        return "Volume("+volume()+")";
    }
}

class Cylinder implements Comparable{
    double radius, height;
    Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    
    public double volume(){
        return 3.14*radius*radius*height;
    }
    
    public int compareByVolume(Comparable other){
        if(this.volume() > other.volume()){
            return 1;
        }
        else if(this.volume() < other.volume()){
            return -1;
        }
        else{
            return 0;
        }
    }
    @Override
    public String toString(){
        return "Volume("+volume()+")";
    }
}

public class CompareDemo {
    public static void main(String[] args) {
        Cuboid c1 = new Cuboid(5, 2, 3);
        Cuboid c2 = new Cuboid(5, 5, 3);
        Cylinder c3 = new Cylinder(4, 2);
        Cylinder c4 = new Cylinder(5, 5);
        int result = c1.compareByVolume(c2);
        if (result == 1)
            System.out.println(c1+ " is greater than " +c2);
        else if (result == -1)
            System.out.println(c1+ " is less than " +c2);
        else 
            System.out.println(c1+ " is equal to " +c2);
        int result1 = c3.compareByVolume(c4);
            if (result1 == 1)
                System.out.println(c3+ " is greater than " +c4);
            else if (result1 == -1)
                System.out.println(c3+ " is less than " +c4);
            else 
                System.out.println(c3+ " is equal to " +c4);
    }
}
