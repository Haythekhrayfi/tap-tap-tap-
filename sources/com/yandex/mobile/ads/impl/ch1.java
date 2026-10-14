package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public enum ch1 implements p70 {
    f19506b("default"),
    f19507c("loading"),
    f19508d("hidden");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19510a;

    ch1(String str) {
        this.f19510a = str;
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final String a() {
        return String.format("state: %s", JSONObject.quote(this.f19510a));
    }
}
