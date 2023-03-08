import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cadUser extends JFrame {
    private JPanel pnlCadUser;
    private JButton btnCad;
    private JTextField txtFunction;
    private JTextField txtName;
    private JTextField txtFullName;
    private JTextField txtSector;
    private JTextField txtLogin;
    private JPasswordField pwdPasswd;
    public cadUser() {
        createListener();
        initComponetns();
    }

    public void createListener() {
        btnCad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtName.getText();
                String sobrenome = txtFullName.getText();
                String setor = txtSector.getText();
                String function = txtFunction.getText();
                String login = txtLogin.getText();
                String passwd = pwdPasswd.getText();

                JOptionPane.showMessageDialog(btnCad, "Nome: " + name + " " + sobrenome + "\n"
                        +"Setor: " + setor + "\n"
                        +"Função/Cargo: " + function + "\n"
                        +"Login: " + login + "\n"
                        +"Senha: " + passwd);
            }
        });
    }

    public void initComponetns() {
        setTitle("Tela de Cadastro usuário");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlCadUser);
        setVisible(true);

    }
}
