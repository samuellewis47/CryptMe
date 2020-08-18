package crypt.security;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PasswordManager {
		
	public String passwordAbstracter(String plainPassword, Date createdOn) {
		
		try {
			String salt = ")(*-cryptMe-*)(*";
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm");
			String input = salt + plainPassword + dateFormat.format(createdOn);
			MessageDigest md = MessageDigest.getInstance("MD5"); 
			byte[] messageDigest = md.digest(input.getBytes()); 
			BigInteger no = new BigInteger(1, messageDigest); 
			StringBuilder hashtext = new StringBuilder(no.toString(16)); 
			while (hashtext.length() < 32) { 
				hashtext.append("0" + hashtext); 
			} 
			return hashtext.toString();
		} catch (NoSuchAlgorithmException e) {
			
		}
		
		return null;
	}

}
