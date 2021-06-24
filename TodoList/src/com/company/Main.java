package com.company;

import java.util.Scanner;

public class Main {
	
	private static Scanner sc = new Scanner(System.in);
	private static TodoFunction myTodoList = new TodoFunction();

	public static void main(String[] args) {
		
		int command = 0;
		boolean exit = false;
		
		printCommand();
		
		while (!exit) {
			System.out.println("Enter your command/choices: ");
			command = sc.nextInt();
			sc.nextLine();
			
			switch (command) {
			case 0:
				printCommand();
				break;
				
			case 1:
				myTodoList.printTodoList();
				break;
				
			case 2:
				addItem();
				break;
				
			case 3: 
				updateItem();
				break;
				
			case 4:
				removeItem();
				break;
				
			case 5:
				searchItem();
				break;
				
			case 6:
				exit = true;
				break;
				
				default: System.out.println("Please pick only from given command");
			}
			
		}

	}
	
	public static void printCommand() {
		System.out.println("\n Press 0: To print instructions" + 
	                       "\n Press 1: To print all list" + 
				           "\n Press 2: To add list in Todo" + 
	                       "\n Press 3: To mofidy item in Todo" +
				           "\n Press 4: To remove item from Todo" + 
	                       "\n Press 5: To search an Item from Todo" +
				           "\n Press 6: To exit the app");
	}
	
	public static void addItem() {
		System.out.println("Enter item to be added in todo list:" ); 
	         myTodoList.addItem(sc.nextLine());
	}
	
	public static void updateItem() {
		System.out.println("Enter the item number: ");
		int index = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter new item to be added: ");
		String myNewItem = sc.nextLine();
		myTodoList.updateTodo(index -1, myNewItem);
	}
	
	public static void removeItem() {
		System.out.println("Enter the item number to be deleted: ");
		int index = sc.nextInt();
		sc.nextLine();
		myTodoList.removeItem(index -1);
	}
	
	public static void searchItem() {
		System.out.println("Enter a string to be searched: ");
		String searchItem = sc.nextLine();
		
		if (myTodoList.findItem(searchItem) == null) {
			System.out.println("Item not found in your todo list");
		}else {
			System.out.println(searchItem + " was found in your search item");
		}
	}

}

