package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eg0 {
    public static int a(String str) {
        for (int i10 : a6.b(8)) {
            if (a(i10).equals(str)) {
                return i10;
            }
        }
        return 8;
    }

    public static /* synthetic */ String a(int i10) {
        if (i10 == 1) {
            return "advideocomplete";
        }
        if (i10 == 2) {
            return "impressionTrackingStart";
        }
        if (i10 == 3) {
            return "impressionTrackingSuccess";
        }
        if (i10 == 4) {
            return "close";
        }
        if (i10 == 5) {
            return "open";
        }
        if (i10 == 6) {
            return "rewardedAdComplete";
        }
        if (i10 == 7) {
            return "usecustomclose";
        }
        if (i10 == 8) {
            return "";
        }
        throw null;
    }
}
