package com.yandex.metrica.impl.ob;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Gm f14118a = new Gm();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Ln f14119b;

    public H0(Ln ln) {
        this.f14119b = ln;
    }

    public String a() {
        if (this.f14118a.isEmpty()) {
            return null;
        }
        return new JSONObject(this.f14118a).toString();
    }

    public void a(String str, String str2) {
        this.f14119b.b(this.f14118a, str, str2);
    }
}
