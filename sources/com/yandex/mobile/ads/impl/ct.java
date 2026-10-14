package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class ct {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f19624b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile ct f19625c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bt f19626a = new bt(mf1.a());

    private ct() {
    }

    public static ct a() {
        if (f19625c == null) {
            synchronized (f19624b) {
                if (f19625c == null) {
                    f19625c = new ct();
                }
            }
        }
        return f19625c;
    }

    public final ft a(sc1 sc1Var) {
        return this.f19626a.get(sc1Var);
    }

    public final void a(sc1 sc1Var, ft ftVar) {
        this.f19626a.put(sc1Var, ftVar);
    }
}
