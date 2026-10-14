package com.yandex.mobile.ads.impl;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
final class cc extends w51 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f19441e = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f19442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19444d;

    public cc(j71 j71Var) {
        super(j71Var);
    }

    public final boolean a(long j10, mp0 mp0Var) throws qp0 {
        if (this.f19444d == 2) {
            int iA = mp0Var.a();
            this.f26180a.a(iA, mp0Var);
            this.f26180a.a(j10, 1, iA, 0, null);
            return true;
        }
        int iT = mp0Var.t();
        if (iT != 0 || this.f19443c) {
            if (this.f19444d == 10 && iT != 1) {
                return false;
            }
            int iA2 = mp0Var.a();
            this.f26180a.a(iA2, mp0Var);
            this.f26180a.a(j10, 1, iA2, 0, null);
            return true;
        }
        int iA3 = mp0Var.a();
        byte[] bArr = new byte[iA3];
        mp0Var.a(bArr, 0, iA3);
        d.a aVarA = d.a(new lp0(iA3, bArr), false);
        this.f26180a.a(new yv.a().f("audio/mp4a-latm").a(aVarA.f19687c).c(aVarA.f19686b).n(aVarA.f19685a).a(Collections.singletonList(bArr)).a());
        this.f19443c = true;
        return false;
    }

    public final boolean a(mp0 mp0Var) throws w51.a {
        yv.a aVarN;
        if (this.f19442b) {
            mp0Var.f(1);
        } else {
            int iT = mp0Var.t();
            int i10 = (iT >> 4) & 15;
            this.f19444d = i10;
            if (i10 == 2) {
                aVarN = new yv.a().f("audio/mpeg").c(1).n(f19441e[(iT >> 2) & 3]);
            } else {
                if (i10 == 7 || i10 == 8) {
                    aVarN = new yv.a().f(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").c(1).n(8000);
                } else if (i10 != 10) {
                    StringBuilder sbA = v60.a("Audio format not supported: ");
                    sbA.append(this.f19444d);
                    throw new w51.a(sbA.toString());
                }
                this.f19442b = true;
            }
            this.f26180a.a(aVarN.a());
            this.f19443c = true;
            this.f19442b = true;
        }
        return true;
    }
}
