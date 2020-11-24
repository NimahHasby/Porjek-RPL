import java.util.*;

public class PetCare{
	public static String username, password, pilihan, user, pass, cPass;
	public static Scanner input = new Scanner(System.in);
	public static HashMap<String, String> database = new HashMap<String,String>();

	public static void main(String[] args) {
		menuAwal();
	}

	public static void menuAwal(){
		System.out.println("\t*** PetCare Store ***");
		System.out.println("\tLogin");
		System.out.println("\tSignUp");
		System.out.print("Choose your choice: ");
		pilihan = input.next();
		if(pilihan.equalsIgnoreCase("Login")){
			menuLogin();
		}else if(pilihan.equalsIgnoreCase("SignUp")){
			menuSignUp();
		}else{
			System.out.println("Tidak ada pilihan yang tepat");
			menuAwal();
		}
	}

	public static void menuLogin(){
		System.out.println("################ Welcome to Login PetCare ################");
		System.out.print("Username: ");
		user = input.next();
		System.out.print("Password: ");
		pass = input.next();

	}

	public static void menuSignUp(){
		System.out.println("################ Welcome to SignUp PetCare ################");
		System.out.print("Username: ");
		user = input.next();
		System.out.print("Password: ");
		pass = input.next();
		System.out.print("Confirm Password: ");
		cPass = input.next();
		if(!pass.equalsIgnoreCase(cPass)){
			System.out.println("password yang anda masukan tidak sama");
			menuSignUp();
		}else{
			try{
				System.out.println("SignUp berhasil!!!");
				database.put(user, pass);
				menuLogin();
        	}catch(Exception e){
            System.out.println("User tidak boleh sama");
        	}	
		}
		
	}
}