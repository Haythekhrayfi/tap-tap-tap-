package com.yandex.mobile.ads.impl;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26246b;

    public wb1(String str) {
        Integer numF;
        Integer numF2;
        fd.j0.i(str, "versionName");
        this.f26245a = str;
        int iIntValue = 0;
        List listR = ed.u.R(str, new String[]{"."}, false, 0, 6);
        String str2 = (String) kc.t.t(listR, 0);
        if (str2 != null && (numF2 = ed.p.f(str2)) != null) {
            iIntValue = numF2.intValue();
        }
        this.f26246b = iIntValue;
        String str3 = (String) kc.t.t(listR, 1);
        if (str3 != null && (numF = ed.p.f(str3)) != null) {
            numF.intValue();
        }
        String str4 = (String) kc.t.t(listR, 2);
        a(str4 == null ? "" : str4);
    }

    private static void a(String str) {
        Integer numF;
        if (ed.u.x(str, "-", false, 2)) {
            numF = ed.p.f(ed.u.W(str, "-", null, 2));
            if (numF == null) {
                return;
            }
        } else {
            numF = ed.p.f(str);
            if (numF == null) {
                return;
            }
        }
        numF.intValue();
    }

    public final int a() {
        return this.f26246b;
    }

    public final String toString() {
        return this.f26245a;
    }
}
