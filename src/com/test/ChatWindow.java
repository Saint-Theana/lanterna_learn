package com.test;
import com.googlecode.lanterna.gui2.*;
import java.util.*;

public class ChatWindow extends BasicWindow
{
	
	public ChatWindow(String title){
		super(title);
		this.setHints(Arrays.asList(Window.Hint.FIXED_SIZE,Window.Hint.NO_POST_RENDERING));
	}
	
}
