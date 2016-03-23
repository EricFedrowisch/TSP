package TSP;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import TSP.Point.*;

public class Parser{
  String line = null; //For readLine()
  ArrayList<Point> points = new ArrayList<Point>();
  String pattern = "(\\d+)(.+)(\\d+)(.+)(\\d+)";
  String[] match;
  Pattern regex = Pattern.compile(pattern);
  
  public Parser(String fileName){
    try {
      BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
      while((line = bufferedReader.readLine()) != null) {
        Matcher m = regex.matcher(line);
        if (m.find()) {
          match=m.group(0).split("(\\s+)");
          int n = Integer.parseInt(match[0]);
          double a = Double.parseDouble(match[1]);
          double b = Double.parseDouble(match[2]);
          points.add(new Point(n,a,b));
        }//End of if
      }//End of while
      bufferedReader.close();         
    }//End of try
    catch(FileNotFoundException e){
      System.out.println("Can't open "+fileName);
      e.printStackTrace();
    }//End of catch FileNotFound
    catch(IOException e) {
      System.out.println("Can't read "+fileName);
      e.printStackTrace();
    }//End of catch IOException
  //for (Point p: points) {System.out.println(p.x+","+p.y);}
  }//End of class
}