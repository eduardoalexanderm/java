import javax.swing.*;// anañadir libreria de componentes
import javax.swing.event.*; // añadir libreria de evento para JCheckBox
import java.awt.event.*;// añadir libreria de evento para Botones

/*Funcionalidad del botón de aceptar terminos: se tiene que dar clic en
el checkbox para poder dar clic en el boton "Continuar",
sólo así se activará dicho botón*/

public class AceptarTerminosBoton extends JFrame implements ActionListener, ChangeListener{
 private JLabel label1;
 private JCheckBox check1;
 private JButton boton1;

 public AceptarTerminosBoton(){
     setLayout(null);
     
     label1 = new JLabel("Aceptar terminos y condiciones.");
     label1.setBounds(10,10,400,30);
     add(label1);

     check1 = new JCheckBox("Acepto");
     check1.setBounds(10,50,100,30);
     check1.addChangeListener(this);
     add(check1);

     boton1 = new JButton("Continuar");
     boton1.setBounds(10,100,100,30);
     boton1.addActionListener(this);
     add(boton1);
     boton1.setEnabled(false); //con esta linea de codigo le decimos al programa que nuestro boton debe estar deshabilitado.
 }
 //Programar eventos para CheckBox
   public void stateChanged(ChangeEvent e){
     if(check1.isSelected() == true){
       boton1.setEnabled(true);
     } else{
         boton1.setEnabled(false);
     }
   }
   //Programar evento para boton
   public void actionPerformed(ActionEvent e){
     if(e.getSource() == boton1){
        System.exit(0);
     }
   }
   public static void main(String args[]){
    AceptarTerminosBoton aceptar = new AceptarTerminosBoton();
    aceptar.setBounds(0,0,350,200);
    aceptar.setResizable(false);
    aceptar.setVisible(true);  
    aceptar.setLocationRelativeTo(null);
   }
}