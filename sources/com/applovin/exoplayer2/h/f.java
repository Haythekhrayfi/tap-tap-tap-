package com.applovin.exoplayer2.h;

import android.content.Context;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.i.a f6553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<r> f6554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f6555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f6556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f6557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f6558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f6559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f6560h;

    public f(Context context, com.applovin.exoplayer2.e.l lVar) {
        this(new com.applovin.exoplayer2.k.o.a(context), lVar);
    }

    public f(com.applovin.exoplayer2.k.i.a aVar, com.applovin.exoplayer2.e.l lVar) {
        this.f6553a = aVar;
        SparseArray<r> sparseArrayA = a(aVar, lVar);
        this.f6554b = sparseArrayA;
        this.f6555c = new int[sparseArrayA.size()];
        for (int i10 = 0; i10 < this.f6554b.size(); i10++) {
            this.f6555c[i10] = this.f6554b.keyAt(i10);
        }
        this.f6556d = -9223372036854775807L;
        this.f6557e = -9223372036854775807L;
        this.f6558f = -9223372036854775807L;
        this.f6559g = -3.4028235E38f;
        this.f6560h = -3.4028235E38f;
    }

    private static SparseArray<r> a(com.applovin.exoplayer2.k.i.a aVar, com.applovin.exoplayer2.e.l lVar) {
        SparseArray<r> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (r) Class.forName("com.applovin.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(r.class).getConstructor(com.applovin.exoplayer2.k.i.a.class).newInstance(aVar));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (r) Class.forName("com.applovin.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(r.class).getConstructor(com.applovin.exoplayer2.k.i.a.class).newInstance(aVar));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (r) Class.forName("com.applovin.exoplayer2.source.hls.HlsMediaSource$Factory").asSubclass(r.class).getConstructor(com.applovin.exoplayer2.k.i.a.class).newInstance(aVar));
        } catch (Exception unused3) {
        }
        try {
            sparseArray.put(3, (r) Class.forName("com.applovin.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(r.class).getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception unused4) {
        }
        sparseArray.put(4, new u.a(aVar, lVar));
        return sparseArray;
    }
}
