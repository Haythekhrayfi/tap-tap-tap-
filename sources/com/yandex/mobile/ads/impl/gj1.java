package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class gj1 extends t11 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final mp0 f21085m = new mp0();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final cj1 f21086n = new cj1();

    @Override // com.yandex.mobile.ads.impl.t11
    public final h51 a(byte[] bArr, int i10, boolean z10) throws j51 {
        ej1 ej1VarA;
        this.f21085m.a(i10, bArr);
        ArrayList arrayList = new ArrayList();
        try {
            hj1.a(this.f21085m);
            while (!TextUtils.isEmpty(this.f21085m.j())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                mp0 mp0Var = this.f21085m;
                int iD = 0;
                byte b10 = -1;
                while (b10 == -1) {
                    iD = mp0Var.d();
                    String strJ = mp0Var.j();
                    if (strJ == null) {
                        b10 = 0;
                    } else if ("STYLE".equals(strJ)) {
                        b10 = 2;
                    } else {
                        b10 = strJ.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                    }
                }
                mp0Var.e(iD);
                if (b10 == 0) {
                    return new ij1(arrayList2);
                }
                if (b10 == 1) {
                    while (!TextUtils.isEmpty(this.f21085m.j())) {
                    }
                } else if (b10 == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new j51("A style block was found after the first cue.");
                    }
                    this.f21085m.j();
                    arrayList.addAll(this.f21086n.a(this.f21085m));
                } else if (b10 == 3 && (ej1VarA = fj1.a(this.f21085m, arrayList)) != null) {
                    arrayList2.add(ej1VarA);
                }
            }
        } catch (qp0 e10) {
            throw new j51(e10);
        }
    }
}
