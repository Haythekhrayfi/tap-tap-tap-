package com.applovin.exoplayer2.f;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.l.af;
import com.applovin.exoplayer2.l.ah;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import com.applovin.exoplayer2.w;
import com.facebook.ads.AdError;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends com.applovin.exoplayer2.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f6248b = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    private v A;
    private MediaFormat B;
    private boolean C;
    private float D;
    private ArrayDeque<i> E;
    private a F;
    private i G;
    private int H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private e S;
    private long T;
    private int U;
    private int V;
    private ByteBuffer W;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.applovin.exoplayer2.c.e f6249a;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private boolean f6250aa;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private boolean f6251ab;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private boolean f6252ac;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private int f6253ad;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private int f6254ae;
    private int af;
    private boolean ag;
    private boolean ah;
    private boolean ai;
    private long aj;
    private long ak;
    private boolean al;
    private boolean am;
    private boolean an;
    private boolean ao;
    private boolean ap;
    private boolean aq;
    private boolean ar;
    private com.applovin.exoplayer2.p as;
    private long at;
    private long au;
    private int av;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g.b f6255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f6256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f6257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f6258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.exoplayer2.c.g f6259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.applovin.exoplayer2.c.g f6260h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.applovin.exoplayer2.c.g f6261i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final d f6262j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final af<v> f6263k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ArrayList<Long> f6264l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final MediaCodec.BufferInfo f6265m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long[] f6266n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final long[] f6267o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long[] f6268p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private v f6269q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private v f6270r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.applovin.exoplayer2.d.f f6271s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.applovin.exoplayer2.d.f f6272t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private MediaCrypto f6273u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f6274v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f6275w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f6276x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f6277y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private g f6278z;

    public static class a extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f6280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i f6281c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f6282d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final a f6283e;

        public a(v vVar, Throwable th, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + vVar, th, vVar.f8198l, z10, null, a(i10), null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(v vVar, Throwable th, boolean z10, i iVar) {
            StringBuilder sbA = defpackage.a.a("Decoder init failed: ");
            sbA.append(iVar.f6237a);
            sbA.append(", ");
            sbA.append(vVar);
            this(sbA.toString(), th, vVar.f8198l, z10, iVar, ai.f7595a >= 21 ? a(th) : null, null);
        }

        private a(String str, Throwable th, String str2, boolean z10, i iVar, String str3, a aVar) {
            super(str, th);
            this.f6279a = str2;
            this.f6280b = z10;
            this.f6281c = iVar;
            this.f6282d = str3;
            this.f6283e = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a a(a aVar) {
            return new a(getMessage(), getCause(), this.f6279a, this.f6280b, this.f6281c, this.f6282d, aVar);
        }

        private static String a(int i10) {
            StringBuilder sbA = android.support.v4.media.c.a("com.applovin.exoplayer2.mediacodec.MediaCodecRenderer_", i10 < 0 ? "neg_" : "");
            sbA.append(Math.abs(i10));
            return sbA.toString();
        }

        private static String a(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }
    }

    public j(int i10, g.b bVar, k kVar, boolean z10, float f10) {
        super(i10);
        this.f6255c = bVar;
        this.f6256d = (k) com.applovin.exoplayer2.l.a.b(kVar);
        this.f6257e = z10;
        this.f6258f = f10;
        this.f6259g = com.applovin.exoplayer2.c.g.f();
        this.f6260h = new com.applovin.exoplayer2.c.g(0);
        this.f6261i = new com.applovin.exoplayer2.c.g(2);
        d dVar = new d();
        this.f6262j = dVar;
        this.f6263k = new af<>();
        this.f6264l = new ArrayList<>();
        this.f6265m = new MediaCodec.BufferInfo();
        this.f6276x = 1.0f;
        this.f6277y = 1.0f;
        this.f6275w = -9223372036854775807L;
        this.f6266n = new long[10];
        this.f6267o = new long[10];
        this.f6268p = new long[10];
        this.at = -9223372036854775807L;
        this.au = -9223372036854775807L;
        dVar.f(0);
        dVar.f4752b.order(ByteOrder.nativeOrder());
        this.D = -1.0f;
        this.H = 0;
        this.f6253ad = 0;
        this.U = -1;
        this.V = -1;
        this.T = -9223372036854775807L;
        this.aj = -9223372036854775807L;
        this.ak = -9223372036854775807L;
        this.f6254ae = 0;
        this.af = 0;
    }

    private void B() {
        this.f6251ab = false;
        this.f6262j.a();
        this.f6261i.a();
        this.f6250aa = false;
        this.Z = false;
    }

    private void R() {
        try {
            this.f6278z.d();
        } finally {
            M();
        }
    }

    private boolean S() {
        return this.V >= 0;
    }

    private void T() {
        this.U = -1;
        this.f6260h.f4752b = null;
    }

    private void U() {
        this.V = -1;
        this.W = null;
    }

    private boolean V() throws com.applovin.exoplayer2.p {
        g gVar = this.f6278z;
        if (gVar == null || this.f6254ae == 2 || this.al) {
            return false;
        }
        if (this.U < 0) {
            int iB = gVar.b();
            this.U = iB;
            if (iB < 0) {
                return false;
            }
            this.f6260h.f4752b = this.f6278z.a(iB);
            this.f6260h.a();
        }
        if (this.f6254ae == 1) {
            if (!this.R) {
                this.ah = true;
                this.f6278z.a(this.U, 0, 0, 0L, 4);
                T();
            }
            this.f6254ae = 2;
            return false;
        }
        if (this.P) {
            this.P = false;
            ByteBuffer byteBuffer = this.f6260h.f4752b;
            byte[] bArr = f6248b;
            byteBuffer.put(bArr);
            this.f6278z.a(this.U, 0, bArr.length, 0L, 0);
            T();
            this.ag = true;
            return true;
        }
        if (this.f6253ad == 1) {
            for (int i10 = 0; i10 < this.A.f8200n.size(); i10++) {
                this.f6260h.f4752b.put(this.A.f8200n.get(i10));
            }
            this.f6253ad = 2;
        }
        int iPosition = this.f6260h.f4752b.position();
        w wVarT = t();
        try {
            int iA = a(wVarT, this.f6260h, 0);
            if (g()) {
                this.ak = this.aj;
            }
            if (iA == -3) {
                return false;
            }
            if (iA == -5) {
                if (this.f6253ad == 2) {
                    this.f6260h.a();
                    this.f6253ad = 1;
                }
                a(wVarT);
                return true;
            }
            if (this.f6260h.c()) {
                if (this.f6253ad == 2) {
                    this.f6260h.a();
                    this.f6253ad = 1;
                }
                this.al = true;
                if (!this.ag) {
                    aa();
                    return false;
                }
                try {
                    if (!this.R) {
                        this.ah = true;
                        this.f6278z.a(this.U, 0, 0, 0L, 4);
                        T();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e10) {
                    throw a(e10, this.f6269q, com.applovin.exoplayer2.h.b(e10.getErrorCode()));
                }
            }
            if (!this.ag && !this.f6260h.d()) {
                this.f6260h.a();
                if (this.f6253ad == 2) {
                    this.f6253ad = 1;
                }
                return true;
            }
            boolean zG = this.f6260h.g();
            if (zG) {
                this.f6260h.f4751a.a(iPosition);
            }
            if (this.I && !zG) {
                com.applovin.exoplayer2.l.v.a(this.f6260h.f4752b);
                if (this.f6260h.f4752b.position() == 0) {
                    return true;
                }
                this.I = false;
            }
            com.applovin.exoplayer2.c.g gVar2 = this.f6260h;
            long jA = gVar2.f4754d;
            e eVar = this.S;
            if (eVar != null) {
                jA = eVar.a(this.f6269q, gVar2);
                this.aj = Math.max(this.aj, this.S.a(this.f6269q));
            }
            long j10 = jA;
            if (this.f6260h.b()) {
                this.f6264l.add(Long.valueOf(j10));
            }
            if (this.an) {
                this.f6263k.a(j10, this.f6269q);
                this.an = false;
            }
            this.aj = Math.max(this.aj, j10);
            this.f6260h.h();
            if (this.f6260h.e()) {
                b(this.f6260h);
            }
            a(this.f6260h);
            try {
                if (zG) {
                    this.f6278z.a(this.U, 0, this.f6260h.f4751a, j10, 0);
                } else {
                    this.f6278z.a(this.U, 0, this.f6260h.f4752b.limit(), j10, 0);
                }
                T();
                this.ag = true;
                this.f6253ad = 0;
                this.f6249a.f4742c++;
                return true;
            } catch (MediaCodec.CryptoException e11) {
                throw a(e11, this.f6269q, com.applovin.exoplayer2.h.b(e11.getErrorCode()));
            }
        } catch (com.applovin.exoplayer2.c.g.a e12) {
            a(e12);
            e(0);
            R();
            return true;
        }
    }

    private boolean W() {
        if (this.ag) {
            this.f6254ae = 1;
            if (this.J || this.L) {
                this.af = 3;
                return false;
            }
            this.af = 1;
        }
        return true;
    }

    @TargetApi(23)
    private boolean X() throws com.applovin.exoplayer2.p {
        if (this.ag) {
            this.f6254ae = 1;
            if (this.J || this.L) {
                this.af = 3;
                return false;
            }
            this.af = 2;
        } else {
            ac();
        }
        return true;
    }

    private void Y() throws com.applovin.exoplayer2.p {
        if (!this.ag) {
            ab();
        } else {
            this.f6254ae = 1;
            this.af = 3;
        }
    }

    private void Z() {
        this.ai = true;
        MediaFormat mediaFormatC = this.f6278z.c();
        if (this.H != 0 && mediaFormatC.getInteger("width") == 32 && mediaFormatC.getInteger("height") == 32) {
            this.Q = true;
            return;
        }
        if (this.O) {
            mediaFormatC.setInteger("channel-count", 1);
        }
        this.B = mediaFormatC;
        this.C = true;
    }

    private void a(MediaCrypto mediaCrypto, boolean z10) throws a {
        if (this.E == null) {
            try {
                List<i> listD = d(z10);
                ArrayDeque<i> arrayDeque = new ArrayDeque<>();
                this.E = arrayDeque;
                if (this.f6257e) {
                    arrayDeque.addAll(listD);
                } else if (!listD.isEmpty()) {
                    this.E.add(listD.get(0));
                }
                this.F = null;
            } catch (l.b e10) {
                throw new a(this.f6269q, e10, z10, -49998);
            }
        }
        if (this.E.isEmpty()) {
            throw new a(this.f6269q, (Throwable) null, z10, -49999);
        }
        while (this.f6278z == null) {
            i iVarPeekFirst = this.E.peekFirst();
            if (!a(iVarPeekFirst)) {
                return;
            }
            try {
                a(iVarPeekFirst, mediaCrypto);
            } catch (Exception e11) {
                com.applovin.exoplayer2.l.q.b("MediaCodecRenderer", "Failed to initialize decoder: " + iVarPeekFirst, e11);
                this.E.removeFirst();
                a aVar = new a(this.f6269q, e11, z10, iVarPeekFirst);
                a(aVar);
                if (this.F == null) {
                    this.F = aVar;
                } else {
                    this.F = this.F.a(aVar);
                }
                if (this.E.isEmpty()) {
                    throw this.F;
                }
            }
        }
        this.E = null;
    }

    private void a(com.applovin.exoplayer2.d.f fVar) {
        com.applovin.exoplayer2.d.f.a(this.f6272t, fVar);
        this.f6272t = fVar;
    }

    private void a(i iVar, MediaCrypto mediaCrypto) throws Exception {
        String str = iVar.f6237a;
        int i10 = ai.f7595a;
        float fA = i10 < 23 ? -1.0f : a(this.f6277y, this.f6269q, u());
        float f10 = fA > this.f6258f ? fA : -1.0f;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ah.a("createCodec:" + str);
        g.a aVarA = a(iVar, this.f6269q, mediaCrypto, f10);
        g gVarB = (!this.ap || i10 < 23) ? this.f6255c.b(aVarA) : new com.applovin.exoplayer2.f.a.C0091a(a(), this.aq, this.ar).b(aVarA);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        this.f6278z = gVarB;
        this.G = iVar;
        this.D = f10;
        this.A = this.f6269q;
        this.H = c(str);
        this.I = a(str, this.A);
        this.J = b(str);
        this.K = d(str);
        this.L = e(str);
        this.M = g(str);
        this.N = f(str);
        this.O = b(str, this.A);
        this.R = b(iVar) || F();
        if (gVarB.a()) {
            this.f6252ac = true;
            this.f6253ad = 1;
            this.P = this.H != 0;
        }
        if ("c2.android.mp3.decoder".equals(iVar.f6237a)) {
            this.S = new e();
        }
        if (d_() == 2) {
            this.T = SystemClock.elapsedRealtime() + 1000;
        }
        this.f6249a.f4740a++;
        a(str, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
    }

    private boolean a(i iVar, v vVar, com.applovin.exoplayer2.d.f fVar, com.applovin.exoplayer2.d.f fVar2) throws com.applovin.exoplayer2.p {
        com.applovin.exoplayer2.d.n nVarC;
        if (fVar == fVar2) {
            return false;
        }
        if (fVar2 == null || fVar == null || ai.f7595a < 23) {
            return true;
        }
        UUID uuid = com.applovin.exoplayer2.h.f6461e;
        if (uuid.equals(fVar.f()) || uuid.equals(fVar2.f()) || (nVarC = c(fVar2)) == null) {
            return true;
        }
        return !iVar.f6243g && (nVarC.f5159d ? false : fVar2.a(vVar.f8198l));
    }

    private static boolean a(IllegalStateException illegalStateException) {
        if (ai.f7595a >= 21 && b(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private static boolean a(String str, v vVar) {
        return ai.f7595a < 21 && vVar.f8200n.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    @TargetApi(23)
    private void aa() throws com.applovin.exoplayer2.p {
        int i10 = this.af;
        if (i10 == 1) {
            R();
            return;
        }
        if (i10 == 2) {
            R();
            ac();
        } else if (i10 == 3) {
            ab();
        } else {
            this.am = true;
            D();
        }
    }

    private void ab() throws com.applovin.exoplayer2.p {
        J();
        E();
    }

    private void ac() throws com.applovin.exoplayer2.p {
        try {
            this.f6273u.setMediaDrmSession(c(this.f6272t).f5158c);
            b(this.f6272t);
            this.f6254ae = 0;
            this.af = 0;
        } catch (MediaCryptoException e10) {
            throw a(e10, this.f6269q, 6006);
        }
    }

    private void ad() throws com.applovin.exoplayer2.p {
        com.applovin.exoplayer2.l.a.b(!this.al);
        w wVarT = t();
        this.f6261i.a();
        do {
            this.f6261i.a();
            int iA = a(wVarT, this.f6261i, 0);
            if (iA == -5) {
                a(wVarT);
                return;
            }
            if (iA != -4) {
                if (iA != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else {
                if (this.f6261i.c()) {
                    this.al = true;
                    return;
                }
                if (this.an) {
                    v vVar = (v) com.applovin.exoplayer2.l.a.b(this.f6269q);
                    this.f6270r = vVar;
                    a(vVar, (MediaFormat) null);
                    this.an = false;
                }
                this.f6261i.h();
            }
        } while (this.f6262j.a(this.f6261i));
        this.f6250aa = true;
    }

    private void b(com.applovin.exoplayer2.d.f fVar) {
        com.applovin.exoplayer2.d.f.a(this.f6271s, fVar);
        this.f6271s = fVar;
    }

    private boolean b(long j10, long j11) throws com.applovin.exoplayer2.p {
        boolean z10;
        boolean zA;
        int iA;
        if (!S()) {
            if (this.M && this.ah) {
                try {
                    iA = this.f6278z.a(this.f6265m);
                } catch (IllegalStateException unused) {
                    aa();
                    if (this.am) {
                        J();
                    }
                    return false;
                }
            } else {
                iA = this.f6278z.a(this.f6265m);
            }
            if (iA < 0) {
                if (iA == -2) {
                    Z();
                    return true;
                }
                if (this.R && (this.al || this.f6254ae == 2)) {
                    aa();
                }
                return false;
            }
            if (this.Q) {
                this.Q = false;
                this.f6278z.a(iA, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f6265m;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                aa();
                return false;
            }
            this.V = iA;
            ByteBuffer byteBufferB = this.f6278z.b(iA);
            this.W = byteBufferB;
            if (byteBufferB != null) {
                byteBufferB.position(this.f6265m.offset);
                ByteBuffer byteBuffer = this.W;
                MediaCodec.BufferInfo bufferInfo2 = this.f6265m;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.N) {
                MediaCodec.BufferInfo bufferInfo3 = this.f6265m;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                    long j12 = this.aj;
                    if (j12 != -9223372036854775807L) {
                        bufferInfo3.presentationTimeUs = j12;
                    }
                }
            }
            this.X = f(this.f6265m.presentationTimeUs);
            long j13 = this.ak;
            long j14 = this.f6265m.presentationTimeUs;
            this.Y = j13 == j14;
            c(j14);
        }
        if (this.M && this.ah) {
            try {
                g gVar = this.f6278z;
                ByteBuffer byteBuffer2 = this.W;
                int i10 = this.V;
                MediaCodec.BufferInfo bufferInfo4 = this.f6265m;
                z10 = false;
                try {
                    zA = a(j10, j11, gVar, byteBuffer2, i10, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.X, this.Y, this.f6270r);
                } catch (IllegalStateException unused2) {
                    aa();
                    if (this.am) {
                        J();
                    }
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            z10 = false;
            g gVar2 = this.f6278z;
            ByteBuffer byteBuffer3 = this.W;
            int i11 = this.V;
            MediaCodec.BufferInfo bufferInfo5 = this.f6265m;
            zA = a(j10, j11, gVar2, byteBuffer3, i11, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.X, this.Y, this.f6270r);
        }
        if (zA) {
            d(this.f6265m.presentationTimeUs);
            boolean z11 = (this.f6265m.flags & 4) != 0 ? true : z10;
            U();
            if (!z11) {
                return true;
            }
            aa();
        }
        return z10;
    }

    private static boolean b(i iVar) {
        String str = iVar.f6237a;
        int i10 = ai.f7595a;
        return (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i10 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i10 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || ("Amazon".equals(ai.f7597c) && "AFTS".equals(ai.f7598d) && iVar.f6243g));
    }

    private static boolean b(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    private static boolean b(String str) {
        int i10 = ai.f7595a;
        return i10 < 18 || (i10 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i10 == 19 && ai.f7598d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    private static boolean b(String str, v vVar) {
        return ai.f7595a <= 18 && vVar.f8211y == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    private int c(String str) {
        int i10 = ai.f7595a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = ai.f7598d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i10 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = ai.f7596b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private com.applovin.exoplayer2.d.n c(com.applovin.exoplayer2.d.f fVar) throws com.applovin.exoplayer2.p {
        com.applovin.exoplayer2.c.b bVarG = fVar.g();
        if (bVarG == null || (bVarG instanceof com.applovin.exoplayer2.d.n)) {
            return (com.applovin.exoplayer2.d.n) bVarG;
        }
        throw a(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + bVarG), this.f6269q, AdError.MEDIAVIEW_MISSING_ERROR_CODE);
    }

    private boolean c(long j10, long j11) throws com.applovin.exoplayer2.p {
        boolean z10;
        com.applovin.exoplayer2.l.a.b(!this.am);
        if (this.f6262j.l()) {
            d dVar = this.f6262j;
            if (!a(j10, j11, null, dVar.f4752b, this.V, 0, dVar.k(), this.f6262j.i(), this.f6262j.b(), this.f6262j.c(), this.f6270r)) {
                return false;
            }
            d(this.f6262j.j());
            this.f6262j.a();
            z10 = false;
        } else {
            z10 = false;
        }
        if (this.al) {
            this.am = true;
            return z10;
        }
        if (this.f6250aa) {
            com.applovin.exoplayer2.l.a.b(this.f6262j.a(this.f6261i));
            this.f6250aa = z10;
        }
        if (this.f6251ab) {
            if (this.f6262j.l()) {
                return true;
            }
            B();
            this.f6251ab = z10;
            E();
            if (!this.Z) {
                return z10;
            }
        }
        ad();
        if (this.f6262j.l()) {
            this.f6262j.h();
        }
        if (this.f6262j.l() || this.al || this.f6251ab) {
            return true;
        }
        return z10;
    }

    public static boolean c(v vVar) {
        int i10 = vVar.E;
        return i10 == 0 || i10 == 2;
    }

    private static boolean c(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    private List<i> d(boolean z10) throws l.b {
        List<i> listA = a(this.f6256d, this.f6269q, z10);
        if (listA.isEmpty() && z10) {
            listA = a(this.f6256d, this.f6269q, false);
            if (!listA.isEmpty()) {
                StringBuilder sbA = defpackage.a.a("Drm session requires secure decoder for ");
                sbA.append(this.f6269q.f8198l);
                sbA.append(", but no secure decoder available. Trying to proceed with ");
                sbA.append(listA);
                sbA.append(".");
                com.applovin.exoplayer2.l.q.c("MediaCodecRenderer", sbA.toString());
            }
        }
        return listA;
    }

    private void d(v vVar) {
        B();
        String str = vVar.f8198l;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f6262j.g(32);
        } else {
            this.f6262j.g(1);
        }
        this.Z = true;
    }

    private static boolean d(String str) {
        return ai.f7595a == 29 && "c2.android.aac.decoder".equals(str);
    }

    private boolean e(int i10) throws com.applovin.exoplayer2.p {
        w wVarT = t();
        this.f6259g.a();
        int iA = a(wVarT, this.f6259g, i10 | 4);
        if (iA == -5) {
            a(wVarT);
            return true;
        }
        if (iA != -4 || !this.f6259g.c()) {
            return false;
        }
        this.al = true;
        aa();
        return false;
    }

    private boolean e(long j10) {
        return this.f6275w == -9223372036854775807L || SystemClock.elapsedRealtime() - j10 < this.f6275w;
    }

    private boolean e(v vVar) throws com.applovin.exoplayer2.p {
        if (ai.f7595a >= 23 && this.f6278z != null && this.af != 3 && d_() != 0) {
            float fA = a(this.f6277y, vVar, u());
            float f10 = this.D;
            if (f10 == fA) {
                return true;
            }
            if (fA == -1.0f) {
                Y();
                return false;
            }
            if (f10 == -1.0f && fA <= this.f6258f) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fA);
            this.f6278z.a(bundle);
            this.D = fA;
        }
        return true;
    }

    private static boolean e(String str) {
        int i10 = ai.f7595a;
        if (i10 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i10 <= 19) {
                String str2 = ai.f7596b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    private boolean f(long j10) {
        int size = this.f6264l.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f6264l.get(i10).longValue() == j10) {
                this.f6264l.remove(i10);
                return true;
            }
        }
        return false;
    }

    private static boolean f(String str) {
        if (ai.f7595a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(ai.f7597c)) {
            String str2 = ai.f7596b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    private static boolean g(String str) {
        return ai.f7595a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    @Override // com.applovin.exoplayer2.ar
    public boolean A() {
        return this.am;
    }

    public void C() {
    }

    public void D() throws com.applovin.exoplayer2.p {
    }

    public final void E() throws com.applovin.exoplayer2.p {
        v vVar;
        if (this.f6278z != null || this.Z || (vVar = this.f6269q) == null) {
            return;
        }
        if (this.f6272t == null && b(vVar)) {
            d(this.f6269q);
            return;
        }
        b(this.f6272t);
        String str = this.f6269q.f8198l;
        com.applovin.exoplayer2.d.f fVar = this.f6271s;
        if (fVar != null) {
            if (this.f6273u == null) {
                com.applovin.exoplayer2.d.n nVarC = c(fVar);
                if (nVarC != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(nVarC.f5157b, nVarC.f5158c);
                        this.f6273u = mediaCrypto;
                        this.f6274v = !nVarC.f5159d && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e10) {
                        throw a(e10, this.f6269q, 6006);
                    }
                } else if (this.f6271s.e() == null) {
                    return;
                }
            }
            if (com.applovin.exoplayer2.d.n.f5156a) {
                int iC = this.f6271s.c();
                if (iC == 1) {
                    com.applovin.exoplayer2.d.f.a aVar = (com.applovin.exoplayer2.d.f.a) com.applovin.exoplayer2.l.a.b(this.f6271s.e());
                    throw a(aVar, this.f6269q, aVar.f5141a);
                }
                if (iC != 4) {
                    return;
                }
            }
        }
        try {
            a(this.f6273u, this.f6274v);
        } catch (a e11) {
            throw a(e11, this.f6269q, 4001);
        }
    }

    public boolean F() {
        return false;
    }

    public final g G() {
        return this.f6278z;
    }

    public final MediaFormat H() {
        return this.B;
    }

    public final i I() {
        return this.G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void J() {
        try {
            g gVar = this.f6278z;
            if (gVar != null) {
                gVar.e();
                this.f6249a.f4741b++;
                a(this.G.f6237a);
            }
            this.f6278z = null;
            try {
                MediaCrypto mediaCrypto = this.f6273u;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f6273u = null;
                b((com.applovin.exoplayer2.d.f) null);
                N();
            }
        } catch (Throwable th) {
            this.f6278z = null;
            try {
                MediaCrypto mediaCrypto2 = this.f6273u;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.f6273u = null;
                b((com.applovin.exoplayer2.d.f) null);
                N();
            }
        }
    }

    public final boolean K() throws com.applovin.exoplayer2.p {
        boolean zL = L();
        if (zL) {
            E();
        }
        return zL;
    }

    public boolean L() {
        if (this.f6278z == null) {
            return false;
        }
        if (this.af == 3 || this.J || ((this.K && !this.ai) || (this.L && this.ah))) {
            J();
            return true;
        }
        R();
        return false;
    }

    public void M() {
        T();
        U();
        this.T = -9223372036854775807L;
        this.ah = false;
        this.ag = false;
        this.P = false;
        this.Q = false;
        this.X = false;
        this.Y = false;
        this.f6264l.clear();
        this.aj = -9223372036854775807L;
        this.ak = -9223372036854775807L;
        e eVar = this.S;
        if (eVar != null) {
            eVar.a();
        }
        this.f6254ae = 0;
        this.af = 0;
        this.f6253ad = this.f6252ac ? 1 : 0;
    }

    public void N() {
        M();
        this.as = null;
        this.S = null;
        this.E = null;
        this.G = null;
        this.A = null;
        this.B = null;
        this.C = false;
        this.ai = false;
        this.D = -1.0f;
        this.H = 0;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.R = false;
        this.f6252ac = false;
        this.f6253ad = 0;
        this.f6274v = false;
    }

    public float O() {
        return this.f6276x;
    }

    public final void P() {
        this.ao = true;
    }

    public final long Q() {
        return this.au;
    }

    public float a(float f10, v vVar, v[] vVarArr) {
        return -1.0f;
    }

    public abstract int a(k kVar, v vVar) throws l.b;

    @Override // com.applovin.exoplayer2.as
    public final int a(v vVar) throws com.applovin.exoplayer2.p {
        try {
            return a(this.f6256d, vVar);
        } catch (l.b e10) {
            throw a(e10, vVar, 4002);
        }
    }

    public com.applovin.exoplayer2.c.h a(i iVar, v vVar, v vVar2) {
        return new com.applovin.exoplayer2.c.h(iVar.f6237a, vVar, vVar2, 0, 1);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ce  */
    public com.applovin.exoplayer2.c.h a(w wVar) throws com.applovin.exoplayer2.p {
        int i10;
        boolean z10 = true;
        this.an = true;
        v vVar = (v) com.applovin.exoplayer2.l.a.b(wVar.f8240b);
        if (vVar.f8198l == null) {
            throw a(new IllegalArgumentException(), vVar, 4005);
        }
        a(wVar.f8239a);
        this.f6269q = vVar;
        if (this.Z) {
            this.f6251ab = true;
            return null;
        }
        g gVar = this.f6278z;
        if (gVar == null) {
            this.E = null;
            E();
            return null;
        }
        i iVar = this.G;
        v vVar2 = this.A;
        if (a(iVar, vVar, this.f6271s, this.f6272t)) {
            Y();
            return new com.applovin.exoplayer2.c.h(iVar.f6237a, vVar2, vVar, 0, 128);
        }
        boolean z11 = this.f6272t != this.f6271s;
        com.applovin.exoplayer2.l.a.b(!z11 || ai.f7595a >= 23);
        com.applovin.exoplayer2.c.h hVarA = a(iVar, vVar2, vVar);
        int i11 = hVarA.f4763d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (e(vVar)) {
                        this.A = vVar;
                        if (z11 && !X()) {
                            i10 = 2;
                        }
                    } else {
                        i10 = 16;
                    }
                } else if (e(vVar)) {
                    this.f6252ac = true;
                    this.f6253ad = 1;
                    int i12 = this.H;
                    if (i12 != 2 && (i12 != 1 || vVar.f8203q != vVar2.f8203q || vVar.f8204r != vVar2.f8204r)) {
                        z10 = false;
                    }
                    this.P = z10;
                    this.A = vVar;
                    if (z11 && !X()) {
                        i10 = 2;
                    }
                } else {
                    i10 = 16;
                }
            } else if (e(vVar)) {
                this.A = vVar;
                if (!z11 ? !W() : !X()) {
                    i10 = 2;
                }
            } else {
                i10 = 16;
            }
            return (hVarA.f4763d != 0 || (this.f6278z == gVar && this.af != 3)) ? hVarA : new com.applovin.exoplayer2.c.h(iVar.f6237a, vVar2, vVar, 0, i10);
        }
        Y();
        i10 = 0;
        if (hVarA.f4763d != 0) {
        }
    }

    public abstract g.a a(i iVar, v vVar, MediaCrypto mediaCrypto, float f10);

    public h a(Throwable th, i iVar) {
        return new h(th, iVar);
    }

    public abstract List<i> a(k kVar, v vVar, boolean z10) throws l.b;

    @Override // com.applovin.exoplayer2.ar
    public void a(float f10, float f11) throws com.applovin.exoplayer2.p {
        this.f6276x = f10;
        this.f6277y = f11;
        e(this.A);
    }

    @Override // com.applovin.exoplayer2.ar
    public void a(long j10, long j11) throws com.applovin.exoplayer2.p {
        boolean z10 = false;
        if (this.ao) {
            this.ao = false;
            aa();
        }
        com.applovin.exoplayer2.p pVar = this.as;
        if (pVar != null) {
            this.as = null;
            throw pVar;
        }
        try {
            if (this.am) {
                D();
                return;
            }
            if (this.f6269q != null || e(2)) {
                E();
                if (!this.Z) {
                    if (this.f6278z != null) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        ah.a("drainAndFeed");
                        while (b(j10, j11) && e(jElapsedRealtime)) {
                        }
                        while (V() && e(jElapsedRealtime)) {
                        }
                    } else {
                        this.f6249a.f4743d += b(j10);
                        e(1);
                    }
                    this.f6249a.a();
                }
                ah.a("bypassRender");
                while (c(j10, j11)) {
                }
                ah.a();
                this.f6249a.a();
            }
        } catch (IllegalStateException e10) {
            if (!a(e10)) {
                throw e10;
            }
            a((Exception) e10);
            if (ai.f7595a >= 21 && c(e10)) {
                z10 = true;
            }
            if (z10) {
                J();
            }
            throw a(a(e10, I()), this.f6269q, z10, 4003);
        }
    }

    @Override // com.applovin.exoplayer2.e
    public void a(long j10, boolean z10) throws com.applovin.exoplayer2.p {
        this.al = false;
        this.am = false;
        this.ao = false;
        if (this.Z) {
            this.f6262j.a();
            this.f6261i.a();
            this.f6250aa = false;
        } else {
            K();
        }
        if (this.f6263k.b() > 0) {
            this.an = true;
        }
        this.f6263k.a();
        int i10 = this.av;
        if (i10 != 0) {
            this.au = this.f6267o[i10 - 1];
            this.at = this.f6266n[i10 - 1];
            this.av = 0;
        }
    }

    public void a(com.applovin.exoplayer2.c.g gVar) throws com.applovin.exoplayer2.p {
    }

    public final void a(com.applovin.exoplayer2.p pVar) {
        this.as = pVar;
    }

    public void a(v vVar, MediaFormat mediaFormat) throws com.applovin.exoplayer2.p {
    }

    public void a(Exception exc) {
    }

    public void a(String str) {
    }

    public void a(String str, long j10, long j11) {
    }

    public void a(boolean z10) {
        this.ap = z10;
    }

    @Override // com.applovin.exoplayer2.e
    public void a(boolean z10, boolean z11) throws com.applovin.exoplayer2.p {
        this.f6249a = new com.applovin.exoplayer2.c.e();
    }

    @Override // com.applovin.exoplayer2.e
    public void a(v[] vVarArr, long j10, long j11) throws com.applovin.exoplayer2.p {
        if (this.au == -9223372036854775807L) {
            com.applovin.exoplayer2.l.a.b(this.at == -9223372036854775807L);
            this.at = j10;
            this.au = j11;
            return;
        }
        int i10 = this.av;
        if (i10 == this.f6267o.length) {
            StringBuilder sbA = defpackage.a.a("Too many stream changes, so dropping offset: ");
            sbA.append(this.f6267o[this.av - 1]);
            com.applovin.exoplayer2.l.q.c("MediaCodecRenderer", sbA.toString());
        } else {
            this.av = i10 + 1;
        }
        long[] jArr = this.f6266n;
        int i11 = this.av;
        jArr[i11 - 1] = j10;
        this.f6267o[i11 - 1] = j11;
        this.f6268p[i11 - 1] = this.aj;
    }

    public abstract boolean a(long j10, long j11, g gVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, v vVar) throws com.applovin.exoplayer2.p;

    public boolean a(i iVar) {
        return true;
    }

    public void b(com.applovin.exoplayer2.c.g gVar) throws com.applovin.exoplayer2.p {
    }

    public void b(boolean z10) {
        this.aq = z10;
    }

    public boolean b(v vVar) {
        return false;
    }

    public final void c(long j10) throws com.applovin.exoplayer2.p {
        boolean z10;
        v vVarA = this.f6263k.a(j10);
        if (vVarA == null && this.C) {
            vVarA = this.f6263k.c();
        }
        if (vVarA != null) {
            this.f6270r = vVarA;
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || (this.C && this.f6270r != null)) {
            a(this.f6270r, this.B);
            this.C = false;
        }
    }

    public void c(boolean z10) {
        this.ar = z10;
    }

    public void d(long j10) {
        while (true) {
            int i10 = this.av;
            if (i10 == 0 || j10 < this.f6268p[0]) {
                return;
            }
            long[] jArr = this.f6266n;
            this.at = jArr[0];
            this.au = this.f6267o[0];
            int i11 = i10 - 1;
            this.av = i11;
            System.arraycopy(jArr, 1, jArr, 0, i11);
            long[] jArr2 = this.f6267o;
            System.arraycopy(jArr2, 1, jArr2, 0, this.av);
            long[] jArr3 = this.f6268p;
            System.arraycopy(jArr3, 1, jArr3, 0, this.av);
            C();
        }
    }

    @Override // com.applovin.exoplayer2.e, com.applovin.exoplayer2.as
    public final int o() {
        return 8;
    }

    @Override // com.applovin.exoplayer2.e
    public void p() {
    }

    @Override // com.applovin.exoplayer2.e
    public void q() {
    }

    @Override // com.applovin.exoplayer2.e
    public void r() {
        this.f6269q = null;
        this.at = -9223372036854775807L;
        this.au = -9223372036854775807L;
        this.av = 0;
        L();
    }

    @Override // com.applovin.exoplayer2.e
    public void s() {
        try {
            B();
            J();
        } finally {
            a((com.applovin.exoplayer2.d.f) null);
        }
    }

    @Override // com.applovin.exoplayer2.ar
    public boolean z() {
        return this.f6269q != null && (x() || S() || (this.T != -9223372036854775807L && SystemClock.elapsedRealtime() < this.T));
    }
}
