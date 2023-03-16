package ProvaSCI;

import javax.swing.JOptionPane;

/**
 *
 * @author Marlon Milliorini
 */
public class Java3 {

    public static void main(String[] args) {

        String aluno, resp;
        float soma = 0, nota = 0, media = 0;
        boolean loop = true;

        while (loop == true) {

            aluno = JOptionPane.showInputDialog("Informe o nome do aluno!");

            float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a primeira nota de " + aluno));
            float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda nota de " + aluno));
            float nota3 = Float.parseFloat(JOptionPane.showInputDialog("Informe a terceira nota de " + aluno));
            float nota4 = Float.parseFloat(JOptionPane.showInputDialog("Informe a quarta nota de " + aluno));

            soma = nota1 + nota2 + nota3 + nota4;

            media = (nota1 + nota2 + nota3 + nota4) / 4;

            if (media >= 6) {
                JOptionPane.showMessageDialog(null, " Aluno " + aluno + " aprovado!" + " Média: " + media);
            } else if (media < 6) {
                JOptionPane.showMessageDialog(null, "Aluno " + aluno + " com nota abaixo de 6!" + " com média " + media);
            }

            resp = JOptionPane.showInputDialog("Deseja continuar S ou N?");
            if ("S".equals(resp)) {
                loop = true;
            }else{
                loop = false;
                break;
            }
        }
    }
}

