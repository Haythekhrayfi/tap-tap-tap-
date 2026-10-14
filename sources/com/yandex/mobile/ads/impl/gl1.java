package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class gl1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k2 f21100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c6 f21101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fl1<T> f21102c;

    public gl1(k2 k2Var, c6 c6Var, fl1<T> fl1Var) {
        fd.j0.i(k2Var, "adConfiguration");
        fd.j0.i(c6Var, "sizeValidator");
        fd.j0.i(fl1Var, "yandexHtmlAdCreateController");
        this.f21100a = k2Var;
        this.f21101b = c6Var;
        this.f21102c = fl1Var;
    }

    public final void a() {
        this.f21102c.a();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x002e  */
    public final void a(Context context, AdResponse<String> adResponse, hl1<T> hl1Var) {
        t2 t2VarA;
        String str;
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(adResponse, "adResponse");
        fd.j0.i(hl1Var, "creationListener");
        String strC = adResponse.C();
        SizeInfo sizeInfoG = adResponse.G();
        fd.j0.h(sizeInfoG, "adResponse.sizeInfo");
        boolean zA = this.f21101b.a(context, sizeInfoG);
        SizeInfo sizeInfoN = this.f21100a.n();
        if (zA) {
            if (sizeInfoN == null) {
                t2VarA = v4.f25820c;
                str = "MISCONFIGURED_INTERNAL_STATE";
            } else if (!c21.a(context, adResponse, sizeInfoG, this.f21101b, sizeInfoN)) {
                t2VarA = v4.a(sizeInfoN.c(context), sizeInfoN.a(context), sizeInfoG.e(), sizeInfoG.c(), eh1.c(context), eh1.b(context));
                str = "createNotEnoughSpaceErro…h, screenHeight\n        )";
            } else if (strC == null || ed.q.k(strC)) {
                t2VarA = v4.f25821d;
                fd.j0.h(t2VarA, "INVALID_SERVER_RESPONSE_DATA");
            } else if (t6.a(context)) {
                try {
                    this.f21102c.a(adResponse, sizeInfoN, strC, hl1Var);
                    return;
                } catch (xi1 unused) {
                    t2VarA = v4.f25822e;
                    str = "WEB_VIEW_CREATION_FAILED";
                }
            } else {
                t2VarA = v4.f25819b;
                str = "WEB_VIEW_DATABASE_INOPERABLE";
            }
            fd.j0.h(t2VarA, str);
        } else {
            t2VarA = v4.f25821d;
            fd.j0.h(t2VarA, "INVALID_SERVER_RESPONSE_DATA");
        }
        hl1Var.a(t2VarA);
    }
}
