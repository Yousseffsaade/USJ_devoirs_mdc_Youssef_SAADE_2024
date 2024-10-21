import java.io.*;
class EcrireFichierTexteAutoFlush { 
  public static void main(String[] argv) throws IOException { 
    int n = 5;
    
    // Utilisation du PrintWriter avec auto-flush activé (2e paramètre à true)
    PrintWriter ecrivain = new PrintWriter(new BufferedWriter(new FileWriter(argv[0])), true); 
    
    ecrivain.println("bonjour, comment cela va-t-il ?");
    ecrivain.println("un peu difficile ?");
    ecrivain.print("On peut mettre des entiers : ");
    ecrivain.println(n);
    ecrivain.print("On peut mettre des instances de Object : ");
    ecrivain.println(new Integer(36));
    
    // Pas besoin d'appeler ecrivain.close() ici grâce à l'auto-flush activé
  }
}
