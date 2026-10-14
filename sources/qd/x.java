package qd;

import fd.j0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient byte[][] f34942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient int[] f34943i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(byte[][] bArr, int[] iArr) {
        super(g.f34893g.f34894c);
        j0.i(bArr, "segments");
        j0.i(iArr, "directory");
        this.f34942h = bArr;
        this.f34943i = iArr;
    }

    @Override // qd.g
    public String a() {
        return o().a();
    }

    @Override // qd.g
    public g b(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = this.f34942h.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f34943i;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            messageDigest.update(this.f34942h[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        j0.h(bArrDigest, "digestBytes");
        return new g(bArrDigest);
    }

    @Override // qd.g
    public int c() {
        return this.f34943i[this.f34942h.length - 1];
    }

    @Override // qd.g
    public String d() {
        return o().d();
    }

    @Override // qd.g
    public byte[] e() {
        return n();
    }

    @Override // qd.g
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (gVar.c() == c() && g(0, gVar, 0, c())) {
                return true;
            }
        }
        return false;
    }

    @Override // qd.g
    public byte f(int i10) {
        d0.b(this.f34943i[this.f34942h.length - 1], i10, 1L);
        int iJ = fd.z.J(this, i10);
        int i11 = iJ == 0 ? 0 : this.f34943i[iJ - 1];
        int[] iArr = this.f34943i;
        byte[][] bArr = this.f34942h;
        return bArr[iJ][(i10 - i11) + iArr[bArr.length + iJ]];
    }

    @Override // qd.g
    public boolean g(int i10, g gVar, int i11, int i12) {
        j0.i(gVar, "other");
        if (i10 < 0 || i10 > c() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iJ = fd.z.J(this, i10);
        while (i10 < i13) {
            int i14 = iJ == 0 ? 0 : this.f34943i[iJ - 1];
            int[] iArr = this.f34943i;
            int i15 = iArr[iJ] - i14;
            int i16 = iArr[this.f34942h.length + iJ];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!gVar.h(i11, this.f34942h[iJ], (i10 - i14) + i16, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iJ++;
        }
        return true;
    }

    @Override // qd.g
    public boolean h(int i10, byte[] bArr, int i11, int i12) {
        j0.i(bArr, "other");
        if (i10 < 0 || i10 > c() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iJ = fd.z.J(this, i10);
        while (i10 < i13) {
            int i14 = iJ == 0 ? 0 : this.f34943i[iJ - 1];
            int[] iArr = this.f34943i;
            int i15 = iArr[iJ] - i14;
            int i16 = iArr[this.f34942h.length + iJ];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!d0.a(this.f34942h[iJ], (i10 - i14) + i16, bArr, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iJ++;
        }
        return true;
    }

    @Override // qd.g
    public int hashCode() {
        int i10 = this.f34895d;
        if (i10 != 0) {
            return i10;
        }
        int length = this.f34942h.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            int[] iArr = this.f34943i;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            byte[] bArr = this.f34942h[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.f34895d = i12;
        return i12;
    }

    @Override // qd.g
    public g k() {
        return o().k();
    }

    @Override // qd.g
    public void m(c cVar, int i10, int i11) {
        int i12 = i10 + i11;
        int iJ = fd.z.J(this, i10);
        while (i10 < i12) {
            int i13 = iJ == 0 ? 0 : this.f34943i[iJ - 1];
            int[] iArr = this.f34943i;
            int i14 = iArr[iJ] - i13;
            int i15 = iArr[this.f34942h.length + iJ];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = (i10 - i13) + i15;
            v vVar = new v(this.f34942h[iJ], i16, i16 + iMin, true, false);
            v vVar2 = cVar.f34878c;
            if (vVar2 == null) {
                vVar.f34937g = vVar;
                vVar.f34936f = vVar;
                cVar.f34878c = vVar;
            } else {
                v vVar3 = vVar2.f34937g;
                j0.f(vVar3);
                vVar3.b(vVar);
            }
            i10 += iMin;
            iJ++;
        }
        cVar.f34879d += (long) i11;
    }

    public byte[] n() {
        byte[] bArr = new byte[c()];
        int length = this.f34942h.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f34943i;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            int i15 = i14 - i11;
            kc.i.c(this.f34942h[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    public final g o() {
        return new g(n());
    }

    @Override // qd.g
    public String toString() {
        return o().toString();
    }
}
