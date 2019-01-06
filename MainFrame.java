import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    Container cp;
    private JLabel jlb1 = new JLabel("+");
    private JLabel jlb2 = new JLabel("+");
    private JLabel jlbpr1 = new JLabel("+");
    private JLabel jlbpr2 = new JLabel("+");
    private JLabel jlb3 = new JLabel("=");
    private JLabel jlbpr3 = new JLabel("=");
    private JLabel jlb4 = new JLabel("大卡");
    private JLabel jlbpr4 = new JLabel("元");
    private JTextArea jfa = new JTextArea();
    private JTextArea jfa1 = new JTextArea();
    private JTextArea jfa2 = new JTextArea();
    private JTextArea jfa3 = new JTextArea();
    private JTextArea jfapr1 = new JTextArea();
    private JTextArea jfapr2 = new JTextArea();
    private JTextArea jfapr3 = new JTextArea();
    private JTextArea jfapr4 = new JTextArea();
    private JButton jbtn = new JButton("結果");
    private JPanel jpnN = new JPanel(new GridLayout(1,5,50,50));
    private JPanel jpnC = new JPanel(new GridLayout(1,6,50,50));
    private JPanel jpnS = new JPanel(new GridLayout(1,6,50,50));
    private String methodStr [] = {"漢堡","炸雞","蛋餅","牛肉麵"};
    private String methodStr1 [] = {"薯條","雞塊","冰淇淋","油條"};
    private String methodStr2 [] = {"可樂","紅茶","咖啡","雪碧"};
    private JComboBox jcb = new JComboBox<String>(methodStr);
    private JComboBox jcb1 = new JComboBox<String>(methodStr1);
    private JComboBox jcb2 = new JComboBox<String>(methodStr2);
    private int num,num1;
    public MainFrame(){
        ex();
    }private void ex(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100,100,700,200);
        this.setTitle("菜單熱量計算表");
        cp = this.getContentPane();
        cp.add(jpnN,BorderLayout.NORTH);
        cp.add(jpnC,BorderLayout.CENTER);
        cp.add(jpnS,BorderLayout.SOUTH);
        jpnN.add(jcb);
        jpnN.add(jcb1);
        jpnN.add(jcb2);
        jpnN.add(jbtn);
        jpnC.add(jfa);
        jpnC.add(jlb1);
        jpnC.add(jfa1);
        jpnC.add(jlb2);
        jpnC.add(jfa2);
        jpnC.add(jlb3);
        jpnC.add(jfa3);
        jpnC.add(jlb4);
        jpnS.add(jfapr1);
        jpnS.add(jlbpr1);
        jpnS.add(jfapr2);
        jpnS.add(jlbpr2);
        jpnS.add(jfapr3);
        jpnS.add(jlbpr3);
        jpnS.add(jfapr4);
        jpnS.add(jlbpr4);
        jbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (jcb.getSelectedIndex()){
                    case 0:
                        jfa.setText(new String("100"));
                        jfapr1.setText(new String("80"));
                        break;
                    case 1:
                        jfa.setText(new String("200"));
                        jfapr1.setText(new String("100"));
                        break;
                    case 2:
                        jfa.setText(new String("300"));
                        jfapr1.setText(new String("50"));
                        break;
                    case 3:
                        jfa.setText(new String("400"));
                        jfapr1.setText(new String("99"));
                        break;
                } switch (jcb1.getSelectedIndex()){
                    case 0:
                        jfa1.setText(new String("111"));
                        jfapr2.setText(new String("70"));
                        break;
                    case 1:
                        jfa1.setText(new String("222"));
                        jfapr2.setText(new String("69"));
                        break;
                    case 2:
                        jfa1.setText(new String("333"));
                        jfapr2.setText(new String("30"));
                        break;
                    case 3:
                        jfa1.setText(new String("444"));
                        jfapr2.setText(new String("88"));
                        break;
                }switch (jcb2.getSelectedIndex()){
                    case 0:
                        jfa2.setText(new String("96"));
                        jfapr3.setText(new String("35"));
                        break;
                    case 1:
                        jfa2.setText(new String("69"));
                        jfapr3.setText(new String("20"));
                        break;
                    case 2:
                        jfa2.setText(new String("110"));
                        jfapr3.setText(new String("100"));
                        break;
                    case 3:
                        jfa2.setText(new String("87"));
                        jfapr3.setText(new String("77"));
                        break;
                }
                int a = Integer.parseInt(jfa.getText());
                int b = Integer.parseInt(jfa1.getText());
                int c = Integer.parseInt(jfa2.getText());
                int a1 = Integer.parseInt(jfapr1.getText());
                int b1 = Integer.parseInt(jfapr2.getText());
                int c1 = Integer.parseInt(jfapr3.getText());
                num = a+b+c;
                num1 = a1+b1+c1;
                String d = Integer.toString(num);
                String d1 = Integer.toString(num1);
                jfa3.setText(d);
                jfapr4.setText(d1);
                if (num>=500){
                    JOptionPane.showMessageDialog(null,"熱量過高！！！");
                }
            }
        });
    }
}