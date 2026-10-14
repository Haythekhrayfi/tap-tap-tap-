package com.yandex.mobile.ads.impl;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class hj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f21440a = 0;

    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static long a(String str) throws NumberFormatException {
        int i10 = da1.f19803a;
        String[] strArrSplit = str.split("\\.", 2);
        long j10 = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (strArrSplit.length == 2) {
            j11 += Long.parseLong(strArrSplit[1]);
        }
        return j11 * 1000;
    }

    public static void a(mp0 mp0Var) throws qp0 {
        int iD = mp0Var.d();
        String strJ = mp0Var.j();
        if (strJ != null && strJ.startsWith("WEBVTT")) {
            return;
        }
        mp0Var.e(iD);
        throw qp0.a("Expected WEBVTT. Got " + mp0Var.j(), (Exception) null);
    }
}
