package com.zizi.project.surprise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin = (Button)findViewById(R.id.signIn);
        final EditText editNama = (EditText)findViewById(R.id.editNama);
        final EditText passwd = (EditText)findViewById(R.id.editPassword);

        //Set Button Login On Clik Listener
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = editNama.getText().toString();
                String password = passwd.getText().toString();

                if(name.equals("")||password.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Lengkapi nama dan password",Toast.LENGTH_LONG).show();
                }
                else if (name.equals("albert") || name.equals("narnia") && password.equals("221209") )
                {
                    Intent intent = new Intent(getApplicationContext(), Screen_satu.class);
                    startActivity(intent);
                }
                else if (!name.equals("albert") || !name.equals("narnia") && !password.equals("221209"))
                {
                    Toast.makeText(getApplicationContext(),"Name dan password salah", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
