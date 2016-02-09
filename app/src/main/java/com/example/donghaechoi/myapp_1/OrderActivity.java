package com.example.donghaechoi.myapp_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by donghaechoi on 2016. 2. 9..
 */
public class OrderActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mPlusButton;
    private Button mMinusButton;
    private TextView mOrder;
    static int order = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_order);

        mOrder = (TextView) findViewById(R.id.order);

        mPlusButton = (Button) findViewById(R.id.plus_button);
        mMinusButton = (Button) findViewById(R.id.minus_button);
        mPlusButton.setOnClickListener(this);
        mMinusButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == mPlusButton.getId()) {
            order++;
            mOrder.setText(mOrder.getText().toString() + order);
        } else if (v.getId() == mMinusButton.getId()) {
            if (order > 0) {
                order--;
                mOrder.setText(mOrder.getText().toString() + order);
            }
        }
    }
}
