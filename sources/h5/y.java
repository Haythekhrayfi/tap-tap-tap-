package h5;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends c0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f30917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f30918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f30919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f30920g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f30921h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f30922i;

    public y(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f30914a = i10;
        Objects.requireNonNull(str, "Null model");
        this.f30915b = str;
        this.f30916c = i11;
        this.f30917d = j10;
        this.f30918e = j11;
        this.f30919f = z10;
        this.f30920g = i12;
        Objects.requireNonNull(str2, "Null manufacturer");
        this.f30921h = str2;
        Objects.requireNonNull(str3, "Null modelClass");
        this.f30922i = str3;
    }

    @Override // h5.c0.b
    public int a() {
        return this.f30914a;
    }

    @Override // h5.c0.b
    public int b() {
        return this.f30916c;
    }

    @Override // h5.c0.b
    public long c() {
        return this.f30918e;
    }

    @Override // h5.c0.b
    public boolean d() {
        return this.f30919f;
    }

    @Override // h5.c0.b
    public String e() {
        return this.f30921h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0.b)) {
            return false;
        }
        c0.b bVar = (c0.b) obj;
        return this.f30914a == bVar.a() && this.f30915b.equals(bVar.f()) && this.f30916c == bVar.b() && this.f30917d == bVar.i() && this.f30918e == bVar.c() && this.f30919f == bVar.d() && this.f30920g == bVar.h() && this.f30921h.equals(bVar.e()) && this.f30922i.equals(bVar.g());
    }

    @Override // h5.c0.b
    public String f() {
        return this.f30915b;
    }

    @Override // h5.c0.b
    public String g() {
        return this.f30922i;
    }

    @Override // h5.c0.b
    public int h() {
        return this.f30920g;
    }

    public int hashCode() {
        int iHashCode = (((((this.f30914a ^ 1000003) * 1000003) ^ this.f30915b.hashCode()) * 1000003) ^ this.f30916c) * 1000003;
        long j10 = this.f30917d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f30918e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f30919f ? 1231 : 1237)) * 1000003) ^ this.f30920g) * 1000003) ^ this.f30921h.hashCode()) * 1000003) ^ this.f30922i.hashCode();
    }

    @Override // h5.c0.b
    public long i() {
        return this.f30917d;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("DeviceData{arch=");
        sbA.append(this.f30914a);
        sbA.append(", model=");
        sbA.append(this.f30915b);
        sbA.append(", availableProcessors=");
        sbA.append(this.f30916c);
        sbA.append(", totalRam=");
        sbA.append(this.f30917d);
        sbA.append(", diskSpace=");
        sbA.append(this.f30918e);
        sbA.append(", isEmulator=");
        sbA.append(this.f30919f);
        sbA.append(", state=");
        sbA.append(this.f30920g);
        sbA.append(", manufacturer=");
        sbA.append(this.f30921h);
        sbA.append(", modelClass=");
        return androidx.activity.k.a(sbA, this.f30922i, "}");
    }
}
