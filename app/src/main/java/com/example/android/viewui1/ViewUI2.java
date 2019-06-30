package com.example.android.viewui1;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class ViewUI2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_view_ui2);
        LinearLayout rootlinearLayout = new LinearLayout(this);
        rootlinearLayout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams linearLayoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        linearLayoutParams.setMargins(15, 10, 15, 10);

        TextView addressLabel = new TextView(this);
        addressLabel.setText("Enter Your Address :");
        addressLabel.setTextSize(20);
        addressLabel.setPadding(10,10,0,10);
        rootlinearLayout.addView(addressLabel);

        EditText etAddress = new EditText(this);
        etAddress.setHint("Enter Permanent Address Here");
        etAddress.setMinLines(1);
        etAddress.setMaxLines(3);
        etAddress.setMinimumHeight(200);
        etAddress.setLeft(20);
        etAddress.setBackground(ContextCompat.getDrawable(this, R.drawable.border));
        rootlinearLayout.addView(etAddress);

        TextView seekBarLabel = new TextView(this);
        seekBarLabel.setText("Rate Yourself :");
        seekBarLabel.setTextSize(20);
        seekBarLabel.setPadding(10,10,0,25);
        rootlinearLayout.addView(seekBarLabel);

        SeekBar seekBar = new SeekBar(this);
        seekBar.setPadding(20,0,20,20);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(ViewUI2.this, "Progress is " + seekBar.getProgress() + "%", Toast.LENGTH_SHORT).show();
            }
        });
        rootlinearLayout.addView(seekBar);

        LinearLayout linearLayout1 = new LinearLayout(this);
        linearLayout1.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout1.setPadding(0,0,0,40);

        Button b1 = new Button(this);
        b1.setText("LION");
        //b1.setWidth(50);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = (ImageView) findViewById(R.id.imgView);
                imageView.setBackgroundResource(R.drawable.lion);
            }
        });
        linearLayout1.addView(b1);

        Button b2 = new Button(this);
        b2.setText("SNAKE");
        //b2.setWidth(50);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = (ImageView) findViewById(R.id.imgView);
                imageView.setBackgroundResource(R.drawable.snake);
            }
        });
        linearLayout1.addView(b2);

        Button b3 = new Button(this);
        b3.setText("DOLPHIN");
        b3.setWidth(50);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = (ImageView) findViewById(R.id.imgView);
                imageView.setBackgroundResource(R.drawable.dolphin);
            }
        });
        linearLayout1.addView(b3);

        Button b4 = new Button(this);
        b4.setText("DUCK");
        b4.setWidth(50);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = (ImageView) findViewById(R.id.imgView);
                imageView.setBackgroundResource(R.drawable.duck);
            }
        });
        linearLayout1.addView(b4);

        rootlinearLayout.addView(linearLayout1);

        ImageView imageView = new ImageView(this);
        imageView.setId(R.id.imgView);
        rootlinearLayout.addView(imageView);

        this.setContentView(rootlinearLayout, linearLayoutParams);
    }
}
