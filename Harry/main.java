package Semana3.Harry;

public class main {
    public static void main(String[] args) {
        mago harry = new mago(1,"Harry Potter", "Masculino","Gryffindor","Dementores",
                "hecha de acebo","ciervo");
        mago ron = new mago(2,"Ron Weasley","Masculino","Gryffindor","Arañas",
                "Madera de sauce","Jack Russell Terrier");
        mago hermaioni = new mago(3,"hermione granger","Femenino", "Gryffindor", "fracaso"
        , " hecha de vid","Nutria");
        mago draco = new mago(4,"Draco Malfoyr","Masculino", "Slytherin", "Bosque Prohíbido"
                , "madera de espino","???");
        mago severus = new mago(4,"Severus Snape","Masculino", "Slytherin", "Lord Voldemort"
                , "madera de pino negro ","ciervo");

        System.out.println(harry.showMessage());
        System.out.println(ron.showMessage());
        System.out.println(hermaioni.showMessage());
        System.out.println(draco.showMessage());
        System.out.println(severus.showMessage());
    }
}
