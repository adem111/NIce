class Basket {
    int anzahlProdukte;
    String Kunde;
    Product[] Produkte= new Product[anzahlProdukte];
    public Basket(String Kunde){
        anzahlProdukte=0;        
        this.Kunde=Kunde;
    }
    public void addProduct(Product pProduct){
        Product b[] = new Product[anzahlProdukte+1];
        for(int i=0 ; i < anzahlProdukte; i++){
            b[i]=Produkte[i];
        }
        b[anzahlProdukte]=pProduct;
        Produkte=b;
        anzahlProdukte++;
    }
    public void print(){
        if(anzahlProdukte==0){
            System.out.println(Kunde+": Keine Produkte vorhanden!");
        }else{
            System.out.println(Kunde+":");
            for(int i=0;i<anzahlProdukte;i++){
                System.out.println(Produkte[i]);
            }
        }
    }
}