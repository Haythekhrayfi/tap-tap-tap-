package com.iab.omid.library.applovin.walking;

import com.iab.omid.library.applovin.walking.async.d;
import com.iab.omid.library.applovin.walking.async.e;
import com.iab.omid.library.applovin.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b implements com.iab.omid.library.applovin.walking.async.b.InterfaceC0167b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f13020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.applovin.walking.async.c f13021b;

    public b(com.iab.omid.library.applovin.walking.async.c cVar) {
        this.f13021b = cVar;
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0167b
    public JSONObject a() {
        return this.f13020a;
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0167b
    public void a(JSONObject jSONObject) {
        this.f13020a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f13021b.b(new e(this, hashSet, jSONObject, j10));
    }

    public void b() {
        this.f13021b.b(new d(this));
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f13021b.b(new f(this, hashSet, jSONObject, j10));
    }
}
