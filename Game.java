import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class Game{
    public static final int BOARD_LENGTH = 25;
    public static final int BOARD_HIGHT = 8;
    public static void main(String[] args){
        boolean playing = false;
        InputControl in = new InputControl();
        GameBoard Board = new GameBoard();
        Snake snake = new Snake();
        while(!playing){
            System.out.println("TYPE START TO PLAY");
            playing = in.getStart();
         }
        System.out.println("welcome to snake");
        Board.setBoardSize(BOARD_LENGTH,BOARD_HIGHT);
        snake.setSnakeCenter(BOARD_LENGTH,BOARD_HIGHT);
        while(playing){
            Board.createBoard(snake.bodyX, snake.bodyY); 
            snake.setSnakeDirection(in.getMovment());
            playing = snake.isSnakeAlive(BOARD_LENGTH, BOARD_HIGHT);
        }
        System.out.print("you died");
    }
}