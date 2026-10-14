package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Fn;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.tb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1979tb<R, M extends Fn> implements Fn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R f17444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f17445b;

    public C1979tb(R r10, M m10) {
        this.f17444a = r10;
        this.f17445b = m10;
    }

    @Override // com.yandex.metrica.impl.ob.Fn
    public int a() {
        return this.f17445b.a();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Result{result=");
        sbA.append(this.f17444a);
        sbA.append(", metaInfo=");
        sbA.append(this.f17445b);
        sbA.append('}');
        return sbA.toString();
    }
}
