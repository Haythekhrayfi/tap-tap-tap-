package c2;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3541d;

    public b(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f3538a = z10;
        this.f3539b = z11;
        this.f3540c = z12;
        this.f3541d = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3538a == bVar.f3538a && this.f3539b == bVar.f3539b && this.f3540c == bVar.f3540c && this.f3541d == bVar.f3541d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r10 = this.f3538a;
        int i10 = r10;
        if (this.f3539b) {
            i10 = r10 + 16;
        }
        int i11 = i10;
        if (this.f3540c) {
            i11 = i10 + 256;
        }
        return this.f3541d ? i11 + 4096 : i11;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f3538a), Boolean.valueOf(this.f3539b), Boolean.valueOf(this.f3540c), Boolean.valueOf(this.f3541d));
    }
}
