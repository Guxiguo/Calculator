package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText text, text2;
    Button b0;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b_jia;
    Button b_jian;
    Button b_cheng;
    Button b_chu;
    Button b_equal;
    Button b_delete;
    Button b_point;
    Button b_sign;
    Button b_precent;
    Button b_sqrt,b_tan,b_sin,b_cos,b_retreat;
    boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        text = (EditText) findViewById(R.id.input);
        text2 = (EditText) findViewById(R.id.text1);
        b0 = (Button) findViewById(R.id.button0);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        b_jia = (Button) findViewById(R.id.button_jia);
        b_jian = (Button) findViewById(R.id.button_jian);
        b_cheng = (Button) findViewById(R.id.button_cheng);
        b_chu = (Button) findViewById(R.id.button_chu);
        b_equal = (Button) findViewById(R.id.button_equal);
        b_delete = (Button) findViewById(R.id.button_detele);
        b_point = (Button) findViewById(R.id.button_point);
        b_sign = (Button) findViewById(R.id.button_sign);
        b_precent = (Button) findViewById(R.id.button_precent);
        b_sqrt=(Button)findViewById(R.id.button_sqrt) ;
        b_tan=(Button)findViewById(R.id.button_tan) ;
        b_sin=(Button)findViewById(R.id.button_sin) ;
        b_cos=(Button)findViewById(R.id.button_cos) ;
        b_retreat=(Button)findViewById(R.id.button_retreat) ;
        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b_jia.setOnClickListener(this);
        b_jian.setOnClickListener(this);
        b_cheng.setOnClickListener(this);
        b_chu.setOnClickListener(this);
        b_equal.setOnClickListener(this);
        b_point.setOnClickListener(this);
        b_delete.setOnClickListener(this);
        b_precent.setOnClickListener(this);
        b_sign.setOnClickListener(this);
        b_sqrt.setOnClickListener(this);
        b_tan.setOnClickListener(this);
        b_sin.setOnClickListener(this);
        b_cos.setOnClickListener(this);
        b_retreat.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String str = text.getText().toString();
        switch (v.getId()) {
            case R.id.button_retreat:
                if (str.equals("")){
                    text.setText("");
                }
                else if (str.charAt(str.length()-1)==' '){
                    if (str.charAt(str.length()-2)=='n'||str.charAt(str.length()-2)=='s'){
                        text.setText(str.substring(0, str.length() - 5));
                    }
                    else {
                        text.setText(str.substring(0, str.length() - 3));
                    }
                }
                else {
                    text.setText(str.substring(0, str.length() - 1));
                }
                break;
            case R.id.button_sin:
            case R.id.button_tan:
            case R.id.button_cos:
            case R.id.button_sqrt:
                if (flag) {
                    flag = false;
                    str = "";
                    text.setText("");
                }
                    text.setText(str +" "+((Button) v).getText() + " ");
                break;

            case R.id.button0:
            case R.id.button1:
            case R.id.button2:
            case R.id.button3:
            case R.id.button4:
            case R.id.button5:
            case R.id.button6:
            case R.id.button7:
            case R.id.button8:
            case R.id.button9:
                if (flag) {
                    flag = false;
                    str = "";
                    text.setText("");
                }
                text.setText(str + ((Button) v).getText());
                break;
            case R.id.button_point:
                if (flag) {
                    flag = false;
                    str = "";
                    text.setText("");
                }
                if (str.equals("")){
                    text.setText("");
                }
                else {
                    text.setText(str + ((Button) v).getText());
                }
                break;
            case R.id.button_jian:
                if (flag) {
                    flag = false;
                    str = "";
                    text.setText("");
                }
                int count=0;
                for(int i=0;i<str.length();i++){
                    if(str.charAt(i)==' '){
                        count++;
                    }
                }
                if (str.equals("")){
                    text.setText(str + ((Button) v).getText());
                }
                else if (count==2){
                    text.setText(str + ((Button) v).getText());
                }
                else
                    text.setText(str + " " + ((Button) v).getText() + " ");
                break;
            case R.id.button_jia:
            case R.id.button_cheng:
            case R.id.button_precent:
            case R.id.button_chu:
                if (flag) {
                    flag = false;
                    str = "";
                    text.setText("");
                }
                if (str.equals("")){
                    text.setText("");
                }
                else {
                    text.setText(str + " " + ((Button) v).getText() + " ");
                }
                break;
            case R.id.button_detele:
                flag = false;
                str = "";
                text.setText("");
            case R.id.button_equal:
                getResult();
                break;
            case R.id.button_sign:
                if (flag) {
                    flag = false;
                    str = "";
                    text.setText("");
                }
                int coun=0;
                for(int i=0;i<str.length();i++){
                    if(str.charAt(i)==' '){
                        coun++;
                    }
                }
                if (str.equals("")){
                    text.setText("");
                    flag=true;
                }
                else{
                    if (coun == 2) {
                        String s2 = str.substring(str.indexOf(" ") + 3);
                        String s3 = str.substring(0, str.length() - s2.length());
                        if (s2.equals("")) {
                            text.setText("格式错误！");
                            Toast.makeText(MainActivity.this,"格式错误！",Toast.LENGTH_SHORT).show();
                            flag=true;
                        }
                        else {
                            if (str.contains("sin")||str.contains("tan")||str.contains("cos")){
                                text.setText("格式不正确！");
                                Toast.makeText(MainActivity.this, "格式不正确！", Toast.LENGTH_SHORT).show();
                                flag = true;
                            }
                            else if (!s2.contains(".")) {
                                int result = Integer.parseInt(s2);
                                text.setText(s3 + String.valueOf(result * (-1)));
                            }
                            else {
                                double result = Double.parseDouble(s2);
                                text.setText(String.valueOf(result * (-1)));
                            }
                        }
                    }
                    else if (coun==0){
                        if (str.contains("sin")||str.contains("tan")||str.contains("cos")){
                            text.setText("格式不正确！");
                            Toast.makeText(MainActivity.this, "格式不正确！", Toast.LENGTH_SHORT).show();
                            flag = true;
                        }
                        else if (!str.contains(".")) {
                            int result = Integer.parseInt(str);
                            text.setText(String.valueOf(result * (-1)));
                        }
                        else {
                            double result = Double.parseDouble(str);
                            text.setText(String.valueOf(result * (-1)));
                        }

                    }
                    else {
                        text.setText("格式不正确！");
                        Toast.makeText(MainActivity.this, "格式不正确！", Toast.LENGTH_SHORT).show();
                        flag = true;
                    }
                }

                break;

        }
    }

        private void getResult () {
            String str = text.getText().toString();
            text2.setText(str);
            int a1=0,a2=0;
            for(int i=0;i<str.length();i++){
                if (str.charAt(i)=='+'||str.charAt(i)=='*'||str.charAt(i)=='/'||str.charAt(i)=='a'||str.charAt(i)=='o'||str.charAt(i)=='i') {
                    a1++;
                }
                else if (str.charAt(i)=='-'){
                    a2++;
                }
            }

            if (str.contains("tan")){
                int cou=0;
                for (int i=0;i<str.length();i++){
                    char c=str.charAt(i);
                    if (c=='t') {
                        cou++;
                    }
                }
                if (cou>=2){
                    text.setText("格式错误！");
                    Toast.makeText(MainActivity.this,"格式错误！",Toast.LENGTH_SHORT).show();
                    flag = true;
                }
                else {
                    str = str.substring(0,str.indexOf(" "))+" " + "t" +" "+str.substring(str.indexOf(" ")+5);
                }
            }
            else if (str.contains("cos")){
                int cou=0;
                for (int i=0;i<str.length();i++){
                    char c=str.charAt(i);
                    if (c=='c') {
                        cou++;
                    }
                }
                if (cou>=2){
                    text.setText("格式错误！");
                    Toast.makeText(MainActivity.this,"格式错误！",Toast.LENGTH_SHORT).show();
                    flag = true;
                }
                else {
                    str = str.substring(0,str.indexOf(" "))+" " + "c" +" "+str.substring(str.indexOf(" ")+5);
                }
            }
            else if (str.contains("sin")){
                int cou=0;
                for (int i=0;i<str.length();i++){
                    char c=str.charAt(i);
                    if (c=='s') {
                        cou++;
                    }
                }
                if (cou>=2){
                    text.setText("格式错误！");
                    Toast.makeText(MainActivity.this,"格式错误！",Toast.LENGTH_SHORT).show();
                    flag = true;
                }
                else {
                    str = str.substring(0,str.indexOf(" "))+" " + "s" +" "+str.substring(str.indexOf(" ")+5);
                }
            }
            if (str == null || str.equals("")) {
                return;
            }
            if (!str.contains(" ")) {
                return;
            }
            /*if (flag) {
                flag = false;
                return;
            }*/
            //flag = true;
            double result = 0;
            int number=0;
            String s1 = str.substring(0, str.indexOf(" "));
            String op = str.substring(str.indexOf(" ") + 1, str.indexOf(" ") + 2);
            String s2 = str.substring(str.indexOf(" ") + 3);
            if (a1>=2){
                text.setText("格式不正确！");
                Toast.makeText(MainActivity.this, "格式不正确！", Toast.LENGTH_SHORT).show();
                flag = true;
            }
            else if (a2>2&&a1>=1){
                text.setText("格式不正确！");
                Toast.makeText(MainActivity.this, "格式不正确！", Toast.LENGTH_SHORT).show();
                flag = true;
            }
            else if (!s1.equals("") && !s2.equals("")) {
                if (s1.contains(".") || s2.contains(".")) {
                    double d1 = Double.parseDouble(s1);
                    double d2 = Double.parseDouble(s2);
                    if (op.equals("+")) {
                        result = d1 + d2;
                        text.setText(result + "");
                    } else if (op.equals("-")) {
                        result = d1 - d2;
                        text.setText(result + "");
                    } else if (op.equals("*")) {
                        result = d1 * d2;
                        text.setText(result + "");
                    }
                    else if (op.equals("/")) {
                        if (d2 == 0) {
                            text.setText("被除数不能为0！");
                            Toast.makeText(MainActivity.this,"被除数不能为0！",Toast.LENGTH_SHORT).show();
                            flag = true;
                        }
                        else {
                            result = d1 / d2;
                            text.setText(result + "");
                        }
                    }
                    else if (op.contains("%")) {
                        result = d1 / d2;
                        double r = (int) result;
                        text.setText(r + "");
                    }
                    else if (op.contains("√")) {
                        text.setText("格式错误！");
                        Toast.makeText(MainActivity.this,"格式错误！",Toast.LENGTH_SHORT).show();
                        flag = true;
                    }
                    else if (op.contains("c")||op.contains("t")||op.contains("s")){
                        text.setText("格式错误！");
                        Toast.makeText(MainActivity.this,"格式错误！",Toast.LENGTH_SHORT).show();
                        flag = true;
                    }

                }
                else{
                    double d1 = Double.parseDouble(s1);
                    double d2 = Double.parseDouble(s2);
                    int d3 = Integer.parseInt(s1);
                    int d4 = Integer.parseInt(s2);
                    if (op.equals("+")) {
                        number = d3 + d4;
                        text.setText(number + "");
                    } else if (op.equals("-")) {
                        number = d3 - d4;
                        text.setText(number + "");
                    } else if (op.equals("*")) {
                        number = d3 * d4;
                        text.setText(number + "");
                    }
                    else if (op.equals("/")) {
                        if (d2 == 0) {
                            text.setText("被除数不能为0！");
                            Toast.makeText(MainActivity.this,"被除数不能为0！",Toast.LENGTH_SHORT).show();
                            flag = true;
                        }
                        else {
                            result = d1 / d2;
                            text.setText(result + "");
                        }
                    }
                    else if (str.contains("%")) {
                        if (d1<=0||d2<=0){
                            text.setText("取模的两个数都不能小于0！");
                            Toast.makeText(MainActivity.this,"取模的两个数都不能小于0！",Toast.LENGTH_SHORT).show();
                            flag = true;
                        }
                        else {
                            number = d3 / d4;
                            int r = (int) number;
                            text.setText(r + "");
                        }
                    }
                    else if (op.contains("√")) {
                        text.setText("格式错误！");
                        Toast.makeText(MainActivity.this,"格式错误！",Toast.LENGTH_SHORT).show();
                        flag = true;
                    }
                    else if (op.contains("c")||op.contains("t")||op.contains("s")){
                        text.setText("格式错误！");
                        Toast.makeText(MainActivity.this,"格式错误！",Toast.LENGTH_SHORT).show();
                        flag = true;
                    }
                }
                }
                else if (s1.equals("") && !s2.equals("")) {
                    if(s2.contains(".")) {
                        double d2 = Double.parseDouble(s2);
                        if (op.equals("√")) {
                            if (d2 <= 0) {
                                text.setText("根号下不能有负数！");
                                Toast.makeText(MainActivity.this, "根号下不能有负数！", Toast.LENGTH_SHORT).show();
                                flag = true;
                            } else {
                                result = Math.sqrt(d2);
                                text.setText(result + "");

                            }
                        } else if (op.contains("c")) {
                            text.setText(String.valueOf(Math.cos(Math.toRadians(Double.parseDouble(s2)))));
                        } else if (op.contains("t")) {
                            text.setText(String.valueOf(Math.tan(Math.toRadians(Double.parseDouble(s2)))));
                        } else if (op.contains("s")) {
                            text.setText(String.valueOf(Math.sin(Math.toRadians(Double.parseDouble(s2)))));
                        }
                    }

                    else{
                        int d2=Integer.parseInt(s2);
                        if(op.equals("√")){
                            if(d2<=0){
                                text.setText("根号下不能小于0！");
                                Toast.makeText(MainActivity.this,"根号下不能小于0！",Toast.LENGTH_SHORT).show();
                                flag = true;
                            }
                            else {
                                result=Math.sqrt(d2);
                                text.setText(result + "");

                            }
                        }
                        else if (op.contains("c")){
                            text.setText(String.valueOf(Math.cos(Math.toRadians(Double.parseDouble(s2)))));
                        }
                        else if (op.contains("t")){
                            text.setText(String.valueOf(Math.tan(Math.toRadians(Double.parseDouble(s2)))));
                        }
                        else if (op.contains("s")){
                            text.setText(String.valueOf(Math.sin(Math.toRadians(Double.parseDouble(s2)))));
                        }

                    }

                }
            else if (!s1.equals("") && s2.equals("")) {
                if(s1.contains(".")){
                    if (op.equals("+")) {
                        text.setText("格式错误！");
                        Toast.makeText(MainActivity.this,"格式错误！",Toast.LENGTH_SHORT).show();
                        flag = true;
                    } else if (op.equals("-")) {
                        text.setText("格式错误！");
                        Toast.makeText(MainActivity.this,"格式错误！",Toast.LENGTH_SHORT).show();
                        flag = true;
                    } else if (op.equals("*")) {
                        text.setText("格式错误！");
                        Toast.makeText(MainActivity.this,"格式错误！",Toast.LENGTH_SHORT).show();
                        flag = true;
                    } else if (op.equals("/")) {
                        text.setText("格式错误！");
                        Toast.makeText(MainActivity.this,"格式错误！",Toast.LENGTH_SHORT).show();
                        flag = true;
                    }
                    else if (op.equals("%")){
                        text.setText("格式错误！");
                        Toast.makeText(MainActivity.this,"格式错误！",Toast.LENGTH_SHORT).show();
                        flag = true;
                    }
                    else if (op.equals("√")){
                        text.setText("格式错误！");
                        Toast.makeText(MainActivity.this,"格式错误！",Toast.LENGTH_SHORT).show();
                        flag = true;
                    }
                    else if (op.equals("c")||op.equals("t")||op.equals("s")){
                        text.setText("格式错误！");
                        Toast.makeText(MainActivity.this,"格式错误！",Toast.LENGTH_SHORT).show();
                        flag = true;
                    }


                }
                else{
                    if (op.equals("+")) {
                        text.setText("格式错误！");
                        Toast.makeText(MainActivity.this,"格式错误！",Toast.LENGTH_SHORT).show();
                        flag = true;
                    } else if (op.equals("-")) {
                        text.setText("格式错误！");
                        Toast.makeText(MainActivity.this,"格式错误！",Toast.LENGTH_SHORT).show();
                        flag = true;
                    } else if (op.equals("*")) {
                        text.setText("格式错误！");
                        Toast.makeText(MainActivity.this,"格式错误！",Toast.LENGTH_SHORT).show();
                        flag = true;
                    } else if (op.equals("/")) {
                        text.setText("格式错误！");
                        Toast.makeText(MainActivity.this,"格式错误！",Toast.LENGTH_SHORT).show();
                        flag = true;
                    }
                    else if (op.equals("%")){
                        text.setText("格式错误！");
                        Toast.makeText(MainActivity.this,"格式错误！",Toast.LENGTH_SHORT).show();
                        flag = true;
                    }
                    else if (op.equals("√")){
                        text.setText("格式错误！");
                        Toast.makeText(MainActivity.this,"格式错误！",Toast.LENGTH_SHORT).show();
                        flag = true;
                    }
                    else if (op.equals("c")||op.equals("t")||op.equals("s")){
                        text.setText("格式错误！");
                        Toast.makeText(MainActivity.this,"格式错误！",Toast.LENGTH_SHORT).show();
                        flag = true;
                    }


                }
            }
                else {
                    text.setText("");
                }
        }
    }



