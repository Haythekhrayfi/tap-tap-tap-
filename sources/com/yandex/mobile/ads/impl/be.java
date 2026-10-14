package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class be implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o91 f19248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ae f19249c;

    public be(ae aeVar, o91 o91Var) {
        this.f19249c = aeVar;
        this.f19248b = o91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f19249c.a()) {
            return;
        }
        String strA = this.f19248b.a(this.f19249c.f18888f);
        if (TextUtils.isEmpty(strA)) {
            this.f19249c.b(v4.f25832o);
            return;
        }
        this.f19249c.f18892j.b(v3.f25807j);
        this.f19249c.f18888f.c(this.f19248b.a());
        ae aeVar = this.f19249c;
        k2 k2Var = aeVar.f18888f;
        dx0 dx0Var = aeVar.f18898p;
        Context context = this.f19249c.f18884b;
        Objects.requireNonNull(dx0Var);
        k2Var.b(dx0.a(context));
        o91 o91Var = this.f19248b;
        ae aeVar2 = this.f19249c;
        xd xdVarA = this.f19249c.a(strA, o91Var.a(aeVar2.f18884b, aeVar2.f18888f, aeVar2.f18890h));
        int i10 = t6.f25286b;
        xdVarA.b((Object) toString());
        this.f19249c.f18885c.a(xdVarA);
    }
}
