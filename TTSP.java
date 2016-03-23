/* Eric Fedrowisch
 * Triangular Traveling Salesman Problem Algorithm
 */
package TSP;

import java.util.ArrayList;
import java.math.BigInteger;
import TSP.Point;
import TSP.Line;
import TSP.Parser;

public class TTSP 
{
  ArrayList<Point> points = new ArrayList<Point>();
  ArrayList<Line> lines = new ArrayList<Line>();
  
  
  public TTSP(String fileName)
  {
    Parser parser = new Parser(fileName);
    this.points = parser.points;
    //The number of combinations is n! / r! / (n-r)! 
    //where n is # of elements and r = elements per combination
    System.out.println("# of Points: "+ this.points.size());
    int[][] c = combination(this.points.size(),2);
    System.out.println(c.length+" line segments");
  }
  
  /*
  public ArrayList<Line> delineateLines(ArrayList<Point> p)
  {
    ArrayList<Line> l = new ArrayList<Line>();
    return lines;
  }*/
  
  //The number of combinations is n! / r! / (n-r)! 
  //where n is # of elements and r = elements per combination
  
  public int[][] combination (int n, int r)
  {
    BigInteger f = factorial(n);
    f = f.divide(factorial(r));
    f = f.divide(factorial(n-r));
    int i = f.intValue();
    int[][] a = new int[i][r];
    return a;
  }
  
  public BigInteger factorial(int n)
  {
    BigInteger f = new BigInteger("1");
    for (int i = 1; i <= n; i++)
    {
      f = f.multiply(new BigInteger(String.valueOf(i)));
    }
    return f;
  }
  
  public static void main(String args[])
  {
    String fileName = null;
    if (args.length > 0){
      fileName = args[0];
      System.out.println("Opening "+fileName);
      TTSP ttsp = new TTSP(fileName);
  }
    else 
    {
      System.out.println("Error: No data filename given.");
      System.exit(0);
    }
  }//end of main
}//end of class
