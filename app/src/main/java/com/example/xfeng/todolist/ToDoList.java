package com.example.xfeng.todolist;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
	String title; 
	ArrayList<String> toDoListItems = new ArrayList<String>();
	
	public ToDoList(String title) {
		this.title=title;
	}
	
	public boolean checkForDuplicate(String item) {
		boolean itemInList=false;
		for (int i=0; i<toDoListItems.size();i++) {
			if (item==toDoListItems.get(i)) {
				itemInList=true;
				return itemInList;
			}
		}
		return itemInList;
		
	}
	
	public void add(String item) {
		toDoListItems.add(item);
	}
	
	public boolean delete(int itemNum) {
		if(itemNum<0 || itemNum>toDoListItems.size()) {
			return false;
		}else {
			toDoListItems.remove(itemNum-1);
			return true;
		}
	}
	
	public void rename(String newTitle) {
		title = newTitle;
	}
	
//	public static void main(String[] args) {
//		System.out.println("Enter a title for your to do list: ");
//		Scanner scanner = new Scanner(System.in);
//		String title = scanner.next();
//
//
//		ToDoList list = new ToDoList(title);
//		list.add("study");
//		list.add("go to gym");
//		System.out.println(list.checkForDuplicate("go to gym"));
//		list.add("buy food");
//		System.out.println(list.toDoListItems);
//		list.delete(6);
//		System.out.println(list.delete(6));
//		System.out.println(list.toDoListItems);
//		list.rename("List 1");
//		System.out.println(list.title);
//
//	}
}
