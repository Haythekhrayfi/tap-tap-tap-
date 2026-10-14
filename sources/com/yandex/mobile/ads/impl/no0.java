package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class no0 implements ho0, vc.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mo0 f23520a;

    public no0(mo0 mo0Var) {
        this.f23520a = mo0Var;
    }

    @Override // com.yandex.mobile.ads.impl.ho0
    public final void a() {
        mo0.a(this.f23520a);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ho0) && (obj instanceof vc.h)) {
            return fd.j0.d(getFunctionDelegate(), ((vc.h) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // vc.h
    public final jc.b<?> getFunctionDelegate() {
        return new vc.k(0, this.f23520a, mo0.class, "onOmSdkJsControllerLoaded", "onOmSdkJsControllerLoaded()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
