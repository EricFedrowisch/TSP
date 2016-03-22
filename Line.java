package TSP;

import TSP.Point.*;
public class Line{
  String ID;
  Point[] points = new Point[2];
  double length;

  public Line(Point a, Point b)
  {
    this.points[0] = a;
    this.points[1] = b;
    this.ID = this.toString();
    this.length = this.length();
  }
  
  public double length()
  {
    double l = 0;
    return l;
  }
  
  public String toString()
  {
    Point a = this.points[0];
    Point b = this.points[1];
    return a.node+'-'+b.node+"["+a.toString()+","+b.toString()+"]";
  }

}//End of class