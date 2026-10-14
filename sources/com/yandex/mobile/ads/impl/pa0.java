package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class pa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b90 f24018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f24019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f24020c;

    public pa0(b90 b90Var) {
        fd.j0.i(b90Var, "localStorage");
        this.f24018a = b90Var;
        this.f24019b = new Object();
    }

    public final String a() {
        String str;
        synchronized (this.f24019b) {
            if (this.f24020c == null) {
                this.f24020c = this.f24018a.b("YmadMauid");
            }
            str = this.f24020c;
        }
        return str;
    }

    public final void a(String str) {
        fd.j0.i(str, "mauid");
        synchronized (this.f24019b) {
            this.f24020c = str;
            this.f24018a.putString("YmadMauid", str);
        }
    }
}
