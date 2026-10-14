package com.applovin.exoplayer2.m.a;

import android.media.MediaFormat;
import com.applovin.exoplayer2.l.af;
import com.applovin.exoplayer2.m.l;
import com.applovin.exoplayer2.v;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class h implements a, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f7742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f7743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final af<Long> f7744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final af<e> f7745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile int f7746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f7747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f7748g;

    private void a(byte[] bArr, int i10, long j10) {
        byte[] bArr2 = this.f7748g;
        int i11 = this.f7747f;
        this.f7748g = bArr;
        if (i10 == -1) {
            i10 = this.f7746e;
        }
        this.f7747f = i10;
        if (i11 == i10 && Arrays.equals(bArr2, this.f7748g)) {
            return;
        }
        byte[] bArr3 = this.f7748g;
        e eVarA = bArr3 != null ? f.a(bArr3, this.f7747f) : null;
        if (eVarA == null || !g.a(eVarA)) {
            eVarA = e.a(this.f7747f);
        }
        this.f7745d.a(j10, eVarA);
    }

    @Override // com.applovin.exoplayer2.m.a.a
    public void a() {
        this.f7744c.a();
        this.f7743b.a();
        this.f7742a.set(true);
    }

    public void a(int i10) {
        this.f7746e = i10;
    }

    @Override // com.applovin.exoplayer2.m.l
    public void a(long j10, long j11, v vVar, MediaFormat mediaFormat) {
        this.f7744c.a(j11, Long.valueOf(j10));
        a(vVar.f8208v, vVar.f8209w, j11);
    }

    @Override // com.applovin.exoplayer2.m.a.a
    public void a(long j10, float[] fArr) {
        this.f7743b.a(j10, fArr);
    }
}
