import java.util.Hashtable;

public class TennisGame2 implements TennisGame
{
    public int puntajeJugador1 = 0;
    public int puntajeJugador2 = 0;
    
    public String P1res = "";
    public String P2res = "";
    private String nombreJugador1;
    private String nombreJugador2;

    public TennisGame2(String nombreJugador1, String nombreJugador2) {
        this.nombreJugador1 = nombreJugador1;
        this.nombreJugador2 = nombreJugador2;
    }

    public String getPuntaje(){
        String score = "";
        score = getPuntajeJugador1(score);
        score = getDeuce(score);
        score = getVentaja(score);
        score = getPuntosJugador2(score);
        score = getpuntosJugador1(score);
        score = getPuntajeJugador2(score);
        score = getVentajaJugador1(score);
        score = getVentajaJugador2(score);
        score = getGanaJugador1(score);
        score = getGanaJugador2(score);
        return score;
    }

    private String getDeuce(String score) {
        if (puntajeJugador1 == puntajeJugador2 && puntajeJugador1 >=3)
            score = "Deuce";
        return score;
    }

    private String getGanaJugador2(String score) {
        if (puntajeJugador2 >=4 && puntajeJugador1 >=0 && (puntajeJugador2 - puntajeJugador1)>=2)
        {
            score = "Gana jugador2";
        }
        return score;
    }

    private String getGanaJugador1(String score) {
        if (puntajeJugador1 >=4 && puntajeJugador2 >=0 && (puntajeJugador1 - puntajeJugador2)>=2)
        {
            score = "Gana jugador1";
        }
        return score;
    }

    private String getVentajaJugador2(String score) {
        if (puntajeJugador2 > puntajeJugador1 && puntajeJugador1 >= 3)
        {
            score = "Ventaja jugador2";
        }
        return score;
    }

    private String getVentajaJugador1(String score) {
        if (puntajeJugador1 > puntajeJugador2 && puntajeJugador2 >= 3)
        {
            score = "Ventaja jugador1";
        }
        return score;
    }

    private String getPuntajeJugador2(String score) {
        if (puntajeJugador2 > puntajeJugador1 && puntajeJugador2 < 4)
        {

            if (puntajeJugador2 ==2)
                P2res="Treinta";
            if (puntajeJugador2 ==3)
                P2res="Cuarenta";
            if (puntajeJugador1 ==1)
                P1res="Quince";
            if (puntajeJugador1 ==2)
                P1res="Treinta";
            score = P1res + "-" + P2res;
        }
        return score;
    }

    private String getpuntosJugador1(String score) {
        if (puntajeJugador1 > puntajeJugador2 && puntajeJugador1 < 4)
        {
            if (puntajeJugador1 ==2)
                P1res="Treinta";
            if (puntajeJugador1 ==3)
                P1res="Cuarenta";
            if (puntajeJugador2 ==1)
                P2res="Quince";
            if (puntajeJugador2 ==2)
                P2res="Treinta";
            score = P1res + "-" + P2res;
        }
        return score;
    }

    private String getPuntosJugador2(String score) {
        if (puntajeJugador2 > 0 && puntajeJugador1 ==0)
        {
            if (puntajeJugador2 ==1)
                P2res = "Quince";
            if (puntajeJugador2 ==2)
                P2res = "Treinta";
            if (puntajeJugador2 ==3)
                P2res = "Cuarenta";
            
            P1res = "Amor";
            score = P1res + "-" + P2res;
        }
        return score;
    }

    private String getVentaja(String score) {
        if (puntajeJugador1 > 0 && puntajeJugador2 ==0)
        {
            if (puntajeJugador1 ==1)
                P1res = "Quince";
            if (puntajeJugador1 ==2)
                P1res = "Treinta";
            if (puntajeJugador1 ==3)
                P1res = "Cuarenta";
            
            P2res = "Amor";
            score = P1res + "-" + P2res;
        }
        return score;
    }

    private String getPuntajeJugador1(String score) {
        if (puntajeJugador1 == puntajeJugador2 && puntajeJugador1 < 4)
        {
            if (puntajeJugador1 ==0)
                score = "Amor";
            if (puntajeJugador1 ==1)
                score = "Quince";
            if (puntajeJugador1 ==2)
                score = "Treinta";
            score += "-Todos";
        }
        return score;
    }

    public void SetP1Punto(int number){
        
        for (int i = 0; i < number; i++)
        {
            P1Puntaje();
        }
            
    }
    
    public void SetP2Punto(int number){
        
        for (int i = 0; i < number; i++)
        {
            P2Puntaje();
        }
            
    }
    
    public void P1Puntaje(){
        puntajeJugador1++;
    }
    
    public void P2Puntaje(){
        puntajeJugador2++;
    }

    public void ganoPunto(String nombreJugador) {
        if (nombreJugador == "jugador1")
            P1Puntaje();
        else
            P2Puntaje();
    }
}