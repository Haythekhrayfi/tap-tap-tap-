package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class hd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hq f21360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qp f21361b;

    public /* synthetic */ hd() {
        this(new hq(), new qp());
    }

    public hd(hq hqVar, qp qpVar) {
        fd.j0.i(hqVar, "divKitIntegrationValidator");
        fd.j0.i(qpVar, "divDataCreator");
        this.f21360a = hqVar;
        this.f21361b = qpVar;
    }

    public final gd a(Context context, com.yandex.mobile.ads.nativeads.u uVar) {
        yp ypVar;
        Object next;
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(uVar, "nativeAdPrivate");
        Objects.requireNonNull(this.f21360a);
        if (hq.a(context)) {
            List<yp> listB = uVar.b();
            if (listB != null) {
                Iterator<T> it = listB.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!fd.j0.d(((yp) next).c(), bp.a(1)));
                ypVar = (yp) next;
            } else {
                ypVar = null;
            }
            if (ypVar != null) {
                Objects.requireNonNull(this.f21361b);
                y9.l1 l1VarA = qp.a(ypVar);
                if (l1VarA != null) {
                    return new gd(l1VarA);
                }
            }
        }
        return null;
    }
}
