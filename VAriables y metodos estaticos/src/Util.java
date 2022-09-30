public class Util {
    public static final double DOLARES = 6.91;
    public static final double EUROS = 6.73;       //CONSTANTES ESTARICAS
    public static final double ARGENTINOS = 21.33;
     public static double bolivianosApesos (double bolivianos){
         return bolivianos * ARGENTINOS;
     }
     public static double bolivianosAEuros (double bolivianos){
         return bolivianos / EUROS;
     }


}
