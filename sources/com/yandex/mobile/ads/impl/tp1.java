package com.yandex.mobile.ads.impl;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tp1 implements r80.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25433c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f25435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f25436f;

    public /* synthetic */ tp1(int i10, dr0.c cVar, dr0.c cVar2) {
        this.f25434d = i10;
        this.f25435e = cVar;
        this.f25436f = cVar2;
    }

    public /* synthetic */ tp1(x8.a aVar, bc0 bc0Var, int i10) {
        this.f25435e = aVar;
        this.f25436f = bc0Var;
        this.f25434d = i10;
    }

    @Override // com.yandex.mobile.ads.impl.r80.a
    public final void invoke(Object obj) {
        switch (this.f25433c) {
            case 0:
                rs.a(this.f25434d, (dr0.c) this.f25435e, (dr0.c) this.f25436f, (dr0.b) obj);
                break;
            default:
                int i10 = this.f25434d;
                Objects.requireNonNull((x8) obj);
                break;
        }
    }
}
