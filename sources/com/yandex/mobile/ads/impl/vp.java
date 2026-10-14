package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.view.View;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class vp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yh f26054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f26055b;

    public vp(yh yhVar) {
        fd.j0.i(yhVar, "mainClickConnector");
        this.f26054a = yhVar;
        this.f26055b = new HashMap();
    }

    public final void a(int i10, yh yhVar) {
        fd.j0.i(yhVar, "clickConnector");
        this.f26055b.put(Integer.valueOf(i10), yhVar);
    }

    public final void a(Uri uri, p7.f1 f1Var) {
        yh yhVar;
        fd.j0.i(uri, "uri");
        fd.j0.i(f1Var, "view");
        String queryParameter = uri.getQueryParameter("assetName");
        if (queryParameter != null) {
            String queryParameter2 = uri.getQueryParameter("position");
            Integer numF = queryParameter2 != null ? ed.p.f(queryParameter2) : null;
            if (numF == null) {
                yhVar = this.f26054a;
            } else {
                yhVar = (yh) this.f26055b.get(numF);
                if (yhVar == null) {
                    return;
                }
            }
            View view = f1Var.getView();
            fd.j0.h(view, "view.view");
            yhVar.a(view, queryParameter);
        }
    }
}
