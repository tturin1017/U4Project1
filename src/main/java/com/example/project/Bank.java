package com.example.project;
import java.util.Scanner;

public class Bank {
    //INSTANCE VARIABLES
    //Declare a private BankAccount class variable called "savingsAccount"
    //Declare a private BankAccount class variable called "checkingAccount"


    // CONSTRUCTOR
    //you need a constructor with no paramters
    // initializes the instance variables with the initial balances stated in project document

    //GETTER METHODS 
    //getter method for "savingsAccount" instance variable. Name it "getSavingsAccount"

    //getter method for "checkingAccount" instance variable. Name it "getCheckingAccount"


    //PUBLIC VOID RUN() METHOD
    /**
     * If a user wants to make a deposit, they must enter "1"
     * If a user wants to make a withdraw, they must enter "2"
     * If a user wants to check their balance, they must enter "3"
     * If a user wants to exit the program, they must enter "4"
     */
    public void run() {   
    }

    // METHOD deposit(Scanner scanner) and withdraw(Scanner scanner)
    //deposit(Scanner scanner) handles what happens with the deposit amount and what account it should be deposited to
    //withdraw(Scanner scanner) handles what happend with the withdraw ammount and what account it should be deposited to
    /* IMPORTANT....
     * After the user inputs an amount, they should be prompted to choose SAVINGS ACCOUNT
     * The user MUST input "yes" or "no" <--the tests won't work if you don't use these inputs
     * If they enter, "no", they should be prompted to choose CHECKING ACCOUNT
     * **Note if they enter "no" for BOTH PROMPTS (choose savings, choose checking), 
     * they should be brought back to the main menu
     * Please refer back to the videos!
     */
    public void deposit(Scanner scanner) {
    }

    // Method for withdrawals

    public void withdraw(Scanner scanner) {
    }

    //you should create additional methods that allow you to re-use code. Suggestions below:
    //a checkBalance method, chooseAccountType method, etc.

    
}