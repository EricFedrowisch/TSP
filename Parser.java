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
        //System.out.println(line);
        Matcher m = regex.matcher(line);
        if (m.find()) {
          match=m.group(0).split("( )");
          this.points.add(new Point(Integer.parseInt(match[0]),
                                    Double.parseDouble(match[1]),
                                    Double.parseDouble(match[2])
                    ));
          //for (String s : match){System.out.println(s);}
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
  
  public void print(){
    for (Point a: this.points){System.out.println(a.x+","+a.y);}
  }
  
  public static void main(String args[]){
    Parser p = new Parser(args[0]);
    p.print();
  }
}