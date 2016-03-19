package TSP;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import TSP.Point.*;

public class Parser{
  //Init
  String line = null; //For readLine()
  ArrayList<Point> points = new ArrayList<Point>();
  String pattern = "(\\d+)( )(\\d+)( )(\\d+)";
  String[] match;
  Pattern regex = Pattern.compile(pattern);
  
  public Parser(String fileName){
    try {
      //FileReader fileReader = new FileReader(fileName);
      BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
      while((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
        Matcher m = regex.matcher(line);
        if (m.find()) {
          match=m.group(0).split("( )");
          points.add(new Point(Integer.parseInt(match[0]),
                               Double.parseDouble(match[1]),
                               Double.parseDouble(match[2])
                    ));
        }
      }
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
  }
}