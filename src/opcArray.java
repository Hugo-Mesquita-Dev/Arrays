import javax.swing.JOptionPane;

public class opcArray {
    public static void main(String[] args) throws Exception {
        String[] opcoes = new String[] {
                "MARACUJA",
                "LARANJA",
                "UVA",
                "SAIR"
        };
        int opcaoEscolhida = 0;

        while (opcaoEscolhida != 3) {
            opcaoEscolhida = JOptionPane.showOptionDialog(
                    null,
                    "Voce deseja qual fruta? ",
                    "Cardapio de Frutas",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    0);

            if (opcaoEscolhida != 3) {
                String mensagem = "voce escolheu a \n " + opcoes[opcaoEscolhida];
                JOptionPane.showMessageDialog(null, mensagem);
            } else {
                String Mensagem = " Obrigado pela visita! \n " + opcoes[opcaoEscolhida];
                JOptionPane.showMessageDialog(null, Mensagem);
            }
        }

    }
}
