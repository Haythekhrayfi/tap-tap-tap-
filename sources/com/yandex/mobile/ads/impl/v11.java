package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class v11 extends v61 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Object f25774o = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f25775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f25776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f25777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f25778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f25779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f25780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f25781h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f25782i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f25783j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f25784k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f25785l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final bc0 f25786m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final bc0.e f25787n;

    static {
        new bc0.a().b("SinglePeriodTimeline").a(Uri.EMPTY).a();
    }

    public v11(long j10, long j11, boolean z10, bc0 bc0Var, bc0.e eVar) {
        this.f25775b = -9223372036854775807L;
        this.f25776c = -9223372036854775807L;
        this.f25777d = -9223372036854775807L;
        this.f25778e = j10;
        this.f25779f = j11;
        this.f25780g = 0L;
        this.f25781h = 0L;
        this.f25782i = z10;
        this.f25783j = false;
        this.f25784k = false;
        this.f25785l = null;
        this.f25786m = (bc0) pa.a(bc0Var);
        this.f25787n = eVar;
    }

    public v11(long j10, long j11, boolean z10, boolean z11, bc0 bc0Var) {
        this(j10, j11, z10, bc0Var, z11 ? bc0Var.f19173c : null);
    }

    @Override // com.yandex.mobile.ads.impl.v61
    public final int a() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.impl.v61
    public final int a(Object obj) {
        return f25774o.equals(obj) ? 0 : -1;
    }

    @Override // com.yandex.mobile.ads.impl.v61
    public final v61.b a(int i10, v61.b bVar, boolean z10) {
        pa.a(i10, 1);
        Object obj = z10 ? f25774o : null;
        long j10 = this.f25778e;
        long j11 = -this.f25780g;
        Objects.requireNonNull(bVar);
        return bVar.a(null, obj, 0, j10, j11, c4.f19369g, false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d A[PHI: r1
  0x002d: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x0011, B:5:0x0015, B:7:0x001b, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.yandex.mobile.ads.impl.v61
    public final v61.d a(int i10, v61.d dVar, long j10) {
        long j11;
        pa.a(i10, 1);
        long j12 = this.f25781h;
        boolean z10 = this.f25783j;
        if (!z10 || this.f25784k || j10 == 0) {
            j11 = j12;
        } else {
            long j13 = this.f25779f;
            if (j13 != -9223372036854775807L) {
                j12 += j10;
                if (j12 <= j13) {
                    j11 = j12;
                }
            }
            j11 = -9223372036854775807L;
        }
        return dVar.a(v61.d.f25857r, this.f25786m, this.f25785l, this.f25775b, this.f25776c, this.f25777d, this.f25782i, z10, this.f25787n, j11, this.f25779f, 0, 0, this.f25780g);
    }

    @Override // com.yandex.mobile.ads.impl.v61
    public final Object a(int i10) {
        pa.a(i10, 1);
        return f25774o;
    }

    @Override // com.yandex.mobile.ads.impl.v61
    public final int b() {
        return 1;
    }
}
