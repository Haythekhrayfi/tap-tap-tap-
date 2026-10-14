package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vp1 implements r80.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f26060e;

    public /* synthetic */ vp1(bc0 bc0Var, int i10) {
        this.f26058c = 2;
        this.f26059d = bc0Var;
        this.f26060e = i10;
    }

    public /* synthetic */ vp1(xq0 xq0Var, int i10, int i11) {
        this.f26058c = i11;
        this.f26059d = xq0Var;
        this.f26060e = i10;
    }

    @Override // com.yandex.mobile.ads.impl.r80.a
    public final void invoke(Object obj) {
        switch (this.f26058c) {
            case 0:
                rs.a((xq0) this.f26059d, this.f26060e, (dr0.b) obj);
                break;
            case 1:
                rs.b((xq0) this.f26059d, this.f26060e, (dr0.b) obj);
                break;
            default:
                ((dr0.b) obj).a((bc0) this.f26059d, this.f26060e);
                break;
        }
    }
}
