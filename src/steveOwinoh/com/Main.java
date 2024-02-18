package steveOwinoh.com;

public class Main {
    public static void main(String[] args) {

//        System.out.println("10000 at the rate of 2% = " +calculateInterest(10000.0,2));
//        System.out.println("10000 at the rate of 3% = " +calculateInterest(10000.0,3));
//        System.out.println("10000 at the rate of 4% = " +calculateInterest(10000.0,4));
//        System.out.println("10000 at the rate of 5% = " +calculateInterest(10000.0,5));
        //lets use for loop instead
        //for(init;termination;increment);

        for (int i = 0; i < 5; i++){
            System.out.println("Loop " + i + " hello");

        }
        //using the four statement, call the calculateInterest method with
        //the amount of 10000 with an interest rate of 2,3,4,5,6,7 and 8
        //and print the results to the console window

        for (int i = 2; i <= 8; i++){
            double interest = calculateInterest(10000.00,i);
            System.out.printf("%.2f%n",interest);

        }

    }
    public static double calculateInterest(double amount ,double interestRate){
        return (amount * (interestRate/100));

    }

}