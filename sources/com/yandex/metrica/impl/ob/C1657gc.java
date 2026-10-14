package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.gc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1657gc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1532bc f16203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1532bc f16204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1532bc f16205c;

    public C1657gc() {
        this(new C1532bc(), new C1532bc(), new C1532bc());
    }

    public C1657gc(C1532bc c1532bc, C1532bc c1532bc2, C1532bc c1532bc3) {
        this.f16203a = c1532bc;
        this.f16204b = c1532bc2;
        this.f16205c = c1532bc3;
    }

    public C1532bc a() {
        return this.f16203a;
    }

    public C1532bc b() {
        return this.f16204b;
    }

    public C1532bc c() {
        return this.f16205c;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("AdvertisingIdsHolder{mGoogle=");
        sbA.append(this.f16203a);
        sbA.append(", mHuawei=");
        sbA.append(this.f16204b);
        sbA.append(", yandex=");
        sbA.append(this.f16205c);
        sbA.append('}');
        return sbA.toString();
    }
}
