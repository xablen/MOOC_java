public class Escargot_3{
  public static void main(String[] args){
    int nombre; 
    int avance = 0;
    int raf = 50;
    int i;
    String c = "";
    String d = "";
    MOOC.useMOOCTerminal();

    //Lignes espaces + escargot
    while(avance < 50){
      nombre = MOOC.auSort(1,6);
      avance = avance + nombre;
      raf = raf - nombre;
      
     //Avancement de l'escargot
      for(i=0; i < nombre; i++){
        c = c + " "; 
      }
      
      //Restant à faire
      for(i=0; i < raf; i++){
        d = d + " "; 
      }
      
      System.out.println(c + "_@_V" + d + "|");
      
      //Mettre en pause
      MOOC.pause(0.3);
      
      //Effacer les lignes d'écran
      for(i=0; i<50; i++){
      System.out.println();
      
      //Réinitialiser d
      
      d = "";
    }
    }
  }
}