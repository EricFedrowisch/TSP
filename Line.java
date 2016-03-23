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
    this.ID = "["+a.toString()+","+b.toString()+"]";
    this.length = this.length();
  }
  
  public double length()
  {
    double l = 0;
    double x1,x2,y1,y2;
    x1 = this.points[0].x;
    x2 = this.points[1].x;
    y1 = this.points[0].y;
    y2 = this.points[1].y;
    l = (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
    l = Math.sqrt(l);
    return l;
  }

}//End of class