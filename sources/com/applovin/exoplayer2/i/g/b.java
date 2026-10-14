package com.applovin.exoplayer2.i.g;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.a.aq;
import com.applovin.exoplayer2.common.a.w;
import com.applovin.exoplayer2.common.a.x;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f6992d = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final w<String> f6993e = w.a("auto", "none");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final w<String> f6994f = w.a("dot", "sesame", "circle");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final w<String> f6995g = w.a("filled", "open");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final w<String> f6996h = w.a("after", "before", "outside");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6999c;

    private b(int i10, int i11, int i12) {
        this.f6997a = i10;
        this.f6998b = i11;
        this.f6999c = i12;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    /* JADX WARN: Code duplicated, block: B:37:0x0084  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d6  */
    private static b a(w<String> wVar) {
        byte b10;
        int i10;
        byte b11;
        String str = (String) x.a(aq.a((Set) f6996h, (Set<?>) wVar), "outside");
        int iHashCode = str.hashCode();
        int i11 = 2;
        int i12 = -1;
        byte b12 = 1;
        if (iHashCode != -1392885889) {
            if (iHashCode != -1106037339) {
                if (iHashCode == 92734940 && str.equals("after")) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
            } else if (str.equals("outside")) {
                b10 = 1;
            } else {
                b10 = -1;
            }
        } else if (str.equals("before")) {
            b10 = 2;
        } else {
            b10 = -1;
        }
        if (b10 != 0) {
            i10 = b10 != 1 ? 1 : -2;
        } else {
            i10 = 2;
        }
        aq.b bVarA = aq.a((Set) f6993e, (Set<?>) wVar);
        if (!bVarA.isEmpty()) {
            String str2 = (String) bVarA.iterator().next();
            int iHashCode2 = str2.hashCode();
            if (iHashCode2 != 3005871) {
                if (iHashCode2 == 3387192 && str2.equals("none")) {
                    b12 = 0;
                } else {
                    b12 = -1;
                }
            } else if (!str2.equals("auto")) {
                b12 = -1;
            }
            return new b(b12 == 0 ? 0 : -1, 0, i10);
        }
        aq.b bVarA2 = aq.a((Set) f6995g, (Set<?>) wVar);
        aq.b bVarA3 = aq.a((Set) f6994f, (Set<?>) wVar);
        if (bVarA2.isEmpty() && bVarA3.isEmpty()) {
            return new b(-1, 0, i10);
        }
        String str3 = (String) x.a(bVarA2, "filled");
        int iHashCode3 = str3.hashCode();
        if (iHashCode3 != -1274499742) {
            if (iHashCode3 == 3417674 && str3.equals("open")) {
                b11 = 0;
            } else {
                b11 = -1;
            }
        } else if (str3.equals("filled")) {
            b11 = 1;
        } else {
            b11 = -1;
        }
        int i13 = b11 != 0 ? 1 : 2;
        String str4 = (String) x.a(bVarA3, "circle");
        int iHashCode4 = str4.hashCode();
        if (iHashCode4 != -1360216880) {
            if (iHashCode4 != -905816648) {
                if (iHashCode4 == 99657 && str4.equals("dot")) {
                    i12 = 0;
                }
            } else if (str4.equals("sesame")) {
                i12 = 1;
            }
        } else if (str4.equals("circle")) {
            i12 = 2;
        }
        if (i12 != 0) {
            i11 = i12 != 1 ? 1 : 3;
        }
        return new b(i11, i13, i10);
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.isEmpty()) {
            return null;
        }
        return a((w<String>) w.a((Object[]) TextUtils.split(lowerCase, f6992d)));
    }
}
