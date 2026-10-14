package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ee implements lm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f20228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<g81> f20229b = new ArrayList<>(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private pm f20231d;

    public ee(boolean z10) {
        this.f20228a = z10;
    }

    @Override // com.yandex.mobile.ads.impl.lm
    public final void a(g81 g81Var) {
        Objects.requireNonNull(g81Var);
        if (this.f20229b.contains(g81Var)) {
            return;
        }
        this.f20229b.add(g81Var);
        this.f20230c++;
    }

    public final void b(pm pmVar) {
        for (int i10 = 0; i10 < this.f20230c; i10++) {
            this.f20229b.get(i10).b();
        }
    }

    public final void c(int i10) {
        pm pmVar = this.f20231d;
        int i11 = da1.f19803a;
        for (int i12 = 0; i12 < this.f20230c; i12++) {
            this.f20229b.get(i12).a(pmVar, this.f20228a, i10);
        }
    }

    public final void c(pm pmVar) {
        this.f20231d = pmVar;
        for (int i10 = 0; i10 < this.f20230c; i10++) {
            this.f20229b.get(i10).b(pmVar, this.f20228a);
        }
    }

    public final void f() {
        pm pmVar = this.f20231d;
        int i10 = da1.f19803a;
        for (int i11 = 0; i11 < this.f20230c; i11++) {
            this.f20229b.get(i11).a(pmVar, this.f20228a);
        }
        this.f20231d = null;
    }
}
