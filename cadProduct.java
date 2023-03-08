import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cadProduct extends JFrame {
    private JPanel pnlCadProduto;
    private JButton btnCad;
    private JTextField txtQtdEstoque;
    private JTextField txtPreco;
    private JTextField txtDesc;
    private JTextField txtCod;


    public cadProduct() {
        createListener();
        initComponents();
    }

    public void createListener(){
        btnCad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cod = txtCod.getText();
                String description = txtDesc.getText();
                String preco = txtPreco.getText();
                String qtdEstoque = txtQtdEstoque.getText();

                JOptionPane.showMessageDialog(btnCad, "Código: " + cod + "\n"
                        +"Descrição: " + description + "\n"
                        +"Preço: " + preco + "\n"
                        +"Quantidade no estoque: " + qtdEstoque);
            }
        });
    }

    public void initComponents() {
        setTitle("Tela de Cadastro de produto");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlCadProduto);
        setVisible(true);

    }
}
