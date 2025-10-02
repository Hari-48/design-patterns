package prototype;

public class ShapeClient {

    private Shapes newShapes;

    public ShapeClient(Shapes shapes){
        this.newShapes=shapes;
    }

    public Shapes createShape(){
        return newShapes.clone();
    }
}
