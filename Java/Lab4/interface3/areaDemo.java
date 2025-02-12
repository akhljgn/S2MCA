import java.util.Scanner;
interface Area{
    public double area();    
    public double perimeter();
    public void show();
}


class Rectangle implements Area{
    private double length;
    private double width;
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public void show() {
        System.out.println("Rectangle("+length+","+width+")");
    }

    public double area(){
        return length*width;
    }

    public double perimeter(){
        return 2*(length+width);
    }
}

public class areaDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = newInt();
        do{
        System.out.println("Enter your choice: ");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Exit");
        

        }while(choice!=3);
        r.show();
        System.out.println("Area:" + r.area());
        System.out.println("Perimeter:" +r.perimeter());
    }
}
