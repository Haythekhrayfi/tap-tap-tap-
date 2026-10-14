package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class co implements s80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f19573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f19574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f19575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f19576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f19577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f19578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f19579g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f19580h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f19581i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f19582j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f19583k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f19584l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f19585m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f19586n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f19587o;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f19588a = da1.a(20L);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f19589b = da1.a(500L);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f19590c = 0.999f;

        public final co a() {
            return new co(this.f19588a, this.f19589b, this.f19590c, 0);
        }
    }

    private co(long j10, long j11, float f10) {
        this.f19573a = j10;
        this.f19574b = j11;
        this.f19575c = f10;
        this.f19576d = -9223372036854775807L;
        this.f19577e = -9223372036854775807L;
        this.f19579g = -9223372036854775807L;
        this.f19580h = -9223372036854775807L;
        this.f19583k = 0.97f;
        this.f19582j = 1.03f;
        this.f19584l = 1.0f;
        this.f19585m = -9223372036854775807L;
        this.f19578f = -9223372036854775807L;
        this.f19581i = -9223372036854775807L;
        this.f19586n = -9223372036854775807L;
        this.f19587o = -9223372036854775807L;
    }

    public /* synthetic */ co(long j10, long j11, float f10, int i10) {
        this(j10, j11, f10);
    }

    private void b() {
        long j10 = this.f19576d;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f19577e;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f19579g;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f19580h;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f19578f == j10) {
            return;
        }
        this.f19578f = j10;
        this.f19581i = j10;
        this.f19586n = -9223372036854775807L;
        this.f19587o = -9223372036854775807L;
        this.f19585m = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ce  */
    public final float a(long j10, long j11) {
        long j12;
        long j13;
        if (this.f19576d == -9223372036854775807L) {
            return 1.0f;
        }
        long j14 = j10 - j11;
        long j15 = this.f19586n;
        if (j15 == -9223372036854775807L) {
            this.f19586n = j14;
            j12 = 0;
        } else {
            float f10 = this.f19575c;
            long jMax = Math.max(j14, (long) (((1.0f - f10) * j14) + (j15 * f10)));
            this.f19586n = jMax;
            long jAbs = Math.abs(j14 - jMax);
            long j16 = this.f19587o;
            float f11 = this.f19575c;
            j12 = (long) (((1.0f - f11) * jAbs) + (j16 * f11));
        }
        this.f19587o = j12;
        if (this.f19585m != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f19585m < 1000) {
            return this.f19584l;
        }
        this.f19585m = SystemClock.elapsedRealtime();
        long j17 = (this.f19587o * 3) + this.f19586n;
        if (this.f19581i <= j17) {
            long jMax2 = j10 - ((long) (Math.max(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, this.f19584l - 1.0f) / 1.0E-7f));
            long j18 = this.f19581i;
            int i10 = da1.f19803a;
            long jMax3 = Math.max(j18, Math.min(jMax2, j17));
            this.f19581i = jMax3;
            j17 = this.f19580h;
            if (j17 != -9223372036854775807L && jMax3 > j17) {
            }
            j13 = j10 - this.f19581i;
            if (Math.abs(j13) < this.f19573a) {
                this.f19584l = 1.0f;
            } else {
                float f12 = this.f19583k;
                float f13 = this.f19582j;
                int i11 = da1.f19803a;
                this.f19584l = Math.max(f12, Math.min((j13 * 1.0E-7f) + 1.0f, f13));
            }
            return this.f19584l;
        }
        float fA = da1.a(1000L);
        long[] jArr = {j17, this.f19578f, this.f19581i - (((long) ((this.f19584l - 1.0f) * fA)) + ((long) ((this.f19582j - 1.0f) * fA)))};
        for (int i12 = 1; i12 < 3; i12++) {
            long j19 = jArr[i12];
            if (j19 > j17) {
                j17 = j19;
            }
        }
        this.f19581i = j17;
        j13 = j10 - this.f19581i;
        if (Math.abs(j13) < this.f19573a) {
            this.f19584l = 1.0f;
        } else {
            float f14 = this.f19583k;
            float f15 = this.f19582j;
            int i13 = da1.f19803a;
            this.f19584l = Math.max(f14, Math.min((j13 * 1.0E-7f) + 1.0f, f15));
        }
        return this.f19584l;
    }

    public final long a() {
        return this.f19581i;
    }

    public final void a(long j10) {
        this.f19577e = j10;
        b();
    }

    public final void a(bc0.e eVar) {
        this.f19576d = da1.a(eVar.f19210a);
        this.f19579g = da1.a(eVar.f19211b);
        this.f19580h = da1.a(eVar.f19212c);
        float f10 = eVar.f19213d;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        this.f19583k = f10;
        float f11 = eVar.f19214e;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        this.f19582j = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            this.f19576d = -9223372036854775807L;
        }
        b();
    }

    public final void c() {
        long j10 = this.f19581i;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.f19574b;
        this.f19581i = j11;
        long j12 = this.f19580h;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.f19581i = j12;
        }
        this.f19585m = -9223372036854775807L;
    }
}
