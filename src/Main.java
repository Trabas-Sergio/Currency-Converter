import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CurrencyConverter currencyConverter = new CurrencyConverter();


        double amount = 0;
        ConversionToObject conversionToObject = null;

        int choice = 0;
        while (choice != 7) {
            try {
                System.out.println("""
                    ********************************************
                    Be welcome to the Currency Converter!
                                    
                    1) Dollar ==> Argentine Peso
                    2) Argentine Peso ==> Dollar
                    3) Dollar ==> Brasilian Real 
                    4) Brasilian Real ==> Dollar  
                    4) Dollar ==> Colombian Peso  
                    6) Colombian Peso ==> Dollar
                    7) Salir  
                                    
                    Chose a valid option:
                    ********************************************
                    """);


                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the amount to convert!: ");
                        amount = input.nextDouble();
                        conversionToObject = currencyConverter.convertCurrency("USD", "ARS", amount);
                        System.out.println("The value " + amount + "[" + conversionToObject.base_code() +
                                "] corresponds to the final value of ==> " +
                                conversionToObject.conversion_result() + "[" + conversionToObject.target_code() + "]\n");
                        break;
                    case 2:
                        System.out.println("Enter the amount to convert!: ");
                        amount = input.nextDouble();
                        conversionToObject = currencyConverter.convertCurrency("ARS", "USD", amount);
                        System.out.println("The value " + amount + "[" + conversionToObject.base_code() +
                                "] corresponds to the final value of ==> " +
                                conversionToObject.conversion_result() + "[" + conversionToObject.target_code() + "]\n");
                        break;
                    case 3:
                        System.out.println("Enter the amount to convert!: ");
                        amount = input.nextDouble();
                        conversionToObject = currencyConverter.convertCurrency("USD", "BRL", amount);
                        System.out.println("The value " + amount + "[" + conversionToObject.base_code() +
                                "] corresponds to the final value of ==> " +
                                conversionToObject.conversion_result() + "[" + conversionToObject.target_code() + "]\n");
                        break;
                    case 4:
                        System.out.println("Enter the amount to convert!: ");
                        amount = input.nextDouble();
                        conversionToObject = currencyConverter.convertCurrency("BRL", "USD", amount);
                        System.out.println("The value " + amount + "[" + conversionToObject.base_code() +
                                "] corresponds to the final value of ==> " +
                                conversionToObject.conversion_result() + "[" + conversionToObject.target_code() + "]\n");
                        break;
                    case 5:
                        System.out.println("Enter the amount to convert!: ");
                        amount = input.nextDouble();
                        conversionToObject = currencyConverter.convertCurrency("USD", "COP", amount);
                        System.out.println("The value " + amount + "[" + conversionToObject.base_code() +
                                "] corresponds to the final value of ==> " +
                                conversionToObject.conversion_result() + "[" + conversionToObject.target_code() + "]\n");
                        break;
                    case 6:
                        System.out.println("Enter the amount to convert!: ");
                        amount = input.nextDouble();
                        conversionToObject = currencyConverter.convertCurrency("COP", "USD", amount);
                        System.out.println("The value " + amount + "[" + conversionToObject.base_code() +
                                "] corresponds to the final value of ==> " +
                                conversionToObject.conversion_result() + "[" + conversionToObject.target_code() + "]\n");
                        break;
                    case 7:
                        System.out.println("The program finished!");
                        break;
                    default:
                        System.out.println("Invalid option!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry. Please enter a numerical value!\n");
                input.nextLine();
            }
        }

    }
}