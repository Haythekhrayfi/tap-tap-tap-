package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class vx0 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fy0 f26100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wx0 f26101b;

    public /* synthetic */ vx0(v0 v0Var, fy0 fy0Var) {
        this(v0Var, fy0Var, new wx0(v0Var));
    }

    public vx0(v0 v0Var, fy0 fy0Var, wx0 wx0Var) {
        fd.j0.i(v0Var, "adActivityListener");
        fd.j0.i(fy0Var, "closeVerificationController");
        fd.j0.i(wx0Var, "rewardController");
        this.f26100a = fy0Var;
        this.f26101b = wx0Var;
    }

    @Override // com.yandex.mobile.ads.impl.d1
    public final void a() {
        this.f26100a.a();
        this.f26101b.a();
    }
}
