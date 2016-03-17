/* Eric Fedrowisch
 * Triangular Traveling Salesman Problem Algorithm
 */

import java.io.*;

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
    String filename = null;
    if (args.length > 0) {filename = args[0];}
    else {
      System.out.println("Error: No data filename given.");
      System.exit(0);
    }
  
  }
}