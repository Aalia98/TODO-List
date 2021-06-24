package com.company;

import java.util.ArrayList;

public class TodoFunction {

	private ArrayList<String> todoList = new ArrayList<String>();
	
	//Add list item
	
	public void addItem(String item) {
		todoList.add(item);
	}
	
	//remove list item
	
	public void removeItem(int index) {
		String myItem = todoList.get(index);
		todoList.remove(index);
	}
	
	//print the entire list
	
	public void printTodoList() {
		System.out.println("Todo list consists of :" + todoList.size());
		
		for (int i = 0; i < todoList.size(); i++) {
			System.out.println("Item at positon " + (i + 1) + " is " + todoList.get(i));
		}
	}
	
	//Update the list
	
	public void updateTodo(int index, String list) {
		todoList.set(index, list);
		System.out.println("Updation completed at position" + index + 1);
	}
	
	//Search features for user
	
	public String findItem( String searchItem) {
		int index = todoList.indexOf(searchItem);
		
		if (index == -1) {
			return null;
		}else {
			return todoList.get(index);
		}
	}
}
