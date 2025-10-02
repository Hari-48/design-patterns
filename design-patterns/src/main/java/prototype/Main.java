package prototype;

import prototype.Examle.Employee;

public class Main {
    public static void main(String[] args) {

//        Shapes circle = new Circle("Yellow");
//        ShapeClient shapeClient = new ShapeClient(circle);
//        Shapes redCircle = shapeClient.createShape();
//        redCircle.draw();
//
//        Shapes circle1 = new Circle("Red");
//        ShapeClient shapeClient1 = new ShapeClient(circle1);
//        Shapes cir = shapeClient1.createShape();
//        cir.draw();


        Circle circle = new Circle("red");
        Circle newCirlce = (Circle) circle.clone();

        circle.draw();
        newCirlce.draw();







        Employee emp1 = new Employee("Hari", "IT");

        // Clone the object
        Employee emp2 = (Employee) emp1.clone();

        emp1.showDetails();
        emp2.showDetails();

    }
}
