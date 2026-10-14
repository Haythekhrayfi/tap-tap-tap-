package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class cn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yv f19558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yv f19559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19561e;

    public cn(String str, yv yvVar, yv yvVar2, int i10, int i11) {
        pa.a(i10 == 0 || i11 == 0);
        this.f19557a = pa.a(str);
        this.f19558b = (yv) pa.a(yvVar);
        this.f19559c = (yv) pa.a(yvVar2);
        this.f19560d = i10;
        this.f19561e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cn.class != obj.getClass()) {
            return false;
        }
        cn cnVar = (cn) obj;
        return this.f19560d == cnVar.f19560d && this.f19561e == cnVar.f19561e && this.f19557a.equals(cnVar.f19557a) && this.f19558b.equals(cnVar.f19558b) && this.f19559c.equals(cnVar.f19559c);
    }

    public final int hashCode() {
        return this.f19559c.hashCode() + ((this.f19558b.hashCode() + z11.a(this.f19557a, (((this.f19560d + 527) * 31) + this.f19561e) * 31, 31)) * 31);
    }
}
