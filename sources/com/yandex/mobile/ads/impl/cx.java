package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.common.AdActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class cx {
    public static Intent a(Context context, long j10, ResultReceiver resultReceiver) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(resultReceiver, "receiver");
        Intent intent = new Intent(context, (Class<?>) AdActivity.class);
        ResultReceiver resultReceiverA = t6.a(resultReceiver);
        intent.putExtra("window_type", "window_type_fullscreen");
        intent.putExtra("extra_receiver", resultReceiverA);
        intent.putExtra("data_identifier", j10);
        if (!(context instanceof Activity)) {
            intent.addFlags(402653184);
        }
        return intent;
    }
}
