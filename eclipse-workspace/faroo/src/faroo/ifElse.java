package faroo;
import javax.swing.JOptionPane;
public class ifElse {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String User = JOptionPane.showInputDialog("Enter your Age", "Age"); //USed the JOption library to collect user age
	//the user is a string, but my operators are number related, since im using a JOptonPame command which requires a string method 
	
	if (Integer.parseInt(User) <= 30) {
		System.out.print("User is 30 or younger");
		
		//the Integer.parsenInt is used for converting string to integer
		}
	else if(Integer.parseInt(User) > 30 && Integer.parseInt(User) < 45 ) { //another way is saying user is User >= 29 
		System.out.print("User is older than 30 but less than 45 ");
	}
	
	else if (Integer.parseInt(User) > 45 && Integer.parseInt(User) < 70){
		System.out.print("User is 45 years ");
	}
	else if (Integer.parseInt(User) == 70 || Integer.parseInt(User) == 75) {
		System.out.print("User is exactly 70 or 75 years old");
	}
	else if(Integer.parseInt(User) > 69 && Integer.parseInt(User) < 99){
		System.out.print("User is 70 years of age or older");
	}
	else {
		System.out.print("User not found");
	}
	}
	
}
