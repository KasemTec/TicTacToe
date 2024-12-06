import java.util.Scanner;

 abstract class Player {
    String name;
    char token;

   Player() {

    }

    abstract void makeMove();


    boolean isValidMove(int row, int col) {
       if(row >= 0 && row <= 2 &&
           col >= 0 && col <= 2)
       {
           if (TicTacToe.board[row][col] == ' ')
           {
               return true;
           }
       }
        System.out.println("Your Inputs Are Invalid! Please Try Again");
       return false;
    }
}