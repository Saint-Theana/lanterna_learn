package com.test;
import com.googlecode.lanterna.gui2.*;
import java.util.*;
import com.googlecode.lanterna.input.*;
import com.googlecode.lanterna.*;

public class LogOutPutWindow extends BasicWindow
{

	private TextBox textbox;

	private Panel contentPanel;
	
	
	public LogOutPutWindow(String title){
		super(title);
		this.setHints(Arrays.asList(Window.Hint.FIXED_SIZE,Window.Hint.NO_POST_RENDERING));
		
		this.contentPanel = new Panel(new GridLayout(2)); // can hold multiple sub-components that will be added to a window
		this.textbox = new TextBox();
	
		this.contentPanel.addComponent(this.textbox);
		
		
		this.setComponent(contentPanel);
		
		
	}
	
	public void setlogsize(TerminalSize size){
		this.textbox.setPreferredSize(size);
		this.print("uhdudbdh");
		this.print("uxjxnxuxnu");
		this.print("ihhh644788tty7hg6yg");
		this.print("ughv");
		this.print("644788tty7hg6yg");
		this.print("644788tty7hg6yg");
		this.print("644788tty7hg6yg");
		this.print("644788tty7hg6yg");
		this.print("644788tty7hg6yg");
		this.print("644788tty7hg6yg");
		this.print("644788tty7hg6yg");
		this.print("644788tty7hg6yg");
		this.print("644788tty7hg6yg");
		this.print("644788tty7hg6yg");
		this.print("jdudhduh");
		this.print("644788tty7hg6yg");
		this.print("hdudhy");
		this.print("644788tty7hg6yg");
		this.print("hd7hdydb");
		this.print("644788tty7hg6yg");
		this.print("gdyhs");
		this.print("644788tty7hg6yg");
		this.print("644788tty7hg6yg");
		this.print("ifjdhdb");
		this.print("644788tty7hg6yg");
		this.print("644788tty7hg6yg");
		this.print("");
		
		
	}
	
	synchronized public void print(String text){
		this.textbox.addLine(text);
		this.handleInput(new KeyStroke(KeyType.ArrowDown));
	}
	
	

}
