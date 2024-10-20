import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class BackgroundPanel extends JPanel {
    private Image backgroundImage;

    public BackgroundPanel(String imagePath) {
        backgroundImage = new ImageIcon(imagePath).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), this);
    }
}

public class Puzzle extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    BackgroundPanel panel;

    Puzzle(){
        super("Puzzle - JavaTpoint");
        panel = new BackgroundPanel("C:/Users/Admin/Downloads/image1234.jpg"); // Replace with your image path
        panel.setLayout(null);

        b1=new JButton("1");
        b1.setBounds(50,100,40,40);
        b2=new JButton("2");
        b2.setBounds(100,100,40,40);
        b3=new JButton("3");
        b3.setBounds(150,100,40,40);
        b4=new JButton("4");
        b4.setBounds(50,150,40,40);
        b5=new JButton("5");
        b5.setBounds(100,150,40,40);
        b6=new JButton("6");
        b6.setBounds(150,150,40,40);
        b7=new JButton("7");
        b7.setBounds(50,200,40,40);
        b8=new JButton(" ");
        b8.setBounds(100,200,40,40);
        b9=new JButton("8");
        b9.setBounds(150,200,40,40);
      
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
      
        panel.add(b1);panel.add(b2);panel.add(b3);panel.add(b4);panel.add(b5);panel.add(b6);panel.add(b7);panel.add(b8);panel.add(b9);
        
        setContentPane(panel);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){  
        if(e.getSource()==b1){  
            String label=b1.getText();  
            if(b2.getText().equals("")){  
                b2.setText(label);  
                b1.setText("");  
            }  
            if(b4.getText().equals("")){  
                b4.setText(label);  
                b1.setText("");  
            }  
        }  
        if(e.getSource()==b2){  
            String label=b2.getText();  
            if(b1.getText().equals("")){  
                b1.setText(label);  
                b2.setText("");  
            }  
            if(b3.getText().equals("")){  
                b3.setText(label);  
                b2.setText("");  
            }  
            if(b5.getText().equals("")){  
                b5.setText(label);  
                b2.setText("");  
            }  
        }  
        if(e.getSource()==b3){  
        String label=b3.getLabel();  
     if(b2.getLabel().equals("")){  
            b2.setLabel(label);  
            b3.setLabel("");  
        }  
        if(b6.getLabel().equals("")){  
            b6.setLabel(label);  
            b3.setLabel("");  
        }  
    }  
    if(e.getSource()==b4){  
        String label=b4.getLabel();  
        if(b1.getLabel().equals("")){  
            b1.setLabel(label);  
            b4.setLabel("");  
        }  
        if(b7.getLabel().equals("")){  
            b7.setLabel(label);  
            b4.setLabel("");  
        }  
        if(b5.getLabel().equals("")){  
            b5.setLabel(label);  
            b4.setLabel("");  
        }  
    }  
    if(e.getSource()==b5){  
        String label=b5.getLabel();  
        if(b2.getLabel().equals("")){  
            b2.setLabel(label);  
            b5.setLabel("");  
        }  
        if(b6.getLabel().equals("")){  
            b6.setLabel(label);  
            b5.setLabel("");  
        }  
        if(b4.getLabel().equals("")){  
            b4.setLabel(label);  
            b5.setLabel("");  
        }  
        if(b8.getLabel().equals("")){  
            b8.setLabel(label);  
            b5.setLabel("");  
        }  
    }  
    if(e.getSource()==b6){  
        String label=b6.getLabel();  
        if(b9.getLabel().equals("")){  
            b9.setLabel(label);  
            b6.setLabel("");  
        }  
        if(b3.getLabel().equals("")){  
            b3.setLabel(label);  
            b6.setLabel("");  
        }  
        if(b5.getLabel().equals("")){  
            b5.setLabel(label);  
            b6.setLabel("");  
        }  
    }  
    if(e.getSource()==b7){  
        String label=b7.getLabel();  
        if(b4.getLabel().equals("")){  
            b4.setLabel(label);  
            b7.setLabel("");  
        }  
        if(b8.getLabel().equals("")){  
            b8.setLabel(label);  
            b7.setLabel("");  
        }  
    }  
    if(e.getSource()==b8){  
        String label=b8.getLabel();  
        if(b9.getLabel().equals("")){  
            b9.setLabel(label);  
            b8.setLabel("");  
        }  
        if(b7.getLabel().equals("")){  
            b7.setLabel(label);  
            b8.setLabel("");  
        }  
        if(b5.getLabel().equals("")){  
            b5.setLabel(label);  
            b8.setLabel("");  
        }  
    }  
    if(e.getSource()==b9){  
        String label=b9.getLabel();  
        if(b6.getLabel().equals("")){  
            b6.setLabel(label);  
            b9.setLabel("");  
        }  
        if(b8.getLabel().equals("")){  
            b8.setLabel(label);  
            b9.setLabel("");  
        }  
    }  
      
    //congrats code  
    if(b1.getLabel().equals("1")&&b2.getLabel().equals("2")&&b3.getLabel()    
            .equals("3")&&b4.getLabel().equals("4")&&b5.getLabel().equals("5")    
            &&b6.getLabel().equals("6")&&b7.getLabel().equals("7")&&b8.getLabel()    
            .equals("8")&&b9.getLabel().equals("")){     
            JOptionPane.showMessageDialog(this,"Congratulations! You won.");    
    }    
}  
public static void main(String[] args) {  
    new Puzzle();  
}  
}  