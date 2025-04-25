package guesser_game;

import java.util.Scanner;

class Guesser {
    public int guessNumber(Scanner scan) {
        System.out.print("Guesser, enter your number: ");
        return scan.nextInt();
    }
}

class Player {
    public int guessNumber(Scanner scan) {
        System.out.print("Player, enter your guess: ");
        return scan.nextInt();
    }
}

class Umpire {
    int guesserNumber;
    int player1, player2, player3;

    public void collectGuesserNumber(Scanner scan) {
        Guesser g = new Guesser();
        guesserNumber = g.guessNumber(scan);
    }

    public void collectPlayerNumbers(Scanner scan) {
        Player p = new Player();
        player1 = p.guessNumber(scan);
        player2 = p.guessNumber(scan);
        player3 = p.guessNumber(scan);
    }

    public void compare() {
        System.out.println("\nResult:");
        if (guesserNumber == player1 || guesserNumber == player2 || guesserNumber == player3) {
            if (guesserNumber == player1) System.out.println("Player 1 guessed correctly!");
            if (guesserNumber == player2) System.out.println("Player 2 guessed correctly!");
            if (guesserNumber == player3) System.out.println("Player 3 guessed correctly!");
        } else {
            System.out.println("No one guessed correctly.");
        }
    }
}

public class GuesserGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Umpire umpire = new Umpire();
        umpire.collectGuesserNumber(scan);
        umpire.collectPlayerNumbers(scan);
        umpire.compare();
        scan.close(); //
    }
}
