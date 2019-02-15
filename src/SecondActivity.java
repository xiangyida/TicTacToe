import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class SecondActivity extends JFrame{
    public TextField textField01;
    public TextField textField02;
    private JButton jButton;
    public String iP;
    public String port;
    private JComboBox<String>faceCombo;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        String path = "image/img01.PNG";
        // 背景图片
        ImageIcon background = new ImageIcon(path);
        // 把背景图片显示在一个标签里面
        JLabel label = new JLabel(background);
        // 把标签的大小位置设置为图片刚好填充整个面板
        label.setBounds(0, 0, this.getWidth(), this.getHeight());
        // 把内容窗格转化为JPanel，否则不能用方法setOpaque()来使内容窗格透明
        JPanel imagePanel = (JPanel) this.getContentPane();
        imagePanel.setOpaque(false);
        // 把背景图片添加到分层窗格的最底层作为背景
       this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));

    }

    public SecondActivity(){
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(700,500);
        textField01=new TextField("IP地址",20);
        faceCombo=new JComboBox<>();
        faceCombo.addItem("我方先行");
        faceCombo.addItem("敌方先行");
        jButton=new JButton("开始游戏");
        JButton jButton1=new JButton("查看本机IP");
        textField01.setBounds(200,200,200,25);
        faceCombo.setBounds(200,250,150,25);
        faceCombo.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
              GameActivity.signal=faceCombo.getSelectedIndex();
            }
        });
        jButton1.setBounds(200,300,200,25);
        jButton.setBounds(220,400,150,25);
        this.add(faceCombo);
        this.add(jButton);
        this.add(textField01);
        this.add(jButton1);
         jButton1.addMouseListener(new MouseListener() {
             @Override
             public void mouseClicked(MouseEvent e) {
                 showIp();
             }

             @Override
             public void mousePressed(MouseEvent e) {

             }

             @Override
             public void mouseReleased(MouseEvent e) {

             }

             @Override
             public void mouseEntered(MouseEvent e) {

             }

             @Override
             public void mouseExited(MouseEvent e) {

             }
         });
        jButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                iP=textField01.getText();
                GameActivity.ip=iP;

                try {

                    new Thread(new GameActivity()).start();

                    dispose();
                } catch (SocketException e1) {
                    e1.printStackTrace();
                }


            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });


    }
    public void showIp(){
        InetAddress addr= null;
        try {
            addr = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        JOptionPane.showConfirmDialog(null, addr.getHostAddress(), null, JOptionPane.CLOSED_OPTION);


    }

}
