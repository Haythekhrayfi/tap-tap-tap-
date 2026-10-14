package com.applovin.exoplayer2.b;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.applovin.exoplayer2.l.ai;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
final class j {
    private long A;
    private long B;
    private long C;
    private boolean D;
    private long E;
    private long F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f4470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f4471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AudioTrack f4472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f4473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f4474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private i f4475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f4476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f4477h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f4478i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f4479j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f4480k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f4481l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f4482m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Method f4483n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f4484o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f4485p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f4486q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f4487r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f4488s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f4489t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f4490u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f4491v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f4492w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f4493x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f4494y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f4495z;

    public interface a {
        void a(int i10, long j10);

        void a(long j10);

        void a(long j10, long j11, long j12, long j13);

        void b(long j10);

        void b(long j10, long j11, long j12, long j13);
    }

    public j(a aVar) {
        this.f4470a = (a) com.applovin.exoplayer2.l.a.b(aVar);
        if (ai.f7595a >= 18) {
            try {
                this.f4483n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f4471b = new long[10];
    }

    private void a(long j10, long j11) {
        i iVar = (i) com.applovin.exoplayer2.l.a.b(this.f4475f);
        if (iVar.a(j10)) {
            long jE = iVar.e();
            long jF = iVar.f();
            if (Math.abs(jE - j10) > 5000000) {
                this.f4470a.b(jF, jE, j10, j11);
            } else {
                if (Math.abs(h(jF) - j11) <= 5000000) {
                    iVar.b();
                    return;
                }
                this.f4470a.a(jF, jE, j10, j11);
            }
            iVar.a();
        }
    }

    private static boolean a(int i10) {
        return ai.f7595a < 23 && (i10 == 5 || i10 == 6);
    }

    private void e() {
        long jH = h();
        if (jH == 0) {
            return;
        }
        long jNanoTime = System.nanoTime() / 1000;
        if (jNanoTime - this.f4482m >= 30000) {
            long[] jArr = this.f4471b;
            int i10 = this.f4491v;
            jArr[i10] = jH - jNanoTime;
            this.f4491v = (i10 + 1) % 10;
            int i11 = this.f4492w;
            if (i11 < 10) {
                this.f4492w = i11 + 1;
            }
            this.f4482m = jNanoTime;
            this.f4481l = 0L;
            int i12 = 0;
            while (true) {
                int i13 = this.f4492w;
                if (i12 >= i13) {
                    break;
                }
                this.f4481l = (this.f4471b[i12] / ((long) i13)) + this.f4481l;
                i12++;
            }
        }
        if (this.f4477h) {
            return;
        }
        a(jNanoTime, jH);
        g(jNanoTime);
    }

    private void f() {
        this.f4481l = 0L;
        this.f4492w = 0;
        this.f4491v = 0;
        this.f4482m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.f4480k = false;
    }

    private void g(long j10) {
        Method method;
        if (!this.f4486q || (method = this.f4483n) == null || j10 - this.f4487r < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) ai.a((Integer) method.invoke(com.applovin.exoplayer2.l.a.b(this.f4472c), new Object[0]))).intValue()) * 1000) - this.f4478i;
            this.f4484o = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f4484o = jMax;
            if (jMax > 5000000) {
                this.f4470a.b(jMax);
                this.f4484o = 0L;
            }
        } catch (Exception unused) {
            this.f4483n = null;
        }
        this.f4487r = j10;
    }

    private boolean g() {
        return this.f4477h && ((AudioTrack) com.applovin.exoplayer2.l.a.b(this.f4472c)).getPlayState() == 2 && i() == 0;
    }

    private long h() {
        return h(i());
    }

    private long h(long j10) {
        return (j10 * 1000000) / ((long) this.f4476g);
    }

    private long i() {
        AudioTrack audioTrack = (AudioTrack) com.applovin.exoplayer2.l.a.b(this.f4472c);
        if (this.f4493x != -9223372036854775807L) {
            return Math.min(this.A, this.f4495z + ((((SystemClock.elapsedRealtime() * 1000) - this.f4493x) * ((long) this.f4476g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & ((long) audioTrack.getPlaybackHeadPosition());
        if (this.f4477h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f4490u = this.f4488s;
            }
            playbackHeadPosition += this.f4490u;
        }
        if (ai.f7595a <= 29) {
            if (playbackHeadPosition == 0 && this.f4488s > 0 && playState == 3) {
                if (this.f4494y == -9223372036854775807L) {
                    this.f4494y = SystemClock.elapsedRealtime();
                }
                return this.f4488s;
            }
            this.f4494y = -9223372036854775807L;
        }
        if (this.f4488s > playbackHeadPosition) {
            this.f4489t++;
        }
        this.f4488s = playbackHeadPosition;
        return playbackHeadPosition + (this.f4489t << 32);
    }

    public long a(boolean z10) {
        long jH;
        if (((AudioTrack) com.applovin.exoplayer2.l.a.b(this.f4472c)).getPlayState() == 3) {
            e();
        }
        long jNanoTime = System.nanoTime() / 1000;
        i iVar = (i) com.applovin.exoplayer2.l.a.b(this.f4475f);
        boolean zC = iVar.c();
        if (zC) {
            jH = ai.a(jNanoTime - iVar.e(), this.f4479j) + h(iVar.f());
        } else {
            jH = this.f4492w == 0 ? h() : this.f4481l + jNanoTime;
            if (!z10) {
                jH = Math.max(0L, jH - this.f4484o);
            }
        }
        if (this.D != zC) {
            this.F = this.C;
            this.E = this.B;
        }
        long j10 = jNanoTime - this.F;
        if (j10 < 1000000) {
            long jA = ai.a(j10, this.f4479j) + this.E;
            long j11 = (j10 * 1000) / 1000000;
            jH = (((1000 - j11) * jA) + (jH * j11)) / 1000;
        }
        if (!this.f4480k) {
            long j12 = this.B;
            if (jH > j12) {
                this.f4480k = true;
                this.f4470a.a(System.currentTimeMillis() - com.applovin.exoplayer2.h.a(ai.b(com.applovin.exoplayer2.h.a(jH - j12), this.f4479j)));
            }
        }
        this.C = jNanoTime;
        this.B = jH;
        this.D = zC;
        return jH;
    }

    public void a() {
        ((i) com.applovin.exoplayer2.l.a.b(this.f4475f)).d();
    }

    public void a(float f10) {
        this.f4479j = f10;
        i iVar = this.f4475f;
        if (iVar != null) {
            iVar.d();
        }
    }

    public void a(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f4472c = audioTrack;
        this.f4473d = i11;
        this.f4474e = i12;
        this.f4475f = new i(audioTrack);
        this.f4476g = audioTrack.getSampleRate();
        this.f4477h = z10 && a(i10);
        boolean zD = ai.d(i10);
        this.f4486q = zD;
        this.f4478i = zD ? h(i12 / i11) : -9223372036854775807L;
        this.f4488s = 0L;
        this.f4489t = 0L;
        this.f4490u = 0L;
        this.f4485p = false;
        this.f4493x = -9223372036854775807L;
        this.f4494y = -9223372036854775807L;
        this.f4487r = 0L;
        this.f4484o = 0L;
        this.f4479j = 1.0f;
    }

    public boolean a(long j10) {
        int playState = ((AudioTrack) com.applovin.exoplayer2.l.a.b(this.f4472c)).getPlayState();
        if (this.f4477h) {
            if (playState == 2) {
                this.f4485p = false;
                return false;
            }
            if (playState == 1 && i() == 0) {
                return false;
            }
        }
        boolean z10 = this.f4485p;
        boolean zF = f(j10);
        this.f4485p = zF;
        if (z10 && !zF && playState != 1) {
            this.f4470a.a(this.f4474e, com.applovin.exoplayer2.h.a(this.f4478i));
        }
        return true;
    }

    public int b(long j10) {
        return this.f4474e - ((int) (j10 - (i() * ((long) this.f4473d))));
    }

    public boolean b() {
        return ((AudioTrack) com.applovin.exoplayer2.l.a.b(this.f4472c)).getPlayState() == 3;
    }

    public long c(long j10) {
        return com.applovin.exoplayer2.h.a(h(j10 - i()));
    }

    public boolean c() {
        f();
        if (this.f4493x != -9223372036854775807L) {
            return false;
        }
        ((i) com.applovin.exoplayer2.l.a.b(this.f4475f)).d();
        return true;
    }

    public void d() {
        f();
        this.f4472c = null;
        this.f4475f = null;
    }

    public boolean d(long j10) {
        return this.f4494y != -9223372036854775807L && j10 > 0 && SystemClock.elapsedRealtime() - this.f4494y >= 200;
    }

    public void e(long j10) {
        this.f4495z = i();
        this.f4493x = SystemClock.elapsedRealtime() * 1000;
        this.A = j10;
    }

    public boolean f(long j10) {
        return j10 > i() || g();
    }
}
