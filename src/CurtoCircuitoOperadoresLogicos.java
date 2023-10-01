public class CurtoCircuitoOperadoresLogicos {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        boolean resultudo = x == 15 && y++ == 20;
        boolean resultudo1 = x == 15 || y++ == 20;

        System.out.println(resultudo);
        System.out.println(y);

        System.out.println(resultudo1);
        System.out.println(y);


    }
}

