package q4;

// Shape interface
interface Shape {
    void draw();
    int howManySides();
}

// Rectangle class implementing Shape
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }

    @Override
    public int howManySides() {
        return 4;
    }
}

// Cube class implementing Shape
class Cube implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Cube");
    }

    @Override
    public int howManySides() {
        return 6; // A cube has 6 faces
    }
}

// Main class to demonstrate the implementation
public class ShapeDemo {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape cube = new Cube();

        System.out.println("Rectangle:");
        rectangle.draw();
        System.out.println("Number of sides: " + rectangle.howManySides());

        System.out.println("\nCube:");
        cube.draw();
        System.out.println("Number of sides: " + cube.howManySides());
    }
}