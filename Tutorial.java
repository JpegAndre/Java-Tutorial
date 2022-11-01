/*Hello there master! 
 * Considering how busy you are, I thought this is the perfect place to write you a message in a bottle
 * Firstly, you do still kinda owe me those olympiad questions you promised
 * And secondly, I just wanna thank you for all your help with... well everything up till now
 * Let me put it this way, if my interest in coding was a spark before, it's now a burning fire
 * 
 * So.. thanks master
 * But without furthur ado, enjoy the show :3
 */

// use the scanner utility to read in user input
import java.util.*;
import java.lang.Math;

public class Tutorial {

    public static int c, e, f, j, k;
    public static String d, g;
    public static double h, i;
    public static String[] sortedWords;

    public static void main(String[] args) {

        // ========================
        // ========================
        // Level 1
        // ========================
        // ========================

        // QUESTION 1
        // ========================
        // Write a method that adds two integers and returns the result, using the
        // skeleton (template) code provided.
        // ========================
        // INPUT PARAMETERS: int a, int b
        // RETURN: int
        // METHOD NAME: add()
        // ========================
        c = add(1, 2);

        // QUESTION 2
        // ========================
        // Write a method that concatenates (combines) two strings and returns the
        // result, using the skeleton (template) code provided.
        // ========================
        // INPUT PARAMETERS: String a, String b
        // RETURN: String
        // METHOD NAME: concatenate()
        // ========================
        d = concatenate("Hi there! ", "I've been stitched together.");

        // QUESTION 3
        // ========================
        // Write a method that takes in a string and converts it to an integer, using
        // the skeleton (template) code provided.
        // ========================
        // INPUT PARAMETERS: String a
        // RETURN: int
        // METHOD NAME: convertToInt()
        // ========================
        e = convertToInt("123");

        // QUESTION 4
        // ========================
        // Write a method that takes in a string and returns the length of the string,
        // using the skeleton (template) code provided.
        // ========================
        // INPUT PARAMETERS: String a
        // RETURN: int
        // METHOD NAME: stringLength()
        // ========================
        f = stringLength("This is a very long string that I am typing out.");

        // ========================
        // ========================
        // Level 2
        // ========================
        // ========================

        // QUESTION 5
        // ========================
        // Write a method that asks the user for their name and takes in their input,
        // using the skeleton (template) code provided.
        // ========================
        // INPUT PARAMETERS: None
        // RETURN: String
        // METHOD NAME: askForName()
        // ========================
        g = askForName();

        // QUESTION 6
        // ========================
        // Write a method that takes two coordinate points in the format (x, y) and
        // calculates the gradient of the line between them,
        // using the skeleton (template) code provided. Look at Q6.png to see the
        // formula you need to use.
        // ========================
        // INPUT PARAMETERS: int x1, int y1, int x2, int y2
        // RETURN: double
        // METHOD NAME: calculateGradient()
        // ========================
        h = calculateGradient(1, 2, 3, 4);

        // QUESTION 7
        // ========================
        // Write a method that takes in two points in the format (x, y) and calculates
        // the distance between them,
        // using the skeleton (template) code provided. Look at Q7.png to see the
        // formula you need to use.
        // ========================
        // INPUT PARAMETERS: int x1, int y1, int x2, int y2
        // RETURN: double
        // METHOD NAME: calculateDistance()
        // ========================
        i = calculateDistance(1, 2, 3, 4);

        // QUESTION 8
        // ========================
        // Write a method that computes the sum of all numbers in a given array, using
        // the skeleton (template) code provided.
        // ========================
        // INPUT PARAMETERS: int[] a
        // RETURN: int
        // METHOD NAME: sumArray()
        // ========================
        int[] arr = { 1, 2, 3, 4, 5 };
        j = sumArray(arr);

        // ========================
        // ========================
        // Level 3
        // ========================
        // ========================

        // QUESTION 9
        // ========================
        // Write a method that simulates a dice roll and returns the result. Define your
        // own method to answer this question.
        // ========================
        // INPUT PARAMETERS: None
        // RETURN: int
        // METHOD NAME: rollDice()
        // ========================

        // uncomment to run method
        k = rollDice();

        // QUESTION 10
        // ========================
        // Write a method that simulates a conversation between two people. Define your
        // own method to answer this question.
        // The conversation should take place between the computer and the user (and
        // should thus take continuous input from the user).
        // The conversation should end when the user types "bye".
        // You can make this as complex as you want, but it should at least include the
        // following:
        // - The computer should greet the user when the program starts.
        // - The computer should ask the user how they are doing and respond
        // accordingly.
        // You can write as many helper methods as you want to answer this question.
        // Just call your main runner method after question 10
        // ========================

        // call your chatbot method here
        // chatBot();

        // Question 11
        // ========================
        // Write a method that asks the user for their name and uses that input to
        // generate a secure username and password.
        // If the same name is entered twice, a different username and password should
        // be generated every time.
        // The method should print out the username and password to the console with
        // appropaiate labels.
        // ========================
        // INPUT PARAMETERS: None
        // RETURN: None
        // METHOD NAME: generateUsernameAndPassword()
        // ========================

        // uncomment to run method
        generateUsernameAndPassword();

        // Question 12
        // ========================
        // Write a method that takes an array of words and returns an alphabetically
        // sorted array of those words.
        // ========================
        // INPUT PARAMETERS: String[] a
        // RETURN: String[]
        // METHOD NAME: sortArray()
        // ========================
        String[] words = { "hello", "world", "this", "is", "a", "test" };
        sortedWords = sortArray(words);

        show_answers();
    }

