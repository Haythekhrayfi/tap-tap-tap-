package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ji implements hc0, hc0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hc0 f22050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private hc0.a f22051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a[] f22052d = new a[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f22053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f22054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f22055g;

    public final class a implements fz0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final fz0 f22056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f22057b;

        public a(fz0 fz0Var) {
            this.f22056a = fz0Var;
        }

        @Override // com.yandex.mobile.ads.impl.fz0
        public final int a(long j10) {
            if (ji.this.a()) {
                return -3;
            }
            return this.f22056a.a(j10);
        }

        @Override // com.yandex.mobile.ads.impl.fz0
        public final int a(zv zvVar, an anVar, int i10) {
            if (ji.this.a()) {
                return -3;
            }
            if (this.f22057b) {
                anVar.d(4);
                return -4;
            }
            int iA = this.f22056a.a(zvVar, anVar, i10);
            if (iA == -5) {
                yv yvVar = zvVar.f27433b;
                Objects.requireNonNull(yvVar);
                int i11 = yvVar.B;
                if (i11 != 0 || yvVar.C != 0) {
                    ji jiVar = ji.this;
                    if (jiVar.f22054f != 0) {
                        i11 = 0;
                    }
                    zvVar.f27433b = yvVar.a().e(i11).f(jiVar.f22055g == Long.MIN_VALUE ? yvVar.C : 0).a();
                }
                return -5;
            }
            ji jiVar2 = ji.this;
            long j10 = jiVar2.f22055g;
            if (j10 == Long.MIN_VALUE || ((iA != -4 || anVar.f19006e < j10) && !(iA == -3 && jiVar2.getBufferedPositionUs() == Long.MIN_VALUE && !anVar.f19005d))) {
                return iA;
            }
            anVar.b();
            anVar.d(4);
            this.f22057b = true;
            return -4;
        }

        @Override // com.yandex.mobile.ads.impl.fz0
        public final void a() throws IOException {
            this.f22056a.a();
        }

        public final void b() {
            this.f22057b = false;
        }

        @Override // com.yandex.mobile.ads.impl.fz0
        public final boolean d() {
            return !ji.this.a() && this.f22056a.d();
        }
    }

    public ji(hc0 hc0Var, boolean z10, long j10, long j11) {
        this.f22050b = hc0Var;
        this.f22053e = z10 ? j10 : -9223372036854775807L;
        this.f22054f = j10;
        this.f22055g = j11;
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final long a(long j10, q01 q01Var) {
        long j11 = this.f22054f;
        if (j10 == j11) {
            return j11;
        }
        int i10 = da1.f19803a;
        long jMax = Math.max(0L, Math.min(q01Var.f24289a, j10 - j11));
        long j12 = q01Var.f24290b;
        long j13 = this.f22055g;
        long jMax2 = Math.max(0L, Math.min(j12, j13 == Long.MIN_VALUE ? RecyclerView.FOREVER_NS : j13 - j10));
        if (jMax != q01Var.f24289a || jMax2 != q01Var.f24290b) {
            q01Var = new q01(jMax, jMax2);
        }
        return this.f22050b.a(j10, q01Var);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x0084  */
    @Override // com.yandex.mobile.ads.impl.hc0
    public final long a(et[] etVarArr, boolean[] zArr, fz0[] fz0VarArr, boolean[] zArr2, long j10) {
        long j11;
        boolean z10;
        this.f22052d = new a[fz0VarArr.length];
        fz0[] fz0VarArr2 = new fz0[fz0VarArr.length];
        int i10 = 0;
        while (true) {
            fz0 fz0Var = null;
            if (i10 >= fz0VarArr.length) {
                break;
            }
            a[] aVarArr = this.f22052d;
            a aVar = (a) fz0VarArr[i10];
            aVarArr[i10] = aVar;
            if (aVar != null) {
                fz0Var = aVar.f22056a;
            }
            fz0VarArr2[i10] = fz0Var;
            i10++;
        }
        long jA = this.f22050b.a(etVarArr, zArr, fz0VarArr2, zArr2, j10);
        boolean z11 = true;
        if (a()) {
            long j12 = this.f22054f;
            if (j10 != j12) {
                j11 = -9223372036854775807L;
            } else {
                if (j12 == 0) {
                    z10 = false;
                    break;
                }
                int length = etVarArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        z10 = false;
                        break;
                    }
                    et etVar = etVarArr[i11];
                    if (etVar != null) {
                        yv yvVarD = etVar.d();
                        if (!te0.a(yvVarD.f27115l, yvVarD.f27112i)) {
                            z10 = true;
                            break;
                        }
                    }
                    i11++;
                }
                if (z10) {
                    j11 = jA;
                } else {
                    j11 = -9223372036854775807L;
                }
            }
        } else {
            j11 = -9223372036854775807L;
        }
        this.f22053e = j11;
        if (jA != j10) {
            if (jA >= this.f22054f) {
                long j13 = this.f22055g;
                if (j13 != Long.MIN_VALUE && jA > j13) {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
        }
        pa.b(z11);
        for (int i12 = 0; i12 < fz0VarArr.length; i12++) {
            fz0 fz0Var2 = fz0VarArr2[i12];
            if (fz0Var2 == null) {
                this.f22052d[i12] = null;
            } else {
                a[] aVarArr2 = this.f22052d;
                a aVar2 = aVarArr2[i12];
                if (aVar2 == null || aVar2.f22056a != fz0Var2) {
                    aVarArr2[i12] = new a(fz0Var2);
                }
            }
            fz0VarArr[i12] = this.f22052d[i12];
        }
        return jA;
    }

    public final void a(long j10) {
        this.f22054f = 0L;
        this.f22055g = j10;
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final void a(hc0.a aVar, long j10) {
        this.f22051c = aVar;
        this.f22050b.a(this, j10);
    }

    @Override // com.yandex.mobile.ads.impl.hc0.a
    public final void a(hc0 hc0Var) {
        hc0.a aVar = this.f22051c;
        Objects.requireNonNull(aVar);
        aVar.a((hc0) this);
    }

    @Override // com.yandex.mobile.ads.impl.y01.a
    public final void a(y01 y01Var) {
        hc0.a aVar = this.f22051c;
        Objects.requireNonNull(aVar);
        aVar.a(this);
    }

    public final boolean a() {
        return this.f22053e != -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final boolean continueLoading(long j10) {
        return this.f22050b.continueLoading(j10);
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final void discardBuffer(long j10, boolean z10) {
        this.f22050b.discardBuffer(j10, z10);
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.f22050b.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j10 = this.f22055g;
            if (j10 == Long.MIN_VALUE || bufferedPositionUs < j10) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f22050b.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j10 = this.f22055g;
            if (j10 == Long.MIN_VALUE || nextLoadPositionUs < j10) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final i71 getTrackGroups() {
        return this.f22050b.getTrackGroups();
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final boolean isLoading() {
        return this.f22050b.isLoading();
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final void maybeThrowPrepareError() throws IOException {
        this.f22050b.maybeThrowPrepareError();
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final long readDiscontinuity() {
        if (a()) {
            long j10 = this.f22053e;
            this.f22053e = -9223372036854775807L;
            long discontinuity = readDiscontinuity();
            return discontinuity != -9223372036854775807L ? discontinuity : j10;
        }
        long discontinuity2 = this.f22050b.readDiscontinuity();
        if (discontinuity2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = true;
        pa.b(discontinuity2 >= this.f22054f);
        long j11 = this.f22055g;
        if (j11 != Long.MIN_VALUE && discontinuity2 > j11) {
            z10 = false;
        }
        pa.b(z10);
        return discontinuity2;
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final void reevaluateBuffer(long j10) {
        this.f22050b.reevaluateBuffer(j10);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    @Override // com.yandex.mobile.ads.impl.hc0
    public final long seekToUs(long j10) {
        this.f22053e = -9223372036854775807L;
        boolean z10 = false;
        for (a aVar : this.f22052d) {
            if (aVar != null) {
                aVar.b();
            }
        }
        long jSeekToUs = this.f22050b.seekToUs(j10);
        if (jSeekToUs == j10) {
            z10 = true;
        } else if (jSeekToUs >= this.f22054f) {
            long j11 = this.f22055g;
            if (j11 == Long.MIN_VALUE || jSeekToUs <= j11) {
                z10 = true;
            }
        }
        pa.b(z10);
        return jSeekToUs;
    }
}
