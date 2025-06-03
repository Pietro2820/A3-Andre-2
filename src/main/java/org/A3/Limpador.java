public class Limpador {
    public static void limpador() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
