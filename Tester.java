class Tester{
    public static void main(String[] args){
        InputControl in = new InputControl();
        GameBoard game = new GameBoard();
        game.setBoardSize (25,7);
        game.createBoard();
        return in.getStart();
    }
}
