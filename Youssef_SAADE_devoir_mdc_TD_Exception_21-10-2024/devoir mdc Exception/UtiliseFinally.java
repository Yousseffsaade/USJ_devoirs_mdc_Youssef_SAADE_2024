class UtiliseFinally {
  static int moyenne(String[] liste) {
    int somme = 0, entier, nbNotes = 0;

    for (int i = 0; i < liste.length; i++) {
      try {
        entier = Integer.parseInt(liste[i]);
        somme += entier;
        nbNotes++;
      } finally {
        System.out.println("donnée traitée : " + liste[i]);
      }
    }

    return somme / nbNotes;
  }

  public static void main(String[] argv) {
    try {
      System.out.println("La moyenne est " + moyenne(argv));
    } catch (NumberFormatException e) {
      System.out.println("Erreur sur vos entiers");
    }
  }
}
