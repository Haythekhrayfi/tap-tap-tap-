package qd;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class g implements Serializable, Comparable<g> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f34892f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f34893g = new g(new byte[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f34894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient int f34895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient String f34896e;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public static g e(a aVar, byte[] bArr, int i10, int i11, int i12) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = d0.f34891b;
            }
            Objects.requireNonNull(aVar);
            c.a aVar2 = d0.f34890a;
            if (i11 == d0.f34891b) {
                i11 = bArr.length;
            }
            d0.b(bArr.length, i10, i11);
            return new g(kc.i.g(bArr, i10, i11 + i10));
        }

        /* JADX WARN: Code duplicated, block: B:75:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
        public final g a(String str) {
            int i10;
            int i11;
            char cCharAt;
            j0.i(str, "<this>");
            byte[] bArr = c0.f34888a;
            j0.i(str, "<this>");
            int length = str.length();
            while (length > 0 && ((cCharAt = str.charAt((i11 = length - 1))) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
                length = i11;
            }
            int i12 = (int) ((((long) length) * 6) / 8);
            byte[] bArrCopyOf = new byte[i12];
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (true) {
                if (i13 >= length) {
                    int i17 = i14 % 4;
                    if (i17 != 1) {
                        if (i17 == 2) {
                            bArrCopyOf[i16] = (byte) ((i15 << 12) >> 16);
                            i16++;
                        } else if (i17 == 3) {
                            int i18 = i15 << 6;
                            int i19 = i16 + 1;
                            bArrCopyOf[i16] = (byte) (i18 >> 16);
                            i16 = i19 + 1;
                            bArrCopyOf[i19] = (byte) (i18 >> 8);
                        }
                        if (i16 != i12) {
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i16);
                            j0.h(bArrCopyOf, "copyOf(this, newSize)");
                        }
                    }
                    if (bArrCopyOf != null) {
                        return new g(bArrCopyOf);
                    }
                    return null;
                }
                char cCharAt2 = str.charAt(i13);
                if ('A' <= cCharAt2 && cCharAt2 < '[') {
                    i10 = cCharAt2 - 'A';
                } else {
                    if ('a' <= cCharAt2 && cCharAt2 < '{') {
                        i10 = cCharAt2 - 'G';
                    } else {
                        if ('0' <= cCharAt2 && cCharAt2 < ':') {
                            i10 = cCharAt2 + 4;
                        } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                            i10 = 62;
                        } else {
                            if (cCharAt2 != '/' && cCharAt2 != '_') {
                                if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                                    break;
                                }
                            } else {
                                i10 = 63;
                            }
                            i13++;
                        }
                    }
                }
                i15 = (i15 << 6) | i10;
                i14++;
                if (i14 % 4 == 0) {
                    int i20 = i16 + 1;
                    bArrCopyOf[i16] = (byte) (i15 >> 16);
                    int i21 = i20 + 1;
                    bArrCopyOf[i20] = (byte) (i15 >> 8);
                    bArrCopyOf[i21] = (byte) i15;
                    i16 = i21 + 1;
                }
                i13++;
            }
            bArrCopyOf = null;
            if (bArrCopyOf != null) {
                return new g(bArrCopyOf);
            }
            return null;
        }

        public final g b(String str) {
            if (!(str.length() % 2 == 0)) {
                throw new IllegalArgumentException(i.f.a("Unexpected hex string: ", str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) (rd.b.a(str.charAt(i11 + 1)) + (rd.b.a(str.charAt(i11)) << 4));
            }
            return new g(bArr);
        }

        public final g c(String str, Charset charset) {
            j0.i(str, "<this>");
            byte[] bytes = str.getBytes(charset);
            j0.h(bytes, "this as java.lang.String).getBytes(charset)");
            return new g(bytes);
        }

        public final g d(String str) {
            j0.i(str, "<this>");
            byte[] bytes = str.getBytes(ed.c.f29139b);
            j0.h(bytes, "this as java.lang.String).getBytes(charset)");
            g gVar = new g(bytes);
            gVar.f34896e = str;
            return gVar;
        }
    }

    public g(byte[] bArr) {
        j0.i(bArr, "data");
        this.f34894c = bArr;
    }

    public String a() {
        byte[] bArr = this.f34894c;
        byte[] bArr2 = c0.f34888a;
        byte[] bArr3 = c0.f34888a;
        j0.i(bArr, "<this>");
        j0.i(bArr3, "map");
        byte[] bArr4 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            int i13 = i12 + 1;
            byte b11 = bArr[i12];
            int i14 = i13 + 1;
            byte b12 = bArr[i13];
            int i15 = i11 + 1;
            bArr4[i11] = bArr3[(b10 & 255) >> 2];
            int i16 = i15 + 1;
            bArr4[i15] = bArr3[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i17 = i16 + 1;
            bArr4[i16] = bArr3[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i11 = i17 + 1;
            bArr4[i17] = bArr3[b12 & 63];
            i10 = i14;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b13 = bArr[i10];
            int i18 = i11 + 1;
            bArr4[i11] = bArr3[(b13 & 255) >> 2];
            int i19 = i18 + 1;
            bArr4[i18] = bArr3[(b13 & 3) << 4];
            byte b14 = (byte) 61;
            bArr4[i19] = b14;
            bArr4[i19 + 1] = b14;
        } else if (length2 == 2) {
            int i20 = i10 + 1;
            byte b15 = bArr[i10];
            byte b16 = bArr[i20];
            int i21 = i11 + 1;
            bArr4[i11] = bArr3[(b15 & 255) >> 2];
            int i22 = i21 + 1;
            bArr4[i21] = bArr3[((b15 & 3) << 4) | ((b16 & 255) >> 4)];
            bArr4[i22] = bArr3[(b16 & 15) << 2];
            bArr4[i22 + 1] = (byte) 61;
        }
        j0.i(bArr4, "<this>");
        return new String(bArr4, ed.c.f29139b);
    }

    public g b(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f34894c, 0, c());
        byte[] bArrDigest = messageDigest.digest();
        j0.h(bArrDigest, "digestBytes");
        return new g(bArrDigest);
    }

    public int c() {
        return this.f34894c.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r0 < r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r6 < r7) goto L13;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(qd.g r9) {
        /*
            r8 = this;
            qd.g r9 = (qd.g) r9
            java.lang.String r0 = "other"
            fd.j0.i(r9, r0)
            int r0 = r8.c()
            int r1 = r9.c()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L15:
            r5 = -1
            if (r4 >= r2) goto L2c
            byte r6 = r8.f(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r7 = r9.f(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r6 != r7) goto L29
            int r4 = r4 + 1
            goto L15
        L29:
            if (r6 >= r7) goto L33
            goto L31
        L2c:
            if (r0 != r1) goto L2f
            goto L34
        L2f:
            if (r0 >= r1) goto L33
        L31:
            r3 = r5
            goto L34
        L33:
            r3 = 1
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qd.g.compareTo(java.lang.Object):int");
    }

    public String d() {
        byte[] bArr = this.f34894c;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = rd.b.f35364a;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public byte[] e() {
        return this.f34894c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            int iC = gVar.c();
            byte[] bArr = this.f34894c;
            if (iC == bArr.length && gVar.h(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public byte f(int i10) {
        return this.f34894c[i10];
    }

    public boolean g(int i10, g gVar, int i11, int i12) {
        return gVar.h(i11, this.f34894c, i10, i12);
    }

    public boolean h(int i10, byte[] bArr, int i11, int i12) {
        j0.i(bArr, "other");
        if (i10 >= 0) {
            byte[] bArr2 = this.f34894c;
            if (i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && d0.a(bArr2, i10, bArr, i11, i12)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f34895d;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.f34894c);
        this.f34895d = iHashCode;
        return iHashCode;
    }

    public final g i() {
        return b("SHA-1");
    }

    public final boolean j(g gVar) {
        j0.i(gVar, "prefix");
        return g(0, gVar, 0, gVar.c());
    }

    public g k() {
        byte b10;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f34894c;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b11 = bArr[i10];
            byte b12 = (byte) 65;
            if (b11 >= b12 && b11 <= (b10 = (byte) 90)) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                j0.h(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i10] = (byte) (b11 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b13 = bArrCopyOf[i11];
                    if (b13 >= b12 && b13 <= b10) {
                        bArrCopyOf[i11] = (byte) (b13 + 32);
                    }
                }
                return new g(bArrCopyOf);
            }
            i10++;
        }
    }

    public String l() {
        String str = this.f34896e;
        if (str != null) {
            return str;
        }
        byte[] bArrE = e();
        j0.i(bArrE, "<this>");
        String str2 = new String(bArrE, ed.c.f29139b);
        this.f34896e = str2;
        return str2;
    }

    public void m(c cVar, int i10, int i11) {
        cVar.P(this.f34894c, i10, i11);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:103:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:106:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:108:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:109:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:162:0x016c  */
    /* JADX WARN: Code duplicated, block: B:164:0x016f  */
    /* JADX WARN: Code duplicated, block: B:167:0x0176  */
    /* JADX WARN: Code duplicated, block: B:169:0x017a  */
    /* JADX WARN: Code duplicated, block: B:170:0x017c  */
    /* JADX WARN: Code duplicated, block: B:235:0x0211  */
    /* JADX WARN: Code duplicated, block: B:237:0x0214  */
    /* JADX WARN: Code duplicated, block: B:240:0x021a  */
    /* JADX WARN: Code duplicated, block: B:242:0x021e  */
    /* JADX WARN: Code duplicated, block: B:243:0x0220  */
    /* JADX WARN: Code duplicated, block: B:247:0x022a A[EDGE_INSN: B:247:0x022a->B:248:0x022b BREAK  A[LOOP:0: B:9:0x0014->B:320:0x0014]] */
    /* JADX WARN: Code duplicated, block: B:286:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x004a  */
    /* JADX WARN: Code duplicated, block: B:318:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x004d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0053  */
    /* JADX WARN: Code duplicated, block: B:36:0x0055  */
    /* JADX WARN: Code duplicated, block: B:59:0x0084  */
    /* JADX WARN: Code duplicated, block: B:61:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x008d  */
    /* JADX WARN: Code duplicated, block: B:65:0x008f  */
    public String toString() {
        StringBuilder sbA;
        StringBuilder sbA2;
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        boolean z12;
        int i14;
        boolean z13;
        int i15;
        boolean z14;
        byte[] bArr = this.f34894c;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        loop0: while (true) {
            if (i16 < length) {
                byte b10 = bArr[i16];
                if (b10 < 0) {
                    if ((b10 >> 5) != -2) {
                        if ((b10 >> 4) != -2) {
                            if ((b10 >> 3) != -2) {
                                if (i17 == 64) {
                                    break;
                                }
                                i18 = -1;
                                break;
                            }
                            int i19 = i16 + 3;
                            if (length > i19) {
                                byte b11 = bArr[i16];
                                byte b12 = bArr[i16 + 1];
                                if (!((b12 & 192) == 128)) {
                                    if (i17 == 64) {
                                        break;
                                    }
                                    i18 = -1;
                                    break;
                                }
                                byte b13 = bArr[i16 + 2];
                                if (!((b13 & 192) == 128)) {
                                    if (i17 == 64) {
                                        break;
                                    }
                                    i18 = -1;
                                    break;
                                }
                                byte b14 = bArr[i19];
                                if (!((b14 & 192) == 128)) {
                                    if (i17 == 64) {
                                        break;
                                    }
                                    i18 = -1;
                                    break;
                                }
                                int i20 = (((b14 ^ 3678080) ^ (b13 << 6)) ^ (b12 << 12)) ^ (b11 << 18);
                                if (i20 <= 1114111) {
                                    if (!(55296 <= i20 && i20 < 57344)) {
                                        if (i20 >= 65536) {
                                            int i21 = i17 + 1;
                                            if (i17 == 64) {
                                                break;
                                            }
                                            if (i20 != 10 && i20 != 13) {
                                                if (i20 >= 0 && i20 < 32) {
                                                    z14 = true;
                                                } else {
                                                    if (127 <= i20 && i20 < 160) {
                                                        z14 = true;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                }
                                                if (!z14) {
                                                    if (i20 == 65533) {
                                                        if (i20 < 65536) {
                                                            i15 = 1;
                                                        } else {
                                                            i15 = 2;
                                                        }
                                                        i18 += i15;
                                                        i16 += 4;
                                                        i17 = i21;
                                                    }
                                                }
                                            } else if (i20 == 65533) {
                                                if (i20 < 65536) {
                                                    i15 = 1;
                                                } else {
                                                    i15 = 2;
                                                }
                                                i18 += i15;
                                                i16 += 4;
                                                i17 = i21;
                                            }
                                            i18 = -1;
                                            break;
                                        }
                                        if (i17 == 64) {
                                            break;
                                        }
                                        i18 = -1;
                                        break;
                                    }
                                    if (i17 == 64) {
                                        break;
                                    }
                                    i18 = -1;
                                    break;
                                }
                                if (i17 == 64) {
                                    break;
                                }
                                i18 = -1;
                                break;
                            }
                            if (i17 == 64) {
                                break;
                            }
                            i18 = -1;
                            break;
                        }
                        int i22 = i16 + 2;
                        if (length > i22) {
                            byte b15 = bArr[i16];
                            byte b16 = bArr[i16 + 1];
                            if (!((b16 & 192) == 128)) {
                                if (i17 == 64) {
                                    break;
                                }
                                i18 = -1;
                                break;
                            }
                            byte b17 = bArr[i22];
                            if (!((b17 & 192) == 128)) {
                                if (i17 == 64) {
                                    break;
                                }
                                i18 = -1;
                                break;
                            }
                            int i23 = ((b17 ^ (-123008)) ^ (b16 << 6)) ^ (b15 << 12);
                            if (i23 >= 2048) {
                                if (!(55296 <= i23 && i23 < 57344)) {
                                    int i24 = i17 + 1;
                                    if (i17 == 64) {
                                        break;
                                    }
                                    if (i23 != 10 && i23 != 13) {
                                        if (i23 >= 0 && i23 < 32) {
                                            z13 = true;
                                        } else {
                                            if (127 <= i23 && i23 < 160) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                        }
                                        if (!z13) {
                                            if (i23 == 65533) {
                                                if (i23 < 65536) {
                                                    i14 = 1;
                                                } else {
                                                    i14 = 2;
                                                }
                                                i18 += i14;
                                                i16 += 3;
                                                i17 = i24;
                                            }
                                        }
                                    } else if (i23 == 65533) {
                                        if (i23 < 65536) {
                                            i14 = 1;
                                        } else {
                                            i14 = 2;
                                        }
                                        i18 += i14;
                                        i16 += 3;
                                        i17 = i24;
                                    }
                                    i18 = -1;
                                    break;
                                }
                                if (i17 == 64) {
                                    break;
                                }
                                i18 = -1;
                                break;
                            }
                            if (i17 == 64) {
                                break;
                            }
                            i18 = -1;
                            break;
                        }
                        if (i17 == 64) {
                            break;
                        }
                        i18 = -1;
                        break;
                    }
                    int i25 = i16 + 1;
                    if (length > i25) {
                        byte b18 = bArr[i16];
                        byte b19 = bArr[i25];
                        if (!((b19 & 192) == 128)) {
                            if (i17 == 64) {
                                break;
                            }
                            i18 = -1;
                            break;
                        }
                        int i26 = (b19 ^ 3968) ^ (b18 << 6);
                        if (i26 >= 128) {
                            int i27 = i17 + 1;
                            if (i17 == 64) {
                                break;
                            }
                            if (i26 != 10 && i26 != 13) {
                                if (i26 >= 0 && i26 < 32) {
                                    z12 = true;
                                } else {
                                    if (127 <= i26 && i26 < 160) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                }
                                if (!z12) {
                                    if (i26 == 65533) {
                                        if (i26 < 65536) {
                                            i13 = 1;
                                        } else {
                                            i13 = 2;
                                        }
                                        i18 += i13;
                                        i16 += 2;
                                        i17 = i27;
                                    }
                                }
                            } else if (i26 == 65533) {
                                if (i26 < 65536) {
                                    i13 = 1;
                                } else {
                                    i13 = 2;
                                }
                                i18 += i13;
                                i16 += 2;
                                i17 = i27;
                            }
                            i18 = -1;
                            break;
                        }
                        if (i17 == 64) {
                            break;
                        }
                        i18 = -1;
                        break;
                    }
                    if (i17 == 64) {
                        break;
                    }
                    i18 = -1;
                    break;
                }
                int i28 = i17 + 1;
                if (i17 == 64) {
                    break;
                }
                if (b10 != 10 && b10 != 13) {
                    if (b10 >= 0 && b10 < 32) {
                        z11 = true;
                    } else {
                        if (127 <= b10 && b10 < 160) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                    if (!z11) {
                        if (b10 != 65533) {
                            if (b10 < 65536) {
                                i10 = 1;
                            } else {
                                i10 = 2;
                            }
                            i18 += i10;
                            i16++;
                            while (true) {
                                i17 = i28;
                                if (i16 < length) {
                                    continue;
                                }
                                i18 += i12;
                                i16 = i11;
                            }
                        }
                    }
                    i18 = -1;
                    break;
                }
                if (b10 != 65533) {
                    if (b10 < 65536) {
                        i10 = 1;
                    } else {
                        i10 = 2;
                    }
                    i18 += i10;
                    i16++;
                    while (true) {
                        i17 = i28;
                        if (i16 < length && bArr[i16] >= 0) {
                            i11 = i16 + 1;
                            byte b20 = bArr[i16];
                            i28 = i17 + 1;
                            if (i17 == 64) {
                                break loop0;
                            }
                            if (b20 != 10 && b20 != 13) {
                                if (b20 >= 0 && b20 < 32) {
                                    z10 = true;
                                } else {
                                    if (127 <= b20 && b20 < 160) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                }
                                if (!z10) {
                                    if (b20 == 65533) {
                                        if (b20 < 65536) {
                                            i12 = 1;
                                        } else {
                                            i12 = 2;
                                        }
                                        i18 += i12;
                                        i16 = i11;
                                    }
                                }
                            } else if (b20 == 65533) {
                                if (b20 < 65536) {
                                    i12 = 1;
                                } else {
                                    i12 = 2;
                                }
                                i18 += i12;
                                i16 = i11;
                            }
                        }
                    }
                }
                i18 = -1;
                break;
            }
            break;
        }
        if (i18 != -1) {
            String strL = l();
            String strSubstring = strL.substring(0, i18);
            j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strQ = ed.q.q(ed.q.q(ed.q.q(strSubstring, "\\", "\\\\", false, 4), "\n", "\\n", false, 4), "\r", "\\r", false, 4);
            if (i18 >= strL.length()) {
                sbA = android.support.v4.media.c.a("[text=", strQ);
                sbA.append(']');
                return sbA.toString();
            }
            sbA2 = defpackage.a.a("[size=");
            sbA2.append(this.f34894c.length);
            sbA2.append(" text=");
            sbA2.append(strQ);
            sbA2.append("…]");
            return sbA2.toString();
        }
        if (this.f34894c.length <= 64) {
            sbA = defpackage.a.a("[hex=");
            sbA.append(d());
            sbA.append(']');
            return sbA.toString();
        }
        sbA2 = defpackage.a.a("[size=");
        sbA2.append(this.f34894c.length);
        sbA2.append(" hex=");
        c.a aVar = d0.f34890a;
        j0.i(this, "<this>");
        int iC = 64 == d0.f34891b ? c() : 64;
        byte[] bArr2 = this.f34894c;
        if (!(iC <= bArr2.length)) {
            throw new IllegalArgumentException(h0.f.a(defpackage.a.a("endIndex > length("), this.f34894c.length, CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
        if (!(iC + 0 >= 0)) {
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        sbA2.append((iC == bArr2.length ? this : new g(kc.i.g(bArr2, 0, iC))).d());
        sbA2.append("…]");
        return sbA2.toString();
    }
}
