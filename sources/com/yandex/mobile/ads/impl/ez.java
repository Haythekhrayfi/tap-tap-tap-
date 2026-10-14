package com.yandex.mobile.ads.impl;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class ez implements Callable<cz> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fz f20383b;

    public /* synthetic */ ez(String str) {
        this(str, new fz());
    }

    public ez(String str, fz fzVar) {
        fd.j0.i(str, "checkHost");
        fd.j0.i(fzVar, "hostAccessCheckerProvider");
        this.f20382a = str;
        this.f20383b = fzVar;
    }

    @Override // java.util.concurrent.Callable
    public final cz call() {
        boolean zA = this.f20383b.a().a(this.f20382a);
        StringBuilder sbA = v60.a("Host ");
        sbA.append(this.f20382a);
        sbA.append(" reachability is ");
        sbA.append(zA);
        x60.b(sbA.toString(), new Object[0]);
        return new cz(zA);
    }
}
