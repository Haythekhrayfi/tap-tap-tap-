package com.yandex.metrica.impl.ob;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class I6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bm f14186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K6 f14187b;

    public I6() {
        this(new Bm(), new K6());
    }

    public I6(Bm bm, K6 k10) {
        this.f14186a = bm;
        this.f14187b = k10;
    }

    public Long a(List<Nc> list) {
        if (U2.b(list)) {
            return null;
        }
        Objects.requireNonNull(this.f14187b);
        Nc nc2 = list.get(Math.min(1, list.size()) - 1);
        long jA = nc2.f14539a;
        long j10 = nc2.f14540b;
        if (jA != j10) {
            jA = this.f14186a.a(jA, j10);
        }
        return Long.valueOf(jA);
    }
}
