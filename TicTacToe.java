package JavaProject;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char [][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }
        char player = 'X';
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);

        while(!gameOver){
            printboard(board);
            System.out.print("Player " + player + " enter: ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            System.out.println();
            if(board[row][col] == ' '){
                board[row][col] = player;
                gameOver = hasWon(board, player);
                if(gameOver){
                    printboard(board);
                    System.out.println("Player "+ player +" Won");
                }
                else{
                    player = (player == 'X')?'0':'X';
                }
            }
            else{
                System.out.println("Invalid move! Try Again.");
            }
        }
        //printboard(board);
    }
    public static void printboard(char [][] board){
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col]+" | ");
            }
            System.out.println();
        }
    }
    public static boolean hasWon(char [][] board,char player){
        //Check Row
        for (int row = 0; row < board.length; row++) {
            if(board[row][0] == player && board[row][1] == player && board[row][2] == player){
                return true;
            }
        }
        //Check Col
        for (int col = 0; col < board.length; col++) {
            if(board[0][col] == player && board[1][col] == player && board[2][col] == player){
                return true;
            }
        }
        //Check Diagonal
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }
        if(board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }
        return false;
    }
}
