package com.dshantanu.androidperfectsquares;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnTwo, btnFour, btnFourHr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTwo = (Button) findViewById(R.id.btn_two);
        btnFour = (Button) findViewById(R.id.btn_four);
        btnFourHr = (Button) findViewById(R.id.btn_four_hr);
        btnTwo.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFourHr.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_two:
                Intent it2 = new Intent(getApplicationContext(), TwoSquaresActivity.class);
                startActivity(it2);
                break;
            case R.id.btn_four:
                Intent it4 = new Intent(getApplicationContext(), FourSquaresActivity.class);
                startActivity(it4);
                break;
            case R.id.btn_four_hr:
                Intent it4h = new Intent(getApplicationContext(), FourHorizontalSquaresActivity.class);
                startActivity(it4h);
                break;
        }
    }
}
