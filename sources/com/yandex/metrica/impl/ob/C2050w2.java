package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2050w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f17755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f17756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.yandex.metrica.c f17757e;

    public C2050w2(int i10, int i11, int i12, float f10, com.yandex.metrica.c cVar) {
        this.f17753a = i10;
        this.f17754b = i11;
        this.f17755c = i12;
        this.f17756d = f10;
        this.f17757e = cVar;
    }

    public final com.yandex.metrica.c a() {
        return this.f17757e;
    }

    public final int b() {
        return this.f17755c;
    }

    public final int c() {
        return this.f17754b;
    }

    public final float d() {
        return this.f17756d;
    }

    public final int e() {
        return this.f17753a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2050w2)) {
            return false;
        }
        C2050w2 c2050w2 = (C2050w2) obj;
        return this.f17753a == c2050w2.f17753a && this.f17754b == c2050w2.f17754b && this.f17755c == c2050w2.f17755c && Float.compare(this.f17756d, c2050w2.f17756d) == 0 && fd.j0.d(this.f17757e, c2050w2.f17757e);
    }

    public int hashCode() {
        int iFloatToIntBits = (Float.floatToIntBits(this.f17756d) + (((((this.f17753a * 31) + this.f17754b) * 31) + this.f17755c) * 31)) * 31;
        com.yandex.metrica.c cVar = this.f17757e;
        return iFloatToIntBits + (cVar != null ? cVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ScreenInfo(width=");
        sbA.append(this.f17753a);
        sbA.append(", height=");
        sbA.append(this.f17754b);
        sbA.append(", dpi=");
        sbA.append(this.f17755c);
        sbA.append(", scaleFactor=");
        sbA.append(this.f17756d);
        sbA.append(", deviceType=");
        sbA.append(this.f17757e);
        sbA.append(")");
        return sbA.toString();
    }
}
