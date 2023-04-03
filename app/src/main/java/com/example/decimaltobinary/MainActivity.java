package com.example.decimaltobinary;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button btn;
    private TextView txtresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edittext);
        btn = findViewById(R.id.btn);
        txtresult = findViewById(R.id.txtresult);

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String input = editText.getText().toString();
                int decimal = Integer.parseInt(input);
                String binary = Integer.toBinaryString(decimal);
                txtresult.setText(binary);
            }
        });
    }
}
