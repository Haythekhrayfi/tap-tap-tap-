package com.yandex.metrica.impl.ob;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Ed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Nc> f13906c;

    public Ed(long j10, boolean z10, List<Nc> list) {
        this.f13904a = j10;
        this.f13905b = z10;
        this.f13906c = list;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("WakeupConfig{collectionDuration=");
        sbA.append(this.f13904a);
        sbA.append(", aggressiveRelaunch=");
        sbA.append(this.f13905b);
        sbA.append(", collectionIntervalRanges=");
        return l1.f.a(sbA, this.f13906c, '}');
    }
}
