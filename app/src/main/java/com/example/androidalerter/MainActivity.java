package com.example.androidalerter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.tapadoo.alerter.Alerter;
import com.tapadoo.alerter.OnHideAlertListener;
import com.tapadoo.alerter.OnShowAlertListener;

public class MainActivity extends AppCompatActivity {

    Button btn_background, btn_icon, btn_duration, btn_more_text, btn_without_title, btn_on_click, btn_visibility;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_background = (Button)findViewById(R.id.btn_background_color);
        btn_icon = (Button)findViewById(R.id.btn_icon);
        btn_duration = (Button)findViewById(R.id.btn_duration);
        btn_more_text = (Button)findViewById(R.id.btn_more_text);
        btn_without_title = (Button)findViewById(R.id.btn_without_title);
        btn_on_click = (Button)findViewById(R.id.btn_on_click);
        btn_visibility = (Button)findViewById(R.id.btn_visibility);

        btn_background.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Alerter.create(MainActivity.this)
                        .setTitle("Alerter with Background")
                        .setText("This is the alerter")
                        .setBackgroundColor(R.color.alerter_default_success_background)
                        .show();
            }
        });

        btn_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Alerter.create(MainActivity.this)
                        .setTitle("Alerter with Icon")
                        .setText("This is the alerter")
                        .setIcon(R.drawable.ic_alert)
                        .show();
            }
        });

        btn_duration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Alerter.create(MainActivity.this)
                        .setTitle("Alerter with Duration")
                        .setText("This is the alerter")
                        .setDuration(5000)
                        .show();
            }
        });

        btn_more_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Alerter.create(MainActivity.this)
                        .setTitle("Alerter with More Text")
                        .setText("This is the alerter This is the alerter This is the alerter This is the alerter")
                        .show();
            }
        });


        btn_without_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Alerter.create(MainActivity.this)
                        .setText("This is the alerter")
                        .setBackgroundColor(R.color.alerter_default_success_background)
                        .show();
            }
        });


        btn_on_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Alerter.create(MainActivity.this)
                        .setTitle("Alerter with On Click")
                        .setText("This is the alerter")
                        .setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(MainActivity.this, "Alert is clicked", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });


        btn_visibility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Alerter.create(MainActivity.this)
                        .setTitle("Alerter with Visibility")
                        .setText("This is the alerter")
                        .setOnHideListener(new OnHideAlertListener() {
                            @Override
                            public void onHide() {
                                Toast.makeText(MainActivity.this, "Hide Alert", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setOnShowListener(new OnShowAlertListener() {
                            @Override
                            public void onShow() {
                                Toast.makeText(MainActivity.this, "Show Alert", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });
    }
}
