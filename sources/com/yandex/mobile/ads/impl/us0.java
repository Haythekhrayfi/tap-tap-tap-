package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class us0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j9 f25737a = new j9();

    public static void a(ProgressBar progressBar, a50 a50Var) {
        progressBar.setProgress((int) (a50Var.b() * progressBar.getMax()));
    }

    public final void a(ProgressBar progressBar, long j10, long j11) {
        Objects.requireNonNull(this.f25737a);
        j9.a(progressBar, j11, j10);
    }
}
