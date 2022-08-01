package functionalinterface.methodreference;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(4);

        Shapes shapes = new Shapes() {
            @Override
            public int getArea(Square person) {
                return square.calculateArea();
            }
        };
//        System.out.println("Area: "+shapes.getArea(person));
    }
}
