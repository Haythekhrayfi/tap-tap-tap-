package com.yandex.mobile.ads.impl;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xo1 implements r80.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x8.a f26576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ym f26577e;

    public /* synthetic */ xo1(x8.a aVar, ym ymVar, int i10) {
        this.f26575c = i10;
        if (i10 == 1) {
            this.f26576d = aVar;
            this.f26577e = ymVar;
        } else if (i10 != 2) {
            this.f26576d = aVar;
            this.f26577e = ymVar;
        } else {
            this.f26576d = aVar;
            this.f26577e = ymVar;
        }
    }

    @Override // com.yandex.mobile.ads.impl.r80.a
    public final void invoke(Object obj) {
        switch (this.f26575c) {
            case 0:
                x8.a aVar = this.f26576d;
                ym ymVar = this.f26577e;
                Objects.requireNonNull((x8) obj);
                break;
            case 1:
                x8.a aVar2 = this.f26576d;
                ym ymVar2 = this.f26577e;
                Objects.requireNonNull((x8) obj);
                break;
            case 2:
                kn.c(this.f26576d, this.f26577e, (x8) obj);
                break;
            default:
                x8.a aVar3 = this.f26576d;
                ym ymVar3 = this.f26577e;
                Objects.requireNonNull((x8) obj);
                break;
        }
    }
}
