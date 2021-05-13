import javax.swing.*;
import javax.swing.event.*;

public class CheckBox extends JFrame implements ChangeListener{ //ChangeListener->se usa cuando usamos un CHECKBOX
  //Declaramos los componentes, botones, en este caso CheckBox que se desees usar en la interfaz
  private JCheckBox check1;
  private JCheckBox check2;
  private JCheckBox check3;

  //Diseño de botones (en este caso checkbox), mediante el constructor
  public CheckBox(){
     setLayout(null);
     
     check1 = new JCheckBox("Inglés");
     check1.setBounds(10,10,150,30);
     check1.addChangeListener(this);
     add(check1);

     check2 = new JCheckBox("Francés");
     check2.setBounds(10,50,150,30);
     check2.addChangeListener(this);
     add(check2);

     check3 = new JCheckBox("Alemán");
     check3.setBounds(10,90,150,30);
     check3.addChangeListener(this);
     add(check3);
  }
//Programando eventos
  public void stateChanged(ChangeEvent e){
    String texto1 = "";
    if(check1.isSelected() == true){
      texto1 = texto1 + "Ingles-";
    }
    if(check2.isSelected() == true){
        texto1 = texto1 + "Frances-";
    }
    if(check3.isSelected() == true){
        texto1 = texto1 + "Aleman-";
    }
    setTitle(texto1);
  }

  //programando interfaz gráfica del formulario
  public static void main(String args[]){
    CheckBox form = new CheckBox();
    form.setBounds(0,0,350,200);
    form.setResizable(false);
    form.setVisible(true);
    form.setLocationRelativeTo(null);
  }
}