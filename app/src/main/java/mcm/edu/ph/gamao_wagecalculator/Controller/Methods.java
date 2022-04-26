package mcm.edu.ph.gamao_wagecalculator.Controller;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.media.Image;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


import org.w3c.dom.Text;

import mcm.edu.ph.gamao_wagecalculator.Model.getter_and_setters;
import mcm.edu.ph.gamao_wagecalculator.View.MainActivity;


public class Methods {



public  Methods(){

    new getter_and_setters();
    new MainActivity();
}

    public void clickX(TextView txt1, EditText Name, EditText hours, Button btnRates,Button btnX,Button btnRegular,Button btnPartTime,Button btnProbational, ImageView rates){
        txt1.setVisibility(View.VISIBLE);
        Name.setVisibility(View.VISIBLE);
        hours.setVisibility(View.VISIBLE);
        btnRates.setVisibility(View.VISIBLE);
        btnRegular.setVisibility(View.VISIBLE);
        btnProbational.setVisibility(View.VISIBLE);
        btnPartTime.setVisibility(View.VISIBLE);
        rates.setVisibility(View.INVISIBLE);
        btnX.setVisibility(View.INVISIBLE);
    }
    public void checkRates(TextView txt1, EditText Name, EditText hours, Button btnRates,Button btnX,Button btnRegular,Button btnPartTime,Button btnProbational, ImageView rates){
        txt1.setVisibility(View.INVISIBLE);
        Name.setVisibility(View.INVISIBLE);
        hours.setVisibility(View.INVISIBLE);
        btnRates.setVisibility(View.INVISIBLE);
        btnRegular.setVisibility(View.INVISIBLE);
        btnProbational.setVisibility(View.INVISIBLE);
        btnPartTime.setVisibility(View.INVISIBLE);
        rates.setVisibility(View.VISIBLE);
        btnX.setVisibility(View.VISIBLE);
    }
    public void finalScreen(getter_and_setters g,TextView txt1, EditText Name, EditText hours, Button btnRates,Button btnX,Button btnRegular,Button btnProbational,Button btnPartTime, ImageView rates, TextView txt2, TextView txt3, TextView txt4, TextView txt5, TextView txt6, TextView wage, TextView overTimeWage, TextView hoursWorked, TextView overTimeHours, TextView totalWage) {
        hide1st(txt1, Name, hours, btnRates, btnX, btnRegular, btnPartTime, btnProbational, rates);
        txt2.setVisibility(View.VISIBLE);
        txt3.setVisibility(View.VISIBLE);
        txt4.setVisibility(View.VISIBLE);
        txt5.setVisibility(View.VISIBLE);
        txt6.setVisibility(View.VISIBLE);
        wage.setVisibility(View.VISIBLE);
        overTimeWage.setVisibility(View.VISIBLE);
        hoursWorked.setVisibility(View.VISIBLE);
        overTimeHours.setVisibility(View.VISIBLE);
        totalWage.setVisibility(View.VISIBLE);
        g.setHours(Integer.parseInt(hours.getText().toString()));
        switch (g.gettype()) {
            case 1:
                if (g.getHours()>8) {
                g.setovertimehours(g.getHours() - 8);
                g.setwage(g.regularWage());
                g.sethoursworked(g.getHours());
                g.setovertimewage(g.getovertimehours() * 115);
                g.settotalwage(g.getwage() + g.getovertimewage());
            } else {
                g.setwage(g.getHours() * 100);
                g.settotalwage(g.getwage()+ g.getovertimewage());
                g.sethoursworked(g.getHours());
                Log.d(TAG, "formula 2");
            }
        break;
            case 2:
                if (g.getHours() > 8) {
                    g.settotalwage(g.getwage() + g.getovertimewage());
                    g.setovertimehours(g.getHours() - 8);
                    g.setwage(600);
                    g.sethoursworked(g.getHours());
                    g.setovertimewage(g.getovertimehours() * 90);
                } else {
                    g.setwage(g.getHours() * 75);
                    g.settotalwage(g.getwage()+ g.getovertimewage());
                    g.sethoursworked(g.getHours());
                }
                break;
            case 3:
                if (g.getHours()>8) {
                    g.setovertimehours(g.getHours() - 8);
                    g.setwage(720);
                    g.sethoursworked(g.getHours());
                    g.setovertimewage(g.getovertimehours() * 100);
                    g.settotalwage(g.getwage() + g.getovertimewage());
                } else {
                    g.setwage(g.getHours() * 90);
                    g.settotalwage(g.getwage()+ g.getovertimewage());
                    g.sethoursworked(g.getHours());
                    Log.d(TAG, "formula 1");
                }
                break;
        }
    }
    public void hide1st(TextView txt1, EditText Name, EditText hours, Button btnRates,Button btnX,Button btnRegular,Button btnProbational,Button btnPartTime, ImageView rates){
        txt1.setVisibility(View.INVISIBLE);
        Name.setVisibility(View.INVISIBLE);
        hours.setVisibility(View.INVISIBLE);
        btnRates.setVisibility(View.INVISIBLE);
        btnRegular.setVisibility(View.INVISIBLE);
        btnProbational.setVisibility(View.INVISIBLE);
        btnPartTime.setVisibility(View.INVISIBLE);
        rates.setVisibility(View.INVISIBLE);
        btnX.setVisibility(View.INVISIBLE);
}}



