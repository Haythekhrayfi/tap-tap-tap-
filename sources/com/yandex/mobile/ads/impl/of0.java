package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class of0 extends t11 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final mp0 f23782m = new mp0();

    @Override // com.yandex.mobile.ads.impl.t11
    public final h51 a(byte[] bArr, int i10, boolean z10) throws j51 {
        am.a aVarA;
        this.f23782m.a(i10, bArr);
        ArrayList arrayList = new ArrayList();
        while (this.f23782m.a() > 0) {
            if (this.f23782m.a() < 8) {
                throw new j51("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iH = this.f23782m.h();
            if (this.f23782m.h() == 1987343459) {
                mp0 mp0Var = this.f23782m;
                int i11 = iH - 8;
                CharSequence charSequenceA = null;
                am.a aVarA2 = null;
                while (i11 > 0) {
                    if (i11 < 8) {
                        throw new j51("Incomplete vtt cue box header found.");
                    }
                    int iH2 = mp0Var.h();
                    int iH3 = mp0Var.h();
                    int i12 = iH2 - 8;
                    String strA = da1.a(mp0Var.c(), mp0Var.d(), i12);
                    mp0Var.f(i12);
                    i11 = (i11 - 8) - i12;
                    if (iH3 == 1937011815) {
                        aVarA2 = fj1.a(strA);
                    } else if (iH3 == 1885436268) {
                        charSequenceA = fj1.a(null, strA.trim(), Collections.emptyList());
                    }
                }
                if (charSequenceA == null) {
                    charSequenceA = "";
                }
                if (aVarA2 != null) {
                    aVarA = aVarA2.a(charSequenceA);
                } else {
                    Pattern pattern = fj1.f20722a;
                    fj1.d dVar = new fj1.d();
                    dVar.f20737c = charSequenceA;
                    aVarA = dVar.a();
                }
                arrayList.add(aVarA.a());
            } else {
                this.f23782m.f(iH - 8);
            }
        }
        return new pf0(arrayList);
    }
}
