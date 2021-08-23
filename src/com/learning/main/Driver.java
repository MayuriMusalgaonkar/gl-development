package com.learning.main;

import java.util.Scanner;

import com.learning.module.Customer;
import com.learning.services.BankingServices;

public class Driver {
 
	public static void main(String[] args) {
		
		BankingServices bankingServices=new BankingServices();
		
		Customer customer1=new Customer("12345",23456,1000);
	
		
		Scanner sc=new Scanner(System.in);
		String password;
		int bankAccountNo;
		
		System.out.println("Welcom to login page");
		
		System.out.println("Welcom to login page Banking");
		System.out.println();
		System.out.println("Enter your account number");
		bankAccountNo=sc.nextInt();
		System.out.println("Enter the password");
		password=sc.next();
		
		Customer validateLogin = new Customer(password, bankAccountNo);
		  
		if (validateCustomer(validateLogin, customer1)) {
            int option =0;
            do {
                System.out.println("\n -------------------------------\n ");
                System.out.println("1. Deposit");
                System.out.println("2. WithDrawl");
                System.out.println("3. Transfer");
                System.out.println("4. Logout \n ---------------------");
                option = sc.nextInt();

                switch (option) {
                    case 1:
                    	bankingServices.deposit(customer1);
                        break;
                    case 2:
                    	bankingServices.withdrawl(customer1, "Withdraw");
                        break;
                    case 3:
                    	bankingServices.transfer(customer1, "Transfer");
                        break;
                    case 4:
                    	bankingServices.logout();
                        break;
                    default: throw new IllegalStateException("Enter valid input");

                }
            } while (option != 4);

        } else {
            System.out.println("Enter valid Login credentials");
        }
	}
		private static boolean validateCustomer(Customer loggedInCustomer,Customer customer1){
			boolean b=loggedInCustomer.getBankAccountNo()== customer1.getBankAccountNo() && loggedInCustomer.getPassword().equals(customer1.getPassword()); 
			
			return b; 
		}
	}
	

