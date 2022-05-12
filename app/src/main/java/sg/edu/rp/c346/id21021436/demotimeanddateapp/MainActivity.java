package sg.edu.rp.c346.id21021436.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;


public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnReset = findViewById(R.id.resetButton);



        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                String dispHour;
                String dispMinute;
                if (tp.getCurrentHour() < 10) {
                    dispHour = "0" + String.valueOf(tp.getCurrentHour());
                }
                else {
                    dispHour = String.valueOf(tp.getCurrentHour());
                }
                if (tp.getCurrentMinute() < 10) {
                    dispMinute = "0" + String.valueOf(tp.getCurrentMinute());
                }
                else {
                    dispMinute = String.valueOf(tp.getCurrentMinute());
                }
                    tvDisplay.setText("Time is " + dispHour + ":" + dispMinute);
            }
        });
        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvDisplay.setText("Date is " + dp.getDayOfMonth() + "/" + (dp.getMonth() + 1) + "/" + dp.getYear());
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tp.setCurrentMinute(0);
                tp.setCurrentHour(0);
                dp.updateDate(2020, 1, 1);

            }
        });
    }};