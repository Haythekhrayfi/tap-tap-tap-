package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dq1 implements z7.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vc.a0 f19972b;

    public /* synthetic */ dq1(vc.a0 a0Var, int i10) {
        this.f19971a = i10;
        this.f19972b = a0Var;
    }

    @Override // z7.e
    public final void cancel() {
        switch (this.f19971a) {
            case 0:
                sp.b(this.f19972b);
                break;
            default:
                sp.a(this.f19972b);
                break;
        }
    }
}
