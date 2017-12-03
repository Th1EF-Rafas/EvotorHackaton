package com.android.mkga;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends Activity {

    private static final String TAG = "com.android.mkga";

    @BindView(R.id.checkSumText) TextView checkSumText;
    @BindView(R.id.checkSumNumber) TextView checkSumNumber;
    @BindView(R.id.checkSumToPay) TextView checkSumToPayText;
    @BindView(R.id.checkSumToPayNumber) TextView checkSumToPayNumber;


    @BindView(R.id.notips) Button noTipsButton;
    @BindView(R.id.tipsRound) Button tipsRoundButton;
    @BindView(R.id.tips10) Button tips10Button;
    @BindView(R.id.tips15) Button tips15Button;
    @BindView(R.id.acceptAndReturn) Button acceptAndReturnButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG, "Activity created");

        ButterKnife.bind(this);
    }

    public void noTipsClick(View view) {

        checkSumToPayNumber.setText(checkSumNumber.getText());

    }

    public void tipsRoundClick(View view) {

        checkSumToPayNumber.setText("300.00");

    }

    public void tips10Click(View view) {

        checkSumToPayNumber.setText("330.00");

    }

    public void tips15Click(View view) {

        checkSumToPayNumber.setText("350.00");

    }

    public void acceptAndReturn(View view) {

        finish();

    }

}
