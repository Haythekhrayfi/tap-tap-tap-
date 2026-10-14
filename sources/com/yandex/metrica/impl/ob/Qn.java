package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Fn;

/* JADX INFO: loaded from: classes.dex */
public class Qn<V, M extends Fn> implements Fn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V f14828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f14829b;

    public Qn(V v10, M m10) {
        this.f14828a = v10;
        this.f14829b = m10;
    }

    @Override // com.yandex.metrica.impl.ob.Fn
    public int a() {
        return this.f14829b.a();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("TrimmingResult{value=");
        sbA.append(this.f14828a);
        sbA.append(", metaInfo=");
        sbA.append(this.f14829b);
        sbA.append('}');
        return sbA.toString();
    }
}
