package Entidade;

import entidades.Aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleNotas implements ControlesBasicos{
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Professor> professores = new ArrayList<>();
    private  ArrayList<Materia> materias = new ArrayList<>();
    private ArrayList<Alunos> alunos = new ArrayList<>();

    private String mostrarMenu () {
        StringBuilder sb = new StringBuilder();
        sb.append("Digite o comando desejado: \n");
        sb.append("0- Sair \n");
        sb.append("1- Ver Alunos \n");
        sb.append("2- Ver Materias \n");
        sb.append("3- Adicionar Aluno \n");
        sb.append("4- Adicionar Nota \n");
        sb.append("5- Excluir Nota \n");
        sb.append("6- Consultar Notas \n");

        System.out.println(sb.toString());
        return scanner.nextLine();
    }

    public void iniciar () {
        inicializarProfessorMateria();
        String opcao = mostrarMenu();

        while (!opcao.equals("0")) {
            switch (opcao) {
                case "1":
                    System.out.println(alunos);
                    opcao = mostrarMenu();
                    break;

                case "2":
                    System.out.println(materias);
                    opcao = mostrarMenu();
                    break;

                case "3":
                    System.out.println("Digite o nome do Alumo: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a matricula do aluno");
                    Integer matricula = Integer.parseInt(scanner.nextLine());
                    Alunos aluno = new Alunos(nome, matricula);
                    alunos.add(aluno);
                    System.out.println(alunos);
                    opcao = mostrarMenu();
                    break;

                case "4":
                    inserir();
                    opcao = mostrarMenu();
                    break;

                case "5":
                    excluir();
                    opcao = mostrarMenu();
                    break;

                case "6":
                    consultar();
                    opcao = mostrarMenu();
                    break;

                default:
                    System.out.println("opção invalida, digite o numero correspondente a opçoa do menu");
                    opcao = mostrarMenu();
                    break;

            }
        }
    }

    public void inserir(){
        System.out.println("Digite o indice do aluno: ");
        Integer indiceAluno = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o indice da materia: ");
        Integer indiceMateria = Integer.parseInt(scanner.nextLine());
        System.out.println("digite a sua nota: ");
        double Valornota = Double.parseDouble(scanner.nextLine());

        Notas nota = new Notas();
        nota.setNota(Valornota);
        nota.setMateria(materias.get(indiceMateria));
        alunos.get(indiceAluno).getNotas().add(nota);
        System.out.println(alunos.get(indiceAluno).getNotas());

    }
    public void excluir() {
        System.out.println("Digite o indice do Aluno: ");
        Integer indiceAluno = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o indice da nota: ");
        int indiceNota = Integer.parseInt(scanner.nextLine());

        alunos.get(indiceAluno).getNotas().remove(indiceNota);
    }
    public void consultar(){
        System.out.println(alunos);
        System.out.println("digite o indice do Aluno: ");
        Integer indiceNotas = Integer.parseInt(scanner.nextLine());
        System.out.println(alunos.get(indiceNotas).getNotas());
    }


    public void inicializarProfessorMateria(){

        Professor professor1 = new Professor ("Beatriz Melo", 01/01/2020);

        Materia materia1 = new Materia();
        materia1.setNome("Português");
        materia1.setProfessor(professor1);

        Professor professor2 = new Professor ("Jorge Silva", 02/06/2020);

        Materia materia2 = new Materia();
        materia2.setNome("Matemática");
        materia2.setProfessor(professor2);

        Professor professor3 = new Professor ("Marisa Santos",01/12/2019);

        Materia materia3 = new Materia();
        materia3.setNome("Geografia");
        materia3.setProfessor(professor3);

        Professor professor4 = new Professor ("Everaldo Moises",04/06/2019);

        Materia materia4 = new Materia();
        materia4.setNome("Historia");
        materia4.setProfessor(professor4);

        materias.add(materia1);
        materias.add(materia2);
        materias.add(materia3);
        materias.add(materia4);



    }
}
