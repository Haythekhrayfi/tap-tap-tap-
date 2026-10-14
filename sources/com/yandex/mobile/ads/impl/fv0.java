package com.yandex.mobile.ads.impl;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class fv0 implements yc.b<Object, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Object> f20872a;

    public fv0(Object obj) {
        this.f20872a = new WeakReference<>(obj);
    }

    @Override // yc.b
    public final Object getValue(Object obj, cd.i<?> iVar) {
        fd.j0.i(iVar, "property");
        return this.f20872a.get();
    }

    @Override // yc.b
    public final void setValue(Object obj, cd.i<?> iVar, Object obj2) {
        fd.j0.i(iVar, "property");
        this.f20872a = new WeakReference<>(obj2);
    }
}
