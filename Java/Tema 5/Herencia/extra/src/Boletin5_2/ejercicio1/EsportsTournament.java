package Boletin5_2.ejercicio1;

public class EsportsTournament {
    public static void main(String[] args) {
        FPSGamer playerFPS = new FPSGamer();
        Gamer playerMoba = new MOBAGamer();
        Gamer playerSports = new SportsGamer();
        Gamer[] players = {playerFPS, playerMoba, playerSports};
        startTournament(players);
    }
    public static void startTournament(Gamer[] players){
        for(int i = 0; i < players.length; i++){
            players[i].playGame();
        }
    }
}
