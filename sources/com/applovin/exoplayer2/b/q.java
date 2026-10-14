package com.applovin.exoplayer2.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.applovin.exoplayer2.am;
import com.applovin.exoplayer2.ar;
import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.l.ai;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class q extends com.applovin.exoplayer2.f.j implements com.applovin.exoplayer2.l.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f4565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g.a f4566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f4567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f4568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f4569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.applovin.exoplayer2.v f4570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f4571h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f4572i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f4573j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f4574k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f4575l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ar.a f4576m;

    public final class a implements h.c {
        private a() {
        }

        @Override // com.applovin.exoplayer2.b.h.c
        public void a() {
            q.this.B();
        }

        @Override // com.applovin.exoplayer2.b.h.c
        public void a(int i10, long j10, long j11) {
            q.this.f4566c.a(i10, j10, j11);
        }

        @Override // com.applovin.exoplayer2.b.h.c
        public void a(long j10) {
            q.this.f4566c.a(j10);
        }

        @Override // com.applovin.exoplayer2.b.h.c
        public void a(Exception exc) {
            com.applovin.exoplayer2.l.q.c("MediaCodecAudioRenderer", "Audio sink error", exc);
            q.this.f4566c.a(exc);
        }

        @Override // com.applovin.exoplayer2.b.h.c
        public void a(boolean z10) {
            q.this.f4566c.a(z10);
        }

        @Override // com.applovin.exoplayer2.b.h.c
        public void b() {
            if (q.this.f4576m != null) {
                q.this.f4576m.a();
            }
        }

        @Override // com.applovin.exoplayer2.b.h.c
        public void b(long j10) {
            if (q.this.f4576m != null) {
                q.this.f4576m.a(j10);
            }
        }
    }

    public q(Context context, com.applovin.exoplayer2.f.g.b bVar, com.applovin.exoplayer2.f.k kVar, boolean z10, Handler handler, g gVar, h hVar) {
        super(1, bVar, kVar, z10, 44100.0f);
        this.f4565b = context.getApplicationContext();
        this.f4567d = hVar;
        this.f4566c = new g.a(handler, gVar);
        hVar.a(new a());
    }

    public q(Context context, com.applovin.exoplayer2.f.k kVar, boolean z10, Handler handler, g gVar, h hVar) {
        this(context, com.applovin.exoplayer2.f.g.b.f6234a, kVar, z10, handler, gVar, hVar);
    }

    private void R() {
        long jA = this.f4567d.a(A());
        if (jA != Long.MIN_VALUE) {
            if (!this.f4573j) {
                jA = Math.max(this.f4571h, jA);
            }
            this.f4571h = jA;
            this.f4573j = false;
        }
    }

    private static boolean S() {
        if (ai.f7595a == 23) {
            String str = ai.f7598d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private int a(com.applovin.exoplayer2.f.i iVar, com.applovin.exoplayer2.v vVar) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(iVar.f6237a) || (i10 = ai.f7595a) >= 24 || (i10 == 23 && ai.c(this.f4565b))) {
            return vVar.f8199m;
        }
        return -1;
    }

    private static boolean b(String str) {
        if (ai.f7595a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(ai.f7597c)) {
            String str2 = ai.f7596b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.ar
    public boolean A() {
        return super.A() && this.f4567d.d();
    }

    public void B() {
        this.f4573j = true;
    }

    @Override // com.applovin.exoplayer2.f.j
    public void C() {
        super.C();
        this.f4567d.b();
    }

    @Override // com.applovin.exoplayer2.f.j
    public void D() throws com.applovin.exoplayer2.p {
        try {
            this.f4567d.c();
        } catch (h.e e10) {
            throw a(e10, e10.f4458c, e10.f4457b, 5002);
        }
    }

    @Override // com.applovin.exoplayer2.f.j
    public float a(float f10, com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.v[] vVarArr) {
        int iMax = -1;
        for (com.applovin.exoplayer2.v vVar2 : vVarArr) {
            int i10 = vVar2.f8212z;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f10 * iMax;
    }

    public int a(com.applovin.exoplayer2.f.i iVar, com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.v[] vVarArr) {
        int iA = a(iVar, vVar);
        if (vVarArr.length == 1) {
            return iA;
        }
        for (com.applovin.exoplayer2.v vVar2 : vVarArr) {
            if (iVar.a(vVar, vVar2).f4763d != 0) {
                iA = Math.max(iA, a(iVar, vVar2));
            }
        }
        return iA;
    }

    @Override // com.applovin.exoplayer2.f.j
    public int a(com.applovin.exoplayer2.f.k kVar, com.applovin.exoplayer2.v vVar) throws com.applovin.exoplayer2.f.l.b {
        if (!com.applovin.exoplayer2.l.u.a(vVar.f8198l)) {
            return as.b(0);
        }
        int i10 = ai.f7595a >= 21 ? 32 : 0;
        boolean z10 = vVar.E != 0;
        boolean zC = com.applovin.exoplayer2.f.j.c(vVar);
        int i11 = 8;
        if (zC && this.f4567d.a(vVar) && (!z10 || com.applovin.exoplayer2.f.l.a() != null)) {
            return as.a(4, 8, i10);
        }
        if ((!"audio/raw".equals(vVar.f8198l) || this.f4567d.a(vVar)) && this.f4567d.a(ai.b(2, vVar.f8211y, vVar.f8212z))) {
            List<com.applovin.exoplayer2.f.i> listA = a(kVar, vVar, false);
            if (listA.isEmpty()) {
                return as.b(1);
            }
            if (!zC) {
                return as.b(2);
            }
            com.applovin.exoplayer2.f.i iVar = listA.get(0);
            boolean zA = iVar.a(vVar);
            if (zA && iVar.c(vVar)) {
                i11 = 16;
            }
            return as.a(zA ? 4 : 3, i11, i10);
        }
        return as.b(1);
    }

    @SuppressLint({"InlinedApi"})
    public MediaFormat a(com.applovin.exoplayer2.v vVar, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", vVar.f8211y);
        mediaFormat.setInteger("sample-rate", vVar.f8212z);
        com.applovin.exoplayer2.l.t.a(mediaFormat, vVar.f8200n);
        com.applovin.exoplayer2.l.t.a(mediaFormat, "max-input-size", i10);
        int i11 = ai.f7595a;
        if (i11 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f && !S()) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (i11 <= 28 && "audio/ac4".equals(vVar.f8198l)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i11 >= 24 && this.f4567d.b(ai.b(4, vVar.f8211y, vVar.f8212z)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        return mediaFormat;
    }

    @Override // com.applovin.exoplayer2.f.j
    public com.applovin.exoplayer2.c.h a(com.applovin.exoplayer2.f.i iVar, com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.v vVar2) {
        com.applovin.exoplayer2.c.h hVarA = iVar.a(vVar, vVar2);
        int i10 = hVarA.f4764e;
        if (a(iVar, vVar2) > this.f4568e) {
            i10 |= 64;
        }
        int i11 = i10;
        return new com.applovin.exoplayer2.c.h(iVar.f6237a, vVar, vVar2, i11 != 0 ? 0 : hVarA.f4763d, i11);
    }

    @Override // com.applovin.exoplayer2.f.j
    public com.applovin.exoplayer2.c.h a(com.applovin.exoplayer2.w wVar) throws com.applovin.exoplayer2.p {
        com.applovin.exoplayer2.c.h hVarA = super.a(wVar);
        this.f4566c.a(wVar.f8240b, hVarA);
        return hVarA;
    }

    @Override // com.applovin.exoplayer2.f.j
    public com.applovin.exoplayer2.f.g.a a(com.applovin.exoplayer2.f.i iVar, com.applovin.exoplayer2.v vVar, MediaCrypto mediaCrypto, float f10) {
        this.f4568e = a(iVar, vVar, u());
        this.f4569f = b(iVar.f6237a);
        MediaFormat mediaFormatA = a(vVar, iVar.f6239c, this.f4568e, f10);
        this.f4570g = "audio/raw".equals(iVar.f6238b) && !"audio/raw".equals(vVar.f8198l) ? vVar : null;
        return com.applovin.exoplayer2.f.g.a.a(iVar, mediaFormatA, vVar, mediaCrypto);
    }

    @Override // com.applovin.exoplayer2.f.j
    public List<com.applovin.exoplayer2.f.i> a(com.applovin.exoplayer2.f.k kVar, com.applovin.exoplayer2.v vVar, boolean z10) throws com.applovin.exoplayer2.f.l.b {
        com.applovin.exoplayer2.f.i iVarA;
        String str = vVar.f8198l;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.f4567d.a(vVar) && (iVarA = com.applovin.exoplayer2.f.l.a()) != null) {
            return Collections.singletonList(iVarA);
        }
        List<com.applovin.exoplayer2.f.i> listA = com.applovin.exoplayer2.f.l.a(kVar.getDecoderInfos(str, z10, false), vVar);
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList = new ArrayList(listA);
            arrayList.addAll(kVar.getDecoderInfos("audio/eac3", z10, false));
            listA = arrayList;
        }
        return Collections.unmodifiableList(listA);
    }

    @Override // com.applovin.exoplayer2.e, com.applovin.exoplayer2.ao.b
    public void a(int i10, Object obj) throws com.applovin.exoplayer2.p {
        if (i10 == 2) {
            this.f4567d.a(((Float) obj).floatValue());
        }
        if (i10 == 3) {
            this.f4567d.a((d) obj);
            return;
        }
        if (i10 == 6) {
            this.f4567d.a((k) obj);
            return;
        }
        switch (i10) {
            case 9:
                this.f4567d.b(((Boolean) obj).booleanValue());
                break;
            case 10:
                this.f4567d.a(((Integer) obj).intValue());
                break;
            case 11:
                this.f4576m = (ar.a) obj;
                break;
            default:
                super.a(i10, obj);
                break;
        }
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    public void a(long j10, boolean z10) throws com.applovin.exoplayer2.p {
        super.a(j10, z10);
        if (this.f4575l) {
            this.f4567d.k();
        } else {
            this.f4567d.j();
        }
        this.f4571h = j10;
        this.f4572i = true;
        this.f4573j = true;
    }

    @Override // com.applovin.exoplayer2.l.s
    public void a(am amVar) {
        this.f4567d.a(amVar);
    }

    @Override // com.applovin.exoplayer2.f.j
    public void a(com.applovin.exoplayer2.c.g gVar) {
        if (!this.f4572i || gVar.b()) {
            return;
        }
        if (Math.abs(gVar.f4754d - this.f4571h) > 500000) {
            this.f4571h = gVar.f4754d;
        }
        this.f4572i = false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    @Override // com.applovin.exoplayer2.f.j
    public void a(com.applovin.exoplayer2.v vVar, MediaFormat mediaFormat) throws com.applovin.exoplayer2.p {
        int iC;
        int i10;
        com.applovin.exoplayer2.v vVar2 = this.f4570g;
        int[] iArr = null;
        if (vVar2 != null) {
            vVar = vVar2;
        } else if (G() != null) {
            if ("audio/raw".equals(vVar.f8198l)) {
                iC = vVar.A;
            } else if (ai.f7595a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                iC = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                iC = ai.c(mediaFormat.getInteger("v-bits-per-sample"));
            } else if ("audio/raw".equals(vVar.f8198l)) {
                iC = vVar.A;
            } else {
                iC = 2;
            }
            com.applovin.exoplayer2.v vVarA = new com.applovin.exoplayer2.v.a().f("audio/raw").m(iC).n(vVar.B).o(vVar.C).k(mediaFormat.getInteger("channel-count")).l(mediaFormat.getInteger("sample-rate")).a();
            if (this.f4569f && vVarA.f8211y == 6 && (i10 = vVar.f8211y) < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < vVar.f8211y; i11++) {
                    iArr[i11] = i11;
                }
            }
            vVar = vVarA;
        }
        try {
            this.f4567d.a(vVar, 0, iArr);
        } catch (h.a e10) {
            throw a(e10, e10.f4450a, 5001);
        }
    }

    @Override // com.applovin.exoplayer2.f.j
    public void a(Exception exc) {
        com.applovin.exoplayer2.l.q.c("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f4566c.b(exc);
    }

    @Override // com.applovin.exoplayer2.f.j
    public void a(String str) {
        this.f4566c.a(str);
    }

    @Override // com.applovin.exoplayer2.f.j
    public void a(String str, long j10, long j11) {
        this.f4566c.a(str, j10, j11);
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    public void a(boolean z10, boolean z11) throws com.applovin.exoplayer2.p {
        super.a(z10, z11);
        this.f4566c.a(((com.applovin.exoplayer2.f.j) this).f6249a);
        if (v().f4295b) {
            this.f4567d.g();
        } else {
            this.f4567d.h();
        }
    }

    @Override // com.applovin.exoplayer2.f.j
    public boolean a(long j10, long j11, com.applovin.exoplayer2.f.g gVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, com.applovin.exoplayer2.v vVar) throws com.applovin.exoplayer2.p {
        com.applovin.exoplayer2.l.a.b(byteBuffer);
        if (this.f4570g != null && (i11 & 2) != 0) {
            ((com.applovin.exoplayer2.f.g) com.applovin.exoplayer2.l.a.b(gVar)).a(i10, false);
            return true;
        }
        if (z10) {
            if (gVar != null) {
                gVar.a(i10, false);
            }
            ((com.applovin.exoplayer2.f.j) this).f6249a.f4745f += i12;
            this.f4567d.b();
            return true;
        }
        try {
            if (!this.f4567d.a(byteBuffer, j12, i12)) {
                return false;
            }
            if (gVar != null) {
                gVar.a(i10, false);
            }
            ((com.applovin.exoplayer2.f.j) this).f6249a.f4744e += i12;
            return true;
        } catch (h.b e10) {
            throw a(e10, e10.f4453c, e10.f4452b, 5001);
        } catch (h.e e11) {
            throw a(e11, vVar, e11.f4457b, 5002);
        }
    }

    @Override // com.applovin.exoplayer2.f.j
    public boolean b(com.applovin.exoplayer2.v vVar) {
        return this.f4567d.a(vVar);
    }

    @Override // com.applovin.exoplayer2.e, com.applovin.exoplayer2.ar
    public com.applovin.exoplayer2.l.s c() {
        return this;
    }

    @Override // com.applovin.exoplayer2.l.s
    public long c_() {
        if (d_() == 2) {
            R();
        }
        return this.f4571h;
    }

    @Override // com.applovin.exoplayer2.l.s
    public am d() {
        return this.f4567d.f();
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    public void p() {
        super.p();
        this.f4567d.a();
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    public void q() {
        R();
        this.f4567d.i();
        super.q();
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    public void r() {
        this.f4574k = true;
        try {
            this.f4567d.j();
            try {
                super.r();
            } finally {
                this.f4566c.b(((com.applovin.exoplayer2.f.j) this).f6249a);
            }
        } catch (Throwable th) {
            try {
                super.r();
                throw th;
            } finally {
                this.f4566c.b(((com.applovin.exoplayer2.f.j) this).f6249a);
            }
        }
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.e
    public void s() {
        try {
            super.s();
        } finally {
            if (this.f4574k) {
                this.f4574k = false;
                this.f4567d.l();
            }
        }
    }

    @Override // com.applovin.exoplayer2.ar, com.applovin.exoplayer2.as
    public String y() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.applovin.exoplayer2.f.j, com.applovin.exoplayer2.ar
    public boolean z() {
        return this.f4567d.e() || super.z();
    }
}
