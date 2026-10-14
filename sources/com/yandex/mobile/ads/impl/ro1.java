package com.yandex.mobile.ads.impl;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ro1 implements r80.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f24814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x8.a f24815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f24816e;

    public /* synthetic */ ro1(x8.a aVar, int i10, int i11) {
        this.f24814c = i11;
        if (i11 == 1) {
            this.f24815d = aVar;
            this.f24816e = i10;
        } else if (i11 != 2) {
            this.f24815d = aVar;
            this.f24816e = i10;
        } else {
            this.f24815d = aVar;
            this.f24816e = i10;
        }
    }

    @Override // com.yandex.mobile.ads.impl.r80.a
    public final void invoke(Object obj) {
        switch (this.f24814c) {
            case 0:
                x8.a aVar = this.f24815d;
                int i10 = this.f24816e;
                Objects.requireNonNull((x8) obj);
                break;
            case 1:
                x8.a aVar2 = this.f24815d;
                int i11 = this.f24816e;
                Objects.requireNonNull((x8) obj);
                break;
            case 2:
                x8.a aVar3 = this.f24815d;
                int i12 = this.f24816e;
                Objects.requireNonNull((x8) obj);
                break;
            default:
                x8.a aVar4 = this.f24815d;
                int i13 = this.f24816e;
                Objects.requireNonNull((x8) obj);
                break;
        }
    }
}
