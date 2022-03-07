package ShowaFrame;
import javax.swing.JFrame;

public class ShowaFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame myframe = new JFrame();
		String mytitle = "Jorge Ayona";
		
		myframe.setTitle(mytitle);
		myframe.setSize(300,200);
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setVisible(true);

	}

}
