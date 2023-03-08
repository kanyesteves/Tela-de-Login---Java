import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class newLogin extends JFrame {
    private JPanel pnlLogin;
    private JButton btnEnter;
    private JPasswordField txtPasswd;
    private JTextField txtLogin;

    public newLogin() {
        initComponetns();
        createListener();

    }

    public void initComponetns() {
        setTitle("Tela de Login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlLogin);
        setVisible(true);

    }

    public void createListener() {
        btnEnter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateLogin();
            }
        });

    }

    private void validateLogin() {
        String user = txtLogin.getText();
        String passwd = new String(txtPasswd.getPassword());

        if (user.equals("admin") && passwd.equals("admin")) {

            newMenu menu = new newMenu();
            menu.setVisible(true);
            dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha incorreto !!");
        }

    }

    public static void main(String[] args) {
        newLogin teste = new newLogin();

    }
}

