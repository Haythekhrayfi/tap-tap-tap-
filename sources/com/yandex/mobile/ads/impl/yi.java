package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class yi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j9 f26854a;

    public /* synthetic */ yi() {
        this(new j9());
    }

    public yi(j9 j9Var) {
        fd.j0.i(j9Var, "animatedProgressBarController");
        this.f26854a = j9Var;
    }

    public static void a(ProgressBar progressBar, int i10) {
        fd.j0.i(progressBar, "progressBar");
        progressBar.setMax(i10);
        progressBar.setVisibility(0);
    }

    public final void a(ProgressBar progressBar, long j10, long j11) {
        fd.j0.i(progressBar, "progressBar");
        Objects.requireNonNull(this.f26854a);
        j9.a(progressBar, j10, j11);
    }
}
