package okhttp3.internal;

import ch.qos.logback.core.CoreConstants;
import ed.q;
import ed.u;
import fd.j0;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;
import l8.a1;
import qd.c;

/* JADX INFO: loaded from: classes3.dex */
public final class HostnamesKt {
    private static final boolean containsInvalidHostnameAsciiCodes(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (j0.k(cCharAt, 31) <= 0 || j0.k(cCharAt, 127) >= 0 || u.D(" #%/:?@[\\]", cCharAt, 0, false, 6) != -1) {
                return true;
            }
            i10 = i11;
        }
        return false;
    }

    private static final boolean decodeIpv4Suffix(String str, int i10, int i11, byte[] bArr, int i12) {
        int i13 = i12;
        while (i10 < i11) {
            if (i13 == bArr.length) {
                return false;
            }
            if (i13 != i12) {
                if (str.charAt(i10) != '.') {
                    return false;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = 0;
            while (i14 < i11) {
                char cCharAt = str.charAt(i14);
                if (j0.k(cCharAt, 48) < 0 || j0.k(cCharAt, 57) > 0) {
                    break;
                }
                if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i14++;
            }
            if (i14 - i10 == 0) {
                return false;
            }
            bArr[i13] = (byte) i15;
            i13++;
            i10 = i14;
        }
        return i13 == i12 + 4;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059 A[LOOP:1: B:30:0x004c->B:34:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x005f A[EDGE_INSN: B:54:0x005f->B:35:0x005f BREAK  A[LOOP:1: B:30:0x004c->B:34:0x0059], SYNTHETIC] */
    private static final InetAddress decodeIpv6(String str, int i10, int i11) {
        int i12;
        int i13;
        int hexDigit;
        byte[] bArr = new byte[16];
        int i14 = -1;
        int i15 = -1;
        int i16 = 0;
        while (i10 < i11) {
            if (i16 == 16) {
                return null;
            }
            int i17 = i10 + 2;
            if (i17 <= i11 && q.t(str, "::", i10, false, 4)) {
                if (i14 != -1) {
                    return null;
                }
                i16 += 2;
                i14 = i16;
                if (i17 == i11) {
                    break;
                }
                i15 = i17;
                i12 = 0;
                i10 = i15;
                while (i10 < i11) {
                    hexDigit = Util.parseHexDigit(str.charAt(i10));
                    if (hexDigit == -1) {
                        break;
                        break;
                    }
                    i12 = (i12 << 4) + hexDigit;
                    i10++;
                }
                i13 = i10 - i15;
                if (i13 != 0) {
                }
                return null;
            }
            if (i16 != 0) {
                if (!q.t(str, ":", i10, false, 4)) {
                    if (!q.t(str, ".", i10, false, 4) || !decodeIpv4Suffix(str, i15, i11, bArr, i16 - 2)) {
                        return null;
                    }
                    i16 += 2;
                    break;
                }
                i10++;
            }
            i15 = i10;
            i12 = 0;
            i10 = i15;
            while (i10 < i11) {
                hexDigit = Util.parseHexDigit(str.charAt(i10));
                if (hexDigit == -1) {
                    break;
                }
                i12 = (i12 << 4) + hexDigit;
                i10++;
            }
            i13 = i10 - i15;
            if (i13 != 0 || i13 > 4) {
                return null;
            }
            int i18 = i16 + 1;
            bArr[i16] = (byte) ((i12 >>> 8) & 255);
            i16 = i18 + 1;
            bArr[i18] = (byte) (i12 & 255);
        }
        if (i16 != 16) {
            if (i14 == -1) {
                return null;
            }
            int i19 = i16 - i14;
            System.arraycopy(bArr, i14, bArr, 16 - i19, i19);
            Arrays.fill(bArr, i14, (16 - i16) + i14, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    private static final String inet6AddressToAscii(byte[] bArr) {
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < bArr.length) {
            int i14 = i12;
            while (i14 < 16 && bArr[i14] == 0 && bArr[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i11 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        c cVar = new c();
        while (i10 < bArr.length) {
            if (i10 == i11) {
                cVar.R(58);
                i10 += i13;
                if (i10 == 16) {
                    cVar.R(58);
                }
            } else {
                if (i10 > 0) {
                    cVar.R(58);
                }
                cVar.H((Util.and(bArr[i10], 255) << 8) | Util.and(bArr[i10 + 1], 255));
                i10 += 2;
            }
        }
        return cVar.n();
    }

    public static final String toCanonicalHost(String str) {
        j0.i(str, "<this>");
        if (u.x(str, ":", false, 2)) {
            InetAddress inetAddressDecodeIpv6 = (q.u(str, "[", false, 2) && q.h(str, "]", false, 2)) ? decodeIpv6(str, 1, str.length() - 1) : decodeIpv6(str, 0, str.length());
            if (inetAddressDecodeIpv6 == null) {
                return null;
            }
            byte[] address = inetAddressDecodeIpv6.getAddress();
            if (address.length == 16) {
                return inet6AddressToAscii(address);
            }
            if (address.length == 4) {
                return inetAddressDecodeIpv6.getHostAddress();
            }
            throw new AssertionError(a1.a("Invalid IPv6 address: '", str, CoreConstants.SINGLE_QUOTE_CHAR));
        }
        try {
            String ascii = IDN.toASCII(str);
            j0.h(ascii, "toASCII(host)");
            Locale locale = Locale.US;
            j0.h(locale, "US");
            String lowerCase = ascii.toLowerCase(locale);
            j0.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if ((lowerCase.length() == 0) || containsInvalidHostnameAsciiCodes(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
