package com.yandex.metrica.impl.ob;

import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.id, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1708id {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<M.b.a> f16343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<E.a> f16344b;

    public C1708id(List<M.b.a> list, List<E.a> list2) {
        this.f16343a = list;
        this.f16344b = list2;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Preconditions{possibleChargeTypes=");
        sbA.append(this.f16343a);
        sbA.append(", appStatuses=");
        return l1.f.a(sbA, this.f16344b, '}');
    }
}
