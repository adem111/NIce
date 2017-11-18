/**
 * Realisiert ein Produkt eines Onlineshops.
 * TODO: Ergänzen
 * 
 * @author Karsten Hölscher TODO: ergänzen
 * @version 2017-11-02 TODO
 */
public class Product{

    /**
     * Die Bezeichnung dieses Produktes.
     */
    private final String name;

    /**
     * Der Preis dieses Produktes.
     */
    private final Preis preis;

    /**
     * Erzeugt ein neues Produkt mit dem gegebenen Namen und dem
     * gegebenen Preis in Cent. 
     * 
     * Sollte der gegebene Name den Wert {@code null}
     * haben oder leer sein, so wird der Name des erzeugten Produktes 
     * auf {@code unbekannt} gesetzt. 
     * 
     * Sollte der gegebene Preis kleiner als 10 sein, so wird der Preis
     * des erzeugten Produktes auf 10 Cent gesetzt.
     * 
     * @param pName Der Name für das zu erzeugende Produkt.
     * @param pPrice Der Preis für das zu erzeugende Produkt in Cent.
     */
    public Product(final String pName, int pPrice) {
        if (pName == null) {
            name = "unbekannt";
        } else if (pName.isEmpty()) {
            name = "unbekannt";
        } else {
            name = pName;
        }
        if(pPrice<=10){
            pPrice=10;
        }
        preis = new Preis(pPrice);
    }
    /**
     * Gibt den Namen dieses Produktes zurück.
     * 
     * @return Den Namen dieses Produktes.
     */
    public String getName() {
        return name;
    }
    @Override
    public String toString(){        
        return name + " ["+preis.getCent()+"] ";
    }
    /**
     * Gibt den Preis dieses Produktes zurück.
     * 
     * @return Den Preis dieses Produktes.
     */
    public Preis getPrice() {
        return preis;
    }
    /**
     * Gibt die Informationen zu diesem Produkt auf der Konsole aus.
     * Dabei wird zunächst der Name und dann der Preis gefolgt von
     * einer Zeilenschaltung ausgegeben.
     */
    public void print() {
        System.out.println(name+"\n"+preis.preis);
    }
}
