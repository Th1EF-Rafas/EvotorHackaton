package com.android.mkga;

import android.content.Intent;
import android.support.annotation.Nullable;

import java.util.List;
import java.util.Map;

import ru.evotor.framework.core.IntegrationService;
import ru.evotor.framework.core.action.processor.ActionProcessor;
import ru.evotor.framework.receipt.Position;
import ru.evotor.framework.receipt.Receipt;
import ru.evotor.framework.receipt.ReceiptApi;

public class MyMkgaService extends IntegrationService {

    double checkSum;

    List<Position> positions = ReceiptApi.getReceipt(this, Receipt.Type.SELL).getPositions();


    @Override
    public void onCreate() {
        super.onCreate();
        checkSum = 282.41;
    }

    @Nullable
    @Override
    protected Map<String, ActionProcessor> createProcessors() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("currentCheckSum", checkSum);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        return null;
    }
}

