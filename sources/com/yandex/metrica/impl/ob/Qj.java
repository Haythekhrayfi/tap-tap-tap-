package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellInfo;

/* JADX WARN: Unexpected interfaces in signature: [com.yandex.metrica.impl.ob.a0] */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(17)
public abstract class Qj<T extends CellInfo> implements Object<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile C1961si f14821b;

    public Qj() {
        StringBuilder sbA = defpackage.a.a("[");
        sbA.append(getClass().getName());
        sbA.append("]");
        this.f14820a = sbA.toString();
    }

    private boolean b(T t10) {
        C1961si c1961si = this.f14821b;
        if (c1961si == null || !c1961si.f17356u) {
            return false;
        }
        return !c1961si.f17357v || t10.isRegistered();
    }

    public void a(T t10, Vj.a aVar) {
        b(t10, aVar);
        if (b(t10)) {
            c(t10, aVar);
        }
    }

    public void a(C1961si c1961si) {
        this.f14821b = c1961si;
    }

    public abstract void b(T t10, Vj.a aVar);

    public abstract void c(T t10, Vj.a aVar);
}
