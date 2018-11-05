package extra6;

public class Alumnos {

    private String nome;
    private int nota1 = 0;
    private int nota2 = 0;
    private int nota3 = 0;
    private String curso = "PRIMERO";
    private int faltas = 0;
    private int numAlumnos = 0;

    public Alumnos(String nome, int nota1, int nota2, int nota3, int curso, int faltas) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        switch (curso) {
            case 1:
                this.curso = "PRIMERO";
                break;
            case 2:
                this.curso = "SEGUNDO";
                break;
            case 3:
                this.curso = "TERCEIRO";
                break;
            case 4:
                this.curso = "CUARTO";
                break;
            case 5:
                this.curso = "QUINTO";
                break;
            default:
                System.out.println("No existe ese curso");

        }
        this.faltas = faltas;
        numAlumnos++;
    }

    public float media() {
        float media = ((nota1 + nota2 + nota3) / 3);
        return media;
    }

    public int cualificacion() {
        int nota = (int) media();
        if (faltas < 5) {
            nota++;
        } else if ((faltas >= 5) && (faltas < 10)) {

        } else if ((faltas >= 10) && (faltas < 15)) {
            nota--;
        } else if ((faltas >= 15) && (faltas < 20)) {
            nota = nota - 2;
        } else if (faltas >= 20) {
            nota = nota - 3;
        }
        return nota;
    }

    public void mostrarAlumno() {
        System.out.println("CÁLCULO CUALIFICACIÓN FINAL");
        System.out.println("NOME:                " + nome);
        System.out.println("CURSO:               " + curso);

        System.out.println("NOTA 1:              " + nota1);
        System.out.println("NOTA 2:              " + nota2);
        System.out.println("NOTA 3:              " + nota3);

        System.out.println("NOTA MEDIA:          " + media());
        System.out.println("FALTAS:              " + this.faltas);
        System.out.println("CUALIFICACION FINAL: " + cualificacion());
 
    }

}
