package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.k7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1751k7 extends AbstractC1652g7 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private S2 f16569d;

    public C1751k7(Context context, S2 s10, AbstractC1652g7.a aVar, com.yandex.metrica.d dVar) {
        this(s10, aVar, dVar, new K0(context));
    }

    public C1751k7(S2 s10, AbstractC1652g7.a aVar, com.yandex.metrica.d dVar, K0 k10) {
        super(aVar, dVar, k10);
        this.f16569d = s10;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1652g7
    public void a(C1876p7 c1876p7) {
        this.f16569d.a().a(c1876p7);
    }
}
