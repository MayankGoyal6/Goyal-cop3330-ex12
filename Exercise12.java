/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 12
 *  Copyright 2021 Mayank Goyal
*/

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

class Main {
  public static void main(String[] args) {
  
  Scanner scanner = new Scanner(System.in);
 
  System.out.println("Enter the principal: ");
  int principal = scanner.nextInt();

  System.out.println("Enter the rate of interest: ");
  double interestRate = scanner.nextFloat();

  System.out.println("Enter the number of years: ");
  int years = scanner.nextInt();

  double endAmount = ( principal * (1 + ((interestRate/100) * years)));

  DecimalFormat format = new DecimalFormat("0.#");

  System.out.println("After " + years + " years at " + String.format("%.1f", interestRate) + "%, the investment will be worth $" + format.format(endAmount) + ".");

  }
}