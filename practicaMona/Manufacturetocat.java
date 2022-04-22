package Semana3.practicaMona;

public class Manufacturetocat extends octocat {
    private String original= super.getName();
    private String name="Manufacturetocat";
    @Override
    public String whois() {
        return "Hola soy "+original +" en su version de "+name +" y me gusta crear nuevos objetos";
    }
}
