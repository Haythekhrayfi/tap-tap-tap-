package com.yandex.mobile.ads.impl;

import com.facebook.ads.AdError;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class r00 extends p00 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, List<String>> f24581e;

    public r00(int i10, mm mmVar, Map map) {
        super(u60.a("Response code: ", i10), mmVar, AdError.INTERNAL_ERROR_2004);
        this.f24580d = i10;
        this.f24581e = map;
    }
}
