package com.opz.android.prime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Prime mPrime;
    private EditText mPrimeInput;
    private Button mCheckPrimeButton;

    private void update(){
        if (mPrime.getStoreNumber() == "1") {
            Toast.makeText(this, R.string.prime_number, Toast.LENGTH_LONG).show();
        }else{
            if (mPrime.isCheckPrime()) {
                Toast.makeText(this, R.string.prime_number, Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this, R.string.not_prime_number, Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPrime = new Prime();

        mPrimeInput = (EditText) findViewById(R.id.prime_editText);
        mCheckPrimeButton = (Button) findViewById(R.id.check_prime_button);

        // Whenever text changes the new string is stored
        mPrimeInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mPrime.setStoreNumber(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        // Button checks if it is a prime or not
        mCheckPrimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update();
            }
        });
    }
}