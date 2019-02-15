import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.Random;

public class ThirdActivity extends JFrame{
    protected JButton[]buttons=new JButton[9];
    /**
     * 0 未触发
     * 1 我方触发
     * 5 敌方触发
     */
    protected int[]boom=new int[9];
    protected int judge=2;
    protected ImageIcon a;
    protected ImageIcon b;
    protected JButton jButton;
    protected JButton jButton1;
    public static  String str;

    public ThirdActivity() {
        a=new ImageIcon("image/img2.PNG");
        b=new ImageIcon("image/img3.PNG");
        this.setVisible(true);
        this.setLayout(null);
        this.setSize(800,800);
        jButton=new JButton(str);
        jButton.setBounds(240,50,200,50);
        jButton.setBackground(Color.cyan);
        jButton1=new JButton("退出");
        jButton1.setBounds(280,630,100,50);
        jButton1.setBackground(Color.BLUE);
        jButton1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                new FirstActivity();
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
        this.add(jButton1);
        this.add(jButton);

        this.setButtons();
        this.addM();

    }



    public void setButtons(){
        for(int i=0;i<9;i++){
            buttons[i]=new JButton();
        }
        buttons[0].setBounds(100,150,150,150);
        buttons[1].setBounds(260,150,150,150);
        buttons[2].setBounds(420,150,150,150);
        buttons[3].setBounds(100,310,150,150);
        buttons[4].setBounds(260,310,150,150);
        buttons[5].setBounds(420,310,150,150);
        buttons[6].setBounds(100,470,150,150);
        buttons[7].setBounds(260,470,150,150);
        buttons[8].setBounds(420,470,150,150);



    }
    public void addM(){
        for(int i=0;i<9;i++){
            int j=i;
            buttons[i].addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {
                    if(judge%2==0&&boom[j]==0){
                        buttons[j].setIcon(a);
                        boom[j]=1;
                        if(win()){
                            JOptionPane.showConfirmDialog(null, "you win", null, JOptionPane.CLOSED_OPTION);
                            judge=1;
                            boom=new int[9];
                            for(JButton jButton:buttons){
                                jButton.setIcon(null);
                            }
                        }else if(noWin()){
                            JOptionPane.showConfirmDialog(null, "和棋", null, JOptionPane.CLOSED_OPTION);
                            judge=1;
                            boom=new int[9];
                            for(JButton jButton:buttons){
                                jButton.setIcon(null);
                            }

                        }



                        judge++;

                    }

                    if(judge%2!=0){

                        computer();
                        if(win1()){
                            JOptionPane.showConfirmDialog(null, "computer win", null, JOptionPane.CLOSED_OPTION);
                            judge= 1;
                            boom=new int[9];
                            for(JButton jButton:buttons){
                                jButton.setIcon(null);
                            }
                        }


                        judge++;
                    }



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
            this.add(buttons[i]);

        }
    }
    public void computer(){
        while(true){

            Random ran = new Random();
            int a=ran.nextInt(9);
            System.out.println(a);
            if(boom[a]==0){
                System.out.println("aa");
                boom[a]=5;

                buttons[a].setIcon(b);
                repaint();
                break;
            }
        }


    }

    public boolean win() {
        if(boom[0]+boom[1]+boom[2]==3||
                boom[3]+boom[4]+boom[5]==3||
                boom[6]+boom[7]+boom[8]==3)
            return true;
        if(boom[0]+boom[3]+boom[6]==3||
                boom[1]+boom[4]+boom[7]==3||
                boom[2]+boom[5]+boom[8]==3)
            return true;
        if(boom[0]+boom[4]+boom[8]==3||
                boom[2]+boom[4]+boom[6]==3)
            return true;

        return false;
    }
    public boolean win1() {
        if(boom[0]+boom[1]+boom[2]==15||
                boom[3]+boom[4]+boom[5]==15||
                boom[6]+boom[7]+boom[8]==15)
            return true;
        if(boom[0]+boom[3]+boom[6]==15||
                boom[1]+boom[4]+boom[7]==15||
                boom[2]+boom[5]+boom[8]==15)
            return true;
        if(boom[0]+boom[4]+boom[8]==15||
                boom[2]+boom[4]+boom[6]==15)
            return true;

        return false;
    }
    public  boolean noWin() {
        for (int i : boom) {
            if (i == 0) {
                return false;
            }
        }
        return true;
    }
}
