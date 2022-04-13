package card;


import org.jetbrains.annotations.NotNull;

public class Card {

    String cardRank = "123456789TJQK";

    int scorePlayer1 = 0;
    int scorePlater2 = 0;

    @NotNull
    public String whoWins(char [] pack1, char[] pack2){

        if(cardRank.indexOf(pack1[0]) < cardRank.indexOf(pack2[0])){
            return "Player2 wins 1 to 0";
        }else if(cardRank.indexOf(pack1[0]) > cardRank.indexOf(pack2[0])){
            return "Player1 wins 1 to 0";
        }else{
            return "Ties";
        }
    }

}
