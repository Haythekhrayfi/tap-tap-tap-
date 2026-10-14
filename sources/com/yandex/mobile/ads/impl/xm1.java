package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class xm1 implements gm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gm1 f26559a;

    public xm1(cn1 cn1Var) {
        this.f26559a = cn1Var;
    }

    @Override // com.yandex.mobile.ads.impl.gm1
    public final JSONObject a(View view) {
        return rm1.a(0, 0, 0, 0);
    }

    @Override // com.yandex.mobile.ads.impl.gm1
    public final void a(View view, JSONObject jSONObject, gm1.a aVar, boolean z10, boolean z11) {
        View rootView;
        ArrayList arrayList = new ArrayList();
        fm1 fm1VarA = fm1.a();
        if (fm1VarA != null) {
            Collection<em1> collectionC = fm1VarA.c();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionC.size() * 2) + 3);
            Iterator<em1> it = collectionC.iterator();
            while (it.hasNext()) {
                View viewE = it.next().e();
                if (viewE != null && ln1.b(viewE) && (rootView = viewE.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fA = ln1.a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && ln1.a((View) arrayList.get(size - 1)) > fA) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((i81) aVar).a((View) it2.next(), this.f26559a, jSONObject, z11);
        }
    }
}
