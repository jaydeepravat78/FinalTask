package utility;

import java.io.InputStream;
import java.util.regex.Pattern;

import models.User;
import services.UserServiceImpl;
import services.UserService;

public class Validation {

	public static String checkName(String name) {
		if (name.isEmpty())
			return "*Name field cannot be empty\n";
		else if (!Pattern.matches("^[a-zA-Z]+$", name))
			return "*Name should only contains alphabet\n";
		else
			return "";
	}

	public static String checkEmail(String email) {
		UserService service = new UserServiceImpl();
		if (email.isEmpty())
			return "*Email should not be empty\n";
		else if (!Pattern.matches("^(.+)@(.+)$", email))
			return "*Please enter a valid email\n";
		else if (service.checkEmail(email))
			return "*Email already exists\n";
		else
			return "";
	}

	public static String checkPhone(String phone) {
		if (phone.isEmpty())
			return "*Phone should not be empty";
		else if (!Pattern.matches("[7-9][0-9]{9}", phone))
			return "*Please enter a valid phone number\n";
		else
			return "";
	}

	public static String checkLang(String[] lang) {
		if (lang == null)
			return "*Select atleast one language\n";
		else
			return "";
	}

	public static String checkGender(String gender) {
		if (gender == null)
			return "*Please select gender\n";
		else
			return "";
	}

	public static String checkGame(String game) {
		if (game.isEmpty())
			return "*Please select a game\n";
		else
			return "";
	}

	public static String checkSecQues(String secQues) {
		if (secQues.isEmpty())
			return "*Please answer this question\n";
		else
			return "";
	}

	public static String checkPassword(String Password) {
		if (Password.isEmpty())
			return "*Please enter a password";
		else if (!Pattern.matches("^[a-z0-9!@#$%^&*()_\\.\\-_]{8,30}$", Password))
			return "*Password should have minimum 8 character\n";
		else
			return "";
	}

	public static String confirmPassword(String password, String confirmPassword) {
		if (password.equals(confirmPassword))
			return "*Password doesn't match\n";
		else
			return "";
	}

	public static String checkStreet(String[] street) {
		for (int i = 0; i < street.length; i++)
			if (street[i].isEmpty())
				return "*Please enter a street\n";
		return "";
	}

	public static String checkCity(String[] city) {
		for (int i = 0; i < city.length; i++)
			if (city[i].isEmpty())
				return "*Please enter a city\n";
		return "";
	}

	public static String checkState(String[] state) {
		for (int i = 0; i < state.length; i++)
			if (state[i].isEmpty())
				return "*Please enter a state\n";
		return "";
	}

}
