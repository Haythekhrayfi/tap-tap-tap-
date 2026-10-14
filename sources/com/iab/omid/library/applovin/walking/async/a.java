package com.iab.omid.library.applovin.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet<String> f13011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f13012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f13013e;

    public a(b.InterfaceC0167b interfaceC0167b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0167b);
        this.f13011c = new HashSet<>(hashSet);
        this.f13012d = jSONObject;
        this.f13013e = j10;
    }
}
