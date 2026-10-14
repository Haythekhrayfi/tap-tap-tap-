package com.google.android.play.core.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class l implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f12548a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f12548a.post(runnable);
    }
}
