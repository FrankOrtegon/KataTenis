
public class TennisGame3 implements TennisGame {
    
    private int jugador2;
    private int jugador1;
    private String nombreJugado1;
    private String nombreJugador2;

    public TennisGame3(String nombreJugador1, String nombreJugador2) {
        this.nombreJugado1 = nombreJugador1;
        this.nombreJugador2 = nombreJugador2;
    }

    public String getPuntaje() {
        String s;
        if (jugador1 < 4 && jugador2 < 4 && !(jugador1 + jugador2 == 6)) {
            return getPunto();
        } else {
            return getVentaja();
        }
    }

    private String getPunto() {
        String s;
        String[] p = new String[]{"Amor", "Quince", "Treinta", "Cuarenta"};
        s = p[jugador1];
        return (jugador1 == jugador2) ? s + "-Todos" : s + "-" + p[jugador2];
    }

    private String getVentaja() {
        String s;
        if (jugador1 == jugador2)
            return "Deuce";
        return getGanador();
    }

    private String getGanador() {
        String s;
        s = jugador1 > jugador2 ? nombreJugado1 : nombreJugador2;
        return ((jugador1 - jugador2)*(jugador1 - jugador2) == 1) ? "Ventaja " + s : "Gana " + s;
    }

    public void ganoPunto(String nombreJugador) {
        if (nombreJugador == "jugador1")
            this.jugador1 += 1;
        else
            this.jugador2 += 1;
        
    }

}


