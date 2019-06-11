import java.util.*;

public class Main {

    // this function will create a object array list, add values and print it to the screen
    static void myObjectList()
    {
        //create an array list that excepts all types also know as objects
        List l1 = new ArrayList();

        /* in arrays and lists indexes always start at 0!*/

        // add to the array list
        l1.add('a'); // add this to index 0
        l1.add(3);   // add this to index 1
        l1.add(true);// add this to index 2

        // now lets print out the list
        System.out.println("l3: ");

        for(Object o : l1) // go over the objects in the array list and print them
        {
            System.out.print( o + ", "); // print to screen
        }
        System.out.println("\n"); // go down a line
    }

    // this function will create a int array list, add values and print it to the screen
    static void myIntList()
    {
        //create an array list that only excepts integers
        List<Integer> l2 = new ArrayList();

        /* in arrays and lists indexes always start at 0!*/

        // add to the array list
        l2.add(78); // add this to index 0
        l2.add(3);   // add this to index 1
        l2.add(2);// add this to index 2

        // now lets print out the list
        System.out.println("l2: ");
        for(int i : l2) // go over the integers in the array list and print them
        {
            System.out.print(i + ", "); // print to screen
        }
        System.out.println("\n"); // go down a line
    }

    // this function will create a String array list, add values and print it to the screen
    static void myStringList()
    {
        //create an array list that only excepts Strings
        List<String> l3 = new ArrayList();

        /* in arrays and lists indexes always start at 0!*/

        // add to the array list
        l3.add("hello");// add this to index 0
        l3.add(" I ");  // add this to index 1
        l3.add("am ");  // add this to index 2
        l3.add("amazing"); // add this to index 3

        // now lets print out the list
        System.out.println("l3: ");
        for(String s : l3) // go over the strings in the array list and print them
        {
            System.out.print(s + ", "); // print to screen
        }
        System.out.println("\n"); // go down a line
    }

    // this function will create a boolean array list, add values and print it to the screen
    static void myBoolList()
    {
        //create an array list that only excepts Strings
        List<Boolean> l4 = new ArrayList();

        /* in arrays and lists indexes always start at 0!*/

        // add to the array list
        l4.add(true);// add this to index 0
        l4.add(false);  // add this to index 1
        l4.add(true);  // add this to index 2
        l4.add(true); // add this to index 3

        // now lets print out the list
        System.out.println("l4: ");
        for(boolean b : l4) // go over the booleans in the array list and print them
        {
            System.out.print(b + ", "); // print to screen
        }
        System.out.println("\n"); // go down a line
    }

    // this function will create a character array list, add values and print it to the screen
    static void myCharList()
    {
        //create an array list that only excepts Strings
        List<Character> l5 = new ArrayList();

        /* in arrays and lists indexes always start at 0!*/

        // add to the array list
        l5.add('h');// add this to index 0
        l5.add('e');  // add this to index 1
        l5.add('l');  // add this to index 2
        l5.add('l'); // add this to index 3
        l5.add('o'); // add this to index 4

        // now lets print out the list
        System.out.println("l5: ");
        for(char c : l5) // go over the booleans in the array list and print them
        {
            System.out.print(c + ", "); // print to screen
        }
        System.out.println("\n"); // go down a line
    }

    public static void main(String[] args)
    {
       myObjectList();
       myIntList();
       myStringList();
       myBoolList();
       myCharList();
    }
}
