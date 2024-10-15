package q5;

// Plant interface
interface Plant {
    String kind();
    String taste();
    String colour();
}

// Apple class implementing Plant
class Apple implements Plant {
    @Override
    public String kind() {
        return "Fruit";
    }

    @Override
    public String taste() {
        return "Sweet and slightly tart";
    }

    @Override
    public String colour() {
        return "Red or Green";
    }
}

// Banana class implementing Plant
class Banana implements Plant {
    @Override
    public String kind() {
        return "Fruit";
    }

    @Override
    public String taste() {
        return "Sweet";
    }

    @Override
    public String colour() {
        return "Yellow";
    }
}

// Tomato class implementing Plant
class Tomato implements Plant {
    @Override
    public String kind() {
        return "Fruit (botanically) / Vegetable (culinarily)";
    }

    @Override
    public String taste() {
        return "Sweet and tangy";
    }

    @Override
    public String colour() {
        return "Red";
    }
}

// Main class to demonstrate the implementation
public class PlantDemo {
    public static void main(String[] args) {
        Plant apple = new Apple();
        Plant banana = new Banana();
        Plant tomato = new Tomato();

        Plant[] plants = {apple, banana, tomato};
        String[] names = {"Apple", "Banana", "Tomato"};

        for (int i = 0; i < plants.length; i++) {
            System.out.println(names[i] + ":");
            System.out.println("Kind: " + plants[i].kind());
            System.out.println("Taste: " + plants[i].taste());
            System.out.println("Colour: " + plants[i].colour());
            System.out.println();
        }
    }
}