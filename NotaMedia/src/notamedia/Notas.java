package notamedia;

import javax.swing.JOptionPane;

public class Notas {

    public float pedirNota() {
        float nota = 0;
        do {
            nota = Float.parseFloat(JOptionPane.showInputDialog("Introducir nota: "));
            if ((nota < 1) || (nota > 10)) {
                JOptionPane.showMessageDialog(null, "Nota no valida");
            }
        } while ((nota < 1) || (nota > 10));

        return nota;

    }

    public int Evaluacion() {
        JOptionPane.showMessageDialog(null, "Indique a nota da 1 proba teórica: ");
        float nota11 = pedirNota() * 0.2f;
        JOptionPane.showMessageDialog(null, nota11);

        JOptionPane.showMessageDialog(null, "Indique a nota da 2 proba teórica: ");
        float nota12 = pedirNota() * 0.2f;
        JOptionPane.showMessageDialog(null, nota12);

        JOptionPane.showMessageDialog(null, "Indique a nota da proba práctica: ");
        float nota2 = pedirNota() * 0.4f;
        JOptionPane.showMessageDialog(null, nota2);

        JOptionPane.showMessageDialog(null, "Indique a nota dos boletins: ");
        float nota3 = pedirNota();

        if (nota3 >= (9)) {
            nota3 = 2;

        } else if (nota3 >= 7) {
            nota3 = 1;
        } else {
            nota3 = 0;
        }

        int nota = 0;

        float aux = nota11 + nota12 + nota2 + nota3;

        if ((aux - (int) aux) >= 0.5f) {
            nota = (int) ++aux;
        } else {
            nota = (int) aux;
        }

        return nota;
    }

}
