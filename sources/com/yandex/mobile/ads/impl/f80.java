package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f80 {
    public static ArrayList a(Context context, AdResponse adResponse, com.yandex.mobile.ads.nativeads.u uVar, uk ukVar, NativeAdEventListener nativeAdEventListener, q0 q0Var, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ux) it.next()).a(context, adResponse, uVar, ukVar, nativeAdEventListener));
        }
        return arrayList;
    }
}
