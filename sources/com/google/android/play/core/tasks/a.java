package com.google.android.play.core.tasks;

/* JADX INFO: loaded from: classes2.dex */
final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Task f12529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f12530b;

    public a(b bVar, Task task) {
        this.f12530b = bVar;
        this.f12529a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f12530b.f12532b) {
            if (this.f12530b.f12533c != null) {
                this.f12530b.f12533c.onComplete(this.f12529a);
            }
        }
    }
}
