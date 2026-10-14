package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.oc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1856oc implements InterfaceC1831nc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f17005c = 0;

    public C1856oc(int i10, int i11) {
        this.f17003a = i10;
        this.f17004b = i11;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1831nc
    public int a() {
        return this.f17004b;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1831nc
    public boolean b() {
        int i10 = this.f17005c;
        this.f17005c = i10 + 1;
        return i10 < this.f17003a;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1831nc
    public void c() {
        this.f17005c = 0;
    }
}
