//import javax.swing.JOptionPane;

public class arraysInt {
    public static void main(String[] args) throws Exception {
        int[] numero = new int[10];

        for (int posicao = 0; posicao < 10; posicao++) {
            numero[posicao] = posicao;
        }
        // JOptionPane.showMessageDialog(null, numero[9]);
        System.out.println("a posicão é : " + numero[9]);
    }
}
