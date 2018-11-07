package notamedia;

import javax.swing.JOptionPane;

public class NotaMedia {

    public static void main(String[] args) {
        Notas nota = new Notas();
        int i = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique o numero de alumnos: "));

        int[] alumnos = new int[i];

        int curso, aux;
        System.out.println("NOTAS ALUMNOS");

        for (int a = 0; a < alumnos.length; a++) {

            JOptionPane.showMessageDialog(null, (a+1)+"º ALUMNO");
            JOptionPane.showMessageDialog(null, "1º EVALUACION");

            curso = nota.Evaluacion();
            JOptionPane.showMessageDialog(null, "A Nota da primeira evaluacion é: " + curso);

            JOptionPane.showMessageDialog(null, "2º EVALUACION");
            aux = nota.Evaluacion();
            curso = curso + aux;
            JOptionPane.showMessageDialog(null, "A Nota da segunda evaluacion é: " + aux);

            JOptionPane.showMessageDialog(null, "3º EVALUACION");
            aux = nota.Evaluacion();
            curso = curso + aux;
            JOptionPane.showMessageDialog(null, "A Nota da terceira evaluacion é: " + aux);

            curso = curso / 3;
            JOptionPane.showMessageDialog(null, "A Nota do curso é: " + curso);

            alumnos[a] = curso;

            System.out.println(alumnos[a]);

        }

    }

}
