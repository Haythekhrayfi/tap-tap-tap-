package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Si f15200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1607ec f15201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f15202c;

    public V(Si si, C1607ec c1607ec, Context context) {
        this.f15200a = si;
        this.f15201b = c1607ec;
        this.f15202c = context;
    }

    public U a(Map<String, String> map) {
        return new U(this.f15200a.c(), this.f15201b.a(this.f15202c, new C1806mc()), map);
    }
}
