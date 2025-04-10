import java.util.ArrayList;
class GameBoard{
    private int length;
    private int hight;
    Apple apple = new Apple();

    public void setBoardSize (int givenlength, int givenhight){
        length = givenlength;
        hight = givenhight;
        apple.setAppleLocation(length, hight);
    }
    public void createBoard(ArrayList<Integer> snakeX, ArrayList<Integer> snakeY){
        apple.isEaten(snakeX,snakeY);
        if(apple.getEaten()){
            apple.setAppleLocation(length, hight);
        } else if(snakeX.size() > 1){
            snakeX.remove(snakeX.size() - 1);
            snakeY.remove(snakeY.size() - 1);
        }
        for(int i = 0; i < hight; i++){
            for(int j = 0; j < length; j++){
                boolean isSnake = false;
                if(snakeX.contains(j) && snakeY.contains(i)){
                    for(int k = 0; k < snakeX.size(); k++){
                        if(snakeX.get(k) == apple.getAppleX() && snakeY.get(k) == apple.getAppleY()){
                            boolean appleOverLap = true;
                            while(appleOverLap){
                                apple.setAppleLocation(length, hight);
                                boolean newPos = true;
                                for(int g = 0; g < snakeX.size(); g++){
                                    if(snakeX.get(g) == apple.getAppleX() && snakeY.get(g) == apple.getAppleY()){ 
                                        newPos = false;
                                        break;
                                    }  
                                }
                                if(newPos){
                                    appleOverLap = false;
                                }
                            }
                        }
                        if(snakeX.get(k) == j && snakeY.get(k) == i){
                            if(k == 0){
                                System.out.print("@");
                            } else{
                              System.out.print("0");  
                            }
                            isSnake = true;
                            break;
                            
                        }
                    }
                }
                if (!isSnake){
                    if (apple.getAppleX() == j && apple.getAppleY() == i){
                        System.out.print("*");
                    } else {
                        System.out.print("-");
                    }
                }
            }
            System.out.println();
            
        }
    }

}