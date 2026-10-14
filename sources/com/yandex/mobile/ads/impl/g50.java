package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class g50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a20 f20945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w3 f20946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final jb f20947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o20 f20948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ol f20949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final q20 f20950f;

    public interface a {
    }

    public g50(a20 a20Var, w3 w3Var) {
        fd.j0.i(a20Var, "imageLoadManager");
        fd.j0.i(w3Var, "adLoadingPhasesManager");
        this.f20945a = a20Var;
        this.f20946b = w3Var;
        this.f20947c = new jb();
        this.f20948d = new o20();
        this.f20949e = new ol();
        this.f20950f = new q20();
    }

    public final void a(sc1 sc1Var, g20 g20Var, t50 t50Var) {
        fd.j0.i(sc1Var, "videoAdInfo");
        fd.j0.i(g20Var, "imageProvider");
        fd.j0.i(t50Var, "loadListener");
        ol olVar = this.f20949e;
        nl nlVarA = sc1Var.a();
        fd.j0.h(nlVarA, "videoAdInfo.creative");
        Objects.requireNonNull(olVar);
        List listA = ol.a(nlVarA);
        HashSet hashSetA = this.f20950f.a(listA, (m80) null);
        this.f20946b.b(v3.f25805h);
        this.f20945a.a(hashSetA, new h50(this, listA, g20Var, t50Var, sc1Var));
    }
}
