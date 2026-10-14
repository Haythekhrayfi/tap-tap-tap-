package com.applovin.impl.sdk.utils;

import android.text.TextUtils;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f11382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f11383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f11384c = a(com.applovin.impl.sdk.c.d.f10392j, (String) com.applovin.impl.sdk.c.e.b(com.applovin.impl.sdk.c.d.f10391i, (Object) null, com.applovin.impl.sdk.o.au()));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f11385d;

    public v(com.applovin.impl.sdk.o oVar) {
        this.f11382a = oVar;
        this.f11385d = a(com.applovin.impl.sdk.c.d.f10393k, (String) oVar.a(com.applovin.impl.sdk.c.b.f10344ad));
        a(d());
    }

    private String a(com.applovin.impl.sdk.c.d<String> dVar, String str) {
        String str2 = (String) com.applovin.impl.sdk.c.e.b(dVar, (Object) null, com.applovin.impl.sdk.o.au());
        if (StringUtils.isValidString(str2)) {
            return str2;
        }
        if (!StringUtils.isValidString(str)) {
            str = UUID.randomUUID().toString().toLowerCase(Locale.US);
        }
        com.applovin.impl.sdk.c.e.a(dVar, str, com.applovin.impl.sdk.o.au());
        return str;
    }

    public static String a(com.applovin.impl.sdk.o oVar) {
        com.applovin.impl.sdk.c.d<String> dVar = com.applovin.impl.sdk.c.d.f10394l;
        String str = (String) oVar.a(dVar);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String strValueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
        oVar.a(dVar, strValueOf);
        return strValueOf;
    }

    private String d() {
        if (!((Boolean) this.f11382a.a(com.applovin.impl.sdk.c.b.en)).booleanValue()) {
            this.f11382a.b(com.applovin.impl.sdk.c.d.f10390h);
        }
        String str = (String) this.f11382a.a(com.applovin.impl.sdk.c.d.f10390h);
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        this.f11382a.F();
        if (com.applovin.impl.sdk.y.a()) {
            this.f11382a.F().b("AppLovinSdk", "Using identifier (" + str + ") from previous session");
        }
        return str;
    }

    public String a() {
        return this.f11383b;
    }

    public void a(String str) {
        if (((Boolean) this.f11382a.a(com.applovin.impl.sdk.c.b.en)).booleanValue()) {
            this.f11382a.a(com.applovin.impl.sdk.c.d.f10390h, str);
        }
        this.f11383b = str;
        this.f11382a.X().a(str, c());
    }

    public String b() {
        return this.f11384c;
    }

    public String c() {
        return this.f11385d;
    }
}
