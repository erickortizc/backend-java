package Semana3.practicaMona;

public class Terracottocat extends octocat{
    private String original= super.getName();
    private String name="Terracottocat";
    @Override
    public String whois() {
        return "Hola soy "+original +" en su version de "+name +" y me gusta combatir por la tierra";
    }
}
