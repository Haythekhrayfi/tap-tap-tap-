package com.applovin.exoplayer2.e.c;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
final class a extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f5265b = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f5268e;

    public a(x xVar) {
        super(xVar);
    }

    @Override // com.applovin.exoplayer2.e.c.d
    public boolean a(y yVar) throws d.a {
        v.a aVarL;
        if (this.f5266c) {
            yVar.e(1);
        } else {
            int iH = yVar.h();
            int i10 = (iH >> 4) & 15;
            this.f5268e = i10;
            if (i10 == 2) {
                aVarL = new v.a().f("audio/mpeg").k(1).l(f5265b[(iH >> 2) & 3]);
            } else {
                if (i10 == 7 || i10 == 8) {
                    aVarL = new v.a().f(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").k(1).l(8000);
                } else if (i10 != 10) {
                    StringBuilder sbA = defpackage.a.a("Audio format not supported: ");
                    sbA.append(this.f5268e);
                    throw new d.a(sbA.toString());
                }
                this.f5266c = true;
            }
            this.f5289a.a(aVarL.a());
            this.f5267d = true;
            this.f5266c = true;
        }
        return true;
    }

    @Override // com.applovin.exoplayer2.e.c.d
    public boolean a(y yVar, long j10) throws ai {
        if (this.f5268e == 2) {
            int iA = yVar.a();
            this.f5289a.a(yVar, iA);
            this.f5289a.a(j10, 1, iA, 0, null);
            return true;
        }
        int iH = yVar.h();
        if (iH != 0 || this.f5267d) {
            if (this.f5268e == 10 && iH != 1) {
                return false;
            }
            int iA2 = yVar.a();
            this.f5289a.a(yVar, iA2);
            this.f5289a.a(j10, 1, iA2, 0, null);
            return true;
        }
        int iA3 = yVar.a();
        byte[] bArr = new byte[iA3];
        yVar.a(bArr, 0, iA3);
        com.applovin.exoplayer2.b.a.C0073a c0073aA = com.applovin.exoplayer2.b.a.a(bArr);
        this.f5289a.a(new v.a().f("audio/mp4a-latm").d(c0073aA.f4384c).k(c0073aA.f4383b).l(c0073aA.f4382a).a(Collections.singletonList(bArr)).a());
        this.f5267d = true;
        return false;
    }
}
