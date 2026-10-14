package com.google.android.play.core.appupdate;

import android.content.Context;
import com.google.android.play.core.internal.cl;
import com.google.android.play.core.internal.cn;

/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private cn<Context> f11801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private cn<r> f11802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private cn<p> f11803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private cn<a> f11804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private cn<e> f11805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private cn<AppUpdateManager> f11806f;

    public /* synthetic */ y(g gVar) {
        i iVar = new i(gVar);
        this.f11801a = iVar;
        cn<r> cnVarA = cl.a(new s(iVar));
        this.f11802b = cnVarA;
        this.f11803c = cl.a(new q(this.f11801a, cnVarA));
        cn<a> cnVarA2 = cl.a(new b(this.f11801a));
        this.f11804d = cnVarA2;
        cn<e> cnVarA3 = cl.a(new f(this.f11803c, cnVarA2, this.f11801a));
        this.f11805e = cnVarA3;
        this.f11806f = cl.a(new h(cnVarA3));
    }

    public final AppUpdateManager a() {
        return this.f11806f.a();
    }
}
