package com.zybooks.tempcon;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity<textView1, textView2, textView3> extends AppCompatActivity {

    private EditText mTextEdit;
    private TextView mTextView1, mTextView2, mTextView3;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView1 = findViewById(R.id.textView1);
        mTextView2 = findViewById(R.id.textView2);
        mTextView3 = findViewById(R.id.textView3);
        mTextEdit = findViewById(R.id.textEdit);
        mButton = findViewById(R.id.button);

    }

        public void calculateClick(View view) {

            Toast.makeText(getApplicationContext(), "Converted", Toast.LENGTH_SHORT).show();

            String enterTemp = mTextEdit.getText().toString();

            double Fahrenheit = Double.parseDouble(enterTemp);

            double Celsius = (Fahrenheit - 32) * 5 / 9;

            mTextView3.setText(String.format("Celsius             %.3f", Celsius));
        }


}