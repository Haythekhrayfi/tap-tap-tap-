package com.applovin.exoplayer2.b;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import ch.qos.logback.classic.Level;
import com.applovin.exoplayer2.am;
import com.applovin.exoplayer2.l.ai;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class n implements com.applovin.exoplayer2.b.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f4507a;
    private long A;
    private long B;
    private long C;
    private long D;
    private int E;
    private boolean F;
    private boolean G;
    private long H;
    private float I;
    private com.applovin.exoplayer2.b.f[] J;
    private ByteBuffer[] K;
    private ByteBuffer L;
    private int M;
    private ByteBuffer N;
    private byte[] O;
    private int P;
    private int Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private int V;
    private k W;
    private boolean X;
    private long Y;
    private boolean Z;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private boolean f4508aa;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.exoplayer2.b.e f4509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f4510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f4511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m f4512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x f4513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.exoplayer2.b.f[] f4514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.applovin.exoplayer2.b.f[] f4515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ConditionVariable f4516i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final j f4517j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayDeque<e> f4518k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f4519l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f4520m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private h f4521n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final f<com.applovin.exoplayer2.b.h.b> f4522o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final f<com.applovin.exoplayer2.b.h.e> f4523p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.applovin.exoplayer2.b.h.c f4524q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b f4525r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private b f4526s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private AudioTrack f4527t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.applovin.exoplayer2.b.d f4528u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private e f4529v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private e f4530w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private am f4531x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private ByteBuffer f4532y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f4533z;

    public interface a {
        long a(long j10);

        am a(am amVar);

        boolean a(boolean z10);

        com.applovin.exoplayer2.b.f[] a();

        long b();
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.exoplayer2.v f4536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f4538c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f4539d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f4540e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f4541f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f4542g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f4543h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final com.applovin.exoplayer2.b.f[] f4544i;

        public b(com.applovin.exoplayer2.v vVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10, com.applovin.exoplayer2.b.f[] fVarArr) {
            this.f4536a = vVar;
            this.f4537b = i10;
            this.f4538c = i11;
            this.f4539d = i12;
            this.f4540e = i13;
            this.f4541f = i14;
            this.f4542g = i15;
            this.f4544i = fVarArr;
            this.f4543h = a(i16, z10);
        }

        private int a(float f10) {
            int minBufferSize = AudioTrack.getMinBufferSize(this.f4540e, this.f4541f, this.f4542g);
            com.applovin.exoplayer2.l.a.b(minBufferSize != -2);
            int iA = ai.a(minBufferSize * 4, ((int) c(250000L)) * this.f4539d, Math.max(minBufferSize, ((int) c(750000L)) * this.f4539d));
            return f10 != 1.0f ? Math.round(iA * f10) : iA;
        }

        private int a(int i10, boolean z10) {
            long j10;
            if (i10 != 0) {
                return i10;
            }
            int i11 = this.f4538c;
            if (i11 == 0) {
                return a(z10 ? 8.0f : 1.0f);
            }
            if (i11 == 1) {
                j10 = 50000000;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException();
                }
                j10 = 250000;
            }
            return d(j10);
        }

        private static AudioAttributes a(com.applovin.exoplayer2.b.d dVar, boolean z10) {
            return z10 ? b() : dVar.a();
        }

        private AudioTrack a(com.applovin.exoplayer2.b.d dVar, int i10) {
            int iG = ai.g(dVar.f4416d);
            int i11 = this.f4540e;
            int i12 = this.f4541f;
            int i13 = this.f4542g;
            int i14 = this.f4543h;
            return i10 == 0 ? new AudioTrack(iG, i11, i12, i13, i14, 1) : new AudioTrack(iG, i11, i12, i13, i14, 1, i10);
        }

        private static AudioAttributes b() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        private AudioTrack b(boolean z10, com.applovin.exoplayer2.b.d dVar, int i10) {
            int i11 = ai.f7595a;
            if (i11 >= 29) {
                return c(z10, dVar, i10);
            }
            return i11 >= 21 ? d(z10, dVar, i10) : a(dVar, i10);
        }

        private AudioTrack c(boolean z10, com.applovin.exoplayer2.b.d dVar, int i10) {
            return new AudioTrack.Builder().setAudioAttributes(a(dVar, z10)).setAudioFormat(n.b(this.f4540e, this.f4541f, this.f4542g)).setTransferMode(1).setBufferSizeInBytes(this.f4543h).setSessionId(i10).setOffloadedPlayback(this.f4538c == 1).build();
        }

        private int d(long j10) {
            int iF = n.f(this.f4542g);
            if (this.f4542g == 5) {
                iF *= 2;
            }
            return (int) ((j10 * ((long) iF)) / 1000000);
        }

        private AudioTrack d(boolean z10, com.applovin.exoplayer2.b.d dVar, int i10) {
            return new AudioTrack(a(dVar, z10), n.b(this.f4540e, this.f4541f, this.f4542g), this.f4543h, 1, i10);
        }

        public long a(long j10) {
            return (j10 * 1000000) / ((long) this.f4536a.f8212z);
        }

        public AudioTrack a(boolean z10, com.applovin.exoplayer2.b.d dVar, int i10) throws com.applovin.exoplayer2.b.h.b {
            try {
                AudioTrack audioTrackB = b(z10, dVar, i10);
                int state = audioTrackB.getState();
                if (state == 1) {
                    return audioTrackB;
                }
                try {
                    audioTrackB.release();
                } catch (Exception unused) {
                }
                throw new com.applovin.exoplayer2.b.h.b(state, this.f4540e, this.f4541f, this.f4543h, this.f4536a, a(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e10) {
                throw new com.applovin.exoplayer2.b.h.b(0, this.f4540e, this.f4541f, this.f4543h, this.f4536a, a(), e10);
            }
        }

        public boolean a() {
            return this.f4538c == 1;
        }

        public boolean a(b bVar) {
            return bVar.f4538c == this.f4538c && bVar.f4542g == this.f4542g && bVar.f4540e == this.f4540e && bVar.f4541f == this.f4541f && bVar.f4539d == this.f4539d;
        }

        public long b(long j10) {
            return (j10 * 1000000) / ((long) this.f4540e);
        }

        public long c(long j10) {
            return (j10 * ((long) this.f4540e)) / 1000000;
        }
    }

    public static class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.exoplayer2.b.f[] f4545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u f4546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final w f4547c;

        public c(com.applovin.exoplayer2.b.f... fVarArr) {
            this(fVarArr, new u(), new w());
        }

        public c(com.applovin.exoplayer2.b.f[] fVarArr, u uVar, w wVar) {
            com.applovin.exoplayer2.b.f[] fVarArr2 = new com.applovin.exoplayer2.b.f[fVarArr.length + 2];
            this.f4545a = fVarArr2;
            System.arraycopy(fVarArr, 0, fVarArr2, 0, fVarArr.length);
            this.f4546b = uVar;
            this.f4547c = wVar;
            fVarArr2[fVarArr.length] = uVar;
            fVarArr2[fVarArr.length + 1] = wVar;
        }

        @Override // com.applovin.exoplayer2.b.n.a
        public long a(long j10) {
            return this.f4547c.a(j10);
        }

        @Override // com.applovin.exoplayer2.b.n.a
        public am a(am amVar) {
            this.f4547c.a(amVar.f4253b);
            this.f4547c.b(amVar.f4254c);
            return amVar;
        }

        @Override // com.applovin.exoplayer2.b.n.a
        public boolean a(boolean z10) {
            this.f4546b.a(z10);
            return z10;
        }

        @Override // com.applovin.exoplayer2.b.n.a
        public com.applovin.exoplayer2.b.f[] a() {
            return this.f4545a;
        }

        @Override // com.applovin.exoplayer2.b.n.a
        public long b() {
            return this.f4546b.k();
        }
    }

    public static final class d extends RuntimeException {
        private d(String str) {
            super(str);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final am f4548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f4549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f4550c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f4551d;

        private e(am amVar, boolean z10, long j10, long j11) {
            this.f4548a = amVar;
            this.f4549b = z10;
            this.f4550c = j10;
            this.f4551d = j11;
        }
    }

    public static final class f<T extends Exception> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f4552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private T f4553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f4554c;

        public f(long j10) {
            this.f4552a = j10;
        }

        public void a() {
            this.f4553b = null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public void a(T t10) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f4553b == null) {
                this.f4553b = t10;
                this.f4554c = this.f4552a + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.f4554c) {
                T t11 = this.f4553b;
                if (t11 != t10) {
                    t11.addSuppressed(t10);
                }
                T t12 = this.f4553b;
                a();
                throw t12;
            }
        }
    }

    public final class g implements j.a {
        private g() {
        }

        @Override // com.applovin.exoplayer2.b.j.a
        public void a(int i10, long j10) {
            if (n.this.f4524q != null) {
                n.this.f4524q.a(i10, j10, SystemClock.elapsedRealtime() - n.this.Y);
            }
        }

        @Override // com.applovin.exoplayer2.b.j.a
        public void a(long j10) {
            if (n.this.f4524q != null) {
                n.this.f4524q.a(j10);
            }
        }

        @Override // com.applovin.exoplayer2.b.j.a
        public void a(long j10, long j11, long j12, long j13) {
            StringBuilder sbA = i2.a.a("Spurious audio timestamp (frame position mismatch): ", j10, ", ");
            sbA.append(j11);
            r.e.a(sbA, ", ", j12, ", ");
            sbA.append(j13);
            sbA.append(", ");
            sbA.append(n.this.z());
            sbA.append(", ");
            sbA.append(n.this.A());
            String string = sbA.toString();
            if (n.f4507a) {
                throw new d(string);
            }
            com.applovin.exoplayer2.l.q.c("DefaultAudioSink", string);
        }

        @Override // com.applovin.exoplayer2.b.j.a
        public void b(long j10) {
            com.applovin.exoplayer2.l.q.c("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }

        @Override // com.applovin.exoplayer2.b.j.a
        public void b(long j10, long j11, long j12, long j13) {
            StringBuilder sbA = i2.a.a("Spurious audio timestamp (system clock mismatch): ", j10, ", ");
            sbA.append(j11);
            r.e.a(sbA, ", ", j12, ", ");
            sbA.append(j13);
            sbA.append(", ");
            sbA.append(n.this.z());
            sbA.append(", ");
            sbA.append(n.this.A());
            String string = sbA.toString();
            if (n.f4507a) {
                throw new d(string);
            }
            com.applovin.exoplayer2.l.q.c("DefaultAudioSink", string);
        }
    }

    public final class h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f4557b = new Handler();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AudioTrack.StreamEventCallback f4558c;

        public h() {
            this.f4558c = new AudioTrack.StreamEventCallback() { // from class: com.applovin.exoplayer2.b.n.h.1
                @Override // android.media.AudioTrack.StreamEventCallback
                public void onDataRequest(AudioTrack audioTrack, int i10) {
                    com.applovin.exoplayer2.l.a.b(audioTrack == n.this.f4527t);
                    if (n.this.f4524q == null || !n.this.T) {
                        return;
                    }
                    n.this.f4524q.b();
                }

                @Override // android.media.AudioTrack.StreamEventCallback
                public void onTearDown(AudioTrack audioTrack) {
                    com.applovin.exoplayer2.l.a.b(audioTrack == n.this.f4527t);
                    if (n.this.f4524q == null || !n.this.T) {
                        return;
                    }
                    n.this.f4524q.b();
                }
            };
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f4557b;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new g0(handler, 0), this.f4558c);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f4558c);
            this.f4557b.removeCallbacksAndMessages(null);
        }
    }

    public n(com.applovin.exoplayer2.b.e eVar, a aVar, boolean z10, boolean z11, int i10) {
        this.f4509b = eVar;
        this.f4510c = (a) com.applovin.exoplayer2.l.a.b(aVar);
        int i11 = ai.f7595a;
        this.f4511d = i11 >= 21 && z10;
        this.f4519l = i11 >= 23 && z11;
        this.f4520m = i11 < 29 ? 0 : i10;
        this.f4516i = new ConditionVariable(true);
        this.f4517j = new j(new g());
        m mVar = new m();
        this.f4512e = mVar;
        x xVar = new x();
        this.f4513f = xVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new t(), mVar, xVar);
        Collections.addAll(arrayList, aVar.a());
        this.f4514g = (com.applovin.exoplayer2.b.f[]) arrayList.toArray(new com.applovin.exoplayer2.b.f[0]);
        this.f4515h = new com.applovin.exoplayer2.b.f[]{new p()};
        this.I = 1.0f;
        this.f4528u = com.applovin.exoplayer2.b.d.f4412a;
        this.V = 0;
        this.W = new k(0, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        am amVar = am.f4251a;
        this.f4530w = new e(amVar, false, 0L, 0L);
        this.f4531x = amVar;
        this.Q = -1;
        this.J = new com.applovin.exoplayer2.b.f[0];
        this.K = new ByteBuffer[0];
        this.f4518k = new ArrayDeque<>();
        this.f4522o = new f<>(100L);
        this.f4523p = new f<>(100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A() {
        b bVar = this.f4526s;
        return bVar.f4538c == 0 ? this.C / ((long) bVar.f4539d) : this.D;
    }

    private void B() {
        if (this.S) {
            return;
        }
        this.S = true;
        this.f4517j.e(A());
        this.f4527t.stop();
        this.f4533z = 0;
    }

    private static int a(int i10, int i11) {
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        for (int i12 = 8; i12 > 0; i12--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(ai.f(i12)).build(), audioAttributesBuild)) {
                return i12;
            }
        }
        return 0;
    }

    private static int a(int i10, ByteBuffer byteBuffer) {
        switch (i10) {
            case 5:
            case 6:
            case 18:
                return com.applovin.exoplayer2.b.b.a(byteBuffer);
            case 7:
            case 8:
                return o.a(byteBuffer);
            case 9:
                int iB = r.b(ai.a(byteBuffer, byteBuffer.position()));
                if (iB != -1) {
                    return iB;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            default:
                throw new IllegalStateException(android.support.v4.media.a.a("Unexpected audio encoding: ", i10));
            case 14:
                int iB2 = com.applovin.exoplayer2.b.b.b(byteBuffer);
                if (iB2 == -1) {
                    return 0;
                }
                return com.applovin.exoplayer2.b.b.a(byteBuffer, iB2) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return com.applovin.exoplayer2.b.c.a(byteBuffer);
        }
    }

    private int a(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        int i10 = ai.f7595a;
        if (i10 >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return (i10 == 30 && ai.f7598d.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    private static int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    private int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (ai.f7595a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.f4532y == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.f4532y = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.f4532y.putInt(1431633921);
        }
        if (this.f4533z == 0) {
            this.f4532y.putInt(4, i10);
            this.f4532y.putLong(8, j10 * 1000);
            this.f4532y.position(0);
            this.f4533z = i10;
        }
        int iRemaining = this.f4532y.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.f4532y, iRemaining, 1);
            if (iWrite < 0) {
                this.f4533z = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iA = a(audioTrack, byteBuffer, i10);
        if (iA < 0) {
            this.f4533z = 0;
            return iA;
        }
        this.f4533z -= iA;
        return iA;
    }

    private void a(long j10) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.J.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.K[i10 - 1];
            } else {
                byteBuffer = this.L;
                if (byteBuffer == null) {
                    byteBuffer = com.applovin.exoplayer2.b.f.f4436a;
                }
            }
            if (i10 == length) {
                a(byteBuffer, j10);
            } else {
                com.applovin.exoplayer2.b.f fVar = this.J[i10];
                if (i10 > this.Q) {
                    fVar.a(byteBuffer);
                }
                ByteBuffer byteBufferC = fVar.c();
                this.K[i10] = byteBufferC;
                if (byteBufferC.hasRemaining()) {
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

    private void a(AudioTrack audioTrack) {
        if (this.f4521n == null) {
            this.f4521n = new h();
        }
        this.f4521n.a(audioTrack);
    }

    private static void a(AudioTrack audioTrack, float f10) {
        audioTrack.setVolume(f10);
    }

    private void a(am amVar, boolean z10) {
        e eVarW = w();
        if (amVar.equals(eVarW.f4548a) && z10 == eVarW.f4549b) {
            return;
        }
        e eVar = new e(amVar, z10, -9223372036854775807L, -9223372036854775807L);
        if (y()) {
            this.f4529v = eVar;
        } else {
            this.f4530w = eVar;
        }
    }

    private void a(ByteBuffer byteBuffer, long j10) throws Exception {
        int iA;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.N;
            if (byteBuffer2 != null) {
                com.applovin.exoplayer2.l.a.a(byteBuffer2 == byteBuffer);
            } else {
                this.N = byteBuffer;
                if (ai.f7595a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.O;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.O = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.O, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.P = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (ai.f7595a < 21) {
                int iB = this.f4517j.b(this.C);
                if (iB > 0) {
                    iA = this.f4527t.write(this.O, this.P, Math.min(iRemaining2, iB));
                    if (iA > 0) {
                        this.P += iA;
                        byteBuffer.position(byteBuffer.position() + iA);
                    }
                } else {
                    iA = 0;
                }
            } else if (this.X) {
                com.applovin.exoplayer2.l.a.b(j10 != -9223372036854775807L);
                iA = a(this.f4527t, byteBuffer, iRemaining2, j10);
            } else {
                iA = a(this.f4527t, byteBuffer, iRemaining2);
            }
            this.Y = SystemClock.elapsedRealtime();
            if (iA < 0) {
                boolean zC = c(iA);
                if (zC) {
                    r();
                }
                com.applovin.exoplayer2.b.h.e eVar = new com.applovin.exoplayer2.b.h.e(iA, this.f4526s.f4536a, zC);
                com.applovin.exoplayer2.b.h.c cVar = this.f4524q;
                if (cVar != null) {
                    cVar.a(eVar);
                }
                if (eVar.f4457b) {
                    throw eVar;
                }
                this.f4523p.a(eVar);
                return;
            }
            this.f4523p.a();
            if (b(this.f4527t)) {
                long j11 = this.D;
                if (j11 > 0) {
                    this.f4508aa = false;
                }
                if (this.T && this.f4524q != null && iA < iRemaining2 && !this.f4508aa) {
                    this.f4524q.b(this.f4517j.c(j11));
                }
            }
            int i10 = this.f4526s.f4538c;
            if (i10 == 0) {
                this.C += (long) iA;
            }
            if (iA == iRemaining2) {
                if (i10 != 0) {
                    com.applovin.exoplayer2.l.a.b(byteBuffer == this.L);
                    this.D += (long) (this.E * this.M);
                }
                this.N = null;
            }
        }
    }

    private boolean a(com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.b.d dVar) {
        int iB;
        int iF;
        int iA;
        if (ai.f7595a < 29 || this.f4520m == 0 || (iB = com.applovin.exoplayer2.l.u.b((String) com.applovin.exoplayer2.l.a.b(vVar.f8198l), vVar.f8195i)) == 0 || (iF = ai.f(vVar.f8211y)) == 0 || (iA = a(b(vVar.f8212z, iF, iB), dVar.a())) == 0) {
            return false;
        }
        if (iA == 1) {
            return ((vVar.B != 0 || vVar.C != 0) && (this.f4520m == 1)) ? false : true;
        }
        if (iA == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    private static boolean a(com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.b.e eVar) {
        return b(vVar, eVar) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AudioFormat b(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    private static Pair<Integer, Integer> b(com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.b.e eVar) {
        if (eVar == null) {
            return null;
        }
        int iB = com.applovin.exoplayer2.l.u.b((String) com.applovin.exoplayer2.l.a.b(vVar.f8198l), vVar.f8195i);
        int iA = 6;
        if (!(iB == 5 || iB == 6 || iB == 18 || iB == 17 || iB == 7 || iB == 8 || iB == 14)) {
            return null;
        }
        if (iB == 18 && !eVar.a(18)) {
            iB = 6;
        } else if (iB == 8 && !eVar.a(8)) {
            iB = 7;
        }
        if (!eVar.a(iB)) {
            return null;
        }
        if (iB != 18) {
            iA = vVar.f8211y;
            if (iA > eVar.a()) {
                return null;
            }
        } else if (ai.f7595a >= 29 && (iA = a(18, vVar.f8212z)) == 0) {
            com.applovin.exoplayer2.l.q.c("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
            return null;
        }
        int iE = e(iA);
        if (iE == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iB), Integer.valueOf(iE));
    }

    private void b(long j10) {
        am amVarA = x() ? this.f4510c.a(v()) : am.f4251a;
        boolean zA = x() ? this.f4510c.a(m()) : false;
        this.f4518k.add(new e(amVarA, zA, Math.max(0L, j10), this.f4526s.b(A())));
        n();
        com.applovin.exoplayer2.b.h.c cVar = this.f4524q;
        if (cVar != null) {
            cVar.a(zA);
        }
    }

    private static void b(AudioTrack audioTrack, float f10) {
        audioTrack.setStereoVolume(f10, f10);
    }

    private void b(am amVar) {
        if (y()) {
            try {
                this.f4527t.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(amVar.f4253b).setPitch(amVar.f4254c).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                com.applovin.exoplayer2.l.q.b("DefaultAudioSink", "Failed to set playback params", e10);
            }
            amVar = new am(this.f4527t.getPlaybackParams().getSpeed(), this.f4527t.getPlaybackParams().getPitch());
            this.f4517j.a(amVar.f4253b);
        }
        this.f4531x = amVar;
    }

    private static boolean b(AudioTrack audioTrack) {
        return ai.f7595a >= 29 && audioTrack.isOffloadedPlayback();
    }

    private long c(long j10) {
        while (!this.f4518k.isEmpty() && j10 >= this.f4518k.getFirst().f4551d) {
            this.f4530w = this.f4518k.remove();
        }
        e eVar = this.f4530w;
        long j11 = j10 - eVar.f4551d;
        if (eVar.f4548a.equals(am.f4251a)) {
            return this.f4530w.f4550c + j11;
        }
        if (this.f4518k.isEmpty()) {
            return this.f4530w.f4550c + this.f4510c.a(j11);
        }
        e first = this.f4518k.getFirst();
        return first.f4550c - ai.a(first.f4551d - j10, this.f4530w.f4548a.f4253b);
    }

    private static boolean c(int i10) {
        return (ai.f7595a >= 24 && i10 == -6) || i10 == -32;
    }

    private long d(long j10) {
        return j10 + this.f4526s.b(this.f4510c.b());
    }

    private boolean d(int i10) {
        return this.f4511d && ai.e(i10);
    }

    private static int e(int i10) {
        int i11 = ai.f7595a;
        if (i11 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(ai.f7596b) && i10 == 1) {
            i10 = 2;
        }
        return ai.f(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int f(int i10) {
        switch (i10) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return Level.ERROR_INT;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
        }
    }

    private void n() {
        com.applovin.exoplayer2.b.f[] fVarArr = this.f4526s.f4544i;
        ArrayList arrayList = new ArrayList();
        for (com.applovin.exoplayer2.b.f fVar : fVarArr) {
            if (fVar.a()) {
                arrayList.add(fVar);
            } else {
                fVar.e();
            }
        }
        int size = arrayList.size();
        this.J = (com.applovin.exoplayer2.b.f[]) arrayList.toArray(new com.applovin.exoplayer2.b.f[size]);
        this.K = new ByteBuffer[size];
        o();
    }

    private void o() {
        int i10 = 0;
        while (true) {
            com.applovin.exoplayer2.b.f[] fVarArr = this.J;
            if (i10 >= fVarArr.length) {
                return;
            }
            com.applovin.exoplayer2.b.f fVar = fVarArr[i10];
            fVar.e();
            this.K[i10] = fVar.c();
            i10++;
        }
    }

    private void p() throws com.applovin.exoplayer2.b.h.b {
        this.f4516i.block();
        AudioTrack audioTrackQ = q();
        this.f4527t = audioTrackQ;
        if (b(audioTrackQ)) {
            a(this.f4527t);
            if (this.f4520m != 3) {
                AudioTrack audioTrack = this.f4527t;
                com.applovin.exoplayer2.v vVar = this.f4526s.f4536a;
                audioTrack.setOffloadDelayPadding(vVar.B, vVar.C);
            }
        }
        this.V = this.f4527t.getAudioSessionId();
        j jVar = this.f4517j;
        AudioTrack audioTrack2 = this.f4527t;
        b bVar = this.f4526s;
        jVar.a(audioTrack2, bVar.f4538c == 2, bVar.f4542g, bVar.f4539d, bVar.f4543h);
        t();
        int i10 = this.W.f4496a;
        if (i10 != 0) {
            this.f4527t.attachAuxEffect(i10);
            this.f4527t.setAuxEffectSendLevel(this.W.f4497b);
        }
        this.G = true;
    }

    private AudioTrack q() throws com.applovin.exoplayer2.b.h.b {
        try {
            return ((b) com.applovin.exoplayer2.l.a.b(this.f4526s)).a(this.X, this.f4528u, this.V);
        } catch (com.applovin.exoplayer2.b.h.b e10) {
            r();
            com.applovin.exoplayer2.b.h.c cVar = this.f4524q;
            if (cVar != null) {
                cVar.a(e10);
            }
            throw e10;
        }
    }

    private void r() {
        if (this.f4526s.a()) {
            this.Z = true;
        }
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
    private boolean s() throws com.applovin.exoplayer2.b.h.e {
        /*
            r9 = this;
            int r0 = r9.Q
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.Q = r3
        L9:
            r0 = r2
            goto Lc
        Lb:
            r0 = r3
        Lc:
            int r4 = r9.Q
            com.applovin.exoplayer2.b.f[] r5 = r9.J
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.b()
        L1f:
            r9.a(r7)
            boolean r0 = r4.d()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.Q
            int r0 = r0 + r2
            r9.Q = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.N
            if (r0 == 0) goto L3b
            r9.a(r0, r7)
            java.nio.ByteBuffer r0 = r9.N
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.Q = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.b.n.s():boolean");
    }

    private void t() {
        if (y()) {
            if (ai.f7595a >= 21) {
                a(this.f4527t, this.I);
            } else {
                b(this.f4527t, this.I);
            }
        }
    }

    private void u() {
        this.A = 0L;
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.f4508aa = false;
        this.E = 0;
        this.f4530w = new e(v(), m(), 0L, 0L);
        this.H = 0L;
        this.f4529v = null;
        this.f4518k.clear();
        this.L = null;
        this.M = 0;
        this.N = null;
        this.S = false;
        this.R = false;
        this.Q = -1;
        this.f4532y = null;
        this.f4533z = 0;
        this.f4513f.k();
        o();
    }

    private am v() {
        return w().f4548a;
    }

    private e w() {
        e eVar = this.f4529v;
        if (eVar != null) {
            return eVar;
        }
        return !this.f4518k.isEmpty() ? this.f4518k.getLast() : this.f4530w;
    }

    private boolean x() {
        return (this.X || !"audio/raw".equals(this.f4526s.f4536a.f8198l) || d(this.f4526s.f4536a.A)) ? false : true;
    }

    private boolean y() {
        return this.f4527t != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long z() {
        b bVar = this.f4526s;
        return bVar.f4538c == 0 ? this.A / ((long) bVar.f4537b) : this.B;
    }

    @Override // com.applovin.exoplayer2.b.h
    public long a(boolean z10) {
        if (!y() || this.G) {
            return Long.MIN_VALUE;
        }
        return d(c(Math.min(this.f4517j.a(z10), this.f4526s.b(A()))));
    }

    @Override // com.applovin.exoplayer2.b.h
    public void a() {
        this.T = true;
        if (y()) {
            this.f4517j.a();
            this.f4527t.play();
        }
    }

    @Override // com.applovin.exoplayer2.b.h
    public void a(float f10) {
        if (this.I != f10) {
            this.I = f10;
            t();
        }
    }

    @Override // com.applovin.exoplayer2.b.h
    public void a(int i10) {
        if (this.V != i10) {
            this.V = i10;
            this.U = i10 != 0;
            j();
        }
    }

    @Override // com.applovin.exoplayer2.b.h
    public void a(am amVar) {
        am amVar2 = new am(ai.a(amVar.f4253b, 0.1f, 8.0f), ai.a(amVar.f4254c, 0.1f, 8.0f));
        if (!this.f4519l || ai.f7595a < 23) {
            a(amVar2, m());
        } else {
            b(amVar2);
        }
    }

    @Override // com.applovin.exoplayer2.b.h
    public void a(com.applovin.exoplayer2.b.d dVar) {
        if (this.f4528u.equals(dVar)) {
            return;
        }
        this.f4528u = dVar;
        if (this.X) {
            return;
        }
        j();
    }

    @Override // com.applovin.exoplayer2.b.h
    public void a(com.applovin.exoplayer2.b.h.c cVar) {
        this.f4524q = cVar;
    }

    @Override // com.applovin.exoplayer2.b.h
    public void a(k kVar) {
        if (this.W.equals(kVar)) {
            return;
        }
        int i10 = kVar.f4496a;
        float f10 = kVar.f4497b;
        AudioTrack audioTrack = this.f4527t;
        if (audioTrack != null) {
            if (this.W.f4496a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f4527t.setAuxEffectSendLevel(f10);
            }
        }
        this.W = kVar;
    }

    @Override // com.applovin.exoplayer2.b.h
    public void a(com.applovin.exoplayer2.v vVar, int i10, int[] iArr) throws com.applovin.exoplayer2.b.h.a {
        com.applovin.exoplayer2.b.f[] fVarArr;
        int iC;
        int iIntValue;
        int iIntValue2;
        int i11;
        int i12;
        int iC2;
        int[] iArr2;
        if ("audio/raw".equals(vVar.f8198l)) {
            com.applovin.exoplayer2.l.a.a(ai.d(vVar.A));
            iC = ai.c(vVar.A, vVar.f8211y);
            com.applovin.exoplayer2.b.f[] fVarArr2 = d(vVar.A) ? this.f4515h : this.f4514g;
            this.f4513f.a(vVar.B, vVar.C);
            if (ai.f7595a < 21 && vVar.f8211y == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i13 = 0; i13 < 6; i13++) {
                    iArr2[i13] = i13;
                }
            } else {
                iArr2 = iArr;
            }
            this.f4512e.a(iArr2);
            com.applovin.exoplayer2.b.f.a aVar = new com.applovin.exoplayer2.b.f.a(vVar.f8212z, vVar.f8211y, vVar.A);
            for (com.applovin.exoplayer2.b.f fVar : fVarArr2) {
                try {
                    com.applovin.exoplayer2.b.f.a aVarA = fVar.a(aVar);
                    if (fVar.a()) {
                        aVar = aVarA;
                    }
                } catch (com.applovin.exoplayer2.b.f.b e10) {
                    throw new com.applovin.exoplayer2.b.h.a(e10, vVar);
                }
            }
            int i14 = aVar.f4440d;
            i11 = aVar.f4438b;
            iIntValue2 = ai.f(aVar.f4439c);
            fVarArr = fVarArr2;
            iIntValue = i14;
            iC2 = ai.c(i14, aVar.f4439c);
            i12 = 0;
        } else {
            com.applovin.exoplayer2.b.f[] fVarArr3 = new com.applovin.exoplayer2.b.f[0];
            int i15 = vVar.f8212z;
            if (a(vVar, this.f4528u)) {
                fVarArr = fVarArr3;
                iC = -1;
                iIntValue = com.applovin.exoplayer2.l.u.b((String) com.applovin.exoplayer2.l.a.b(vVar.f8198l), vVar.f8195i);
                iC2 = -1;
                i11 = i15;
                i12 = 1;
                iIntValue2 = ai.f(vVar.f8211y);
            } else {
                Pair<Integer, Integer> pairB = b(vVar, this.f4509b);
                if (pairB == null) {
                    throw new com.applovin.exoplayer2.b.h.a("Unable to configure passthrough for: " + vVar, vVar);
                }
                fVarArr = fVarArr3;
                iC = -1;
                iIntValue = ((Integer) pairB.first).intValue();
                iIntValue2 = ((Integer) pairB.second).intValue();
                i11 = i15;
                i12 = 2;
                iC2 = -1;
            }
        }
        if (iIntValue == 0) {
            throw new com.applovin.exoplayer2.b.h.a("Invalid output encoding (mode=" + i12 + ") for: " + vVar, vVar);
        }
        if (iIntValue2 == 0) {
            throw new com.applovin.exoplayer2.b.h.a("Invalid output channel config (mode=" + i12 + ") for: " + vVar, vVar);
        }
        this.Z = false;
        b bVar = new b(vVar, iC, i12, iC2, i11, iIntValue2, iIntValue, i10, this.f4519l, fVarArr);
        if (y()) {
            this.f4525r = bVar;
        } else {
            this.f4526s = bVar;
        }
    }

    @Override // com.applovin.exoplayer2.b.h
    public boolean a(com.applovin.exoplayer2.v vVar) {
        return b(vVar) != 0;
    }

    @Override // com.applovin.exoplayer2.b.h
    public boolean a(ByteBuffer byteBuffer, long j10, int i10) throws Exception {
        ByteBuffer byteBuffer2 = this.L;
        com.applovin.exoplayer2.l.a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f4525r != null) {
            if (!s()) {
                return false;
            }
            if (this.f4525r.a(this.f4526s)) {
                this.f4526s = this.f4525r;
                this.f4525r = null;
                if (b(this.f4527t) && this.f4520m != 3) {
                    this.f4527t.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.f4527t;
                    com.applovin.exoplayer2.v vVar = this.f4526s.f4536a;
                    audioTrack.setOffloadDelayPadding(vVar.B, vVar.C);
                    this.f4508aa = true;
                }
            } else {
                B();
                if (e()) {
                    return false;
                }
                j();
            }
            b(j10);
        }
        if (!y()) {
            try {
                p();
            } catch (com.applovin.exoplayer2.b.h.b e10) {
                if (e10.f4452b) {
                    throw e10;
                }
                this.f4522o.a(e10);
                return false;
            }
        }
        this.f4522o.a();
        if (this.G) {
            this.H = Math.max(0L, j10);
            this.F = false;
            this.G = false;
            if (this.f4519l && ai.f7595a >= 23) {
                b(this.f4531x);
            }
            b(j10);
            if (this.T) {
                a();
            }
        }
        if (!this.f4517j.a(A())) {
            return false;
        }
        if (this.L == null) {
            com.applovin.exoplayer2.l.a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            b bVar = this.f4526s;
            if (bVar.f4538c != 0 && this.E == 0) {
                int iA = a(bVar.f4542g, byteBuffer);
                this.E = iA;
                if (iA == 0) {
                    return true;
                }
            }
            if (this.f4529v != null) {
                if (!s()) {
                    return false;
                }
                b(j10);
                this.f4529v = null;
            }
            long jA = this.H + this.f4526s.a(z() - this.f4513f.l());
            if (!this.F && Math.abs(jA - j10) > 200000) {
                this.f4524q.a(new com.applovin.exoplayer2.b.h.d(j10, jA));
                this.F = true;
            }
            if (this.F) {
                if (!s()) {
                    return false;
                }
                long j11 = j10 - jA;
                this.H += j11;
                this.F = false;
                b(j10);
                com.applovin.exoplayer2.b.h.c cVar = this.f4524q;
                if (cVar != null && j11 != 0) {
                    cVar.a();
                }
            }
            if (this.f4526s.f4538c == 0) {
                this.A += (long) byteBuffer.remaining();
            } else {
                this.B += (long) (this.E * i10);
            }
            this.L = byteBuffer;
            this.M = i10;
        }
        a(j10);
        if (!this.L.hasRemaining()) {
            this.L = null;
            this.M = 0;
            return true;
        }
        if (!this.f4517j.d(A())) {
            return false;
        }
        com.applovin.exoplayer2.l.q.c("DefaultAudioSink", "Resetting stalled audio track");
        j();
        return true;
    }

    @Override // com.applovin.exoplayer2.b.h
    public int b(com.applovin.exoplayer2.v vVar) {
        if (!"audio/raw".equals(vVar.f8198l)) {
            return ((this.Z || !a(vVar, this.f4528u)) && !a(vVar, this.f4509b)) ? 0 : 2;
        }
        if (ai.d(vVar.A)) {
            int i10 = vVar.A;
            return (i10 == 2 || (this.f4511d && i10 == 4)) ? 2 : 1;
        }
        StringBuilder sbA = defpackage.a.a("Invalid PCM encoding: ");
        sbA.append(vVar.A);
        com.applovin.exoplayer2.l.q.c("DefaultAudioSink", sbA.toString());
        return 0;
    }

    @Override // com.applovin.exoplayer2.b.h
    public void b() {
        this.F = true;
    }

    @Override // com.applovin.exoplayer2.b.h
    public void b(boolean z10) {
        a(v(), z10);
    }

    @Override // com.applovin.exoplayer2.b.h
    public void c() throws com.applovin.exoplayer2.b.h.e {
        if (!this.R && y() && s()) {
            B();
            this.R = true;
        }
    }

    @Override // com.applovin.exoplayer2.b.h
    public boolean d() {
        return !y() || (this.R && !e());
    }

    @Override // com.applovin.exoplayer2.b.h
    public boolean e() {
        return y() && this.f4517j.f(A());
    }

    @Override // com.applovin.exoplayer2.b.h
    public am f() {
        return this.f4519l ? this.f4531x : v();
    }

    @Override // com.applovin.exoplayer2.b.h
    public void g() {
        com.applovin.exoplayer2.l.a.b(ai.f7595a >= 21);
        com.applovin.exoplayer2.l.a.b(this.U);
        if (this.X) {
            return;
        }
        this.X = true;
        j();
    }

    @Override // com.applovin.exoplayer2.b.h
    public void h() {
        if (this.X) {
            this.X = false;
            j();
        }
    }

    @Override // com.applovin.exoplayer2.b.h
    public void i() {
        this.T = false;
        if (y() && this.f4517j.c()) {
            this.f4527t.pause();
        }
    }

    @Override // com.applovin.exoplayer2.b.h
    public void j() {
        if (y()) {
            u();
            if (this.f4517j.b()) {
                this.f4527t.pause();
            }
            if (b(this.f4527t)) {
                ((h) com.applovin.exoplayer2.l.a.b(this.f4521n)).b(this.f4527t);
            }
            final AudioTrack audioTrack = this.f4527t;
            this.f4527t = null;
            if (ai.f7595a < 21 && !this.U) {
                this.V = 0;
            }
            b bVar = this.f4525r;
            if (bVar != null) {
                this.f4526s = bVar;
                this.f4525r = null;
            }
            this.f4517j.d();
            this.f4516i.close();
            new Thread("ExoPlayer:AudioTrackReleaseThread") { // from class: com.applovin.exoplayer2.b.n.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        audioTrack.flush();
                        audioTrack.release();
                    } finally {
                        n.this.f4516i.open();
                    }
                }
            }.start();
        }
        this.f4523p.a();
        this.f4522o.a();
    }

    @Override // com.applovin.exoplayer2.b.h
    public void k() {
        if (ai.f7595a < 25) {
            j();
            return;
        }
        this.f4523p.a();
        this.f4522o.a();
        if (y()) {
            u();
            if (this.f4517j.b()) {
                this.f4527t.pause();
            }
            this.f4527t.flush();
            this.f4517j.d();
            j jVar = this.f4517j;
            AudioTrack audioTrack = this.f4527t;
            b bVar = this.f4526s;
            jVar.a(audioTrack, bVar.f4538c == 2, bVar.f4542g, bVar.f4539d, bVar.f4543h);
            this.G = true;
        }
    }

    @Override // com.applovin.exoplayer2.b.h
    public void l() {
        j();
        for (com.applovin.exoplayer2.b.f fVar : this.f4514g) {
            fVar.f();
        }
        for (com.applovin.exoplayer2.b.f fVar2 : this.f4515h) {
            fVar2.f();
        }
        this.T = false;
        this.Z = false;
    }

    public boolean m() {
        return w().f4549b;
    }
}
