/* Eric Fedrowisch
 * Triangular Traveling Salesman Problem Algorithm
 */
package TSP;
import java.io.*;
import java.util.*;
import TSP.Point.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TTSP {
  
  public TTSP(String fileName)
  {
   ArrayList<Point> points = this.parse(fileName);
    for (Point p: points) {System.out.println(p.x+","+p.y);}
    System.out.println("# of Points: "+ points.size());
  }
  
  public ArrayList<Point> parse(String file)
  {
   ArrayList<Point> p = new ArrayList<Point>();
   String line = null; //For readLine()
   String pattern = "(\\d+)(.+)(\\d+)(.+)(\\d+)";
   String[] match;
   Pattern regex = Pattern.compile(pattern);
   try {
      BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
      while((line = bufferedReader.readLine()) != null) {
        //System.out.println(line);
        Matcher m = regex.matcher(line);
        if (m.find()) {
          match=m.group(0).split("(\\s+)");
          int n = Integer.parseInt(match[0]);
          double a = Double.parseDouble(match[1]);
          double b = Double.parseDouble(match[2]);
          //System.out.println(n+","+a+","+b);
          p.add(new Point(n,a,b));
        }
      }
      bufferedReader.close();         
    }//End of try
    catch(FileNotFoundException e){
      System.out.println("Can't open "+file);
      e.printStackTrace();
    }//End of catch FileNotFound
    catch(IOException e) {
      System.out.println("Can't read "+file);
      e.printStackTrace();
    }//End of catch IOException
    
   return p;
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
