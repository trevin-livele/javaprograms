package starbucks.coffee.shop;
import java.util.Scanner;
public class Program {

    //store values user will input
    private int userPin;
    private String username;
    //Create Scanner object
    private Scanner input;
    //Create a user object
    private User user1;
    //create Array of usernames
    private String[] usernameArray =
            {"Admin","Ian","Guest"};
    //Create array of pins
    private int[] pinsArray =
            {7260,2343,1000};
    //array of fruits
    private String[] fruits =
            {"Watermelon","Mango","Apple"};
    //array of fruit prices
    private int[] fruitPrices =
            {100,50,40};
    //array of snacks
    private String[] snacks =
            {"Cookies","Biscuits","Cake"};
    //array of snack prices
    private int[] snackPrices =
            {50,30,100};
    //array of beverages
    private String[] beverages =
            {"Coffee","Soda","Tea"};
    //array of beverage prices
    private int[] beveragePrices =
            {150,70,10};

    //specify max number of elements
    private String[] userChoices = new String[100];
    private int[] userPrices = new int[100];

    //boolean to store choices
    private boolean chooseInSameCategory = false;
    private boolean chooseInDifferentCategory = false;

    //string to store choice
    private String currentCategory;

    //positioning variable
    private int pos = 0;

    //value where array has reached
    private int arrayLength = 1;

    //main method
    public static void main(String [] args){
        //Invoke default constructor
        Program mainProgram = new Program();
        //Displaying Message
        mainProgram.showWelcomeMessage();
        //Initialize input
        mainProgram.input = new Scanner(System.in);
        //Invoke User Constructor
        mainProgram.user1 = new User();
        //Try authentication
        boolean isSuccessful = mainProgram.authenticateUser();

        if(isSuccessful){
            mainProgram.firstMenu();
        }
    }
    //show welcome message
    private void showWelcomeMessage(){

        System.out.println("Welcome to Starbucks Coffee");

    }
    //authenticate user
    private boolean authenticateUser(){
        //Create boolean to have value if successful
        boolean success = false;

        //Prompt user to input username and password
        System.out.print("Kindly input Username: ");
        //intake username
        username = input.next();
        System.out.print("Kindly input Pin: ");
        //intake username
        userPin = input.nextInt();

        //store position of username
        int userPos = -1;

        for (int i = 0; i < usernameArray.length; i++) {

            if(username.equals(usernameArray[i])){
                userPos = i;
            }

        }
        //check if username is equal to pin
        if(userPos < 0){
            System.out.println("Your username was not found");
        }else{
            if (userPin == pinsArray[userPos]){
                System.out.println("Successfully Logged In");
                success = true;

                //Use setters to store values
                user1.setUsername(usernameArray[userPos]);
                user1.setUserPin(pinsArray[userPos]);

            }else{
                System.out.println("Incorrect PIN");
            }
        }

        return success;
    }
    //show first menu
    private char firstMenu(){
        //retrieve username
        String actualUser = user1.getUsername();
        System.out.println("Hi, "+actualUser);
        //Ask for choice
        System.out.print("Kindly choose one of the following:" +
                "\nA. Beverage" +
                "\nB. Snack" +
                "\nC. Fruit");
        //Waiting for input
        String choice = input.next();
        char valueToReturn = 'D';
        if(choice.length() > 1){
            System.out.println("Enter a valid choice." +
                    "Strings are not allowed.");
        }else{

            switch (choice){
                case "A":
                    valueToReturn = 'A';
                    subsequentMenu(beverages,beveragePrices,pos);
                    break;
                case "B":
                    valueToReturn = 'B';
                    subsequentMenu(snacks,snackPrices,pos);
                    break;
                case "C":
                    valueToReturn = 'C';
                    subsequentMenu(fruits,fruitPrices,pos);
                    break;
                default:
                    System.out.println("Not a valid choice");

            }
        }

        return valueToReturn;
    }
    //show any other menu
    private char subsequentMenu(String[] menuSelection,
                                int[] priceSelection,
                                int positionToFill){
        //Show available items
        System.out.println("Here are some: "+currentCategory);
        //create array of char choices
        char[] alphabet = {'A','B','C'};
        //loop for display purposes
        for (int i = 0; i < alphabet.length; i++) {
            //show menu
            System.out.println(alphabet[i] + ". " + menuSelection[i] +
                    " - " + priceSelection[i]);

        }

        //String to intake user choice
        String choice = input.next();
        char valueToReturn = 'D';
        //validate the user did in fact give a character
        if(choice.length() > 1){
            System.out.println("Pick a valid choice");
        }else{

            //int to store choice
            int another;

            //validate actual character
            switch (choice){

                case "A":
                    valueToReturn = 'A';
                    userChoices[positionToFill] = menuSelection[0];
                    userPrices[positionToFill] = priceSelection[0];
                    System.out.println("Do you want to pick another choice?");
                    another = input.nextInt();
                    if(another == 0){
                        printReceipt();
                    }else if(another == 1){
                        pos = pos + 1;
                        subsequentMenu(menuSelection,
                                priceSelection,
                                positionToFill);
                        arrayLength = arrayLength + 1;
                    }else{
                        firstMenu();
                    }
                    break;
                case "B":
                    valueToReturn = 'B';
                    userChoices[positionToFill] = menuSelection[1];
                    userPrices[positionToFill] = priceSelection[1];
                    System.out.println("Do you want to pick another choice?");
                    another = input.nextInt();
                    if(another == 0){
                        printReceipt();
                    }else if(another == 1){
                        pos = pos + 1;
                        subsequentMenu(menuSelection,
                                priceSelection,
                                positionToFill);
                        arrayLength = arrayLength + 1;
                    }else{
                        firstMenu();
                    }
                    break;
                case "C":
                    valueToReturn = 'C';
                    userChoices[positionToFill] = menuSelection[2];
                    userPrices[positionToFill] = priceSelection[2];
                    System.out.println("Do you want to pick another choice?");
                    another = input.nextInt();
                    if(another == 0){
                        printReceipt();
                    }else if(another == 1){
                        pos = pos + 1;
                        subsequentMenu(menuSelection,
                                priceSelection,
                                positionToFill);
                        arrayLength = arrayLength + 1;
                    }else{
                        firstMenu();
                    }
                    break;
                default:
                    System.out.println("You picked an invalid choice");
            }

        }

        return valueToReturn;
    }

    private void printReceipt(){
        System.out.println(user1.getUsername() + " here is your bill");
        System.out.println("----------------------");
        //total cost
        int total = 0;

        for (int i = 0; i < arrayLength; i++) {

            System.out.println((i+1) + ". " + userChoices[i] +
                    " - " + userPrices[i]);
            System.out.println("----------------------");

            total = total + userPrices[i];

        }

    }

}