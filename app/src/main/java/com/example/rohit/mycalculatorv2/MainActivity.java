package com.example.rohit.mycalculatorv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnDot,btnPlus,btnSub,btnMul,btnDiv,btnSum,btnAC,btnPlusMin,btnMod;
    TextView ResultView,OtherView;
    double firstNum,secondNum,answer;
    char operator;
    DecimalFormat dF= new DecimalFormat("#########.##########");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button Binding
        btn1=findViewById(R.id.btn1);
        btn0=findViewById(R.id.btn0);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnDot=findViewById(R.id.btnDot);
        btnPlus=findViewById(R.id.btnPlus);
        btnSub=findViewById(R.id.btnSub);
        btnMul=findViewById(R.id.btnMul);
        btnDiv=findViewById(R.id.btnDiv);
        btnSum=findViewById(R.id.btnSum);
        btnAC=findViewById(R.id.btnAC);
        btnPlusMin=findViewById(R.id.btnPlusMin);
        btnMod=findViewById(R.id.btnMod);
        // TextView Binding
        ResultView=findViewById(R.id.ResultView);
        OtherView=findViewById(R.id.textView);




        //// EVENTS

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResultView.setText(ResultView.getText()+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResultView.setText(ResultView.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResultView.setText(ResultView.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResultView.setText(ResultView.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResultView.setText(ResultView.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResultView.setText(ResultView.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResultView.setText(ResultView.getText()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResultView.setText(ResultView.getText()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResultView.setText(ResultView.getText()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResultView.setText(ResultView.getText()+"9");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(!ResultView.getText().toString().contains("."))
               {
                   ResultView.setText(ResultView.getText()+".");
               }
            }
        });


        //FUNCTIONAL KEYS
//AC
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OtherView.setText("");
                firstNum=0;
                secondNum=0;
                answer=0;
                ResultView.setText("");
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             firstNum=Integer.parseInt(ResultView.getText().toString());
             OtherView.setText(ResultView.getText().toString()+'+');
                operator='+';
                 ResultView.setText("");
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstNum=Integer.parseInt(ResultView.getText().toString());
                OtherView.setText(ResultView.getText().toString()+'-');
                operator='-';
                ResultView.setText("");
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstNum=Integer.parseInt(ResultView.getText().toString());
                OtherView.setText(ResultView.getText().toString()+'x');
                operator='*';
                ResultView.setText("");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstNum=Integer.parseInt(ResultView.getText().toString());
                OtherView.setText(ResultView.getText().toString()+'/');
                operator='/';
                ResultView.setText("");
            }
        });
        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstNum=Integer.parseInt(ResultView.getText().toString());
                OtherView.setText(ResultView.getText().toString()+'%');
                operator='%';
                ResultView.setText("");

            }
        });


        ///CALCULATION
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secondNum=Integer.parseInt(ResultView.getText().toString());
OtherView.setText("");
                switch (operator)
                {
                    case '+':
                        answer=firstNum+secondNum;
                        ResultView.setText(dF.format(answer));
                        break;
                    case '-':
                        answer=firstNum-secondNum;
                        ResultView.setText(dF.format(answer));
                        break;
                    case '*':
                        answer=firstNum*secondNum;
                        ResultView.setText(dF.format(answer));
                        break;
                    case '/':
                        if(secondNum==0)
                        {
                            ResultView.setText("Cannot divide by zero");
                        }
                        else{
                        answer=firstNum/secondNum;
                            ResultView.setText(dF.format(answer));
                        }
                        break;
                    case '%':
                        answer=firstNum%secondNum;
                        ResultView.setText(dF.format(answer));
                        break;
                }
            }
        });








    }
}
