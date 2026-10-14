package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lm1 extends um1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet<String> f22735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f22736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f22737e;

    public lm1(um1.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(bVar);
        this.f22735c = new HashSet<>(hashSet);
        this.f22736d = jSONObject;
        this.f22737e = j10;
    }
}
