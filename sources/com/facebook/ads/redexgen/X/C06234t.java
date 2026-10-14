package com.facebook.ads.redexgen.X;

import android.view.View;
import com.google.android.gms.common.GoogleApiAvailabilityLight;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C06234t {
    public static String[] A00 = {"UqypfisWbLbbWLDfIVvpiaUsz0iS", "wEiCJDeLGzLJebV", "cX", "dRMEhdR7kDOm9Ob", "SmhGT229bW5LAFpAZzaxeRYqKvMDeGhX", "QcSoUKFtoryhyFMFYIfDI81ChPsDlMu7", "SBvSWfqovIH0ljTVzoffsyrdWCNw", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION};

    public static int A00(C06194p c06194p, C4K c4k, View view, View view2, AbstractC06054a abstractC06054a, boolean z10) {
        if (abstractC06054a.A0W() == 0 || c06194p.A03() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(abstractC06054a.A0p(view) - abstractC06054a.A0p(view2)) + 1;
        }
        int iA0C = c4k.A0C(view2);
        int iA0F = c4k.A0F(view);
        String[] strArr = A00;
        if (strArr[4].charAt(28) == strArr[5].charAt(28)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A00;
        strArr2[3] = "xd2oZUwi45Npmqe";
        strArr2[1] = "1k2xoHfklbXXQiR";
        int extend = c4k.A0B();
        return Math.min(extend, iA0C - iA0F);
    }

    public static int A01(C06194p c06194p, C4K c4k, View view, View view2, AbstractC06054a abstractC06054a, boolean z10) {
        if (abstractC06054a.A0W() == 0 || c06194p.A03() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return c06194p.A03();
        }
        int iA0C = c4k.A0C(view2) - c4k.A0F(view);
        int iA0p = abstractC06054a.A0p(view);
        int laidOutArea = abstractC06054a.A0p(view2);
        float fAbs = iA0C / (Math.abs(iA0p - laidOutArea) + 1);
        int laidOutArea2 = c06194p.A03();
        return (int) (fAbs * laidOutArea2);
    }

    public static int A02(C06194p c06194p, C4K c4k, View view, View view2, AbstractC06054a abstractC06054a, boolean z10, boolean z11) {
        int laidOutArea;
        if (abstractC06054a.A0W() != 0) {
            int iA03 = c06194p.A03();
            String[] strArr = A00;
            if (strArr[3].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[6] = "xSzU3PMpL9LC7k2G9V08vNIV3nIP";
            strArr2[0] = "UsrmTbcEPDcBULmsiiLKltF5MwgK";
            if (iA03 != 0 && view != null && view2 != null) {
                int maxPosition = Math.min(abstractC06054a.A0p(view), abstractC06054a.A0p(view2));
                int iA0p = abstractC06054a.A0p(view);
                int minPosition = abstractC06054a.A0p(view2);
                int iMax = Math.max(iA0p, minPosition);
                if (z11) {
                    int minPosition2 = c06194p.A03();
                    laidOutArea = Math.max(0, (minPosition2 - iMax) - 1);
                } else {
                    laidOutArea = Math.max(0, maxPosition);
                }
                if (!z10) {
                    return laidOutArea;
                }
                int itemsBefore = c4k.A0C(view2);
                int minPosition3 = c4k.A0F(view);
                int maxPosition2 = Math.abs(itemsBefore - minPosition3);
                int itemsBefore2 = abstractC06054a.A0p(view);
                int minPosition4 = abstractC06054a.A0p(view2);
                float fAbs = laidOutArea * (maxPosition2 / (Math.abs(itemsBefore2 - minPosition4) + 1));
                int itemsBefore3 = c4k.A0A();
                int minPosition5 = c4k.A0F(view);
                return Math.round(fAbs + (itemsBefore3 - minPosition5));
            }
        }
        return 0;
    }
}
