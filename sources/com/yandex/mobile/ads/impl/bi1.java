package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public class bi1 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wm0 f19272a;

    public bi1() {
        this.f19272a = null;
    }

    public bi1(wm0 wm0Var) {
        this.f19272a = wm0Var;
    }

    public bi1(Exception exc) {
        super("Failed to parse response", exc);
        this.f19272a = null;
    }

    public bi1(String str) {
        super(str);
        this.f19272a = null;
    }

    public bi1(Throwable th) {
        super(th);
        this.f19272a = null;
    }
}
