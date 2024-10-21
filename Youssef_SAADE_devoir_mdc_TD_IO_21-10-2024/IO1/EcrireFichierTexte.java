import java.io.*;

class EcrireFichierTexte {
    public static void main(String[] argv) throws IOException {
        // Vérification que l'argument (nom du fichier) est bien fourni
        if (argv.length < 1) {
            System.out.println("Veuillez fournir le nom du fichier texte en argument.");
            return;
        }

        // Ouverture du fichier texte en écriture
        PrintWriter ecrivain;
        int n = 5;
        ecrivain = new PrintWriter(new BufferedWriter(new FileWriter(argv[0])));
        
        // Écriture de différentes données dans le fichier texte
        ecrivain.println("bonjour, comment cela va-t-il ?");
        ecrivain.println("un peu difficile ?");
        ecrivain.print("On peut mettre des entiers : ");
        ecrivain.println(n);
        ecrivain.print("On peut mettre des instances de Object : ");
        ecrivain.println(new Integer(36));
	ecrivain.close();
        
        
    }
}
