package com.yandex.mobile.ads.impl;

import com.google.android.gms.ads.AdError;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class gw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f21225a;

    public gw0(Map<String, Object> map) {
        this.f21225a = map;
    }

    public final Map<String, Object> a() {
        return this.f21225a;
    }

    public final void a(Object obj, String str) {
        if (obj != null) {
            this.f21225a.put(str, obj);
        }
    }

    public final void a(String str) {
        this.f21225a.put(str, AdError.UNDEFINED_DOMAIN);
    }

    public final void a(List list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f21225a.put("active_experiments", list);
    }

    public final void a(Map<String, Object> map) {
        this.f21225a.putAll(map);
    }

    public final void b(Object obj, String str) {
        if (obj == null) {
            a(str);
        } else {
            this.f21225a.put(str, obj);
        }
    }
}
