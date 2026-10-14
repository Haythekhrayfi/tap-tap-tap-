package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class pq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24225a;

    private pq(String str) {
        this.f24225a = str;
    }

    public static pq a(mp0 mp0Var) {
        String str;
        mp0Var.f(2);
        int iT = mp0Var.t();
        int i10 = iT >> 1;
        int iT2 = ((mp0Var.t() >> 3) & 31) | ((iT & 1) << 5);
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
        sb2.append(iT2 >= 10 ? "." : ".0");
        sb2.append(iT2);
        return new pq(sb2.toString());
    }
}
