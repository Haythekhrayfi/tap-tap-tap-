package com.applovin.exoplayer2.m;

import com.applovin.exoplayer2.l.y;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7768c;

    private c(int i10, int i11, String str) {
        this.f7766a = i10;
        this.f7767b = i11;
        this.f7768c = str;
    }

    public static c a(y yVar) {
        String str;
        yVar.e(2);
        int iH = yVar.h();
        int i10 = iH >> 1;
        int iH2 = ((yVar.h() >> 3) & 31) | ((iH & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else {
            if (i10 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i10);
        sb2.append(iH2 >= 10 ? "." : ".0");
        sb2.append(iH2);
        return new c(i10, iH2, sb2.toString());
    }
}
