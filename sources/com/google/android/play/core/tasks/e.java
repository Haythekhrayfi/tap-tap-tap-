package com.google.android.play.core.tasks;

/* JADX INFO: loaded from: classes2.dex */
final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Task f12539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f12540b;

    public e(f fVar, Task task) {
        this.f12540b = fVar;
        this.f12539a = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f12540b.f12542b) {
            if (this.f12540b.f12543c != null) {
                this.f12540b.f12543c.onSuccess(this.f12539a.getResult());
            }
        }
    }
}
