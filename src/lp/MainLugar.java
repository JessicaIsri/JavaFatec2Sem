package lp;
import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainLugar {
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

    }
}
