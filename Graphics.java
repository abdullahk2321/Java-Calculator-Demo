import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Graphics{
    public String n1,n2;
   public static int count;
   void graph(){
    Button b1 = new Button("+");

    JFrame f = new JFrame("Calculator (Early Demo)");

    JLabel result = new JLabel("Result...\n ");
    result.setFont(new Font("Arial", Font.BOLD,30));

    f.add(result);
    JPanel panel = new JPanel();
    panel.setBackground(Color.LIGHT_GRAY);
     f.add(panel);
    JLabel label = new JLabel("Press this for Addition");
    label.setForeground(Color.BLACK);
    TextField field = new TextField(50);
    field.setBackground(Color.DARK_GRAY);
    field.setForeground(Color.WHITE);
    
    f.add(field);
    field.setFont(new Font("Arial", Font.PLAIN,25));
   
    f.add(b1);
    b1.setBackground(Color.DARK_GRAY);
    b1.setForeground(Color.WHITE);
    b1.setFont(new Font("Arial", Font.PLAIN,30));


    Button b2 = new Button("-");
    JLabel agelabel = new JLabel("Press This for Subtraction");
   
    agelabel.setForeground(Color.BLACK);
    agelabel.setSize(100, 30);
    TextField age = new TextField(50);
    age.setFont(new Font("Arial", Font.PLAIN,25));
    age.setBackground(Color.DARK_GRAY);
    age.setForeground(Color.WHITE);
    f.add(age);
    f.add(b2);
     b2.setBackground(Color.DARK_GRAY);
    b2.setForeground(Color.WHITE);
b2.addActionListener(new ActionListener() {
        public  void actionPerformed(ActionEvent e){
           String s1 = field.getText();
         String s2 = age.getText();
         float a =  Float.parseFloat(s1);
         float b = Float.parseFloat(s2);
          result.setText( "" + (a-b));
             
        }
    });



    b1.addActionListener(new ActionListener() {
        public  void actionPerformed(ActionEvent e){
         String s1 = field.getText();
         String s2 = age.getText();
         float a =  Float.parseFloat(s1);
         float b = Float.parseFloat(s2);
          result.setText(""  + (a+b) );
             
        }
    });
   

   Button uniButton = new Button("*");
   
    JLabel unilabel = new JLabel("Press This For Multiplication");
    unilabel.setForeground(Color.black);
   f.add(unilabel);
    f.add(uniButton);
     f.add(agelabel);
     f.add(b2);
     f.add(label);
     f.add(b1);
     
     uniButton.setBackground(Color.DARK_GRAY);
    uniButton.setForeground(Color.WHITE);
    uniButton.addActionListener(new ActionListener() {
        public  void actionPerformed(ActionEvent e){
           String s1 = field.getText();
         String s2 = age.getText();
         float a =  Float.parseFloat(s1);
         float b = Float.parseFloat(s2);
          result.setText("" + (a*b) );
             
        }
    });


    Button b4 = new Button("/");
    JLabel cgpalabel = new JLabel("Press this to Divide ");
    cgpalabel.setForeground(Color.BLACK);
  
    f.add(cgpalabel);
    f.add(b4);
     b4.setBackground(Color.DARK_GRAY);
    b4.setForeground(Color.WHITE);

    b4.addActionListener(new ActionListener() {
        public  void actionPerformed(ActionEvent e){
         String s1 = field.getText();
         String s2 = age.getText();
         float a =  Float.parseFloat(s1);
        float b = Float.parseFloat(s2);
          result.setText(""  + (a/b) );
             
        }
    });

    Button b3 = new Button("C");
    JLabel deptlabel = new JLabel("Press to Clear the Screen");
    f.add(deptlabel);
    deptlabel.setForeground(Color.BLACK);

    b3.addActionListener(new ActionListener() {
        public  void actionPerformed(ActionEvent e){
          result.setText("" );
        }
    });

    f.add(b3);
     b3.setBackground(Color.DARK_GRAY);
    b3.setForeground(Color.WHITE);
    

    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
    f.setSize(500,500);
    f.setBounds(570, 170, 500, 500);
    f.getContentPane().setBackground(Color.LIGHT_GRAY);
    f.setLayout(new GridLayout(7,2));
    b2.setFont(new Font("Arial", Font.PLAIN,30));
    b3.setFont(new Font("Arial", Font.PLAIN,25));
    b4.setFont(new Font("Arial", Font.PLAIN,30));
    uniButton.setFont(new Font("Arial", Font.PLAIN,27));
    
    
f.setResizable(false);


}
}