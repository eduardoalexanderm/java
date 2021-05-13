import javax.swing.*;
import java.awt.event.*;

public class Calcu extends JFrame implements ActionListener{
 private JTextField texto1;
 private JTextField texto2;
 private JLabel label1;
 private JLabel label2;
 private JButton botonSum;
 private JLabel resultado;

public Calcu(){
 setLayout(null);

 label1 = new JLabel("Valor 1");
 label1.setBounds(50,5,100,30);
 add(label1);

 label2 = new JLabel("Valor 2");
 label2.setBounds(50,35,100,30);
 add(label2);

 resultado = new JLabel("Resultado: ");
 resultado.setBounds(120,80,100,30);
 add(resultado);

 texto1 = new JTextField();
 texto1.setBounds(120, 10,150,30);
 add(texto1);

 texto2 = new JTextField();
 texto2.setBounds(120,40,150,20);
 add(texto2);

 botonSum = new JButton("Sumar");
 botonSum.setBounds(10,80,100,30);
 add(botonSum);
 botonSum.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e){
  if(e.getSource() == botonSum){
   int campo1 = 0;
   int campo2 = 0;
   int resul = 0;

   campo1 = Integer.parseInt(texto1.getText());
   campo2 = Integer.parseInt(texto2.getText());

   resul = campo1 + campo2;
   
   resultado.setText("Resultado: " + resul);
  }
 }
   public static void main(String args[]){
   Calcu formulario1 = new Calcu();
   formulario1.setBounds(0,0,300,150);
   formulario1.setVisible(true);
   formulario1.setResizable(false);
   formulario1.setLocationRelativeTo(null);
 }
}
