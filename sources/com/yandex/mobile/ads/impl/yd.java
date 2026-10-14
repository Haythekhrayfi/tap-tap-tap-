package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdRequest;

/* JADX INFO: loaded from: classes3.dex */
final class yd implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdRequest f26772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o91 f26773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ae f26774d;

    public yd(ae aeVar, AdRequest adRequest, o91 o91Var) {
        this.f26774d = aeVar;
        this.f26772b = adRequest;
        this.f26773c = o91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ae aeVar = this.f26774d;
        AdRequest adRequest = this.f26772b;
        synchronized (aeVar) {
            aeVar.f18888f.a(adRequest);
        }
        t2 t2VarT = this.f26774d.t();
        if (t2VarT != null) {
            this.f26774d.b(t2VarT);
            return;
        }
        ae aeVar2 = this.f26774d;
        aeVar2.f18894l.a(new zd(aeVar2, this.f26773c));
    }
}
