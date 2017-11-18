public class Preis{
    int Cent;
    int Euro;
    int aeingabeCent;
    int neu;
    int preis;
    public Preis(int eingabeCent){   
        aeingabeCent=eingabeCent;
        int aCent=eingabeCent%100;
        int aEuro=(eingabeCent-aCent)/100;
        if(aCent<0){
            aCent=-aCent;
        }
        Cent=aCent;
        Euro=aEuro;
        preis=eingabeCent;
    }
    public void print(){        
        if(aeingabeCent>=0){
            System.out.println(Euro+ " Euro "+Cent+" Cent");            
        }else if(aeingabeCent<0){
            System.out.println("-"+Euro+ " Euro "+Cent+" Cent"); 
        }
    }    
    public int getCent(){ 
        return preis;
    }
    public void add(Preis neuesProdukt){
        Preis preis = new Preis(neuesProdukt.preis + this.preis);
        this.Cent=preis.Cent;
        this.Euro=preis.Euro;
        this.preis=preis.preis;
    }
}