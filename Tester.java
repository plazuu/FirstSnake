class Tester{
    public static void main(String[] args){
        InputControl in = new InputControl();
        GameBoard game = new GameBoard();
        game.setBoardSize (25,7);
        game.createBoard(25,7);
        Apple app = new Apple();
        app.setAppleLocation(25,7);
        System.out.print(app.getAppleX());
       
    }
}
