/* Eric Fedrowisch
 * Triangular Traveling Salesman Problem Algorithm
 */
package TSP;
import java.io.*;
import java.util.*;
import TSP.Point.*;
import TSP.Parser.*;

public class TTSP {
  ArrayList<Point> points = new ArrayList<Point>(300);
  //Init Empty TSP 
  public TTSP() {
    
  }
  //Read data file
  public TTSP(String data_file){
    TTSP ttsp = new TTSP();
  }
  
  public static void main(String args[]){
    //Get data filename from args
    String fileName = null;
    if (args.length > 0){
      fileName = args[0];
      System.out.println("Opening "+fileName);
      Parser parser = new Parser(fileName);
      //this.setPoints(parser.points);
    }
    else {
      System.out.println("Error: No data filename given.");
      System.exit(0);
    }
  }
  public void setPoints(ArrayList<Point> p){this.points=p;}
}
