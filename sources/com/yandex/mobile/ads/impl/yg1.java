package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.ads.AdError;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.common.AdRequest;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class yg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b5 f26844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final iw0 f26845b;

    public /* synthetic */ yg1(Context context) {
        this(context, new b5(), z8.a(context));
    }

    public yg1(Context context, b5 b5Var, iw0 iw0Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(b5Var, "adRequestReportDataProvider");
        fd.j0.i(iw0Var, "metricaReporter");
        this.f26844a = b5Var;
        this.f26845b = iw0Var;
    }

    public final void a(wg1 wg1Var, k2 k2Var) {
        String str;
        int iD;
        fd.j0.i(wg1Var, "viewSizeInfo");
        fd.j0.i(k2Var, "adConfiguration");
        gw0 gw0Var = new gw0(new LinkedHashMap());
        AdRequest adRequestA = k2Var.a();
        if (adRequestA != null) {
            gw0Var.a(this.f26844a.a(adRequestA));
        }
        gw0Var.b(k2Var.c(), "ad_unit_id");
        gw0Var.b(k2Var.c(), "block_id");
        int iL = k2Var.l();
        if (iL != 1) {
            str = iL != 2 ? AdError.UNDEFINED_DOMAIN : "landscape";
        } else {
            str = "portrait";
        }
        gw0Var.b(str, "orientation");
        SizeInfo sizeInfoN = k2Var.n();
        gw0Var.a((sizeInfoN == null || (iD = sizeInfoN.d()) == 0) ? null : a21.a(iD), "size_type");
        SizeInfo sizeInfoN2 = k2Var.n();
        gw0Var.a(sizeInfoN2 != null ? Integer.valueOf(sizeInfoN2.e()) : null, "size_info_width");
        SizeInfo sizeInfoN3 = k2Var.n();
        gw0Var.a(sizeInfoN3 != null ? Integer.valueOf(sizeInfoN3.c()) : null, "size_info_height");
        gw0Var.b(Integer.valueOf(wg1Var.d().b()), "view_width");
        gw0Var.b(Integer.valueOf(wg1Var.d().a()), "view_height");
        gw0Var.a(wg1Var.b().b(), "layout_width");
        gw0Var.a(wg1Var.b().a(), "layout_height");
        gw0Var.b(Integer.valueOf(wg1Var.c().b().b()), "measured_width");
        String strName = wg1Var.c().b().a().name();
        Locale locale = Locale.ROOT;
        String lowerCase = strName.toLowerCase(locale);
        fd.j0.h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        gw0Var.b(lowerCase, "measured_width_mode");
        gw0Var.b(Integer.valueOf(wg1Var.c().a().b()), "measured_height");
        String lowerCase2 = wg1Var.c().a().a().name().toLowerCase(locale);
        fd.j0.h(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        gw0Var.b(lowerCase2, "measured_height_mode");
        Map<String, Object> mapA = gw0Var.a();
        fd.j0.h(mapA, "ReportDataWrapper(mutabl…   }\n        }.reportData");
        this.f26845b.a(new fw0(fw0.b.O, mapA));
    }
}
