package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class j00 extends y51 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f00 f21887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f21888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qd.c f21889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f21890h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j00(String str, f00 f00Var, int i10, qd.c cVar, int i11, boolean z10) {
        super(str, true);
        this.f21887e = f00Var;
        this.f21888f = i10;
        this.f21889g = cVar;
        this.f21890h = i11;
    }

    @Override // com.yandex.mobile.ads.impl.y51
    public final long e() {
        try {
            du0 du0Var = this.f21887e.f20428l;
            cu0 cu0Var = (cu0) du0Var;
            cu0Var.a(this.f21890h, this.f21889g);
            this.f21887e.k().a(this.f21888f, as.f19051g);
            synchronized (this.f21887e) {
                this.f21887e.B.remove(Integer.valueOf(this.f21888f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
