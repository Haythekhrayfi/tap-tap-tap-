package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class kc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jc f22372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f22373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f22374c;

    public kc(w01 w01Var, jc jcVar) {
        fd.j0.i(w01Var, "sensitiveModeChecker");
        fd.j0.i(jcVar, "autograbCollectionEnabledValidator");
        this.f22372a = jcVar;
        this.f22373b = new Object();
        this.f22374c = new ArrayList();
    }

    public final void a(Context context, r9 r9Var, nc ncVar) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(r9Var, "autograbProvider");
        fd.j0.i(ncVar, "autograbRequestListener");
        if (!this.f22372a.a(context)) {
            ncVar.a(null);
            return;
        }
        synchronized (this.f22373b) {
            this.f22374c.add(ncVar);
            r9Var.b(ncVar);
        }
    }

    public final void a(r9 r9Var) {
        HashSet hashSet;
        fd.j0.i(r9Var, "autograbProvider");
        synchronized (this.f22373b) {
            hashSet = new HashSet(this.f22374c);
            this.f22374c.clear();
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            r9Var.a((nc) it.next());
        }
    }
}
