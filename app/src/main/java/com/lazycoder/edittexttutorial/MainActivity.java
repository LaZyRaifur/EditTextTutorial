package com.lazycoder.edittexttutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnSubmit;
    EditText EtInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = (Button)findViewById(R.id.btnSubmit);
        EtInput = (EditText)findViewById(R.id.EtName);

       btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Second.class);
                intent.putExtra("rakib",EtInput.getText().toString());
                startActivity(intent);
            }
        });
    }
}