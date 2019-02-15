import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FivethActivity extends ThirdActivity {
    public FivethActivity(){
        jButton.setBounds(0,0,0,0);
       // jButton=null;
    }

    @Override
    public void addM() {
       for(int i=0;i<9;i++){
           int j=i;
           buttons[i].addMouseListener(new MouseListener() {
               @Override
               public void mouseClicked(MouseEvent e) {

               }

               @Override
               public void mousePressed(MouseEvent e) {
                   if (judge % 2 == 0 && boom[j] == 0) {
                       buttons[j].setIcon(a);
                       boom[j] = 1;
                       judge++;
                       if (win()) {
                           JOptionPane.showConfirmDialog(null, "我方胜利", null, JOptionPane.CLOSED_OPTION);
                           for (JButton jButton : buttons) {
                               jButton.setIcon(null);
                           }
                           boom = new int[9];
                           judge = 2;
                       }
                   } else if(boom[j]==0){
                       buttons[j].setIcon(b);
                       boom[j] = 5;
                       judge++;
                       if (win1()) {
                           JOptionPane.showConfirmDialog(null, "敌方胜利", null, JOptionPane.CLOSED_OPTION);
                           for (JButton jButton : buttons) {
                               jButton.setIcon(null);
                           }
                           boom = new int[9];
                           judge = 2;
                       }
                   }
                   if(noWin()){
                       JOptionPane.showConfirmDialog(null, "和棋", null, JOptionPane.CLOSED_OPTION);
                       for (JButton jButton : buttons) {
                           jButton.setIcon(null);
                       }
                       boom = new int[9];
                       judge = 2;
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
           this.add(buttons[j]);
       }

    }
}
