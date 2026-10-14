package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class rc1 {
    public static String a(long j10, rd1 rd1Var, ac1 ac1Var) {
        fd.j0.i(rd1Var, "adPodInfo");
        fd.j0.i(ac1Var, "videoAd");
        int adPosition = rd1Var.getAdPosition();
        String strG = ac1Var.g();
        if (strG == null) {
            strG = String.valueOf(q10.a());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ad_break_#");
        sb2.append(j10);
        sb2.append("|position_");
        sb2.append(adPosition);
        return androidx.activity.k.a(sb2, "|video_ad_#", strG);
    }
}
