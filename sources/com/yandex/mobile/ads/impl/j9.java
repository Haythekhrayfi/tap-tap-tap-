package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes3.dex */
public final class j9 {
    public static void a(ProgressBar progressBar, long j10, long j11) {
        progressBar.clearAnimation();
        if (j10 > 0) {
            progressBar.setMax((int) j10);
            ss0 ss0Var = new ss0(progressBar, progressBar.getProgress(), (int) j11);
            ss0Var.setDuration(200L);
            progressBar.startAnimation(ss0Var);
        }
    }
}
