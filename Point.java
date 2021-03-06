public class Point{
  private double x;
  private double y;
// many simple procedures
  public Point(double newx,double newy) {
    x = newx;
    y = newy;
  }
  public Point(Point p) {
    x = p.x;
    y = p.y;
  }
  public double getX() {
    return x;
  }
  public double getY() {
    return y;
  }
  public static double pythag(double a,double b) {
    return Math.sqrt(a * a + b * b);
  }
  public double distanceTo(Point p) {
    return pythag(this.x - p.x, this.y - p.y);
  }
  public static double distance(Point a, Point b) {
    return pythag(a.x - b.x, a.y - b.y);
  }
  public String toString() {
    return "(" + x + "," + y + ")";
  }
}
