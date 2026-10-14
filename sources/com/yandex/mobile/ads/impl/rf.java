package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.common.AdActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class rf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ResultReceiver f24688b;

    public rf(Context context, ResultReceiver resultReceiver) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(resultReceiver, "receiver");
        this.f24687a = context;
        this.f24688b = resultReceiver;
    }

    public final Intent a(String str) {
        fd.j0.i(str, "browserUrl");
        Intent intent = new Intent(this.f24687a, (Class<?>) AdActivity.class);
        ResultReceiver resultReceiverA = t6.a(this.f24688b);
        intent.putExtra("window_type", "window_type_browser");
        intent.putExtra("extra_receiver", resultReceiverA);
        intent.putExtra("extra_browser_url", str);
        if (!(this.f24687a instanceof Activity)) {
            intent.addFlags(402653184);
        }
        return intent;
    }
}
