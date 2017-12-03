package com.android.mkga;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;

public class MainActivity extends Activity {

    @BindView(R.id.checkSumText) TextView checkSumText;
    @BindView(R.id.checkSumNumber) TextView checkSumNumber;
    @BindView(R.id.checkSumToPay) TextView checkSumToPayText;
    @BindView(R.id.checkSumToPayNumber) TextView checkSumToPayNumber;
    

    @BindView(R.id.notips) Button noTipsButton;
    @BindView(R.id.tipsRound) Button tipsRoundButton;
    @BindView(R.id.tips10) Button tips10Button;
    @BindView(R.id.tips15) Button tips15Button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void noTipsClick(View view) {

    }

    public void tipsRoundClick(View view) {

    }

    public void tips10Click(View view) {

    }

    public void tips15Click(View view) {

    }





}
