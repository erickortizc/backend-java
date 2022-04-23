package Semana3.practicaMultiverse;

public class SpiderGwen extends spiderman implements SpiderGwenActionsCallBacks {

    public SpiderGwen(int id, String nombre, String alias) {
        super(id, nombre, alias);
    }

    @Override
    public void talarana() {
        System.out.println("1. Telaraña Organica");
    }

    @Override
    public void superfuerza() {
        System.out.println("2. SuperFuerza");
    }

    @Override
    public void velocidad() {
        System.out.println("3. Sout Super velocidad");
    }

    @Override
    public void reflejos() {
        System.out.println("4. Reflejos Sobrehumanos");
    }

    @Override
    public void sentidoaracnido() {
        System.out.println("5. Sentido Aracnido");
    }

    @Override
    public void trepamuros() {
        System.out.println("6. Trepa Muros");
    }

    @Override
    public void relojmulti() {
        System.out.println("7. Reloj Multiversal");
    }
}
