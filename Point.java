package TSP;
public class Point{
  public double x,y;
  public int node;
  
  public Point(int n, double a, double b){
    this.node = n; 
    this.x = a;
    this.y = b;
  }
  
  public String toString()
  {
    String s;
    s = "("+String.valueOf(this.x)+","+String.valueOf(this.y)+")";
    return s;
  }
}