import java.util.Scanner;
class InputControl{
    Scanner scan = new Scanner(System.in);
    public boolean getStart(){
        if(scan.nextLine().equals("start")){
            return true;
        } else {
            return false;
        }
    }
}