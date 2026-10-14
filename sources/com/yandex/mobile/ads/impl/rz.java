package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k6 f24895a;

    public rz(Context context, k2 k2Var) {
        this.f24895a = new k6(context, k2Var);
    }

    public final void a(String str, AdResponse adResponse, z0 z0Var) {
        List<String> listT = adResponse.t();
        if (listT != null) {
            Iterator<String> it = listT.iterator();
            while (it.hasNext()) {
                this.f24895a.a(it.next());
            }
        }
        this.f24895a.a(str, adResponse, z0Var);
    }
}
