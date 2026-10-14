package h0;

import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f30458e = new g(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f30462d;

    public static class a {
        public static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    public g(int i10, int i11, int i12, int i13) {
        this.f30459a = i10;
        this.f30460b = i11;
        this.f30461c = i12;
        this.f30462d = i13;
    }

    public static g a(g gVar, g gVar2) {
        return b(Math.max(gVar.f30459a, gVar2.f30459a), Math.max(gVar.f30460b, gVar2.f30460b), Math.max(gVar.f30461c, gVar2.f30461c), Math.max(gVar.f30462d, gVar2.f30462d));
    }

    public static g b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f30458e : new g(i10, i11, i12, i13);
    }

    public static g c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets d() {
        return a.a(this.f30459a, this.f30460b, this.f30461c, this.f30462d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f30462d == gVar.f30462d && this.f30459a == gVar.f30459a && this.f30461c == gVar.f30461c && this.f30460b == gVar.f30460b;
    }

    public int hashCode() {
        return (((((this.f30459a * 31) + this.f30460b) * 31) + this.f30461c) * 31) + this.f30462d;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Insets{left=");
        sbA.append(this.f30459a);
        sbA.append(", top=");
        sbA.append(this.f30460b);
        sbA.append(", right=");
        sbA.append(this.f30461c);
        sbA.append(", bottom=");
        return f.a(sbA, this.f30462d, '}');
    }
}
