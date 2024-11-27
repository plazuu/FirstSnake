import java.util.Scanner;
class Game{
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
        Board.setBoardSize(25,8);
        snake.setSnakeCenter(25,8);
        while(playing){
            Board.createBoard(snake.getSnakeX(), snake.getSnakeY()); 
            snake.setSnakeDirection(in.getMovment());
            playing = snake.isSnakeAlive(25, 8);
        }
        System.out.print("you died");
    }
}