package src;

public class MainClass {


    public static void main(String[] args) {

        User user = new User(420000, 450000, 560000);
        Calculations calculations = new Calculations(user);

        if(!calculations.isEligibleForDagpenger()){
            System.out.println("Du kan dessverre ikke motta dagpenger, fordi du ikke har tjent nok i løpet av de tre foregående årene.");
        }
        
        else{
            System.out.println("Gratulerer, du kan motta dagpenger! Du kan motta " + calculations.getDagSats() +"kr som dagsats!");
        }

    }
    
}