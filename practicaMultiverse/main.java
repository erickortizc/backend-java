package Semana3.practicaMultiverse;

public class main {
    public static void main(String[] args) {

        Spidey();
        miles();
        gwen();
    }
    public static void Spidey (){
        spideyoriginal spidey = new spideyoriginal(1,"Peter Parker","Spiderman Original");
        System.out.println(spidey.showMessage());
        spidey.telerana();
        spidey.sentidoaracnido();
        spidey.superfuerza();
        spidey.trepamuros();
    }
    public static void miles(){
        MilesMorales miles = new MilesMorales(2,"Miles Morales","Spin");
        System.out.println(miles.showMessage());
        miles.telarana();
        miles.sentidoaracnido();
        miles.invisivilidad();
        miles.superfuerza();
        miles.regeneracion();
        miles.picaveneno();
        miles.explosion();
    }
    public static void gwen(){
        SpiderGwen gwen = new SpiderGwen(3, "Gwen Stacy", "Spider Woman");
        System.out.println(gwen.showMessage());
        gwen.talarana();
        gwen.superfuerza();
        gwen.velocidad();
        gwen.reflejos();
        gwen.sentidoaracnido();
        gwen.trepamuros();
        gwen.relojmulti();
    }
}
