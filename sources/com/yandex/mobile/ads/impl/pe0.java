package com.yandex.mobile.ads.impl;

import com.yandex.metrica.IReporter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class pe0 implements iw0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f24046b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f24047c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IReporter f24048a;

    public static final class a {
        public static Object a() {
            return pe0.f24046b;
        }
    }

    public pe0(IReporter iReporter) {
        this.f24048a = iReporter;
    }

    private static void a(String str, Map map) throws IOException {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kc.e0.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object[] objArr = {entry.getValue()};
            StringBuilder sb2 = new StringBuilder(7);
            kc.h.a(objArr, sb2, new ArrayList());
            String string = sb2.toString();
            fd.j0.h(string, "StringBuilder(capacity).…builderAction).toString()");
            linkedHashMap.put(key, string);
        }
        x60.b("reportEvent(), eventName = " + str + ", reportData = " + linkedHashMap, new Object[0]);
    }

    @Override // com.yandex.mobile.ads.impl.iw0
    public final void a(fw0 fw0Var) {
        fd.j0.i(fw0Var, "report");
        if (this.f24048a == null) {
            x60.d("Reporter is null", new Object[0]);
            return;
        }
        String strB = fw0Var.b();
        fd.j0.h(strB, "report.eventName");
        Map<String, Object> mapA = fw0Var.a();
        fd.j0.h(mapA, "report.data");
        try {
            a(strB, mapA);
            this.f24048a.reportEvent(strB, mapA);
        } catch (Throwable th) {
            x60.a(th, th.toString(), new Object[0]);
        }
    }
}
