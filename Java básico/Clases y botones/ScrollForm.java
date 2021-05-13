import javax.swing.*;

public class ScrollForm extends JFrame{
  private JTextField textfield;
  private JScrollPane scrollpane;
  private JTextArea textarea1;

public ScrollForm{
  setLayout(null);
  textfield = new JTextField();
  textfield.setBounds(10,10,200,300);
  add(textfield);
 
  textarea1 = new JTextArea();
  scrollpane = new JScrollPane(textarea1);
  scrollpane.setBounds(10,50,400,300);
  add(scrollpane);
 }

 public static void main (String args[]){
  Formulario formulario1 = new Formulario();
  formulario1.setBounds(0,0,540,400);
  formulario1.setVisible(true);
  formulario1.setResizable(false);
  formulario1.setLocationRelativeTo(null);
 }
}