package lp;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        ArrayList <Object> lugares = new ArrayList<Object>();


        ArrayList <String> paises;
        paises = new ArrayList();
        paises.add("Brasil");
        paises.add("Suecia");
        paises.add("Alemanha");
        paises.add("Noruega");
        paises.add("Irlanda");


        for (int i = 0; i < 5 ; i++){
            Lugar lugar = new Lugar();
            lugar.setCountry(paises.get(i));
            String pais = lugar.getCountry();
            System.out.println("*** Sobre ***");
            lugar.showMore(pais);
            System.out.println("*** Pontos Turisticos ***");
            lugar.showTouristSpot(pais);
            System.out.println("*** Banda de Metal ***");
            lugar.showMetalBand(pais);

            System.out.println("Avalie com estrelinhas o pais que conheceu: ");
            int avaliacao = reader.nextInt();
            lugar.setStars(avaliacao);
            int estrelas = lugar.getStars();
            System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
            System.out.println("|| Voce deu "+ estrelas + " estrelas para o " + pais + "||");
            System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");

            lugares.add(lugar);

        }
        ArrayList <Object> pessoas = new ArrayList<Object>();

        for (int i = 0; i < 5 ; i++){
            java.lang.String nome;
            System.out.println("Qual é o seu nome ?");
            nome = reader.next();
            System.out.println("Qual é sua idade ? ");
            int idade = reader.nextInt();
            Pessoa pessoa = new Pessoa(nome, idade);

            System.out.println("Qual é sua altura?");
            double altura = Double.parseDouble(reader.next());
            pessoa.setAltura(altura);

            System.out.println("Qual é sua peso?");
            double peso = Double.parseDouble(reader.next());
            pessoa.setPeso(peso);

            double imc = pessoa.calculaImc();

            System.out.println("Seu imc é: " + imc);

            System.out.println("Qual é a distancia que você percorre em um passo");
            double distancia = Double.parseDouble(reader.next());
            pessoa.setDistancia_passo(distancia);

            System.out.println("Quantos passos você percorreu ?");
            int passos = reader.nextInt();

            System.out.println("vc andou "+ pessoa.andar(passos) + "metros");

            pessoa.dormir();

            pessoas.add(pessoa);

        }

        ArrayList <Object> alunos = new ArrayList<Object>();
        for (int i = 0; i < 5 ; i++){
            java.lang.String nome;
            System.out.println("Qual é o seu nome ?");
            nome = reader.next();
            System.out.println("Qual é seu curso ? ");
            String curso = reader.next();
            AlunoFatec aluno = new AlunoFatec(nome, curso);

            aluno.puxarMateria("CalculoII");

            System.out.println("Subindo para o andar: ");
            aluno.subirAndar();

            System.out.println("Descendo as escada: ");
            aluno.descerAndar();
            alunos.add(aluno);
        }

        ArrayList <Object> instrumento = new ArrayList<Object>();
        for (int i = 0; i < 5 ; i++){
            java.lang.String nome;
            System.out.println("Qual é seu instrumeto ?");
            nome = reader.next();


            InstrumentoMusical intrumento = new InstrumentoMusical(nome);
            System.out.println("Tocando");
            intrumento.tocar();
            instrumento.add(intrumento);
        }

        ArrayList <Object> profissoes = new ArrayList<Object>();

        for (int i = 0; i < 5 ; i++){
            System.out.println("Qual é seu nome?");
            String nome = reader.next();
            Profissao profissional = new Profissao(nome);
            System.out.println("Valor do aumento?");
            double valor = Double.parseDouble(reader.next());
            profissional.aumentaSalario(valor);
            System.out.println("Adição de horas");
            int horas = reader.nextInt();
            profissional.aumentaCargaHoraria(horas);
            profissional.mudaFuncao("Gestor de Pessoas");
            profissoes.add(profissional);
        }

        ArrayList <Object> calcados = new ArrayList<Object>();

        for (int i = 0; i < 5 ; i++){
            System.out.println("Qual é seu nome?");
            String nome = reader.next();
            Profissao profissional = new Profissao(nome);

        }

    }
}
