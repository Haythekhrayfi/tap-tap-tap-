package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Hn extends En {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14165b;

    public Hn(int i10, int i11) {
        super(i11);
        this.f14165b = i10;
    }

    @Override // com.yandex.metrica.impl.ob.En
    public String toString() {
        StringBuilder sbA = defpackage.a.a("CollectionTrimInfo{itemsDropped=");
        sbA.append(this.f14165b);
        sbA.append(", bytesTruncated=");
        return h0.f.a(sbA, this.f13949a, '}');
    }
}
