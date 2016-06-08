package com.example.temperatureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView inFahrenheit;
    private TextView inCelsius;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get all buttons and text views
        Button buttonToFahrenheit = (Button) findViewById(R.id.button_to_f);
        Button buttonToCelsius = (Button) findViewById(R.id.button_to_c);
        this.inFahrenheit = (TextView) findViewById(R.id.in_f);
        this.inCelsius = (TextView) findViewById(R.id.in_c);

        // Set the event listeners
        buttonToFahrenheit.setOnClickListener(new ToFahrenheitListener());
        buttonToCelsius.setOnClickListener(new ToCelsiusListener());
    }

    private class ToFahrenheitListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            // Get the value of the text field
            String celsius = inCelsius.getText().toString();

            // Calculate fahrenheit
            double fahrenheit = celsius.isEmpty() ? 32. : Converter.celsiusToFahrenheit(Double.parseDouble(celsius));

            // Output it
            inFahrenheit.setText(String.format(Locale.US, "%.2f", fahrenheit));
        }
    }

    private class ToCelsiusListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            // Get the value of the text field
            String fahrenheit = inFahrenheit.getText().toString();

            // Calculate fahrenheit
            double celsius = fahrenheit.isEmpty() ? -17.7778 : Converter.fahrenheitToCelsius(Double.parseDouble(fahrenheit));

            // Output it
            inCelsius.setText(String.format(Locale.US, "%.2f", celsius));
        }
    }
}
