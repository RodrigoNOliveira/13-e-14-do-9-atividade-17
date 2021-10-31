import javax.swing.JOptionPane;

class App {
    public static void main(String[] args) {

        String idadeS = JOptionPane.showInputDialog(null, "Digite a sua idade", "Categorias de natação",
                JOptionPane.QUESTION_MESSAGE);
        int idade = Integer.parseInt(idadeS);

        if (idade >= 5 && idade <= 7) {
            JOptionPane.showMessageDialog(null, "Sua categoria é: Infantil A", "Categorias de natação",
                    JOptionPane.QUESTION_MESSAGE);

        } else if (idade > 7 && idade <= 10) {
            JOptionPane.showMessageDialog(null, "Sua categoria é: Infantil B", "Categorias de natação",
                    JOptionPane.QUESTION_MESSAGE);
        }

        else if (idade > 10 && idade <= 13) {
            JOptionPane.showMessageDialog(null, "Sua categoria é: Juvenil A", "Categorias de natação",
                    JOptionPane.QUESTION_MESSAGE);
        } else if (idade > 13 && idade <= 17) {
            JOptionPane.showMessageDialog(null, "Sua categoria é: Juvenil B", "Categorias de natação",
                    JOptionPane.QUESTION_MESSAGE);
        } else if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Sua categoria é: Senior", "Categorias de natação",
                    JOptionPane.QUESTION_MESSAGE);
        }

        else {
            JOptionPane.showMessageDialog(null, "Opção invalida", "Categorias de natação", JOptionPane.ERROR_MESSAGE);
        }

    }
}