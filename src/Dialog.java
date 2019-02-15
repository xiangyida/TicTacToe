import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Dialog extends JFrame{
    String str;
    TextField textField01;
    private JComboBox<String>faceCombo;
    public Dialog(){
        this.setVisible(true);
        this.setLayout(null);
        this.setLocation(600,550);
        this.setSize(400,300);
        textField01=new TextField("请输入你的姓名",20);
        textField01.setBounds(100,50,200,25);
        faceCombo=new JComboBox<>();
        faceCombo.addItem("普通模式");
        faceCombo.addItem("困难模式");
        JButton jButton=new JButton("开始游戏");
        jButton.setBounds(120,150,100,25);
        faceCombo.setBounds(120,80,100,25);
        jButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ThirdActivity.str=textField01.getText();
                if(faceCombo.getSelectedIndex()==0){
                    new ThirdActivity();
                }else{
                    new SixActivity();
                }

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


        this.add(textField01);
        this.add(jButton);
        this.add(faceCombo);


    }


}
