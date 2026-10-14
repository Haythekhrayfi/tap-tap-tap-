package com.yandex.mobile.ads.impl;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qo1 implements r80.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f24551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x8.a f24552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f24553e;

    public /* synthetic */ qo1(x8.a aVar, boolean z10, int i10) {
        this.f24551c = i10;
        if (i10 != 1) {
            this.f24552d = aVar;
            this.f24553e = z10;
        } else {
            this.f24552d = aVar;
            this.f24553e = z10;
        }
    }

    @Override // com.yandex.mobile.ads.impl.r80.a
    public final void invoke(Object obj) {
        switch (this.f24551c) {
            case 0:
                x8.a aVar = this.f24552d;
                boolean z10 = this.f24553e;
                Objects.requireNonNull((x8) obj);
                break;
            case 1:
                x8.a aVar2 = this.f24552d;
                boolean z11 = this.f24553e;
                Objects.requireNonNull((x8) obj);
                break;
            default:
                x8.a aVar3 = this.f24552d;
                boolean z12 = this.f24553e;
                Objects.requireNonNull((x8) obj);
                break;
        }
    }
}
