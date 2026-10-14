package com.applovin.exoplayer2.i.e;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6960e;

    private b(int i10, int i11, int i12, int i13, int i14) {
        this.f6956a = i10;
        this.f6957b = i11;
        this.f6958c = i12;
        this.f6959d = i13;
        this.f6960e = i14;
    }

    public static b a(String str) {
        com.applovin.exoplayer2.l.a.a(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            String lowerCase = Ascii.toLowerCase(strArrSplit[i14].trim());
            Objects.requireNonNull(lowerCase);
            switch (lowerCase) {
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
        return new b(i10, i11, i12, i13, strArrSplit.length);
    }
}
