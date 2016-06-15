package com.betfair.login;

public interface LoginNg {
	LoginResult login(String username, String password);
	
	LoginResult keepAlive(String sessionToken);
	
	LoginResult logout(String sessionToken);
}
