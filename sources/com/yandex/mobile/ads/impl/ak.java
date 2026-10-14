package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class ak implements sa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sa0.a f18944a = new sa0.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sa0[] f18945b;

    public ak(sa0... sa0VarArr) {
        this.f18945b = sa0VarArr;
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    public final sa0.a a(int i10, int i11) {
        sa0[] sa0VarArr = this.f18945b;
        int length = sa0VarArr.length;
        int i12 = 0;
        while (i12 < length) {
            sa0.a aVarA = sa0VarArr[i12].a(i10, i11);
            int i13 = aVarA.f25006a;
            i12++;
            i11 = aVarA.f25007b;
            i10 = i13;
        }
        sa0.a aVar = this.f18944a;
        aVar.f25006a = i10;
        aVar.f25007b = i11;
        return aVar;
    }
}
