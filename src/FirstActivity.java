import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class FirstActivity extends JFrame {
    private JButton jButton01;
    private JButton jButton02;
    private JButton jButton03;
    private JButton jButton04;
    public FirstActivity(){
        //取消布局管理器
        this.setLayout(null);
        this.setVisible(true);
        this.setLocation(500,500);
        this.setSize(700,500);

        jButton01=new JButton("网络对战");
        jButton02=new JButton("人机对战");
        jButton03=new JButton("双人对战");
        jButton04=new JButton("帮助");
        jButton01.setBounds(200,200,200,50);
        jButton02.setBounds(200,260,200,50);
        jButton03.setBounds(200,320,200,50);
        jButton04.setBounds(450,260,100,50);
        jButton01.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new SecondActivity();
                dispose();

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
        jButton02.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Dialog();
                dispose();
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
        jButton03.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new FivethActivity();
                dispose();
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
        jButton04.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().open(new File("image/滑铁卢战役.chm"));
                } catch (IOException e1) {
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
        this.add(jButton04);
        this.add(jButton01);
        this.add(jButton02);
        this.add(jButton03);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


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
        g.setFont(new Font("宋体", Font.BOLD, 20));
        g.drawString("滑铁卢战役", 200, 120);


    }

}
