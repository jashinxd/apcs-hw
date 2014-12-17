import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Look up Java Layout Manager and Java Swing Components to learn
//more about GUIs

public class Gui1 extends JFrame implements ActionListener{

    private Container pane;
    private JButton b1,b2,labler;
    private JLabel l;
    private JTextArea text;
    private JPanel canvas;
    private JCheckBox box;
    private int x = 10;
    private int y = 10;

    private class Canvas extends JPanel {
	public void paintComponent(Graphics g){
	    super.paintComponent(g);
	    g.setColor(Color.red);
	    g.fillOval(x,y,30,30);
	}
    }

    private class Key implements KeyListener {
	public void keyPressed (KeyEvent e){}
	public void keyReleased (KeyEvent e){}
	public void keyTyped (KeyEvent e){}
    }

    public void actionPerformed(ActionEvent e) {
	if (e.getSource() == b1) {
	    System.out.println("You Clicked Click Me!");
	    System.out.println("By the way, the text box is: " + text.getText());
	    
	} else if (e.getSource() == b2) {
	    System.out.println("Shutting Down");
	    System.exit(0);
	} else if (e.getSource() == labler) {
	    System.out.println();
	}
    }
    
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
	b1 = new JButton("Click Me");
	b1.addActionListener(this);
	pane.add(b1);
	b2 = new JButton("Exit");
	b2.addActionListener(this);
	pane.add(b2);
	labler = new JButton("Labler");
	labler.addActionListener(this);
	pane.add(labler);
	box = new JCheckBox ("box");
	box.addActionListener(this);
	pane.add(box);
	

	// Adding Textbox
	text = new JTextArea("HELLO");
	text.setColumns(40);
	text.setRows(10);
	text.setBorder(BorderFactory.createLineBorder(Color.red, 2));
	text.addKeyListener(new Key());
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
