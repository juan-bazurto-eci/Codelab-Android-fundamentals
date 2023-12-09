    package com.example.helloworld;

    import android.os.Bundle;
    import android.util.Log;

    import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello World");
        try {
            String name = "John";
            if (name.equals("John")) {
                // do something
            }
        } catch (Exception e) {
            Log.e("MainActivity", "An error occurred: " + e.getMessage(), e);
        }
    }
}