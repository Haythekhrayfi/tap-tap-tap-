package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.parser.vmap.configurator.AdBreakParameters;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class q1 implements bg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d6 f24291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p61 f24293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<String> f24294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, List<String>> f24295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AdBreakParameters f24296f;

    public q1(d6 d6Var, String str, p61 p61Var, List list, HashMap map) {
        this.f24291a = d6Var;
        this.f24292b = str;
        this.f24294d = list;
        this.f24293c = p61Var;
        this.f24295e = map;
    }

    @Override // com.yandex.mobile.ads.impl.bg1
    public final Map<String, List<String>> a() {
        return this.f24295e;
    }

    public final void a(AdBreakParameters adBreakParameters) {
        this.f24296f = adBreakParameters;
    }

    public final d6 b() {
        return this.f24291a;
    }

    public final String c() {
        return this.f24292b;
    }

    public final List<String> d() {
        return this.f24294d;
    }

    public final AdBreakParameters e() {
        return this.f24296f;
    }

    public final p61 f() {
        return this.f24293c;
    }
}
