import java.io.*;
class SerialiserSegment { 
  public static void main(String[] argv) throws IOException { 
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Segments.ser")); 
    Segment s1 = new Segment(0, 0, 3, 4); 
    Segment s2 = new Segment(5, 1, 7, 8); 
    oos.writeObject(s1); 
    oos.writeObject(s2); 
    oos.close(); 
  }
}
