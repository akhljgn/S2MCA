interface printable{
    public void display();
    public void show();
}

interface computable{
    public double area();
    public double perimeter();
    public double volume();
}

interface drawable{
    public void draw();
}

class Rectangle implements drawable, printable, computable{
    private double length;
    private double width;
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public void display() {
        System.out.println("Rectangle("+length+","+width+")");
    }
    public void show(){}

    public double area(){
        return length*width;
    }

    public double perimeter(){
        return 2*(length+width);
    }

    public double volume(){
        return -1;
    }

    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(8, 10);
        r.display();
        r.show();
        System.out.println("Area:" + r.area());
        System.out.println("Perimeter:" +r.perimeter());
        r.draw();
        r.volume();
    }
}
