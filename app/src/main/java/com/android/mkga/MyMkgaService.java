package com.android.mkga;

import android.content.Intent;
import android.support.annotation.Nullable;

import java.util.Map;

import ru.evotor.framework.core.IntegrationService;
import ru.evotor.framework.core.action.processor.ActionProcessor;

public class MyMkgaService extends IntegrationService {

    double checkSum;

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
        startActivity(intent);
        return null;
    }
}

