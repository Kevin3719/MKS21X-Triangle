public class Driver{
  public static void main(String[] args) {
    Point ver1 = new Point(23.0,4.0);
    Point ver2 = new Point(-2.3,5.001);
    Point ver3 = new Point(5.0,0.52);
    Triangle newtri = new Triangle(ver1 , ver2 , ver3);
    System.out.println(newtri);
    //should print "Triangle: A(23.0,4.0) B(-2.3,5.001) C(5.0,0.52)"
    System.out.println(newtri.getperimeter());
    //should print out 52.2
    newtri.setVertex(2,new Point(1.0,2.0));
    System.out.println(newtri);
    //should print "Triangle: A(23.0,4.0) B(-2.3,5.001) C(1.0,2.0)"
    System.out.println(newtri.getVertex(2));
    //should print out (1.0,2.0)
    System.out.println(newtri.getperimeter());
    //should print out 51.8
    Triangle newtri1 = new Triangle(new Point(0,0),new Point(3,0), new Point(0,4));
    System.out.println(newtri1.getperimeter());
    //should print out 12
}
}
