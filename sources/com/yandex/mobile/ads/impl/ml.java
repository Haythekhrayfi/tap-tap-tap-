package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ys0 f23106a = new ys0();

    public final void a(TextView textView, long j10, long j11) {
        Objects.requireNonNull(this.f23106a);
        long jCeil = (long) Math.ceil((j10 - j11) / 1000.0f);
        textView.setText(String.format(Locale.US, "%02d:%02d", Long.valueOf(jCeil / 60), Long.valueOf(jCeil % 60)));
    }
}
