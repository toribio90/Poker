

package poker;


class Carta {
       public int palo;
       public int numero;
       public int peso;

    public Carta(int palo, int numero, int peso) {
        this.palo = palo;
        this.numero = numero;
        this.peso = peso;
    }

    Carta(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

              
       
    public int getPalo() {
        return palo;
    }

    public void setPalo(int palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
       
    public void jugar(){
        
    }
       
}
