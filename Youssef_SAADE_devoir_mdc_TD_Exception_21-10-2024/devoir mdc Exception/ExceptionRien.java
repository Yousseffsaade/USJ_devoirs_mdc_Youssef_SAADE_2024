class ExceptionRien extends Exception {
  ExceptionRien() {
    System.out.println("Une ExceptionRien s'est produite");
  }

  public String toString() {
    return "Aucune note n'est valide";
  }
}

