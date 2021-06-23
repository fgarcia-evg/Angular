package Juego;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tragaperras {

	//FRAME
	JFrame jfrPrincipal=null;
	
	//PANEL
	JPanel jpnPrincipal=null;
	JPanel jpnSaldo=null;
	JPanel jpnRodillos=null;
	JPanel jpnIndice=null;
		JPanel jpnPremio0=null;
		JPanel jpnPremio1=null;
		JPanel jpnPremio2=null;
		JPanel jpnPremio3=null;
		JPanel jpnPremio4=null;
		JPanel jpnPremio5=null;
		JPanel jpnPremio6=null;
		JPanel jpnPremio7=null;
		JPanel jpnPremio8=null;
		JPanel jpnPremio9=null;
	JPanel jpnBotones=null;
	
	//TEXTFIELD
	JTextField jtxSaldo=null;
	
	//LABEL
	JLabel jblLogo=null;
	JLabel jblPremios=null;
		JLabel jblI0=null;
		JLabel jblI1=null;
		JLabel jblI2=null;
		JLabel jblI3=null;
		JLabel jblI4=null;
		JLabel jblI5=null;
		JLabel jblI6=null;
		JLabel jblI7=null;
		JLabel jblI8=null;
		JLabel jblI9=null;
		JLabel jblD0=null;
		JLabel jblD1=null;
		JLabel jblD2=null;
		JLabel jblD3=null;
		JLabel jblD4=null;
		JLabel jblD5=null;
		JLabel jblD6=null;
		JLabel jblD7=null;
		JLabel jblD8=null;
		JLabel jblD9=null;
	JLabel jblRodillo1=null;
	JLabel jblRodillo2=null;
	JLabel jblRodillo3=null;
	
	//BUTTON
	JButton jbtCobrar=null;
	JButton jbtAvance1=null;
	JButton jbtAvance2=null;
	JButton jbtAvance3=null;
	JButton jbtCinCen=null;
	JButton jbtUnEu=null;
	JButton jbtJugar=null;
	
	//FONT
	Font DSDIGITAL=null;
	
	
	//Variables Clase
	int i, n, n1, n2, n3;
	double s=0, p;
	
	//DECLARAR NUEVA FUENTE
	public Tragaperras() {

		try {
			DSDIGITAL = Font.createFont(Font.TRUETYPE_FONT, new File("../Fuente/DS-DIGI.TTF"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("../Fuente/DS-DIGI.TTF")));
		}
		catch(IOException | FontFormatException e) {
			
		}
		
		//FRAME
		jfrPrincipal=new JFrame();
		jfrPrincipal.setSize(900, 700);
		jfrPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrPrincipal.setTitle("MÁQUINA TRAGAPERRAS");
		jfrPrincipal.setLocationRelativeTo(null);
		
		//PANEL
			//PRINCIPAL
			jpnPrincipal=new JPanel();
			jpnPrincipal.setSize(900, 700);
			jpnPrincipal.setLayout(new BorderLayout(5,10));
			jpnPrincipal.setBackground(new Color(41,41,41));
			jfrPrincipal.add(jpnPrincipal);
			
			//SALDO
			jpnSaldo=new JPanel();
			jpnSaldo.setLayout(new FlowLayout(FlowLayout.LEFT,60,0));
			jpnSaldo.setBackground(new Color(41,41,41));
			jpnPrincipal.add(jpnSaldo, BorderLayout.NORTH);
			
				//LABEL
					//LOGO
					jblLogo=new JLabel();
					jblLogo.setIcon(new ImageIcon(getClass().getResource("../Logo/logo.png")));
					jpnSaldo.add(jblLogo);
			
				//TEXTFIELD
				jtxSaldo=new JTextField("JUEGA AHORA");
				jtxSaldo.setBackground(new Color(28,28,28));
				jtxSaldo.setForeground(new Color(67,251,98));
				jtxSaldo.setBounds(0, 0, 80, 20);
				jtxSaldo.setFont(new Font("DS-DIGITAL", Font.PLAIN, 35));
				jtxSaldo.setHorizontalAlignment(JTextField.CENTER);
				jtxSaldo.setPreferredSize(new Dimension(400, 40));
				jtxSaldo.setBorder(BorderFactory.createLineBorder(new Color(67,251,98), 1));
				jtxSaldo.setEditable(false);
				jpnSaldo.add(jtxSaldo);
			
			//RODILLOS
			jpnRodillos=new JPanel();
			jpnRodillos.setBackground(new Color(30,30,30));
			jpnRodillos.setBorder(BorderFactory.createLineBorder(new Color(67,251,98), 1));
			jpnRodillos.setLayout(new GridLayout(0,3,0,10));
			jpnPrincipal.add(jpnRodillos, BorderLayout.CENTER);
				//PANEL
					//RODILLO 1
					jblRodillo1=new JLabel();
					n1=(int) (Math.random()*10);
					jblRodillo1.setIcon(new ImageIcon(getClass().getResource("../Imagenes_Rodillo/"+ n1 +".png")));
					jblRodillo1.setBorder(BorderFactory.createLineBorder(new Color(67,251,98), 1));
					jpnRodillos.add(jblRodillo1);
			
					//RODILLO 2
					jblRodillo2=new JLabel();
					n2=(int) (Math.random()*10);
					jblRodillo2.setIcon(new ImageIcon(getClass().getResource("../Imagenes_Rodillo/"+ n2 +".png")));
					jblRodillo2.setBorder(BorderFactory.createLineBorder(new Color(67,251,98), 1));
					jpnRodillos.add(jblRodillo2);
			
			
					//RODILLO 3
					jblRodillo3=new JLabel();
					n3=(int) (Math.random()*10);
					jblRodillo3.setIcon(new ImageIcon(getClass().getResource("../Imagenes_Rodillo/"+ n3 +".png")));
					jblRodillo3.setBorder(BorderFactory.createLineBorder(new Color(67,251,98), 1));
					jpnRodillos.add(jblRodillo3);
			
			//INDICE
			jpnIndice=new JPanel();
			jpnIndice.setLayout(new BoxLayout(jpnIndice, BoxLayout.Y_AXIS));
			jpnIndice.setBackground(new Color(28,28,28));
			jpnIndice.setBorder(BorderFactory.createLineBorder(new Color(67,251,98), 1));
			jpnPrincipal.add(jpnIndice, BorderLayout.EAST);
					
				//PANEL
					//PREMIO 0
					jpnPremio0=new JPanel();
					jpnPremio0.setLayout(new FlowLayout(FlowLayout.LEFT,20,0));
					jpnPremio0.setBackground(new Color(28,28,28));
					jpnIndice.add(jpnPremio0);
					
						//LABEL
							//ICONO
							jblI0=new JLabel();
							jblI0.setIcon(new ImageIcon(getClass().getResource("../Imagenes_Indice/0.png")));
							jpnPremio0.add(jblI0);
							
							//DINERO
							jblD0=new JLabel("COMODIN");
							jblD0.setForeground(new Color(67,251,98));
							jblD0.setFont(new Font("DS-DIGITAL", Font.PLAIN, 30));
							jpnPremio0.add(jblD0);
					
					//PREMIO 1
					jpnPremio1=new JPanel();
					jpnPremio1.setLayout(new FlowLayout(FlowLayout.LEFT,20,0));
					jpnPremio1.setBackground(new Color(28,28,28));
					jpnIndice.add(jpnPremio1);
					
						//LABEL
							//ICONO
							jblI1=new JLabel();
							jblI1.setIcon(new ImageIcon(getClass().getResource("../Imagenes_Indice/1.png")));
							jpnPremio1.add(jblI1);
							
							//DINERO
							jblD1=new JLabel("0.20");
							jblD1.setForeground(new Color(67,251,98));
							jblD1.setFont(new Font("DS-DIGITAL", Font.PLAIN, 30));
							jpnPremio1.add(jblD1);
							
					//PREMIO 2
					jpnPremio2=new JPanel();
					jpnPremio2.setLayout(new FlowLayout(FlowLayout.LEFT,20,0));
					jpnPremio2.setBackground(new Color(28,28,28));
					jpnIndice.add(jpnPremio2);
					
						//LABEL
							//ICONO
							jblI2=new JLabel();
							jblI2.setIcon(new ImageIcon(getClass().getResource("../Imagenes_Indice/2.png")));
							jpnPremio2.add(jblI2);
							
							//DINERO
							jblD2=new JLabel("0.80");
							jblD2.setForeground(new Color(67,251,98));
							jblD2.setFont(new Font("DS-DIGITAL", Font.PLAIN, 30));
							jpnPremio2.add(jblD2);
							
					//PREMIO 3
					jpnPremio3=new JPanel();
					jpnPremio3.setLayout(new FlowLayout(FlowLayout.LEFT,20,0));
					jpnPremio3.setBackground(new Color(28,28,28));
					jpnIndice.add(jpnPremio3);
					
						//LABEL
							//ICONO
							jblI3=new JLabel();
							jblI3.setIcon(new ImageIcon(getClass().getResource("../Imagenes_Indice/3.png")));
							jpnPremio3.add(jblI3);
							
							//DINERO
							jblD3=new JLabel("1.60");
							jblD3.setForeground(new Color(67,251,98));
							jblD3.setFont(new Font("DS-DIGITAL", Font.PLAIN, 30));
							jpnPremio3.add(jblD3);
							
					//PREMIO 4
					jpnPremio4=new JPanel();
					jpnPremio4.setLayout(new FlowLayout(FlowLayout.LEFT,20,0));
					jpnPremio4.setBackground(new Color(28,28,28));
					jpnIndice.add(jpnPremio4);
					
						//LABEL
							//ICONO
							jblI4=new JLabel();
							jblI4.setIcon(new ImageIcon(getClass().getResource("../Imagenes_Indice/4.png")));
							jpnPremio4.add(jblI4);
							
							//DINERO
							jblD4=new JLabel("3.20");
							jblD4.setForeground(new Color(67,251,98));
							jblD4.setFont(new Font("DS-DIGITAL", Font.PLAIN, 30));
							jpnPremio4.add(jblD4);
							
					//PREMIO 5
					jpnPremio5=new JPanel();
					jpnPremio5.setLayout(new FlowLayout(FlowLayout.LEFT,20,0));
					jpnPremio5.setBackground(new Color(28,28,28));
					jpnIndice.add(jpnPremio5);
					
						//LABEL
							//ICONO
							jblI5=new JLabel();
							jblI5.setIcon(new ImageIcon(getClass().getResource("../Imagenes_Indice/5.png")));
							jpnPremio5.add(jblI5);
							
							//DINERO
							jblD5=new JLabel("6.40");
							jblD5.setForeground(new Color(67,251,98));
							jblD5.setFont(new Font("DS-DIGITAL", Font.PLAIN, 30));
							jpnPremio5.add(jblD5);
							
					//PREMIO 6
					jpnPremio6=new JPanel();
					jpnPremio6.setLayout(new FlowLayout(FlowLayout.LEFT,20,0));
					jpnPremio6.setBackground(new Color(28,28,28));
					jpnIndice.add(jpnPremio6);
					
						//LABEL
							//ICONO
							jblI6=new JLabel();
							jblI6.setIcon(new ImageIcon(getClass().getResource("../Imagenes_Indice/6.png")));
							jpnPremio6.add(jblI6);
							
							//DINERO
							jblD6=new JLabel("12.80");
							jblD6.setForeground(new Color(67,251,98));
							jblD6.setFont(new Font("DS-DIGITAL", Font.PLAIN, 30));
							jpnPremio6.add(jblD6);
							
					//PREMIO 7
					jpnPremio7=new JPanel();
					jpnPremio7.setLayout(new FlowLayout(FlowLayout.LEFT,20,0));
					jpnPremio7.setBackground(new Color(28,28,28));
					jpnIndice.add(jpnPremio7);
					
						//LABEL
							//ICONO
							jblI7=new JLabel();
							jblI7.setIcon(new ImageIcon(getClass().getResource("../Imagenes_Indice/7.png")));
							jpnPremio7.add(jblI7);
							
							//DINERO
							jblD7=new JLabel("25");
							jblD7.setForeground(new Color(67,251,98));
							jblD7.setFont(new Font("DS-DIGITAL", Font.PLAIN, 30));
							jpnPremio7.add(jblD7);
							
					//PREMIO 8
					jpnPremio8=new JPanel();
					jpnPremio8.setLayout(new FlowLayout(FlowLayout.LEFT,20,0));
					jpnPremio8.setBackground(new Color(28,28,28));
					jpnIndice.add(jpnPremio8);
					
						//LABEL
							//ICONO
							jblI8=new JLabel();
							jblI8.setIcon(new ImageIcon(getClass().getResource("../Imagenes_Indice/8.png")));
							jpnPremio8.add(jblI8);
							
							//DINERO
							jblD8=new JLabel("50");
							jblD8.setForeground(new Color(67,251,98));
							jblD8.setFont(new Font("DS-DIGITAL", Font.PLAIN, 30));
							jpnPremio8.add(jblD8);
							
					//PREMIO 9
					jpnPremio9=new JPanel();
					jpnPremio9.setLayout(new FlowLayout(FlowLayout.LEFT,20,0));
					jpnPremio9.setBackground(new Color(28,28,28));
					jpnIndice.add(jpnPremio9);
					
						//LABEL
							//ICONO
							jblI9=new JLabel();
							jblI9.setIcon(new ImageIcon(getClass().getResource("../Imagenes_Indice/9.png")));
							jpnPremio9.add(jblI9);
							
							//DINERO
							jblD9=new JLabel("100");
							jblD9.setForeground(new Color(67,251,98));
							jblD9.setFont(new Font("DS-DIGITAL", Font.PLAIN, 30));
							jpnPremio9.add(jblD9);
			
				
			//BOTONES
			jpnBotones=new JPanel();
			jpnBotones.setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
			jpnBotones.setBackground(new Color(41,41,41));
			jpnPrincipal.add(jpnBotones, BorderLayout.SOUTH);
			
				//BUTTON
					//COBRAR
					jbtCobrar=new JButton("COBRAR");
					jbtCobrar.setFont(new Font("Arial", Font.BOLD, 20));
					jbtCobrar.setBackground(new Color(255,118,118));
					jbtCobrar.setForeground(Color.WHITE);
					jbtCobrar.setEnabled(false);
					jpnBotones.add(jbtCobrar);
					jbtCobrar.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							cobrar();
							
						}
					});
					
					//AVANCE1
					jbtAvance1=new JButton("AVANCE 1");
					jbtAvance1.setFont(new Font("Arial", Font.BOLD, 20));
					jbtAvance1.setBackground(new Color(255,182,76));
					jbtAvance1.setForeground(Color.WHITE);
					jbtAvance1.setEnabled(false);
					jpnBotones.add(jbtAvance1);
					jbtAvance1.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							avance1();
							
						}
					});
					
					//AVANCE2
					jbtAvance2=new JButton("AVANCE 2");
					jbtAvance2.setFont(new Font("Arial", Font.BOLD, 20));
					jbtAvance2.setBackground(new Color(255,182,76));
					jbtAvance2.setForeground(Color.WHITE);
					jbtAvance2.setEnabled(false);
					jpnBotones.add(jbtAvance2);
					jbtAvance2.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							avance2();
							
						}
					});
					
					//AVANCE3
					jbtAvance3=new JButton("AVANCE 3");
					jbtAvance3.setFont(new Font("Arial", Font.BOLD, 20));
					jbtAvance3.setBackground(new Color(255,182,76));
					jbtAvance3.setForeground(Color.WHITE);
					jbtAvance3.setEnabled(false);
					jpnBotones.add(jbtAvance3);
					jbtAvance3.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							avance3();
							
						}
					});
					
					//0.50€
					jbtCinCen=new JButton("0.50€");
					jbtCinCen.setFont(new Font("Arial", Font.BOLD, 20));
					jbtCinCen.setBackground(new Color(219,209,82));
					jbtCinCen.setForeground(Color.WHITE);
					jpnBotones.add(jbtCinCen);
					jbtCinCen.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							meter05();
						}
					});
					
					//1€
					jbtUnEu=new JButton("1€");
					jbtUnEu.setFont(new Font("Arial", Font.BOLD, 20));
					jbtUnEu.setBackground(new Color(219,209,82));
					jbtUnEu.setForeground(Color.WHITE);
					jpnBotones.add(jbtUnEu);
					jbtUnEu.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							meter1();
							
						}
					});
					
					//JUGAR
					jbtJugar=new JButton("JUGAR");
					jbtJugar.setFont(new Font("Arial", Font.BOLD, 20));
					jbtJugar.setBackground(new Color(98,242,103));
					jbtJugar.setForeground(Color.WHITE);
					jpnBotones.add(jbtJugar);
					jbtJugar.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							jugar();
						}
					});
		
		jfrPrincipal.setVisible(true);
	}
	
	
	//							*****PROGRAMACIÓN*****
	
	public void cobrar() {
		s=0;
		jtxSaldo.setText("JUEGA AHORA");
		if(s==0) {
			jbtCobrar.setEnabled(false);
		}
	}
	
	public void avance1() {
		n1=(int) (Math.random()*10);
		jblRodillo1.setIcon(new ImageIcon(getClass().getResource("../Imagenes_Rodillo/"+ n1 +".png")));
		jbtAvance1.setEnabled(false);
		comprobar_premio();
	}
	
	public void avance2() {
		n2=(int) (Math.random()*10);
		jblRodillo2.setIcon(new ImageIcon(getClass().getResource("../Imagenes_Rodillo/"+ n2 +".png")));
		jbtAvance2.setEnabled(false);
		comprobar_premio();
	}
	
	public void avance3() {
		n3=(int) (Math.random()*10);
		jblRodillo3.setIcon(new ImageIcon(getClass().getResource("../Imagenes_Rodillo/"+ n3 +".png")));
		jbtAvance3.setEnabled(false);
		comprobar_premio();
	}

	public void meter05() {
		if (jtxSaldo.getText().compareTo("JUEGA AHORA")==0)jtxSaldo.setText("0");
		s=Double.parseDouble(jtxSaldo.getText());
		s+=0.5;
		jtxSaldo.setText(String.valueOf(s));
	}
	
	public void meter1() {
		if (jtxSaldo.getText().compareTo("JUEGA AHORA")==0)jtxSaldo.setText("0");
		s=Double.parseDouble(jtxSaldo.getText());
		s+=1;
		jtxSaldo.setText(String.valueOf(s));
	}
	
	public void jugar() {
		comprobar_dinero();
	}
		
		public void comprobar_dinero() {
			if (s<1) {
				JOptionPane.showMessageDialog(jpnPrincipal, "Saldo Insuficiente", "Error", JOptionPane.ERROR_MESSAGE);
				jbtCobrar.setEnabled(false);
			}else {
				s--;
				jtxSaldo.setText(String.valueOf(s));
				tirada();
				jbtCobrar.setEnabled(true);
			}
		}
		
		public void tirada() {
			
			for(i=0;i<10;i++) {
				jblRodillo1.setIcon(new ImageIcon(getClass().getResource("../Imagenes_Rodillo/"+ i +".png")));
				jblRodillo2.setIcon(new ImageIcon(getClass().getResource("../Imagenes_Rodillo/"+ i +".png")));
				jblRodillo3.setIcon(new ImageIcon(getClass().getResource("../Imagenes_Rodillo/"+ i +".png")));
			}
			n1=(int) (Math.random()*10);
			jblRodillo1.setIcon(new ImageIcon(getClass().getResource("../Imagenes_Rodillo/"+ n1 +".png")));
			n2=(int) (Math.random()*10);
			jblRodillo2.setIcon(new ImageIcon(getClass().getResource("../Imagenes_Rodillo/"+ n2 +".png")));
			n3=(int) (Math.random()*10);
			jblRodillo3.setIcon(new ImageIcon(getClass().getResource("../Imagenes_Rodillo/"+ n3 +".png")));
			comprobar_premio();
			
		}
		
			public void comprobar_premio() {
				
				if(n1==n2 && n1==n3) {
					premio();
				}else {
					if(n1==n2 && n1!=n3) {
						if(n3==0) {
							premio();
						}else {
							jbtAvance3.setEnabled(true);
						}
					}else {
						if(n1==n3 && n1!=n2) {
							if(n2==0) {
								premio();
							}else {
								jbtAvance2.setEnabled(true);
							}
						}else {
							if(n2==n3 && n2!=n1) {
								if(n1==0) {
									premio();
								}else {
									jbtAvance1.setEnabled(true);
								}
							}
						}
					}
				}
				
			}
		
			public void premio() {
				
				if(n1==0 && n2==0 && n3==0) {
					n=0;
				}else {
					if(n1!=0) {
						n=n1;
					}else {
						if(n2!=0) {
							n=n2;
						}else {
							n=n3;
						}
					}
				}
				switch(n) {
					case 0:
						s++;
						break;
					case 1:
						p=0.2;
						s+=p;
						break;
					case 2:
						p=0.8;
						s+=p;
						break;
					case 3:
						p=1.6;
						s+=p;
						break;
					case 4:
						p=3.2;
						s+=p;
						break;
					case 5:
						p=6.4;
						s+=p;
						break;
					case 6:
						p=12.8;
						s+=p;
						break;
					case 7:
						p=25;
						s+=p;
						break;
					case 8:
						p=50;
						s+=p;
						break;
					case 9:
						p=100;
						s+=p;
						break;
				}
				String premio = "Has ganado "+ (String.valueOf(p)) +"€";
				JOptionPane.showMessageDialog(jpnPrincipal, premio, "PREMIO", JOptionPane.INFORMATION_MESSAGE);
				jtxSaldo.setText(String.valueOf(s));
				
			}
	
	public void esperar() {

		try {
			Thread.sleep(100);					
		}
		catch(InterruptedException e){
			
		}
		
	}
	
	public static void main(String[] args) {
		new Tragaperras();
	}

}
