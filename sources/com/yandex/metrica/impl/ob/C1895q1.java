package com.yandex.metrica.impl.ob;

import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1895q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W0 f17157a;

    public C1895q1() {
        this(Oh.a());
    }

    public C1895q1(W0 w10) {
        this.f17157a = w10;
    }

    public void a(Map<String, Object> map) {
        this.f17157a.reportEvent("login_sdk", map);
    }
}
