package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2051w3 implements InterfaceC1992u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q9<C1921r3> f17758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C1921r3 f17759b;

    public C2051w3(Context context) {
        this((Q9<C1921r3>) Ma.b.a(C1921r3.class).a(context));
    }

    public C2051w3(Q9<C1921r3> q10) {
        this.f17758a = q10;
        this.f17759b = (C1921r3) q10.b();
    }

    public List<ca.a> a() {
        return this.f17759b.f17203a;
    }

    public void a(List<ca.a> list, boolean z10) {
        for (ca.a aVar : list) {
        }
        C1921r3 c1921r3 = new C1921r3(list, z10);
        this.f17759b = c1921r3;
        this.f17758a.a(c1921r3);
    }

    public boolean b() {
        return this.f17759b.f17204b;
    }
}
