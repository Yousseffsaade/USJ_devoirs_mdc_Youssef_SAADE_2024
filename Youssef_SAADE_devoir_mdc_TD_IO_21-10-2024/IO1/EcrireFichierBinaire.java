import java.io.*;
class EcrireFichierBinaire {
  public static void main(String[] argv) throws IOException {
    DataOutputStream ecrivain = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(argv[0])));
    ecrivain.writeUTF("bonjour");
    ecrivain.writeInt(3);
    ecrivain.writeLong(100000);
    ecrivain.writeFloat((float)2.0);
    ecrivain.writeDouble(3.5);
    ecrivain.writeChar('a');
    ecrivain.writeBoolean(false);
    ecrivain.writeUTF("au revoir");
    System.out.println(ecrivain.size());
    ecrivain.close();
  }
}
