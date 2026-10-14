package com.applovin.impl.sdk.e;

/* JADX INFO: loaded from: classes.dex */
public class ac extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f10507a;

    public ac(com.applovin.impl.sdk.o oVar, String str, Runnable runnable) {
        this(oVar, false, str, runnable);
    }

    public ac(com.applovin.impl.sdk.o oVar, boolean z10, String str, Runnable runnable) {
        super(i.f.a("TaskRunnable:", str), oVar, z10);
        this.f10507a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f10507a.run();
    }
}
