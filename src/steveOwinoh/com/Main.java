package steveOwinoh.com;

public class Main {
    public static void main(String[] args) {

//        System.out.println("10000 at the rate of 2% = " +calculateInterest(10000.0,2));
//        System.out.println("10000 at the rate of 3% = " +calculateInterest(10000.0,3));
//        System.out.println("10000 at the rate of 4% = " +calculateInterest(10000.0,4));
//        System.out.println("10000 at the rate of 5% = " +calculateInterest(10000.0,5));
        //lets use for loop instead
        //for(init;termination;increment);

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello");

        }
        //using the for statement, call the calculateInterest method with
        //the amount of 10000 with an interest rate of 2,3,4,5,6,7 and 8
        //and print the results to the console window

        for (int i = 2; i <= 8; i++) {
            double interest = calculateInterest(10000.00, i);
            System.out.printf("%.2f%n", interest);

        }

        //How would you format the for loop above to do the same thing
        //but to start from 8% and work back to 2%?
        for (int i = 8; i >= 2; i--) {
            //instead of using "printf", we can use string.format method to convert the number to two decimal places
            System.out.println("10,000 at " + i + " % interest " + calculateInterest(10000.00, 1));
        }
        //create a for statement using any range of numbers
        //Determine if the number is prime using the is prime method
        //if it is a prime number, print it out and increment a count of the
        //number of prime numbers found
        //if that count is 3 exit the for loop
        //use the break statement to exit

        int count = 0;
        for (int i = 1; i <= 10; i++){
            if (isPrime(i)) {
                //here,this simply means
                //when the above condition is met,the loop should continue to test the next value
                count++;
                System.out.println("number " + i + " is a prime number");
                if (count == 10){
                    System.out.println("Exiting for loop");
                    //we use break keyword to exit from a loop
                    break;
                }
            }
        }

    }
    public static double calculateInterest(double amount ,double interestRate){
        //how to get interest
        return (amount * (interestRate/100));

    }
    //create a method and generate prime numbers using for loop
    private static boolean isPrime(int num){
        //prime number should be greater than one.
        //one is not a prime number
        if (num == 1){
            return false;
        }
        //i <= num / 2. It checks for divisibility of num
        //if num will be divisible by 2,it will return false else true
        for (int i = 2; i <= num/2; i ++){
            //checking for even
            if (num % i ==0){
                return false;
            }
        }
        return true;

    }

}