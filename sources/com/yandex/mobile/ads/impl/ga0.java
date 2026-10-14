package com.yandex.mobile.ads.impl;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ga0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ep f20991a;

    public ga0() {
        this(0);
    }

    public /* synthetic */ ga0(int i10) {
        this(new ep());
    }

    public ga0(ep epVar) {
        fd.j0.i(epVar, "deviceInfoProvider");
        this.f20991a = epVar;
    }

    public final boolean a() {
        Objects.requireNonNull(this.f20991a);
        return ed.q.i("Xiaomi", ep.a(), true);
    }
}
