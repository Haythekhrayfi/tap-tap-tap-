package com.google.android.play.core.tasks;

/* JADX INFO: loaded from: classes2.dex */
final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Task f12534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f12535b;

    public c(d dVar, Task task) {
        this.f12535b = dVar;
        this.f12534a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f12535b.f12537b) {
            if (this.f12535b.f12538c != null) {
                this.f12535b.f12538c.onFailure(this.f12534a.getException());
            }
        }
    }
}
