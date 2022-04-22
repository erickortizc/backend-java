package Semana3.practicaMona;

public class Boxertocat extends octocat{
    private String original= super.getName();
    private String name="boxertocat";
    @Override
    public String whois() {
        return "Hola soy "+original +" en su version de "+name +" y me gusta boxear";
    }
}
