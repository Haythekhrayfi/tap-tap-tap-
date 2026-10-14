package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ye, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2112ye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f17909b;

    public C2112ye(String str) {
        this(str, null);
    }

    public C2112ye(String str, String str2) {
        this.f17908a = str;
        this.f17909b = a(str2);
    }

    public String a() {
        return this.f17909b;
    }

    public final String a(String str) {
        return str != null ? androidx.activity.k.a(new StringBuilder(), this.f17908a, str) : this.f17908a;
    }

    public String b() {
        return this.f17908a;
    }
}
