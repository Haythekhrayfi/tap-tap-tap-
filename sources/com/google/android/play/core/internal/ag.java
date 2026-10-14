package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ag implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.tasks.i<?> f12243a;

    public ag() {
        this.f12243a = null;
    }

    public ag(com.google.android.play.core.tasks.i<?> iVar) {
        this.f12243a = iVar;
    }

    public abstract void a();

    public final com.google.android.play.core.tasks.i<?> b() {
        return this.f12243a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            com.google.android.play.core.tasks.i<?> iVar = this.f12243a;
            if (iVar != null) {
                iVar.b(e10);
            }
        }
    }
}
