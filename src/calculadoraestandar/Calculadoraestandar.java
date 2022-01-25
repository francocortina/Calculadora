package calculadoraestandar;

//elementos del formulario
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculadoraestandar extends JFrame implements ActionListener {
	
	//Creando  nuestro formulario
	JPanel base = (JPanel) this.getContentPane();
	JTextField pantalla = new JTextField();
	
	//Creando botones
	JButton B1 = new JButton("1");
	JButton B2 = new JButton("2");
	JButton B3 = new JButton("3");
	JButton B4 = new JButton("Borrar");
	JButton B5 = new JButton("4");
	JButton B6 = new JButton("5");
	JButton B7 = new JButton("6");
	JButton B8 = new JButton("7");
	JButton B9 = new JButton("8");
	JButton B10 = new JButton("9");
	JButton Suma = new JButton("+");
	JButton Resta = new JButton("-");
	JButton Igual = new JButton("=");
	
	

	
	//le voy a dar propiedades de inicio a esa base(calculadora) dentro de un constructor}
	
	public Calculadoraestandar() {
		//propiedades del formulario
		
		
		base.setLayout(null);		//esta linea es para decirle que vamos a acomodar manuealmente los elementos
									//sino los botones no quedan donde le vamos a indicar.
		
		setSize(350,400 );		//dimesión de la ventana
		
		setTitle("Calculadota estandar"); //titulo
	
		setVisible(true);   		//hacerla visible
		
			//Propiedades de pantalla
		pantalla.setBounds(22, 8, 288, 70 );
		pantalla.setFont(new Font("tahoma",Font.BOLD,23));
		add(pantalla);
		
		
		//propiedades de Botones
		B1.setBounds(22, 83, 60, 60);
	    B1.setFont(new Font ("Calibri",Font.BOLD,20));
		add(B1);
		
		B1.addActionListener(this);//linea que dice que el boton va a estar listo para cuando se haga un click y atraparlo.
		
		
		B2.setBounds(87, 83, 60, 60);
	    B2.setFont(new Font ("Calibri",Font.BOLD,20));
		add(B2);
		B2.addActionListener(this);
		
		
		B3.setBounds(152, 83, 60, 60);
	    B3.setFont(new Font ("Calibri",Font.BOLD,20));
		add(B3);
		B3.addActionListener(this);
		
		B4.setBounds(217, 83, 80, 60);
	    B4.setFont(new Font ("Calibri",Font.BOLD,13));
		add(B4);
		B4.addActionListener(this);
		
		B5.setBounds(22, 171, 60, 60);
	    B5.setFont(new Font ("Calibri",Font.BOLD,20));
		add(B5);
		B5.addActionListener(this);
		
		B6.setBounds(87, 171, 60, 60);
	    B6.setFont(new Font ("Calibri",Font.BOLD,20));
		add(B6);
		B6.addActionListener(this);
		
		B7.setBounds(152, 171, 60, 60);
	    B7.setFont(new Font ("Calibri",Font.BOLD,20));
		add(B7);
		B7.addActionListener(this);
		
		B8.setBounds(22, 259, 60, 60);
	    B8.setFont(new Font ("Calibri",Font.BOLD,20));
		add(B8);
		B8.addActionListener(this);
		
		B9.setBounds(87, 259, 60, 60);
	    B9.setFont(new Font ("Calibri",Font.BOLD,20));
		add(B9);
		B9.addActionListener(this);
		
		B10.setBounds(152, 259, 60, 60);
	    B10.setFont(new Font ("Calibri",Font.BOLD,20));
		add(B10);
		B10.addActionListener(this);
		
		Suma.setBounds(217, 171, 80, 60);
	    Suma.setFont(new Font ("Calibri",Font.BOLD,20));
		add(Suma);
		Suma.addActionListener(this);
		
		Resta.setBounds(217, 259, 80, 60);
	    Resta.setFont(new Font ("Calibri",Font.BOLD,20));
		add(Resta);
		Resta.addActionListener(this);
		
		
		Igual.setBounds(22, 332, 278, 60);
	    Igual.setFont(new Font ("Calibri",Font.BOLD,20));
		add(Igual);
		Igual.addActionListener(this);
		
	;
		
	
		
	}

	
	
	
	

	public static void main(String[] args) {
		
		new Calculadoraestandar ();
		// TODO Auto-generated method stub

	}

	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	//e.getSource  esta preguntando si viene el boton uno poner en pantalla el 1.
		if (e.getSource()== B1){
			//primero pregunto si la pantalla esta vacía me ponga el numero 1.
			if(pantalla.getText()== "") {
			pantalla.setText("1");
			}
			//Si no esta vacía imprime lo que esta la pantalla + 1
			else {
				pantalla.setText(pantalla.getText() + "1");
				
			}
			
		}
		if (e.getSource()== B2){
			//primero pregunto si la pantalla esta vacía me ponga el numero 2.
			if(pantalla.getText()== "") {
			pantalla.setText("2");
			}
			//Si no esta vacía imprime lo que esta la pantalla + 2
			else {
				pantalla.setText(pantalla.getText() + "2");
				
			}
			
		}
		
		if (e.getSource()== B3){
			//primero pregunto si la pantalla esta vacía me ponga el numero 3.
			if(pantalla.getText()== "") {
			pantalla.setText("3");
			}
			//Si no esta vacía imprime lo que esta la pantalla + 3
			else {
				pantalla.setText(pantalla.getText() + "3");
				
			}
			
		}

		if (e.getSource()== B5){
			//primero pregunto si la pantalla esta vacía me ponga el numero 4.
			if(pantalla.getText()== "") {
			pantalla.setText("4");
			}
			//Si no esta vacía imprime lo que esta la pantalla + 4
			else {
				pantalla.setText(pantalla.getText() + "4");
				
			}
			
		}
		if (e.getSource()== B6){
			//primero pregunto si la pantalla esta vacía me ponga el numero 5.
			if(pantalla.getText()== "") {
			pantalla.setText("5");
			}
			//Si no esta vacía imprime lo que esta la pantalla + 5
			else {
				pantalla.setText(pantalla.getText() + "5");
				
			}
			
		}
		if (e.getSource()== B7){
			//primero pregunto si la pantalla esta vacía me ponga el numero 6.
			if(pantalla.getText()== "") {
			pantalla.setText("6");
			}
			//Si no esta vacía imprime lo que esta la pantalla + 6
			else {
				pantalla.setText(pantalla.getText() + "6");
				
			}
			
		}
		if (e.getSource()== B8){
			//primero pregunto si la pantalla esta vacía me ponga el numero 7.
			if(pantalla.getText()== "") {
			pantalla.setText("7");
			}
			//Si no esta vacía imprime lo que esta la pantalla + 1
			else {
				pantalla.setText(pantalla.getText() + "7");
				
			}
			
		}
		if (e.getSource()== B9){
			//primero pregunto si la pantalla esta vacía me ponga el numero 8.
			if(pantalla.getText()== "") {
			pantalla.setText("8");
			}
			//Si no esta vacía imprime lo que esta la pantalla + 8
			else {
				pantalla.setText(pantalla.getText() + "8");
				
			}
			
		}
		if (e.getSource()== B10){
			//primero pregunto si la pantalla esta vacía me ponga el numero 9.
			if(pantalla.getText()== "") {
			pantalla.setText("9");
			}
			//Si no esta vacía imprime lo que esta la pantalla + 9
			else {
				pantalla.setText(pantalla.getText() + "9");
				
			}
			
		}
		
		if (e.getSource()== Suma){
			//primero pregunto si la pantalla esta vacía me ponga el numero +.
			if(pantalla.getText()== "") {
			pantalla.setText("+");
			}
			//Si no esta vacía imprime lo que esta la pantalla + "+"
			else {
				pantalla.setText(pantalla.getText() + "+");
				
			}
			
		}
		
		if (e.getSource()== Resta){
			//primero pregunto si la pantalla esta vacía me ponga el numero -.
			if(pantalla.getText()== "") {
			pantalla.setText("-");
			}
			//Si no esta vacía imprime lo que esta la pantalla + "-"
			else {
				pantalla.setText(pantalla.getText() + "-");
				
			}
			
		}
		
		if (e.getSource()== B4){
			//si el boton es igual a borrar(B4)n borro lo que hay en la pantalla .
			pantalla.setText("");
			
			
		}
		
		
		//Boton igual
		//1- Tomar lo que esta en la pantalla
		//2- Sacar lo largo de la cadena String que se tomo
		//3- Seprar carácter por carácter para y comparar con algun operador
		//4- Al encontrar un operador tomar la cadena anterior al operador y hacer la operación.
		
		if (e.getSource()== Igual){
			//traigo lo que hay en la pantalla y lo gurado en la variable cadena
		String cadena = pantalla.getText();	
		//Saco el largo de la cadena que se guardara en una variable "largo".
		int largo= cadena.length();
		//Saco el largo para hacer un ciclo recorriendo la cadena con el for.
		for(int i=0 ; i<=largo; i++) {
			//separo caracter por caracter con el comando charAt
			char caracter = cadena.charAt(i);
			// los char van entre comilla simples ''.
			if (caracter== '+') {
				//Me va a traer la sub cadena desde la posicion 0 hasta donde corte con el operador
				String primeraparte = cadena.substring(0,i);
				//me posiciono con i+1 despues del operador y me trae lo que falta de la cadena
				String segundaparte = cadena.substring(i+1,largo);
				//no se pueden sumar string por lo que los convierto a double
				double resultado = Double.parseDouble(primeraparte)+Double.parseDouble(segundaparte);
				
				//solo puedo imprimir en pantalla tipo string por lo que vuelvo a convertirlo.
				pantalla.setText(Double.toString(resultado));
				
			}
			if (caracter== '-') {
				//Me va a traer la sub cadena desde la posicion 0 hasta donde corte con el operador
				String primeraparte = cadena.substring(0,i);
				//me posiciono con i+1 despues del operador y me trae lo que falta de la cadena
				String segundaparte = cadena.substring(i+1,largo);
				//no se pueden sumar string por lo que los convierto a double
				double resultado = Double.parseDouble(primeraparte)-Double.parseDouble(segundaparte);
				
				//solo puedo imprimir en pantalla tipo string por lo que vuelvo a convertirlo.
				pantalla.setText(Double.toString(resultado));
				
			}
		}
			
			
			
		}
		
		
		
		
		
		
		
		
	}

}
