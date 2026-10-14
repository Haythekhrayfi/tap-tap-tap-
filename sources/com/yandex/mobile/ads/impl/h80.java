package com.yandex.mobile.ads.impl;

import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public final class h80 implements kg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f21337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TreeSet<qg> f21338b = new TreeSet<>(zn1.f27382j);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f21339c;

    public h80(long j10) {
        this.f21337a = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a(qg qgVar, qg qgVar2) {
        long j10 = qgVar.f24488f;
        long j11 = qgVar2.f24488f;
        if (j10 - j11 != 0) {
            return j10 < j11 ? -1 : 1;
        }
        if (!qgVar.f24483a.equals(qgVar2.f24483a)) {
            return qgVar.f24483a.compareTo(qgVar2.f24483a);
        }
        long j12 = qgVar.f24484b - qgVar2.f24484b;
        if (j12 == 0) {
            return 0;
        }
        return j12 < 0 ? -1 : 1;
    }

    public final void a(dg dgVar, long j10) {
        if (j10 != -1) {
            while (this.f21339c + j10 > this.f21337a && !this.f21338b.isEmpty()) {
                dgVar.a(this.f21338b.first());
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.dg.b
    public final void a(dg dgVar, qg qgVar) {
        this.f21338b.add(qgVar);
        this.f21339c += qgVar.f24485c;
        while (this.f21339c + 0 > this.f21337a && !this.f21338b.isEmpty()) {
            dgVar.a(this.f21338b.first());
        }
    }

    @Override // com.yandex.mobile.ads.impl.dg.b
    public final void a(dg dgVar, qg qgVar, qg qgVar2) {
        a(qgVar);
        a(dgVar, qgVar2);
    }

    @Override // com.yandex.mobile.ads.impl.dg.b
    public final void a(qg qgVar) {
        this.f21338b.remove(qgVar);
        this.f21339c -= qgVar.f24485c;
    }
}
