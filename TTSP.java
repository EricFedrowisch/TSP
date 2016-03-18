/* Eric Fedrowisch
 * Triangular Traveling Salesman Problem Algorithm
 */
package TSP;
import java.io.*;
import TSP.Point.*;
import TSP.Parser.*;

public class TTSP {
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
    }
    else {
      System.out.println("Error: No data filename given.");
      System.exit(0);
    }
  
  }
}
