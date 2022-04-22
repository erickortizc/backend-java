package Semana3.practicaMona;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        octocat octo= new octocat();
        System.out.println(octo.whois());

        Terracottocat terra = new Terracottocat();
        System.out.println(terra.whois());

        Boxertocat boxer = new Boxertocat();
        System.out.println(boxer.whois());

        Manufacturetocat manu = new Manufacturetocat();
        System.out.println(manu.whois());

        Fintechtocat fin = new Fintechtocat();
        System.out.println(fin.whois());

        Surftocat surf = new Surftocat();
        System.out.println(surf.whois());

        Hulatocat hula = new Hulatocat();
        System.out.println(hula.whois());


    }
}
