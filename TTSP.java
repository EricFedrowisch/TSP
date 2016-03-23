/* Eric Fedrowisch
 * Triangular Traveling Salesman Problem Algorithm
 */
package TSP;

import java.util.ArrayList;
import TSP.Point;
import TSP.Line;
import TSP.Parser;

public class TTSP {
  
  public TTSP(String fileName)
  {
    Parser parser = new Parser(fileName);
    ArrayList<Point> points = parser.points;
    //Toy example
    Line l = new Line(points.get(3),points.get(1));
    System.out.println(l.ID);
    System.out.println(l.length);
    
  }
  
  public static void main(String args[]){
    String fileName = null;
    if (args.length > 0){
      fileName = args[0];
      System.out.println("Opening "+fileName);
      TTSP ttsp = new TTSP(fileName);
    }
    else {
      System.out.println("Error: No data filename given.");
      System.exit(0);
    }
  }//end of main
}//end of class
