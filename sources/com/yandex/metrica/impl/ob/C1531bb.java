package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.bb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1531bb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1556cb f15823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1496a1 f15824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Om f15825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final R2 f15826f;

    public C1531bb(Context context, String str, InterfaceC1556cb interfaceC1556cb, InterfaceC1496a1 interfaceC1496a1) {
        this(context, str, interfaceC1556cb, interfaceC1496a1, new Nm(), new R2());
    }

    public C1531bb(Context context, String str, InterfaceC1556cb interfaceC1556cb, InterfaceC1496a1 interfaceC1496a1, Om om, R2 r10) {
        this.f15821a = context;
        this.f15822b = str;
        this.f15823c = interfaceC1556cb;
        this.f15824d = interfaceC1496a1;
        this.f15825e = om;
        this.f15826f = r10;
    }

    public boolean a(Wa wa2) {
        long jB = this.f15825e.b();
        if (wa2 == null) {
            return false;
        }
        boolean z10 = true;
        boolean z11 = jB <= wa2.f15379a;
        if (!z11) {
            z10 = z11;
        } else if (this.f15824d.a() + jB > wa2.f15379a) {
            z10 = false;
        }
        if (z10) {
            return this.f15826f.b(this.f15823c.a(new D9(Qa.a(this.f15821a).g())), wa2.f15380b, androidx.activity.k.a(new StringBuilder(), this.f15822b, " diagnostics event"));
        }
        return false;
    }
}
