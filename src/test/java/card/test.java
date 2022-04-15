package card;

import lombok.var;
import org.junit.jupiter.api.Test;



import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class test {

    @Test
    void game_card(){
     var card = new Card();
        String s = "Player2 wins 1 to 0";
        assertEquals(s, card.whoWins(new char[]{'1'}, new char[]{'2'}));
    }

    @Test
    void wins_card_highest(){
        var card = new Card();
        String s = "Player1 wins 1 to 0";
        assertEquals(s, card.whoWins(new char[]{'2'}, new char[]{'1'}));
    }

    @Test
    void ties(){
        var card = new Card();
        String s = "Ties";
        assertEquals(s, card.whoWins(new char[]{'2'}, new char[]{'2'}));
    }

    @Test
    void how_card_is_highest(){
        var card = new Card();
        String s = "Player1 wins 1 to 0";
        assertEquals(s, card.whoWins(new char[]{'K'}, new char[]{'Q'}));
    }
    @Test
    void compare_players_with_two_cards(){
        var card = new Card();
        String s = "Player2 wins 1 to 0";
        assertEquals(s, card.whoWins(new char[]{'2', '2'}, new char[]{'3','3'}));
    }

    @Test
    void compare_players_with_two_cards_win_player1(){
        var card = new Card();
        String s = "Player1 wins 1 to 0";
        assertEquals(s, card.whoWins(new char[]{'6', '6'}, new char[]{'3','3'}));
    }

}
