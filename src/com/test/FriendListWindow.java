package com.test;
import com.googlecode.lanterna.gui2.*;
import java.util.*;
import com.googlecode.lanterna.gui2.table.*;

public class FriendListWindow extends BasicWindow
{

	private Panel contentPanel;

	private Table<String> table;
	
	public FriendListWindow(String title){
		super(title);
		this.setHints(Arrays.asList(Window.Hint.FIXED_SIZE,Window.Hint.NO_POST_RENDERING));
		this.table= new Table<String>("1","2");
		
		this.table.getTableModel().addRow("1ghvyvuvyvghyvvvvgv", "2");
		this.table.getTableModel().addRow("ur`udvduc`uc`cucbcihfufhfhjduf`dudhudhh", "2");
		this.table.getTableModel().addRow("1", "2");
		
		
		this.contentPanel = new Panel(new GridLayout(2)); // can hold multiple sub-components that will be added to a windo

this.contentPanel.addComponent(this.table);
		this.setComponent(this.contentPanel);
	}
	
	
	
	
	
	
}
