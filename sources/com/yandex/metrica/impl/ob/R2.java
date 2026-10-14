package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class R2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Om f14847a;

    public R2() {
        this(new Nm());
    }

    public R2(Om om) {
        this.f14847a = om;
    }

    private boolean a(long j10, long j11, long j12) {
        return j10 < j11 || j10 - j11 >= j12;
    }

    public boolean a(long j10, long j11, String str) {
        return a(this.f14847a.a(), j10, j11);
    }

    public boolean b(long j10, long j11, String str) {
        return a(this.f14847a.b(), j10, j11);
    }
}
