package ca.yorku.cardrush;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class test extends AppCompatActivity {
    private Button button;
    //Variable to count cardFlips
    int cardFlip=0;
    int[] compare = new int[2];
    int[] storeCount = new int[2];
    int count=0;
    int score=0;
    int ReturnedButton1=0;
    int ReturnedButton2=0;


    void makeCompare(int a, int b, int[][] setup){
        count++;
        if(count==1){
            compare[0] = setup[a][b];
        }
        if(count==2){
            compare[1] = setup[a][b];
            count=0;
        }

    }

    void score(){
        score++;
        if(score==15){
            System.out.println("YOU WIN!!!!!!!");
        }
    }

    //Function to reset pictures back to default image
    void flipDown(){
        compare[0]=0;
        compare[1]=0;
        if(ReturnedButton1 == 1){
            ImageButton button = (ImageButton) findViewById(R.id.Button1);
            button.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton1 == 2){
            ImageButton button = (ImageButton) findViewById(R.id.Button2);
            button.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton1 == 3){
            ImageButton button = (ImageButton) findViewById(R.id.Button3);
            button.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton1 == 4){
            ImageButton button = (ImageButton) findViewById(R.id.Button4);
            button.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton1 == 5){
            ImageButton button = (ImageButton) findViewById(R.id.Button5);
            button.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton1 == 6){
            ImageButton button = (ImageButton) findViewById(R.id.Button6);
            button.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton1 == 7){
            ImageButton button = (ImageButton) findViewById(R.id.Button7);
            button.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton1 == 8){
            ImageButton button = (ImageButton) findViewById(R.id.Button8);
            button.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton1 == 9){
            ImageButton button = (ImageButton) findViewById(R.id.Button9);
            button.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton1 == 10){
            ImageButton button = (ImageButton) findViewById(R.id.Button10);
            button.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton1 == 11){
            ImageButton button = (ImageButton) findViewById(R.id.Button11);
            button.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton1 == 12){
            ImageButton button = (ImageButton) findViewById(R.id.Button12);
            button.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton1 == 13){
            ImageButton button = (ImageButton) findViewById(R.id.Button13);
            button.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton1 == 14){
            ImageButton button = (ImageButton) findViewById(R.id.Button14);
            button.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton1 == 15){
            ImageButton button = (ImageButton) findViewById(R.id.Button15);
            button.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton1 == 16){
            ImageButton button = (ImageButton) findViewById(R.id.Button16);
            button.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton1 == 17){
            ImageButton button = (ImageButton) findViewById(R.id.Button17);
            button.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton1 == 18){
            ImageButton button = (ImageButton) findViewById(R.id.Button18);
            button.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton1 == 19){
            ImageButton button = (ImageButton) findViewById(R.id.Button19);
            button.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton1 == 20){
            ImageButton button = (ImageButton) findViewById(R.id.Button20);
            button.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton1 == 21){
            ImageButton button = (ImageButton) findViewById(R.id.Button21);
            button.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton1 == 22){
            ImageButton button = (ImageButton) findViewById(R.id.Button22);
            button.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton1 == 23){
            ImageButton button = (ImageButton) findViewById(R.id.Button23);
            button.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton1 == 24){
            ImageButton button = (ImageButton) findViewById(R.id.Button24);
            button.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton1 == 25){
            ImageButton button = (ImageButton) findViewById(R.id.Button25);
            button.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton1 == 26){
            ImageButton button = (ImageButton) findViewById(R.id.Button26);
            button.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton1 == 27){
            ImageButton button = (ImageButton) findViewById(R.id.Button27);
            button.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton1 == 28){
            ImageButton button = (ImageButton) findViewById(R.id.Button28);
            button.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton1 == 29){
            ImageButton button = (ImageButton) findViewById(R.id.Button29);
            button.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton1 == 30){
            ImageButton button = (ImageButton) findViewById(R.id.Button30);
            button.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 1) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button1);
            button2.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 2){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button2);
            button2.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 3){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button3);
            button2.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 4){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button4);
            button2.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 5){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button5);
            button2.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 6){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button6);
            button2.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 7){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button7);
            button2.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 8){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button8);
            button2.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 9){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button9);
            button2.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 10){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button10);
            button2.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 11) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button11);
            button2.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 12){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button12);
            button2.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 13){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button13);
            button2.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 14){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button14);
            button2.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 15){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button15);
            button2.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 16){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button16);
            button2.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 17){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button17);
            button2.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 18){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button18);
            button2.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 19){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button19);
            button2.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 20){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button20);
            button2.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 20){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button20);
            button2.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 21) {
            ImageButton button2 = (ImageButton) findViewById(R.id.Button21);
            button2.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 22){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button22);
            button2.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 23){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button23);
            button2.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 24){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button24);
            button2.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 25){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button25);
            button2.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 26){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button26);
            button2.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 27){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button27);
            button2.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 28){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button28);
            button2.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 29){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button29);
            button2.setBackgroundResource(R.drawable.unknown);
        }
        if(ReturnedButton2 == 30){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button30);
            button2.setBackgroundResource(R.drawable.unknown);
        }


    }
    void remove(){
        compare[0]=0;
        compare[1]=0;
        if(ReturnedButton1==1){
            ImageButton button = (ImageButton) findViewById(R.id.Button1);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==2){
            ImageButton button = (ImageButton) findViewById(R.id.Button2);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==3){
            ImageButton button = (ImageButton) findViewById(R.id.Button3);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==4){
            ImageButton button = (ImageButton) findViewById(R.id.Button4);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==5){
            ImageButton button = (ImageButton) findViewById(R.id.Button5);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==6){
            ImageButton button = (ImageButton) findViewById(R.id.Button6);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==7){
            ImageButton button = (ImageButton) findViewById(R.id.Button7);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==8){
            ImageButton button = (ImageButton) findViewById(R.id.Button8);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==9){
            ImageButton button = (ImageButton) findViewById(R.id.Button9);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==10){
            ImageButton button = (ImageButton) findViewById(R.id.Button10);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==11){
            ImageButton button = (ImageButton) findViewById(R.id.Button11);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==12){
            ImageButton button = (ImageButton) findViewById(R.id.Button12);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==13){
            ImageButton button = (ImageButton) findViewById(R.id.Button13);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==14){
            ImageButton button = (ImageButton) findViewById(R.id.Button14);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==15){
            ImageButton button = (ImageButton) findViewById(R.id.Button15);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==16){
            ImageButton button = (ImageButton) findViewById(R.id.Button16);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==17){
            ImageButton button = (ImageButton) findViewById(R.id.Button17);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==18){
            ImageButton button = (ImageButton) findViewById(R.id.Button18);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==19){
            ImageButton button = (ImageButton) findViewById(R.id.Button19);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==20){
            ImageButton button = (ImageButton) findViewById(R.id.Button20);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==21){
            ImageButton button = (ImageButton) findViewById(R.id.Button21);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==22){
            ImageButton button = (ImageButton) findViewById(R.id.Button22);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==23){
            ImageButton button = (ImageButton) findViewById(R.id.Button23);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==24){
            ImageButton button = (ImageButton) findViewById(R.id.Button24);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==25){
            ImageButton button = (ImageButton) findViewById(R.id.Button25);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==26){
            ImageButton button = (ImageButton) findViewById(R.id.Button26);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==27){
            ImageButton button = (ImageButton) findViewById(R.id.Button27);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==28){
            ImageButton button = (ImageButton) findViewById(R.id.Button28);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==29){
            ImageButton button = (ImageButton) findViewById(R.id.Button29);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton1==30){
            ImageButton button = (ImageButton) findViewById(R.id.Button30);
            button.setVisibility(View.GONE);
        }

        if(ReturnedButton2==1){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button1);
            button2.setVisibility(View.GONE);
        }
        if(ReturnedButton2==2){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button2);
            button2.setVisibility(View.GONE);
        }
        if(ReturnedButton2==3){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button3);
            button2.setVisibility(View.GONE);
        }
        if(ReturnedButton2==4){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button4);
            button2.setVisibility(View.GONE);
        }
        if(ReturnedButton2==5){
            ImageButton button = (ImageButton) findViewById(R.id.Button5);
            button.setVisibility(View.GONE);
        }
        if(ReturnedButton2==6){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button6);
            button2.setVisibility(View.GONE);
        }
        if(ReturnedButton2==7){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button7);
            button2.setVisibility(View.GONE);
        }
        if(ReturnedButton2==8){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button8);
            button2.setVisibility(View.GONE);
        }
        if(ReturnedButton2==9){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button9);
            button2.setVisibility(View.GONE);
        }
        if(ReturnedButton2==10){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button10);
            button2.setVisibility(View.GONE);
        }
        if(ReturnedButton2==11){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button11);
            button2.setVisibility(View.GONE);
        }
        if(ReturnedButton2==12){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button12);
            button2.setVisibility(View.GONE);
        }
        if(ReturnedButton2==13){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button13);
            button2.setVisibility(View.GONE);
        }
        if(ReturnedButton2==14){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button14);
            button2.setVisibility(View.GONE);
        }
        if(ReturnedButton2==15){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button15);
            button2.setVisibility(View.GONE);
        }
        if(ReturnedButton2==16){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button16);
            button2.setVisibility(View.GONE);
        }
        if(ReturnedButton2==17){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button17);
            button2.setVisibility(View.GONE);
        }
        if(ReturnedButton2==18){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button18);
            button2.setVisibility(View.GONE);
        }
        if(ReturnedButton2==19){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button19);
            button2.setVisibility(View.GONE);
        }
        if(ReturnedButton2==20){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button20);
            button2.setVisibility(View.GONE);
        }
        if(ReturnedButton2==21){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button21);
            button2.setVisibility(View.GONE);
        }
        if(ReturnedButton2==22){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button22);
            button2.setVisibility(View.GONE);
        }
        if(ReturnedButton2==23){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button23);
            button2.setVisibility(View.GONE);
        }
        if(ReturnedButton2==24){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button24);
            button2.setVisibility(View.GONE);
        }
        if(ReturnedButton2==25){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button25);
            button2.setVisibility(View.GONE);
        }
        if(ReturnedButton2==26){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button26);
            button2.setVisibility(View.GONE);
        }
        if(ReturnedButton2==27){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button27);
            button2.setVisibility(View.GONE);
        }
        if(ReturnedButton2==28){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button28);
            button2.setVisibility(View.GONE);
        }
        if(ReturnedButton2==29){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button29);
            button2.setVisibility(View.GONE);
        }
        if(ReturnedButton2==30){
            ImageButton button2 = (ImageButton) findViewById(R.id.Button30);
            button2.setVisibility(View.GONE);
        }

    }
    //Function that increases cardFlip by 1, if cardFlip is at two should flip both cards down.
    void flip(int count){
        cardFlip++;
        if(cardFlip == 1){
            storeCount[0] = count;
        }else{
            storeCount[1] = count;
        }
        if(cardFlip==2){
            ReturnedButton1 = storeCount[0];
            ReturnedButton2=  storeCount[1];
            if(compare[0]==compare[1]){
                (new Handler()).postDelayed(this:: remove,1750);
                score();
            }else if (compare[0]!=compare[1]){
                ReturnedButton1 = storeCount[0];
                ReturnedButton2=storeCount[1];
                (new Handler()).postDelayed(this::flipDown, 1750);
            }
            cardFlip=0;
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        button = (Button) findViewById(R.id.button7);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(test.this, endGame.class);
                startActivity(intent);
            }
        });


        int[][] setup={{1, 2, 3, 4, 5},{6,7,8,9,10},{11,12,13,14,15},{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};

        for(int i=0;i<setup.length;i++){
            for(int j=0;j< setup[i].length;j++){
                int a1= (int) (Math.random()* setup.length);
                int b1 = (int)(Math.random()*setup[i].length);
                int hold = setup[i][j];
                setup[i][j]=setup[a1][b1];
                setup[a1][b1]=hold;
            }
        }


        // SETTING UP THE BUTTON S
        ImageButton button = (ImageButton) findViewById(R.id.Button1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int a=0;
                int b=0;
                int ButtonNumber=1;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });

        ImageButton button2 = (ImageButton) findViewById(R.id.Button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=0;
                int b=1;
                int ButtonNumber=2;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button2.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button2.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button2.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button2.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button2.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button2.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button2.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button2.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button2.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button2.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button2.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button2.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button2.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button2.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button2.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });


        ImageButton button3 = (ImageButton) findViewById(R.id.Button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=0;
                int b=2;
                int ButtonNumber=3;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button3.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button3.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button3.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button3.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button3.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button3.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button3.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button3.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button3.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button3.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button3.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button3.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button3.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button3.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button3.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });


        ImageButton button4 = (ImageButton) findViewById(R.id.Button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=0;
                int b=3;
                int ButtonNumber=4;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button4.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button4.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button4.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button4.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button4.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button4.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button4.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button4.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button4.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button4.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button4.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button4.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button4.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button4.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button4.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });

        ImageButton button5 = (ImageButton) findViewById(R.id.Button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=0;
                int b=4;
                int ButtonNumber=5;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button5.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button5.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button5.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button5.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button5.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button5.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button5.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button5.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button5.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button5.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button5.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button5.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button5.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button5.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button5.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });

        ImageButton button6 = (ImageButton) findViewById(R.id.Button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=1;
                int b=0;
                int ButtonNumber=6;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button6.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button6.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button6.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button6.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button6.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button6.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button6.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button6.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button6.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button6.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button6.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button6.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button6.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button6.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button6.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });

        ImageButton button7 = (ImageButton) findViewById(R.id.Button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=1;
                int b=1;
                int ButtonNumber=7;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button7.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button7.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button7.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button7.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button7.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button7.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button7.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button7.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button7.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button7.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button7.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button7.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button7.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button7.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button7.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });

        ImageButton button8 = (ImageButton) findViewById(R.id.Button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=1;
                int b=2;
                int ButtonNumber=8;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button8.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button8.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button8.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button8.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button8.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button8.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button8.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button8.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button8.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button8.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button8.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button8.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button8.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button8.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button8.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });

        ImageButton button9 = (ImageButton) findViewById(R.id.Button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=1;
                int b=3;
                int ButtonNumber=9;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button9.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button9.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button9.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button9.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button9.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button9.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button9.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button9.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button9.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button9.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button9.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button9.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button9.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button9.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button9.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });

        ImageButton button10 = (ImageButton) findViewById(R.id.Button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=1;
                int b=4;
                int ButtonNumber=10;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button10.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button10.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button10.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button10.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button10.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button10.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button10.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button10.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button10.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button10.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button10.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button10.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button10.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button10.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button10.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });

        ImageButton button11 = (ImageButton) findViewById(R.id.Button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=1;
                int b=5;
                int ButtonNumber=11;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button11.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button11.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button11.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button11.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button11.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button11.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button11.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button11.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button11.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button11.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button11.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button11.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button11.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button11.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button11.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button12 = (ImageButton) findViewById(R.id.Button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=1;
                int b=5;
                int ButtonNumber=12;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button12.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button12.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button12.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button12.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button12.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button12.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button12.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button12.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button12.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button12.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button12.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button12.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button12.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button12.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button12.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });

        ImageButton button13 = (ImageButton) findViewById(R.id.Button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=2;
                int b=0;
                int ButtonNumber=13;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button13.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button13.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button13.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button13.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button13.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button13.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button13.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button13.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button13.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button13.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button13.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button13.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button13.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button13.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button13.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button14 = (ImageButton) findViewById(R.id.Button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=2;
                int b=1;
                int ButtonNumber=14;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button14.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button14.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button14.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button14.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button14.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button14.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button14.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button14.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button14.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button14.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button14.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button14.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button14.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button14.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button14.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button15 = (ImageButton) findViewById(R.id.Button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=2;
                int b=2;
                int ButtonNumber=15;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button15.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button15.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button15.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button15.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button15.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button15.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button15.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button15.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button15.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button15.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button15.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button15.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button15.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button15.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button15.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button16 = (ImageButton) findViewById(R.id.Button16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=2;
                int b=3;
                int ButtonNumber=16;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button16.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button16.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button16.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button16.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button16.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button16.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button16.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button16.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button16.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button16.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button16.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button16.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button16.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button16.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button16.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button17 = (ImageButton) findViewById(R.id.Button17);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=2;
                int b=4;
                int ButtonNumber=17;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button17.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button17.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button17.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button17.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button17.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button17.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button17.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button17.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button17.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button17.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button17.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button17.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button17.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button17.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button17.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });

        ImageButton button18 = (ImageButton) findViewById(R.id.Button18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=2;
                int b=5;
                int ButtonNumber=18;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button18.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button18.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button18.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button18.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button18.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button18.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button18.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button18.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button18.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button18.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button18.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button18.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button18.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button18.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button18.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button19 = (ImageButton) findViewById(R.id.Button19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=3;
                int b=0;
                int ButtonNumber=19;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button19.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button19.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button19.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button19.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button19.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button19.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button19.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button19.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button19.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button19.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button19.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button19.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button19.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button19.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button19.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button20 = (ImageButton) findViewById(R.id.Button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=3;
                int b=1;
                int ButtonNumber=20;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button20.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button20.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button20.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button20.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button20.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button20.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button20.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button20.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button20.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button20.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button20.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button20.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button20.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button20.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button20.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button21 = (ImageButton) findViewById(R.id.Button21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=3;
                int b=2;
                int ButtonNumber=21;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button21.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button21.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button21.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button21.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button21.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button21.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button21.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button21.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button21.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button21.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button21.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button21.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button21.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button21.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button21.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button22 = (ImageButton) findViewById(R.id.Button22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=3;
                int b=3;
                int ButtonNumber=22;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button22.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button22.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button22.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button22.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button22.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button22.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button22.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button22.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button22.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button22.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button22.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button22.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button22.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button22.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button22.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button23 = (ImageButton) findViewById(R.id.Button23);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=3;
                int b=4;
                int ButtonNumber=23;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button23.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button23.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button23.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button23.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button23.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button23.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button23.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button23.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button23.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button23.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button23.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button23.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button23.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button23.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button23.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button24 = (ImageButton) findViewById(R.id.Button24);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=3;
                int b=5;
                int ButtonNumber=24;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button24.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button24.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button24.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button24.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button24.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button24.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button24.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button24.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button24.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button24.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button24.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button24.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button24.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button24.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button24.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button25 = (ImageButton) findViewById(R.id.Button25);
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=4;
                int b=0;
                int ButtonNumber=25;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button25.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button25.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button25.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button25.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button25.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button25.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button25.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button25.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button25.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button25.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button25.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button25.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button25.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button25.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button25.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button26 = (ImageButton) findViewById(R.id.Button26);
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=4;
                int b=1;
                int ButtonNumber=26;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button26.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button26.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button26.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button26.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button26.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button26.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button26.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button26.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button26.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button26.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button26.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button26.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button26.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button26.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button26.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button27 = (ImageButton) findViewById(R.id.Button27);
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=4;
                int b=2;
                int ButtonNumber=27;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button27.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button27.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button27.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button27.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button27.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button27.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button27.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button27.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button27.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button27.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button27.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button27.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button27.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button27.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button27.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button28 = (ImageButton) findViewById(R.id.Button28);
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=4;
                int b=3;
                int ButtonNumber=28;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button28.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button28.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button28.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button28.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button28.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button28.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button28.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button28.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button28.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button28.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button28.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button28.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button28.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button28.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button28.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button29 = (ImageButton) findViewById(R.id.Button29);
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=4;
                int b=4;
                int ButtonNumber=29;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button29.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button29.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button29.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button29.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button29.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button29.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button29.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button29.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button29.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button29.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button29.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button29.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button29.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button29.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button29.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
        ImageButton button30 = (ImageButton) findViewById(R.id.Button30);
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a=4;
                int b=5;
                int ButtonNumber=30;
                makeCompare(a,b,setup);
                if(setup[a][b] == 1){
                    button30.setBackgroundResource(R.drawable.circle);
                }else if(setup[a][b] == 2){
                    button30.setBackgroundResource(R.drawable.clovers);
                }else if(setup[a][b] == 3){
                    button30.setBackgroundResource(R.drawable.diamond);
                }else if(setup[a][b] == 4){
                    button30.setBackgroundResource(R.drawable.heart);
                }else if(setup[a][b]==5){
                    button30.setBackgroundResource(R.drawable.hexagon);
                }else if(setup[a][b]==6){
                    button30.setBackgroundResource(R.drawable.jewel);
                }else if(setup[a][b]==7){
                    button30.setBackgroundResource(R.drawable.octogon);
                }else if(setup[a][b]==8){
                    button30.setBackgroundResource(R.drawable.oval);
                }else if(setup[a][b]==9){
                    button30.setBackgroundResource(R.drawable.pentagon);
                }else if(setup[a][b]==10){
                    button30.setBackgroundResource(R.drawable.rectangle);
                }else if(setup[a][b]==11){
                    button30.setBackgroundResource(R.drawable.spades);
                }else if(setup[a][b]==12){
                    button30.setBackgroundResource(R.drawable.square);
                }else if(setup[a][b]==13){
                    button30.setBackgroundResource(R.drawable.star);
                }else if(setup[a][b]==14){
                    button30.setBackgroundResource(R.drawable.trapezoid);
                }else{
                    button30.setBackgroundResource(R.drawable.triangle);
                }
                flip(ButtonNumber);
            }
        });
    }
}