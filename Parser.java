package TSP;

import java.io.*;

import TSP.Point.*;

public class Parser{
  public Parser(String fileName){
    Point[] points;
    String line = null;
    try {
      //FileReader fileReader = new FileReader(fileName);
      BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
      while((line = bufferedReader.readLine()) != null) {
        System.out.println(line);}
      bufferedReader.close();         
    }//End of try
    catch(FileNotFoundException e){
      System.out.println("Can't open "+fileName);
      e.printStackTrace();
    }
    catch(IOException e) {
      System.out.println("Can't read "+fileName);
      e.printStackTrace();
    }
  }
}