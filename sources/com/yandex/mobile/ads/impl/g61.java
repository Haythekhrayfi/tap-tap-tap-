package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class g61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f20956a = TimeUnit.SECONDS.toMillis(1);

    public static void a(TextView textView, long j10, long j11) {
        textView.setText(String.valueOf((int) Math.ceil((j10 - j11) / f20956a)));
    }
}
