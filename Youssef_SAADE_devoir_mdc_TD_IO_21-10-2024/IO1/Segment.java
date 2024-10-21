import java.io.*;
class Segment implements Serializable { 
  private static final long serialVersionUID = 1L;
  int abscisse_debut, ordonnee_debut, abscisse_fin, ordonnee_fin; 
  
  public Segment(int x1, int y1, int x2, int y2) { 
    abscisse_debut = x1; 
    ordonnee_debut = y1; 
    abscisse_fin = x2; 
    ordonnee_fin = y2; 
  }

  @Override
  public String toString() {
    return "Segment [de (" + abscisse_debut + ", " + ordonnee_debut + ") à (" + abscisse_fin + ", " + ordonnee_fin + ")]";
  }
}
