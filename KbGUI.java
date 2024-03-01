// import javax.swing.JFrame;
// import javax.swing.JButton;
// import javax.swing.JLabel;
// import javax.swing.JTextField;
// import javax.swing.JPanel;

// import java.awt.BorderLayout;
// import java.awt.GridLayout;
// import java.awt.FlowLayout;
// import java.awt.Color;
// import java.awt.event.ActionListener;
// import java.awt.event.ActionEvent;

// public class KbGUI extends JFrame implements ActionListener {
//    public static final int WIDTH = 400;
//    public static final int HEIGHT = 200;
//    public static final int NUMBER_OF_CHAR = 30;
   
//       private JTextFieldName name;
   
//    public static void main(String[] args) {
//       KbGUI gui = new KbGUI();
//       gui.setVisible(true);
//    }
   
//    public KbGUI() {
      
//       super("Knowledge Base");
//       setSize(WIDTH, HEIGHT);
//       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
//       setLayout(new GridLayout(2,1));
      
//       JPanel panel = new JPanel();
//       panel.setLayout(new BorderLayout());
//       panel.setBackground(Color.WHITE);
      
//       name = new JTextField(NUMBER_OF_CHAR);
//    }   

// }
// //    public KbGUI() {
// //       super("Knowledge Base");
// //       setSize(WIDTH,HEIGHT);
// //       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// //       
// //       setLayout(new BorderLayout());
// //       JLabel label1= new JLabel("first label");
// //       add(label1,BorderLayout.NORTH);
// //    }
   
   
// //    public static void main(String[] args) {
// //    JFrame window = new JFrame();
// //    window.setSize(WIDTH, HEIGHT);
// //    
// //    window.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
// //    
// //    JButton close = new JButton("Quit");
// //    EndingListener end = new EndingListener();
// //    close.addActionListener(end);
// //    window.add(close);
// //    
// //    JButton button1 = new JButton("Load a knowledge base from a file");
// //    JButton button2 = new JButton("Add a new statement to the knowledge base");
// //    JButton button3 = new JButton("Search for an item in the knowledge base by term");
// //    JButton button4 = new JButton("Search for an item in the knowlege bsae by term and sentence");
   
// //    window.add(button1);
// //    window.add(button2);
// //    window.add(button3);
// //    window.add(button4);
   
   

   
      
// //   window.setVisible(true);
   
// //   }
// //}