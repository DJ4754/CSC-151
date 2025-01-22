import javax.swing.JOptionPane;
public class RandomGuess {
	
	public static void main(String[] args) 
	{
		System.out.println("Think of a number between one and ten");
		JOptionPane.showMessageDialog(null,"The number is "+

		(1 + (int)(Math.random() * 10)));

	}

}
