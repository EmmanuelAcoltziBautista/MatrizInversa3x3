/*
Creado por Emmanuel Acoltzi Bautista
Fecha de creacion: 31-03-2024
email: basedeemma@gmail.com
*/
package ventana;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MatrizInversa extends JFrame implements ActionListener{
    private JLabel label1,label2;
    private JButton BOTON1;
    private JTextField TEXTO1,TEXTO2,TEXTO3,TEXTO4,TEXTO5,TEXTO6,TEXTO7,TEXTO8,TEXTO9;
    private JPanel PANEL;
    private JTextArea AREA1,AREA2;
    private JScrollPane DESPLAZAR1,DESPLAZAR2;
//Costructor de la interfaz grafica
    public MatrizInversa(){
        setLayout(null);
        setTitle("Matriz");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
label1=new JLabel("Matriz inversa");
label1.setFont(new Font("Andale Mono",1,25));
label1.setForeground(new Color(255,255,255));
label1.setHorizontalAlignment(JLabel.CENTER);
label1.setBounds(0,0,900,30);
add(label1);
        






TEXTO1=new JTextField("");
TEXTO1.setFont(new Font("Andale Mono",1,17));
TEXTO1.setForeground(new Color(255,255,255));
TEXTO1.setBackground(new Color(155,155,255));
TEXTO1.setBounds(10,80,50,30);
add(TEXTO1);

TEXTO2=new JTextField("");
TEXTO2.setFont(new Font("Andale Mono",1,17));
TEXTO2.setForeground(new Color(255,255,255));
TEXTO2.setBackground(new Color(155,155,255));
TEXTO2.setBounds(80,80,50,30);
add(TEXTO2);

TEXTO3=new JTextField("");
TEXTO3.setFont(new Font("Andale Mono",1,17));
TEXTO3.setForeground(new Color(255,255,255));
TEXTO3.setBackground(new Color(155,155,255));
TEXTO3.setBounds(150,80,50,30);
add(TEXTO3);

TEXTO4=new JTextField("");
TEXTO4.setFont(new Font("Andale Mono",1,17));
TEXTO4.setForeground(new Color(255,255,255));
TEXTO4.setBackground(new Color(155,155,255));
TEXTO4.setBounds(10,130,50,30);
add(TEXTO4);

TEXTO5=new JTextField("");
TEXTO5.setFont(new Font("Andale Mono",1,17));
TEXTO5.setForeground(new Color(255,255,255));
TEXTO5.setBackground(new Color(155,155,255));
TEXTO5.setBounds(80,130,50,30);
add(TEXTO5);

TEXTO6=new JTextField("");
TEXTO6.setFont(new Font("Andale Mono",1,17));
TEXTO6.setForeground(new Color(255,255,255));
TEXTO6.setBackground(new Color(155,155,255));
TEXTO6.setBounds(150,130,50,30);
add(TEXTO6);

TEXTO7=new JTextField("");
TEXTO7.setFont(new Font("Andale Mono",1,17));
TEXTO7.setForeground(new Color(255,255,255));
TEXTO7.setBackground(new Color(155,155,255));
TEXTO7.setBounds(10,180,50,30);
add(TEXTO7);

TEXTO8=new JTextField("");
TEXTO8.setFont(new Font("Andale Mono",1,17));
TEXTO8.setForeground(new Color(255,255,255));
TEXTO8.setBackground(new Color(155,155,255));
TEXTO8.setBounds(80,180,50,30);
add(TEXTO8);

TEXTO9=new JTextField("");
TEXTO9.setFont(new Font("Andale Mono",1,17));
TEXTO9.setForeground(new Color(255,255,255));
TEXTO9.setBackground(new Color(155,155,255));
TEXTO9.setBounds(150,180,50,30);
add(TEXTO9);


BOTON1=new JButton("Inversa");
BOTON1.setFont(new Font("Andale Mono",1,17));
BOTON1.setForeground(new Color(255,255,255));
BOTON1.setBackground(new Color(155,155,255));
BOTON1.setBounds(10,230,200,30);
BOTON1.addActionListener(this);
add(BOTON1);

AREA1=new JTextArea();
AREA1.setFont(new Font("Andale Mono",1,17));
AREA1.setForeground(new Color(255,255,255));
AREA1.setBackground(new Color(155,155,255));
AREA1.setEditable(false);
DESPLAZAR1=new JScrollPane(AREA1);
DESPLAZAR1.setBounds(220,80,300,300);
add(DESPLAZAR1);

AREA2=new JTextArea();
AREA2.setForeground(new Color(255,255,255));
AREA2.setBackground(new Color(155,155,255));
AREA2.setFont(new Font("Andale Mono",1,17));
AREA2.setEditable(false);
DESPLAZAR2=new JScrollPane(AREA2);
DESPLAZAR2.setBounds(520,80,300,300);
add(DESPLAZAR2);

label2=new JLabel();
label2.setBounds(0,0,900,500);
add(label2);
//fondo de pantalla
ImageIcon im=new ImageIcon("src/ventana/1.PNG");
Icon i=new ImageIcon(im.getImage().getScaledInstance(label2.getWidth(), label2.getHeight(), Image.SCALE_DEFAULT));
label2.setIcon(i);

    
    }
    //Para el boton
@Override
public void actionPerformed(ActionEvent A){
    if(A.getSource()==BOTON1){
    //recupero los valores
        double P1=Double.parseDouble(TEXTO1.getText());
    double P2=Double.parseDouble(TEXTO2.getText());
    double P3=Double.parseDouble(TEXTO3.getText());
    double P4=Double.parseDouble(TEXTO4.getText());
    double P5=Double.parseDouble(TEXTO5.getText());
    double P6=Double.parseDouble(TEXTO6.getText());
    double P7=Double.parseDouble(TEXTO7.getText());
    double P8=Double.parseDouble(TEXTO8.getText());
    double P9=Double.parseDouble(TEXTO9.getText());
    //los envio
    Calculo C=new Calculo(P1,P2,P3,P4,P5,P6,P7,P8,P9);
    //recupero los valores
    C.Determinante();
    C.Volteo();
        C.Adjunta();
        C.Inversa();
        //los imprimo en los JTextArea
        AREA1.setText(C.Adjunta);
        AREA2.setText(C.Inversa);
    }

}
//las dimensiones de la ventana
public static void main(String args[]){
    MatrizInversa Ma=new MatrizInversa();
    Ma.setBounds(0,0,900,500);
    Ma.setVisible(true);
    Ma.setLocationRelativeTo(null);
    Ma.setResizable(true);

}    
}
