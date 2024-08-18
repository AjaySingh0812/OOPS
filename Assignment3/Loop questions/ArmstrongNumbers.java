/*write a program  to print all the armstrong number between 1 and 500. 
If sum of cubes of each digit of the number is equal to the number itself,
 then the  number is called an Armstrong number. */

 public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 500 are:");

        for (int num = 1; num <= 500; num++) {
            if (isArmstrong(num)) {
                System.out.println(num);
            }
        }
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        return sum == originalNum;
    }
}
