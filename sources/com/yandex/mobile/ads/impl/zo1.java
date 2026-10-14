package com.yandex.mobile.ads.impl;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zo1 implements r80.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x8.a f27389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Exception f27390e;

    public /* synthetic */ zo1(x8.a aVar, Exception exc, int i10) {
        this.f27388c = i10;
        if (i10 == 1) {
            this.f27389d = aVar;
            this.f27390e = exc;
        } else if (i10 != 2) {
            this.f27389d = aVar;
            this.f27390e = exc;
        } else {
            this.f27389d = aVar;
            this.f27390e = exc;
        }
    }

    @Override // com.yandex.mobile.ads.impl.r80.a
    public final void invoke(Object obj) {
        switch (this.f27388c) {
            case 0:
                x8.a aVar = this.f27389d;
                Exception exc = this.f27390e;
                Objects.requireNonNull((x8) obj);
                break;
            case 1:
                x8.a aVar2 = this.f27389d;
                Exception exc2 = this.f27390e;
                Objects.requireNonNull((x8) obj);
                break;
            case 2:
                x8.a aVar3 = this.f27389d;
                Exception exc3 = this.f27390e;
                Objects.requireNonNull((x8) obj);
                break;
            default:
                x8.a aVar4 = this.f27389d;
                Exception exc4 = this.f27390e;
                Objects.requireNonNull((x8) obj);
                break;
        }
    }
}
