package com.yandex.metrica.impl.ob;

import org.json.JSONException;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.i4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1699i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C9 f16322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I8 f16323b;

    public C1699i4(I8 i10) {
        this(i10, new C9(i10));
    }

    public C1699i4(I8 i10, C9 c10) {
        this.f16323b = i10;
        this.f16322a = c10;
    }

    public int a() {
        int iD = this.f16323b.d();
        this.f16323b.a(iD + 1);
        return iD;
    }

    public int a(int i10) throws JSONException {
        int iA = this.f16322a.a(i10);
        this.f16322a.a(i10, iA + 1);
        return iA;
    }
}
