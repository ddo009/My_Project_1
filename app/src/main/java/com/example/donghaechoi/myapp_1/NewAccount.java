package com.example.donghaechoi.myapp_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by donghaechoi on 2016. 2. 9..
 */
public class NewAccount extends AppCompatActivity implements View.OnClickListener {

    private EditText mNewId;
    private EditText mNewPassword;
    private Button mAccountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_new_account);


        mNewId = (EditText) findViewById(R.id.new_id);
        mNewPassword = (EditText) findViewById(R.id.new_password);
        mAccountButton = (Button) findViewById(R.id.new_account_button);
        mAccountButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        intent.putExtra("newid", mNewId.getText().toString());
        intent.putExtra("newpassword", mNewPassword.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }


}
