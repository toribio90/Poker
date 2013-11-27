
package poker;


class Jugador {
    
    private int ID;
    private Carta mano[];
    private int victorias;    

    public Jugador(int ID, Carta[] mano, int victorias) {
        this.ID = ID;
        this.mano = mano;
        this.victorias = victorias;
    }

    
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Carta[] getMano() {
        return mano;
    }

    public void setMano(Carta[] mano) {
        this.mano = mano;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }
}
