package Semana3.practicaMultiverse;

public class spiderman {
    private int id;
    private String nombre;
    private String alias;
    private String ciudad ="Nueva York";
    public spiderman (int id, String nombre, String alias ){
        this.id = id;
        this.nombre = nombre;
        this.alias = alias;
    }
    //Getters
    public int getId() {return id;}
    public String getNombre(){return nombre;}
    public String getAlias() {return alias;}
    public String getCiudad() {return ciudad;}
    //Setters
    public boolean setID(int id){
        if(id>0){
            this.id=id;
            return true;
        }else
            return false;
    }
    public boolean setNombre(String nombre) {
        if(!nombre.isEmpty()){
            this.nombre=nombre;
            return true;
        }else
            return false;
    }
    public boolean setAlias(String alias){
        if(!alias.isEmpty()){
            this.alias= alias;
            return true;
        }else
            return false;
    }
    public boolean setCiudad(String ciudad){
        if(!ciudad.isEmpty()){
            this.ciudad=ciudad;
            return true;
        }else
            return false;
    }
    public String showMessage(){
        return "id: "+id+ "\n Hola soy " + nombre +" mejor conocid@ en la ciudad de " + ciudad +" como "+alias+" y algunos de mis poderes son: ";
    }
}
