package pl.zhr.hak.realrpg20;

public class Quests {
    private String tytulZadania;
    private String trescZadania;
    public Quests(String tytulZadania, String trescZadania){
        this.tytulZadania = tytulZadania;
        this.trescZadania = trescZadania;
    }

    public String getTrescZadania() { return trescZadania; }

    public void setTrescZadania(String trescZadania) { this.trescZadania = trescZadania; }

    public String getTytulZadania() { return tytulZadania; }

    public void setTytulZadania(String tytulZadania) { this.tytulZadania = tytulZadania; }
}
