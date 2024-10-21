class ExceptionThrow {
  static int moyenne(String[] liste) throws ExceptionRien {
    int somme = 0, entier, nbNotes = 0;

    for (int i = 0; i < liste.length; i++) {
      try {
        entier = Integer.parseInt(liste[i]);
        somme += entier;
        nbNotes++;
      } catch (NumberFormatException e) {
        System.out.println("La " + (i + 1) + "ème note n'est pas entière");
      }
    }

    if (nbNotes == 0) throw new ExceptionRien();
    return somme / nbNotes;
  }

  public static void main(String[] argv) {
    try {
      System.out.println("La moyenne est " + moyenne(argv));
    } catch (ExceptionRien e) {
      System.out.println(e);
    }
  }
}
