package com.google.android.play.core.splitinstall;

import android.content.Context;
import com.google.android.play.core.internal.cl;
import com.google.android.play.core.internal.cn;
import com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private cn<Context> f12423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private cn<av> f12424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private cn<t> f12425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private cn<p> f12426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private cn<ax> f12427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private cn<w> f12428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private cn<File> f12429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private cn<FakeSplitInstallManager> f12430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private cn<i> f12431i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private cn<SplitInstallManager> f12432j;

    public /* synthetic */ c(y yVar) {
        z zVar = new z(yVar);
        this.f12423a = zVar;
        this.f12424b = cl.a(new aw(zVar));
        this.f12425c = cl.a(new ab(yVar));
        this.f12426d = cl.a(q.a(this.f12423a));
        cn<ax> cnVarA = cl.a(new ay(this.f12423a));
        this.f12427e = cnVarA;
        this.f12428f = cl.a(new x(this.f12424b, this.f12425c, this.f12426d, cnVarA));
        cn<File> cnVarA2 = cl.a(new aa(this.f12423a));
        this.f12429g = cnVarA2;
        cn<FakeSplitInstallManager> cnVarA3 = cl.a(new com.google.android.play.core.splitinstall.testing.k(this.f12423a, cnVarA2, this.f12426d));
        this.f12430h = cnVarA3;
        cn<i> cnVarA4 = cl.a(new j(this.f12428f, cnVarA3, this.f12429g));
        this.f12431i = cnVarA4;
        this.f12432j = cl.a(new ac(yVar, cnVarA4));
    }

    @Override // com.google.android.play.core.splitinstall.m
    public final SplitInstallManager a() {
        return this.f12432j.a();
    }

    @Override // com.google.android.play.core.splitinstall.m
    public final File b() {
        return this.f12429g.a();
    }
}
