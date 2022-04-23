package Semana3.practicaMultiverse;

public class spideyoriginal extends spiderman implements SpideyActionsCallBacks {

    public spideyoriginal(int id, String nombre, String alias) {
        super(id, nombre, alias);
    }

    @Override
    public void telerana() {
        System.out.println("1. Telaraña");
    }

    @Override
    public void sentidoaracnido() {
        System.out.println("2. Sentido aracnido");
    }

    @Override
    public void superfuerza() {
        System.out.println("3. Super fuerza");
    }

    @Override
    public void trepamuros() {
        System.out.println("4. Trepa Muros");
    }
}
