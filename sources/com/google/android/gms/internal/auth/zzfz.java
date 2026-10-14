package com.google.android.gms.internal.auth;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import q2.a;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class zzfz<T> implements zzgh<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhi.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfw zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzfk zzl;
    private final zzgy zzm;
    private final zzel zzn;
    private final zzgb zzo;
    private final zzfr zzp;

    private zzfz(int[] iArr, Object[] objArr, int i10, int i11, zzfw zzfwVar, boolean z10, boolean z11, int[] iArr2, int i12, int i13, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzh = z10;
        this.zzi = iArr2;
        this.zzj = i12;
        this.zzk = i13;
        this.zzo = zzgbVar;
        this.zzl = zzfkVar;
        this.zzm = zzgyVar;
        this.zzn = zzelVar;
        this.zzg = zzfwVar;
        this.zzp = zzfrVar;
    }

    private static Field zzA(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbA = a.a("Field ", str, " for ", name, " not found. Known fields are ");
            sbA.append(string);
            throw new RuntimeException(sbA.toString());
        }
    }

    private final void zzB(Object obj, Object obj2, int i10) {
        long jZzv = zzv(i10) & 1048575;
        if (zzG(obj2, i10)) {
            Object objZzf = zzhi.zzf(obj, jZzv);
            Object objZzf2 = zzhi.zzf(obj2, jZzv);
            if (objZzf != null && objZzf2 != null) {
                objZzf2 = zzez.zzg(objZzf, objZzf2);
            } else if (objZzf2 == null) {
                return;
            }
            zzhi.zzp(obj, jZzv, objZzf2);
            zzD(obj, i10);
        }
    }

    private final void zzC(Object obj, Object obj2, int i10) {
        int iZzv = zzv(i10);
        int i11 = this.zzc[i10];
        long j10 = iZzv & 1048575;
        if (zzJ(obj2, i11, i10)) {
            Object objZzf = zzJ(obj, i11, i10) ? zzhi.zzf(obj, j10) : null;
            Object objZzf2 = zzhi.zzf(obj2, j10);
            if (objZzf != null && objZzf2 != null) {
                objZzf2 = zzez.zzg(objZzf, objZzf2);
            } else if (objZzf2 == null) {
                return;
            }
            zzhi.zzp(obj, j10, objZzf2);
            zzE(obj, i11, i10);
        }
    }

    private final void zzD(Object obj, int i10) {
        int iZzs = zzs(i10);
        long j10 = 1048575 & iZzs;
        if (j10 == 1048575) {
            return;
        }
        zzhi.zzn(obj, j10, (1 << (iZzs >>> 20)) | zzhi.zzc(obj, j10));
    }

    private final void zzE(Object obj, int i10, int i11) {
        zzhi.zzn(obj, zzs(i11) & 1048575, i10);
    }

    private final boolean zzF(Object obj, Object obj2, int i10) {
        return zzG(obj, i10) == zzG(obj2, i10);
    }

    private final boolean zzG(Object obj, int i10) {
        int iZzs = zzs(i10);
        long j10 = iZzs & 1048575;
        if (j10 != 1048575) {
            return (zzhi.zzc(obj, j10) & (1 << (iZzs >>> 20))) != 0;
        }
        int iZzv = zzv(i10);
        long j11 = iZzv & 1048575;
        switch (zzu(iZzv)) {
            case 0:
                return Double.doubleToRawLongBits(zzhi.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhi.zzb(obj, j11)) != 0;
            case 2:
                return zzhi.zzd(obj, j11) != 0;
            case 3:
                return zzhi.zzd(obj, j11) != 0;
            case 4:
                return zzhi.zzc(obj, j11) != 0;
            case 5:
                return zzhi.zzd(obj, j11) != 0;
            case 6:
                return zzhi.zzc(obj, j11) != 0;
            case 7:
                return zzhi.zzt(obj, j11);
            case 8:
                Object objZzf = zzhi.zzf(obj, j11);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzee) {
                    return !zzee.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhi.zzf(obj, j11) != null;
            case 10:
                return !zzee.zzb.equals(zzhi.zzf(obj, j11));
            case 11:
                return zzhi.zzc(obj, j11) != 0;
            case 12:
                return zzhi.zzc(obj, j11) != 0;
            case 13:
                return zzhi.zzc(obj, j11) != 0;
            case 14:
                return zzhi.zzd(obj, j11) != 0;
            case 15:
                return zzhi.zzc(obj, j11) != 0;
            case 16:
                return zzhi.zzd(obj, j11) != 0;
            case 17:
                return zzhi.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzH(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzG(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    private static boolean zzI(Object obj, int i10, zzgh zzghVar) {
        return zzghVar.zzi(zzhi.zzf(obj, i10 & 1048575));
    }

    private final boolean zzJ(Object obj, int i10, int i11) {
        return zzhi.zzc(obj, (long) (zzs(i11) & 1048575)) == i10;
    }

    public static zzgz zzc(Object obj) {
        zzeu zzeuVar = (zzeu) obj;
        zzgz zzgzVar = zzeuVar.zzc;
        if (zzgzVar != zzgz.zza()) {
            return zzgzVar;
        }
        zzgz zzgzVarZzc = zzgz.zzc();
        zzeuVar.zzc = zzgzVarZzc;
        return zzgzVarZzc;
    }

    public static zzfz zzj(Class cls, zzft zzftVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
        if (zzftVar instanceof zzgg) {
            return zzk((zzgg) zzftVar, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x025e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0261  */
    /* JADX WARN: Code duplicated, block: B:127:0x0279  */
    /* JADX WARN: Code duplicated, block: B:128:0x027c  */
    /* JADX WARN: Code duplicated, block: B:162:0x032c  */
    /* JADX WARN: Code duplicated, block: B:177:0x0379  */
    /* JADX WARN: Code duplicated, block: B:180:0x0385  */
    public static zzfz zzk(zzgg zzggVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        char cCharAt;
        int i16;
        char cCharAt2;
        int i17;
        char cCharAt3;
        int i18;
        char cCharAt4;
        int i19;
        char cCharAt5;
        int i20;
        char cCharAt6;
        int i21;
        char cCharAt7;
        int i22;
        char cCharAt8;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i28;
        int i29;
        Field fieldZzA;
        char cCharAt9;
        int i30;
        int i31;
        int i32;
        int i33;
        Object obj;
        Field fieldZzA2;
        int i34;
        Object obj2;
        Field fieldZzA3;
        int i35;
        char cCharAt10;
        int i36;
        char cCharAt11;
        int i37;
        char cCharAt12;
        int i38;
        char cCharAt13;
        boolean z10 = zzggVar.zzc() == 2;
        String strZzd = zzggVar.zzd();
        int length = strZzd.length();
        char c10 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i39 = 1;
            while (true) {
                i10 = i39 + 1;
                if (strZzd.charAt(i39) < 55296) {
                    break;
                }
                i39 = i10;
            }
        } else {
            i10 = 1;
        }
        int i40 = i10 + 1;
        int iCharAt4 = strZzd.charAt(i10);
        if (iCharAt4 >= 55296) {
            int i41 = iCharAt4 & 8191;
            int i42 = 13;
            while (true) {
                i38 = i40 + 1;
                cCharAt13 = strZzd.charAt(i40);
                if (cCharAt13 < 55296) {
                    break;
                }
                i41 |= (cCharAt13 & 8191) << i42;
                i42 += 13;
                i40 = i38;
            }
            iCharAt4 = i41 | (cCharAt13 << i42);
            i40 = i38;
        }
        if (iCharAt4 == 0) {
            iCharAt = 0;
            i14 = 0;
            iCharAt2 = 0;
            i13 = 0;
            iCharAt3 = 0;
            i11 = 0;
            iArr = zza;
            i12 = 0;
        } else {
            int i43 = i40 + 1;
            int iCharAt5 = strZzd.charAt(i40);
            if (iCharAt5 >= 55296) {
                int i44 = iCharAt5 & 8191;
                int i45 = 13;
                while (true) {
                    i22 = i43 + 1;
                    cCharAt8 = strZzd.charAt(i43);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt8 & 8191) << i45;
                    i45 += 13;
                    i43 = i22;
                }
                iCharAt5 = i44 | (cCharAt8 << i45);
                i43 = i22;
            }
            int i46 = i43 + 1;
            int iCharAt6 = strZzd.charAt(i43);
            if (iCharAt6 >= 55296) {
                int i47 = iCharAt6 & 8191;
                int i48 = 13;
                while (true) {
                    i21 = i46 + 1;
                    cCharAt7 = strZzd.charAt(i46);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt7 & 8191) << i48;
                    i48 += 13;
                    i46 = i21;
                }
                iCharAt6 = i47 | (cCharAt7 << i48);
                i46 = i21;
            }
            int i49 = i46 + 1;
            iCharAt = strZzd.charAt(i46);
            if (iCharAt >= 55296) {
                int i50 = iCharAt & 8191;
                int i51 = 13;
                while (true) {
                    i20 = i49 + 1;
                    cCharAt6 = strZzd.charAt(i49);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt6 & 8191) << i51;
                    i51 += 13;
                    i49 = i20;
                }
                iCharAt = i50 | (cCharAt6 << i51);
                i49 = i20;
            }
            int i52 = i49 + 1;
            int iCharAt7 = strZzd.charAt(i49);
            if (iCharAt7 >= 55296) {
                int i53 = iCharAt7 & 8191;
                int i54 = 13;
                while (true) {
                    i19 = i52 + 1;
                    cCharAt5 = strZzd.charAt(i52);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt5 & 8191) << i54;
                    i54 += 13;
                    i52 = i19;
                }
                iCharAt7 = i53 | (cCharAt5 << i54);
                i52 = i19;
            }
            int i55 = i52 + 1;
            iCharAt2 = strZzd.charAt(i52);
            if (iCharAt2 >= 55296) {
                int i56 = iCharAt2 & 8191;
                int i57 = 13;
                while (true) {
                    i18 = i55 + 1;
                    cCharAt4 = strZzd.charAt(i55);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt4 & 8191) << i57;
                    i57 += 13;
                    i55 = i18;
                }
                iCharAt2 = i56 | (cCharAt4 << i57);
                i55 = i18;
            }
            int i58 = i55 + 1;
            int iCharAt8 = strZzd.charAt(i55);
            if (iCharAt8 >= 55296) {
                int i59 = iCharAt8 & 8191;
                int i60 = 13;
                while (true) {
                    i17 = i58 + 1;
                    cCharAt3 = strZzd.charAt(i58);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt3 & 8191) << i60;
                    i60 += 13;
                    i58 = i17;
                }
                iCharAt8 = i59 | (cCharAt3 << i60);
                i58 = i17;
            }
            int i61 = i58 + 1;
            int iCharAt9 = strZzd.charAt(i58);
            if (iCharAt9 >= 55296) {
                int i62 = iCharAt9 & 8191;
                int i63 = 13;
                while (true) {
                    i16 = i61 + 1;
                    cCharAt2 = strZzd.charAt(i61);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i62 |= (cCharAt2 & 8191) << i63;
                    i63 += 13;
                    i61 = i16;
                }
                iCharAt9 = i62 | (cCharAt2 << i63);
                i61 = i16;
            }
            int i64 = i61 + 1;
            iCharAt3 = strZzd.charAt(i61);
            if (iCharAt3 >= 55296) {
                int i65 = iCharAt3 & 8191;
                int i66 = 13;
                while (true) {
                    i15 = i64 + 1;
                    cCharAt = strZzd.charAt(i64);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i65 |= (cCharAt & 8191) << i66;
                    i66 += 13;
                    i64 = i15;
                }
                iCharAt3 = i65 | (cCharAt << i66);
                i64 = i15;
            }
            iArr = new int[iCharAt3 + iCharAt8 + iCharAt9];
            i11 = iCharAt5 + iCharAt5 + iCharAt6;
            i12 = iCharAt5;
            i40 = i64;
            int i67 = iCharAt8;
            i13 = iCharAt7;
            i14 = i67;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzggVar.zze();
        Class<?> cls = zzggVar.zza().getClass();
        int[] iArr2 = new int[iCharAt2 * 3];
        Object[] objArr = new Object[iCharAt2 + iCharAt2];
        int i68 = iCharAt3 + i14;
        int i69 = iCharAt3;
        int i70 = i68;
        int i71 = 0;
        int i72 = 0;
        while (i40 < length) {
            int i73 = i40 + 1;
            int iCharAt10 = strZzd.charAt(i40);
            if (iCharAt10 >= c10) {
                int i74 = iCharAt10 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i37 = i75 + 1;
                    cCharAt12 = strZzd.charAt(i75);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i74 |= (cCharAt12 & 8191) << i76;
                    i76 += 13;
                    i75 = i37;
                }
                iCharAt10 = i74 | (cCharAt12 << i76);
                i23 = i37;
            } else {
                i23 = i73;
            }
            int i77 = i23 + 1;
            int iCharAt11 = strZzd.charAt(i23);
            if (iCharAt11 >= c10) {
                int i78 = iCharAt11 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i36 = i79 + 1;
                    cCharAt11 = strZzd.charAt(i79);
                    i24 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i78 |= (cCharAt11 & 8191) << i80;
                    i80 += 13;
                    i79 = i36;
                    length = i24;
                }
                iCharAt11 = i78 | (cCharAt11 << i80);
                i25 = i36;
            } else {
                i24 = length;
                i25 = i77;
            }
            int i81 = iCharAt11 & 255;
            int i82 = iCharAt3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i72] = i71;
                i72++;
            }
            if (i81 >= 51) {
                int i83 = i25 + 1;
                int iCharAt12 = strZzd.charAt(i25);
                if (iCharAt12 >= 55296) {
                    int i84 = iCharAt12 & 8191;
                    int i85 = i83;
                    int i86 = 13;
                    while (true) {
                        i35 = i85 + 1;
                        cCharAt10 = strZzd.charAt(i85);
                        i26 = i13;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i84 |= (cCharAt10 & 8191) << i86;
                        i86 += 13;
                        i85 = i35;
                        i13 = i26;
                    }
                    iCharAt12 = i84 | (cCharAt10 << i86);
                    i31 = i35;
                } else {
                    i26 = i13;
                    i31 = i83;
                }
                int i87 = i81 - 51;
                i28 = i31;
                if (i87 == 9 || i87 == 17) {
                    int i88 = i71 / 3;
                    i32 = i11 + 1;
                    objArr[i88 + i88 + 1] = objArrZze[i11];
                } else {
                    if (i87 == 12 && !z10) {
                        int i89 = i71 / 3;
                        i32 = i11 + 1;
                        objArr[i89 + i89 + 1] = objArrZze[i11];
                    }
                    i33 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i33];
                    if (obj instanceof Field) {
                        fieldZzA2 = (Field) obj;
                    } else {
                        fieldZzA2 = zzA(cls, (String) obj);
                        objArrZze[i33] = fieldZzA2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzA2);
                    i34 = i33 + 1;
                    obj2 = objArrZze[i34];
                    if (obj2 instanceof Field) {
                        fieldZzA3 = (Field) obj2;
                    } else {
                        fieldZzA3 = zzA(cls, (String) obj2);
                        objArrZze[i34] = fieldZzA3;
                    }
                    cls = cls;
                    strZzd = strZzd;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzA3);
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i29 = 0;
                }
                i11 = i32;
                i33 = iCharAt12 + iCharAt12;
                obj = objArrZze[i33];
                if (obj instanceof Field) {
                    fieldZzA2 = (Field) obj;
                } else {
                    fieldZzA2 = zzA(cls, (String) obj);
                    objArrZze[i33] = fieldZzA2;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzA2);
                i34 = i33 + 1;
                obj2 = objArrZze[i34];
                if (obj2 instanceof Field) {
                    fieldZzA3 = (Field) obj2;
                } else {
                    fieldZzA3 = zzA(cls, (String) obj2);
                    objArrZze[i34] = fieldZzA3;
                }
                cls = cls;
                strZzd = strZzd;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzA3);
                iObjectFieldOffset = iObjectFieldOffset4;
                i29 = 0;
            } else {
                i26 = i13;
                int i90 = i11 + 1;
                Field fieldZzA4 = zzA(cls, (String) objArrZze[i11]);
                if (i81 == 9 || i81 == 17) {
                    int i91 = i71 / 3;
                    objArr[i91 + i91 + 1] = fieldZzA4.getType();
                } else {
                    if (i81 == 27 || i81 == 49) {
                        int i92 = i71 / 3;
                        i30 = i90 + 1;
                        objArr[i92 + i92 + 1] = objArrZze[i90];
                    } else if (i81 == 12 || i81 == 30 || i81 == 44) {
                        if (!z10) {
                            int i93 = i71 / 3;
                            i30 = i90 + 1;
                            objArr[i93 + i93 + 1] = objArrZze[i90];
                        }
                    } else if (i81 == 50) {
                        int i94 = i69 + 1;
                        iArr[i69] = i71;
                        int i95 = i71 / 3;
                        int i96 = i95 + i95;
                        int i97 = i90 + 1;
                        objArr[i96] = objArrZze[i90];
                        if ((iCharAt11 & 2048) != 0) {
                            i90 = i97 + 1;
                            objArr[i96 + 1] = objArrZze[i97];
                            i69 = i94;
                        } else {
                            i69 = i94;
                            i27 = i97;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzA4);
                        if ((iCharAt11 & 4096) == 4096 || i81 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i28 = i25;
                            i29 = 0;
                        } else {
                            int i98 = i25 + 1;
                            int iCharAt13 = strZzd.charAt(i25);
                            if (iCharAt13 >= 55296) {
                                int i99 = iCharAt13 & 8191;
                                int i100 = 13;
                                while (true) {
                                    i28 = i98 + 1;
                                    cCharAt9 = strZzd.charAt(i98);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i99 |= (cCharAt9 & 8191) << i100;
                                    i100 += 13;
                                    i98 = i28;
                                }
                                iCharAt13 = i99 | (cCharAt9 << i100);
                            } else {
                                i28 = i98;
                            }
                            int i101 = (iCharAt13 / 32) + i12 + i12;
                            Object obj3 = objArrZze[i101];
                            if (obj3 instanceof Field) {
                                fieldZzA = (Field) obj3;
                            } else {
                                fieldZzA = zzA(cls, (String) obj3);
                                objArrZze[i101] = fieldZzA;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzA);
                            i29 = iCharAt13 % 32;
                        }
                        if (i81 >= 18 && i81 <= 49) {
                            iArr[i70] = iObjectFieldOffset;
                            i70++;
                        }
                        i11 = i27;
                    }
                    i27 = i30;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzA4);
                    if ((iCharAt11 & 4096) == 4096) {
                        iObjectFieldOffset2 = 1048575;
                        i28 = i25;
                        i29 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i28 = i25;
                        i29 = 0;
                    }
                    if (i81 >= 18) {
                        iArr[i70] = iObjectFieldOffset;
                        i70++;
                    }
                    i11 = i27;
                }
                i27 = i90;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzA4);
                if ((iCharAt11 & 4096) == 4096) {
                    iObjectFieldOffset2 = 1048575;
                    i28 = i25;
                    i29 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i28 = i25;
                    i29 = 0;
                }
                if (i81 >= 18) {
                    iArr[i70] = iObjectFieldOffset;
                    i70++;
                }
                i11 = i27;
            }
            int i102 = i71 + 1;
            iArr2[i71] = iCharAt10;
            int i103 = i102 + 1;
            iArr2[i102] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i81 << 20) | iObjectFieldOffset;
            i71 = i103 + 1;
            iArr2[i103] = iObjectFieldOffset2 | (i29 << 20);
            strZzd = strZzd;
            iCharAt = iCharAt;
            iCharAt3 = i82;
            cls = cls;
            i40 = i28;
            length = i24;
            objArr = objArr;
            iArr2 = iArr2;
            i13 = i26;
            c10 = 55296;
        }
        return new zzfz(iArr2, objArr, iCharAt, i13, zzggVar.zza(), z10, false, iArr, iCharAt3, i68, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar, null);
    }

    private static int zzl(Object obj, long j10) {
        return ((Integer) zzhi.zzf(obj, j10)).intValue();
    }

    private final int zzm(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, zzds zzdsVar) throws IOException {
        Unsafe unsafe = zzb;
        Object objZzz = zzz(i12);
        Object object = unsafe.getObject(obj, j10);
        if (!((zzfq) object).zze()) {
            zzfq zzfqVarZzb = zzfq.zza().zzb();
            zzfr.zza(zzfqVarZzb, object);
            unsafe.putObject(obj, j10, zzfqVarZzb);
        }
        throw null;
    }

    private final int zzn(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, zzds zzdsVar) throws IOException {
        int iZzm;
        long jZzc;
        int iZzb;
        Object objValueOf;
        int iZzj;
        Object objZzg;
        Unsafe unsafe = zzb;
        long j11 = this.zzc[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(zzdt.zzn(bArr, i10))));
                unsafe.putInt(obj, j11, i13);
                return i10 + 8;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(zzdt.zzb(bArr, i10))));
                unsafe.putInt(obj, j11, i13);
                return i10 + 4;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                iZzm = zzdt.zzm(bArr, i10, zzdsVar);
                jZzc = zzdsVar.zzb;
                objValueOf = Long.valueOf(jZzc);
                unsafe.putObject(obj, j10, objValueOf);
                unsafe.putInt(obj, j11, i13);
                return iZzm;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                iZzm = zzdt.zzj(bArr, i10, zzdsVar);
                iZzb = zzdsVar.zza;
                objValueOf = Integer.valueOf(iZzb);
                unsafe.putObject(obj, j10, objValueOf);
                unsafe.putInt(obj, j11, i13);
                return iZzm;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Long.valueOf(zzdt.zzn(bArr, i10)));
                unsafe.putInt(obj, j11, i13);
                return i10 + 8;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(zzdt.zzb(bArr, i10)));
                unsafe.putInt(obj, j11, i13);
                return i10 + 4;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                iZzm = zzdt.zzm(bArr, i10, zzdsVar);
                objValueOf = Boolean.valueOf(zzdsVar.zzb != 0);
                unsafe.putObject(obj, j10, objValueOf);
                unsafe.putInt(obj, j11, i13);
                return iZzm;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                iZzj = zzdt.zzj(bArr, i10, zzdsVar);
                int i18 = zzdsVar.zza;
                if (i18 == 0) {
                    objZzg = "";
                    unsafe.putObject(obj, j10, objZzg);
                } else {
                    if ((i15 & 536870912) != 0 && !zzhm.zzd(bArr, iZzj, iZzj + i18)) {
                        throw zzfa.zzb();
                    }
                    unsafe.putObject(obj, j10, new String(bArr, iZzj, i18, zzez.zzb));
                    iZzj += i18;
                }
                unsafe.putInt(obj, j11, i13);
                return iZzj;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                iZzj = zzdt.zzd(zzy(i17), bArr, i10, i11, zzdsVar);
                Object object = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                objZzg = zzdsVar.zzc;
                if (object != null) {
                    objZzg = zzez.zzg(object, objZzg);
                }
                unsafe.putObject(obj, j10, objZzg);
                unsafe.putInt(obj, j11, i13);
                return iZzj;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                iZzm = zzdt.zza(bArr, i10, zzdsVar);
                objValueOf = zzdsVar.zzc;
                unsafe.putObject(obj, j10, objValueOf);
                unsafe.putInt(obj, j11, i13);
                return iZzm;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iZzj2 = zzdt.zzj(bArr, i10, zzdsVar);
                int i19 = zzdsVar.zza;
                zzex zzexVarZzx = zzx(i17);
                if (zzexVarZzx == null || zzexVarZzx.zza()) {
                    unsafe.putObject(obj, j10, Integer.valueOf(i19));
                    unsafe.putInt(obj, j11, i13);
                } else {
                    zzc(obj).zzf(i12, Long.valueOf(i19));
                }
                return iZzj2;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                iZzm = zzdt.zzj(bArr, i10, zzdsVar);
                iZzb = zzei.zzb(zzdsVar.zza);
                objValueOf = Integer.valueOf(iZzb);
                unsafe.putObject(obj, j10, objValueOf);
                unsafe.putInt(obj, j11, i13);
                return iZzm;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                iZzm = zzdt.zzm(bArr, i10, zzdsVar);
                jZzc = zzei.zzc(zzdsVar.zzb);
                objValueOf = Long.valueOf(jZzc);
                unsafe.putObject(obj, j10, objValueOf);
                unsafe.putInt(obj, j11, i13);
                return iZzm;
            case 68:
                if (i14 != 3) {
                    return i10;
                }
                iZzj = zzdt.zzc(zzy(i17), bArr, i10, i11, (i12 & (-8)) | 4, zzdsVar);
                Object object2 = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                objZzg = zzdsVar.zzc;
                if (object2 != null) {
                    objZzg = zzez.zzg(object2, objZzg);
                }
                unsafe.putObject(obj, j10, objZzg);
                unsafe.putInt(obj, j11, i13);
                return iZzj;
            default:
                return i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02c3 A[PHI: r0 r19 r26 r27 r28
  0x02c3: PHI (r0v20 int) = (r0v15 int), (r0v18 int), (r0v22 int) binds: [B:116:0x032b, B:111:0x030a, B:103:0x02c1] A[DONT_GENERATE, DONT_INLINE]
  0x02c3: PHI (r19v6 int) = (r19v4 int), (r19v4 int), (r19v8 int) binds: [B:116:0x032b, B:111:0x030a, B:103:0x02c1] A[DONT_GENERATE, DONT_INLINE]
  0x02c3: PHI (r26v3 int) = (r26v1 int), (r26v1 int), (r26v4 int) binds: [B:116:0x032b, B:111:0x030a, B:103:0x02c1] A[DONT_GENERATE, DONT_INLINE]
  0x02c3: PHI (r27v2 int) = (r27v0 int), (r27v0 int), (r27v3 int) binds: [B:116:0x032b, B:111:0x030a, B:103:0x02c1] A[DONT_GENERATE, DONT_INLINE]
  0x02c3: PHI (r28v6 sun.misc.Unsafe) = (r28v4 sun.misc.Unsafe), (r28v4 sun.misc.Unsafe), (r28v7 sun.misc.Unsafe) binds: [B:116:0x032b, B:111:0x030a, B:103:0x02c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:105:0x02d9 A[PHI: r0 r19 r26 r27 r28
  0x02d9: PHI (r0v19 int) = (r0v15 int), (r0v18 int), (r0v22 int) binds: [B:116:0x032b, B:111:0x030a, B:103:0x02c1] A[DONT_GENERATE, DONT_INLINE]
  0x02d9: PHI (r19v5 int) = (r19v4 int), (r19v4 int), (r19v8 int) binds: [B:116:0x032b, B:111:0x030a, B:103:0x02c1] A[DONT_GENERATE, DONT_INLINE]
  0x02d9: PHI (r26v2 int) = (r26v1 int), (r26v1 int), (r26v4 int) binds: [B:116:0x032b, B:111:0x030a, B:103:0x02c1] A[DONT_GENERATE, DONT_INLINE]
  0x02d9: PHI (r27v1 int) = (r27v0 int), (r27v0 int), (r27v3 int) binds: [B:116:0x032b, B:111:0x030a, B:103:0x02c1] A[DONT_GENERATE, DONT_INLINE]
  0x02d9: PHI (r28v5 sun.misc.Unsafe) = (r28v4 sun.misc.Unsafe), (r28v4 sun.misc.Unsafe), (r28v7 sun.misc.Unsafe) binds: [B:116:0x032b, B:111:0x030a, B:103:0x02c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x008d. Please report as an issue. */
    private final int zzo(Object obj, byte[] bArr, int i10, int i11, zzds zzdsVar) throws IOException {
        int i12;
        int iZzk;
        int i13;
        int i14;
        Unsafe unsafe;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Unsafe unsafe2;
        int i21;
        int i22;
        Unsafe unsafe3;
        int i23;
        Object objZzg;
        int iZzb;
        Unsafe unsafe4;
        this = this;
        obj = obj;
        bArr = bArr;
        i11 = i11;
        zzdsVar = zzdsVar;
        Unsafe unsafe5 = zzb;
        int i24 = -1;
        int i25 = 1048575;
        int iZzi = i10;
        int i26 = 1048575;
        int i27 = -1;
        int i28 = 0;
        int i29 = 0;
        while (iZzi < i11) {
            int i30 = iZzi + 1;
            byte b10 = bArr[iZzi];
            if (b10 < 0) {
                iZzk = zzdt.zzk(b10, bArr, i30, zzdsVar);
                i12 = zzdsVar.zza;
            } else {
                i12 = b10;
                iZzk = i30;
            }
            int i31 = i12 >>> 3;
            int i32 = i12 & 7;
            int iZzr = i31 > i27 ? this.zzr(i31, i28 / 3) : this.zzq(i31);
            if (iZzr == i24) {
                i13 = iZzk;
                i14 = i31;
                unsafe = unsafe5;
                i15 = i24;
                i16 = 0;
            } else {
                int[] iArr = this.zzc;
                int i33 = iArr[iZzr + 1];
                int iZzu = zzu(i33);
                Unsafe unsafe6 = unsafe5;
                long j10 = i33 & i25;
                if (iZzu <= 17) {
                    int i34 = iArr[iZzr + 2];
                    int i35 = 1 << (i34 >>> 20);
                    i17 = 1048575;
                    int i36 = i34 & 1048575;
                    if (i36 != i26) {
                        if (i26 != 1048575) {
                            long j11 = i26;
                            unsafe4 = unsafe6;
                            unsafe4.putInt(obj, j11, i29);
                        } else {
                            unsafe4 = unsafe6;
                        }
                        if (i36 != 1048575) {
                            i29 = unsafe4.getInt(obj, i36);
                        }
                        unsafe2 = unsafe4;
                        i26 = i36;
                    } else {
                        unsafe2 = unsafe6;
                    }
                    switch (iZzu) {
                        case 0:
                            i17 = 1048575;
                            i21 = i26;
                            i22 = iZzr;
                            i14 = i31;
                            unsafe3 = unsafe2;
                            i23 = iZzk;
                            if (i32 != 1) {
                                i13 = i23;
                                unsafe = unsafe3;
                                i16 = i22;
                                i26 = i21;
                                i15 = -1;
                            } else {
                                zzhi.zzl(obj, j10, Double.longBitsToDouble(zzdt.zzn(bArr, i23)));
                                iZzi = i23 + 8;
                                i29 |= i35;
                                unsafe5 = unsafe3;
                                i28 = i22;
                                i26 = i21;
                                i27 = i14;
                                i25 = i17;
                                i24 = -1;
                            }
                            break;
                        case 1:
                            i17 = 1048575;
                            i21 = i26;
                            i22 = iZzr;
                            i14 = i31;
                            unsafe3 = unsafe2;
                            i23 = iZzk;
                            if (i32 != 5) {
                                i13 = i23;
                                unsafe = unsafe3;
                                i16 = i22;
                                i26 = i21;
                                i15 = -1;
                            } else {
                                zzhi.zzm(obj, j10, Float.intBitsToFloat(zzdt.zzb(bArr, i23)));
                                iZzi = i23 + 4;
                                i29 |= i35;
                                unsafe5 = unsafe3;
                                i28 = i22;
                                i26 = i21;
                                i27 = i14;
                                i25 = i17;
                                i24 = -1;
                            }
                            break;
                        case 2:
                        case 3:
                            i17 = 1048575;
                            i21 = i26;
                            i22 = iZzr;
                            i14 = i31;
                            unsafe3 = unsafe2;
                            i23 = iZzk;
                            if (i32 != 0) {
                                i13 = i23;
                                unsafe = unsafe3;
                                i16 = i22;
                                i26 = i21;
                                i15 = -1;
                            } else {
                                int iZzm = zzdt.zzm(bArr, i23, zzdsVar);
                                unsafe3.putLong(obj, j10, zzdsVar.zzb);
                                i29 |= i35;
                                unsafe5 = unsafe3;
                                i28 = i22;
                                iZzi = iZzm;
                                i26 = i21;
                                i27 = i14;
                                i25 = i17;
                                i24 = -1;
                            }
                            break;
                        case 4:
                        case 11:
                            i21 = i26;
                            i22 = iZzr;
                            i14 = i31;
                            unsafe3 = unsafe2;
                            i23 = iZzk;
                            if (i32 != 0) {
                                i13 = i23;
                                unsafe = unsafe3;
                                i16 = i22;
                                i26 = i21;
                                i15 = -1;
                            } else {
                                iZzi = zzdt.zzj(bArr, i23, zzdsVar);
                                iZzb = zzdsVar.zza;
                                unsafe3.putInt(obj, j10, iZzb);
                                i29 |= i35;
                                unsafe5 = unsafe3;
                                i28 = i22;
                                i26 = i21;
                                i27 = i14;
                                i25 = i17;
                                i24 = -1;
                            }
                            break;
                        case 5:
                        case 14:
                            i17 = 1048575;
                            i21 = i26;
                            i22 = iZzr;
                            i14 = i31;
                            unsafe3 = unsafe2;
                            if (i32 != 1) {
                                i23 = iZzk;
                                i13 = i23;
                                unsafe = unsafe3;
                                i16 = i22;
                                i26 = i21;
                                i15 = -1;
                            } else {
                                unsafe3.putLong(obj, j10, zzdt.zzn(bArr, iZzk));
                                iZzi = iZzk + 8;
                                i29 |= i35;
                                unsafe5 = unsafe3;
                                i28 = i22;
                                i26 = i21;
                                i27 = i14;
                                i25 = i17;
                                i24 = -1;
                            }
                            break;
                        case 6:
                        case 13:
                            i17 = 1048575;
                            i21 = i26;
                            i22 = iZzr;
                            i14 = i31;
                            unsafe3 = unsafe2;
                            if (i32 != 5) {
                                i23 = iZzk;
                                i13 = i23;
                                unsafe = unsafe3;
                                i16 = i22;
                                i26 = i21;
                                i15 = -1;
                            } else {
                                unsafe3.putInt(obj, j10, zzdt.zzb(bArr, iZzk));
                                iZzi = iZzk + 4;
                                i29 |= i35;
                                unsafe5 = unsafe3;
                                i28 = i22;
                                i26 = i21;
                                i27 = i14;
                                i25 = i17;
                                i24 = -1;
                            }
                            break;
                        case 7:
                            i17 = 1048575;
                            i21 = i26;
                            i22 = iZzr;
                            i14 = i31;
                            unsafe3 = unsafe2;
                            if (i32 != 0) {
                                i23 = iZzk;
                                i13 = i23;
                                unsafe = unsafe3;
                                i16 = i22;
                                i26 = i21;
                                i15 = -1;
                            } else {
                                iZzi = zzdt.zzm(bArr, iZzk, zzdsVar);
                                zzhi.zzk(obj, j10, zzdsVar.zzb != 0);
                                i29 |= i35;
                                unsafe5 = unsafe3;
                                i28 = i22;
                                i26 = i21;
                                i27 = i14;
                                i25 = i17;
                                i24 = -1;
                            }
                            break;
                        case 8:
                            i17 = 1048575;
                            i21 = i26;
                            i22 = iZzr;
                            i14 = i31;
                            unsafe3 = unsafe2;
                            if (i32 != 2) {
                                i23 = iZzk;
                                i13 = i23;
                                unsafe = unsafe3;
                                i16 = i22;
                                i26 = i21;
                                i15 = -1;
                            } else {
                                iZzi = (i33 & 536870912) == 0 ? zzdt.zzg(bArr, iZzk, zzdsVar) : zzdt.zzh(bArr, iZzk, zzdsVar);
                                objZzg = zzdsVar.zzc;
                                unsafe3.putObject(obj, j10, objZzg);
                                i29 |= i35;
                                unsafe5 = unsafe3;
                                i28 = i22;
                                i26 = i21;
                                i27 = i14;
                                i25 = i17;
                                i24 = -1;
                            }
                            break;
                        case 9:
                            i17 = 1048575;
                            i21 = i26;
                            i22 = iZzr;
                            i14 = i31;
                            unsafe3 = unsafe2;
                            if (i32 != 2) {
                                i23 = iZzk;
                                i13 = i23;
                                unsafe = unsafe3;
                                i16 = i22;
                                i26 = i21;
                                i15 = -1;
                            } else {
                                iZzi = zzdt.zzd(this.zzy(i22), bArr, iZzk, i11, zzdsVar);
                                Object object = unsafe3.getObject(obj, j10);
                                objZzg = object == null ? zzdsVar.zzc : zzez.zzg(object, zzdsVar.zzc);
                                unsafe3.putObject(obj, j10, objZzg);
                                i29 |= i35;
                                unsafe5 = unsafe3;
                                i28 = i22;
                                i26 = i21;
                                i27 = i14;
                                i25 = i17;
                                i24 = -1;
                            }
                            break;
                        case 10:
                            i17 = 1048575;
                            i21 = i26;
                            i22 = iZzr;
                            i14 = i31;
                            unsafe3 = unsafe2;
                            if (i32 != 2) {
                                i23 = iZzk;
                                i13 = i23;
                                unsafe = unsafe3;
                                i16 = i22;
                                i26 = i21;
                                i15 = -1;
                            } else {
                                iZzi = zzdt.zza(bArr, iZzk, zzdsVar);
                                objZzg = zzdsVar.zzc;
                                unsafe3.putObject(obj, j10, objZzg);
                                i29 |= i35;
                                unsafe5 = unsafe3;
                                i28 = i22;
                                i26 = i21;
                                i27 = i14;
                                i25 = i17;
                                i24 = -1;
                            }
                            break;
                        case 12:
                            i21 = i26;
                            i22 = iZzr;
                            i14 = i31;
                            unsafe3 = unsafe2;
                            if (i32 != 0) {
                                i23 = iZzk;
                                i13 = i23;
                                unsafe = unsafe3;
                                i16 = i22;
                                i26 = i21;
                                i15 = -1;
                            } else {
                                iZzi = zzdt.zzj(bArr, iZzk, zzdsVar);
                                iZzb = zzdsVar.zza;
                                unsafe3.putInt(obj, j10, iZzb);
                                i29 |= i35;
                                unsafe5 = unsafe3;
                                i28 = i22;
                                i26 = i21;
                                i27 = i14;
                                i25 = i17;
                                i24 = -1;
                            }
                            break;
                        case 15:
                            i17 = 1048575;
                            i21 = i26;
                            i22 = iZzr;
                            i14 = i31;
                            unsafe3 = unsafe2;
                            if (i32 != 0) {
                                i23 = iZzk;
                                i13 = i23;
                                unsafe = unsafe3;
                                i16 = i22;
                                i26 = i21;
                                i15 = -1;
                            } else {
                                iZzi = zzdt.zzj(bArr, iZzk, zzdsVar);
                                iZzb = zzei.zzb(zzdsVar.zza);
                                unsafe3.putInt(obj, j10, iZzb);
                                i29 |= i35;
                                unsafe5 = unsafe3;
                                i28 = i22;
                                i26 = i21;
                                i27 = i14;
                                i25 = i17;
                                i24 = -1;
                            }
                            break;
                        case 16:
                            if (i32 != 0) {
                                i21 = i26;
                                i14 = i31;
                                unsafe3 = unsafe2;
                                i23 = iZzk;
                                i22 = iZzr;
                                i13 = i23;
                                unsafe = unsafe3;
                                i16 = i22;
                                i26 = i21;
                                i15 = -1;
                            } else {
                                int iZzm2 = zzdt.zzm(bArr, iZzk, zzdsVar);
                                i21 = i26;
                                i14 = i31;
                                i17 = 1048575;
                                unsafe2.putLong(obj, j10, zzei.zzc(zzdsVar.zzb));
                                i29 |= i35;
                                unsafe5 = unsafe2;
                                i28 = iZzr;
                                iZzi = iZzm2;
                                i26 = i21;
                                i27 = i14;
                                i25 = i17;
                                i24 = -1;
                            }
                            break;
                        default:
                            i21 = i26;
                            i22 = iZzr;
                            i14 = i31;
                            unsafe3 = unsafe2;
                            i23 = iZzk;
                            i13 = i23;
                            unsafe = unsafe3;
                            i16 = i22;
                            i26 = i21;
                            i15 = -1;
                            break;
                    }
                } else {
                    i14 = i31;
                    int i37 = iZzk;
                    i17 = 1048575;
                    int i38 = i26;
                    if (iZzu != 27) {
                        i16 = iZzr;
                        if (iZzu <= 49) {
                            i19 = i29;
                            i20 = i38;
                            unsafe = unsafe6;
                            i15 = -1;
                            iZzi = zzp(obj, bArr, i37, i11, i12, i14, i32, i16, i33, iZzu, j10, zzdsVar);
                            if (iZzi != i37) {
                                i24 = i15;
                                i27 = i14;
                                i28 = i16;
                                i29 = i19;
                                i26 = i20;
                            } else {
                                i13 = iZzi;
                                i29 = i19;
                                i26 = i20;
                            }
                        } else {
                            i18 = i37;
                            i19 = i29;
                            unsafe = unsafe6;
                            i20 = i38;
                            i15 = -1;
                            if (iZzu == 50) {
                                if (i32 == 2) {
                                    iZzi = zzm(obj, bArr, i18, i11, i16, j10, zzdsVar);
                                    if (iZzi != i18) {
                                        i24 = i15;
                                        i27 = i14;
                                        i28 = i16;
                                        i29 = i19;
                                        i26 = i20;
                                    } else {
                                        i13 = iZzi;
                                    }
                                }
                                i29 = i19;
                                i26 = i20;
                            } else {
                                iZzi = zzn(obj, bArr, i18, i11, i12, i14, i32, i33, iZzu, j10, i16, zzdsVar);
                                if (iZzi != i18) {
                                    i24 = i15;
                                    i27 = i14;
                                    i28 = i16;
                                    i29 = i19;
                                    i26 = i20;
                                } else {
                                    i13 = iZzi;
                                    i29 = i19;
                                    i26 = i20;
                                }
                            }
                        }
                        unsafe5 = unsafe;
                        i25 = 1048575;
                    } else if (i32 == 2) {
                        zzey zzeyVarZzd = (zzey) unsafe6.getObject(obj, j10);
                        if (!zzeyVarZzd.zzc()) {
                            int size = zzeyVarZzd.size();
                            zzeyVarZzd = zzeyVarZzd.zzd(size == 0 ? 10 : size + size);
                            unsafe6.putObject(obj, j10, zzeyVarZzd);
                        }
                        iZzi = zzdt.zze(this.zzy(iZzr), i12, bArr, i37, i11, zzeyVarZzd, zzdsVar);
                        unsafe5 = unsafe6;
                        i29 = i29;
                        i26 = i38;
                        i27 = i14;
                        i28 = iZzr;
                        i25 = i17;
                        i24 = -1;
                    } else {
                        i16 = iZzr;
                        i18 = i37;
                        i19 = i29;
                        unsafe = unsafe6;
                        i20 = i38;
                        i15 = -1;
                    }
                    i13 = i18;
                    i29 = i19;
                    i26 = i20;
                }
            }
            iZzi = zzdt.zzi(i12, bArr, i13, i11, zzc(obj), zzdsVar);
            i24 = i15;
            i27 = i14;
            i28 = i16;
            unsafe5 = unsafe;
            i25 = 1048575;
        }
        int i39 = i29;
        Unsafe unsafe7 = unsafe5;
        if (i26 != i25) {
            unsafe7.putInt(obj, i26, i39);
        }
        if (iZzi == i11) {
            return iZzi;
        }
        throw zzfa.zzd();
    }

    /* JADX WARN: Code duplicated, block: B:152:0x025c A[LOOP:9: B:153:0x025d->B:152:0x025c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x0262  */
    /* JADX WARN: Code duplicated, block: B:158:0x026b  */
    /* JADX WARN: Code duplicated, block: B:294:0x0276 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x025a A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x01b4 -> B:94:0x0193). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x01fc -> B:112:0x01d3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:159:0x0273 -> B:151:0x025a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0149 -> B:63:0x0124). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final int zzp(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.auth.zzds r29) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzp(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.auth.zzds):int");
    }

    private final int zzq(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzt(i10, 0);
    }

    private final int zzr(int i10, int i11) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzt(i10, i11);
    }

    private final int zzs(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzt(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int zzu(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzv(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzw(Object obj, long j10) {
        return ((Long) zzhi.zzf(obj, j10)).longValue();
    }

    private final zzex zzx(int i10) {
        int i11 = i10 / 3;
        return (zzex) this.zzd[i11 + i11 + 1];
    }

    private final zzgh zzy(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzgh zzghVar = (zzgh) this.zzd[i12];
        if (zzghVar != null) {
            return zzghVar;
        }
        zzgh zzghVarZzb = zzge.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzghVarZzb;
        return zzghVarZzb;
    }

    private final Object zzz(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ee A[PHI: r3
  0x00ee: PHI (r3v13 java.lang.Object) = (r3v10 java.lang.Object), (r3v14 java.lang.Object) binds: [B:66:0x00ec, B:62:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x00f6  */
    @Override // com.google.android.gms.internal.auth.zzgh
    public final int zza(Object obj) {
        int i10;
        double dZza;
        float fZzb;
        long jZzd;
        int i11;
        int iZzc;
        boolean zZzt;
        int iHashCode;
        Object objZzf;
        int length = this.zzc.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iZzv = zzv(i13);
            int i14 = this.zzc[i13];
            long j10 = 1048575 & iZzv;
            int iHashCode2 = 37;
            switch (zzu(iZzv)) {
                case 0:
                    i10 = i12 * 53;
                    dZza = zzhi.zza(obj, j10);
                    jZzd = Double.doubleToLongBits(dZza);
                    iHashCode = zzez.zzc(jZzd);
                    i12 = iHashCode + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    fZzb = zzhi.zzb(obj, j10);
                    iHashCode = Float.floatToIntBits(fZzb);
                    i12 = iHashCode + i10;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i10 = i12 * 53;
                    jZzd = zzhi.zzd(obj, j10);
                    iHashCode = zzez.zzc(jZzd);
                    i12 = iHashCode + i10;
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i11 = i12 * 53;
                    iZzc = zzhi.zzc(obj, j10);
                    i12 = i11 + iZzc;
                    break;
                case 7:
                    i10 = i12 * 53;
                    zZzt = zzhi.zzt(obj, j10);
                    iHashCode = zzez.zza(zZzt);
                    i12 = iHashCode + i10;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iHashCode = ((String) zzhi.zzf(obj, j10)).hashCode();
                    i12 = iHashCode + i10;
                    break;
                case 9:
                    objZzf = zzhi.zzf(obj, j10);
                    if (objZzf != null) {
                        iHashCode2 = objZzf.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode2;
                    break;
                case 10:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    i10 = i12 * 53;
                    iHashCode = zzhi.zzf(obj, j10).hashCode();
                    i12 = iHashCode + i10;
                    break;
                case 17:
                    objZzf = zzhi.zzf(obj, j10);
                    if (objZzf != null) {
                        iHashCode2 = objZzf.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode2;
                    break;
                case 51:
                    if (zzJ(obj, i14, i13)) {
                        i10 = i12 * 53;
                        dZza = ((Double) zzhi.zzf(obj, j10)).doubleValue();
                        jZzd = Double.doubleToLongBits(dZza);
                        iHashCode = zzez.zzc(jZzd);
                        i12 = iHashCode + i10;
                    }
                    break;
                case 52:
                    if (zzJ(obj, i14, i13)) {
                        i10 = i12 * 53;
                        fZzb = ((Float) zzhi.zzf(obj, j10)).floatValue();
                        iHashCode = Float.floatToIntBits(fZzb);
                        i12 = iHashCode + i10;
                    }
                    break;
                case 53:
                    if (zzJ(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jZzd = zzw(obj, j10);
                        iHashCode = zzez.zzc(jZzd);
                        i12 = iHashCode + i10;
                    }
                    break;
                case 54:
                    if (zzJ(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jZzd = zzw(obj, j10);
                        iHashCode = zzez.zzc(jZzd);
                        i12 = iHashCode + i10;
                    }
                    break;
                case 55:
                    if (zzJ(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzl(obj, j10);
                        i12 = i11 + iZzc;
                    }
                    break;
                case 56:
                    if (zzJ(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jZzd = zzw(obj, j10);
                        iHashCode = zzez.zzc(jZzd);
                        i12 = iHashCode + i10;
                    }
                    break;
                case 57:
                    if (zzJ(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzl(obj, j10);
                        i12 = i11 + iZzc;
                    }
                    break;
                case 58:
                    if (zzJ(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zZzt = ((Boolean) zzhi.zzf(obj, j10)).booleanValue();
                        iHashCode = zzez.zza(zZzt);
                        i12 = iHashCode + i10;
                    }
                    break;
                case 59:
                    if (zzJ(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iHashCode = ((String) zzhi.zzf(obj, j10)).hashCode();
                        i12 = iHashCode + i10;
                    }
                    break;
                case 60:
                    if (zzJ(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iHashCode = zzhi.zzf(obj, j10).hashCode();
                        i12 = iHashCode + i10;
                    }
                    break;
                case 61:
                    if (zzJ(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iHashCode = zzhi.zzf(obj, j10).hashCode();
                        i12 = iHashCode + i10;
                    }
                    break;
                case 62:
                    if (zzJ(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzl(obj, j10);
                        i12 = i11 + iZzc;
                    }
                    break;
                case 63:
                    if (zzJ(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzl(obj, j10);
                        i12 = i11 + iZzc;
                    }
                    break;
                case 64:
                    if (zzJ(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzl(obj, j10);
                        i12 = i11 + iZzc;
                    }
                    break;
                case 65:
                    if (zzJ(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jZzd = zzw(obj, j10);
                        iHashCode = zzez.zzc(jZzd);
                        i12 = iHashCode + i10;
                    }
                    break;
                case 66:
                    if (zzJ(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzl(obj, j10);
                        i12 = i11 + iZzc;
                    }
                    break;
                case 67:
                    if (zzJ(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jZzd = zzw(obj, j10);
                        iHashCode = zzez.zzc(jZzd);
                        i12 = iHashCode + i10;
                    }
                    break;
                case 68:
                    if (zzJ(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iHashCode = zzhi.zzf(obj, j10).hashCode();
                        i12 = iHashCode + i10;
                    }
                    break;
            }
        }
        return this.zzm.zza(obj).hashCode() + (i12 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0337 A[PHI: r0 r27
  0x0337: PHI (r0v73 int) = (r0v68 int), (r0v71 int), (r0v75 int) binds: [B:133:0x0392, B:127:0x0370, B:119:0x0335] A[DONT_GENERATE, DONT_INLINE]
  0x0337: PHI (r27v9 sun.misc.Unsafe) = (r27v7 sun.misc.Unsafe), (r27v7 sun.misc.Unsafe), (r27v10 sun.misc.Unsafe) binds: [B:133:0x0392, B:127:0x0370, B:119:0x0335] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x034f A[PHI: r0 r27
  0x034f: PHI (r0v72 int) = (r0v68 int), (r0v71 int), (r0v75 int) binds: [B:133:0x0392, B:127:0x0370, B:119:0x0335] A[DONT_GENERATE, DONT_INLINE]
  0x034f: PHI (r27v8 sun.misc.Unsafe) = (r27v7 sun.misc.Unsafe), (r27v7 sun.misc.Unsafe), (r27v10 sun.misc.Unsafe) binds: [B:133:0x0392, B:127:0x0370, B:119:0x0335] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x008c. Please report as an issue. */
    public final int zzb(Object obj, byte[] bArr, int i10, int i11, int i12, zzds zzdsVar) throws IOException {
        Unsafe unsafe;
        Object obj2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        long j10;
        Object objZzg;
        long j11;
        int iZzb;
        int i26;
        int i27;
        this = this;
        obj = obj;
        bArr = bArr;
        i11 = i11;
        int i28 = i12;
        zzdsVar = zzdsVar;
        Unsafe unsafe2 = zzb;
        int iZzi = i10;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = -1;
        int i33 = 1048575;
        while (true) {
            if (iZzi < i11) {
                int i34 = iZzi + 1;
                byte b10 = bArr[iZzi];
                if (b10 < 0) {
                    int iZzk = zzdt.zzk(b10, bArr, i34, zzdsVar);
                    i13 = zzdsVar.zza;
                    i34 = iZzk;
                } else {
                    i13 = b10;
                }
                int i35 = i13 >>> 3;
                int i36 = i13 & 7;
                int iZzr = i35 > i32 ? this.zzr(i35, i30 / 3) : this.zzq(i35);
                if (iZzr == -1) {
                    i14 = i35;
                    i15 = i34;
                    i16 = i13;
                    i17 = i31;
                    unsafe = unsafe2;
                    i12 = i28;
                    i18 = 0;
                } else {
                    int[] iArr = this.zzc;
                    int i37 = iArr[iZzr + 1];
                    int iZzu = zzu(i37);
                    i14 = i35;
                    int i38 = i34;
                    long j12 = i37 & 1048575;
                    if (iZzu <= 17) {
                        int i39 = iArr[iZzr + 2];
                        int i40 = 1 << (i39 >>> 20);
                        int i41 = i39 & 1048575;
                        int i42 = i13;
                        if (i41 != i33) {
                            if (i33 != 1048575) {
                                unsafe2.putInt(obj, i33, i31);
                            }
                            i31 = unsafe2.getInt(obj, i41);
                            i19 = i41;
                        } else {
                            i19 = i33;
                        }
                        int i43 = i31;
                        switch (iZzu) {
                            case 0:
                                i20 = iZzr;
                                i21 = i38;
                                if (i36 == 1) {
                                    zzhi.zzl(obj, j12, Double.longBitsToDouble(zzdt.zzn(bArr, i21)));
                                    iZzi = i21 + 8;
                                    i31 = i43 | i40;
                                    i30 = i20;
                                    i29 = i42;
                                    i32 = i14;
                                    i33 = i19;
                                    i28 = i12;
                                } else {
                                    i26 = i21;
                                    i12 = i12;
                                    i17 = i43;
                                    unsafe = unsafe2;
                                    i18 = i20;
                                    i16 = i42;
                                    i15 = i26;
                                    i33 = i19;
                                }
                                break;
                            case 1:
                                i20 = iZzr;
                                i21 = i38;
                                if (i36 == 5) {
                                    zzhi.zzm(obj, j12, Float.intBitsToFloat(zzdt.zzb(bArr, i21)));
                                    iZzi = i21 + 4;
                                    i31 = i43 | i40;
                                    i30 = i20;
                                    i29 = i42;
                                    i32 = i14;
                                    i33 = i19;
                                    i28 = i12;
                                } else {
                                    i26 = i21;
                                    i12 = i12;
                                    i17 = i43;
                                    unsafe = unsafe2;
                                    i18 = i20;
                                    i16 = i42;
                                    i15 = i26;
                                    i33 = i19;
                                }
                                break;
                            case 2:
                            case 3:
                                i20 = iZzr;
                                i21 = i38;
                                if (i36 == 0) {
                                    int iZzm = zzdt.zzm(bArr, i21, zzdsVar);
                                    unsafe2.putLong(obj, j12, zzdsVar.zzb);
                                    i31 = i43 | i40;
                                    iZzi = iZzm;
                                    i30 = i20;
                                    i29 = i42;
                                    i32 = i14;
                                    i33 = i19;
                                    i28 = i12;
                                } else {
                                    i26 = i21;
                                    i12 = i12;
                                    i17 = i43;
                                    unsafe = unsafe2;
                                    i18 = i20;
                                    i16 = i42;
                                    i15 = i26;
                                    i33 = i19;
                                }
                                break;
                            case 4:
                            case 11:
                                i20 = iZzr;
                                i21 = i38;
                                if (i36 == 0) {
                                    iZzi = zzdt.zzj(bArr, i21, zzdsVar);
                                    unsafe2.putInt(obj, j12, zzdsVar.zza);
                                    i31 = i43 | i40;
                                    i30 = i20;
                                    i29 = i42;
                                    i32 = i14;
                                    i33 = i19;
                                    i28 = i12;
                                } else {
                                    i26 = i21;
                                    i12 = i12;
                                    i17 = i43;
                                    unsafe = unsafe2;
                                    i18 = i20;
                                    i16 = i42;
                                    i15 = i26;
                                    i33 = i19;
                                }
                                break;
                            case 5:
                            case 14:
                                i20 = iZzr;
                                i22 = i42;
                                i23 = i38;
                                if (i36 == 1) {
                                    i42 = i22;
                                    i21 = i23;
                                    unsafe2.putLong(obj, j12, zzdt.zzn(bArr, i23));
                                    iZzi = i21 + 8;
                                    i31 = i43 | i40;
                                    i30 = i20;
                                    i29 = i42;
                                    i32 = i14;
                                    i33 = i19;
                                    i28 = i12;
                                } else {
                                    i42 = i22;
                                    i26 = i23;
                                    i12 = i12;
                                    i17 = i43;
                                    unsafe = unsafe2;
                                    i18 = i20;
                                    i16 = i42;
                                    i15 = i26;
                                    i33 = i19;
                                }
                                break;
                            case 6:
                            case 13:
                                i20 = iZzr;
                                i22 = i42;
                                i23 = i38;
                                if (i36 == 5) {
                                    unsafe2.putInt(obj, j12, zzdt.zzb(bArr, i23));
                                    iZzi = i23 + 4;
                                    i31 = i43 | i40;
                                    i29 = i22;
                                    i30 = i20;
                                    i32 = i14;
                                    i33 = i19;
                                    i28 = i12;
                                } else {
                                    i42 = i22;
                                    i26 = i23;
                                    i12 = i12;
                                    i17 = i43;
                                    unsafe = unsafe2;
                                    i18 = i20;
                                    i16 = i42;
                                    i15 = i26;
                                    i33 = i19;
                                }
                                break;
                            case 7:
                                i20 = iZzr;
                                i22 = i42;
                                i23 = i38;
                                if (i36 == 0) {
                                    iZzi = zzdt.zzm(bArr, i23, zzdsVar);
                                    zzhi.zzk(obj, j12, zzdsVar.zzb != 0);
                                    i31 = i43 | i40;
                                    i29 = i22;
                                    i30 = i20;
                                    i32 = i14;
                                    i33 = i19;
                                    i28 = i12;
                                } else {
                                    i42 = i22;
                                    i26 = i23;
                                    i12 = i12;
                                    i17 = i43;
                                    unsafe = unsafe2;
                                    i18 = i20;
                                    i16 = i42;
                                    i15 = i26;
                                    i33 = i19;
                                }
                                break;
                            case 8:
                                i20 = iZzr;
                                i22 = i42;
                                i23 = i38;
                                if (i36 == 2) {
                                    iZzi = (536870912 & i37) == 0 ? zzdt.zzg(bArr, i23, zzdsVar) : zzdt.zzh(bArr, i23, zzdsVar);
                                    unsafe2.putObject(obj, j12, zzdsVar.zzc);
                                    i31 = i43 | i40;
                                    i29 = i22;
                                    i30 = i20;
                                    i32 = i14;
                                    i33 = i19;
                                    i28 = i12;
                                } else {
                                    i42 = i22;
                                    i26 = i23;
                                    i12 = i12;
                                    i17 = i43;
                                    unsafe = unsafe2;
                                    i18 = i20;
                                    i16 = i42;
                                    i15 = i26;
                                    i33 = i19;
                                }
                                break;
                            case 9:
                                i20 = iZzr;
                                i24 = i42;
                                i25 = i38;
                                j10 = j12;
                                if (i36 == 2) {
                                    iZzi = zzdt.zzd(this.zzy(i20), bArr, i25, i11, zzdsVar);
                                    objZzg = (i43 & i40) == 0 ? zzdsVar.zzc : zzez.zzg(unsafe2.getObject(obj, j10), zzdsVar.zzc);
                                    unsafe2.putObject(obj, j10, objZzg);
                                    i31 = i43 | i40;
                                    i29 = i24;
                                    i30 = i20;
                                    i32 = i14;
                                    i33 = i19;
                                    i28 = i12;
                                } else {
                                    i26 = i25;
                                    i42 = i24;
                                    i12 = i12;
                                    i17 = i43;
                                    unsafe = unsafe2;
                                    i18 = i20;
                                    i16 = i42;
                                    i15 = i26;
                                    i33 = i19;
                                }
                                break;
                            case 10:
                                i20 = iZzr;
                                i24 = i42;
                                i25 = i38;
                                j10 = j12;
                                if (i36 == 2) {
                                    iZzi = zzdt.zza(bArr, i25, zzdsVar);
                                    objZzg = zzdsVar.zzc;
                                    unsafe2.putObject(obj, j10, objZzg);
                                    i31 = i43 | i40;
                                    i29 = i24;
                                    i30 = i20;
                                    i32 = i14;
                                    i33 = i19;
                                    i28 = i12;
                                } else {
                                    i26 = i25;
                                    i42 = i24;
                                    i12 = i12;
                                    i17 = i43;
                                    unsafe = unsafe2;
                                    i18 = i20;
                                    i16 = i42;
                                    i15 = i26;
                                    i33 = i19;
                                }
                                break;
                            case 12:
                                i20 = iZzr;
                                i24 = i42;
                                i25 = i38;
                                j11 = j12;
                                if (i36 == 0) {
                                    iZzi = zzdt.zzj(bArr, i25, zzdsVar);
                                    iZzb = zzdsVar.zza;
                                    zzex zzexVarZzx = this.zzx(i20);
                                    if (zzexVarZzx == null || zzexVarZzx.zza()) {
                                        unsafe2.putInt(obj, j11, iZzb);
                                        i31 = i43 | i40;
                                    } else {
                                        zzc(obj).zzf(i24, Long.valueOf(iZzb));
                                        i31 = i43;
                                    }
                                    i29 = i24;
                                    i30 = i20;
                                    i32 = i14;
                                    i33 = i19;
                                    i28 = i12;
                                } else {
                                    i26 = i25;
                                    i42 = i24;
                                    i12 = i12;
                                    i17 = i43;
                                    unsafe = unsafe2;
                                    i18 = i20;
                                    i16 = i42;
                                    i15 = i26;
                                    i33 = i19;
                                }
                                break;
                            case 15:
                                i20 = iZzr;
                                i24 = i42;
                                i25 = i38;
                                if (i36 == 0) {
                                    iZzi = zzdt.zzj(bArr, i25, zzdsVar);
                                    iZzb = zzei.zzb(zzdsVar.zza);
                                    j11 = j12;
                                    unsafe2.putInt(obj, j11, iZzb);
                                    i31 = i43 | i40;
                                    i29 = i24;
                                    i30 = i20;
                                    i32 = i14;
                                    i33 = i19;
                                    i28 = i12;
                                } else {
                                    i26 = i25;
                                    i42 = i24;
                                    i12 = i12;
                                    i17 = i43;
                                    unsafe = unsafe2;
                                    i18 = i20;
                                    i16 = i42;
                                    i15 = i26;
                                    i33 = i19;
                                }
                                break;
                            case 16:
                                if (i36 == 0) {
                                    int iZzm2 = zzdt.zzm(bArr, i38, zzdsVar);
                                    i20 = iZzr;
                                    i24 = i42;
                                    unsafe2.putLong(obj, j12, zzei.zzc(zzdsVar.zzb));
                                    i31 = i43 | i40;
                                    iZzi = iZzm2;
                                    i29 = i24;
                                    i30 = i20;
                                    i32 = i14;
                                    i33 = i19;
                                    i28 = i12;
                                } else {
                                    i20 = iZzr;
                                    i23 = i38;
                                    i26 = i23;
                                    i12 = i12;
                                    i17 = i43;
                                    unsafe = unsafe2;
                                    i18 = i20;
                                    i16 = i42;
                                    i15 = i26;
                                    i33 = i19;
                                }
                                break;
                            default:
                                i20 = iZzr;
                                i21 = i38;
                                if (i36 == 3) {
                                    iZzi = zzdt.zzc(this.zzy(i20), bArr, i21, i11, (i14 << 3) | 4, zzdsVar);
                                    unsafe2.putObject(obj, j12, (i43 & i40) == 0 ? zzdsVar.zzc : zzez.zzg(unsafe2.getObject(obj, j12), zzdsVar.zzc));
                                    i31 = i43 | i40;
                                    bArr = bArr;
                                    i30 = i20;
                                    i29 = i42;
                                    i32 = i14;
                                    i33 = i19;
                                    i28 = i12;
                                } else {
                                    i26 = i21;
                                    i12 = i12;
                                    i17 = i43;
                                    unsafe = unsafe2;
                                    i18 = i20;
                                    i16 = i42;
                                    i15 = i26;
                                    i33 = i19;
                                }
                                break;
                        }
                    } else {
                        int i44 = i13;
                        int i45 = iZzr;
                        if (iZzu != 27) {
                            i18 = i45;
                            i17 = i31;
                            i19 = i33;
                            if (iZzu <= 49) {
                                unsafe = unsafe2;
                                iZzi = zzp(obj, bArr, i38, i11, i44, i14, i36, i18, i37, iZzu, j12, zzdsVar);
                                if (iZzi != i38) {
                                    i28 = i12;
                                    i29 = i44;
                                    i32 = i14;
                                    i30 = i18;
                                    i31 = i17;
                                    i33 = i19;
                                } else {
                                    i15 = iZzi;
                                    i16 = i44;
                                    i33 = i19;
                                }
                                unsafe2 = unsafe;
                            } else {
                                unsafe = unsafe2;
                                i27 = i38;
                                if (iZzu == 50) {
                                    if (i36 == 2) {
                                        iZzi = zzm(obj, bArr, i27, i11, i18, j12, zzdsVar);
                                        if (iZzi != i27) {
                                            i28 = i12;
                                            i29 = i44;
                                            i32 = i14;
                                            i30 = i18;
                                            i31 = i17;
                                            i33 = i19;
                                        } else {
                                            i15 = iZzi;
                                        }
                                        unsafe2 = unsafe;
                                    }
                                    i16 = i44;
                                    i33 = i19;
                                } else {
                                    iZzi = zzn(obj, bArr, i27, i11, i44, i14, i36, i37, iZzu, j12, i18, zzdsVar);
                                    if (iZzi != i27) {
                                        i28 = i12;
                                        i29 = i44;
                                        i32 = i14;
                                        i30 = i18;
                                        i31 = i17;
                                        i33 = i19;
                                    } else {
                                        i15 = iZzi;
                                        i16 = i44;
                                        i33 = i19;
                                    }
                                    unsafe2 = unsafe;
                                }
                            }
                        } else if (i36 == 2) {
                            zzey zzeyVarZzd = (zzey) unsafe2.getObject(obj, j12);
                            if (!zzeyVarZzd.zzc()) {
                                int size = zzeyVarZzd.size();
                                zzeyVarZzd = zzeyVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj, j12, zzeyVarZzd);
                            }
                            i29 = i44;
                            iZzi = zzdt.zze(this.zzy(i45), i29, bArr, i38, i11, zzeyVarZzd, zzdsVar);
                            bArr = bArr;
                            i11 = i11;
                            i28 = i12;
                            i32 = i14;
                            i30 = i45;
                            i31 = i31;
                            i33 = i33;
                        } else {
                            i18 = i45;
                            i17 = i31;
                            i19 = i33;
                            unsafe = unsafe2;
                            i27 = i38;
                        }
                        i15 = i27;
                        i16 = i44;
                        i33 = i19;
                    }
                }
                if (i16 != i12 || i12 == 0) {
                    iZzi = zzdt.zzi(i16, bArr, i15, i11, zzc(obj), zzdsVar);
                    i28 = i12;
                    i29 = i16;
                    i32 = i14;
                    i30 = i18;
                    i31 = i17;
                    unsafe2 = unsafe;
                } else {
                    iZzi = i15;
                    i29 = i16;
                    i31 = i17;
                }
            } else {
                unsafe = unsafe2;
                i12 = i28;
            }
        }
        if (i33 != 1048575) {
            long j13 = i33;
            obj2 = obj;
            unsafe.putInt(obj2, j13, i31);
        } else {
            obj2 = obj;
        }
        for (int i46 = this.zzj; i46 < this.zzk; i46++) {
            int i47 = this.zzi[i46];
            int i48 = this.zzc[i47];
            Object objZzf = zzhi.zzf(obj2, zzv(i47) & 1048575);
            if (objZzf != null && zzx(i47) != null) {
                throw null;
            }
        }
        if (i12 == 0) {
            if (iZzi != i11) {
                throw zzfa.zzd();
            }
        } else if (iZzi > i11 || i29 != i12) {
            throw zzfa.zzd();
        }
        return iZzi;
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final Object zzd() {
        return ((zzeu) this.zzg).zzi(4, null, null);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zze(Object obj) {
        int i10;
        int i11 = this.zzj;
        while (true) {
            i10 = this.zzk;
            if (i11 >= i10) {
                break;
            }
            long jZzv = zzv(this.zzi[i11]) & 1048575;
            Object objZzf = zzhi.zzf(obj, jZzv);
            if (objZzf != null) {
                ((zzfq) objZzf).zzc();
                zzhi.zzp(obj, jZzv, objZzf);
            }
            i11++;
        }
        int length = this.zzi.length;
        while (i10 < length) {
            this.zzl.zza(obj, this.zzi[i10]);
            i10++;
        }
        this.zzm.zze(obj);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:41:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c8  */
    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzf(Object obj, Object obj2) {
        Objects.requireNonNull(obj2);
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzv = zzv(i10);
            long j10 = 1048575 & iZzv;
            int i11 = this.zzc[i10];
            switch (zzu(iZzv)) {
                case 0:
                    if (zzG(obj2, i10)) {
                        zzhi.zzl(obj, j10, zzhi.zza(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 1:
                    if (zzG(obj2, i10)) {
                        zzhi.zzm(obj, j10, zzhi.zzb(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 2:
                    if (zzG(obj2, i10)) {
                        zzhi.zzo(obj, j10, zzhi.zzd(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 3:
                    if (zzG(obj2, i10)) {
                        zzhi.zzo(obj, j10, zzhi.zzd(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 4:
                    if (zzG(obj2, i10)) {
                        zzhi.zzn(obj, j10, zzhi.zzc(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 5:
                    if (zzG(obj2, i10)) {
                        zzhi.zzo(obj, j10, zzhi.zzd(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 6:
                    if (zzG(obj2, i10)) {
                        zzhi.zzn(obj, j10, zzhi.zzc(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 7:
                    if (zzG(obj2, i10)) {
                        zzhi.zzk(obj, j10, zzhi.zzt(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 8:
                    if (zzG(obj2, i10)) {
                        zzhi.zzp(obj, j10, zzhi.zzf(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 9:
                case 17:
                    zzB(obj, obj2, i10);
                    break;
                case 10:
                    if (zzG(obj2, i10)) {
                        zzhi.zzp(obj, j10, zzhi.zzf(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 11:
                    if (zzG(obj2, i10)) {
                        zzhi.zzn(obj, j10, zzhi.zzc(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 12:
                    if (zzG(obj2, i10)) {
                        zzhi.zzn(obj, j10, zzhi.zzc(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 13:
                    if (zzG(obj2, i10)) {
                        zzhi.zzn(obj, j10, zzhi.zzc(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 14:
                    if (zzG(obj2, i10)) {
                        zzhi.zzo(obj, j10, zzhi.zzd(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 15:
                    if (zzG(obj2, i10)) {
                        zzhi.zzn(obj, j10, zzhi.zzc(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 16:
                    if (zzG(obj2, i10)) {
                        zzhi.zzo(obj, j10, zzhi.zzd(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzl.zzb(obj, obj2, j10);
                    break;
                case 50:
                    zzgj.zzi(this.zzp, obj, obj2, j10);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzJ(obj2, i11, i10)) {
                        zzhi.zzp(obj, j10, zzhi.zzf(obj2, j10));
                        zzE(obj, i11, i10);
                    }
                    break;
                case 60:
                case 68:
                    zzC(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzJ(obj2, i11, i10)) {
                        zzhi.zzp(obj, j10, zzhi.zzf(obj2, j10));
                        zzE(obj, i11, i10);
                    }
                    break;
            }
        }
        zzgj.zzf(this.zzm, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzg(Object obj, byte[] bArr, int i10, int i11, zzds zzdsVar) throws IOException {
        if (this.zzh) {
            zzo(obj, bArr, i10, i11, zzdsVar);
        } else {
            zzb(obj, bArr, i10, i11, 0, zzdsVar);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzh(Object obj, Object obj2) {
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iZzv = zzv(i10);
            long j10 = iZzv & 1048575;
            switch (zzu(iZzv)) {
                case 0:
                    if (!zzF(obj, obj2, i10) || Double.doubleToLongBits(zzhi.zza(obj, j10)) != Double.doubleToLongBits(zzhi.zza(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 1:
                    if (!zzF(obj, obj2, i10) || Float.floatToIntBits(zzhi.zzb(obj, j10)) != Float.floatToIntBits(zzhi.zzb(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 2:
                    if (!zzF(obj, obj2, i10) || zzhi.zzd(obj, j10) != zzhi.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 3:
                    if (!zzF(obj, obj2, i10) || zzhi.zzd(obj, j10) != zzhi.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 4:
                    if (!zzF(obj, obj2, i10) || zzhi.zzc(obj, j10) != zzhi.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!zzF(obj, obj2, i10) || zzhi.zzd(obj, j10) != zzhi.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 6:
                    if (!zzF(obj, obj2, i10) || zzhi.zzc(obj, j10) != zzhi.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 7:
                    if (!zzF(obj, obj2, i10) || zzhi.zzt(obj, j10) != zzhi.zzt(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 8:
                    if (!zzF(obj, obj2, i10) || !zzgj.zzh(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 9:
                    if (!zzF(obj, obj2, i10) || !zzgj.zzh(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 10:
                    if (!zzF(obj, obj2, i10) || !zzgj.zzh(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 11:
                    if (!zzF(obj, obj2, i10) || zzhi.zzc(obj, j10) != zzhi.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 12:
                    if (!zzF(obj, obj2, i10) || zzhi.zzc(obj, j10) != zzhi.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 13:
                    if (!zzF(obj, obj2, i10) || zzhi.zzc(obj, j10) != zzhi.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 14:
                    if (!zzF(obj, obj2, i10) || zzhi.zzd(obj, j10) != zzhi.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 15:
                    if (!zzF(obj, obj2, i10) || zzhi.zzc(obj, j10) != zzhi.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 16:
                    if (!zzF(obj, obj2, i10) || zzhi.zzd(obj, j10) != zzhi.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 17:
                    if (!zzF(obj, obj2, i10) || !zzgj.zzh(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    if (!zzgj.zzh(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzs = zzs(i10) & 1048575;
                    if (zzhi.zzc(obj, jZzs) != zzhi.zzc(obj2, jZzs) || !zzgj.zzh(zzhi.zzf(obj, j10), zzhi.zzf(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
            }
        }
        return this.zzm.zza(obj).equals(this.zzm.zza(obj2));
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0 A[LOOP:1: B:45:0x00af->B:50:0x00c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00dd A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzi(Object obj) {
        int i10;
        int i11;
        List list;
        zzgh zzghVarZzy;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.zzj) {
            int i16 = this.zzi[i15];
            int i17 = this.zzc[i16];
            int iZzv = zzv(i16);
            int i18 = this.zzc[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i13) {
                if (i19 != 1048575) {
                    i14 = zzb.getInt(obj, i19);
                }
                i11 = i14;
                i10 = i19;
            } else {
                i10 = i13;
                i11 = i14;
            }
            if ((268435456 & iZzv) != 0 && !zzH(obj, i16, i10, i11, i20)) {
                return false;
            }
            int iZzu = zzu(iZzv);
            if (iZzu == 9 || iZzu == 17) {
                if (zzH(obj, i16, i10, i11, i20) && !zzI(obj, iZzv, zzy(i16))) {
                    return false;
                }
            } else if (iZzu == 27) {
                list = (List) zzhi.zzf(obj, iZzv & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzghVarZzy = zzy(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!zzghVarZzy.zzi(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iZzu == 60 || iZzu == 68) {
                if (zzJ(obj, i17, i16) && !zzI(obj, iZzv, zzy(i16))) {
                    return false;
                }
            } else if (iZzu == 49) {
                list = (List) zzhi.zzf(obj, iZzv & 1048575);
                if (list.isEmpty()) {
                    zzghVarZzy = zzy(i16);
                    while (i12 < list.size()) {
                        if (!zzghVarZzy.zzi(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzu == 50 && !((zzfq) zzhi.zzf(obj, iZzv & 1048575)).isEmpty()) {
                throw null;
            }
            i15++;
            i13 = i10;
            i14 = i11;
        }
        return true;
    }
}
