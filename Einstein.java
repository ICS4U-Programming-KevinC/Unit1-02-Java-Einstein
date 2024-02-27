import java.util.Scanner;

/**
 * Einsteins equation program.
 *
 * @author Kevin Csiffary
 * @version 1.0
 * @since 2024-02-27
 */
public final class Einstein {
  /** Private constructor to prevent instantiation of this utility class. */
  private Einstein() {
    // Prevents instantiation.
  }

  /**
   * Create main function.
   *
   * @param args Command line arguments.
   */
  public static void main(final String[] args) {
    // Display Hello World! to the console
    final double speedOfLight = 299792458d;

    // Create the scanner.
    Scanner sc = new Scanner(System.in);

    // Get user input.
    System.out.println("Enter the mass of your object in kg:");
    String massString = sc.nextLine();

    // Setup try catch
    try {
      // Cast the input to a double.
      double massDouble = Double.parseDouble(massString);

      // Check for a negative input.
      if (massDouble < 0) {
        System.out.println("Please enter a non negative number.");
      } else {
        // Calculate the energy.
        double energy = massDouble * Math.pow(speedOfLight, 2);

        // Display the result to the user.
        System.out.print("The energy of the mass you provided is ");
        System.out.println(String.format("%.3f", energy) + "J");
      }
    } catch (Exception e) {
      System.out.println("Please enter a proper number.");
    }
  }
}
