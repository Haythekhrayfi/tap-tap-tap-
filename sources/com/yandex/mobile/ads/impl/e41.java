package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class e41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20067e;

    private e41(int i10, int i11, int i12, int i13, int i14) {
        this.f20063a = i10;
        this.f20064b = i11;
        this.f20065c = i12;
        this.f20066d = i13;
        this.f20067e = i14;
    }

    public static e41 a(String str) {
        pa.a(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            String strB = na.b(strArrSplit[i14].trim());
            Objects.requireNonNull(strB);
            switch (strB) {
                case "end":
                    i11 = i14;
                    break;
                case "text":
                    i13 = i14;
                    break;
                case "start":
                    i10 = i14;
                    break;
                case "style":
                    i12 = i14;
                    break;
            }
        }
        if (i10 == -1 || i11 == -1 || i13 == -1) {
            return null;
        }
        return new e41(i10, i11, i12, i13, strArrSplit.length);
    }
}
