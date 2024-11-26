import java.util.Scanner;
class game{
    public static void main (String[] args){
        boolean playing = false;
        InputControl in = new InputControl();
        while(!playing){
            System.out.println("TYPE START TO PLAY");
            playing = in.getStart();
         }
    }


}