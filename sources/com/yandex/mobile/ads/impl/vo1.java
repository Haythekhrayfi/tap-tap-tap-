package com.yandex.mobile.ads.impl;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vo1 implements r80.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x8.a f26051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v80 f26052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dc0 f26053f;

    public /* synthetic */ vo1(x8.a aVar, v80 v80Var, dc0 dc0Var, int i10) {
        this.f26050c = i10;
        if (i10 != 1) {
            this.f26051d = aVar;
            this.f26052e = v80Var;
            this.f26053f = dc0Var;
        } else {
            this.f26051d = aVar;
            this.f26052e = v80Var;
            this.f26053f = dc0Var;
        }
    }

    @Override // com.yandex.mobile.ads.impl.r80.a
    public final void invoke(Object obj) {
        switch (this.f26050c) {
            case 0:
                x8.a aVar = this.f26051d;
                v80 v80Var = this.f26052e;
                dc0 dc0Var = this.f26053f;
                Objects.requireNonNull((x8) obj);
                break;
            case 1:
                x8.a aVar2 = this.f26051d;
                v80 v80Var2 = this.f26052e;
                dc0 dc0Var2 = this.f26053f;
                Objects.requireNonNull((x8) obj);
                break;
            default:
                x8.a aVar3 = this.f26051d;
                v80 v80Var3 = this.f26052e;
                dc0 dc0Var3 = this.f26053f;
                Objects.requireNonNull((x8) obj);
                break;
        }
    }
}
