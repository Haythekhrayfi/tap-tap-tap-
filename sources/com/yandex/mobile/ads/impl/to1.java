package com.yandex.mobile.ads.impl;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class to1 implements r80.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x8.a f25424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f25425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f25426f;

    public /* synthetic */ to1(x8.a aVar, int i10, boolean z10) {
        this.f25423c = 0;
        this.f25424d = aVar;
        this.f25425e = i10;
        this.f25426f = z10;
    }

    public /* synthetic */ to1(x8.a aVar, boolean z10, int i10, int i11) {
        this.f25423c = i11;
        this.f25424d = aVar;
        this.f25426f = z10;
        this.f25425e = i10;
    }

    @Override // com.yandex.mobile.ads.impl.r80.a
    public final void invoke(Object obj) {
        switch (this.f25423c) {
            case 0:
                x8.a aVar = this.f25424d;
                int i10 = this.f25425e;
                boolean z10 = this.f25426f;
                Objects.requireNonNull((x8) obj);
                break;
            case 1:
                x8.a aVar2 = this.f25424d;
                boolean z11 = this.f25426f;
                int i11 = this.f25425e;
                Objects.requireNonNull((x8) obj);
                break;
            default:
                x8.a aVar3 = this.f25424d;
                boolean z12 = this.f25426f;
                int i12 = this.f25425e;
                Objects.requireNonNull((x8) obj);
                break;
        }
    }
}
