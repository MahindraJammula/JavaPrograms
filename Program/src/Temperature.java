import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the temperature =");
        double temperatureFahrenheit =sc.nextDouble();
        //double temperatureCelsius = Temperature.fahrenheitToCelsius(temperatureFahrenheit);
        System.out.println("Temperature in Celsius: " + Temperature.fahrenheitToCelsius(temperatureFahrenheit) );
        sc.close();
    }
        public static double fahrenheitToCelsius(double fahrenheit) {
            double celsius = ((fahrenheit - 32) * 5) / 9;
            return celsius;
        }
    }

