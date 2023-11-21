public class task2 {  public static void main(String[] args) {
    String[][] chess = new String[8][8];
    for (int i = 0; i < chess.length; i++) {
        for (int j = 0; j < chess[0].length; j++) {
            if ((i + j) % 2 == 0) {
                System.out.print("B"+" ");
            } else {
                System.out.print("W"+" ");
            }
        }
        System.out.println();
    }

}
}

