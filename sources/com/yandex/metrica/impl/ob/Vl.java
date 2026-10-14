package com.yandex.metrica.impl.ob;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class Vl implements InterfaceC1815ml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ol f15360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ul f15361b;

    public static class a {
    }

    public Vl(Ol ol, Ul ul) {
        this.f15360a = ol;
        this.f15361b = ul;
        ul.b();
    }

    public void a(boolean z10) {
        this.f15361b.a(z10);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1815ml
    public void onError(String str) {
        this.f15361b.a();
        this.f15360a.onError(str);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1815ml
    public void onResult(JSONObject jSONObject) {
        this.f15361b.a();
        this.f15360a.onResult(jSONObject);
    }
}
