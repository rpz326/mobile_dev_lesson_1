package ru.mirea.sukhanovmd.layouttype;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TextView myTextView = (TextView) findViewById(R.id.textView);
        myTextView.setText("New text in MIREA");
        Button button = findViewById(R.id.button20);
        button.setText("MireaButton");
        CheckBox checkBox = findViewById(R.id.checkBox2);
        checkBox.setChecked(true);
    }
}