package com.revature.util;

public class ClientMessageUtil {

	public static final ClientMessage SOMETHING_WENT_WRONG = new ClientMessage("Something went wrong");

	public static final ClientMessage REGISTRATION_SUCCESSFUL = new ClientMessage("Registration Successful");

	public static final ClientMessage CAMPAIGN_CREATED_SUCCESSFULLY = new ClientMessage("Campaign was successfully created");
	
	public static final ClientMessage LOGOUT_SUCCESSFUL = new ClientMessage("Left session successfully");
	
	public static final ClientMessage LOGOUT_UNSUCCESSFUL = new ClientMessage("No session to leave");

}
