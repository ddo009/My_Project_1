package com.example.donghaechoi.myapp_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mLoginId;
    private EditText mPassword;
    private Button mNewAccount;
    private Button mLoginButton;
    private HashMap<String, String> map = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mLoginId = (EditText) findViewById(R.id.login_id);
        mPassword = (EditText) findViewById(R.id.password_password);

        mNewAccount = (Button) findViewById(R.id.new_account_button);
        mNewAccount.setOnClickListener(this);

        mLoginButton = (Button) findViewById(R.id.login_button);
        mLoginButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == mLoginButton.getId()) {
            if (map.containsKey(mLoginId.getText().toString())) {
                if (map.get(mLoginId.getText().toString()).equals(mPassword.getText().toString())) {
                    Intent intent2 = new Intent(this, SecondActivity.class);
                    intent2.putExtra("loginId", mLoginId.getText().toString());
                    intent2.putExtra("password", mPassword.getText().toString());
                    startActivityForResult(intent2, 1);
                } else {
                    Toast.makeText(MainActivity.this, "없는 아이디거나 패스워드가 틀렸습니다.", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(MainActivity.this, "없는 아이디거나 패스워드가 틀렸습니다.", Toast.LENGTH_SHORT).show();
            }
        } else if (v.getId() == mNewAccount.getId()) {
            Intent intent2 = new Intent(this, NewAccount.class);
            startActivityForResult(intent2, 1);
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                if (data != null) {
                    map.put(data.getStringExtra("newid"), data.getStringExtra("newpassword"));
                    Toast.makeText(MainActivity.this, "회원 가입이 완료됐습니다", Toast.LENGTH_SHORT).show();
                }
            }
        }

    }
}
