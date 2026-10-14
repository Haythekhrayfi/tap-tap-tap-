package com.yandex.mobile.ads.impl;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uo1 implements r80.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25717c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x8.a f25718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f25719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f25720f;

    public /* synthetic */ uo1(x8.a aVar, int i10, long j10) {
        this.f25718d = aVar;
        this.f25720f = i10;
        this.f25719e = j10;
    }

    public /* synthetic */ uo1(x8.a aVar, long j10, int i10) {
        this.f25718d = aVar;
        this.f25719e = j10;
        this.f25720f = i10;
    }

    @Override // com.yandex.mobile.ads.impl.r80.a
    public final void invoke(Object obj) {
        switch (this.f25717c) {
            case 0:
                x8.a aVar = this.f25718d;
                long j10 = this.f25719e;
                int i10 = this.f25720f;
                Objects.requireNonNull((x8) obj);
                break;
            default:
                x8.a aVar2 = this.f25718d;
                int i11 = this.f25720f;
                long j11 = this.f25719e;
                Objects.requireNonNull((x8) obj);
                break;
        }
    }
}
