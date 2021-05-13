import javax.swing.*;

public class TextoArea extends JFrame{
  private JTextField textfield1;
  private JTextArea textarea1;

  public TextoArea(){
   setLayout(null);
   textfield = new JTextField();
   textfield1.setBounds(10,10,200,30);
   add(textfield1);

  textarea1 = new JTextArea();
  textarea1.setBounds(10,50,400,300);
  add(textarea1);
 }
  public static void main (String args[]){
   TextoArea area = new area();
   area.setBounds(0,0,540,400);
   area.setVisible(true);
   area.setResizable(false);
   area.setLocationRelativeTo(null);
 }
} 