package prototype;

public class Circle implements Shapes{

    public Circle(String colour) {
        this.colour = colour;
    }

    private String colour ;


    @Override
    public Shapes clone() {
        return new Circle(this.colour);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a "+this.colour + "Circle");
    }
}
