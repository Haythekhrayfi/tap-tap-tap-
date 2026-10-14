package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class fb0 extends kb0 implements db0 {
    private static final gb0 S0 = ot0.d();
    private final Context H0;
    private final ac.a I0;
    private final bc J0;
    private int K0;
    private boolean L0;
    private yv M0;
    private long N0;
    private boolean O0;
    private boolean P0;
    private boolean Q0;
    private pv0.a R0;

    public final class a implements bc.c {
        private a() {
        }

        public /* synthetic */ a(fb0 fb0Var, int i10) {
            this();
        }
    }

    public fb0(Context context, go goVar, mb0 mb0Var, Handler handler, ac acVar, nn nnVar) {
        super(1, goVar, mb0Var, 44100.0f);
        this.H0 = context.getApplicationContext();
        this.J0 = nnVar;
        this.I0 = new ac.a(handler, acVar);
        nnVar.a(new a(this, 0));
    }

    private int a(yv yvVar, ib0 ib0Var) {
        int i10;
        if (!S0.f().equals(ib0Var.f21667a) || (i10 = da1.f19803a) >= 24 || (i10 == 23 && da1.d(this.H0))) {
            return yvVar.f27116m;
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.kb0
    public final void J() {
        this.J0.f();
    }

    @Override // com.yandex.mobile.ads.impl.kb0
    public final void M() throws ns {
        try {
            this.J0.c();
        } catch (bc.e e10) {
            throw a(5002, e10.f19169c, e10, e10.f19168b);
        }
    }

    public final void R() {
        this.P0 = true;
    }

    @Override // com.yandex.mobile.ads.impl.kb0
    public final float a(float f10, yv[] yvVarArr) {
        int iMax = -1;
        for (yv yvVar : yvVarArr) {
            int i10 = yvVar.f27129z;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f10 * iMax;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cb  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if ((r4.isEmpty() ? null : r4.get(0)) != null) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.kb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.yandex.mobile.ads.impl.mb0 r13, com.yandex.mobile.ads.impl.yv r14) throws com.yandex.mobile.ads.impl.nb0.b {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.fb0.a(com.yandex.mobile.ads.impl.mb0, com.yandex.mobile.ads.impl.yv):int");
    }

    @Override // com.yandex.mobile.ads.impl.kb0
    public final cn a(ib0 ib0Var, yv yvVar, yv yvVar2) {
        cn cnVarA = ib0Var.a(yvVar, yvVar2);
        int i10 = cnVarA.f19561e;
        if (a(yvVar2, ib0Var) > this.K0) {
            i10 |= 64;
        }
        int i11 = i10;
        return new cn(ib0Var.f21667a, yvVar, yvVar2, i11 != 0 ? 0 : cnVarA.f19560d, i11);
    }

    @Override // com.yandex.mobile.ads.impl.kb0
    public final cn a(zv zvVar) throws ns {
        cn cnVarA = super.a(zvVar);
        this.I0.a(zvVar.f27433b, cnVarA);
        return cnVarA;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d9  */
    @Override // com.yandex.mobile.ads.impl.kb0
    public final eb0.a a(ib0 ib0Var, yv yvVar, MediaCrypto mediaCrypto, float f10) {
        boolean z10;
        boolean z11;
        yv[] yvVarArrS = s();
        int iA = a(yvVar, ib0Var);
        boolean z12 = false;
        if (yvVarArrS.length != 1) {
            for (yv yvVar2 : yvVarArrS) {
                if (ib0Var.a(yvVar, yvVar2).f19560d != 0) {
                    iA = Math.max(iA, a(yvVar2, ib0Var));
                }
            }
        }
        this.K0 = iA;
        String str = ib0Var.f21667a;
        int i10 = da1.f19803a;
        if (i10 < 24) {
            gb0 gb0Var = S0;
            if (gb0Var.e().equals(str) && gb0Var.g().equals(da1.f19805c)) {
                String str2 = da1.f19804b;
                if (str2.startsWith(gb0Var.i()) || str2.startsWith(gb0Var.c()) || str2.startsWith(gb0Var.d())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.L0 = z10;
        String str3 = ib0Var.f21669c;
        int i11 = this.K0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        mediaFormat.setInteger("channel-count", yvVar.f27128y);
        mediaFormat.setInteger("sample-rate", yvVar.f27129z);
        List<byte[]> list = yvVar.f27117n;
        for (int i12 = 0; i12 < list.size(); i12++) {
            mediaFormat.setByteBuffer(u60.a("csd-", i12), ByteBuffer.wrap(list.get(i12)));
        }
        ac0.a(mediaFormat, "max-input-size", i11);
        if (i10 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                if (i10 == 23) {
                    gb0 gb0Var2 = S0;
                    String strH = gb0Var2.h();
                    String str4 = da1.f19806d;
                    if (strH.equals(str4) || gb0Var2.a().equals(str4)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
                if (!z11) {
                    mediaFormat.setFloat("operating-rate", f10);
                }
            }
        }
        if (i10 <= 28 && "audio/ac4".equals(yvVar.f27115l)) {
            mediaFormat.setInteger(S0.b(), 1);
        }
        if (i10 >= 24) {
            if (this.J0.b(new yv.a().f("audio/raw").c(yvVar.f27128y).n(yvVar.f27129z).j(4).a()) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        if (i10 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if ("audio/raw".equals(ib0Var.f21668b) && !"audio/raw".equals(yvVar.f27115l)) {
            z12 = true;
        }
        this.M0 = z12 ? yvVar : null;
        return eb0.a.a(ib0Var, mediaFormat, yvVar, mediaCrypto);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    @Override // com.yandex.mobile.ads.impl.kb0
    public final ArrayList a(mb0 mb0Var, yv yvVar, boolean z10) throws nb0.b {
        List<ib0> listA;
        String strA;
        com.yandex.mobile.ads.embedded.guava.collect.p pVarA;
        bc bcVar = this.J0;
        String str = yvVar.f27115l;
        if (str == null) {
            pVarA = com.yandex.mobile.ads.embedded.guava.collect.p.i();
        } else if (bcVar.a(yvVar)) {
            List<ib0> listA2 = nb0.a("audio/raw", false, false);
            ib0 ib0Var = listA2.isEmpty() ? null : listA2.get(0);
            if (ib0Var != null) {
                pVarA = com.yandex.mobile.ads.embedded.guava.collect.p.a(ib0Var);
            } else {
                listA = mb0Var.a(str, z10, false);
                strA = nb0.a(yvVar);
                if (strA == null) {
                    pVarA = com.yandex.mobile.ads.embedded.guava.collect.p.a((Collection) listA);
                } else {
                    List<ib0> listA3 = mb0Var.a(strA, z10, false);
                    int i10 = com.yandex.mobile.ads.embedded.guava.collect.p.f18374c;
                    pVarA = new com.yandex.mobile.ads.embedded.guava.collect.p.a().b((List) listA).b((List) listA3).a();
                }
            }
        } else {
            listA = mb0Var.a(str, z10, false);
            strA = nb0.a(yvVar);
            if (strA == null) {
                pVarA = com.yandex.mobile.ads.embedded.guava.collect.p.a((Collection) listA);
            } else {
                List<ib0> listA4 = mb0Var.a(strA, z10, false);
                int i11 = com.yandex.mobile.ads.embedded.guava.collect.p.f18374c;
                pVarA = new com.yandex.mobile.ads.embedded.guava.collect.p.a().b((List) listA).b((List) listA4).a();
            }
        }
        return nb0.a(pVarA, yvVar);
    }

    @Override // com.yandex.mobile.ads.impl.me, com.yandex.mobile.ads.impl.hr0.b
    public final void a(int i10, Object obj) throws ns {
        if (i10 == 2) {
            this.J0.setVolume(((Float) obj).floatValue());
        }
        if (i10 == 3) {
            this.J0.a((ub) obj);
            return;
        }
        if (i10 == 6) {
            this.J0.a((oc) obj);
            return;
        }
        switch (i10) {
            case 9:
                this.J0.b(((Boolean) obj).booleanValue());
                break;
            case 10:
                this.J0.a(((Integer) obj).intValue());
                break;
            case 11:
                this.R0 = (pv0.a) obj;
                break;
        }
    }

    @Override // com.yandex.mobile.ads.impl.kb0, com.yandex.mobile.ads.impl.me
    public final void a(long j10, boolean z10) throws ns {
        super.a(j10, z10);
        this.J0.flush();
        this.N0 = j10;
        this.O0 = true;
        this.P0 = true;
    }

    @Override // com.yandex.mobile.ads.impl.kb0
    public final void a(yv yvVar, MediaFormat mediaFormat) throws ns {
        int iB;
        int i10;
        yv yvVar2 = this.M0;
        int[] iArr = null;
        if (yvVar2 != null) {
            yvVar = yvVar2;
        } else if (C() != null) {
            if ("audio/raw".equals(yvVar.f27115l)) {
                iB = yvVar.A;
            } else if (da1.f19803a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iB = mediaFormat.containsKey("v-bits-per-sample") ? da1.b(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iB = mediaFormat.getInteger("pcm-encoding");
            }
            yv yvVarA = new yv.a().f("audio/raw").j(iB).e(yvVar.B).f(yvVar.C).c(mediaFormat.getInteger("channel-count")).n(mediaFormat.getInteger("sample-rate")).a();
            if (this.L0 && yvVarA.f27128y == 6 && (i10 = yvVar.f27128y) < 6) {
                int[] iArr2 = new int[i10];
                for (int i11 = 0; i11 < yvVar.f27128y; i11++) {
                    iArr2[i11] = i11;
                }
                iArr = iArr2;
            }
            yvVar = yvVarA;
        }
        try {
            this.J0.a(yvVar, iArr);
        } catch (bc.a e10) {
            throw a(e10, e10.f19163a, 5001);
        }
    }

    @Override // com.yandex.mobile.ads.impl.db0
    public final void a(zq0 zq0Var) {
        this.J0.a(zq0Var);
    }

    @Override // com.yandex.mobile.ads.impl.kb0
    public final void a(Exception exc) {
        p90.a("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.I0.a(exc);
    }

    @Override // com.yandex.mobile.ads.impl.kb0
    public final void a(String str) {
        this.I0.a(str);
    }

    @Override // com.yandex.mobile.ads.impl.kb0
    public final void a(String str, long j10, long j11) {
        this.I0.a(str, j10, j11);
    }

    @Override // com.yandex.mobile.ads.impl.kb0, com.yandex.mobile.ads.impl.me
    public final void a(boolean z10, boolean z11) throws ns {
        super.a(z10, z11);
        this.I0.b(this.B0);
        if (p().f24877a) {
            this.J0.b();
        } else {
            this.J0.e();
        }
        this.J0.a(r());
    }

    @Override // com.yandex.mobile.ads.impl.kb0, com.yandex.mobile.ads.impl.pv0
    public final boolean a() {
        return super.a() && this.J0.a();
    }

    @Override // com.yandex.mobile.ads.impl.kb0
    public final boolean a(long j10, long j11, eb0 eb0Var, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, yv yvVar) throws ns {
        Objects.requireNonNull(byteBuffer);
        if (this.M0 != null && (i11 & 2) != 0) {
            Objects.requireNonNull(eb0Var);
            eb0Var.a(false, i10);
            return true;
        }
        if (z10) {
            if (eb0Var != null) {
                eb0Var.a(false, i10);
            }
            this.B0.f26883f += i12;
            this.J0.f();
            return true;
        }
        try {
            if (!this.J0.a(byteBuffer, j12, i12)) {
                return false;
            }
            if (eb0Var != null) {
                eb0Var.a(false, i10);
            }
            this.B0.f26882e += i12;
            return true;
        } catch (bc.b e10) {
            throw a(5001, e10.f19166c, e10, e10.f19165b);
        } catch (bc.e e11) {
            throw a(5002, yvVar, e11, e11.f19168b);
        }
    }

    @Override // com.yandex.mobile.ads.impl.kb0
    public final void b(an anVar) {
        if (!this.O0 || anVar.e()) {
            return;
        }
        if (Math.abs(anVar.f19006e - this.N0) > 500000) {
            this.N0 = anVar.f19006e;
        }
        this.O0 = false;
    }

    @Override // com.yandex.mobile.ads.impl.kb0
    public final boolean b(yv yvVar) {
        return this.J0.a(yvVar);
    }

    @Override // com.yandex.mobile.ads.impl.kb0, com.yandex.mobile.ads.impl.pv0
    public final boolean d() {
        return this.J0.d() || super.d();
    }

    @Override // com.yandex.mobile.ads.impl.pv0, com.yandex.mobile.ads.impl.qv0
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.yandex.mobile.ads.impl.db0
    public final zq0 getPlaybackParameters() {
        return this.J0.getPlaybackParameters();
    }

    @Override // com.yandex.mobile.ads.impl.me, com.yandex.mobile.ads.impl.pv0
    public final db0 l() {
        return this;
    }

    @Override // com.yandex.mobile.ads.impl.db0
    public final long o() {
        if (c() == 2) {
            long jA = this.J0.a(a());
            if (jA != Long.MIN_VALUE) {
                if (!this.P0) {
                    jA = Math.max(this.N0, jA);
                }
                this.N0 = jA;
                this.P0 = false;
            }
        }
        return this.N0;
    }

    @Override // com.yandex.mobile.ads.impl.kb0, com.yandex.mobile.ads.impl.me
    public final void u() {
        this.Q0 = true;
        try {
            this.J0.flush();
            try {
                super.u();
            } finally {
                this.I0.a(this.B0);
            }
        } catch (Throwable th) {
            try {
                super.u();
                throw th;
            } finally {
                this.I0.a(this.B0);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.kb0, com.yandex.mobile.ads.impl.me
    public final void v() {
        try {
            super.v();
        } finally {
            if (this.Q0) {
                this.Q0 = false;
                this.J0.reset();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.me
    public final void w() {
        this.J0.play();
    }

    @Override // com.yandex.mobile.ads.impl.me
    public final void x() {
        long jA = this.J0.a(a());
        if (jA != Long.MIN_VALUE) {
            if (!this.P0) {
                jA = Math.max(this.N0, jA);
            }
            this.N0 = jA;
            this.P0 = false;
        }
        this.J0.pause();
    }
}
