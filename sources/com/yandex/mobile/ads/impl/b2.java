package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.parser.vmap.configurator.AdBreakParameters;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class b2 {
    public static void a(ArrayList arrayList, AdBreakParameters adBreakParameters) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((q1) it.next()).a(adBreakParameters);
        }
    }
}
