package com.yandex.mobile.ads.common;

import android.location.Location;
import ed.q;
import fd.j0;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static AdRequest a(AdRequestConfiguration adRequestConfiguration) {
        j0.i(adRequestConfiguration, "adRequestConfiguration");
        String strB = adRequestConfiguration.b();
        String strF = adRequestConfiguration.f();
        String strD = adRequestConfiguration.d();
        List<String> listE = adRequestConfiguration.e();
        Location locationG = adRequestConfiguration.g();
        Map<String, String> mapH = adRequestConfiguration.h();
        String strC = adRequestConfiguration.c();
        AdTheme adThemeI = adRequestConfiguration.i();
        AdRequest.Builder builder = new AdRequest.Builder();
        boolean z10 = false;
        if ((strB == null || (q.k(strB) ^ true)) ? false : true) {
            builder = builder.setAge(strB);
            j0.h(builder, "builder.setAge(age)");
        }
        if (strF != null && !(!q.k(strF))) {
            z10 = true;
        }
        if (z10) {
            builder = builder.setGender(strF);
            j0.h(builder, "builder.setGender(gender)");
        }
        if (strD != null) {
            builder = builder.setContextQuery(strD);
            j0.h(builder, "builder.setContextQuery(contextQuery)");
        }
        if (listE != null) {
            builder = builder.setContextTags(listE);
            j0.h(builder, "builder.setContextTags(contextTags)");
        }
        if (locationG != null) {
            builder = builder.setLocation(locationG);
            j0.h(builder, "builder.setLocation(location)");
        }
        if (mapH != null) {
            builder = builder.setParameters(mapH);
            j0.h(builder, "builder.setParameters(parameters)");
        }
        if (strC != null) {
            builder = builder.setBiddingData(strC);
            j0.h(builder, "builder.setBiddingData(biddingData)");
        }
        if (adThemeI != null) {
            builder = builder.setPreferredTheme(adThemeI);
            j0.h(builder, "builder.setPreferredTheme(preferredTheme)");
        }
        AdRequest adRequestBuild = builder.build();
        j0.h(adRequestBuild, "builder.build()");
        return adRequestBuild;
    }

    public static String b(AdRequestConfiguration adRequestConfiguration) {
        j0.i(adRequestConfiguration, "adRequestConfiguration");
        String strA = adRequestConfiguration.a();
        j0.h(strA, "adRequestConfiguration.adUnitId");
        return strA;
    }
}
