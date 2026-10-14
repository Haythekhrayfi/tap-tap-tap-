package com.yandex.mobile.ads.impl;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class no1 implements r80.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x8.a f23522d;

    public /* synthetic */ no1(x8.a aVar, int i10) {
        this.f23521c = i10;
        if (i10 == 1) {
            this.f23522d = aVar;
            return;
        }
        if (i10 == 2) {
            this.f23522d = aVar;
        } else if (i10 != 3) {
            this.f23522d = aVar;
        } else {
            this.f23522d = aVar;
        }
    }

    @Override // com.yandex.mobile.ads.impl.r80.a
    public final void invoke(Object obj) {
        switch (this.f23521c) {
            case 0:
                x8.a aVar = this.f23522d;
                Objects.requireNonNull((x8) obj);
                break;
            case 1:
                x8.a aVar2 = this.f23522d;
                Objects.requireNonNull((x8) obj);
                break;
            case 2:
                x8.a aVar3 = this.f23522d;
                Objects.requireNonNull((x8) obj);
                break;
            case 3:
                x8.a aVar4 = this.f23522d;
                Objects.requireNonNull((x8) obj);
                break;
            default:
                x8.a aVar5 = this.f23522d;
                Objects.requireNonNull((x8) obj);
                break;
        }
    }
}
