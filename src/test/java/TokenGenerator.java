import java.util.Random;
import java.util.Scanner;

public class TokenGenerator {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Please, pass what size of token do you want to generate: 5, 10 or 15?");

            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println("This is not the integer number, please try once again:");
            }
            //size of token
            int size = sc.nextInt();
            switch (size) {
                case 5:
                    System.out.println("Your token with " + size + " chars is: " + TokenGenerator.generateToken(5));
                    break;
                case 10:
                    System.out.println("Your token with " + size + " chars is: " + TokenGenerator.generateToken(10));
                    break;
                case 15:
                    System.out.println("Your token with " + size + " chars is: " + TokenGenerator.generateToken(15));
                    break;
                default:
                    System.out.println("You put wrong size of token");
            }
        }

        // method to generate a token with a given size
        private static String generateToken(int size) {
            String upperAlphabet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String lowerAlphabet =upperAlphabet.toLowerCase();
            String chars = upperAlphabet + lowerAlphabet +
                    "0123456789"+"!@#$%^&*()";

            StringBuilder sb = new StringBuilder(size);

            for (int i = 0; i < size; i++) {
                //generate number from 0 to the length of alfaNumeric String
                int charIndex = new Random().nextInt(chars.length()+1);
                // add char to sb
                sb.append(chars.charAt(charIndex));
            }
            return sb.toString();
        }
    }
