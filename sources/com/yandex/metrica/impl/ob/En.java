package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class En implements Fn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13949a;

    public En(int i10) {
        this.f13949a = i10;
    }

    public static Fn a(Fn... fnArr) {
        int iA = 0;
        for (Fn fn : fnArr) {
            if (fn != null) {
                iA = fn.a() + iA;
            }
        }
        return new En(iA);
    }

    @Override // com.yandex.metrica.impl.ob.Fn
    public int a() {
        return this.f13949a;
    }

    public String toString() {
        return h0.f.a(defpackage.a.a("BytesTruncatedInfo{bytesTruncated="), this.f13949a, '}');
    }
}
