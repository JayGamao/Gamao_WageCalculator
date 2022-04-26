package mcm.edu.ph.gamao_wagecalculator.View;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import mcm.edu.ph.gamao_wagecalculator.Controller.Methods;
import mcm.edu.ph.gamao_wagecalculator.Model.getter_and_setters;
import mcm.edu.ph.gamao_wagecalculator.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txt1, txt2, txt3, txt4, txt5, txt6, wage, overTimeWage, hoursWorked, overTimeHours, totalWage, nameandstatus;
    EditText Name, hours;
    Button btnRates, btnX, btnRegular, btnProbational, btnPartTime;
    ImageView reset, rates;
    Methods m;
    getter_and_setters g;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        g = new getter_and_setters();
        m = new Methods();


        Name = findViewById(R.id.Name);
        nameandstatus = findViewById(R.id.nameandstatus);
        hours = findViewById(R.id.hours);
        btnRates = findViewById(R.id.btnRates);
        btnX = findViewById(R.id.btn_X);
        btnRegular = findViewById(R.id.btn_Regular);
        btnPartTime = findViewById(R.id.btn_PartTime);
        btnProbational = findViewById(R.id.btn_Probationary);
        reset = findViewById(R.id.btn_Reset);
        rates = findViewById(R.id.imageView4);
        txt1 = findViewById(R.id.employee);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        txt4 = findViewById(R.id.txt4);
        txt5 = findViewById(R.id.txt5);
        txt6 = findViewById(R.id.txt6);
        wage = findViewById(R.id.wage);
        overTimeWage = findViewById(R.id.overTimeWage);
        hoursWorked = findViewById(R.id.hoursWorked);
        overTimeHours = findViewById(R.id.overTimeHours);
        totalWage = findViewById(R.id.totalWage);


        //onclicklistener
        Name.setOnClickListener(this);
        btnRates.setOnClickListener(this);
        btnX.setOnClickListener(this);
        btnRegular.setOnClickListener(this);
        btnPartTime.setOnClickListener(this);
        btnProbational.setOnClickListener(this);
        reset.setOnClickListener(this);


    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_X:
                m.clickX(txt1, Name, hours, btnRates, btnX, btnRegular, btnPartTime, btnProbational, rates);
                break;
            case R.id.btnRates:
                m.checkRates(txt1, Name, hours, btnRates, btnX, btnRegular, btnPartTime, btnProbational, rates);
                break;
            case R.id.btn_Regular:
                Log.d(TAG, "btn1 pressed");
                g.settype(1);
                m.finalScreen(g, txt1, Name, hours, btnRates, btnX, btnRegular, btnPartTime, btnProbational, rates, txt2, txt3, txt4, txt5, txt6, wage, overTimeWage, hoursWorked, overTimeHours, totalWage, nameandstatus);
                break;
            case R.id.btn_PartTime:
                Log.d(TAG, "btn2 pressed");
                g.settype(2);
                m.finalScreen(g, txt1, Name, hours, btnRates, btnX, btnRegular, btnPartTime, btnProbational, rates, txt2, txt3, txt4, txt5, txt6, wage, overTimeWage, hoursWorked, overTimeHours, totalWage, nameandstatus);
                break;
            case R.id.btn_Reset:
                if (v == reset) {
                    final Intent i = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(i);
                    break;
                }

            case R.id.btn_Probationary:
                Log.d(TAG, "btn3 pressed");
                g.settype(3);
                m.finalScreen(g, txt1, Name, hours, btnRates, btnX, btnRegular, btnPartTime, btnProbational, rates, txt2, txt3, txt4, txt5, txt6, wage, overTimeWage, hoursWorked, overTimeHours, totalWage, nameandstatus);
                break;
        }
        wage.setText(Integer.toString(g.getwage()));
        overTimeHours.setText(Integer.toString(g.getovertimehours()));
        overTimeWage.setText(Integer.toString(g.getovertimewage()));
        hoursWorked.setText(Integer.toString(g.gethoursworked()));
        totalWage.setText(Integer.toString(g.gettotalwage()));
        if (Name.equals("")) {
            int Amount = Integer.parseInt(Name.getText().toString());
            String Password = hours.getText().toString();
            if (Amount <= 50 && Amount >= 1 & Password.equals("Lol")) {
                final Intent i = new Intent(MainActivity.this, MainActivity.class);
                startActivity(i);
            }else
            {
                Toast.makeText(MainActivity.this, "INVALID", Toast.LENGTH_LONG).show();
            }
        }else{

        }


}}

