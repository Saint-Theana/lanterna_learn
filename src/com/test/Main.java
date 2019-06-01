package com.test;
import java.io.*;
import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.screen.*;
import com.googlecode.lanterna.*;
/*
 * Jexer - Java Text User Interface
 *
 * The MIT License (MIT)
 *
 * Copyright (C) 2019 Kevin Lamonte
 *
 * Permission is hereby granted, free of charge, to any person obtaining a
 * copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 *
 * @author Kevin Lamonte [kevin.lamonte@gmail.com]
 * @version 1
 */


import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.ThreadLocalRandom;
import com.googlecode.lanterna.gui2.*;
import java.util.*;
import com.googlecode.lanterna.gui2.dialogs.*;
import com.googlecode.lanterna.terminal.ansi.*;
import com.googlecode.lanterna.graphics.*;
import com.googlecode.lanterna.input.*;


/*
 More tutorials here:
 https://github.com/mabe02/lanterna/tree/master/src/test/java/com/googlecode/lanterna/tutorial
 https://code.google.com/archive/p/lanterna/wikis/UsingTerminal.wiki
 https://code.google.com/archive/p/lanterna/wikis/UsingScreen.wiki
 */
public class Main {
	
     public static void main(String i[]) {
		Terminal term = null;
			
			Screen screen = null;
			try {

				term = new UnixTerminal();
				screen = new TerminalScreen(term);
				screen.startScreen();
				
				
				
				
				
				
				WindowBasedTextGUI textGUI = new MultiWindowTextGUI(screen);
				
				/*LoginWindow loginwindow = new LoginWindow("登录");
				textGUI.addWindow(loginwindow);
			
				
				
				loginwindow.waitUntilClosed();
				*/
				Window friendlistwindow = new FriendListWindow("Friend List");
				Window grouplistwindow = new GroupListWindow("Group List");
				Window chatwindow = new ChatWindow("Chat");
				
				LogOutPutWindow logoutputwindow = new LogOutPutWindow("Log");
				
				
				
				Panel contentPanel = new Panel(new GridLayout(2)); // can hold multiple sub-components that will be added to a window
				//contentPanel.setPreferredSize(term.getTerminalSize());
				Panel contentPanel2 = new Panel(new GridLayout(2)); // can hold multiple sub-components that will be added to a window
				TerminalSize size = screen.getTerminalSize();
				
				
				friendlistwindow.setSize(new TerminalSize(size.getColumns()/3-2,size.getRows()/2-2));
			    grouplistwindow.setSize(new TerminalSize(size.getColumns()/3-2,size.getRows()/2-2));
				chatwindow.setSize(new TerminalSize(size.getColumns()/3-2,size.getRows()/2-2));
				logoutputwindow.setSize(new TerminalSize(size.getColumns()-2,size.getRows()/2-2));
				logoutputwindow.setlogsize(new TerminalSize(size.getColumns()-3,size.getRows()/2-3));
				
			    textGUI.addWindow(friendlistwindow);
				textGUI.addWindow(grouplistwindow);
				textGUI.addWindow(chatwindow);
				textGUI.addWindow(logoutputwindow);
				textGUI.setActiveWindow(friendlistwindow);
				
				friendlistwindow.setPosition(new TerminalPosition(0,0));
				grouplistwindow.setPosition(new TerminalPosition(size.getColumns()/3,0));
				chatwindow.setPosition(new TerminalPosition((size.getColumns()/3)*2,0));
				logoutputwindow.setPosition(new TerminalPosition(0,size.getRows()/2));
			
				
			   friendlistwindow.waitUntilClosed();
				
				
				//window2.waitUntilClosed();
				
		
				
				
				//exit
				

			} catch (IOException e) {
				
				e.printStackTrace();
			}
			}
			
		

	

	}
