package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f25214a;

    public t(k2 k2Var, AdResponse adResponse, gi giVar, pk0 pk0Var, com.yandex.mobile.ads.nativeads.w wVar, com.yandex.mobile.ads.nativeads.k kVar, fw0.a aVar) {
        this.f25214a = new o(k2Var, adResponse, giVar, pk0Var, wVar, kVar, aVar);
    }

    public final void a(View view, List<m> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (m mVar : list) {
            n nVarA = this.f25214a.a(view.getContext(), mVar);
            if (nVarA != null) {
                nVarA.a(view, mVar);
            }
        }
    }
}
