public class Produkt {

    private int id;
    private String produkte_name;
    private double preis;
    private String beschreibung;

    public Produkt(int id) {
        this.id = id;
    }

    public Produkt(String produkte_name, double preis, String beschreibung) {
        this.produkte_name = produkte_name;
        this.preis = preis;
        this.beschreibung = beschreibung;
    }

    public Produkt(int id, String produkte_name, double preis, String beschreibung) {
        this.id = id;
        this.produkte_name = produkte_name;
        this.preis = preis;
        this.beschreibung = beschreibung;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProdukte_name() {
        return produkte_name;
    }

    public void setProdukte_name(String produkte_name) {
        this.produkte_name = produkte_name;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }
}
