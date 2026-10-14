package com.google.android.play.core.tasks;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class b<ResultT> implements g<ResultT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f12531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f12532b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final OnCompleteListener<ResultT> f12533c;

    public b(Executor executor, OnCompleteListener<ResultT> onCompleteListener) {
        this.f12531a = executor;
        this.f12533c = onCompleteListener;
    }

    @Override // com.google.android.play.core.tasks.g
    public final void a(Task<ResultT> task) {
        synchronized (this.f12532b) {
            if (this.f12533c == null) {
                return;
            }
            this.f12531a.execute(new a(this, task));
        }
    }
}
