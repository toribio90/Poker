/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poker;

/**
 *
 * @author toribio
 */
class Baraja {
    private Carta num_cartas[] ;
    private Carta[] num_carta;
    
    
    public Baraja(Carta[] num_cartas) {
        
        for( int i = 0 ; i < 48 ; i++ ){
             num_carta[i] = new Carta(i);
        }
          
    }

    
    
    
    public Carta[] getNum_cartas() {
        return num_cartas;
    }

    public void setNum_cartas(Carta[] num_cartas) {
        this.num_cartas = num_cartas;
    }

    
    
    
    
}
