import javax.swing.*;

public class CalculatorView extends JFrame {

    JTextField txtNum1;
    JTextField txtNum2;
    JTextField txtResult;

    JButton btnAdd;
    JButton btnSub;
    JButton btnMul;
    JButton btnDiv;

    public CalculatorView() {

        setTitle("MVC Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblNum1 = new JLabel("First Number:");
        lblNum1.setBounds(30, 30, 120, 25);
        add(lblNum1);

        txtNum1 = new JTextField();
        txtNum1.setBounds(160, 30, 180, 25);
        add(txtNum1);

        JLabel lblNum2 = new JLabel("Second Number:");
        lblNum2.setBounds(30, 70, 120, 25);
        add(lblNum2);

        txtNum2 = new JTextField();
        txtNum2.setBounds(160, 70, 180, 25);
        add(txtNum2);

        btnAdd = new JButton("+");
        btnAdd.setBounds(30, 120, 65, 35);
        add(btnAdd);

        btnSub = new JButton("-");
        btnSub.setBounds(110, 120, 65, 35);
        add(btnSub);

        btnMul = new JButton("*");
        btnMul.setBounds(190, 120, 65, 35);
        add(btnMul);

        btnDiv = new JButton("/");
        btnDiv.setBounds(270, 120, 65, 35);
        add(btnDiv);

        JLabel lblResult = new JLabel("Result:");
        lblResult.setBounds(30, 180, 120, 25);
        add(lblResult);

        txtResult = new JTextField();
        txtResult.setBounds(160, 180, 180, 25);
        txtResult.setEditable(false);
        add(txtResult);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
