

package poker;


class Poker {

    private int ronda;
    private boolean fase;
    private Jugador turno;
    private Baraja baraja;
    private Jugador jugador[];

    public Poker(int ronda, boolean fase, Jugador turno, Baraja baraja, Jugador[] jugador) {
        this.ronda = ronda;
        this.fase = fase;
        this.turno = turno;
        this.baraja = baraja;
        this.jugador = jugador;
    }

    
    
    
    public int getRonda() {
        return ronda;
    }

    public void setRonda(int ronda) {
        this.ronda = ronda;
    }

    public boolean isFase() {
        return fase;
    }

    public void setFase(boolean fase) {
        this.fase = fase;
    }

    public Jugador getTurno() {
        return turno;
    }

    public void setTurno(Jugador turno) {
        this.turno = turno;
    }

    public Baraja getBaraja() {
        return baraja;
    }

    public void setBaraja(Baraja baraja) {
        this.baraja = baraja;
    }

    public Jugador[] getJugador() {
        return jugador;
    }

    public void setJugador(Jugador[] jugador) {
        this.jugador = jugador;
    }
    
    
    
    
    
    
    
    
}
