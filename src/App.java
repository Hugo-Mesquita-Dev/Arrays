//import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // armazenar varios valores do mesmo tipo
        // tipo[] nomeVariavel = new tipo[];

        String[] Nomes = new String[5];
        // 0,1,2,3,4
        // [] -> define as posicoes das informacoes
        Nomes[0] = "maria";
        Nomes[1] = "mario";
        Nomes[2] = "ze";
        Nomes[3] = "luis";
        Nomes[4] = "kaka";

        /*
         * imprimir o valor da posicao [2] e [4]
         * 
         * System.out.println(Nomes[4]);
         * System.out.println(Nomes[2]);
         */

        // imprimir os valoresdo array atraves do for
        for (int valorVetor = 0; valorVetor < 5; valorVetor++) {
            System.out.println(Nomes[valorVetor]);
            // JOptionPane.showMessageDialog(null, Nomes[valorVetor]);
        }
    }
}
