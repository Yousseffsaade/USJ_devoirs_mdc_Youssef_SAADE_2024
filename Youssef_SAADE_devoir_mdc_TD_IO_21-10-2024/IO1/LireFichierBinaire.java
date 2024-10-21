import java.io.*;

class LireFichierBinaire {
    public static void main(String[] argv) throws IOException {
        DataInputStream lecteur = new DataInputStream(new BufferedInputStream(new FileInputStream(argv[0])));
        
        System.out.println(lecteur.readUTF());
        System.out.println(lecteur.readInt());
        System.out.println(lecteur.readLong());
        System.out.println(lecteur.readFloat());
        System.out.println(lecteur.readDouble());
        System.out.println(lecteur.readChar());
        System.out.println(lecteur.readBoolean());
        System.out.println(lecteur.readUTF());
        
        lecteur.close();
    }
}
