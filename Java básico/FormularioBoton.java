import javax.swing.*;
import java.awt.event.*;

public class FormularioBoton extends JFrame implements ActionListener{ //eventos
  JButton boton1; //declarar componente a mostrar en el formulario
  public FormularioBoton(){ //metodo constructor
   setLayout(null); //poner nuestros componentes por coordenadas 
   boton1 = new JButton("Close"); //Mensaje dentro del boton
   boton1.setBounds(300,250,100,30);//dimensiones
   add(boton1);//obligacion ponerlo, sin el no funcionara
   boton1.addActionListener(this);
 }

  //programando evento
  public void actionPerformed(ActionEvent evento){
   if(evento.getSource() == boton1){
    System.exit(0);
  }
 }
  public static void main(String args[]){
   FormularioBoton botonClose = new FormularioBoton();
   botonClose.setBounds(0,0,450,350);
   botonClose.setVisible(true);
   botonClose.setResizable(false);
   botonClose.setLocationRelativeTo(null);
 }
}