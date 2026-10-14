package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class ck<T> implements cn<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private cn<T> f12291a;

    public static <T> void a(cn<T> cnVar, cn<T> cnVar2) {
        bq.a(cnVar2);
        ck ckVar = (ck) cnVar;
        if (ckVar.f12291a != null) {
            throw new IllegalStateException();
        }
        ckVar.f12291a = cnVar2;
    }

    @Override // com.google.android.play.core.internal.cn
    public final T a() {
        cn<T> cnVar = this.f12291a;
        if (cnVar != null) {
            return cnVar.a();
        }
        throw new IllegalStateException();
    }
}
