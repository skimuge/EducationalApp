package com.example.android.educationalapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {
    //String one = "Activity";
    // String two = "View";
    // String three = "manifest";
    // String nameField;
    private RadioGroup Quizone; //first radio group
    private RadioButton One;
    private Button dBtn;
    int correct = 0;
    int wrong = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();

    }

        public void addListenerOnButton(){
        Quizone=(RadioGroup) findViewById(R.id.quiz_one);
        Button dBtn=(Button)findViewById(R.id.Btn);
        dBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId= Quizone.getCheckedRadioButtonId();
                One=(RadioButton)findViewById(selectedId);
                Toast.makeText(MainActivity.this,One.getText(),Toast.LENGTH_SHORT).show();

            }
        });



    }


}
