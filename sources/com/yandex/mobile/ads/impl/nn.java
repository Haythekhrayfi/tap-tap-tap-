package com.yandex.mobile.ads.impl;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class nn implements bc {
    private int A;
    private long B;
    private long C;
    private long D;
    private long E;
    private int F;
    private boolean G;
    private boolean H;
    private long I;
    private float J;
    private zb[] K;
    private ByteBuffer[] L;
    private ByteBuffer M;
    private int N;
    private ByteBuffer O;
    private byte[] P;
    private int Q;
    private int R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private int W;
    private oc X;
    private boolean Y;
    private long Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wb f23453a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f23454a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f23455b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f23456b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f23457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final oh f23458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j81 f23459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final zb[] f23460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final zb[] f23461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final gk f23462h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ec f23463i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ArrayDeque<i> f23464j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f23465k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f23466l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private l f23467m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j<bc.b> f23468n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final j<bc.e> f23469o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final on f23470p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private gr0 f23471q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private bc.c f23472r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private f f23473s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private f f23474t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private AudioTrack f23475u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ub f23476v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private i f23477w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private i f23478x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private zq0 f23479y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ByteBuffer f23480z;

    public class a extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AudioTrack f23481b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AudioTrack audioTrack) {
            super("ExoPlayer:AudioTrackReleaseThread");
            this.f23481b = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                this.f23481b.flush();
                this.f23481b.release();
            } finally {
                nn.this.f23462h.e();
            }
        }
    }

    public static final class b {
        public static void a(AudioTrack audioTrack, gr0 gr0Var) {
            LogSessionId logSessionIdA = gr0Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionIdA);
        }
    }

    public interface c {
    }

    public interface d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final on f23483a = new on(new on.a());
    }

    public static final class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private g f23485b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f23486c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f23487d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private wb f23484a = wb.f26239d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f23488e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public on f23489f = d.f23483a;

        public final e a(wb wbVar) {
            Objects.requireNonNull(wbVar);
            this.f23484a = wbVar;
            return this;
        }

        public final nn a() {
            int i10 = 0;
            if (this.f23485b == null) {
                this.f23485b = new g(new zb[0], new j11(0), new t31());
            }
            return new nn(this, i10);
        }

        public final e b() {
            this.f23487d = false;
            return this;
        }

        public final e c() {
            this.f23486c = false;
            return this;
        }

        public final e d() {
            this.f23488e = 0;
            return this;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yv f23490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f23491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f23492c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f23493d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f23494e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f23495f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f23496g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f23497h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final zb[] f23498i;

        public f(yv yvVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, zb[] zbVarArr) {
            this.f23490a = yvVar;
            this.f23491b = i10;
            this.f23492c = i11;
            this.f23493d = i12;
            this.f23494e = i13;
            this.f23495f = i14;
            this.f23496g = i15;
            this.f23497h = i16;
            this.f23498i = zbVarArr;
        }

        private AudioTrack b(boolean z10, ub ubVar, int i10) {
            int i11 = da1.f19803a;
            if (i11 >= 29) {
                return new AudioTrack.Builder().setAudioAttributes(z10 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : ubVar.a().f25586a).setAudioFormat(nn.a(this.f23494e, this.f23495f, this.f23496g)).setTransferMode(1).setBufferSizeInBytes(this.f23497h).setSessionId(i10).setOffloadedPlayback(this.f23492c == 1).build();
            }
            if (i11 >= 21) {
                return new AudioTrack(z10 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : ubVar.a().f25586a, nn.a(this.f23494e, this.f23495f, this.f23496g), this.f23497h, 1, i10);
            }
            int iC = da1.c(ubVar.f25582c);
            int i12 = this.f23494e;
            int i13 = this.f23495f;
            int i14 = this.f23496g;
            int i15 = this.f23497h;
            return i10 == 0 ? new AudioTrack(iC, i12, i13, i14, i15, 1) : new AudioTrack(iC, i12, i13, i14, i15, 1, i10);
        }

        public final AudioTrack a(boolean z10, ub ubVar, int i10) throws bc.b {
            try {
                AudioTrack audioTrackB = b(z10, ubVar, i10);
                int state = audioTrackB.getState();
                if (state == 1) {
                    return audioTrackB;
                }
                try {
                    audioTrackB.release();
                } catch (Exception unused) {
                }
                throw new bc.b(state, this.f23494e, this.f23495f, this.f23497h, this.f23490a, this.f23492c == 1, null);
            } catch (IllegalArgumentException | UnsupportedOperationException e10) {
                throw new bc.b(0, this.f23494e, this.f23495f, this.f23497h, this.f23490a, this.f23492c == 1, e10);
            }
        }
    }

    public static class g implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final zb[] f23499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final j11 f23500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final t31 f23501c;

        public g(zb[] zbVarArr, j11 j11Var, t31 t31Var) {
            zb[] zbVarArr2 = new zb[zbVarArr.length + 2];
            this.f23499a = zbVarArr2;
            System.arraycopy(zbVarArr, 0, zbVarArr2, 0, zbVarArr.length);
            this.f23500b = j11Var;
            this.f23501c = t31Var;
            zbVarArr2[zbVarArr.length] = j11Var;
            zbVarArr2[zbVarArr.length + 1] = t31Var;
        }

        public final long a(long j10) {
            return this.f23501c.a(j10);
        }

        public final zq0 a(zq0 zq0Var) {
            this.f23501c.b(zq0Var.f27398a);
            this.f23501c.a(zq0Var.f27399b);
            return zq0Var;
        }

        public final boolean a(boolean z10) {
            this.f23500b.a(z10);
            return z10;
        }

        public final zb[] a() {
            return this.f23499a;
        }

        public final long b() {
            return this.f23500b.i();
        }
    }

    public static final class h extends RuntimeException {
    }

    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zq0 f23502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f23503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f23504c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f23505d;

        private i(zq0 zq0Var, boolean z10, long j10, long j11) {
            this.f23502a = zq0Var;
            this.f23503b = z10;
            this.f23504c = j10;
            this.f23505d = j11;
        }

        public /* synthetic */ i(zq0 zq0Var, boolean z10, long j10, long j11, int i10) {
            this(zq0Var, z10, j10, j11);
        }
    }

    public static final class j<T extends Exception> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private T f23506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f23507b;

        public final void a() {
            this.f23506a = null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public final void a(T t10) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f23506a == null) {
                this.f23506a = t10;
                this.f23507b = 100 + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.f23507b) {
                T t11 = this.f23506a;
                if (t11 != t10) {
                    t11.addSuppressed(t10);
                }
                T t12 = this.f23506a;
                this.f23506a = null;
                throw t12;
            }
        }
    }

    public final class k implements ec.a {
        private k() {
        }

        public /* synthetic */ k(nn nnVar, int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.ec.a
        public final void a(int i10, long j10) {
            if (nn.this.f23472r != null) {
                fb0.this.I0.b(i10, j10, SystemClock.elapsedRealtime() - nn.this.Z);
            }
        }

        @Override // com.yandex.mobile.ads.impl.ec.a
        public final void a(long j10) {
            if (nn.this.f23472r != null) {
                fb0.this.I0.b(j10);
            }
        }

        @Override // com.yandex.mobile.ads.impl.ec.a
        public final void a(long j10, long j11, long j12, long j13) {
            StringBuilder sbA = i2.a.a("Spurious audio timestamp (frame position mismatch): ", j10, ", ");
            sbA.append(j11);
            r.e.a(sbA, ", ", j12, ", ");
            sbA.append(j13);
            sbA.append(", ");
            sbA.append(nn.c(nn.this));
            sbA.append(", ");
            sbA.append(nn.this.i());
            p90.d("DefaultAudioSink", sbA.toString());
        }

        @Override // com.yandex.mobile.ads.impl.ec.a
        public final void b(long j10) {
            p90.d("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }

        @Override // com.yandex.mobile.ads.impl.ec.a
        public final void b(long j10, long j11, long j12, long j13) {
            StringBuilder sbA = i2.a.a("Spurious audio timestamp (system clock mismatch): ", j10, ", ");
            sbA.append(j11);
            r.e.a(sbA, ", ", j12, ", ");
            sbA.append(j13);
            sbA.append(", ");
            sbA.append(nn.c(nn.this));
            sbA.append(", ");
            sbA.append(nn.this.i());
            p90.d("DefaultAudioSink", sbA.toString());
        }
    }

    public final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f23509a = new Handler();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioTrack.StreamEventCallback f23510b = new a();

        public class a extends AudioTrack.StreamEventCallback {
            public a() {
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public final void onDataRequest(AudioTrack audioTrack, int i10) {
                pa.b(audioTrack == nn.this.f23475u);
                if (nn.this.f23472r == null || !nn.this.U) {
                    return;
                }
                fb0.a aVar = (fb0.a) nn.this.f23472r;
                if (fb0.this.R0 != null) {
                    fb0.this.R0.b();
                }
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public final void onTearDown(AudioTrack audioTrack) {
                pa.b(audioTrack == nn.this.f23475u);
                if (nn.this.f23472r == null || !nn.this.U) {
                    return;
                }
                fb0.a aVar = (fb0.a) nn.this.f23472r;
                if (fb0.this.R0 != null) {
                    fb0.this.R0.b();
                }
            }
        }

        public l() {
        }

        public final void a(AudioTrack audioTrack) {
            Handler handler = this.f23509a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new com.applovin.exoplayer2.b.g0(handler, 1), this.f23510b);
        }

        public final void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f23510b);
            this.f23509a.removeCallbacksAndMessages(null);
        }
    }

    @RequiresNonNull({"#1.audioProcessorChain"})
    private nn(e eVar) {
        this.f23453a = eVar.f23484a;
        c cVar = eVar.f23485b;
        this.f23455b = cVar;
        int i10 = da1.f19803a;
        int i11 = 0;
        this.f23457c = i10 >= 21 && eVar.f23486c;
        this.f23465k = i10 >= 23 && eVar.f23487d;
        this.f23466l = i10 >= 29 ? eVar.f23488e : 0;
        this.f23470p = eVar.f23489f;
        gk gkVar = new gk(0);
        this.f23462h = gkVar;
        gkVar.e();
        this.f23463i = new ec(new k(this, i11));
        oh ohVar = new oh();
        this.f23458d = ohVar;
        j81 j81Var = new j81();
        this.f23459e = j81Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new cx0(), ohVar, j81Var);
        Collections.addAll(arrayList, ((g) cVar).a());
        this.f23460f = (zb[]) arrayList.toArray(new zb[0]);
        this.f23461g = new zb[]{new rv()};
        this.J = 1.0f;
        this.f23476v = ub.f25579g;
        this.W = 0;
        this.X = new oc();
        zq0 zq0Var = zq0.f27397d;
        this.f23478x = new i(zq0Var, false, 0L, 0L, 0);
        this.f23479y = zq0Var;
        this.R = -1;
        this.K = new zb[0];
        this.L = new ByteBuffer[0];
        this.f23464j = new ArrayDeque<>();
        this.f23468n = new j<>();
        this.f23469o = new j<>();
    }

    public /* synthetic */ nn(e eVar, int i10) {
        this(eVar);
    }

    public static AudioFormat a(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    private void a(long j10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10 = 0;
        if (this.Y || !"audio/raw".equals(this.f23474t.f23490a.f27115l)) {
            z10 = false;
        } else {
            int i11 = this.f23474t.f23490a.A;
            if (this.f23457c) {
                int i12 = da1.f19803a;
                if (i11 == 536870912 || i11 == 805306368 || i11 == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
            } else {
                z13 = false;
            }
            if (z13) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        zq0 zq0VarA = z10 ? ((g) this.f23455b).a(h().f23502a) : zq0.f27397d;
        if (!this.Y && "audio/raw".equals(this.f23474t.f23490a.f27115l)) {
            int i13 = this.f23474t.f23490a.A;
            if (this.f23457c) {
                int i14 = da1.f19803a;
                if (i13 == 536870912 || i13 == 805306368 || i13 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            } else {
                z12 = false;
            }
            z11 = z12 ? false : true;
        }
        boolean zA = z11 ? ((g) this.f23455b).a(h().f23503b) : false;
        this.f23464j.add(new i(zq0VarA, zA, Math.max(0L, j10), (i() * 1000000) / ((long) this.f23474t.f23494e), 0));
        zb[] zbVarArr = this.f23474t.f23498i;
        ArrayList arrayList = new ArrayList();
        for (zb zbVar : zbVarArr) {
            if (zbVar.d()) {
                arrayList.add(zbVar);
            } else {
                zbVar.flush();
            }
        }
        int size = arrayList.size();
        this.K = (zb[]) arrayList.toArray(new zb[size]);
        this.L = new ByteBuffer[size];
        while (true) {
            zb[] zbVarArr2 = this.K;
            if (i10 >= zbVarArr2.length) {
                break;
            }
            zb zbVar2 = zbVarArr2[i10];
            zbVar2.flush();
            this.L[i10] = zbVar2.b();
            i10++;
        }
        bc.c cVar = this.f23472r;
        if (cVar != null) {
            fb0.this.I0.b(zA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e6  */
    private void a(ByteBuffer byteBuffer, long j10) throws Exception {
        int iWrite;
        bc.c cVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.O;
            if (byteBuffer2 != null) {
                pa.a(byteBuffer2 == byteBuffer);
            } else {
                this.O = byteBuffer;
                if (da1.f19803a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.P;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.P = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.P, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.Q = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            int i10 = da1.f19803a;
            if (i10 < 21) {
                int iB = this.f23463i.b(this.D);
                if (iB > 0) {
                    iWrite = this.f23475u.write(this.P, this.Q, Math.min(iRemaining2, iB));
                    if (iWrite > 0) {
                        this.Q += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                } else {
                    iWrite = 0;
                }
            } else if (this.Y) {
                pa.b(j10 != -9223372036854775807L);
                AudioTrack audioTrack = this.f23475u;
                if (i10 >= 26) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining2, 1, j10 * 1000);
                } else {
                    if (this.f23480z == null) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                        this.f23480z = byteBufferAllocate;
                        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                        this.f23480z.putInt(1431633921);
                    }
                    if (this.A == 0) {
                        this.f23480z.putInt(4, iRemaining2);
                        this.f23480z.putLong(8, j10 * 1000);
                        this.f23480z.position(0);
                        this.A = iRemaining2;
                    }
                    int iRemaining3 = this.f23480z.remaining();
                    if (iRemaining3 <= 0) {
                        iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                        if (iWrite < 0) {
                            this.A = 0;
                        } else {
                            this.A -= iWrite;
                        }
                    } else {
                        int iWrite2 = audioTrack.write(this.f23480z, iRemaining3, 1);
                        if (iWrite2 < 0) {
                            this.A = 0;
                            iWrite = iWrite2;
                        } else if (iWrite2 < iRemaining3) {
                            iWrite = 0;
                        } else {
                            iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                            if (iWrite < 0) {
                                this.A = 0;
                            } else {
                                this.A -= iWrite;
                            }
                        }
                    }
                }
            } else {
                iWrite = this.f23475u.write(byteBuffer, iRemaining2, 1);
            }
            this.Z = SystemClock.elapsedRealtime();
            if (iWrite < 0) {
                boolean z10 = (i10 >= 24 && iWrite == -6) || iWrite == -32;
                if (z10) {
                    if (this.f23474t.f23492c == 1) {
                        this.f23454a0 = true;
                    }
                }
                bc.e eVar = new bc.e(iWrite, this.f23474t.f23490a, z10);
                bc.c cVar2 = this.f23472r;
                if (cVar2 != null) {
                    p90.a("MediaCodecAudioRenderer", "Audio sink error", eVar);
                    fb0.this.I0.b(eVar);
                }
                if (eVar.f19168b) {
                    throw eVar;
                }
                this.f23469o.a(eVar);
                return;
            }
            this.f23469o.a();
            if (i10 >= 29 && this.f23475u.isOffloadedPlayback()) {
                if (this.E > 0) {
                    this.f23456b0 = false;
                }
                if (this.U && (cVar = this.f23472r) != null && iWrite < iRemaining2 && !this.f23456b0) {
                    fb0.a aVar = (fb0.a) cVar;
                    if (fb0.this.R0 != null) {
                        fb0.this.R0.a();
                    }
                }
            }
            int i11 = this.f23474t.f23492c;
            if (i11 == 0) {
                this.D += (long) iWrite;
            }
            if (iWrite == iRemaining2) {
                if (i11 != 0) {
                    pa.b(byteBuffer == this.M);
                    this.E = (((long) this.F) * ((long) this.N)) + this.E;
                }
                this.O = null;
            }
        }
    }

    private boolean a(yv yvVar, ub ubVar) {
        int iA;
        int playbackOffloadSupport;
        int i10 = da1.f19803a;
        if (i10 < 29 || this.f23466l == 0) {
            return false;
        }
        String str = yvVar.f27115l;
        Objects.requireNonNull(str);
        int iB = te0.b(str, yvVar.f27112i);
        if (iB == 0 || (iA = da1.a(yvVar.f27128y)) == 0) {
            return false;
        }
        AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(yvVar.f27129z).setChannelMask(iA).setEncoding(iB).build();
        AudioAttributes audioAttributes = ubVar.a().f25586a;
        if (i10 >= 31) {
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, audioAttributes);
        } else if (AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, audioAttributes)) {
            playbackOffloadSupport = (i10 == 30 && da1.f19806d.startsWith("Pixel")) ? 2 : 1;
        } else {
            playbackOffloadSupport = 0;
        }
        if (playbackOffloadSupport == 0) {
            return false;
        }
        if (playbackOffloadSupport == 1) {
            return ((yvVar.B != 0 || yvVar.C != 0) && (this.f23466l == 1)) ? false : true;
        }
        if (playbackOffloadSupport == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    private void b(long j10) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.K.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.L[i10 - 1];
            } else {
                byteBuffer = this.M;
                if (byteBuffer == null) {
                    byteBuffer = zb.f27269a;
                }
            }
            if (i10 == length) {
                a(byteBuffer, j10);
            } else {
                zb zbVar = this.K[i10];
                if (i10 > this.R) {
                    zbVar.a(byteBuffer);
                }
                ByteBuffer byteBufferB = zbVar.b();
                this.L[i10] = byteBufferB;
                if (byteBufferB.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i10--;
            }
        }
    }

    private void b(zq0 zq0Var) {
        if (k()) {
            try {
                this.f23475u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(zq0Var.f27398a).setPitch(zq0Var.f27399b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                p90.b("DefaultAudioSink", "Failed to set playback params", e10);
            }
            zq0Var = new zq0(this.f23475u.getPlaybackParams().getSpeed(), this.f23475u.getPlaybackParams().getPitch());
            this.f23463i.a(zq0Var.f27398a);
        }
        this.f23479y = zq0Var;
    }

    public static long c(nn nnVar) {
        f fVar = nnVar.f23474t;
        return fVar.f23492c == 0 ? nnVar.B / ((long) fVar.f23491b) : nnVar.C;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private boolean g() throws com.yandex.mobile.ads.impl.bc.e {
        /*
            r9 = this;
            int r0 = r9.R
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.R = r3
        L9:
            r0 = r2
            goto Lc
        Lb:
            r0 = r3
        Lc:
            int r4 = r9.R
            com.yandex.mobile.ads.impl.zb[] r5 = r9.K
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.c()
        L1f:
            r9.b(r7)
            boolean r0 = r4.a()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.R
            int r0 = r0 + r2
            r9.R = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
            r9.a(r0, r7)
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.R = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.nn.g():boolean");
    }

    private i h() {
        i iVar = this.f23477w;
        if (iVar != null) {
            return iVar;
        }
        return !this.f23464j.isEmpty() ? this.f23464j.getLast() : this.f23478x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long i() {
        f fVar = this.f23474t;
        return fVar.f23492c == 0 ? this.D / ((long) fVar.f23493d) : this.E;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x011b  */
    /* JADX WARN: Code duplicated, block: B:66:0x011f  */
    /* JADX WARN: Code duplicated, block: B:73:? A[SYNTHETIC] */
    private boolean j() throws bc.b {
        AudioTrack audioTrackA;
        gr0 gr0Var;
        if (!this.f23462h.d()) {
            return false;
        }
        try {
            f fVar = this.f23474t;
            Objects.requireNonNull(fVar);
            try {
                audioTrackA = fVar.a(this.Y, this.f23476v, this.W);
                this.f23475u = audioTrackA;
                int i10 = da1.f19803a;
                if (i10 >= 29 && audioTrackA.isOffloadedPlayback()) {
                    AudioTrack audioTrack = this.f23475u;
                    if (this.f23467m == null) {
                        this.f23467m = new l();
                    }
                    this.f23467m.a(audioTrack);
                    if (this.f23466l != 3) {
                        AudioTrack audioTrack2 = this.f23475u;
                        yv yvVar = this.f23474t.f23490a;
                        audioTrack2.setOffloadDelayPadding(yvVar.B, yvVar.C);
                    }
                }
                if (i10 >= 31 && (gr0Var = this.f23471q) != null) {
                    b.a(this.f23475u, gr0Var);
                }
                this.W = this.f23475u.getAudioSessionId();
                ec ecVar = this.f23463i;
                AudioTrack audioTrack3 = this.f23475u;
                f fVar2 = this.f23474t;
                ecVar.a(audioTrack3, fVar2.f23492c == 2, fVar2.f23496g, fVar2.f23493d, fVar2.f23497h);
                if (k()) {
                    if (i10 >= 21) {
                        this.f23475u.setVolume(this.J);
                    } else {
                        AudioTrack audioTrack4 = this.f23475u;
                        float f10 = this.J;
                        audioTrack4.setStereoVolume(f10, f10);
                    }
                }
                int i11 = this.X.f23766a;
                if (i11 != 0) {
                    this.f23475u.attachAuxEffect(i11);
                    this.f23475u.setAuxEffectSendLevel(this.X.f23767b);
                }
                this.H = true;
                return true;
            } catch (bc.b e10) {
                bc.c cVar = this.f23472r;
                if (cVar != null) {
                    p90.a("MediaCodecAudioRenderer", "Audio sink error", e10);
                    fb0.this.I0.b(e10);
                }
                throw e10;
            }
        } catch (bc.b e11) {
            f fVar3 = this.f23474t;
            if (fVar3.f23497h > 1000000) {
                f fVar4 = new f(fVar3.f23490a, fVar3.f23491b, fVar3.f23492c, fVar3.f23493d, fVar3.f23494e, fVar3.f23495f, fVar3.f23496g, 1000000, fVar3.f23498i);
                try {
                    try {
                        audioTrackA = fVar4.a(this.Y, this.f23476v, this.W);
                        this.f23474t = fVar4;
                    } catch (bc.b e12) {
                        e11.addSuppressed(e12);
                        if (!(this.f23474t.f23492c == 1)) {
                            throw e11;
                        }
                        this.f23454a0 = true;
                        throw e11;
                    }
                } catch (bc.b e13) {
                    bc.c cVar2 = this.f23472r;
                    if (cVar2 != null) {
                        p90.a("MediaCodecAudioRenderer", "Audio sink error", e13);
                        fb0.this.I0.b(e13);
                    }
                    throw e13;
                }
            }
            if (!(this.f23474t.f23492c == 1)) {
                throw e11;
            }
            this.f23454a0 = true;
            throw e11;
        }
    }

    private boolean k() {
        return this.f23475u != null;
    }

    private void l() {
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        int i10 = 0;
        this.f23456b0 = false;
        this.F = 0;
        this.f23478x = new i(h().f23502a, h().f23503b, 0L, 0L, 0);
        this.I = 0L;
        this.f23477w = null;
        this.f23464j.clear();
        this.M = null;
        this.N = 0;
        this.O = null;
        this.T = false;
        this.S = false;
        this.R = -1;
        this.f23480z = null;
        this.A = 0;
        this.f23459e.j();
        while (true) {
            zb[] zbVarArr = this.K;
            if (i10 >= zbVarArr.length) {
                return;
            }
            zb zbVar = zbVarArr[i10];
            zbVar.flush();
            this.L[i10] = zbVar.b();
            i10++;
        }
    }

    @Override // com.yandex.mobile.ads.impl.bc
    public final long a(boolean z10) {
        long jA;
        if (!k() || this.H) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.f23463i.a(z10), (i() * 1000000) / ((long) this.f23474t.f23494e));
        while (!this.f23464j.isEmpty() && jMin >= this.f23464j.getFirst().f23505d) {
            this.f23478x = this.f23464j.remove();
        }
        i iVar = this.f23478x;
        long j10 = jMin - iVar.f23505d;
        if (iVar.f23502a.equals(zq0.f27397d)) {
            jA = this.f23478x.f23504c + j10;
        } else if (this.f23464j.isEmpty()) {
            jA = ((g) this.f23455b).a(j10) + this.f23478x.f23504c;
        } else {
            i first = this.f23464j.getFirst();
            long jRound = first.f23505d - jMin;
            float f10 = this.f23478x.f23502a.f27398a;
            int i10 = da1.f19803a;
            if (f10 != 1.0f) {
                jRound = Math.round(jRound * ((double) f10));
            }
            jA = first.f23504c - jRound;
        }
        return ((((g) this.f23455b).b() * 1000000) / ((long) this.f23474t.f23494e)) + jA;
    }

    @Override // com.yandex.mobile.ads.impl.bc
    public final void a(int i10) {
        if (this.W != i10) {
            this.W = i10;
            this.V = i10 != 0;
            flush();
        }
    }

    public final void a(bc.c cVar) {
        this.f23472r = cVar;
    }

    @Override // com.yandex.mobile.ads.impl.bc
    public final void a(gr0 gr0Var) {
        this.f23471q = gr0Var;
    }

    @Override // com.yandex.mobile.ads.impl.bc
    public final void a(oc ocVar) {
        if (this.X.equals(ocVar)) {
            return;
        }
        int i10 = ocVar.f23766a;
        float f10 = ocVar.f23767b;
        AudioTrack audioTrack = this.f23475u;
        if (audioTrack != null) {
            if (this.X.f23766a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f23475u.setAuxEffectSendLevel(f10);
            }
        }
        this.X = ocVar;
    }

    @Override // com.yandex.mobile.ads.impl.bc
    public final void a(ub ubVar) {
        if (this.f23476v.equals(ubVar)) {
            return;
        }
        this.f23476v = ubVar;
        if (this.Y) {
            return;
        }
        flush();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    @Override // com.yandex.mobile.ads.impl.bc
    public final void a(yv yvVar, int[] iArr) throws bc.a {
        zb[] zbVarArr;
        int iIntValue;
        int i10;
        int iB;
        int i11;
        int iB2;
        int iMax;
        int i12;
        zb[] zbVarArr2;
        int i13;
        int i14;
        boolean z10;
        int[] iArr2;
        int i15 = -1;
        if ("audio/raw".equals(yvVar.f27115l)) {
            pa.a(da1.e(yvVar.A));
            int iB3 = da1.b(yvVar.A, yvVar.f27128y);
            int i16 = yvVar.A;
            if (!this.f23457c) {
                z10 = false;
            } else if (i16 == 536870912 || i16 == 805306368 || i16 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            zb[] zbVarArr3 = z10 ? this.f23461g : this.f23460f;
            this.f23459e.a(yvVar.B, yvVar.C);
            if (da1.f19803a < 21 && yvVar.f27128y == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i17 = 0; i17 < 6; i17++) {
                    iArr2[i17] = i17;
                }
            } else {
                iArr2 = iArr;
            }
            this.f23458d.a(iArr2);
            zb.a aVar = new zb.a(yvVar.f27129z, yvVar.f27128y, yvVar.A);
            for (zb zbVar : zbVarArr3) {
                try {
                    zb.a aVarA = zbVar.a(aVar);
                    if (zbVar.d()) {
                        aVar = aVarA;
                    }
                } catch (zb.b e10) {
                    throw new bc.a(e10, yvVar);
                }
            }
            int i18 = aVar.f27273c;
            i11 = aVar.f27271a;
            int iA = da1.a(aVar.f27272b);
            iB2 = da1.b(i18, aVar.f27272b);
            zbVarArr = zbVarArr3;
            i15 = iB3;
            i10 = 0;
            iB = i18;
            iIntValue = iA;
        } else {
            zbVarArr = new zb[0];
            int i19 = yvVar.f27129z;
            if (a(yvVar, this.f23476v)) {
                String str = yvVar.f27115l;
                Objects.requireNonNull(str);
                i10 = 1;
                iB = te0.b(str, yvVar.f27112i);
                iIntValue = da1.a(yvVar.f27128y);
            } else {
                Pair<Integer, Integer> pairA = this.f23453a.a(yvVar);
                if (pairA == null) {
                    throw new bc.a("Unable to configure passthrough for: " + yvVar, yvVar);
                }
                int iIntValue2 = ((Integer) pairA.first).intValue();
                iIntValue = ((Integer) pairA.second).intValue();
                i10 = 2;
                iB = iIntValue2;
            }
            i11 = i19;
            iB2 = -1;
        }
        on onVar = this.f23470p;
        int minBufferSize = AudioTrack.getMinBufferSize(i11, iIntValue, iB);
        pa.b(minBufferSize != -2);
        double d10 = this.f23465k ? 8.0d : 1.0d;
        Objects.requireNonNull(onVar);
        if (i10 == 0) {
            int i20 = onVar.f23853d * minBufferSize;
            long j10 = i11;
            long j11 = iB2;
            int iA2 = h70.a(((((long) onVar.f23851b) * j10) * j11) / 1000000);
            int iA3 = h70.a(((((long) onVar.f23852c) * j10) * j11) / 1000000);
            int i21 = da1.f19803a;
            iMax = Math.max(iA2, Math.min(i20, iA3));
        } else if (i10 == 1) {
            switch (iB) {
                case 5:
                    i13 = 80000;
                    break;
                case 6:
                case 18:
                    i13 = 768000;
                    break;
                case 7:
                    i13 = 192000;
                    break;
                case 8:
                    i13 = 2250000;
                    break;
                case 9:
                    i13 = 40000;
                    break;
                case 10:
                    i13 = 100000;
                    break;
                case 11:
                    i13 = 16000;
                    break;
                case 12:
                    i13 = 7000;
                    break;
                case 13:
                default:
                    throw new IllegalArgumentException();
                case 14:
                    i13 = 3062500;
                    break;
                case 15:
                    i13 = 8000;
                    break;
                case 16:
                    i13 = 256000;
                    break;
                case 17:
                    i13 = 336000;
                    break;
            }
            iMax = h70.a((((long) onVar.f23855f) * ((long) i13)) / 1000000);
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            int i22 = onVar.f23854e;
            if (iB == 5) {
                i22 *= onVar.f23856g;
            }
            switch (iB) {
                case 5:
                    i14 = 80000;
                    break;
                case 6:
                case 18:
                    i14 = 768000;
                    break;
                case 7:
                    i14 = 192000;
                    break;
                case 8:
                    i14 = 2250000;
                    break;
                case 9:
                    i14 = 40000;
                    break;
                case 10:
                    i14 = 100000;
                    break;
                case 11:
                    i14 = 16000;
                    break;
                case 12:
                    i14 = 7000;
                    break;
                case 13:
                default:
                    throw new IllegalArgumentException();
                case 14:
                    i14 = 3062500;
                    break;
                case 15:
                    i14 = 8000;
                    break;
                case 16:
                    i14 = 256000;
                    break;
                case 17:
                    i14 = 336000;
                    break;
            }
            iMax = h70.a((((long) i22) * ((long) i14)) / 1000000);
        }
        int iMax2 = (((Math.max(minBufferSize, (int) (((double) iMax) * d10)) + iB2) - 1) / iB2) * iB2;
        if (iB == 0) {
            throw new bc.a("Invalid output encoding (mode=" + i10 + ") for: " + yvVar, yvVar);
        }
        if (iIntValue == 0) {
            throw new bc.a("Invalid output channel config (mode=" + i10 + ") for: " + yvVar, yvVar);
        }
        this.f23454a0 = false;
        f fVar = new f(yvVar, i12, i10, iB2, i11, iIntValue, iB, iMax2, zbVarArr2);
        if (k()) {
            i12 = i15;
            zbVarArr2 = zbVarArr;
            this.f23473s = fVar;
        } else {
            i12 = i15;
            zbVarArr2 = zbVarArr;
            this.f23474t = fVar;
        }
    }

    @Override // com.yandex.mobile.ads.impl.bc
    public final void a(zq0 zq0Var) {
        float f10 = zq0Var.f27398a;
        int i10 = da1.f19803a;
        zq0 zq0Var2 = new zq0(Math.max(0.1f, Math.min(f10, 8.0f)), Math.max(0.1f, Math.min(zq0Var.f27399b, 8.0f)));
        if (this.f23465k && i10 >= 23) {
            b(zq0Var2);
            return;
        }
        boolean z10 = h().f23503b;
        i iVarH = h();
        if (zq0Var2.equals(iVarH.f23502a) && z10 == iVarH.f23503b) {
            return;
        }
        i iVar = new i(zq0Var2, z10, -9223372036854775807L, -9223372036854775807L, 0);
        if (k()) {
            this.f23477w = iVar;
        } else {
            this.f23478x = iVar;
        }
    }

    @Override // com.yandex.mobile.ads.impl.bc
    public final boolean a() {
        return !k() || (this.S && !d());
    }

    @Override // com.yandex.mobile.ads.impl.bc
    public final boolean a(yv yvVar) {
        return b(yvVar) != 0;
    }

    @Override // com.yandex.mobile.ads.impl.bc
    public final boolean a(ByteBuffer byteBuffer, long j10, int i10) throws Exception {
        int iA;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ByteBuffer byteBuffer2 = this.M;
        pa.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f23473s != null) {
            if (!g()) {
                return false;
            }
            f fVar = this.f23473s;
            f fVar2 = this.f23474t;
            Objects.requireNonNull(fVar);
            if (fVar2.f23492c == fVar.f23492c && fVar2.f23496g == fVar.f23496g && fVar2.f23494e == fVar.f23494e && fVar2.f23495f == fVar.f23495f && fVar2.f23493d == fVar.f23493d) {
                this.f23474t = this.f23473s;
                this.f23473s = null;
                if ((da1.f19803a >= 29 && this.f23475u.isOffloadedPlayback()) && this.f23466l != 3) {
                    if (this.f23475u.getPlayState() == 3) {
                        this.f23475u.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.f23475u;
                    yv yvVar = this.f23474t.f23490a;
                    audioTrack.setOffloadDelayPadding(yvVar.B, yvVar.C);
                    this.f23456b0 = true;
                }
            } else {
                if (!this.T) {
                    this.T = true;
                    this.f23463i.c(i());
                    this.f23475u.stop();
                    this.A = 0;
                }
                if (d()) {
                    return false;
                }
                flush();
            }
            a(j10);
        }
        if (!k()) {
            try {
                if (!j()) {
                    return false;
                }
            } catch (bc.b e10) {
                if (e10.f19165b) {
                    throw e10;
                }
                this.f23468n.a(e10);
                return false;
            }
        }
        this.f23468n.a();
        if (this.H) {
            this.I = Math.max(0L, j10);
            this.G = false;
            this.H = false;
            if (this.f23465k && da1.f19803a >= 23) {
                b(this.f23479y);
            }
            a(j10);
            if (this.U) {
                play();
            }
        }
        if (!this.f23463i.f(i())) {
            return false;
        }
        if (this.M == null) {
            pa.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            f fVar3 = this.f23474t;
            if (fVar3.f23492c != 0 && this.F == 0) {
                int i16 = fVar3.f23496g;
                switch (i16) {
                    case 5:
                    case 6:
                    case 18:
                        iA = com.yandex.mobile.ads.impl.i.a(byteBuffer);
                        break;
                    case 7:
                    case 8:
                        int iPosition = byteBuffer.position();
                        byte b10 = byteBuffer.get(iPosition);
                        if (b10 != -2) {
                            if (b10 == -1) {
                                i11 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                                i14 = iPosition + 7;
                            } else if (b10 != 31) {
                                i11 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                                i12 = iPosition + 5;
                            } else {
                                i11 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                                i14 = iPosition + 6;
                            }
                            i13 = byteBuffer.get(i14) & 60;
                            iA = (((i13 >> 2) | i11) + 1) * 32;
                        } else {
                            i11 = (byteBuffer.get(iPosition + 5) & 1) << 6;
                            i12 = iPosition + 4;
                        }
                        i13 = byteBuffer.get(i12) & 252;
                        iA = (((i13 >> 2) | i11) + 1) * 32;
                        break;
                    case 9:
                        int iPosition2 = byteBuffer.position();
                        int i17 = da1.f19803a;
                        int iReverseBytes = byteBuffer.getInt(iPosition2);
                        if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                            iReverseBytes = Integer.reverseBytes(iReverseBytes);
                        }
                        iA = rf0.c(iReverseBytes);
                        if (iA == -1) {
                            throw new IllegalArgumentException();
                        }
                        break;
                    case 10:
                    case 16:
                        iA = 1024;
                        break;
                    case 11:
                    case 12:
                        iA = 2048;
                        break;
                    case 13:
                    default:
                        throw new IllegalStateException(u60.a("Unexpected audio encoding: ", i16));
                    case 14:
                        int iPosition3 = byteBuffer.position();
                        int iLimit = byteBuffer.limit() - 10;
                        int i18 = iPosition3;
                        while (true) {
                            if (i18 <= iLimit) {
                                int i19 = da1.f19803a;
                                int iReverseBytes2 = byteBuffer.getInt(i18 + 4);
                                if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                    iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                }
                                if ((iReverseBytes2 & (-2)) == -126718022) {
                                    i15 = i18 - iPosition3;
                                } else {
                                    i18++;
                                }
                            } else {
                                i15 = -1;
                            }
                        }
                        if (i15 != -1) {
                            iA = (40 << ((byteBuffer.get((byteBuffer.position() + i15) + ((byteBuffer.get((byteBuffer.position() + i15) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                        } else {
                            iA = 0;
                        }
                        break;
                    case 15:
                        iA = 512;
                        break;
                    case 17:
                        byte[] bArr = new byte[16];
                        int iPosition4 = byteBuffer.position();
                        byteBuffer.get(bArr);
                        byteBuffer.position(iPosition4);
                        iA = com.yandex.mobile.ads.impl.l.a(new lp0(16, bArr)).f22581c;
                        break;
                }
                this.F = iA;
                if (iA == 0) {
                    return true;
                }
            }
            if (this.f23477w != null) {
                if (!g()) {
                    return false;
                }
                a(j10);
                this.f23477w = null;
            }
            long j11 = this.I;
            f fVar4 = this.f23474t;
            long jI = ((((fVar4.f23492c == 0 ? this.B / ((long) fVar4.f23491b) : this.C) - this.f23459e.i()) * 1000000) / ((long) fVar4.f23490a.f27129z)) + j11;
            if (!this.G && Math.abs(jI - j10) > 200000) {
                bc.c cVar = this.f23472r;
                bc.d dVar = new bc.d(j10, jI);
                fb0.a aVar = (fb0.a) cVar;
                Objects.requireNonNull(aVar);
                p90.a("MediaCodecAudioRenderer", "Audio sink error", dVar);
                fb0.this.I0.b(dVar);
                this.G = true;
            }
            if (this.G) {
                if (!g()) {
                    return false;
                }
                long j12 = j10 - jI;
                this.I += j12;
                this.G = false;
                a(j10);
                bc.c cVar2 = this.f23472r;
                if (cVar2 != null && j12 != 0) {
                    fb0.this.R();
                }
            }
            if (this.f23474t.f23492c == 0) {
                this.B += (long) byteBuffer.remaining();
            } else {
                this.C = (((long) this.F) * ((long) i10)) + this.C;
            }
            this.M = byteBuffer;
            this.N = i10;
        }
        b(j10);
        if (!this.M.hasRemaining()) {
            this.M = null;
            this.N = 0;
            return true;
        }
        if (!this.f23463i.e(i())) {
            return false;
        }
        p90.d("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.bc
    public final int b(yv yvVar) {
        if (!"audio/raw".equals(yvVar.f27115l)) {
            if (this.f23454a0 || !a(yvVar, this.f23476v)) {
                return this.f23453a.a(yvVar) != null ? 2 : 0;
            }
            return 2;
        }
        if (da1.e(yvVar.A)) {
            int i10 = yvVar.A;
            return (i10 == 2 || (this.f23457c && i10 == 4)) ? 2 : 1;
        }
        StringBuilder sbA = v60.a("Invalid PCM encoding: ");
        sbA.append(yvVar.A);
        p90.d("DefaultAudioSink", sbA.toString());
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.bc
    public final void b() {
        pa.b(da1.f19803a >= 21);
        pa.b(this.V);
        if (this.Y) {
            return;
        }
        this.Y = true;
        flush();
    }

    @Override // com.yandex.mobile.ads.impl.bc
    public final void b(boolean z10) {
        zq0 zq0Var = h().f23502a;
        i iVarH = h();
        if (zq0Var.equals(iVarH.f23502a) && z10 == iVarH.f23503b) {
            return;
        }
        i iVar = new i(zq0Var, z10, -9223372036854775807L, -9223372036854775807L, 0);
        if (k()) {
            this.f23477w = iVar;
        } else {
            this.f23478x = iVar;
        }
    }

    @Override // com.yandex.mobile.ads.impl.bc
    public final void c() throws bc.e {
        if (!this.S && k() && g()) {
            if (!this.T) {
                this.T = true;
                this.f23463i.c(i());
                this.f23475u.stop();
                this.A = 0;
            }
            this.S = true;
        }
    }

    @Override // com.yandex.mobile.ads.impl.bc
    public final boolean d() {
        return k() && this.f23463i.d(i());
    }

    @Override // com.yandex.mobile.ads.impl.bc
    public final void e() {
        if (this.Y) {
            this.Y = false;
            flush();
        }
    }

    @Override // com.yandex.mobile.ads.impl.bc
    public final void f() {
        this.G = true;
    }

    @Override // com.yandex.mobile.ads.impl.bc
    public final void flush() {
        if (k()) {
            l();
            if (this.f23463i.b()) {
                this.f23475u.pause();
            }
            AudioTrack audioTrack = this.f23475u;
            int i10 = da1.f19803a;
            if (i10 >= 29 && audioTrack.isOffloadedPlayback()) {
                l lVar = this.f23467m;
                Objects.requireNonNull(lVar);
                lVar.b(this.f23475u);
            }
            AudioTrack audioTrack2 = this.f23475u;
            this.f23475u = null;
            if (i10 < 21 && !this.V) {
                this.W = 0;
            }
            f fVar = this.f23473s;
            if (fVar != null) {
                this.f23474t = fVar;
                this.f23473s = null;
            }
            this.f23463i.d();
            this.f23462h.c();
            new a(audioTrack2).start();
        }
        this.f23469o.a();
        this.f23468n.a();
    }

    @Override // com.yandex.mobile.ads.impl.bc
    public final zq0 getPlaybackParameters() {
        return this.f23465k ? this.f23479y : h().f23502a;
    }

    @Override // com.yandex.mobile.ads.impl.bc
    public final void pause() {
        this.U = false;
        if (k() && this.f23463i.c()) {
            this.f23475u.pause();
        }
    }

    @Override // com.yandex.mobile.ads.impl.bc
    public final void play() {
        this.U = true;
        if (k()) {
            this.f23463i.e();
            this.f23475u.play();
        }
    }

    @Override // com.yandex.mobile.ads.impl.bc
    public final void reset() {
        flush();
        for (zb zbVar : this.f23460f) {
            zbVar.reset();
        }
        for (zb zbVar2 : this.f23461g) {
            zbVar2.reset();
        }
        this.U = false;
        this.f23454a0 = false;
    }

    @Override // com.yandex.mobile.ads.impl.bc
    public final void setVolume(float f10) {
        if (this.J != f10) {
            this.J = f10;
            if (k()) {
                if (da1.f19803a >= 21) {
                    this.f23475u.setVolume(this.J);
                    return;
                }
                AudioTrack audioTrack = this.f23475u;
                float f11 = this.J;
                audioTrack.setStereoVolume(f11, f11);
            }
        }
    }
}
