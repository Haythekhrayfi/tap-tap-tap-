package com.yandex.mobile.ads.impl;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wo1 implements r80.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x8.a f26332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wq0 f26333e;

    public /* synthetic */ wo1(x8.a aVar, wq0 wq0Var, int i10) {
        this.f26331c = i10;
        this.f26332d = aVar;
        this.f26333e = wq0Var;
    }

    @Override // com.yandex.mobile.ads.impl.r80.a
    public final void invoke(Object obj) {
        switch (this.f26331c) {
            case 0:
                x8.a aVar = this.f26332d;
                wq0 wq0Var = this.f26333e;
                Objects.requireNonNull((x8) obj);
                break;
            default:
                kn.a(this.f26332d, this.f26333e, (x8) obj);
                break;
        }
    }
}
