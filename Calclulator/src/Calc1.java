import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Logger;
import java.lang.String;

public class Calc1 {

	// calculator program with switch case statements

	public static void main(String[] args) throws FileNotFoundException {

		char operator;
		double num1, num2, result;

		Logger l = Logger.getLogger("hi");

		Scanner s = new Scanner(System.in);

		boolean status = true;
		PrintStream o = new PrintStream(new File("A.txt"));
		while (status) {

			o.println("Enter operator");
			operator = s.next().charAt(0);
			if (!"+-/%*".contains(String.valueOf(operator))) {
				System.out.println("Enter Valid Operator");

				o.println("Hello");
				

			}

			else {

				// System.out.println("Enter First Number");
				l.info("Enter First Number");
				num1 = s.nextDouble();

				System.out.println("Enter Second Number");
				num2 = s.nextDouble();

				switch (operator) {

				case '+':

					result = num1 + num2;
					o.println("num1+num2: " + result);
					break;

				case '-':

					result = num1 - num2;

					// Logger.info("hello");
					System.out.println("num1-num2: " + result);
					break;

				case '*':

					result = num1 * num2;
					System.out.println("num1*num2: " + result);
					break;

				case '/':

					result = num1 * num2;
					System.out.println("num1*num2: " + result);
					break;

				case '%':

					result = num1 % num2;
					o.println("num1%num2:" + result);
					break;

				default:
					System.out.println("Enter Valid operator");
					break;

				}
			}
			o.flush();
			o.close();
		}

		s.close();
	}

}
