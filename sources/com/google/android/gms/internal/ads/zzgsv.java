package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
final class zzgsv {
    private static final zzgss zza;

    static {
        if (zzgsq.zzA() && zzgsq.zzB()) {
            int i10 = zzgnp.zza;
        }
        zza = new zzgst();
    }

    public static /* bridge */ /* synthetic */ int zzc(byte[] bArr, int i10, int i11) {
        int i12 = i11 - i10;
        byte b10 = bArr[i10 - 1];
        if (i12 == 0) {
            if (b10 > -12) {
                return -1;
            }
            return b10;
        }
        if (i12 == 1) {
            return zzk(b10, bArr[i10]);
        }
        if (i12 == 2) {
            return zzl(b10, bArr[i10], bArr[i10 + 1]);
        }
        throw new AssertionError();
    }

    public static int zzd(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        char cCharAt;
        int length = charSequence.length();
        int i16 = 0;
        while (true) {
            i12 = i10 + i11;
            if (i16 >= length || (i15 = i16 + i10) >= i12 || (cCharAt = charSequence.charAt(i16)) >= 128) {
                break;
            }
            bArr[i15] = (byte) cCharAt;
            i16++;
        }
        if (i16 == length) {
            return i10 + length;
        }
        int i17 = i10 + i16;
        while (i16 < length) {
            char cCharAt2 = charSequence.charAt(i16);
            if (cCharAt2 >= 128 || i17 >= i12) {
                if (cCharAt2 < 2048 && i17 <= i12 - 2) {
                    int i18 = i17 + 1;
                    bArr[i17] = (byte) ((cCharAt2 >>> 6) | 960);
                    i17 = i18 + 1;
                    bArr[i18] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i17 > i12 - 3) {
                        if (i17 > i12 - 4) {
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i14 = i16 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i14)))) {
                                throw new zzgsu(i16, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i17);
                        }
                        int i19 = i16 + 1;
                        if (i19 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i19);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int i20 = i17 + 1;
                                bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                                int i21 = i20 + 1;
                                bArr[i20] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i22 = i21 + 1;
                                bArr[i21] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i17 = i22 + 1;
                                bArr[i22] = (byte) ((codePoint & 63) | 128);
                                i16 = i19;
                            } else {
                                i16 = i19;
                            }
                        }
                        throw new zzgsu(i16 - 1, length);
                    }
                    int i23 = i17 + 1;
                    bArr[i17] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i24 = i23 + 1;
                    bArr[i23] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i13 = i24 + 1;
                    bArr[i24] = (byte) ((cCharAt2 & '?') | 128);
                }
                i16++;
            } else {
                i13 = i17 + 1;
                bArr[i17] = (byte) cCharAt2;
            }
            i17 = i13;
            i16++;
        }
        return i17;
    }

    public static int zze(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt >= 2048) {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char cCharAt2 = charSequence.charAt(i11);
                    if (cCharAt2 < 2048) {
                        i10 += (127 - cCharAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) < 65536) {
                                throw new zzgsu(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
                break;
            }
            i12 += (127 - cCharAt) >>> 31;
            i11++;
        }
        if (i12 >= length) {
            return i12;
        }
        StringBuilder sbA = defpackage.a.a("UTF-8 length does not fit in int: ");
        sbA.append(((long) i12) + 4294967296L);
        throw new IllegalArgumentException(sbA.toString());
    }

    public static int zzf(int i10, byte[] bArr, int i11, int i12) {
        return zza.zza(i10, bArr, i11, i12);
    }

    public static String zzg(ByteBuffer byteBuffer, int i10, int i11) throws zzgpy {
        zzgss zzgssVar = zza;
        if (byteBuffer.hasArray()) {
            return zzgssVar.zzb(byteBuffer.array(), byteBuffer.arrayOffset() + i10, i11);
        }
        byteBuffer.isDirect();
        return zzgss.zzd(byteBuffer, i10, i11);
    }

    public static String zzh(byte[] bArr, int i10, int i11) throws zzgpy {
        return zza.zzb(bArr, i10, i11);
    }

    public static boolean zzi(byte[] bArr) {
        return zza.zzc(bArr, 0, bArr.length);
    }

    public static boolean zzj(byte[] bArr, int i10, int i11) {
        return zza.zzc(bArr, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzk(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }
}
