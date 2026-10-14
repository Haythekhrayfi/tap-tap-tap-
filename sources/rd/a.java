package rd;

import ed.c;
import fd.j0;
import java.io.EOFException;
import qd.q;
import qd.v;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f35363a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(c.f29139b);
        j0.h(bytes, "this as java.lang.String).getBytes(charset)");
        f35363a = bytes;
    }

    public static final boolean a(v vVar, int i10, byte[] bArr, int i11, int i12) {
        int i13 = vVar.f34933c;
        byte[] bArr2 = vVar.f34931a;
        while (i11 < i12) {
            if (i10 == i13) {
                vVar = vVar.f34936f;
                j0.f(vVar);
                byte[] bArr3 = vVar.f34931a;
                bArr2 = bArr3;
                i10 = vVar.f34932b;
                i13 = vVar.f34933c;
            }
            if (bArr2[i10] != bArr[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public static final String b(qd.c cVar, long j10) throws EOFException {
        j0.i(cVar, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (cVar.g(j11) == ((byte) 13)) {
                String strP = cVar.p(j11);
                cVar.skip(2L);
                return strP;
            }
        }
        String strP2 = cVar.p(j10);
        cVar.skip(1L);
        return strP2;
    }

    public static final int c(qd.c cVar, q qVar, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        v vVar;
        j0.i(cVar, "<this>");
        j0.i(qVar, "options");
        v vVar2 = cVar.f34878c;
        if (vVar2 == null) {
            return z10 ? -2 : -1;
        }
        byte[] bArr = vVar2.f34931a;
        int i14 = vVar2.f34932b;
        int i15 = vVar2.f34933c;
        int[] iArr = qVar.f34915e;
        v vVar3 = vVar2;
        int i16 = -1;
        int i17 = 0;
        loop0: while (true) {
            int i18 = i17 + 1;
            int i19 = iArr[i17];
            int i20 = i18 + 1;
            int i21 = iArr[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (vVar3 == null) {
                break;
            }
            if (i19 >= 0) {
                i10 = i14 + 1;
                int i22 = bArr[i14] & 255;
                int i23 = i20 + i19;
                while (i20 != i23) {
                    if (i22 == iArr[i20]) {
                        i11 = iArr[i20 + i19];
                        if (i10 == i15) {
                            vVar3 = vVar3.f34936f;
                            j0.f(vVar3);
                            i10 = vVar3.f34932b;
                            bArr = vVar3.f34931a;
                            i15 = vVar3.f34933c;
                            if (vVar3 == vVar2) {
                                vVar3 = null;
                            }
                        }
                    } else {
                        i20++;
                    }
                }
                return i16;
            }
            int i24 = (i19 * (-1)) + i20;
            while (true) {
                int i25 = i14 + 1;
                int i26 = i20 + 1;
                if ((bArr[i14] & 255) != iArr[i20]) {
                    return i16;
                }
                boolean z11 = i26 == i24;
                if (i25 == i15) {
                    j0.f(vVar3);
                    v vVar4 = vVar3.f34936f;
                    j0.f(vVar4);
                    i13 = vVar4.f34932b;
                    byte[] bArr2 = vVar4.f34931a;
                    i12 = vVar4.f34933c;
                    if (vVar4 != vVar2) {
                        vVar = vVar4;
                        bArr = bArr2;
                    } else {
                        if (!z11) {
                            break loop0;
                        }
                        bArr = bArr2;
                        vVar = null;
                    }
                } else {
                    v vVar5 = vVar3;
                    i12 = i15;
                    i13 = i25;
                    vVar = vVar5;
                }
                if (z11) {
                    i11 = iArr[i26];
                    i10 = i13;
                    i15 = i12;
                    vVar3 = vVar;
                    break;
                }
                i14 = i13;
                i15 = i12;
                i20 = i26;
                vVar3 = vVar;
            }
            if (i11 >= 0) {
                return i11;
            }
            i17 = -i11;
            i14 = i10;
        }
        if (z10) {
            return -2;
        }
        return i16;
    }
}
