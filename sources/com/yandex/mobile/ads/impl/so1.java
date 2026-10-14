package com.yandex.mobile.ads.impl;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class so1 implements r80.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x8.a f25148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f25149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f25150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f25151g;

    public /* synthetic */ so1(x8.a aVar, int i10, long j10, long j11, int i11) {
        this.f25147c = i11;
        this.f25148d = aVar;
        this.f25149e = i10;
        this.f25150f = j10;
        this.f25151g = j11;
    }

    @Override // com.yandex.mobile.ads.impl.r80.a
    public final void invoke(Object obj) {
        switch (this.f25147c) {
            case 0:
                x8.a aVar = this.f25148d;
                int i10 = this.f25149e;
                long j10 = this.f25150f;
                long j11 = this.f25151g;
                Objects.requireNonNull((x8) obj);
                break;
            default:
                kn.b(this.f25148d, this.f25149e, this.f25150f, this.f25151g, (x8) obj);
                break;
        }
    }
}
