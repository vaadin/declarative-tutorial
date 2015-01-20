package com.vaadin.tutorial.declarative;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Panel;
import com.vaadin.ui.declarative.Design;

@DesignRoot
public class LoginForm extends Panel {
	private Button login;

	public LoginForm() {
		Design.read(this);
		login.addClickListener(new ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				Notification.show("Login successful!");
			}
		});

	}
}
