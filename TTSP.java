/* Eric Fedrowisch
 * Triangular Traveling Salesman Problem Algorithm
 */
package TSP;
import java.io.*;
import java.util.*;
import TSP.Point.*;
import TSP.Parser.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TTSP {
  
  public TTSP(String fileName)
  {
    Parser parser = new Parser(fileName);
    ArrayList<Point> points = parser.points;
    
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
