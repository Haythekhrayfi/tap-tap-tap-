package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class tx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdResponse<?> f25509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ViewGroup f25510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final uk f25511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e80 f25512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i2 f25513e;

    public /* synthetic */ tx(Context context, AdResponse adResponse, ViewGroup viewGroup, uk ukVar, q0 q0Var, int i10, a1 a1Var) {
        this(context, adResponse, viewGroup, ukVar, q0Var, a1Var, new e80(context, adResponse, ukVar, q0Var, i10, a1Var), new i2(a1Var));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tx(Context context, AdResponse adResponse, ViewGroup viewGroup, uk ukVar, q0 q0Var, int i10, a1 a1Var, int i11) {
        this(context, adResponse, viewGroup, ukVar, q0Var, i10, a1Var);
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(adResponse, "adResponse");
        fd.j0.i(viewGroup, "container");
        fd.j0.i(ukVar, "contentCloseListener");
        fd.j0.i(q0Var, "eventController");
        fd.j0.i(a1Var, "adActivityListener");
    }

    public tx(Context context, AdResponse adResponse, ViewGroup viewGroup, uk ukVar, q0 q0Var, a1 a1Var, e80 e80Var, i2 i2Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(adResponse, "adResponse");
        fd.j0.i(viewGroup, "container");
        fd.j0.i(ukVar, "contentCloseListener");
        fd.j0.i(q0Var, "eventController");
        fd.j0.i(a1Var, "adActivityListener");
        fd.j0.i(e80Var, "layoutDesignsControllerCreator");
        fd.j0.i(i2Var, "adCompleteListenerCreator");
        this.f25509a = adResponse;
        this.f25510b = viewGroup;
        this.f25511c = ukVar;
        this.f25512d = e80Var;
        this.f25513e = i2Var;
    }

    public final mx a(Context context, com.yandex.mobile.ads.nativeads.u uVar, uk ukVar) {
        ArrayList arrayList;
        yp ypVar;
        yp ypVarPrevious;
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(uVar, "nativeAdPrivate");
        fd.j0.i(ukVar, "contentCloseListener");
        fy0 fy0Var = new fy0(context, new wp(uVar, ukVar), ukVar);
        d1 d1VarA = this.f25513e.a(this.f25509a, fy0Var);
        List<yp> listB = uVar.b();
        if (listB != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listB) {
                if (fd.j0.d(((yp) obj).c(), bp.a(1))) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        List<yp> listB2 = uVar.b();
        if (listB2 != null) {
            ListIterator<yp> listIterator = listB2.listIterator(listB2.size());
            do {
                if (!listIterator.hasPrevious()) {
                    ypVarPrevious = null;
                    break;
                }
                ypVarPrevious = listIterator.previous();
            } while (!fd.j0.d(ypVarPrevious.c(), bp.a(2)));
            ypVar = ypVarPrevious;
        } else {
            ypVar = null;
        }
        if ((uVar instanceof n21) && iu.a(context) && fd.j0.d(this.f25509a.x(), "ad_pod")) {
            return new m4(context, (n21) uVar, fy0Var, arrayList, ypVar, this.f25510b, d1VarA, ukVar, this.f25512d);
        }
        return new sx(this.f25512d.a(context, this.f25510b, uVar, new wt0(d1VarA), fy0Var, arrayList != null ? (yp) kc.t.s(arrayList) : null), ukVar);
    }
}
