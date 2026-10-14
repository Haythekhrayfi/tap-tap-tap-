package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class hz {
    public static final String a(String str) {
        int i10;
        fd.j0.i(str, "<this>");
        int i11 = 0;
        int i12 = -1;
        if (!ed.u.x(str, ":", false, 2)) {
            try {
                String ascii = IDN.toASCII(str);
                fd.j0.h(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                fd.j0.h(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                fd.j0.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (0; i10 < length; i10 + 1) {
                    char cCharAt = lowerCase.charAt(i10);
                    i10 = (fd.j0.k(cCharAt, 31) > 0 && fd.j0.k(cCharAt, 127) < 0 && ed.u.D(" #%/:?@[\\]", cCharAt, 0, false, 6) == -1) ? i10 + 1 : 0;
                    i11 = 1;
                    break;
                }
                if (i11 != 0) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressA = (ed.q.u(str, "[", false, 2) && ed.q.h(str, "]", false, 2)) ? a(1, str.length() - 1, str) : a(0, str.length(), str);
        if (inetAddressA == null) {
            return null;
        }
        byte[] address = inetAddressA.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressA.getHostAddress();
            }
            throw new AssertionError(l8.a1.a("Invalid IPv6 address: '", str, CoreConstants.SINGLE_QUOTE_CHAR));
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < address.length) {
            int i15 = i13;
            while (i15 < 16 && address[i15] == 0 && address[i15 + 1] == 0) {
                i15 += 2;
            }
            int i16 = i15 - i13;
            if (i16 > i14 && i16 >= 4) {
                i12 = i13;
                i14 = i16;
            }
            i13 = i15 + 2;
        }
        qd.c cVar = new qd.c();
        while (i11 < address.length) {
            if (i11 == i12) {
                cVar.R(58);
                i11 += i14;
                if (i11 == 16) {
                    cVar.R(58);
                }
            } else {
                if (i11 > 0) {
                    cVar.R(58);
                }
                cVar.H((ea1.a(address[i11]) << 8) | ea1.a(address[i11 + 1]));
                i11 += 2;
            }
        }
        return cVar.n();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f A[LOOP:2: B:24:0x004c->B:49:0x008f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba A[LOOP:1: B:60:0x00ad->B:63:0x00ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x00c0 A[EDGE_INSN: B:86:0x00c0->B:64:0x00c0 BREAK  A[LOOP:1: B:60:0x00ad->B:63:0x00ba], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x008a A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    private static final InetAddress a(int i10, int i11, String str) {
        int i12;
        boolean z10;
        ?? r15;
        int i13;
        char cCharAt;
        int i14;
        int i15;
        int i16;
        int iA;
        int i17 = 16;
        byte[] bArr = new byte[16];
        int i18 = -1;
        boolean z11 = false;
        int i19 = i10;
        int i20 = -1;
        int i21 = -1;
        int i22 = 0;
        while (true) {
            if (i19 >= i11) {
                i12 = i17;
                break;
            }
            if (i22 == i17) {
                return null;
            }
            int i23 = i19 + 2;
            if (i23 <= i11 && ed.q.t(str, "::", i19, z11, 4)) {
                if (i20 != i18) {
                    return null;
                }
                i22 += 2;
                if (i23 == i11) {
                    i12 = i17;
                    i20 = i22;
                    break;
                }
                i20 = i22;
                i21 = i23;
                i19 = i21;
                i15 = 0;
                while (i19 < i11) {
                    iA = ea1.a(str.charAt(i19));
                    if (iA != -1) {
                        break;
                        break;
                    }
                    i15 = (i15 << 4) + iA;
                    i19++;
                }
                i16 = i19 - i21;
                if (i16 != 0) {
                }
                return null;
            }
            if (i22 != 0) {
                if (!ed.q.t(str, ":", i19, z11, 4)) {
                    if (!ed.q.t(str, ".", i19, z11, 4)) {
                        return null;
                    }
                    int i24 = i22 - 2;
                    int i25 = i24;
                    loop2: while (true) {
                        if (i21 >= i11) {
                            if (i25 == i24 + 4) {
                                z10 = true;
                                break;
                            }
                        } else if (i25 != i17) {
                            if (i25 == i24) {
                                r15 = z11;
                                i13 = i21;
                                while (true) {
                                    if (i13 < i11) {
                                        cCharAt = str.charAt(i13);
                                        if (fd.j0.k(cCharAt, 48) < 0 && fd.j0.k(cCharAt, 57) <= 0) {
                                            if ((r15 != 0 || i21 == i13) && (i14 = ((r15 * 10) + cCharAt) - 48) <= 255) {
                                                i13++;
                                                r15 = i14;
                                            }
                                        }
                                    }
                                    if (i13 - i21 == 0) {
                                        bArr[i25] = (byte) r15;
                                        i25++;
                                        i21 = i13;
                                        i17 = 16;
                                        z11 = false;
                                    }
                                }
                            } else if (str.charAt(i21) == '.') {
                                i21++;
                                r15 = z11;
                                i13 = i21;
                                while (true) {
                                    if (i13 < i11) {
                                        cCharAt = str.charAt(i13);
                                        if (fd.j0.k(cCharAt, 48) < 0) {
                                        }
                                    }
                                    if (i13 - i21 == 0) {
                                        bArr[i25] = (byte) r15;
                                        i25++;
                                        i21 = i13;
                                        i17 = 16;
                                        z11 = false;
                                    }
                                    i13++;
                                    r15 = i14;
                                }
                            }
                        }
                        z10 = false;
                        break loop2;
                    }
                    if (!z10) {
                        return null;
                    }
                    i22 += 2;
                    i12 = 16;
                    break;
                }
                i19++;
            }
            i21 = i19;
            i19 = i21;
            i15 = 0;
            while (i19 < i11) {
                iA = ea1.a(str.charAt(i19));
                if (iA != -1) {
                    break;
                }
                i15 = (i15 << 4) + iA;
                i19++;
            }
            i16 = i19 - i21;
            if (i16 != 0 || i16 > 4) {
                return null;
            }
            int i26 = i22 + 1;
            bArr[i22] = (byte) ((i15 >>> 8) & 255);
            i22 = i26 + 1;
            bArr[i26] = (byte) (i15 & 255);
            i17 = 16;
            i18 = -1;
            z11 = false;
        }
        if (i22 != i12) {
            if (i20 == -1) {
                return null;
            }
            int i27 = i22 - i20;
            System.arraycopy(bArr, i20, bArr, 16 - i27, i27);
            Arrays.fill(bArr, i20, (16 - i22) + i20, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }
}
