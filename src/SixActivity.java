public class SixActivity extends ThirdActivity {

    @Override
    public void computer() {
        if(computer2()){

        }else{

            computer1();
        }

    }

    public boolean computer1() {
        int k=0;
        for(int j:boom){
            k+=j;
        }
        if(k==1&&boom[4]==1){
            boom[0]=5;
            buttons[0].setIcon(b);
            return true;
        }else if(k==1&&(boom[4]==0)){
            boom[4]=5;
            buttons[4].setIcon(b);
            return true;
        }else
        if(boom[0]+boom[1]+boom[2]==2){
            for(int i=0;i<3;i++){
                if(boom[i]==0){
                    boom[i]=5;
                    buttons[i].setIcon(b);
                    return true;
                }
            }
        }else if(boom[3]+boom[4]+boom[5]==2){
            for(int i=3;i<6;i++){
                if(boom[i]==0){
                    boom[i]=5;
                    buttons[i].setIcon(b);
                    return true;
                }
            }
        }else if( boom[6]+boom[7]+boom[8]==2){
            for(int i=6;i<9;i++){
                if(boom[i]==0){
                    boom[i]=5;
                    buttons[i].setIcon(b);
                    return true;
                }
            }
        }else if(boom[0]+boom[3]+boom[6]==2){
            for(int i=0;i<9;i+=3){
                if(boom[i]==0){
                    boom[i]=5;
                    buttons[i].setIcon(b);
                    return true;
                }
            }
        }else if( boom[1]+boom[4]+boom[7]==2){
            for(int i=1;i<=7;i+=3){
                if(boom[i]==0){
                    boom[i]=5;
                    buttons[i].setIcon(b);
                    return true;
                }
            }
        }else if( boom[2]+boom[5]+boom[8]==2){
            for(int i=2;i<=8;i+=3){
                if(boom[i]==0){
                    boom[i]=5;
                    buttons[i].setIcon(b);
                    return true;
                }
            }
        }else if(boom[0]+boom[4]+boom[8]==2){
            for(int i=0;i<=8;i+=4){
                if(boom[i]==0){
                    boom[i]=5;
                    buttons[i].setIcon(b);
                    return true;
                }
            }
        }else if( boom[2]+boom[4]+boom[6]==2){
            for(int i=2;i<=6;i+=2){
                if(boom[i]==0){
                    boom[i]=5;
                    buttons[i].setIcon(b);
                    return true;
                }
            }
        }else{
            super.computer();
            return false;
        }
        return false;
    }
    public boolean computer2(){

        if(boom[0]+boom[1]+boom[2]==10){
            for(int i=0;i<3;i++){
                if(boom[i]==0){
                    boom[i]=5;
                    buttons[i].setIcon(b);
                    return true;
                }
            }
        }else if(boom[3]+boom[4]+boom[5]==10){
            for(int i=3;i<6;i++){
                if(boom[i]==0){
                    boom[i]=5;
                    buttons[i].setIcon(b);
                    return true;
                }
            }
        }else if( boom[6]+boom[7]+boom[8]==10){
            for(int i=6;i<9;i++){
                if(boom[i]==0){
                    boom[i]=5;
                    buttons[i].setIcon(b);
                    return true;
                }
            }
        }else if(boom[0]+boom[3]+boom[6]==10){
            for(int i=0;i<9;i+=3){
                if(boom[i]==0){
                    boom[i]=5;
                    buttons[i].setIcon(b);
                    return true;
                }
            }
        }else if( boom[1]+boom[4]+boom[7]==10){
            for(int i=1;i<=7;i+=3){
                if(boom[i]==0){
                    boom[i]=5;
                    buttons[i].setIcon(b);
                    return true;
                }
            }
        }else if( boom[2]+boom[5]+boom[8]==10){
            for(int i=2;i<=8;i+=3){
                if(boom[i]==0){
                    boom[i]=5;
                    buttons[i].setIcon(b);
                    return true;
                }
            }
        }else if(boom[0]+boom[4]+boom[8]==10){
            for(int i=0;i<=8;i+=4){
                if(boom[i]==0){
                    boom[i]=5;
                    buttons[i].setIcon(b);
                    return true;
                }
            }
        }else if( boom[2]+boom[4]+boom[6]==10){
            for(int i=2;i<=6;i+=2){
                if(boom[i]==0){
                    boom[i]=5;
                    buttons[i].setIcon(b);
                    return true;
                }
            }
        }else{
            return false;
        }

    return false;
    }


}
