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
  }
  
  public ArrayList<Point> parse(String file)
  {
   ArrayList<Point> p = new ArrayList<Point>(300);
   String line = null; //For readLine()
   String pattern = "(\\d+)(.+)(\\d+)(.+)(\\d+)";
   String[] match;
   Pattern regex = Pattern.compile(pattern);
   try {
      BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
      int c = 0;
      while((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
        Matcher m = regex.matcher(line);
        if (m.find()) {
          c++;
          match=m.group(0).split("( )");
          int n = Integer.parseInt(match[0]);
          double a = Double.parseDouble(match[1]);
          double b = Double.parseDouble(match[2]);
          System.out.println(n+","+a+","+b);
          /*
          this.points.add(new Point(Integer.parseInt(match[0]),
                                    Double.parseDouble(match[1]),
                                    Double.parseDouble(match[2])
                    ));*/
          //for (String s : match){System.out.println(s);}
        }
      }
      System.out.println("Found: " + c);
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
