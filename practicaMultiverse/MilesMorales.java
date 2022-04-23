package Semana3.practicaMultiverse;

public class MilesMorales extends spiderman implements MilesActionsCallBacks{

    public MilesMorales(int id, String nombre, String alias) {
        super(id, nombre, alias);
    }

    @Override
    public void telarana() {
        System.out.println("1. Telaraña");
    }

    @Override
    public void sentidoaracnido() {
        System.out.println("2. Sentido Aracnido");
    }

    @Override
    public void invisivilidad() {
        System.out.println("3. Invisibilidad");
    }

    @Override
    public void superfuerza() {
        System.out.println("4. Super Fuerza");
    }

    @Override
    public void regeneracion() {
        System.out.println("5. Regeneracion");
    }

    @Override
    public void picaveneno() {
        System.out.println("6. Picadura Veneno");
    }

    @Override
    public void explosion() {
        System.out.println("7. Explosión de energía");
    }
}
