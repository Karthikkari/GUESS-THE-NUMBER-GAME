// Guess the Number using OOPs in java
import java.util.*;
class game{
    int random;
    int guessn;
    public void ran(){
        Random r=new Random();
        random=r.nextInt(100);
    }
    public void guess(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number : ");
        int g=sc.nextInt();
        if(g>=0 && g<100){
            guessn=g;
        }
        else{
            System.out.println("guess a number between 0 to 99.");
            System.exit(0);
        }
    }
    public int getran(){
        return random;
    }
    public int getguess(){
        return guessn;
    }
}
public class guessnoGame{
    public static int i=1;
    public static void main(String[] args){
        game gg=new game();
        int p=gg.getran();
        int q=gg.getguess();
        gg.ran();
        do{
            gg.guess();
            p=gg.getran();
            q=gg.getguess();
            if(p==q){
                System.out.println("you have guessed the number in "+i+" chances\nThe number is "+p+".");
            }
            else if(p>q){
                System.out.println("you have guessed the word less then the number.");
                i++;
            }
            else{
                System.out.println("you have guessed the word greater than the number.");
                i++;
            }
        }while(p!=q);
    }
}
