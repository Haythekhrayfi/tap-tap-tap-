package com.applovin.exoplayer2.m;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.l.ah;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.t;
import com.applovin.exoplayer2.l.u;
import com.applovin.exoplayer2.v;
import com.applovin.exoplayer2.w;
import com.google.android.gms.common.Scopes;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public class h extends com.applovin.exoplayer2.f.j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f7798c = {1920, 1600, DateTimeConstants.MINUTES_PER_DAY, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f7799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f7800e;
    private int A;
    private long B;
    private long C;
    private long D;
    private int E;
    private int F;
    private int G;
    private int H;
    private float I;
    private o J;
    private boolean K;
    private int L;
    private l M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f7801b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f7802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final m f7803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final n.a f7804h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f7805i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f7806j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f7807k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f7808l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f7809m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f7810n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Surface f7811o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private d f7812p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f7813q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f7814r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f7815s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f7816t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f7817u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f7818v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f7819w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f7820x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f7821y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f7822z;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7825c;

        public a(int i10, int i11, int i12) {
            this.f7823a = i10;
            this.f7824b = i11;
            this.f7825c = i12;
        }
    }

    public final class b implements Handler.Callback, com.applovin.exoplayer2.f.g.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f7827b;

        public b(com.applovin.exoplayer2.f.g gVar) {
            Handler handlerA = ai.a((Handler.Callback) this);
            this.f7827b = handlerA;
            gVar.a(this, handlerA);
        }

        private void a(long j10) {
            h hVar = h.this;
            if (this != hVar.f7801b) {
                return;
            }
            if (j10 == RecyclerView.FOREVER_NS) {
                hVar.R();
                return;
            }
            try {
                hVar.e(j10);
            } catch (com.applovin.exoplayer2.p e10) {
                h.this.a(e10);
            }
        }

        @Override // com.applovin.exoplayer2.f.g.c
        public void a(com.applovin.exoplayer2.f.g gVar, long j10, long j11) {
            if (ai.f7595a >= 30) {
                a(j10);
            } else {
                this.f7827b.sendMessageAtFrontOfQueue(Message.obtain(this.f7827b, 0, (int) (j10 >> 32), (int) j10));
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a(ai.b(message.arg1, message.arg2));
            return true;
        }
    }

    public h(Context context, com.applovin.exoplayer2.f.g.b bVar, com.applovin.exoplayer2.f.k kVar, long j10, boolean z10, Handler handler, n nVar, int i10) {
        super(2, bVar, kVar, z10, 30.0f);
        this.f7805i = j10;
        this.f7806j = i10;
        Context applicationContext = context.getApplicationContext();
        this.f7802f = applicationContext;
        this.f7803g = new m(applicationContext);
        this.f7804h = new n.a(handler, nVar);
        this.f7807k = aa();
        this.f7819w = -9223372036854775807L;
        this.F = -1;
        this.G = -1;
        this.I = -1.0f;
        this.f7814r = 1;
        this.L = 0;
        V();
    }

    public h(Context context, com.applovin.exoplayer2.f.k kVar, long j10, boolean z10, Handler handler, n nVar, int i10) {
        this(context, com.applovin.exoplayer2.f.g.b.f6234a, kVar, j10, z10, handler, nVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        P();
    }

    private void S() {
        this.f7819w = this.f7805i > 0 ? SystemClock.elapsedRealtime() + this.f7805i : -9223372036854775807L;
    }

    private void T() {
        com.applovin.exoplayer2.f.g gVarG;
        this.f7815s = false;
        if (ai.f7595a < 23 || !this.K || (gVarG = G()) == null) {
            return;
        }
        this.f7801b = new b(gVarG);
    }

    private void U() {
        if (this.f7813q) {
            this.f7804h.a(this.f7811o);
        }
    }

    private void V() {
        this.J = null;
    }

    private void W() {
        int i10 = this.F;
        if (i10 == -1 && this.G == -1) {
            return;
        }
        o oVar = this.J;
        if (oVar != null && oVar.f7880b == i10 && oVar.f7881c == this.G && oVar.f7882d == this.H && oVar.f7883e == this.I) {
            return;
        }
        o oVar2 = new o(this.F, this.G, this.H, this.I);
        this.J = oVar2;
        this.f7804h.a(oVar2);
    }

    private void X() {
        o oVar = this.J;
        if (oVar != null) {
            this.f7804h.a(oVar);
        }
    }

    private void Y() {
        if (this.f7821y > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f7804h.a(this.f7821y, jElapsedRealtime - this.f7820x);
            this.f7821y = 0;
            this.f7820x = jElapsedRealtime;
        }
    }

    private void Z() {
        int i10 = this.E;
        if (i10 != 0) {
            this.f7804h.a(this.D, i10);
            this.D = 0L;
            this.E = 0;
        }
    }

    public static int a(com.applovin.exoplayer2.f.i iVar, v vVar) {
        if (vVar.f8199m == -1) {
            return c(iVar, vVar);
        }
        int size = vVar.f8200n.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += vVar.f8200n.get(i10).length;
        }
        return vVar.f8199m + length;
    }

    private static List<com.applovin.exoplayer2.f.i> a(com.applovin.exoplayer2.f.k kVar, v vVar, boolean z10, boolean z11) throws com.applovin.exoplayer2.f.l.b {
        Pair<Integer, Integer> pairA;
        String str;
        String str2 = vVar.f8198l;
        if (str2 == null) {
            return Collections.emptyList();
        }
        List<com.applovin.exoplayer2.f.i> listA = com.applovin.exoplayer2.f.l.a(kVar.getDecoderInfos(str2, z10, z11), vVar);
        if ("video/dolby-vision".equals(str2) && (pairA = com.applovin.exoplayer2.f.l.a(vVar)) != null) {
            int iIntValue = ((Integer) pairA.first).intValue();
            if (iIntValue != 16 && iIntValue != 256) {
                str = iIntValue == 512 ? "video/avc" : "video/hevc";
            }
            listA.addAll(kVar.getDecoderInfos(str, z10, z11));
        }
        return Collections.unmodifiableList(listA);
    }

    private void a(long j10, long j11, v vVar) {
        l lVar = this.M;
        if (lVar != null) {
            lVar.a(j10, j11, vVar, H());
        }
    }

    private static void a(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i10);
    }

    private static void a(com.applovin.exoplayer2.f.g gVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        gVar.a(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.applovin.exoplayer2.m.m] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.applovin.exoplayer2.e, com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.m.h] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.applovin.exoplayer2.m.d] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
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
    private void a(Object obj) throws com.applovin.exoplayer2.p {
        ?? A;
        Surface surface;
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            A = 0;
        }
        if (A == 0) {
            d dVar = this.f7812p;
            if (dVar != null) {
                A = surface;
                A = dVar;
            } else {
                com.applovin.exoplayer2.f.i iVarI = I();
                if (iVarI != null && b(iVarI)) {
                    A = surface;
                    A = d.a(this.f7802f, iVarI.f6243g);
                    this.f7812p = A;
                }
            }
        }
        A = surface;
        A = surface;
        A = surface;
        if (this.f7811o == A) {
            if (A == 0 || A == this.f7812p) {
                return;
            }
            X();
            U();
            return;
        }
        this.f7811o = A;
        this.f7803g.a(A);
        this.f7813q = false;
        int iD_ = d_();
        com.applovin.exoplayer2.f.g gVarG = G();
        if (gVarG != null) {
            if (ai.f7595a < 23 || A == 0 || this.f7809m) {
                J();
                E();
            } else {
                a(gVarG, A);
            }
        }
        if (A == 0 || A == this.f7812p) {
            V();
            T();
            return;
        }
        X();
        T();
        if (iD_ == 2) {
            S();
        }
    }

    private static boolean aa() {
        return "NVIDIA".equals(ai.f7597c);
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    private static boolean ab() {
        /*
            Method dump skipped, instruction units count: 3044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.m.h.ab():boolean");
    }

    private static Point b(com.applovin.exoplayer2.f.i iVar, v vVar) {
        int i10 = vVar.f8204r;
        int i11 = vVar.f8203q;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = i10 / i12;
        for (int i13 : f7798c) {
            int i14 = (int) (i13 * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            if (ai.f7595a >= 21) {
                int i15 = z10 ? i14 : i13;
                if (!z10) {
                    i13 = i14;
                }
                Point pointA = iVar.a(i15, i13);
                if (iVar.a(pointA.x, pointA.y, vVar.f8205s)) {
                    return pointA;
                }
            } else {
                try {
                    int iA = ai.a(i13, 16) * 16;
                    int iA2 = ai.a(i14, 16) * 16;
                    if (iA * iA2 <= com.applovin.exoplayer2.f.l.b()) {
                        int i16 = z10 ? iA2 : iA;
                        if (!z10) {
                            iA = iA2;
                        }
                        return new Point(i16, iA);
                    }
                } catch (com.applovin.exoplayer2.f.l.b unused) {
                }
            }
        }
        return null;
    }

    private boolean b(com.applovin.exoplayer2.f.i iVar) {
        return ai.f7595a >= 23 && !this.K && !b(iVar.f6237a) && (!iVar.f6243g || d.a(this.f7802f));
    }

    private static int c(com.applovin.exoplayer2.f.i iVar, v vVar) {
        int iA;
        int iIntValue;
        int i10 = vVar.f8203q;
        int i11 = vVar.f8204r;
        if (i10 == -1 || i11 == -1) {
            return -1;
        }
        String str = vVar.f8198l;
        if ("video/dolby-vision".equals(str)) {
            Pair<Integer, Integer> pairA = com.applovin.exoplayer2.f.l.a(vVar);
            str = (pairA == null || !((iIntValue = ((Integer) pairA.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
        }
        Objects.requireNonNull(str);
        int i12 = 4;
        switch (str) {
            case "video/3gpp":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                iA = i10 * i11;
                i12 = 2;
                return (iA * 3) / (i12 * 2);
            case "video/hevc":
            case "video/x-vnd.on2.vp9":
                iA = i10 * i11;
                return (iA * 3) / (i12 * 2);
            case "video/avc":
                String str2 = ai.f7598d;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(ai.f7597c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && iVar.f6243g)))) {
                    return -1;
                }
                iA = ai.a(i11, 16) * ai.a(i10, 16) * 16 * 16;
                i12 = 2;
                return (iA * 3) / (i12 * 2);
            default:
                return -1;
        }
    }

    private static boolean g(long j10) {
        return j10 < -30000;
    }

    private static boolean h(long j10) {
        return j10 < -500000;
    }

    public void B() {
        this.f7817u = true;
        if (this.f7815s) {
            return;
        }
        this.f7815s = true;
        this.f7804h.a(this.f7811o);
        this.f7813q = true;
    }

    @Override // com.applovin.exoplayer2.f.j
    public void C() {
        super.C();
        T();
    }

    @Override // com.applovin.exoplayer2.f.j
    public boolean F() {
        return this.K && ai.f7595a < 23;
    }

    @Override // com.applovin.exoplayer2.f.j
    public void M() {
        super.M();
        this.A = 0;
    }

    @Override // com.applovin.exoplayer2.f.j
    public float a(float f10, v vVar, v[] vVarArr) {
        float fMax = -1.0f;
        for (v vVar2 : vVarArr) {
            float f11 = vVar2.f8205s;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    @Override // com.applovin.exoplayer2.f.j
    public int a(com.applovin.exoplayer2.f.k kVar, v vVar) throws com.applovin.exoplayer2.f.l.b {
        int i10 = 0;
        if (!u.b(vVar.f8198l)) {
            return as.b(0);
        }
        boolean z10 = vVar.f8201o != null;
        List<com.applovin.exoplayer2.f.i> listA = a(kVar, vVar, z10, false);
        if (z10 && listA.isEmpty()) {
            listA = a(kVar, vVar, false, false);
        }
        if (listA.isEmpty()) {
            return as.b(1);
        }
        if (!com.applovin.exoplayer2.f.j.c(vVar)) {
            return as.b(2);
        }
        com.applovin.exoplayer2.f.i iVar = listA.get(0);
        boolean zA = iVar.a(vVar);
        int i11 = iVar.c(vVar) ? 16 : 8;
        if (zA) {
            List<com.applovin.exoplayer2.f.i> listA2 = a(kVar, vVar, z10, true);
            if (!listA2.isEmpty()) {
                com.applovin.exoplayer2.f.i iVar2 = listA2.get(0);
                if (iVar2.a(vVar) && iVar2.c(vVar)) {
                    i10 = 32;
                }
            }
        }
        return as.a(zA ? 4 : 3, i11, i10);
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(21)
    public MediaFormat a(v vVar, String str, a aVar, float f10, boolean z10, int i10) {
        Pair<Integer, Integer> pairA;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", vVar.f8203q);
        mediaFormat.setInteger("height", vVar.f8204r);
        t.a(mediaFormat, vVar.f8200n);
        t.a(mediaFormat, "frame-rate", vVar.f8205s);
        t.a(mediaFormat, "rotation-degrees", vVar.f8206t);
        t.a(mediaFormat, vVar.f8210x);
        if ("video/dolby-vision".equals(vVar.f8198l) && (pairA = com.applovin.exoplayer2.f.l.a(vVar)) != null) {
            t.a(mediaFormat, Scopes.PROFILE, ((Integer) pairA.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f7823a);
        mediaFormat.setInteger("max-height", aVar.f7824b);
        t.a(mediaFormat, "max-input-size", aVar.f7825c);
        if (ai.f7595a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            a(mediaFormat, i10);
        }
        return mediaFormat;
    }

    @Override // com.applovin.exoplayer2.f.j
    public com.applovin.exoplayer2.c.h a(com.applovin.exoplayer2.f.i iVar, v vVar, v vVar2) {
        com.applovin.exoplayer2.c.h hVarA = iVar.a(vVar, vVar2);
        int i10 = hVarA.f4764e;
        int i11 = vVar2.f8203q;
        a aVar = this.f7808l;
        if (i11 > aVar.f7823a || vVar2.f8204r > aVar.f7824b) {
            i10 |= 256;
        }
        if (a(iVar, vVar2) > this.f7808l.f7825c) {
            i10 |= 64;
        }
        int i12 = i10;
        return new com.applovin.exoplayer2.c.h(iVar.f6237a, vVar, vVar2, i12 != 0 ? 0 : hVarA.f4763d, i12);
    }

    @Override // com.applovin.exoplayer2.f.j
    public com.applovin.exoplayer2.c.h a(w wVar) throws com.applovin.exoplayer2.p {
        com.applovin.exoplayer2.c.h hVarA = super.a(wVar);
        this.f7804h.a(wVar.f8240b, hVarA);
        return hVarA;
    }

    @Override // com.applovin.exoplayer2.f.j
    @TargetApi(17)
    public com.applovin.exoplayer2.f.g.a a(com.applovin.exoplayer2.f.i iVar, v vVar, MediaCrypto mediaCrypto, float f10) {
        d dVar = this.f7812p;
        if (dVar != null && dVar.f7771a != iVar.f6243g) {
            dVar.release();
            this.f7812p = null;
        }
        String str = iVar.f6239c;
        a aVarA = a(iVar, vVar, u());
        this.f7808l = aVarA;
        MediaFormat mediaFormatA = a(vVar, str, aVarA, f10, this.f7807k, this.K ? this.L : 0);
        if (this.f7811o == null) {
            if (!b(iVar)) {
                throw new IllegalStateException();
            }
            if (this.f7812p == null) {
                this.f7812p = d.a(this.f7802f, iVar.f6243g);
            }
            this.f7811o = this.f7812p;
        }
        return com.applovin.exoplayer2.f.g.a.a(iVar, mediaFormatA, vVar, this.f7811o, mediaCrypto);
    }

    @Override // com.applovin.exoplayer2.f.j
    public com.applovin.exoplayer2.f.h a(Throwable th, com.applovin.exoplayer2.f.i iVar) {
        return new g(th, iVar, this.f7811o);
    }

    public a a(com.applovin.exoplayer2.f.i iVar, v vVar, v[] vVarArr) {
        int iC;
        int iMax = vVar.f8203q;
        int iMax2 = vVar.f8204r;
        int iA = a(iVar, vVar);
        if (vVarArr.length == 1) {
            if (iA != -1 && (iC = c(iVar, vVar)) != -1) {
                iA = Math.min((int) (iA * 1.5f), iC);
            }
            return new a(iMax, iMax2, iA);
        }
        int length = vVarArr.length;
        boolean z10 = false;
        for (int i10 = 0; i10 < length; i10++) {
            v vVarA = vVarArr[i10];
            if (vVar.f8210x != null && vVarA.f8210x == null) {
                vVarA = vVarA.a().a(vVar.f8210x).a();
            }
            if (iVar.a(vVar, vVarA).f4763d != 0) {
                int i11 = vVarA.f8203q;
                z10 |= i11 == -1 || vVarA.f8204r == -1;
                iMax = Math.max(iMax, i11);
                iMax2 = Math.max(iMax2, vVarA.f8204r);
                iA = Math.max(iA, a(iVar, vVarA));
            }
        }
        if (z10) {
            com.applovin.exoplayer2.l.q.c("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point pointB = b(iVar, vVar);
            if (pointB != null) {
                iMax = Math.max(iMax, pointB.x);
                iMax2 = Math.max(iMax2, pointB.y);
                iA = Math.max(iA, c(iVar, vVar.a().g(iMax).h(iMax2).a()));
                com.applovin.exoplayer2.l.q.c("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new a(iMax, iMax2, iA);
    }

    @Override // com.applovin.exoplayer2.f.j
    public List<com.applovin.exoplayer2.f.i> a(com.applovin.exoplayer2.f.k kVar, v vVar, boolean z10) throws com.applovin.exoplayer2.f.l.b {
        return a(kVar, vVar, z10, this.K);
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.ar
    public void a(float f10, float f11) throws com.applovin.exoplayer2.p {
        super.a(f10, f11);
        this.f7803g.a(f10);
    }

    @Override // com.applovin.exoplayer2.e, com.applovin.exoplayer2.ao.b
    public void a(int i10, Object obj) throws com.applovin.exoplayer2.p {
        if (i10 == 1) {
            a(obj);
            return;
        }
        if (i10 == 7) {
            this.M = (l) obj;
            return;
        }
        if (i10 == 10) {
            int iIntValue = ((Integer) obj).intValue();
            if (this.L != iIntValue) {
                this.L = iIntValue;
                if (this.K) {
                    J();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                super.a(i10, obj);
                return;
            } else {
                this.f7803g.a(((Integer) obj).intValue());
                return;
            }
        }
        this.f7814r = ((Integer) obj).intValue();
        com.applovin.exoplayer2.f.g gVarG = G();
        if (gVarG != null) {
            gVarG.c(this.f7814r);
        }
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    public void a(long j10, boolean z10) throws com.applovin.exoplayer2.p {
        super.a(j10, z10);
        T();
        this.f7803g.c();
        this.B = -9223372036854775807L;
        this.f7818v = -9223372036854775807L;
        this.f7822z = 0;
        if (z10) {
            S();
        } else {
            this.f7819w = -9223372036854775807L;
        }
    }

    @Override // com.applovin.exoplayer2.f.j
    public void a(com.applovin.exoplayer2.c.g gVar) throws com.applovin.exoplayer2.p {
        boolean z10 = this.K;
        if (!z10) {
            this.A++;
        }
        if (ai.f7595a >= 23 || !z10) {
            return;
        }
        e(gVar.f4754d);
    }

    public void a(com.applovin.exoplayer2.f.g gVar, int i10, long j10) {
        ah.a("skipVideoBuffer");
        gVar.a(i10, false);
        ah.a();
        ((com.applovin.exoplayer2.f.j) this).f6249a.f4745f++;
    }

    public void a(com.applovin.exoplayer2.f.g gVar, int i10, long j10, long j11) {
        W();
        ah.a("releaseOutputBuffer");
        gVar.a(i10, j11);
        ah.a();
        this.C = SystemClock.elapsedRealtime() * 1000;
        ((com.applovin.exoplayer2.f.j) this).f6249a.f4744e++;
        this.f7822z = 0;
        B();
    }

    public void a(com.applovin.exoplayer2.f.g gVar, Surface surface) {
        gVar.a(surface);
    }

    @Override // com.applovin.exoplayer2.f.j
    public void a(v vVar, MediaFormat mediaFormat) {
        com.applovin.exoplayer2.f.g gVarG = G();
        if (gVarG != null) {
            gVarG.c(this.f7814r);
        }
        if (this.K) {
            this.F = vVar.f8203q;
            this.G = vVar.f8204r;
        } else {
            com.applovin.exoplayer2.l.a.b(mediaFormat);
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.F = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.G = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f10 = vVar.f8207u;
        this.I = f10;
        if (ai.f7595a >= 21) {
            int i10 = vVar.f8206t;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.F;
                this.F = this.G;
                this.G = i11;
                this.I = 1.0f / f10;
            }
        } else {
            this.H = vVar.f8206t;
        }
        this.f7803g.b(vVar.f8205s);
    }

    @Override // com.applovin.exoplayer2.f.j
    public void a(Exception exc) {
        com.applovin.exoplayer2.l.q.c("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f7804h.a(exc);
    }

    @Override // com.applovin.exoplayer2.f.j
    public void a(String str) {
        this.f7804h.a(str);
    }

    @Override // com.applovin.exoplayer2.f.j
    public void a(String str, long j10, long j11) {
        this.f7804h.a(str, j10, j11);
        this.f7809m = b(str);
        this.f7810n = ((com.applovin.exoplayer2.f.i) com.applovin.exoplayer2.l.a.b(I())).b();
        if (ai.f7595a < 23 || !this.K) {
            return;
        }
        this.f7801b = new b((com.applovin.exoplayer2.f.g) com.applovin.exoplayer2.l.a.b(G()));
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    public void a(boolean z10, boolean z11) throws com.applovin.exoplayer2.p {
        super.a(z10, z11);
        boolean z12 = v().f4295b;
        com.applovin.exoplayer2.l.a.b((z12 && this.L == 0) ? false : true);
        if (this.K != z12) {
            this.K = z12;
            J();
        }
        this.f7804h.a(((com.applovin.exoplayer2.f.j) this).f6249a);
        this.f7803g.a();
        this.f7816t = z11;
        this.f7817u = false;
    }

    @Override // com.applovin.exoplayer2.f.j
    public boolean a(long j10, long j11, com.applovin.exoplayer2.f.g gVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, v vVar) throws com.applovin.exoplayer2.p {
        h hVar;
        long j13;
        com.applovin.exoplayer2.l.a.b(gVar);
        if (this.f7818v == -9223372036854775807L) {
            this.f7818v = j10;
        }
        if (j12 != this.B) {
            this.f7803g.a(j12);
            this.B = j12;
        }
        long jQ = Q();
        long j14 = j12 - jQ;
        if (z10 && !z11) {
            a(gVar, i10, j14);
            return true;
        }
        double dO = O();
        boolean z12 = d_() == 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j15 = (long) ((j12 - j10) / dO);
        if (z12) {
            j15 -= jElapsedRealtime - j11;
        }
        if (this.f7811o == this.f7812p) {
            if (!g(j15)) {
                return false;
            }
            a(gVar, i10, j14);
            f(j15);
            return true;
        }
        if (!(this.f7819w == -9223372036854775807L && j10 >= jQ && ((this.f7817u ? !this.f7815s : !(!z12 && !this.f7816t)) || (z12 && b(j15, jElapsedRealtime - this.C))))) {
            if (z12 && j10 != this.f7818v) {
                long jNanoTime = System.nanoTime();
                long jB = this.f7803g.b((j15 * 1000) + jNanoTime);
                long j16 = (jB - jNanoTime) / 1000;
                boolean z13 = this.f7819w != -9223372036854775807L;
                if (b(j16, j11, z11) && b(j10, z13)) {
                    return false;
                }
                if (a(j16, j11, z11)) {
                    if (z13) {
                        a(gVar, i10, j14);
                    } else {
                        b(gVar, i10, j14);
                    }
                    j15 = j16;
                } else {
                    j15 = j16;
                    if (ai.f7595a >= 21) {
                        if (j15 < 50000) {
                            hVar = this;
                            hVar.a(j14, jB, vVar);
                            j13 = jB;
                            hVar.a(gVar, i10, j14, j13);
                        }
                    } else if (j15 < 30000) {
                        if (j15 > 11000) {
                            try {
                                Thread.sleep((j15 - AbstractComponentTracker.LINGERING_TIMEOUT) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        a(j14, jB, vVar);
                        c(gVar, i10, j14);
                    }
                }
            }
            return false;
        }
        long jNanoTime2 = System.nanoTime();
        a(j14, jNanoTime2, vVar);
        if (ai.f7595a >= 21) {
            hVar = this;
            j13 = jNanoTime2;
            hVar.a(gVar, i10, j14, j13);
        } else {
            c(gVar, i10, j14);
        }
        f(j15);
        return true;
    }

    public boolean a(long j10, long j11, boolean z10) {
        return g(j10) && !z10;
    }

    @Override // com.applovin.exoplayer2.f.j
    public boolean a(com.applovin.exoplayer2.f.i iVar) {
        return this.f7811o != null || b(iVar);
    }

    @Override // com.applovin.exoplayer2.f.j
    @TargetApi(29)
    public void b(com.applovin.exoplayer2.c.g gVar) throws com.applovin.exoplayer2.p {
        if (this.f7810n) {
            ByteBuffer byteBuffer = (ByteBuffer) com.applovin.exoplayer2.l.a.b(gVar.f4755e);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4 && b12 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    a(G(), bArr);
                }
            }
        }
    }

    public void b(com.applovin.exoplayer2.f.g gVar, int i10, long j10) {
        ah.a("dropVideoBuffer");
        gVar.a(i10, false);
        ah.a();
        e(1);
    }

    public boolean b(long j10, long j11) {
        return g(j10) && j11 > 100000;
    }

    public boolean b(long j10, long j11, boolean z10) {
        return h(j10) && !z10;
    }

    public boolean b(long j10, boolean z10) throws com.applovin.exoplayer2.p {
        int iB = b(j10);
        if (iB == 0) {
            return false;
        }
        com.applovin.exoplayer2.c.e eVar = ((com.applovin.exoplayer2.f.j) this).f6249a;
        eVar.f4748i++;
        int i10 = this.A + iB;
        if (z10) {
            eVar.f4745f += i10;
        } else {
            e(i10);
        }
        K();
        return true;
    }

    public boolean b(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (h.class) {
            if (!f7799d) {
                f7800e = ab();
                f7799d = true;
            }
        }
        return f7800e;
    }

    public void c(com.applovin.exoplayer2.f.g gVar, int i10, long j10) {
        W();
        ah.a("releaseOutputBuffer");
        gVar.a(i10, true);
        ah.a();
        this.C = SystemClock.elapsedRealtime() * 1000;
        ((com.applovin.exoplayer2.f.j) this).f6249a.f4744e++;
        this.f7822z = 0;
        B();
    }

    @Override // com.applovin.exoplayer2.f.j
    public void d(long j10) {
        super.d(j10);
        if (this.K) {
            return;
        }
        this.A--;
    }

    public void e(int i10) {
        com.applovin.exoplayer2.c.e eVar = ((com.applovin.exoplayer2.f.j) this).f6249a;
        eVar.f4746g += i10;
        this.f7821y += i10;
        int i11 = this.f7822z + i10;
        this.f7822z = i11;
        eVar.f4747h = Math.max(i11, eVar.f4747h);
        int i12 = this.f7806j;
        if (i12 <= 0 || this.f7821y < i12) {
            return;
        }
        Y();
    }

    public void e(long j10) throws com.applovin.exoplayer2.p {
        c(j10);
        W();
        ((com.applovin.exoplayer2.f.j) this).f6249a.f4744e++;
        B();
        d(j10);
    }

    public void f(long j10) {
        ((com.applovin.exoplayer2.f.j) this).f6249a.a(j10);
        this.D += j10;
        this.E++;
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    public void p() {
        super.p();
        this.f7821y = 0;
        this.f7820x = SystemClock.elapsedRealtime();
        this.C = SystemClock.elapsedRealtime() * 1000;
        this.D = 0L;
        this.E = 0;
        this.f7803g.b();
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    public void q() {
        this.f7819w = -9223372036854775807L;
        Y();
        Z();
        this.f7803g.d();
        super.q();
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    public void r() {
        V();
        T();
        this.f7813q = false;
        this.f7803g.e();
        this.f7801b = null;
        try {
            super.r();
        } finally {
            this.f7804h.b(((com.applovin.exoplayer2.f.j) this).f6249a);
        }
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    @TargetApi(17)
    public void s() {
        d dVar;
        try {
            super.s();
            dVar = this.f7812p;
            if (dVar != null) {
                if (this.f7811o == dVar) {
                    this.f7811o = null;
                }
            }
        } finally {
            if (this.f7812p != null) {
                Surface surface = this.f7811o;
                dVar = this.f7812p;
                if (surface == dVar) {
                    this.f7811o = null;
                }
                dVar.release();
                this.f7812p = null;
            }
        }
    }

    @Override // com.applovin.exoplayer2.ar, com.applovin.exoplayer2.as
    public String y() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.ar
    public boolean z() {
        d dVar;
        if (super.z() && (this.f7815s || (((dVar = this.f7812p) != null && this.f7811o == dVar) || G() == null || this.K))) {
            this.f7819w = -9223372036854775807L;
            return true;
        }
        if (this.f7819w == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f7819w) {
            return true;
        }
        this.f7819w = -9223372036854775807L;
        return false;
    }
}
