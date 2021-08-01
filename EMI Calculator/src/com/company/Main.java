package com.company;

import java.util.Objects;
import java.util.Scanner;

class EMICalculator{
    Scanner scan = new Scanner(System.in);
    double loan;
    double roi;
    double tenure;
    double emi;
    String operation;

    public void input(){
        do{
            System.out.println("Enter emi or exit");
            operation = scan.next();

            switch(operation){
                case "emi":
                    System.out.println("Enter your loan amount: ");
                    loan = scan.nextDouble();

                    System.out.println("Enter your ROI: ");
                    roi = scan.nextDouble();
                    roi = roi / (12 * 100);

                    System.out.println("Enter your tenure: ");
                    tenure = scan.nextDouble();
                    tenure *= 12;

                    emi = (loan * roi * Math.pow(1 + roi, tenure)) /
                            (Math.pow(1 + roi, tenure) - 1);

                    System.out.println("Your emi is " + emi);
                    break;

                case "exit":
                    System.exit(0);
                    break;
            }



        }while (!Objects.equals(operation, "exit"));
    }


}

public class Main {

    public static void main(String[] args) {
	    EMICalculator emiCalculator = new EMICalculator();
	    emiCalculator.input();
    }
}
