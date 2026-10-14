package fa;

import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29432a;

        static {
            int[] iArr = new int[com.zipoapps.ads.a.EnumC0215a.values().length];
            try {
                iArr[com.zipoapps.ads.a.EnumC0215a.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.zipoapps.ads.a.EnumC0215a.BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.zipoapps.ads.a.EnumC0215a.BANNER_MEDIUM_RECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.zipoapps.ads.a.EnumC0215a.NATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.zipoapps.ads.a.EnumC0215a.REWARDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f29432a = iArr;
        }
    }

    public final String a(com.zipoapps.ads.a.EnumC0215a enumC0215a, boolean z10, boolean z11) {
        j0.i(enumC0215a, "adType");
        int i10 = a.f29432a[enumC0215a.ordinal()];
        if (i10 == 1) {
            return e(z11);
        }
        if (i10 == 2) {
            if (z10) {
                String strC = c(z11);
                if (!(strC.length() == 0)) {
                    return strC;
                }
            }
            return b(z11);
        }
        if (i10 == 3) {
            if (z10) {
                String strC2 = c(z11);
                if (!(strC2.length() == 0)) {
                    return strC2;
                }
            }
            return f(z11);
        }
        if (i10 != 4) {
            if (i10 == 5) {
                return h(z11);
            }
            throw new jc.g();
        }
        if (z10) {
            String strD = d(z11);
            if (!(strD.length() == 0)) {
                return strD;
            }
        }
        return g(z11);
    }

    public abstract String b(boolean z10);

    public abstract String c(boolean z10);

    public abstract String d(boolean z10);

    public abstract String e(boolean z10);

    public abstract String f(boolean z10);

    public abstract String g(boolean z10);

    public abstract String h(boolean z10);
}
