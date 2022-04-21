package Semana3.Harry;

public class mago {
    private int id;
    private String nombre;
    private String genero;
    private String casa;
    private String boggart;
    private String varita;
    private String patronus;

    //Constructor con parametros
    public mago(int id, String nombre, String genero, String casa, String boggart, String varita, String patronus) {
        this.id=id;
        this.nombre = nombre;
        this.genero = genero;
        this.casa = casa;
        this.boggart= boggart;
        this.varita = varita;
        this.patronus=patronus;
    }
    //Getters
    public int getId() {return id;}
    public String getNombre() {return nombre;}
    public String getGenero(){return genero;};
    public String getCasa() {return casa;}
    public String getBoggart(){return boggart;}
    public String getVarita(){return varita;}
    public String getPatronus(){return patronus;}

    //Setters
    public boolean setid(int id){
        if(id>0){
            this.id=id;
            return true;
        }else
            return false;
    }

    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre=nombre;
            return true;
        }else
            return false;
    }

    public boolean setGenero(String genero){
        if(!genero.isEmpty()){
            this.genero=genero;
            return true;
        }else
            return false;
    }

    public boolean setCasa(String casa) {
        if(!casa.isEmpty()){
            this.casa=casa;
            return true;
        }else
            return false;
    }
    public boolean setBoggart(String boggart){
        if(!boggart.isEmpty()){
            this.boggart=boggart;
            return true;
        }else
            return false;
    }
    public boolean setVarita(String varita){
        if(!varita.isEmpty()){
            this.varita = varita;
            return true;
        }else
            return false;

    }
    public boolean setPatronus(String patronus){
        if(!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        }else
            return false;

    }
    public String showMessage() {
        return "id; "+id+
                " nombre: "+nombre +
                " genero: "+genero+
                " casa: " + casa+
                " boggart: "+ boggart+
                " varita: " +varita+
                " patronus: "+patronus

                ;
    }
}
