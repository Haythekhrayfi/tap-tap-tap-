package qd;

import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.a f34890a = new c.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f34891b = -1234567890;

    public static final boolean a(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        j0.i(bArr, "a");
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            StringBuilder sbA = i2.a.a("size=", j10, " offset=");
            sbA.append(j11);
            sbA.append(" byteCount=");
            sbA.append(j12);
            throw new ArrayIndexOutOfBoundsException(sbA.toString());
        }
    }

    public static final String c(byte b10) {
        char[] cArr = rd.b.f35364a;
        return new String(new char[]{cArr[(b10 >> 4) & 15], cArr[b10 & 15]});
    }
}
