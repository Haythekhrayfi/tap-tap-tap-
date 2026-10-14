package com.yandex.mobile.ads.impl;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdError;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kb0 extends me {
    private static final lb0 F0 = ot0.f();
    private static final byte[] G0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    private final long[] A;
    private ns A0;
    private yv B;
    public ym B0;
    private yv C;
    private long C0;
    private com.yandex.mobile.ads.exo.drm.e D;
    private long D0;
    private com.yandex.mobile.ads.exo.drm.e E;
    private int E0;
    private MediaCrypto F;
    private boolean G;
    private long H;
    private float I;
    private float J;
    private eb0 K;
    private yv L;
    private MediaFormat M;
    private boolean N;
    private float O;
    private ArrayDeque<ib0> P;
    private b Q;
    private ib0 R;
    private int S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f22325a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f22326b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f22327c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private bg f22328d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private long f22329e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f22330f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private int f22331g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private ByteBuffer f22332h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f22333i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f22334j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private boolean f22335k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f22336l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f22337m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final eb0.b f22338n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f22339n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final mb0 f22340o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f22341o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f22342p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f22343p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final float f22344q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private int f22345q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final an f22346r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private boolean f22347r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final an f22348s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private boolean f22349s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final an f22350t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private boolean f22351t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final se f22352u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private long f22353u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final u61<yv> f22354v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private long f22355v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ArrayList<Long> f22356w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f22357w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final MediaCodec.BufferInfo f22358x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private boolean f22359x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final long[] f22360y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private boolean f22361y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final long[] f22362z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private boolean f22363z0;

    public static final class a {
        public static void a(eb0.a aVar, gr0 gr0Var) {
            LogSessionId logSessionIdA = gr0Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            aVar.f20139b.setString("log-session-id", logSessionIdA.getStringId());
        }
    }

    public static class b extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f22365b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ib0 f22366c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f22367d;

        public b(int i10, yv yvVar, nb0.b bVar, boolean z10) {
            this("Decoder init failed: [" + i10 + "], " + yvVar, bVar, yvVar.f27115l, z10, null, a(i10));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public b(yv yvVar, Exception exc, boolean z10, ib0 ib0Var) {
            StringBuilder sbA = v60.a("Decoder init failed: ");
            sbA.append(ib0Var.f21667a);
            sbA.append(", ");
            sbA.append(yvVar);
            this(sbA.toString(), exc, yvVar.f27115l, z10, ib0Var, da1.f19803a >= 21 ? a(exc) : null);
        }

        private b(String str, Throwable th, String str2, boolean z10, ib0 ib0Var, String str3) {
            super(str, th);
            this.f22364a = str2;
            this.f22365b = z10;
            this.f22366c = ib0Var;
            this.f22367d = str3;
        }

        public static b a(b bVar) {
            return new b(bVar.getMessage(), bVar.getCause(), bVar.f22364a, bVar.f22365b, bVar.f22366c, bVar.f22367d);
        }

        private static String a(int i10) {
            StringBuilder sbA = android.support.v4.media.c.a("com.yandex.mobile.ads.exoplayer2.mediacodec.MediaCodecRenderer_", i10 < 0 ? "neg_" : "");
            sbA.append(Math.abs(i10));
            return sbA.toString();
        }

        private static String a(Exception exc) {
            if (exc instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) exc).getDiagnosticInfo();
            }
            return null;
        }
    }

    public kb0(int i10, go goVar, mb0 mb0Var, float f10) {
        super(i10);
        this.f22338n = goVar;
        this.f22340o = (mb0) pa.a(mb0Var);
        this.f22342p = false;
        this.f22344q = f10;
        this.f22346r = an.j();
        this.f22348s = new an(0);
        this.f22350t = new an(2);
        se seVar = new se();
        this.f22352u = seVar;
        this.f22354v = new u61<>();
        this.f22356w = new ArrayList<>();
        this.f22358x = new MediaCodec.BufferInfo();
        this.I = 1.0f;
        this.J = 1.0f;
        this.H = -9223372036854775807L;
        this.f22360y = new long[10];
        this.f22362z = new long[10];
        this.A = new long[10];
        this.C0 = -9223372036854775807L;
        this.D0 = -9223372036854775807L;
        seVar.e(0);
        seVar.f19004c.order(ByteOrder.nativeOrder());
        this.O = -1.0f;
        this.S = 0;
        this.f22341o0 = 0;
        this.f22330f0 = -1;
        this.f22331g0 = -1;
        this.f22329e0 = -9223372036854775807L;
        this.f22353u0 = -9223372036854775807L;
        this.f22355v0 = -9223372036854775807L;
        this.f22343p0 = 0;
        this.f22345q0 = 0;
    }

    @TargetApi(23)
    private void K() throws ns {
        int i10 = this.f22345q0;
        if (i10 == 1) {
            try {
                this.K.flush();
            } finally {
                N();
            }
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    this.f22359x0 = true;
                    M();
                    return;
                } else {
                    L();
                    I();
                    return;
                }
            }
            try {
                this.K.flush();
                N();
                Q();
            } catch (Throwable th) {
                N();
                throw th;
            }
        }
    }

    private void Q() throws ns {
        try {
            this.F.setMediaDrmSession(a(this.E).f20345b);
            b(this.E);
            this.f22343p0 = 0;
            this.f22345q0 = 0;
        } catch (MediaCryptoException e10) {
            throw a(e10, this.B, 6006);
        }
    }

    private ew a(com.yandex.mobile.ads.exo.drm.e eVar) throws ns {
        yl ylVarH = eVar.h();
        if (ylVarH == null || (ylVarH instanceof ew)) {
            return (ew) ylVarH;
        }
        throw a(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + ylVarH), this.B, AdError.MEDIAVIEW_MISSING_ERROR_CODE);
    }

    private List<ib0> a(boolean z10) throws nb0.b {
        ArrayList arrayListA = a(this.f22340o, this.B, z10);
        if (arrayListA.isEmpty() && z10) {
            arrayListA = a(this.f22340o, this.B, false);
            if (!arrayListA.isEmpty()) {
                StringBuilder sbA = v60.a("Drm session requires secure decoder for ");
                sbA.append(this.B.f27115l);
                sbA.append(", but no secure decoder available. Trying to proceed with ");
                sbA.append(arrayListA);
                sbA.append(".");
                p90.d("MediaCodecRenderer", sbA.toString());
            }
        }
        return arrayListA;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0049 A[SYNTHETIC] */
    private void a(MediaCrypto mediaCrypto, boolean z10) throws b {
        b bVar;
        b bVar2;
        if (this.P == null) {
            try {
                List<ib0> listA = a(z10);
                ArrayDeque<ib0> arrayDeque = new ArrayDeque<>();
                this.P = arrayDeque;
                if (this.f22342p) {
                    arrayDeque.addAll(listA);
                } else if (!listA.isEmpty()) {
                    this.P.add(listA.get(0));
                }
                this.Q = null;
            } catch (nb0.b e10) {
                throw new b(-49998, this.B, e10, z10);
            }
        }
        if (this.P.isEmpty()) {
            throw new b(-49999, this.B, (nb0.b) null, z10);
        }
        ib0 ib0VarPeekFirst = this.P.peekFirst();
        while (this.K == null) {
            ib0 ib0VarPeekFirst2 = this.P.peekFirst();
            if (!a(ib0VarPeekFirst2)) {
                return;
            }
            try {
                a(ib0VarPeekFirst2, mediaCrypto);
            } catch (Exception e11) {
                if (ib0VarPeekFirst2 != ib0VarPeekFirst) {
                    throw e11;
                }
                try {
                    p90.d("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                    Thread.sleep(50L);
                    a(ib0VarPeekFirst2, mediaCrypto);
                } catch (Exception e12) {
                    p90.b("MediaCodecRenderer", "Failed to initialize decoder: " + ib0VarPeekFirst2, e12);
                    this.P.removeFirst();
                    bVar = new b(this.B, e12, z10, ib0VarPeekFirst2);
                    a(bVar);
                    bVar2 = this.Q;
                    if (bVar2 == null) {
                        this.Q = bVar;
                    } else {
                        this.Q = b.a(bVar2);
                    }
                    if (!this.P.isEmpty()) {
                        throw this.Q;
                    }
                }
                p90.b("MediaCodecRenderer", "Failed to initialize decoder: " + ib0VarPeekFirst2, e12);
                this.P.removeFirst();
                bVar = new b(this.B, e12, z10, ib0VarPeekFirst2);
                a(bVar);
                bVar2 = this.Q;
                if (bVar2 == null) {
                    this.Q = bVar;
                } else {
                    this.Q = b.a(bVar2);
                }
                if (!this.P.isEmpty()) {
                    throw this.Q;
                }
            }
        }
        this.P = null;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0214  */
    /* JADX WARN: Code duplicated, block: B:136:0x0268  */
    /* JADX WARN: Code duplicated, block: B:142:0x0286  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:58:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0129  */
    /* JADX WARN: Code duplicated, block: B:67:0x014e  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a2  */
    private void a(ib0 ib0Var, MediaCrypto mediaCrypto) throws Exception {
        int i10;
        lb0 lb0Var;
        String strF;
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        lb0 lb0Var2;
        boolean z13;
        String str2;
        lb0 lb0Var3;
        String str3 = ib0Var.f21667a;
        int i11 = da1.f19803a;
        float fA = i11 < 23 ? -1.0f : a(this.J, s());
        float f10 = fA > this.f22344q ? fA : -1.0f;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        eb0.a aVarA = a(ib0Var, this.B, mediaCrypto, f10);
        if (i11 >= 31) {
            a.a(aVarA, r());
        }
        try {
            d71.a("createCodec:" + str3);
            this.K = this.f22338n.a(aVarA);
            d71.a();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.R = ib0Var;
            this.O = f10;
            this.L = this.B;
            if (i11 <= 25) {
                lb0 lb0Var4 = F0;
                if (lb0Var4.p().equals(str3)) {
                    String str4 = da1.f19806d;
                    if (str4.startsWith(lb0Var4.J()) || str4.startsWith(lb0Var4.F()) || str4.startsWith(lb0Var4.G()) || str4.startsWith(lb0Var4.I())) {
                        i10 = 2;
                    } else if (i11 < 24) {
                        lb0Var = F0;
                        if (!lb0Var.s().equals(str3) || lb0Var.t().equals(str3)) {
                            strF = lb0Var.f();
                            str = da1.f19804b;
                            if (!strF.equals(str) || lb0Var.g().equals(str) || lb0Var.k().equals(str) || lb0Var.M().equals(str)) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                        } else {
                            i10 = 0;
                        }
                    } else {
                        i10 = 0;
                    }
                } else if (i11 < 24) {
                    lb0Var = F0;
                    if (lb0Var.s().equals(str3)) {
                        strF = lb0Var.f();
                        str = da1.f19804b;
                        if (strF.equals(str)) {
                        }
                        i10 = 1;
                    } else {
                        strF = lb0Var.f();
                        str = da1.f19804b;
                        if (strF.equals(str)) {
                        }
                        i10 = 1;
                    }
                } else {
                    i10 = 0;
                }
            } else if (i11 < 24) {
                lb0Var = F0;
                if (lb0Var.s().equals(str3)) {
                    strF = lb0Var.f();
                    str = da1.f19804b;
                    if (strF.equals(str)) {
                    }
                    i10 = 1;
                } else {
                    strF = lb0Var.f();
                    str = da1.f19804b;
                    if (strF.equals(str)) {
                    }
                    i10 = 1;
                }
            } else {
                i10 = 0;
            }
            this.S = i10;
            this.T = i11 < 21 && this.L.f27117n.isEmpty() && F0.r().equals(str3);
            if (i11 < 18) {
                z10 = true;
            } else if (i11 == 18) {
                lb0 lb0Var5 = F0;
                if (lb0Var5.u().equals(str3) || lb0Var5.v().equals(str3)) {
                    z10 = true;
                } else {
                    if (i11 == 19) {
                        str2 = da1.f19806d;
                        lb0Var3 = F0;
                        if (!str2.startsWith(lb0Var3.H()) && (lb0Var3.o().equals(str3) || lb0Var3.p().equals(str3))) {
                            z10 = true;
                        }
                    }
                    z10 = false;
                }
            } else {
                if (i11 == 19) {
                    str2 = da1.f19806d;
                    lb0Var3 = F0;
                    if (!str2.startsWith(lb0Var3.H())) {
                    }
                }
                z10 = false;
            }
            this.U = z10;
            this.V = i11 == 29 && F0.d().equals(str3);
            if (i11 > 23 || !F0.D().equals(str3)) {
                if (i11 <= 19) {
                    lb0 lb0Var6 = F0;
                    String strL = lb0Var6.l();
                    String str5 = da1.f19804b;
                    z11 = (strL.equals(str5) || lb0Var6.L().equals(str5)) && (lb0Var6.y().equals(str3) || lb0Var6.z().equals(str3));
                }
            }
            this.W = z11;
            this.X = i11 == 21 && F0.C().equals(str3);
            if (i11 < 21) {
                lb0 lb0Var7 = F0;
                if (lb0Var7.w().equals(str3) && lb0Var7.K().equals(da1.f19805c)) {
                    String str6 = da1.f19804b;
                    if (str6.startsWith(lb0Var7.c()) || str6.startsWith(lb0Var7.j()) || str6.startsWith(lb0Var7.h()) || str6.startsWith(lb0Var7.i()) || str6.startsWith(lb0Var7.m()) || str6.startsWith(lb0Var7.n())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                } else {
                    z12 = false;
                }
            } else {
                z12 = false;
            }
            this.Y = z12;
            this.Z = i11 <= 18 && this.L.f27128y == 1 && F0.q().equals(str3);
            String str7 = ib0Var.f21667a;
            if ((i11 <= 25 && F0.E().equals(str7)) || (i11 <= 17 && F0.x().equals(str7))) {
                z13 = true;
            } else if (i11 <= 29) {
                lb0 lb0Var8 = F0;
                if (lb0Var8.A().equals(str7) || lb0Var8.B().equals(str7)) {
                    z13 = true;
                } else {
                    lb0Var2 = F0;
                    if (!lb0Var2.b().equals(da1.f19805c) && lb0Var2.a().equals(da1.f19806d) && ib0Var.f21672f) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                }
            } else {
                lb0Var2 = F0;
                if (!lb0Var2.b().equals(da1.f19805c)) {
                }
                z13 = false;
            }
            this.f22327c0 = z13 || E();
            this.K.a();
            if (F0.e().equals(ib0Var.f21667a)) {
                this.f22328d0 = new bg();
            }
            if (c() == 2) {
                this.f22329e0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.B0.f26878a++;
            a(str3, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th) {
            d71.a();
            throw th;
        }
    }

    private void b(com.yandex.mobile.ads.exo.drm.e eVar) {
        com.yandex.mobile.ads.exo.drm.e eVar2 = this.D;
        if (eVar2 != eVar) {
            if (eVar != null) {
                eVar.b(null);
            }
            if (eVar2 != null) {
                eVar2.a((com.yandex.mobile.ads.exo.drm.f.a) null);
            }
        }
        this.D = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    private boolean b(long j10, long j11) throws ns {
        boolean z10;
        pa.b(!this.f22359x0);
        if (this.f22352u.m()) {
            se seVar = this.f22352u;
            ByteBuffer byteBuffer = seVar.f19004c;
            int i10 = this.f22331g0;
            int iL = seVar.l();
            se seVar2 = this.f22352u;
            if (!a(j10, j11, null, byteBuffer, i10, 0, iL, seVar2.f19006e, seVar2.e(), this.f22352u.f(), this.C)) {
                return false;
            }
            c(this.f22352u.k());
            this.f22352u.b();
            z10 = 0;
        } else {
            z10 = 0;
        }
        if (this.f22357w0) {
            this.f22359x0 = true;
            return z10;
        }
        if (this.f22336l0) {
            pa.b(this.f22352u.a(this.f22350t));
            this.f22336l0 = z10;
        }
        if (this.f22337m0) {
            if (this.f22352u.m()) {
                return true;
            }
            this.f22337m0 = z10;
            this.f22352u.b();
            this.f22350t.b();
            this.f22336l0 = z10;
            this.f22335k0 = z10;
            this.f22337m0 = z10;
            I();
            if (!this.f22335k0) {
                return z10;
            }
        }
        pa.b(!this.f22357w0);
        zv zvVarQ = q();
        this.f22350t.b();
        while (true) {
            this.f22350t.b();
            int iA = a(zvVarQ, this.f22350t, (int) z10);
            if (iA == -5) {
                a(zvVarQ);
                break;
            }
            if (iA != -4) {
                if (iA == -3) {
                    break;
                }
                throw new IllegalStateException();
            }
            if (this.f22350t.f()) {
                this.f22357w0 = true;
                break;
            }
            if (this.f22361y0) {
                yv yvVar = this.B;
                Objects.requireNonNull(yvVar);
                this.C = yvVar;
                a(yvVar, (MediaFormat) null);
                this.f22361y0 = z10;
            }
            this.f22350t.h();
            if (!this.f22352u.a(this.f22350t)) {
                this.f22336l0 = true;
                break;
            }
        }
        if (this.f22352u.m()) {
            this.f22352u.h();
        }
        if (this.f22352u.m() || this.f22357w0 || this.f22337m0) {
            return true;
        }
        return z10;
    }

    private boolean c(long j10, long j11) throws ns {
        boolean z10;
        boolean zA;
        int iA;
        boolean z11;
        if (!(this.f22331g0 >= 0)) {
            if (this.X && this.f22349s0) {
                try {
                    iA = this.K.a(this.f22358x);
                } catch (IllegalStateException unused) {
                    K();
                    if (this.f22359x0) {
                        L();
                    }
                    return false;
                }
            } else {
                iA = this.K.a(this.f22358x);
            }
            if (iA < 0) {
                if (iA != -2) {
                    if (this.f22327c0 && (this.f22357w0 || this.f22343p0 == 2)) {
                        K();
                    }
                    return false;
                }
                this.f22351t0 = true;
                MediaFormat mediaFormatB = this.K.b();
                if (this.S != 0 && mediaFormatB.getInteger("width") == 32 && mediaFormatB.getInteger("height") == 32) {
                    this.f22326b0 = true;
                } else {
                    if (this.Z) {
                        mediaFormatB.setInteger("channel-count", 1);
                    }
                    this.M = mediaFormatB;
                    this.N = true;
                }
                return true;
            }
            if (this.f22326b0) {
                this.f22326b0 = false;
                this.K.a(false, iA);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f22358x;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                K();
                return false;
            }
            this.f22331g0 = iA;
            ByteBuffer byteBufferC = this.K.c(iA);
            this.f22332h0 = byteBufferC;
            if (byteBufferC != null) {
                byteBufferC.position(this.f22358x.offset);
                ByteBuffer byteBuffer = this.f22332h0;
                MediaCodec.BufferInfo bufferInfo2 = this.f22358x;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.Y) {
                MediaCodec.BufferInfo bufferInfo3 = this.f22358x;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                    long j12 = this.f22353u0;
                    if (j12 != -9223372036854775807L) {
                        bufferInfo3.presentationTimeUs = j12;
                    }
                }
            }
            long j13 = this.f22358x.presentationTimeUs;
            int size = this.f22356w.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z11 = false;
                    break;
                }
                if (this.f22356w.get(i10).longValue() == j13) {
                    this.f22356w.remove(i10);
                    z11 = true;
                    break;
                }
                i10++;
            }
            this.f22333i0 = z11;
            long j14 = this.f22355v0;
            long j15 = this.f22358x.presentationTimeUs;
            this.f22334j0 = j14 == j15;
            d(j15);
        }
        if (this.X && this.f22349s0) {
            try {
                eb0 eb0Var = this.K;
                ByteBuffer byteBuffer2 = this.f22332h0;
                int i11 = this.f22331g0;
                MediaCodec.BufferInfo bufferInfo4 = this.f22358x;
                z10 = false;
                try {
                    zA = a(j10, j11, eb0Var, byteBuffer2, i11, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f22333i0, this.f22334j0, this.C);
                } catch (IllegalStateException unused2) {
                    K();
                    if (this.f22359x0) {
                        L();
                    }
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            z10 = false;
            eb0 eb0Var2 = this.K;
            ByteBuffer byteBuffer3 = this.f22332h0;
            int i12 = this.f22331g0;
            MediaCodec.BufferInfo bufferInfo5 = this.f22358x;
            zA = a(j10, j11, eb0Var2, byteBuffer3, i12, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f22333i0, this.f22334j0, this.C);
        }
        if (zA) {
            c(this.f22358x.presentationTimeUs);
            boolean z12 = (this.f22358x.flags & 4) != 0 ? true : z10;
            this.f22331g0 = -1;
            this.f22332h0 = null;
            if (!z12) {
                return r14;
            }
            K();
        }
        return z10;
    }

    private boolean c(yv yvVar) throws ns {
        if (da1.f19803a >= 23 && this.K != null && this.f22345q0 != 3 && c() != 0) {
            float fA = a(this.J, s());
            float f10 = this.O;
            if (f10 == fA) {
                return true;
            }
            if (fA == -1.0f) {
                if (this.f22347r0) {
                    this.f22343p0 = 1;
                    this.f22345q0 = 3;
                    return false;
                }
                L();
                I();
                return false;
            }
            if (f10 == -1.0f && fA <= this.f22344q) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fA);
            this.K.a(bundle);
            this.O = fA;
        }
        return true;
    }

    private boolean d(int i10) throws ns {
        zv zvVarQ = q();
        this.f22346r.b();
        int iA = a(zvVarQ, this.f22346r, i10 | 4);
        if (iA == -5) {
            a(zvVarQ);
            return true;
        }
        if (iA != -4 || !this.f22346r.f()) {
            return false;
        }
        this.f22357w0 = true;
        K();
        return false;
    }

    @TargetApi(23)
    private boolean y() throws ns {
        if (this.f22347r0) {
            this.f22343p0 = 1;
            if (this.U || this.W) {
                this.f22345q0 = 3;
                return false;
            }
            this.f22345q0 = 2;
        } else {
            Q();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x026e  */
    /* JADX WARN: Code duplicated, block: B:145:0x0271  */
    /* JADX WARN: Code duplicated, block: B:146:0x0274  */
    /* JADX WARN: Code duplicated, block: B:74:0x012b  */
    /* JADX WARN: Code duplicated, block: B:75:0x012e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0131  */
    private boolean z() throws ns {
        int i10;
        int i11;
        eb0 eb0Var = this.K;
        if (eb0Var == null || this.f22343p0 == 2 || this.f22357w0) {
            return false;
        }
        if (this.f22330f0 < 0) {
            int iC = eb0Var.c();
            this.f22330f0 = iC;
            if (iC < 0) {
                return false;
            }
            this.f22348s.f19004c = this.K.b(iC);
            this.f22348s.b();
        }
        if (this.f22343p0 == 1) {
            if (!this.f22327c0) {
                this.f22349s0 = true;
                this.K.a(this.f22330f0, 0, 0L, 4);
                this.f22330f0 = -1;
                this.f22348s.f19004c = null;
            }
            this.f22343p0 = 2;
            return false;
        }
        if (this.f22325a0) {
            this.f22325a0 = false;
            ByteBuffer byteBuffer = this.f22348s.f19004c;
            byte[] bArr = G0;
            byteBuffer.put(bArr);
            this.K.a(this.f22330f0, bArr.length, 0L, 0);
            this.f22330f0 = -1;
            this.f22348s.f19004c = null;
            this.f22347r0 = true;
            return true;
        }
        if (this.f22341o0 == 1) {
            for (int i12 = 0; i12 < this.L.f27117n.size(); i12++) {
                this.f22348s.f19004c.put(this.L.f27117n.get(i12));
            }
            this.f22341o0 = 2;
        }
        int iPosition = this.f22348s.f19004c.position();
        zv zvVarQ = q();
        try {
            int iA = a(zvVarQ, this.f22348s, 0);
            if (e()) {
                this.f22355v0 = this.f22353u0;
            }
            if (iA == -3) {
                return false;
            }
            if (iA == -5) {
                if (this.f22341o0 == 2) {
                    this.f22348s.b();
                    this.f22341o0 = 1;
                }
                a(zvVarQ);
                return true;
            }
            if (this.f22348s.f()) {
                if (this.f22341o0 == 2) {
                    this.f22348s.b();
                    this.f22341o0 = 1;
                }
                this.f22357w0 = true;
                if (!this.f22347r0) {
                    K();
                    return false;
                }
                try {
                    if (!this.f22327c0) {
                        this.f22349s0 = true;
                        this.K.a(this.f22330f0, 0, 0L, 4);
                        this.f22330f0 = -1;
                        this.f22348s.f19004c = null;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e10) {
                    yv yvVar = this.B;
                    int errorCode = e10.getErrorCode();
                    int i13 = da1.f19803a;
                    if (errorCode == 2 || errorCode == 4) {
                        i11 = 6005;
                    } else if (errorCode == 10) {
                        i11 = 6004;
                    } else if (errorCode == 7) {
                        i11 = 6005;
                    } else if (errorCode != 8) {
                        switch (errorCode) {
                            case 15:
                                i11 = AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
                                break;
                            case 16:
                            case 18:
                                i11 = 6005;
                                break;
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                i11 = 6004;
                                break;
                            default:
                                switch (errorCode) {
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                        i11 = AdError.ICONVIEW_MISSING_ERROR_CODE;
                                        break;
                                    default:
                                        i11 = 6006;
                                        break;
                                }
                                break;
                        }
                    } else {
                        i11 = AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
                    }
                    throw a(e10, yvVar, i11);
                }
            }
            if (!this.f22347r0 && !this.f22348s.g()) {
                this.f22348s.b();
                if (this.f22341o0 == 2) {
                    this.f22341o0 = 1;
                }
                return true;
            }
            boolean zI = this.f22348s.i();
            if (zI) {
                this.f22348s.f19003b.a(iPosition);
            }
            if (this.T && !zI) {
                ByteBuffer byteBuffer2 = this.f22348s.f19004c;
                byte[] bArr2 = oh0.f23795a;
                int iPosition2 = byteBuffer2.position();
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    int i16 = i14 + 1;
                    if (i16 >= iPosition2) {
                        byteBuffer2.clear();
                        break;
                    }
                    int i17 = byteBuffer2.get(i14) & 255;
                    if (i15 == 3) {
                        if (i17 == 1 && (byteBuffer2.get(i16) & Ascii.US) == 7) {
                            ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
                            byteBufferDuplicate.position(i14 - 3);
                            byteBufferDuplicate.limit(iPosition2);
                            byteBuffer2.position(0);
                            byteBuffer2.put(byteBufferDuplicate);
                            break;
                        }
                    } else if (i17 == 0) {
                        i15++;
                    }
                    if (i17 != 0) {
                        i15 = 0;
                    }
                    i14 = i16;
                }
                if (this.f22348s.f19004c.position() == 0) {
                    return true;
                }
                this.T = false;
            }
            an anVar = this.f22348s;
            long jA = anVar.f19006e;
            bg bgVar = this.f22328d0;
            if (bgVar != null) {
                jA = bgVar.a(this.B, anVar);
                this.f22353u0 = Math.max(this.f22353u0, this.f22328d0.a(this.B));
            }
            if (this.f22348s.e()) {
                this.f22356w.add(Long.valueOf(jA));
            }
            if (this.f22361y0) {
                this.f22354v.a(this.B, jA);
                this.f22361y0 = false;
            }
            this.f22353u0 = Math.max(this.f22353u0, jA);
            this.f22348s.h();
            if (this.f22348s.d()) {
                a(this.f22348s);
            }
            b(this.f22348s);
            try {
                if (zI) {
                    this.K.a(this.f22330f0, this.f22348s.f19003b, jA);
                } else {
                    this.K.a(this.f22330f0, this.f22348s.f19004c.limit(), jA, 0);
                }
                this.f22330f0 = -1;
                this.f22348s.f19004c = null;
                this.f22347r0 = true;
                this.f22341o0 = 0;
                this.B0.f26880c++;
                return true;
            } catch (MediaCodec.CryptoException e11) {
                yv yvVar2 = this.B;
                int errorCode2 = e11.getErrorCode();
                int i18 = da1.f19803a;
                if (errorCode2 == 2 || errorCode2 == 4) {
                    i10 = 6005;
                } else if (errorCode2 == 10) {
                    i10 = 6004;
                } else if (errorCode2 == 7) {
                    i10 = 6005;
                } else if (errorCode2 != 8) {
                    switch (errorCode2) {
                        case 15:
                            i10 = AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
                            break;
                        case 16:
                        case 18:
                            i10 = 6005;
                            break;
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            i10 = 6004;
                            break;
                        default:
                            switch (errorCode2) {
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                    i10 = AdError.ICONVIEW_MISSING_ERROR_CODE;
                                    break;
                                default:
                                    i10 = 6006;
                                    break;
                            }
                            break;
                    }
                } else {
                    i10 = AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
                }
                throw a(e11, yvVar2, i10);
            }
        } catch (an.a e12) {
            a(e12);
            d(0);
            try {
                this.K.flush();
                return true;
            } finally {
                N();
            }
        }
    }

    public final void A() throws ns {
        if (B()) {
            I();
        }
    }

    public final boolean B() {
        if (this.K == null) {
            return false;
        }
        int i10 = this.f22345q0;
        if (i10 == 3 || this.U || ((this.V && !this.f22351t0) || (this.W && this.f22349s0))) {
            L();
            return true;
        }
        if (i10 == 2) {
            int i11 = da1.f19803a;
            pa.b(i11 >= 23);
            if (i11 >= 23) {
                try {
                    Q();
                } catch (ns e10) {
                    p90.b("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                    L();
                    return true;
                }
            }
        }
        try {
            this.K.flush();
            return false;
        } finally {
            N();
        }
    }

    public final eb0 C() {
        return this.K;
    }

    public final ib0 D() {
        return this.R;
    }

    public boolean E() {
        return false;
    }

    public final MediaFormat F() {
        return this.M;
    }

    public final long G() {
        return this.D0;
    }

    public final float H() {
        return this.I;
    }

    public final void I() throws ns {
        yv yvVar;
        if (this.K != null || this.f22335k0 || (yvVar = this.B) == null) {
            return;
        }
        boolean z10 = false;
        if (this.E == null && b(yvVar)) {
            yv yvVar2 = this.B;
            this.f22337m0 = false;
            this.f22352u.b();
            this.f22350t.b();
            this.f22336l0 = false;
            this.f22335k0 = false;
            String str = yvVar2.f27115l;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.f22352u.f(32);
            } else {
                this.f22352u.f(1);
            }
            this.f22335k0 = true;
            return;
        }
        b(this.E);
        String str2 = this.B.f27115l;
        com.yandex.mobile.ads.exo.drm.e eVar = this.D;
        if (eVar != null) {
            if (this.F == null) {
                ew ewVarA = a(eVar);
                if (ewVarA != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(ewVarA.f20344a, ewVarA.f20345b);
                        this.F = mediaCrypto;
                        if (!ewVarA.f20346c && mediaCrypto.requiresSecureDecoderComponent(str2)) {
                            z10 = true;
                        }
                        this.G = z10;
                    } catch (MediaCryptoException e10) {
                        throw a(e10, this.B, 6006);
                    }
                } else if (this.D.g() == null) {
                    return;
                }
            }
            if (ew.f20343d) {
                int iC = this.D.c();
                if (iC == 1) {
                    com.yandex.mobile.ads.exo.drm.e.a aVarG = this.D.g();
                    Objects.requireNonNull(aVarG);
                    throw a(aVarG, this.B, aVarG.f18493a);
                }
                if (iC != 4) {
                    return;
                }
            }
        }
        try {
            a(this.F, this.G);
        } catch (b e11) {
            throw a(e11, this.B, 4001);
        }
    }

    public abstract void J();

    /* JADX WARN: Multi-variable type inference failed */
    public final void L() {
        try {
            eb0 eb0Var = this.K;
            if (eb0Var != null) {
                eb0Var.release();
                this.B0.f26879b++;
                a(this.R.f21667a);
            }
            this.K = null;
            try {
                MediaCrypto mediaCrypto = this.F;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.F = null;
                b((com.yandex.mobile.ads.exo.drm.e) null);
                O();
            }
        } catch (Throwable th) {
            this.K = null;
            try {
                MediaCrypto mediaCrypto2 = this.F;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.F = null;
                b((com.yandex.mobile.ads.exo.drm.e) null);
                O();
            }
        }
    }

    public void M() throws ns {
    }

    public void N() {
        this.f22330f0 = -1;
        this.f22348s.f19004c = null;
        this.f22331g0 = -1;
        this.f22332h0 = null;
        this.f22329e0 = -9223372036854775807L;
        this.f22349s0 = false;
        this.f22347r0 = false;
        this.f22325a0 = false;
        this.f22326b0 = false;
        this.f22333i0 = false;
        this.f22334j0 = false;
        this.f22356w.clear();
        this.f22353u0 = -9223372036854775807L;
        this.f22355v0 = -9223372036854775807L;
        bg bgVar = this.f22328d0;
        if (bgVar != null) {
            bgVar.a();
        }
        this.f22343p0 = 0;
        this.f22345q0 = 0;
        this.f22341o0 = this.f22339n0 ? 1 : 0;
    }

    public final void O() {
        N();
        this.A0 = null;
        this.f22328d0 = null;
        this.P = null;
        this.R = null;
        this.L = null;
        this.M = null;
        this.N = false;
        this.f22351t0 = false;
        this.O = -1.0f;
        this.S = 0;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f22327c0 = false;
        this.f22339n0 = false;
        this.f22341o0 = 0;
        this.G = false;
    }

    public final void P() {
        this.f22363z0 = true;
    }

    public abstract float a(float f10, yv[] yvVarArr);

    public abstract int a(mb0 mb0Var, yv yvVar) throws nb0.b;

    @Override // com.yandex.mobile.ads.impl.qv0
    public final int a(yv yvVar) throws ns {
        try {
            return a(this.f22340o, yvVar);
        } catch (nb0.b e10) {
            throw a(e10, yvVar, 4002);
        }
    }

    public abstract cn a(ib0 ib0Var, yv yvVar, yv yvVar2);

    /* JADX WARN: Code duplicated, block: B:114:0x0130  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:98:0x010b  */
    public cn a(zv zvVar) throws ns {
        boolean z10;
        int i10;
        ew ewVarA;
        boolean z11 = true;
        this.f22361y0 = true;
        yv yvVar = zvVar.f27433b;
        Objects.requireNonNull(yvVar);
        if (yvVar.f27115l == null) {
            throw a(new IllegalArgumentException(), yvVar, 4005);
        }
        com.yandex.mobile.ads.exo.drm.e eVar = zvVar.f27432a;
        com.yandex.mobile.ads.exo.drm.e eVar2 = this.E;
        if (eVar2 != eVar) {
            if (eVar != null) {
                eVar.b(null);
            }
            if (eVar2 != null) {
                eVar2.a((com.yandex.mobile.ads.exo.drm.f.a) null);
            }
        }
        this.E = eVar;
        this.B = yvVar;
        if (this.f22335k0) {
            this.f22337m0 = true;
            return null;
        }
        eb0 eb0Var = this.K;
        if (eb0Var == null) {
            this.P = null;
            I();
            return null;
        }
        ib0 ib0Var = this.R;
        yv yvVar2 = this.L;
        com.yandex.mobile.ads.exo.drm.e eVar3 = this.D;
        if (eVar3 != eVar) {
            if (eVar != null && eVar3 != null && da1.f19803a >= 23) {
                UUID uuid = cg.f19502e;
                if (!uuid.equals(eVar3.f()) && !uuid.equals(eVar.f()) && (ewVarA = a(eVar)) != null) {
                    boolean zA = ewVarA.f20346c ? false : eVar.a(yvVar.f27115l);
                    if (ib0Var.f21672f || !zA) {
                        z10 = false;
                    }
                }
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f22347r0) {
                this.f22343p0 = 1;
                this.f22345q0 = 3;
            } else {
                L();
                I();
            }
            return new cn(ib0Var.f21667a, yvVar2, yvVar, 0, 128);
        }
        boolean z12 = this.E != this.D;
        pa.b(!z12 || da1.f19803a >= 23);
        cn cnVarA = a(ib0Var, yvVar2, yvVar);
        int i11 = cnVarA.f19560d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (c(yvVar)) {
                        this.L = yvVar;
                        if (z12 && !y()) {
                            i10 = 2;
                        }
                    } else {
                        i10 = 16;
                    }
                } else if (c(yvVar)) {
                    this.f22339n0 = true;
                    this.f22341o0 = 1;
                    int i12 = this.S;
                    if (i12 != 2 && (i12 != 1 || yvVar.f27120q != yvVar2.f27120q || yvVar.f27121r != yvVar2.f27121r)) {
                        z11 = false;
                    }
                    this.f22325a0 = z11;
                    this.L = yvVar;
                    if (z12 && !y()) {
                        i10 = 2;
                    }
                } else {
                    i10 = 16;
                }
            } else if (c(yvVar)) {
                this.L = yvVar;
                if (!z12) {
                    if (this.f22347r0) {
                        this.f22343p0 = 1;
                        if (this.U || this.W) {
                            this.f22345q0 = 3;
                            z11 = false;
                        } else {
                            this.f22345q0 = 1;
                        }
                    }
                    if (!z11) {
                        i10 = 2;
                    }
                } else if (!y()) {
                    i10 = 2;
                }
            } else {
                i10 = 16;
            }
            return (cnVarA.f19560d != 0 || (this.K == eb0Var && this.f22345q0 != 3)) ? cnVarA : new cn(ib0Var.f21667a, yvVar2, yvVar, 0, i10);
        }
        if (this.f22347r0) {
            this.f22343p0 = 1;
            this.f22345q0 = 3;
        } else {
            L();
            I();
        }
        i10 = 0;
        if (cnVarA.f19560d != 0) {
        }
    }

    public abstract eb0.a a(ib0 ib0Var, yv yvVar, MediaCrypto mediaCrypto, float f10);

    public hb0 a(IllegalStateException illegalStateException, ib0 ib0Var) {
        return new hb0(illegalStateException, ib0Var);
    }

    public abstract ArrayList a(mb0 mb0Var, yv yvVar, boolean z10) throws nb0.b;

    @Override // com.yandex.mobile.ads.impl.pv0
    public void a(float f10, float f11) throws ns {
        this.I = f10;
        this.J = f11;
        c(this.L);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0099 A[Catch: IllegalStateException -> 0x009b, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {IllegalStateException -> 0x009b, blocks: (B:8:0x000f, B:10:0x0013, B:12:0x0017, B:14:0x001b, B:17:0x0023, B:19:0x002a, B:20:0x002f, B:23:0x0036, B:50:0x0096, B:51:0x0098, B:52:0x0099, B:24:0x003a, B:26:0x003e, B:27:0x0047, B:29:0x0052, B:31:0x0058, B:38:0x006a, B:40:0x0070, B:42:0x0076, B:49:0x0088), top: B:82:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    @Override // com.yandex.mobile.ads.impl.pv0
    public final void a(long j10, long j11) throws ns {
        boolean z10;
        boolean z11 = false;
        if (this.f22363z0) {
            this.f22363z0 = false;
            K();
        }
        ns nsVar = this.A0;
        if (nsVar != null) {
            this.A0 = null;
            throw nsVar;
        }
        try {
            if (this.f22359x0) {
                M();
                return;
            }
            if (this.B != null || d(2)) {
                I();
                if (!this.f22335k0) {
                    if (this.K != null) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        d71.a("drainAndFeed");
                        while (c(j10, j11)) {
                            if (!(this.H == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < this.H)) {
                                break;
                            }
                        }
                        while (z()) {
                            if (!(this.H == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < this.H)) {
                                break;
                            }
                        }
                    } else {
                        this.B0.f26881d += b(j10);
                        d(1);
                    }
                    synchronized (this.B0) {
                    }
                }
                d71.a("bypassRender");
                while (b(j10, j11)) {
                }
                d71.a();
                synchronized (this.B0) {
                }
            }
        } catch (IllegalStateException e10) {
            int i10 = da1.f19803a;
            if (i10 < 21 || !(e10 instanceof MediaCodec.CodecException)) {
                StackTraceElement[] stackTrace = e10.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else {
                z10 = true;
            }
            if (!z10) {
                throw e10;
            }
            a(e10);
            if (i10 >= 21) {
                if (e10 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e10).isRecoverable() : false) {
                    z11 = true;
                }
            }
            if (z11) {
                L();
            }
            throw a(4003, this.B, a(e10, this.R), z11);
        }
    }

    @Override // com.yandex.mobile.ads.impl.me
    public void a(long j10, boolean z10) throws ns {
        this.f22357w0 = false;
        this.f22359x0 = false;
        this.f22363z0 = false;
        if (this.f22335k0) {
            this.f22352u.b();
            this.f22350t.b();
            this.f22336l0 = false;
        } else {
            A();
        }
        if (this.f22354v.d() > 0) {
            this.f22361y0 = true;
        }
        this.f22354v.a();
        int i10 = this.E0;
        if (i10 != 0) {
            int i11 = i10 - 1;
            this.D0 = this.f22362z[i11];
            this.C0 = this.f22360y[i11];
            this.E0 = 0;
        }
    }

    public void a(an anVar) throws ns {
    }

    public final void a(ns nsVar) {
        this.A0 = nsVar;
    }

    public abstract void a(yv yvVar, MediaFormat mediaFormat) throws ns;

    public abstract void a(Exception exc);

    public abstract void a(String str);

    public abstract void a(String str, long j10, long j11);

    @Override // com.yandex.mobile.ads.impl.me
    public void a(boolean z10, boolean z11) throws ns {
        this.B0 = new ym();
    }

    @Override // com.yandex.mobile.ads.impl.me
    public final void a(yv[] yvVarArr, long j10, long j11) throws ns {
        if (this.D0 == -9223372036854775807L) {
            pa.b(this.C0 == -9223372036854775807L);
            this.C0 = j10;
            this.D0 = j11;
            return;
        }
        int i10 = this.E0;
        if (i10 == this.f22362z.length) {
            StringBuilder sbA = v60.a("Too many stream changes, so dropping offset: ");
            sbA.append(this.f22362z[this.E0 - 1]);
            p90.d("MediaCodecRenderer", sbA.toString());
        } else {
            this.E0 = i10 + 1;
        }
        long[] jArr = this.f22360y;
        int i11 = this.E0 - 1;
        jArr[i11] = j10;
        this.f22362z[i11] = j11;
        this.A[i11] = this.f22353u0;
    }

    @Override // com.yandex.mobile.ads.impl.pv0
    public boolean a() {
        return this.f22359x0;
    }

    public abstract boolean a(long j10, long j11, eb0 eb0Var, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, yv yvVar) throws ns;

    public boolean a(ib0 ib0Var) {
        return true;
    }

    public abstract void b(an anVar) throws ns;

    public boolean b(yv yvVar) {
        return false;
    }

    public void c(long j10) {
        while (true) {
            int i10 = this.E0;
            if (i10 == 0 || j10 < this.A[0]) {
                return;
            }
            long[] jArr = this.f22360y;
            this.C0 = jArr[0];
            this.D0 = this.f22362z[0];
            int i11 = i10 - 1;
            this.E0 = i11;
            System.arraycopy(jArr, 1, jArr, 0, i11);
            long[] jArr2 = this.f22362z;
            System.arraycopy(jArr2, 1, jArr2, 0, this.E0);
            long[] jArr3 = this.A;
            System.arraycopy(jArr3, 1, jArr3, 0, this.E0);
            J();
        }
    }

    public final void d(long j10) throws ns {
        boolean z10;
        yv yvVarB = this.f22354v.b(j10);
        if (yvVarB == null && this.N) {
            yvVarB = this.f22354v.c();
        }
        if (yvVarB != null) {
            this.C = yvVarB;
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || (this.N && this.C != null)) {
            a(this.C, this.M);
            this.N = false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.pv0
    public boolean d() {
        if (this.B != null) {
            if (t()) {
                return true;
            }
            if (this.f22331g0 >= 0) {
                return true;
            }
            if (this.f22329e0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f22329e0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.me, com.yandex.mobile.ads.impl.qv0
    public final int f() {
        return 8;
    }

    @Override // com.yandex.mobile.ads.impl.me
    public void u() {
        this.B = null;
        this.C0 = -9223372036854775807L;
        this.D0 = -9223372036854775807L;
        this.E0 = 0;
        B();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.yandex.mobile.ads.impl.me
    public void v() {
        try {
            this.f22337m0 = false;
            this.f22352u.b();
            this.f22350t.b();
            this.f22336l0 = false;
            this.f22335k0 = false;
            L();
            if (this.E != null) {
            }
        } finally {
            com.yandex.mobile.ads.exo.drm.e eVar = this.E;
            if (eVar != null) {
                eVar.a((com.yandex.mobile.ads.exo.drm.f.a) null);
            }
            this.E = null;
        }
    }
}
