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
        Board.setBoardSize(25,7);
        snake.setSnakeCenter(25,7);
        while(playing){
            Board.createBoard(); 
            snake.setSnakeDirection(in.getMovment());
            
        }
    }
}