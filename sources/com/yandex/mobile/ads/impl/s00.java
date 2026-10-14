package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class s00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f24913a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f24914b;

    public final synchronized Map<String, String> a() {
        if (this.f24914b == null) {
            this.f24914b = Collections.unmodifiableMap(new HashMap(this.f24913a));
        }
        return this.f24914b;
    }
}
