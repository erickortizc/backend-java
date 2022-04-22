package Semana3.practicaMona;

public class Fintechtocat extends octocat{
    private String original= super.getName();
    private String name="Fintechtocat";
    @Override
    public String whois() {
        return "Hola soy "+original +" en su version de "+name +" y me gusta la tecnologia";
    }
}
