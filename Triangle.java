public class Triangle{
  private Point v1;
  private Point v2;
  private Point v3;
  public Triangle(Point a,Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }
  public Triangle(double a,double b, double c, double d, double e, double f) {
    v1 = Point(a,b);
    v2 = Point(c,d);
    v3 = Point(e,f);
  }
  public double getperimeter() {
    return distance(v1,v2) + distance(v3,v2) + distance(v1,v3);
  }
  public Point getVertex(int a) {
    if (a == 0){
      return Point(this.v1);
    }
    if (a == 1){
      return Point(this.v2);
    }
    if (a == 2){
      return Point(this.v3);
    }
  }








}
