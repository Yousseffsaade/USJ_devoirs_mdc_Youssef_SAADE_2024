import java.io.*;
class DeserialiserSegment { 
  public static void main(String[] argv) throws IOException, ClassNotFoundException { 
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Segments.ser")); 
    Segment s1 = (Segment) ois.readObject(); 
    Segment s2 = (Segment) ois.readObject(); 
    System.out.println(s1); 
    System.out.println(s2); 
    ois.close(); 
  }
}
