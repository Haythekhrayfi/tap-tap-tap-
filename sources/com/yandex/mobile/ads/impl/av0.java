package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class av0 extends y51 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bv0 f19067e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av0(bv0 bv0Var, String str) {
        super(str);
        this.f19067e = bv0Var;
    }

    @Override // com.yandex.mobile.ads.impl.y51
    public final long e() {
        return this.f19067e.a(System.nanoTime());
    }
}
