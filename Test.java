public class Test {
    public static void main(String args[]){
        Rectangle r1 = new Rectangle(5,10);
        Rectangle r2 = new Rectangle(15,10);
        Rectangle r3 = new Rectangle(5,10);

        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));
        
        Object o1 = new Rectangle(5,10);
        Object o2 = new Rectangle(15,15);
        Object o3 = new Square(15);

        System.out.println("Objects are identical: " + o1.equals(o2));
        System.out.println("Objects are identical: "+ o1.equals(o3));
        System.out.println("Objects are identical: " + o2.equals(o3));

        Point p = new Point(2, 3);
        System.out.println("Point: " + p.x + ", " + p.y);

        p.moveUp();
        p.moveRight();
        System.out.println("Point after move: " + p.x + ", " + p.y);

        Circle c = new Circle(new Point(5, 5), 10);
        System.out.println("Circle center: " + c.center.x + ", " + c.center.y);

        c.moveLeft();
        c.moveDown();
        System.out.println("Circle center after move: " + c.center.x + ", " + c.center.y);
    }
}
