package com.example.vharshinee.ex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        Button b;
        TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.button);
        final EditText e=(EditText)findViewById(R.id.editText2);
        final EditText e1=(EditText)findViewById(R.id.editText);
        b.setOnClickListener(new View.OnClickListener()
                             {

                                 @Override
                                 public void onClick(View v)
                                 {

                                    if(e.getText().toString().equals("varshi")&& e1.getText().toString().equals("ssn"))
                                    {
                                        t = (TextView) findViewById(R.id.textView2);
                                        t.setText("logged in");
                                        //Toast.makeText(getApplicationContext(),"logged in successfully" , Toast.LENGTH_SHORT).show();

                                    }
                                     else
                                    {
                                        //Toast.makeText(getApplicationContext(), "login failed", Toast.LENGTH_SHORT).show();
                                        t = (TextView) findViewById(R.id.textView2);
                                        t.setText("login failed");
                                    }
                                 }
                             }


        );
    }
}
