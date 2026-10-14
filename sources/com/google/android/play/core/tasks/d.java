package com.google.android.play.core.tasks;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class d<ResultT> implements g<ResultT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f12536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f12537b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final OnFailureListener f12538c;

    public d(Executor executor, OnFailureListener onFailureListener) {
        this.f12536a = executor;
        this.f12538c = onFailureListener;
    }

    @Override // com.google.android.play.core.tasks.g
    public final void a(Task<ResultT> task) {
        if (task.isSuccessful()) {
            return;
        }
        synchronized (this.f12537b) {
            if (this.f12538c == null) {
                return;
            }
            this.f12536a.execute(new c(this, task));
        }
    }
}
