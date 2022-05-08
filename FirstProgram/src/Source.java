
import java.util.*;

abstract class Homeloan {
    double amount;
    int time;

    public Homeloan(double amount, int time){
        this.amount = amount;
        this.time = time;
    }

    //Write your code here
    abstract double getRateOfInterest();
    double simpleInterest(){
        return (amount*getRateOfInterest()*time)/100;
    }
}

class Bank1 extends Homeloan {

    //Write your code here
    public Bank1(double amount, int time){
        super(amount, time);
    }
    double getRateOfInterest(){
        return 7.2;
    }

}

class Bank2 extends Homeloan {

    public Bank2(double amount, int time){
        super(amount, time);
    }
    double getRateOfInterest(){
        return 7.2;
    }

}

class Source {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double amount = in.nextDouble();
        int time = in.nextInt();
        Homeloan obj1 = new Bank1(amount, time);
        Homeloan obj2 = new Bank2(amount, time);
        if (obj1.simpleInterest() < obj2.simpleInterest()) {
            System.out.println("File for a loan in Bank1");
            System.out.println(obj1.simpleInterest());
        } else {
            System.out.println("File for a loan in Bank2");
            System.out.println(obj2.simpleInterest());
        }
    }
}

