package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.layout.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText name,Student_Id,Semester, Course_code;
    Button button;
    TextView Output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.name);
        Student_Id = (EditText) findViewById(R.id.Student_Id);
        Semester   = (EditText) findViewById(R.id.Semester);
        Course_code = (EditText) findViewById(R.id.Course_code);
        button= (Button) findViewById(R.id.button);
        Output =(TextView) findViewById(R.id.Output);
        button.setOnClickListener(this);
    }

    public void onClick(View v){
        int Id= v.getId();
        if(Id==R.id.button)
        {
            String Sname= name.getText().toString();
            String Sid=Student_Id.getText().toString();
            String Ssemester= Semester.getText().toString();
            String Scode= Course_code.getText().toString();
            Output.setText("Name: "+Sname+"\nStudent ID: "+Sid+"\nSemester: "+Ssemester+"\n Course Code: "+Scode+"\n");

        }


    }
}