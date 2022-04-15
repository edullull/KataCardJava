package card;


import org.jetbrains.annotations.NotNull;

public class Card {

    String cardRank = "123456789TJQK";
    @NotNull
    public String whoWins(char [] pack1, char[] pack2){

        int plusPlayer1 = 0;
        int plusPlayer2 = 0;

        for(int i=0; i < pack1.length; i++){
            if(cardRank.indexOf(pack1[i]) < cardRank.indexOf(pack2[i])){
                ++plusPlayer2;
            }else if(cardRank.indexOf(pack1[i]) > cardRank.indexOf(pack2[i])){
                ++plusPlayer1;
            }
        }

        if(plusPlayer2 > plusPlayer1){
            return "Player2 wins 1 to 0";
        }else if(plusPlayer1 > plusPlayer2){
            return "Player1 wins 1 to 0";
        }else{
            return "Ties";
        }
    }
};
