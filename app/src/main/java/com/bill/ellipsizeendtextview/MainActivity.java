package com.bill.ellipsizeendtextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EllipsizeEndTextView content1;
    private EllipsizeEndTextView content2;
    private EllipsizeEndTextView content3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        content1 = findViewById(R.id.text_view_1);
        content2 = findViewById(R.id.text_view_2);
        content3 = findViewById(R.id.text_view_3);

        content1.setText(getString(R.string.text_1));

        content2.setText(getString(R.string.text_2));

        content3.setMaxLine(4);
        content3.setText(getString(R.string.text_3));
    }
}
