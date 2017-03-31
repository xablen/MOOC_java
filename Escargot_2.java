public class Escargot_2{
  public static void main(String[] args){
    int nombre; 
    int avance = 0;
    int i;
    String c = "";
    MOOC.useMOOCTerminal();
    while(avance < 50){
      nombre = MOOC.auSort(1,6);
      avance = avance + nombre;
      for(i=0; i < nombre; i++)
      {
        c = c + " "; 
      }
      System.out.println(c + "_@_V");
    }
  }
}