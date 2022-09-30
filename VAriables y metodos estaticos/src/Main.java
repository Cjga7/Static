public class Main {
    public static void main(String[] args) {
        System.out.println(Util.DOLARES);
        double pesos;
        pesos= Util.bolivianosApesos(1000);
        System.out.println(pesos);
        pesos= Util.bolivianosAEuros(1000);
        System.out.println(pesos);
    }
}