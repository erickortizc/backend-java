package Semana3.practicaMona;

public class Hulatocat extends octocat{
    private String original= super.getName();
    private String name="Hulatocat";
    @Override
    public String whois() {
        return "Hola soy "+original +" en su version de "+name +" y me gusta tocar el ukelele";
    }
}
