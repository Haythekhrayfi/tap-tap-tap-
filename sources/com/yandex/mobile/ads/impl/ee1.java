package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.facebook.ads.AdSDKNotificationListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ee1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i01 f20233b = i01.b();

    public ee1(Context context) {
        this.f20232a = context.getApplicationContext();
    }

    public final Map a(HashMap map, hh1 hh1Var) {
        nz0 nz0VarA = this.f20233b.a(this.f20232a);
        if (nz0VarA != null ? nz0VarA.K() : false) {
            return map;
        }
        HashMap map2 = new HashMap(map);
        List<String> listA = hh1Var != null ? hh1Var.a() : null;
        List list = (List) map2.get(AdSDKNotificationListener.IMPRESSION_EVENT);
        if (listA != null) {
            map2.put(AdSDKNotificationListener.IMPRESSION_EVENT, listA);
        } else {
            map2.remove(AdSDKNotificationListener.IMPRESSION_EVENT);
        }
        if (list != null) {
            map2.put("render_impression", list);
        } else {
            map2.remove("render_impression");
        }
        return map2;
    }
}
