package h5;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends a0.d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f30755b;

    public static final class b extends a0.d.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f30756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f30757b;

        public a0.d.b a() {
            String strA = this.f30756a == null ? " filename" : "";
            if (this.f30757b == null) {
                strA = i.f.a(strA, " contents");
            }
            if (strA.isEmpty()) {
                return new f(this.f30756a, this.f30757b, null);
            }
            throw new IllegalStateException(i.f.a("Missing required properties:", strA));
        }

        public a0.d.b.a b(byte[] bArr) {
            Objects.requireNonNull(bArr, "Null contents");
            this.f30757b = bArr;
            return this;
        }

        public a0.d.b.a c(String str) {
            Objects.requireNonNull(str, "Null filename");
            this.f30756a = str;
            return this;
        }
    }

    public f(String str, byte[] bArr, a aVar) {
        this.f30754a = str;
        this.f30755b = bArr;
    }

    @Override // h5.a0.d.b
    public byte[] a() {
        return this.f30755b;
    }

    @Override // h5.a0.d.b
    public String b() {
        return this.f30754a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.d.b)) {
            return false;
        }
        a0.d.b bVar = (a0.d.b) obj;
        if (this.f30754a.equals(bVar.b())) {
            if (Arrays.equals(this.f30755b, bVar instanceof f ? ((f) bVar).f30755b : bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f30754a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f30755b);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("File{filename=");
        sbA.append(this.f30754a);
        sbA.append(", contents=");
        sbA.append(Arrays.toString(this.f30755b));
        sbA.append("}");
        return sbA.toString();
    }
}
