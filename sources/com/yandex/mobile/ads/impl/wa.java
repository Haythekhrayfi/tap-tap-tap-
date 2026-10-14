package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f26230a;

    public wa(com.yandex.mobile.ads.nativeads.c cVar, List<? extends qa<?>> list, f2 f2Var, com.yandex.mobile.ads.nativeads.w<View> wVar, ov0 ov0Var, v20 v20Var, m80 m80Var) {
        fd.j0.i(cVar, "clickListenerFactory");
        fd.j0.i(list, "assets");
        fd.j0.i(f2Var, "adClickHandler");
        fd.j0.i(wVar, "viewAdapter");
        fd.j0.i(ov0Var, "renderedTimer");
        fd.j0.i(v20Var, "impressionEventsObservable");
        int iA = kc.e0.a(kc.m.j(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            qa qaVar = (qa) it.next();
            String strB = qaVar.b();
            m80 m80VarA = qaVar.a();
            jc.h hVar = new jc.h(strB, cVar.a(v20Var, ov0Var, f2Var, wVar, qaVar, m80VarA == null ? m80Var : m80VarA));
            linkedHashMap.put(hVar.f31811c, hVar.f31812d);
        }
        this.f26230a = linkedHashMap;
    }

    public final void a(View view, String str) {
        fd.j0.i(view, "view");
        fd.j0.i(str, "assetName");
        View.OnClickListener onClickListener = (View.OnClickListener) this.f26230a.get(str);
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
