package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zznc {
    private static final zzmz zza;

    static {
        if (zzmx.zzx() && zzmx.zzy()) {
            int i10 = zzip.zza;
        }
        zza = new zzna();
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 != 0) {
            if (i12 == 1) {
                byte b11 = bArr[i10];
                if (b10 <= -12 && b11 <= -65) {
                    return b10 ^ (b11 << 8);
                }
            } else {
                if (i12 != 2) {
                    throw new AssertionError();
                }
                byte b12 = bArr[i10];
                byte b13 = bArr[i10 + 1];
                if (b10 <= -12 && b12 <= -65 && b13 <= -65) {
                    return ((b12 << 8) ^ b10) ^ (b13 << 16);
                }
            }
        } else if (b10 <= -12) {
            return b10;
        }
        return -1;
    }

    public static int zzb(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        char cCharAt;
        int length = charSequence.length();
        int i15 = i11 + i10;
        int i16 = 0;
        while (i16 < length && (i14 = i16 + i10) < i15 && (cCharAt = charSequence.charAt(i16)) < 128) {
            bArr[i14] = (byte) cCharAt;
            i16++;
        }
        if (i16 == length) {
            return i10 + length;
        }
        int i17 = i10 + i16;
        while (i16 < length) {
            char cCharAt2 = charSequence.charAt(i16);
            if (cCharAt2 >= 128 || i17 >= i15) {
                if (cCharAt2 < 2048 && i17 <= i15 - 2) {
                    int i18 = i17 + 1;
                    bArr[i17] = (byte) ((cCharAt2 >>> 6) | 960);
                    i17 = i18 + 1;
                    bArr[i18] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i17 > i15 - 3) {
                        if (i17 > i15 - 4) {
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i13 = i16 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i13)))) {
                                throw new zznb(i16, length);
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
                        throw new zznb(i16 - 1, length);
                    }
                    int i23 = i17 + 1;
                    bArr[i17] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i24 = i23 + 1;
                    bArr[i23] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i12 = i24 + 1;
                    bArr[i24] = (byte) ((cCharAt2 & '?') | 128);
                }
                i16++;
            } else {
                i12 = i17 + 1;
                bArr[i17] = (byte) cCharAt2;
            }
            i17 = i12;
            i16++;
        }
        return i17;
    }

    public static int zzc(CharSequence charSequence) {
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
                                throw new zznb(i11, length2);
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

    public static String zzd(byte[] bArr, int i10, int i11) throws zzko {
        int length = bArr.length;
        if ((i10 | i11 | ((length - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = bArr[i10];
            if (!zzmy.zzd(b10)) {
                break;
            }
            i10++;
            cArr[i13] = (char) b10;
            i13++;
        }
        while (i10 < i12) {
            int i14 = i10 + 1;
            byte b11 = bArr[i10];
            if (zzmy.zzd(b11)) {
                int i15 = i13 + 1;
                cArr[i13] = (char) b11;
                i10 = i14;
                while (true) {
                    i13 = i15;
                    if (i10 >= i12) {
                        break;
                    }
                    byte b12 = bArr[i10];
                    if (!zzmy.zzd(b12)) {
                        break;
                    }
                    i10++;
                    i15 = i13 + 1;
                    cArr[i13] = (char) b12;
                }
            } else if (b11 < -32) {
                if (i14 >= i12) {
                    throw zzko.zzc();
                }
                zzmy.zzc(b11, bArr[i14], cArr, i13);
                i10 = i14 + 1;
                i13++;
            } else if (b11 < -16) {
                if (i14 >= i12 - 1) {
                    throw zzko.zzc();
                }
                int i16 = i14 + 1;
                zzmy.zzb(b11, bArr[i14], bArr[i16], cArr, i13);
                i10 = i16 + 1;
                i13++;
            } else {
                if (i14 >= i12 - 2) {
                    throw zzko.zzc();
                }
                int i17 = i14 + 1;
                int i18 = i17 + 1;
                zzmy.zza(b11, bArr[i14], bArr[i17], bArr[i18], cArr, i13);
                i13 += 2;
                i10 = i18 + 1;
            }
        }
        return new String(cArr, 0, i13);
    }

    public static boolean zze(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzf(byte[] bArr, int i10, int i11) {
        return zza.zzb(bArr, i10, i11);
    }
}
