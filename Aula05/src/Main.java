import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //pegando os inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        Aluno a = new Aluno();
        System.out.println("nome:"+a.getNome());
        System.out.println("M");

        Disciplina disciplina = new Disciplina();
            System.out.println("Digite o nome  da disciplina");
            disciplina.cadastrarAluno(a);
            disciplina.ministrarDisciplina();





    }
}
