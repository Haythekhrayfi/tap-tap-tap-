package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hp1 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oc0.a f21484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oc0 f21485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v80 f21486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dc0 f21487g;

    public /* synthetic */ hp1(oc0.a aVar, oc0 oc0Var, v80 v80Var, dc0 dc0Var, int i10) {
        this.f21483c = i10;
        this.f21484d = aVar;
        this.f21485e = oc0Var;
        this.f21486f = v80Var;
        this.f21487g = dc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21483c) {
            case 0:
                this.f21484d.c(this.f21485e, this.f21486f, this.f21487g);
                break;
            case 1:
                this.f21484d.a(this.f21485e, this.f21486f, this.f21487g);
                break;
            default:
                this.f21484d.b(this.f21485e, this.f21486f, this.f21487g);
                break;
        }
    }
}
