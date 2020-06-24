package com.example.hw21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        subsription();
    }


private void subsription(){
        final Button ok = (Button) findViewById(R.id.okButton);
        final Button clear = (Button) findViewById(R.id.clearButton);
        final EditText editName = findViewById(R.id.editName);
        final EditText editEmail = findViewById(R.id.editEmailAddress);
        final TextView subscription = findViewById(R.id.textAfterSubscription);

            ok.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    subscription.setText(null);
                    subscription.setText("Подписка на рассылку успешно оформлена для пользователя " + editName.getText() + " на электронный адрес " + editEmail.getText());
                }

            });
    clear.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            editName.setText(null);
            editEmail.setText(null);
        }
    });
    }
}