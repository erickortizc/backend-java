package Semana3.practicaMona;

public class Surftocat extends octocat{
    private String original= super.getName();
    private String name="Surftocat";
    @Override
    public String whois() {
        return "Hola soy "+original +" en su version de "+name +" y me gusta surffear";
    }
}
