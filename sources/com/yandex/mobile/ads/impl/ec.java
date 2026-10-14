package com.yandex.mobile.ads.impl;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class ec {
    private long A;
    private long B;
    private long C;
    private boolean D;
    private long E;
    private long F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f20144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f20145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AudioTrack f20146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private dc f20149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f20151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f20152i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f20153j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f20154k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f20155l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f20156m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Method f20157n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f20158o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f20159p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f20160q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f20161r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f20162s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f20163t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f20164u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f20165v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f20166w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f20167x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f20168y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f20169z;

    public interface a {
        void a(int i10, long j10);

        void a(long j10);

        void a(long j10, long j11, long j12, long j13);

        void b(long j10);

        void b(long j10, long j11, long j12, long j13);
    }

    public ec(a aVar) {
        this.f20144a = (a) pa.a(aVar);
        if (da1.f19803a >= 18) {
            try {
                this.f20157n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f20145b = new long[10];
    }

    private long a() {
        AudioTrack audioTrack = this.f20146c;
        Objects.requireNonNull(audioTrack);
        if (this.f20167x != -9223372036854775807L) {
            return Math.min(this.A, this.f20169z + ((((SystemClock.elapsedRealtime() * 1000) - this.f20167x) * ((long) this.f20150g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f20151h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f20164u = this.f20162s;
            }
            playbackHeadPosition += this.f20164u;
        }
        if (da1.f19803a <= 29) {
            if (playbackHeadPosition == 0 && this.f20162s > 0 && playState == 3) {
                if (this.f20168y == -9223372036854775807L) {
                    this.f20168y = SystemClock.elapsedRealtime();
                }
                return this.f20162s;
            }
            this.f20168y = -9223372036854775807L;
        }
        if (this.f20162s > playbackHeadPosition) {
            this.f20163t++;
        }
        this.f20162s = playbackHeadPosition;
        return playbackHeadPosition + (this.f20163t << 32);
    }

    private long a(long j10) {
        return (j10 * 1000000) / ((long) this.f20150g);
    }

    public final long a(boolean z10) {
        long jA;
        int i10;
        Method method;
        AudioTrack audioTrack = this.f20146c;
        Objects.requireNonNull(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            long jA2 = a(a());
            if (jA2 != 0) {
                long jNanoTime = System.nanoTime() / 1000;
                if (jNanoTime - this.f20156m >= 30000) {
                    long[] jArr = this.f20145b;
                    int i11 = this.f20165v;
                    jArr[i11] = jA2 - jNanoTime;
                    this.f20165v = (i11 + 1) % 10;
                    int i12 = this.f20166w;
                    if (i12 < 10) {
                        this.f20166w = i12 + 1;
                    }
                    this.f20156m = jNanoTime;
                    this.f20155l = 0L;
                    int i13 = 0;
                    while (true) {
                        int i14 = this.f20166w;
                        if (i13 >= i14) {
                            break;
                        }
                        this.f20155l = (this.f20145b[i13] / ((long) i14)) + this.f20155l;
                        i13++;
                    }
                }
                if (!this.f20151h) {
                    dc dcVar = this.f20149f;
                    Objects.requireNonNull(dcVar);
                    if (dcVar.a(jNanoTime)) {
                        long jC = dcVar.c();
                        long jB = dcVar.b();
                        if (Math.abs(jC - jNanoTime) > 5000000) {
                            i10 = 0;
                            this.f20144a.b(jB, jC, jNanoTime, jA2);
                        } else {
                            i10 = 0;
                            if (Math.abs(a(jB) - jA2) > 5000000) {
                                this.f20144a.a(jB, jC, jNanoTime, jA2);
                            } else {
                                dcVar.a();
                            }
                        }
                        dcVar.e();
                    } else {
                        i10 = 0;
                    }
                    if (this.f20160q && (method = this.f20157n) != null && jNanoTime - this.f20161r >= 500000) {
                        try {
                            AudioTrack audioTrack2 = this.f20146c;
                            Objects.requireNonNull(audioTrack2);
                            Integer num = (Integer) method.invoke(audioTrack2, new Object[i10]);
                            int i15 = da1.f19803a;
                            long jIntValue = (((long) num.intValue()) * 1000) - this.f20152i;
                            this.f20158o = jIntValue;
                            long jMax = Math.max(jIntValue, 0L);
                            this.f20158o = jMax;
                            if (jMax > 5000000) {
                                this.f20144a.b(jMax);
                                this.f20158o = 0L;
                            }
                        } catch (Exception unused) {
                            this.f20157n = null;
                        }
                        this.f20161r = jNanoTime;
                    }
                }
            }
        }
        long jNanoTime2 = System.nanoTime() / 1000;
        dc dcVar2 = this.f20149f;
        Objects.requireNonNull(dcVar2);
        boolean zD = dcVar2.d();
        if (zD) {
            long jA3 = a(dcVar2.b());
            long jC2 = jNanoTime2 - dcVar2.c();
            float f10 = this.f20153j;
            int i16 = da1.f19803a;
            if (f10 != 1.0f) {
                jC2 = Math.round(jC2 * ((double) f10));
            }
            jA = jC2 + jA3;
        } else {
            jA = this.f20166w == 0 ? a(a()) : this.f20155l + jNanoTime2;
            if (!z10) {
                jA = Math.max(0L, jA - this.f20158o);
            }
        }
        if (this.D != zD) {
            this.F = this.C;
            this.E = this.B;
        }
        long j10 = jNanoTime2 - this.F;
        if (j10 < 1000000) {
            long j11 = this.E;
            float f11 = this.f20153j;
            int i17 = da1.f19803a;
            long j12 = jA;
            long jRound = f11 == 1.0f ? j10 : Math.round(j10 * ((double) f11));
            long j13 = (j10 * 1000) / 1000000;
            jA = (((1000 - j13) * (jRound + j11)) + (j12 * j13)) / 1000;
        }
        if (!this.f20154k) {
            long j14 = this.B;
            if (jA > j14) {
                this.f20154k = true;
                long jB2 = da1.b(jA - j14);
                float f12 = this.f20153j;
                if (f12 != 1.0f) {
                    jB2 = Math.round(jB2 / ((double) f12));
                }
                this.f20144a.a(System.currentTimeMillis() - da1.b(jB2));
            }
        }
        this.C = jNanoTime2;
        this.B = jA;
        this.D = zD;
        return jA;
    }

    public final void a(float f10) {
        this.f20153j = f10;
        dc dcVar = this.f20149f;
        if (dcVar != null) {
            dcVar.f();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    public final void a(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        boolean z11;
        this.f20146c = audioTrack;
        this.f20147d = i11;
        this.f20148e = i12;
        this.f20149f = new dc(audioTrack);
        this.f20150g = audioTrack.getSampleRate();
        if (z10) {
            z11 = da1.f19803a < 23 && (i10 == 5 || i10 == 6);
        }
        this.f20151h = z11;
        boolean zE = da1.e(i10);
        this.f20160q = zE;
        this.f20152i = zE ? a(i12 / i11) : -9223372036854775807L;
        this.f20162s = 0L;
        this.f20163t = 0L;
        this.f20164u = 0L;
        this.f20159p = false;
        this.f20167x = -9223372036854775807L;
        this.f20168y = -9223372036854775807L;
        this.f20161r = 0L;
        this.f20158o = 0L;
        this.f20153j = 1.0f;
    }

    public final int b(long j10) {
        return this.f20148e - ((int) (j10 - (a() * ((long) this.f20147d))));
    }

    public final boolean b() {
        AudioTrack audioTrack = this.f20146c;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    public final void c(long j10) {
        this.f20169z = a();
        this.f20167x = SystemClock.elapsedRealtime() * 1000;
        this.A = j10;
    }

    public final boolean c() {
        this.f20155l = 0L;
        this.f20166w = 0;
        this.f20165v = 0;
        this.f20156m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.f20154k = false;
        if (this.f20167x != -9223372036854775807L) {
            return false;
        }
        dc dcVar = this.f20149f;
        Objects.requireNonNull(dcVar);
        dcVar.f();
        return true;
    }

    public final void d() {
        this.f20155l = 0L;
        this.f20166w = 0;
        this.f20165v = 0;
        this.f20156m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.f20154k = false;
        this.f20146c = null;
        this.f20149f = null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    public final boolean d(long j10) {
        boolean z10;
        if (j10 <= a()) {
            if (this.f20151h) {
                AudioTrack audioTrack = this.f20146c;
                Objects.requireNonNull(audioTrack);
                if (audioTrack.getPlayState() == 2 && a() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final void e() {
        dc dcVar = this.f20149f;
        Objects.requireNonNull(dcVar);
        dcVar.f();
    }

    public final boolean e(long j10) {
        return this.f20168y != -9223372036854775807L && j10 > 0 && SystemClock.elapsedRealtime() - this.f20168y >= 200;
    }

    public final boolean f(long j10) {
        AudioTrack audioTrack = this.f20146c;
        Objects.requireNonNull(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.f20151h) {
            if (playState == 2) {
                this.f20159p = false;
                return false;
            }
            if (playState == 1 && a() == 0) {
                return false;
            }
        }
        boolean z10 = this.f20159p;
        boolean zD = d(j10);
        this.f20159p = zD;
        if (z10 && !zD && playState != 1) {
            this.f20144a.a(this.f20148e, da1.b(this.f20152i));
        }
        return true;
    }
}
