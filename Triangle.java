public class Triangle{
  private Point v1;
  private Point v2;
  private Point v3;
  public Triangle(Point a,Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }
  // reused Point to make it look clean
  public Triangle(double a,double b, double c, double d, double e, double f) {
    v1 = new Point(a,b);
    v2 = new Point(c,d);
    v3 = new Point(e,f);
  }
  public double getperimeter() {
    return Point.distance(v1,v2) + Point.distance(v3,v2) + Point.distance(v1,v3);
  }
  // I didn't understand how to implement the int, so i ended up using 3 fors. Could've used a while loop, but it would have been the same.
  public Point getVertex(int a) {
    if (a == 0){
      return new Point(this.v1);
    }
    if (a == 1){
      return new Point(this.v2);
    }
    if (a == 2){
      return new Point(this.v3);
    }
    return null;
  }
  public void setVertex(int a, Point p) {
  if (a == 0){
    this.v1 = new Point(p);
  }
  if (a == 1){
    this.v2 = new Point(p);
  }
  if (a == 2){
    this.v3 = new Point(p);
  }
  }
  // I used the toString method from Point.java
  public String toString() {
    return "Triangle: A" + v1 + " B" + v2 + " C" + v3;
  }






}
