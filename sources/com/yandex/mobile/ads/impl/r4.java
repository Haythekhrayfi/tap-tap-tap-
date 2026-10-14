package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class r4 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b00 f24594b;

    public final void a(b00 b00Var) {
        this.f24594b = b00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b00 b00Var = this.f24594b;
        if (b00Var != null) {
            b00Var.a(v4.f25827j);
        }
    }
}
