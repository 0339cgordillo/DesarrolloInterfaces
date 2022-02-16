import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
public class Calculadora {

	JFrame frame  = new JFrame();
	JButton boton[];
	JLabel label ;
	JPanel panel_botones;
	double op1=0,op2=0;
	String operacion="";
	boolean nueva=true;

	public Calculadora() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelPrincipal = new JPanel();
		
		panelPrincipal.setLayout(new BorderLayout());
		
		 label = new JLabel("0");
		 label.setAlignmentX(10);
		 panelPrincipal.add("North", label);
		 
	      panel_botones = new JPanel();
	      
	      panel_botones.setLayout(new GridLayout(5,4,8,8));
	      agregarBotones();
	      panelPrincipal.add("Center",panel_botones);
	      
	      frame.add(panelPrincipal);

		
	}
	private void agregarBotones() {
		boton = new JButton[20];
		boton[0]=new JButton("CE");
        boton[1]=new JButton("");
        boton[2]=new JButton("");
        boton[3]=new JButton("");
        boton[4]=new JButton("7");
        boton[5]=new JButton("8");
        boton[6]=new JButton("9");
        boton[7]=new JButton("/");
        boton[8]=new JButton("4");
        boton[9]=new JButton("5");
        boton[10]=new JButton("6");
        boton[11]=new JButton("*");
        boton[12]=new JButton("1");
        boton[13]=new JButton("2");
        boton[14]=new JButton("3");
        boton[15]=new JButton("-");
        boton[16]=new JButton("0");
        boton[17]=new JButton(".");
        boton[18]=new JButton("=");
        boton[19]=new JButton("+");
        
        for(int i=0;i<20;i++){
            panel_botones.add(boton[i]);
        }
        boton[19].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                
                    
                    label.setText("");
                    System.out.println(boton[19].getText());

            }
        });
        boton[15].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
              
                    label.setText("");
                    System.out.println(boton[15].getText());

               
            }
        });
        boton[11].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){

                System.out.println(boton[11].getText());

                    label.setText("");
               
            }
        });
        boton[7].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
               
                    label.setText("");
                    System.out.println(boton[7].getText());

                }
        });
        //NUMEROS Y PUNTO DECIMAL
        boton[4].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){label.setText("");nueva=false;}
                label.setText(label.getText()+"7");
                System.out.println(boton[4].getText());

            }
        });
        boton[5].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){label.setText("");nueva=false;}
                label.setText(label.getText()+"8");
                System.out.println(boton[5].getText());

            }
        });
        boton[6].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){label.setText("");nueva=false;}
                label.setText(label.getText()+"9");
                System.out.println(boton[6].getText());

            }
        });
        boton[8].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){label.setText("");nueva=false;}
                label.setText(label.getText()+"4");
                System.out.println(boton[8].getText());

            }
        });
        boton[9].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){label.setText("");nueva=false;}
                label.setText(label.getText()+"5");
                System.out.println(boton[9].getText());

            }
        });
        boton[10].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){label.setText("");nueva=false;}
                label.setText(label.getText()+"6");
                System.out.println(boton[10].getText());

            }
        });
        boton[12].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){label.setText("");nueva=false;}
                label.setText(label.getText()+"1");
                System.out.println(boton[12].getText());

            }
        });
        boton[13].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){label.setText("");nueva=false;}
                label.setText(label.getText()+"2");
                System.out.println(boton[13].getText());

            }
        });
        boton[14].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){label.setText("");nueva=false;}
                label.setText(label.getText()+"3");
                System.out.println(boton[14].getText());

            }
        });
        boton[16].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){label.setText("");nueva=false;}
                label.setText(label.getText()+"0");
                System.out.println(boton[16].getText());

            }
        });
        boton[17].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){label.setText("");nueva=false;}
                label.setText(label.getText()+".");
                System.out.println(boton[17].getText());

            }
        });
        //IGUAL
        boton[18].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
           
            	label.setText("");
                System.out.println(boton[18].getText());

            }
        });
        //CE
        boton[0].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
            	label.setText("");
                System.out.println(boton[0].getText());
            }
        });
	}
	
	public void iniciareVista() {
		frame.pack();
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) {

		
		Calculadora c = new Calculadora();
		c.iniciareVista();

	}

}
