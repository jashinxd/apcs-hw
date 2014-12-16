import javax.swing.*;
import java.awt.*;

//Look up Java Layout Manager and Java Swing Components to learn
//more about GUIs

public class Gui1 extends JFrame implements ActionListener{

    private Container pane;
    private JButton b1,b2;
    private JLabel l;
    private JTextArea text;
    private JPanel canvas;
    
    public Gui1(){

	setTitle("My First Gui");
	setSize(600,400);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	// Main Content Pane
	pane = getContentPane();

	// Setting Pane Layout
	pane.setLayout(new FlowLayout());

	// Adding Labels
	l = new JLabel("The Label:");
	pane.add(l);

	// Adding Buttons
	b1 = new JButton("button");
	pane.add(b1);
	b2 = new JButton("exit");
	pane.add(b2);

	// Adding Textbox
	text = new JTextArea("HELLO");
	text.setColumns(40);
	text.setRows(10);
	text.setBorder(BorderFactory.createLineBorder(Color.red, 2));
	pane.add(text);

	//Adding new Panel to Main Panel
	canvas = new JPanel();
	canvas.setPreferredSize(new Dimension(300,300));
	canvas.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
	pane.add(canvas);
	
	/*
	pane.add(new JButton("hello1"));
	pane.add(new JButton("hello2"));
	pane.add(new JButton("hello3"));
	JPanel f2 = new JPanel();
	pane.add(f2);
	f2.setLayout(new FlowLayout());
	f2.add(new JButton("aaa"));
	f2.add(new JButton("aaa"));
	f2.add(new JButton("aaa"));
	f2.add(new JButton("aaa"));
	f2.add(new JButton("aaa"));
	f2.add(new JButton("aaa"));
	*/
    }
    public static void main(String[] args) {
	Gui1 f = new Gui1();
	f.setVisible(true);
    }
}
