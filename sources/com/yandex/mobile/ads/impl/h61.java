package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class h61 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f21314b = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.yandex.mobile.ads.embedded.guava.collect.r<String> f21315c = com.yandex.mobile.ads.embedded.guava.collect.r.a("auto", "none");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.yandex.mobile.ads.embedded.guava.collect.r<String> f21316d = com.yandex.mobile.ads.embedded.guava.collect.r.a("dot", "sesame", "circle");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.yandex.mobile.ads.embedded.guava.collect.r<String> f21317e = com.yandex.mobile.ads.embedded.guava.collect.r.a("filled", "open");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final com.yandex.mobile.ads.embedded.guava.collect.r<String> f21318f = com.yandex.mobile.ads.embedded.guava.collect.r.a("after", "before", "outside");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21319a;

    private h61(int i10, int i11, int i12) {
        this.f21319a = i10;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:72:0x0113  */
    public static h61 a(String str) {
        byte b10;
        int i10;
        byte b11;
        if (str == null) {
            return null;
        }
        String strB = na.b(str.trim());
        if (strB.isEmpty()) {
            return null;
        }
        com.yandex.mobile.ads.embedded.guava.collect.r rVarA = com.yandex.mobile.ads.embedded.guava.collect.r.a(TextUtils.split(strB, f21314b));
        com.yandex.mobile.ads.embedded.guava.collect.b bVar = (com.yandex.mobile.ads.embedded.guava.collect.b) com.yandex.mobile.ads.embedded.guava.collect.m0.a((com.yandex.mobile.ads.embedded.guava.collect.r) f21318f, rVarA).iterator();
        String str2 = (String) (bVar.hasNext() ? bVar.next() : "outside");
        int iHashCode = str2.hashCode();
        int i11 = 2;
        int i12 = -1;
        byte b12 = 1;
        if (iHashCode != -1392885889) {
            if (iHashCode != -1106037339) {
                if (iHashCode == 92734940 && str2.equals("after")) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
            } else if (str2.equals("outside")) {
                b10 = 1;
            } else {
                b10 = -1;
            }
        } else if (str2.equals("before")) {
            b10 = 2;
        } else {
            b10 = -1;
        }
        if (b10 != 0) {
            i10 = b10 != 1 ? 1 : -2;
        } else {
            i10 = 2;
        }
        com.yandex.mobile.ads.embedded.guava.collect.m0.d dVarA = com.yandex.mobile.ads.embedded.guava.collect.m0.a((com.yandex.mobile.ads.embedded.guava.collect.r) f21315c, rVarA);
        if (!dVarA.isEmpty()) {
            String str3 = (String) ((com.yandex.mobile.ads.embedded.guava.collect.b) dVarA.iterator()).next();
            int iHashCode2 = str3.hashCode();
            if (iHashCode2 != 3005871) {
                if (iHashCode2 == 3387192 && str3.equals("none")) {
                    b12 = 0;
                } else {
                    b12 = -1;
                }
            } else if (!str3.equals("auto")) {
                b12 = -1;
            }
            return new h61(b12 == 0 ? 0 : -1, 0, i10);
        }
        com.yandex.mobile.ads.embedded.guava.collect.m0.d dVarA2 = com.yandex.mobile.ads.embedded.guava.collect.m0.a((com.yandex.mobile.ads.embedded.guava.collect.r) f21317e, rVarA);
        com.yandex.mobile.ads.embedded.guava.collect.m0.d dVarA3 = com.yandex.mobile.ads.embedded.guava.collect.m0.a((com.yandex.mobile.ads.embedded.guava.collect.r) f21316d, rVarA);
        if (dVarA2.isEmpty() && dVarA3.isEmpty()) {
            return new h61(-1, 0, i10);
        }
        com.yandex.mobile.ads.embedded.guava.collect.b bVar2 = (com.yandex.mobile.ads.embedded.guava.collect.b) dVarA2.iterator();
        String str4 = (String) (bVar2.hasNext() ? bVar2.next() : "filled");
        int iHashCode3 = str4.hashCode();
        if (iHashCode3 != -1274499742) {
            if (iHashCode3 == 3417674 && str4.equals("open")) {
                b11 = 0;
            } else {
                b11 = -1;
            }
        } else if (str4.equals("filled")) {
            b11 = 1;
        } else {
            b11 = -1;
        }
        int i13 = b11 != 0 ? 1 : 2;
        com.yandex.mobile.ads.embedded.guava.collect.b bVar3 = (com.yandex.mobile.ads.embedded.guava.collect.b) dVarA3.iterator();
        String str5 = (String) (bVar3.hasNext() ? bVar3.next() : "circle");
        int iHashCode4 = str5.hashCode();
        if (iHashCode4 != -1360216880) {
            if (iHashCode4 != -905816648) {
                if (iHashCode4 == 99657 && str5.equals("dot")) {
                    i12 = 0;
                }
            } else if (str5.equals("sesame")) {
                i12 = 1;
            }
        } else if (str5.equals("circle")) {
            i12 = 2;
        }
        if (i12 != 0) {
            i11 = i12 != 1 ? 1 : 3;
        }
        return new h61(i11, i13, i10);
    }
}
