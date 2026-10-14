package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f18754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ResultReceiver f18755b;

    public a1(Activity activity, ResultReceiver resultReceiver) {
        this.f18754a = activity;
        this.f18755b = resultReceiver;
    }

    public final void a() {
        this.f18754a.finish();
    }

    public final void a(int i10) {
        try {
            if (Build.VERSION.SDK_INT != 26) {
                this.f18754a.setRequestedOrientation(i10);
            }
        } catch (Exception unused) {
            x60.b("Failed to change orientation", new Object[0]);
        }
    }

    public final void a(int i10, Bundle bundle) {
        ResultReceiver resultReceiver = this.f18755b;
        if (resultReceiver != null) {
            resultReceiver.send(i10, bundle);
        }
    }
}
