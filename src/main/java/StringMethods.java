//import java.io.File;
//import java.io.FileNotFoundException;
// Since there are a lot of Java files needed when reading from a text file
// I usually change File above to the * symbol
// like below, this pulls every class in the io folder into you program
import java.io.*;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) throws FileNotFoundException {
        // ^ this must be added when
        // reading from a text file

        // The String class has some other useful methods other than
        // just length, charAt(int index), valueOf, etc..

        String words = "Take the high road";

        // the replace method - replaces all the letters that match
        // replace(oldChar, newChar)

        String newWords = words.replace('a', 'o');
        System.out.println(words);
        System.out.println(newWords);
        System.out.println();

        // The .trim method - removes any leading and/or trailing
        // space from a String

        String word1 = "    Hello ";
        String word2 = " World";
        System.out.println(word1 + word2);
        System.out.println(word1.trim() + word2);
        System.out.println(words.trim()); // does nothing if there aren't spaces
        System.out.println();

        // There maybe times while coding or creating a project
        // that the user input (like a sentence or email address)
        // needs to be broken into sections or individual words.
        // This is known as tokenizing a String - breaking a String
        // down into its components or "tokens".
        // To do this the String class has a split method.


        // The split method splits a String into tokens, separated by a
        // specified delimiter into a String array.
        // (a delimiter - is a character or characters that
        // separates the tokens)


        String fruit = "peach raspberry strawberry vanilla";
        // In the above String: the fruits are the tokens and the spaces
        // are the delimiters
        // following 15 lines of code to separate the words
        // can be shortened to one line by using the String
        // split method
        String[] examp = new String[5];
        int index = 0;
        String fruitWord = "";
        for(int i = 0; i < fruit.length(); i++){
            if(fruit.charAt(i) == ' '){
                examp[index] = fruitWord;
                fruitWord = "";
                index++;
            }
            else {
                fruitWord += fruit.charAt(i);
            }
            if(i == fruit.length()-1){
                examp[index] = fruitWord;
            }
        }
        for(int i = 0; i < examp.length; i++){
            System.out.println(examp[i]);
        }


        // syntax for the split method - fruit.split(regex)
        // regex will be replaced with the delimiter surrounded
        // by double quotes

        String[] fruits = fruit.split(" ");
        // here the String is being split based on a space. The splitting
        // starts at the zero index, it reads through each letter until
        // it reaches a delimiter, once it does, everything up to the
        // delimiter is place in a cell of the array, this is repeated
        // until the end of the String is reached.
        System.out.println(fruits.length);

        for(int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        System.out.println();

        // You can specify more than one character as a delimiter
        // below I want to remove the spaces and the word and
        // from the String
        String count = "one and two and three and four";
        String[] counts = count.split(" and ");
        // notice the delimiter is in order of what needs to be removed

        for(int i = 0; i < counts.length; i++) {
            System.out.println(counts[i]);
        }
        System.out.println();

        // be sure the delimiter is spelled correctly, if I add an extra space
        // nothing will be split.




        // you can specify multiple delimiters, like an @ and .
        // from an email address
        String email = " jcarlis1@olemiss.edu";
        String[] parts = email.trim().split("[@.]");
        // by placing the square brackets around the delimiters, I
        // can specify that I want both an @ symbol and . period
        // to be delimiters separate from each other

        for(int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }
        System.out.println();
        System.out.println("The username is: " + parts[0]);
        System.out.println();



        // In Java 1 you should have seen how to read a single piece
        // of data per line from a text file using the
        // File and Scanner classes.
        // But usually, text files contain a lot of data
        // per line
        // The split method is great when you are reading from a text
        // file that has multiple values on the same line

        // To read from a file you first need to make a connection
        // between your program and the file using the File
        // class, which needs to be imported

        File file = new File("numbers.txt");

        // You then use the Scanner class to read from the connection
        // File Object
        // Once you instantiate the Scanner Object you will
        // have to add a "throws declaration" to the method header
        Scanner scan = new Scanner(file);

        // You can combine the two instantiations together
        Scanner scan1 = new Scanner(new File("numbers.txt"));

        // There are a couple of other Classes to read data from a file,
        // but I like the Scanner class as it has methods that
        // we use all the time.

        // You can now read through the file using the Scanner Object
        // The best way to do that is using a while loop

        while(scan.hasNextLine()) {
            // the method hasNextLine checks if the line the cursor is
            // on has data or not.
            // You then want to read a single line of data from the file
            // Reading a single line is the best practice as the Scanner
            // class does not have a next method for multiple lines.

            String line = scan.nextLine();
            // the nextLine method also moves the cursor to the next line
            // in the file
            // If the text file has a single piece of data per line
            // the assignment above is all I need, and I can place
            // the data in an array or arraylist, but the file has
            // more than one piece of data per line.
            // So, I will have to tokenize the String by splitting
            // the data. Looking at the text file, I can see that
            // there is a space at the beginning of each line, so
            // I need to trim the data as well since they are numbers.

            String[] tokens = line.trim().split("-");
            // The delimiter is a hyphen.

            // Now I have the data split into a String array, I can access
            // each piece easily by an index.
            System.out.print(tokens[0]);
            System.out.print("    " + tokens.length);
            System.out.println("    " + tokens[tokens.length - 1]);
            // I could add two other values together, but I need to convert
            // the data into integers.
            // ** Remember The data in a text file is always a String

            int value = Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[1]);
            System.out.println("The value of the first two cells of the String array"
                    + " added together is: " + value);

            // Or I could loop through the array, and add all the values together

            // Or I could test the first and last values of each line to see
            // which is bigger or if they are the same
            int firstValue = Integer.parseInt(tokens[0]);
            int lastValue = Integer.parseInt(tokens[tokens.length - 1]);
            // Notice above I used the array's length minus 1 to access the last
            // cell instead of placing a 2 there. Either way works for the current
            // text file, but if the amount of data on each changed, using 2 would
            // cause an error.
            // I made variables, so you could see what I was doing more easily, but
            // you don't always need to.

            if(firstValue == lastValue) {
                System.out.println("The first value and last value are the same "
                        + firstValue);
            }
            else if(firstValue > lastValue) {
                System.out.println(firstValue + " is greater than " + lastValue);
            }
            else System.out.println(lastValue + " is greater than " + firstValue);

            System.out.println();
        }
        // when finished reading you should close the connection
        scan.close();

        System.out.println();
//        // Once you read from the file, you CAN'T start over at the beginning
//		while(scan.hasNextLine()) {
//			System.out.println("reading the data a second time" + scan.nextLine());
//		}
//        scan.close();

        // To read through the file again, you MUST make a new Scanner Object.
        // If you instantiated the File Object separately from the Scanner
        // You can reuse it in a new Scanner instantiation

        Scanner scan2 = new Scanner(file);
        while(scan2.hasNextLine()) {
            System.out.println(scan2.nextLine());
        }
        scan2.close();
        scan = new Scanner(file);
        while(scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
        scan.close();


        // *** WARNING NEVER close the keyboard

    }
}