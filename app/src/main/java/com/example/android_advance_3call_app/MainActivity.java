package com.example.android_advance_3call_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    EditText edtNum;
    ImageView backImg;

    CardView card1,card2,card3,card4,card5,card6,card7,card8,card9,cardZero,cardHash,cardStar,cardDail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNum=findViewById(R.id.edtNum);
        backImg=findViewById(R.id.backImg);
        card1=findViewById(R.id.card1);
        card2=findViewById(R.id.card2);
        card3=findViewById(R.id.card3);
        card4=findViewById(R.id.card4);
        card5=findViewById(R.id.card5);
        card6=findViewById(R.id.card6);
        card7=findViewById(R.id.card7);
        card8=findViewById(R.id.card8);
        card9=findViewById(R.id.card9);
        cardZero=findViewById(R.id.cardZero);
        cardHash=findViewById(R.id.cardHash);
        cardDail=findViewById(R.id.cardDail);
        cardStar=findViewById(R.id.cardStar);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNum.setText(edtNum.getText()+"1");
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNum.setText(edtNum.getText()+"2");
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNum.setText(edtNum.getText()+"3");
            }
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNum.setText(edtNum.getText()+"4");
            }
        });
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNum.setText(edtNum.getText()+"5");
            }
        });
        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNum.setText(edtNum.getText()+"6");
            }
        });
        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNum.setText(edtNum.getText()+"7");
            }
        });
        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNum.setText(edtNum.getText()+"8");
            }
        });
        card9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNum.setText(edtNum.getText()+"9");
            }
        });
        cardStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNum.setText(edtNum.getText()+"*");
            }
        });
        cardZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNum.setText(edtNum.getText()+"0");
            }
        });
        cardHash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNum.setText(edtNum.getText()+"#");
            }
        });
        backImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String number=edtNum.getText().toString();

               String sub=number.substring(0,number.length()-1);

               edtNum.setText(sub);
            }
        });

        if(ContextCompat.checkSelfPermission(MainActivity.this,
                Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){

            requestPermissions(new String[]{Manifest.permission.CALL_PHONE},200);
        }

        cardDail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number=edtNum.getText().toString();

                Intent a=new Intent(Intent.ACTION_CALL);
                a.setData(Uri.parse("tel:"+number));
                startActivity(a);
            }
        });
    }
}