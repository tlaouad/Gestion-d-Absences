package upf.ac.ma.coucheDAO;

import java.util.Random;

public class CompteDAO {

	public CompteDAO() {
		// TODO Auto-generated constructor stub
	}
	
	String genererMotDePasse()
	{
		  String password = "";
		  
	      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();

	      password = password + lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password = password + capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password = password + specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password = password + numbers.charAt(random.nextInt(numbers.length()));
	   
	      for(int i = 4; i< 10 ; i++) {
	         password = password + combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      return password;
	}

}
