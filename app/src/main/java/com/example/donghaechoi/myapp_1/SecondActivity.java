package com.example.donghaechoi.myapp_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by donghaechoi on 2016. 2. 8..
 */
public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mId;
    private Button mGogec;
    private Button mMaechul;
    private Button mSangPoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        mId = (TextView) findViewById(R.id.text_id);
        mId.setText(intent.getStringExtra("loginId") + mId.getText().toString());

        mGogec = (Button) findViewById(R.id.gogec_gwanli);
        mMaechul = (Button) findViewById(R.id.maechul_gwanli);
        mSangPoom = (Button) findViewById(R.id.sangpoom_gwanli);

        mGogec.setOnClickListener(this);
        mMaechul.setOnClickListener(this);
        mSangPoom.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.gogec_gwanli) {

        } else if (v.getId() == R.id.maechul_gwanli) {

        } else if (v.getId() == R.id.sangpoom_gwanli) {
            Intent intent = new Intent(this, OrderActivity.class);
            startActivity(intent);
        }

    }
}
