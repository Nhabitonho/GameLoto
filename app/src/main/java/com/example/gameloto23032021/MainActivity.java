package com.example.gameloto23032021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Math
//        1: Làm tròn
//        float st1 = 0.5f;
//        round : dưới thì xuống 0, trên thì lên 1
//        float valueSt1 = Math.round(st1);
//        làm tròn thành 1 hết
//        double valueSt2 = Math.ceil(Double.parseDouble(st1 + ""));
//        làm tròn về 0
//        double valueSt3 = Math.floor(Double.parseDouble(st1 + ""));
//
//        Log.d("AAA",valueSt1 + "" );
//        Log.d("BBB",valueSt2 + "" );
//        Log.d("CCC",valueSt3 + "" );
//        double value = Math.floor(Math.random()*6);
//        Log.d("AAA", value + "");
//        Random random = new Random();
//         5-127
//        for (int i = 0; i < 200; i++) {
//            int value = random.nextInt(127 - 5 + 1) + 5;
//            Log.d("AAA", value + "");
//        }
//        Khai báo và Ánh xạ
        EditText mInput1 = (EditText) findViewById(R.id.input1);
        EditText mInput2 = (EditText) findViewById(R.id.input2);
        Button mBtnRandom = (Button) findViewById(R.id.BtnRandom);
        TextView mTvKetQua = (TextView) findViewById(R.id.textViewKetQua);

        mBtnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Lấy dữ liệu và hứng nó
                String sothu1 = (String) mInput1.getText().toString();
                String sothu2 = (String) mInput2.getText().toString();

                // kiểm tra dữ liệu của 2 text

                if (sothu1.length() <= 0 || sothu2.length() <= 0) {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đủ số", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if(Integer.parseInt(sothu2) <= Integer.parseInt(sothu1)){
                    Toast.makeText(MainActivity.this, "Số thứ hai phải lớn hơn số thứ nhất", Toast.LENGTH_SHORT).show();
                    return;
                }

                int input1 = Integer.parseInt(sothu1);
                int input2 = Integer.parseInt(sothu2);
                Random random = new Random();
                int ketqua = random.nextInt(input2 - input1 + 1) + input1;
                mTvKetQua.setText(String.valueOf(ketqua));
                Log.d("AAA", ketqua + "");
                Log.d("BBB", mTvKetQua + "");
            }
        });
    }

    public Boolean isNumber(String text){
        try{
            int num =  Integer.parseInt(text);
            return true;
        }
        catch (Exception ex){
            return false;
        }
    }
}