package com.yandex.mobile.ads.impl;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oo1 implements r80.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x8.a f23866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f23867e;

    public /* synthetic */ oo1(x8.a aVar, String str, int i10) {
        this.f23865c = i10;
        this.f23866d = aVar;
        this.f23867e = str;
    }

    @Override // com.yandex.mobile.ads.impl.r80.a
    public final void invoke(Object obj) {
        switch (this.f23865c) {
            case 0:
                x8.a aVar = this.f23866d;
                String str = this.f23867e;
                Objects.requireNonNull((x8) obj);
                break;
            default:
                x8.a aVar2 = this.f23866d;
                String str2 = this.f23867e;
                Objects.requireNonNull((x8) obj);
                break;
        }
    }
}