    // calculate the sum of two integers (numbers)
    public static int add(int a, int b) {
        // write your code here
        // really master xD
        return a + b;
    }

    // concatenate two strings
    public static String concatenate(String a, String b) {
        // write your code here
        return a + b;
    }

    // convert a string to an integer
    public static int convertToInt(String a) {
        // write your code here
        // thankfully this is easier than that hash values
        return Integer.parseInt(a);

    }

    // calculate the length of a string
    public static int stringLength(String a) {
        // write your code here
        // don't expose him like that master
        return a.length();
    }

    // ask the user for their name
    public static String askForName() {
        // write your code here
        // yes hi master
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = scanner.nextLine();
        scanner.close();

        return "Hi " + name + "!";
    }

    // calculate the gradient of a line between two points
    public static double calculateGradient(int x1, int y1, int x2, int y2) {
        // write your code here
        int y = y2 - y1;
        int x = x2 - x1;
        return y / x;
    }

    // calculate the distance between two points
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        // write your code here
        // the time you got the quadratic formula right was more impressive
        double x = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        return x;
    }

    // calculate the sum of all numbers in an array
    public static int sumArray(int[] a) {
        // write your code here
        int total = 0;

        for (int i : a) {
            total += i;
        }

        return total;
    }

    public static int rollDice() {
        Random random = new Random();
        int x;

        do {
            x = random.nextInt(7);
        } while (x == 0);

        return x;
    }

    public static void chatBot() {
        // i should honestly just submit that text game I made instead of this
        // wait can i actually do that

        // while (b == false) {
        // System.out.println("Would you like to go left, right or straight?\n");
        // String choice = scanner.nextLine();

        // switch (choice.toLowerCase()) {
        // case "left":
        // left();
        // b = true;
        // break;
        // case "right":
        // right();
        // b = true;
        // break;
        // case "straight":
        // straight();
        // b = true;
        // break;
        // default:
        // System.out.println("That is not a valid choice, try again!");
        // b = false;
        // break;
        // }
        // }
        // scanner.close();

        Scanner scanner = new Scanner(System.in);
        String response = "hi";
        System.out.println("Well hello there!");
        System.out.println("General Kenobi, are you feeling good today?");

        while (response.toLowerCase() != "bye") {
            response = scanner.nextLine();

        }

        scanner.close();
    }

    public static void generateUsernameAndPassword() {
        // using this to cover up that you always forget your passwords

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name for your username and password :");
        String name = scanner.nextLine();
        scanner.close();

        String pass = "";
        String passname = "";
        String username = "";

        String x = Integer.toString(random.nextInt(100));

        username = name + x;

        String y1 = Integer.toString(random.nextInt(10));
        String y2 = Integer.toString(random.nextInt(10));

        for (int i = name.length() - 1; i >= 0; i--) {
            passname = passname + name.charAt(i);
        }

        pass = y1 + passname + y2;

        System.out.println("Name : " + name);
        System.out.println("Username : " + username);
        System.out.println("Password : " + pass);
    }

    public static String[] sortArray(String[] a) {
        Arrays.sort(a);

        return a;
    }

    // ###################################################################################
    // THIS IS MY SECTION OF CODE TO PRINT OUT YOUR VALUES. PLEASE DON'T CHANGE THIS
    // CODE
    // now you just sound like the Gollum - my preciouss.... code
    // ###################################################################################

    // print out a string (my method...leave it alone)
    public static void print(String a) {
        System.out.println(a);
    }

    // override the print method to print out an integer (my method...leave it
    // alone)
    public static void print(int a) {
        System.out.println(a);
    }

    // override the print method to print out a double (my method...leave it alone)
    public static void print(double a) {
        System.out.println(a);
    }

    // print out the answers (my method...leave it alone)
    public static void show_answers() {
        print("Question 1: " + c);
        print("Question 2: " + d);
        print("Question 3: " + e);
        print("Question 4: " + f);
        print("Question 5: " + g);
        print("Question 6: " + h);
        print("Question 7: " + i);
        print("Question 8: " + j);
        print("Question 9: " + k);
    }
}