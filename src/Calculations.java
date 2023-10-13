package src;
public class Calculations {
    
    static final int G = 118620; /*  Grunnbeløp hentet fra nav.no/grunnbelopet. Dette er en konstant */
    User user;
    float averageSalary;
    float lastYearsSalary;


    public Calculations(User user){
        this.user = user;
        this.averageSalary = user.getAverageSalary();
        this.lastYearsSalary = user.getLastYearsSalary();
    }

    public boolean isEligibleForDagpenger(){

        if(lastYearsSalary > G*1.5){ /* Er siste årslønn over 1.5G? */
            return true;
        }

        else if(
            averageSalary > G*3 /*Er gjennomsnittet større enn 3G? */
        
        ){
            return true;
        }

        return false;

    }


    private float dagPengeGrunnlag(){
        float result;

        if(lastYearsSalary > averageSalary){
            result = lastYearsSalary;
        }
        else{
            result = averageSalary;
        }
        
        if(result>6*G){
            return 6*G; /* Dagpengegrunnlaget kan ikke være over 6G. Det var ikke spesifisert i oppgaven hva som skjer hvis grunnlaget er over 6G, så jeg antar at dagpengegrunnlaget blir satt til 6G hvis dette er tilfellet. */
        }

        return result; /* Her kan man også bruke innebygd Math.max()-funksjonen for å returnere den største av dem, og dermed spare noen linjer kode */

    }

    public int getDagSats(){
        return (int) Math.ceil((dagPengeGrunnlag()/260));
    }

}
