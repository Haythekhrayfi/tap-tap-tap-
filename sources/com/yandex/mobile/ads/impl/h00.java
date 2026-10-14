package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class h00 extends y51 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f00 f21259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f21260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21261g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h00(String str, f00 f00Var, int i10, int i11) {
        super(str, true);
        this.f21259e = f00Var;
        this.f21260f = i10;
        this.f21261g = i11;
    }

    @Override // com.yandex.mobile.ads.impl.y51
    public final long e() {
        this.f21259e.a(this.f21260f, this.f21261g, true);
        return -1L;
    }
}
