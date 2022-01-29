
package view;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class GuiLogin extends JFrame{
    
    private JTextField tflogin;
    private JLabel lblogin;
    private JLabel lbsenha;
    private JButton btLogar;
    private JButton btCancelar;
    private JPasswordField pfSenha;
    private static GuiLogin frame;
    
    public GuiLogin(){
        inicializarComponentes();
        definirEventos();
    }
    
    public void inicializarComponentes(){
        setTitle("Login no sistema");
        setBounds(0, 0, 250, 200);
        setLayout(null);
        tflogin = new JTextField(5);
        pfSenha = new JPasswordField(5);
        lblogin = new JLabel("Usuário: ");
        lbsenha = new JLabel("Senha: ");
        btLogar = new JButton("Logar");
        btCancelar = new JButton("Cancelar");
        tflogin.setBounds(100, 30, 120, 25);
        lblogin.setBounds(30, 30, 80, 25);
        lbsenha.setBounds(30, 75, 80, 25);
        pfSenha.setBounds(100, 75, 120, 25);
        btLogar.setBounds(20, 120, 100, 25);
        btCancelar.setBounds(125, 120, 100, 25);
        add(tflogin);
        add(lbsenha);
        add(lblogin);
        add(btLogar);
        add(btCancelar);
        add(pfSenha);
    }
    private void definirEventos(){
        btLogar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String senha = String.valueOf(pfSenha.getPassword());
                if(tflogin.getText().equals("java8") && senha.equals("java8")){
                    frame.setVisible(false);
                    //GuiMenuPrincipal.abrir();
                    JOptionPane.showMessageDialog(null, "Bem vindo!");
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(null, "Login ou Senha incorretas!");
                }
            }
        });
        
        btLogar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            }
        });    
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            
            public void run(){
                frame = new GuiLogin();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation((tela.width - frame.getSize().width)/2 ,
                        (tela.height - frame.getSize().height)/2);
                frame.setVisible(true);
            }
        });
    }
}
