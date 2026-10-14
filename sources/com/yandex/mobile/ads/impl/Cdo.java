package com.yandex.mobile.ads.impl;

import ch.qos.logback.classic.Level;

/* JADX INFO: renamed from: com.yandex.mobile.ads.impl.do, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class Cdo implements t80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jn f19920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f19921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f19922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f19923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f19924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f19925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f19926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f19927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f19928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f19929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f19930k;

    public Cdo() {
        this(new jn());
    }

    public Cdo(jn jnVar) {
        a(2500, 0, "bufferForPlaybackMs", "0");
        a(Level.TRACE_INT, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        a(50000, Level.TRACE_INT, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f19920a = jnVar;
        long j10 = 50000;
        this.f19921b = da1.a(j10);
        this.f19922c = da1.a(j10);
        this.f19923d = da1.a(2500);
        this.f19924e = da1.a(Level.TRACE_INT);
        this.f19925f = -1;
        this.f19929j = 13107200;
        this.f19926g = false;
        this.f19927h = da1.a(0);
        this.f19928i = false;
    }

    private static void a(int i10, int i11, String str, String str2) {
        pa.a(str + " cannot be less than " + str2, i10 >= i11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.yandex.mobile.ads.impl.t80
    public final void a(pv0[] pv0VarArr, et[] etVarArr) {
        int iMax = this.f19925f;
        if (iMax == -1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = 13107200;
                if (i10 < pv0VarArr.length) {
                    if (etVarArr[i10] != null) {
                        switch (pv0VarArr[i10].m()) {
                            case -2:
                                i12 = 0;
                                i11 += i12;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i12 = 144310272;
                                i11 += i12;
                                break;
                            case 1:
                                i11 += i12;
                                break;
                            case 2:
                                i12 = 131072000;
                                i11 += i12;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i12 = 131072;
                                i11 += i12;
                                break;
                        }
                    }
                    i10++;
                } else {
                    iMax = Math.max(13107200, i11);
                }
            }
        }
        this.f19929j = iMax;
        this.f19920a.a(iMax);
    }

    @Override // com.yandex.mobile.ads.impl.t80
    public final boolean a() {
        return this.f19928i;
    }

    @Override // com.yandex.mobile.ads.impl.t80
    public final boolean a(long j10, float f10) {
        boolean z10 = true;
        boolean z11 = this.f19920a.c() >= this.f19929j;
        long jMin = this.f19921b;
        if (f10 > 1.0f) {
            int i10 = da1.f19803a;
            if (f10 != 1.0f) {
                jMin = Math.round(jMin * ((double) f10));
            }
            jMin = Math.min(jMin, this.f19922c);
        }
        if (j10 < Math.max(jMin, 500000L)) {
            if (!this.f19926g && z11) {
                z10 = false;
            }
            this.f19930k = z10;
            if (!z10 && j10 < 500000) {
                p90.d("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= this.f19922c || z11) {
            this.f19930k = false;
        }
        return this.f19930k;
    }

    @Override // com.yandex.mobile.ads.impl.t80
    public final boolean a(long j10, float f10, boolean z10, long j11) {
        int i10 = da1.f19803a;
        if (f10 != 1.0f) {
            j10 = Math.round(j10 / ((double) f10));
        }
        long jMin = z10 ? this.f19924e : this.f19923d;
        if (j11 != -9223372036854775807L) {
            jMin = Math.min(j11 / 2, jMin);
        }
        return jMin <= 0 || j10 >= jMin || (!this.f19926g && this.f19920a.c() >= this.f19929j);
    }

    @Override // com.yandex.mobile.ads.impl.t80
    public final void b() {
        int i10 = this.f19925f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f19929j = i10;
        this.f19930k = false;
        this.f19920a.d();
    }

    @Override // com.yandex.mobile.ads.impl.t80
    public final jn c() {
        return this.f19920a;
    }

    @Override // com.yandex.mobile.ads.impl.t80
    public final void d() {
        int i10 = this.f19925f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f19929j = i10;
        this.f19930k = false;
        this.f19920a.d();
    }

    @Override // com.yandex.mobile.ads.impl.t80
    public final long e() {
        return this.f19927h;
    }

    @Override // com.yandex.mobile.ads.impl.t80
    public final void f() {
        int i10 = this.f19925f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f19929j = i10;
        this.f19930k = false;
    }
}
