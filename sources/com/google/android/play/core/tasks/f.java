package com.google.android.play.core.tasks;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class f<ResultT> implements g<ResultT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f12541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f12542b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final OnSuccessListener<? super ResultT> f12543c;

    public f(Executor executor, OnSuccessListener<? super ResultT> onSuccessListener) {
        this.f12541a = executor;
        this.f12543c = onSuccessListener;
    }

    @Override // com.google.android.play.core.tasks.g
    public final void a(Task<ResultT> task) {
        if (task.isSuccessful()) {
            synchronized (this.f12542b) {
                if (this.f12543c == null) {
                    return;
                }
                this.f12541a.execute(new e(this, task));
            }
        }
    }
}
