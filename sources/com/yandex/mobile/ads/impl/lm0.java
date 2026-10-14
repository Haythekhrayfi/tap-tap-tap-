package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdImpressionData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<qa<?>> f22731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<g11> f22732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<String> f22733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AdImpressionData f22734e;

    public lm0(List list, ArrayList arrayList, ArrayList arrayList2, String str, AdImpressionData adImpressionData) {
        this.f22731b = list;
        this.f22732c = arrayList;
        this.f22733d = arrayList2;
        this.f22730a = str;
        this.f22734e = adImpressionData;
    }

    public final String a() {
        return this.f22730a;
    }

    public final List<qa<?>> b() {
        List<qa<?>> list = this.f22731b;
        return list != null ? list : Collections.emptyList();
    }

    public final AdImpressionData c() {
        return this.f22734e;
    }

    public final List<String> d() {
        return this.f22733d;
    }

    public final List<g11> e() {
        return this.f22732c;
    }
}
