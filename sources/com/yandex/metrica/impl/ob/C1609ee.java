package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1609ee implements InterfaceC1584de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f16058a;

    public C1609ee(boolean z10) {
        this.f16058a = z10;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1584de
    public boolean a(String str) {
        if ("android.permission.ACCESS_FINE_LOCATION".equals(str) || "android.permission.ACCESS_COARSE_LOCATION".equals(str)) {
            return this.f16058a;
        }
        return true;
    }

    public String toString() {
        return androidx.recyclerview.widget.s.a(defpackage.a.a("LocationFlagStrategy{mEnabled="), this.f16058a, '}');
    }
}
