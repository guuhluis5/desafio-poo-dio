import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.util.Scanner;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Bootcamp bootcamp = new Bootcamp();
        Mentoria mentoria = new Mentoria();
        boolean programador = false;
        /*Variável booleana criada para caso a pessoa executando o código for programador 
        Ele terá acesso a colocar valores manualmente, sabendo fazer isso
        Caso não for, ele colocará os cursos por um Scanner mesmo
        */
        System.out.println("Você é o programador ou usuário, digite true para programador e false para usuário");
        programador = leitor.nextBoolean();
        System.out.println("O que você está fazendo é um curso apenas ou um bootcamp? 1 para curso e 2 para bootcamp ");
        int opcao = leitor.nextInt();

        if(programador == true)
        {
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/


        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
        }  
        //Caso for usuário ele perguntará se ele estará fazendo um curso ou bootcamp, nesse caso um curso
        else if(opcao == 1 )  
        {
            //E irá pedir o nome do usuário e o nome do curso 
            System.out.println("Digite seu nome para identificação: ");
            String nome = leitor.next();
            System.out.println("Digite o curso que está fazendo: ");
            String novotitulo = leitor.next();
            curso1.setTitulo(novotitulo);
            System.out.println("Digite a descrição deste curso: ");
            String novadescricao = leitor.next();
            curso1.setDescricao(novadescricao);

            System.out.println("Você participará de mentorias(ajuda da comunidade e/ou professores)? false ou true ");
            boolean novamentoria = leitor.nextBoolean();
                if(novamentoria == false )
                {
                    System.out.println("Caso deseje estará sempre disponível !!");
                } 
                else
                {
                    LocalDate dataAtual = mentoria.getData();
                    System.out.println("A data da mentoria desse curso é " + dataAtual);
                }
            System.out.println("Parabéns " + nome + " por ter se matrículado no curso " + curso1.getTitulo() );             

        }

        else if(opcao == 2)
        {
            System.out.println("Digite seu nome para identificação: ");
            String nome = leitor.next();
            System.out.println("Digite o bootcamp que está fazendo: ");
            String novonome = leitor.next();
            bootcamp.setNome(novonome);
            System.out.println("Digite a descrição deste bootcamp: ");
            String novadescricao = leitor.next();
            curso1.setDescricao(novadescricao);

            LocalDate dataInicio = bootcamp.getDataInicial();
            LocalDate dataFim = bootcamp.getDataFinal();

            System.out.println("A data de inicio é " + dataInicio);
            System.out.println("A data de término é " + dataFim + " fique atento!!");

            System.out.println("Você participará de mentorias(ajuda da comunidade e/ou professores)? false ou true ");
            boolean novamentoria = leitor.nextBoolean();
                if(novamentoria == false )
                {
                    System.out.println("Caso deseje estará sempre disponível !!");
                } 
                else
                {
                    LocalDate dataAtual = mentoria.getData();
                    System.out.println("A data da mentoria desse curso é " + dataAtual);
                }
            
            System.out.println("Parabéns " + nome + " por ter se matrículado no curso " + bootcamp.getNome() );
            
            
        } 

    }

}
