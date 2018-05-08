package com.example.xfeng.todolist;
import java.util.ArrayList;

public class AllLists {
	ArrayList<ToDoList> allLists = new ArrayList<ToDoList>();
	
	public boolean checkTitle(String title) {
		for (int i=0; i<allLists.size(); i++) {
			if (title.equals(allLists.get(i).title)) {
				return true;
			}
			
		}	
		return false;
	}
	
	public void addList(ToDoList newList) {
		allLists.add(newList);
	}
	
	public void deleteList(String listTitle) {
		for (int i=0; i<allLists.size(); i++) {
			if(listTitle.equals(allLists.get(i).title)) {
				allLists.remove(i);
			}
		}
	}

	public String returnAllTitles(){
		String titles = "";
		for (int i=0; i<allLists.size(); i++){
			titles = titles + allLists.get(i).title;
			titles += "\n";
		}
		return titles;
	}
	
	
}
