import java.util.Hashtable;

public class TennisGame1 implements TennisGame {
    
    private int puntajeJugador1 = 0;
    private int puntajeJugador2 = 0;
    private String nombreJugador1;
    private String nombreJugador2;

    public TennisGame1(String nombreJugador1, String nombreJugador2) {
        this.nombreJugador1 = nombreJugador1;
        this.nombreJugador2 = nombreJugador2;
    }

    public void ganoPunto(String nombreJugador) {
        if (nombreJugador == "jugador1")
            puntajeJugador1 += 1;
        else
            puntajeJugador2 += 1;
    }

    public String getPuntaje() {
        String puntaje = "";
        int tempPuntaje=0;
        if (puntajeJugador1 == puntajeJugador2)
        {
            puntaje = getEmpate(puntajeJugador1);
        }
        else if (puntajeJugador1 >=4 || puntajeJugador2 >=4)
        {
            puntaje = ventajaJugador();
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempPuntaje = puntajeJugador1;
                else { puntaje+="-"; tempPuntaje = puntajeJugador2;}
                puntaje = getPunto(puntaje, tempPuntaje);
            }
        }
        return puntaje;
    }

    private String ventajaJugador() {
        String puntaje = "";
        int minusResult = puntajeJugador1 - puntajeJugador2;
       if (minusResult==1) puntaje ="Ventaja jugador1";
        else if (minusResult ==-1) puntaje ="Ventaja jugador2";
        else if (minusResult>=2) puntaje = "Gana jugador1";
        else puntaje ="Gana jugador2";
        return puntaje;
    }

    private String getPunto(String puntaje, int tempPuntaje) {
        switch(tempPuntaje)
        {
            case 0:
                puntaje +="Amor";
                break;
            case 1:
                puntaje +="Quince";
                break;
            case 2:
                puntaje +="Treinta";
                break;
            case 3:
                puntaje +="Cuarenta";
                break;
        }
        return puntaje;
    }

    private String getEmpate(int puntajeJugador1) {

            Hashtable empate =new Hashtable();
            empate.put(0, "Amor-Todos");
            empate.put(1, "Quince-Todos");
            empate.put(2, "Treinta-Todos");
            if(puntajeJugador1 > 2) {
                puntajeJugador1 = 3;
            }
            empate.put(3, "Deuce");

       /* switch (puntajeJugador1)
        {
            case 0:
                    puntaje = "Amor-Todos";
                break;
            case 1:
                    puntaje = "Quince-Todos";
                break;
            case 2:
                    puntaje = "Treinta-Todos";
                break;
            default:
                    puntaje = "Deuce";
                break;

        }*/
        return empate.get(puntajeJugador1).toString();
    }
}
