package src;
public class User {
    
    int y20;
    int y21;
    int y22;

    public User(int y20, int y21, int y22){
        this.y20 = y20;
        this.y21 = y21;
        this.y22 = y22;
    }



    public float getAverageSalary(){
        return (y20 + y21 + y22)/3;
    }

    public int getLastYearsSalary(){
        return y22;
    }



}
