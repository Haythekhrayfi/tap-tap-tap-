package com.yandex.mobile.ads.impl;

import com.yandex.metrica.plugins.PluginErrorDetails;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class dl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, cl> f19893a = new a();

    public class a extends HashMap<String, cl> {
        public a() {
            put("html", cl.f19541a);
            put(PluginErrorDetails.Platform.NATIVE, cl.f19542b);
        }
    }

    public static cl a(Map map) {
        return (cl) ((HashMap) f19893a).get((String) map.get(t00.b(18)));
    }
}
