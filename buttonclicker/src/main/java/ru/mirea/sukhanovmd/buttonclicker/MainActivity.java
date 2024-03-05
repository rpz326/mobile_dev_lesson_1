package ru.mirea.sukhanovmd.buttonclicker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView textViewStudent;
    private Button btnWhoAmI;
    private Button btnItIsNotMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        textViewStudent = findViewById(R.id.tvOut);
        btnWhoAmI = findViewById(R.id.WhoAmI);
        btnItIsNotMe = findViewById(R.id.ItIsNotMe);
        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStudent.setText("Мой номер по списку № 21");
            }
        };
        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);

    }

    public void onMyButtonClick(View view) {
        textViewStudent = findViewById(R.id.tvOut);
        CheckBox checkBox = findViewById(R.id.checkBox);
        Toast.makeText(this, "Ещё один способ!", Toast.LENGTH_SHORT).show();
        textViewStudent.setText("Это не я сделал");
        checkBox.setChecked(!checkBox.isChecked());
    }
}