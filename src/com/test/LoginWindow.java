package com.test;
import com.googlecode.lanterna.gui2.*;
import java.util.*;

public class LoginWindow extends BasicWindow
{

	private Panel contentPanel;

	private TextBox textbox;
	
	public LoginWindow(String title){
		super(title);
		this.setHints(Arrays.asList(Window.Hint.FULL_SCREEN,Window.Hint.NO_POST_RENDERING));
		
		
		this.contentPanel = new Panel(new GridLayout(2)); // can hold multiple sub-components that will be added to a window
		this.textbox = new TextBox();
		contentPanel.addComponent(new Label("QQ"));
		this.contentPanel.addComponent(this.textbox).setLayoutData(GridLayout.createLayoutData(GridLayout.Alignment.END, GridLayout.Alignment.CENTER));

		this.setComponent(contentPanel);
		
	}
	
	
	
	
}
