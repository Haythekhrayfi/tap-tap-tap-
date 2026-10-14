package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import q2.a;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class zzdi<T> implements zzdp<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzeq.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzdf zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzct zzl;
    private final zzeg zzm;
    private final zzbo zzn;
    private final int zzo;
    private final zzdk zzp;
    private final zzda zzq;

    private zzdi(int[] iArr, Object[] objArr, int i10, int i11, zzdf zzdfVar, int i12, boolean z10, int[] iArr2, int i13, int i14, zzdk zzdkVar, zzct zzctVar, zzeg zzegVar, zzbo zzboVar, zzda zzdaVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzo = i12;
        boolean z11 = false;
        if (zzboVar != null && zzboVar.zzc(zzdfVar)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzi = iArr2;
        this.zzj = i13;
        this.zzk = i14;
        this.zzp = zzdkVar;
        this.zzl = zzctVar;
        this.zzm = zzegVar;
        this.zzn = zzboVar;
        this.zzg = zzdfVar;
        this.zzq = zzdaVar;
    }

    private final zzce zzA(int i10) {
        int i11 = i10 / 3;
        return (zzce) this.zzd[i11 + i11 + 1];
    }

    private final zzdp zzB(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzdp zzdpVar = (zzdp) this.zzd[i12];
        if (zzdpVar != null) {
            return zzdpVar;
        }
        zzdp zzdpVarZzb = zzdn.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzdpVarZzb;
        return zzdpVarZzb;
    }

    private final Object zzC(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final Object zzD(Object obj, int i10) {
        zzdp zzdpVarZzB = zzB(i10);
        int iZzy = zzy(i10) & 1048575;
        if (!zzP(obj, i10)) {
            return zzdpVarZzB.zze();
        }
        Object object = zzb.getObject(obj, iZzy);
        if (zzS(object)) {
            return object;
        }
        Object objZze = zzdpVarZzB.zze();
        if (object != null) {
            zzdpVarZzB.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzE(Object obj, int i10, int i11) {
        zzdp zzdpVarZzB = zzB(i11);
        if (!zzT(obj, i10, i11)) {
            return zzdpVarZzB.zze();
        }
        Object object = zzb.getObject(obj, zzy(i11) & 1048575);
        if (zzS(object)) {
            return object;
        }
        Object objZze = zzdpVarZzB.zze();
        if (object != null) {
            zzdpVarZzB.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzF(Class cls, String str) {
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

    private static void zzG(Object obj) {
        if (!zzS(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzH(Object obj, Object obj2, int i10) {
        if (zzP(obj2, i10)) {
            int iZzy = zzy(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzy;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzdp zzdpVarZzB = zzB(i10);
            if (!zzP(obj, i10)) {
                if (zzS(object)) {
                    Object objZze = zzdpVarZzB.zze();
                    zzdpVarZzB.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzJ(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzS(object2)) {
                Object objZze2 = zzdpVarZzB.zze();
                zzdpVarZzB.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            zzdpVarZzB.zzg(object2, object);
        }
    }

    private final void zzI(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (zzT(obj2, i11, i10)) {
            int iZzy = zzy(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzy;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzdp zzdpVarZzB = zzB(i10);
            if (!zzT(obj, i11, i10)) {
                if (zzS(object)) {
                    Object objZze = zzdpVarZzB.zze();
                    zzdpVarZzB.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzK(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzS(object2)) {
                Object objZze2 = zzdpVarZzB.zze();
                zzdpVarZzB.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            zzdpVarZzB.zzg(object2, object);
        }
    }

    private final void zzJ(Object obj, int i10) {
        int iZzv = zzv(i10);
        long j10 = 1048575 & iZzv;
        if (j10 == 1048575) {
            return;
        }
        zzeq.zzq(obj, j10, (1 << (iZzv >>> 20)) | zzeq.zzc(obj, j10));
    }

    private final void zzK(Object obj, int i10, int i11) {
        zzeq.zzq(obj, zzv(i11) & 1048575, i10);
    }

    private final void zzL(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzy(i10) & 1048575, obj2);
        zzJ(obj, i10);
    }

    private final void zzM(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzy(i11) & 1048575, obj2);
        zzK(obj, i10, i11);
    }

    private final void zzN(zzey zzeyVar, int i10, Object obj, int i11) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzO(Object obj, Object obj2, int i10) {
        return zzP(obj, i10) == zzP(obj2, i10);
    }

    private final boolean zzP(Object obj, int i10) {
        int iZzv = zzv(i10);
        long j10 = iZzv & 1048575;
        if (j10 != 1048575) {
            return (zzeq.zzc(obj, j10) & (1 << (iZzv >>> 20))) != 0;
        }
        int iZzy = zzy(i10);
        long j11 = iZzy & 1048575;
        switch (zzx(iZzy)) {
            case 0:
                return Double.doubleToRawLongBits(zzeq.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzeq.zzb(obj, j11)) != 0;
            case 2:
                return zzeq.zzd(obj, j11) != 0;
            case 3:
                return zzeq.zzd(obj, j11) != 0;
            case 4:
                return zzeq.zzc(obj, j11) != 0;
            case 5:
                return zzeq.zzd(obj, j11) != 0;
            case 6:
                return zzeq.zzc(obj, j11) != 0;
            case 7:
                return zzeq.zzw(obj, j11);
            case 8:
                Object objZzf = zzeq.zzf(obj, j11);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzba) {
                    return !zzba.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzeq.zzf(obj, j11) != null;
            case 10:
                return !zzba.zzb.equals(zzeq.zzf(obj, j11));
            case 11:
                return zzeq.zzc(obj, j11) != 0;
            case 12:
                return zzeq.zzc(obj, j11) != 0;
            case 13:
                return zzeq.zzc(obj, j11) != 0;
            case 14:
                return zzeq.zzd(obj, j11) != 0;
            case 15:
                return zzeq.zzc(obj, j11) != 0;
            case 16:
                return zzeq.zzd(obj, j11) != 0;
            case 17:
                return zzeq.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzQ(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzP(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    private static boolean zzR(Object obj, int i10, zzdp zzdpVar) {
        return zzdpVar.zzk(zzeq.zzf(obj, i10 & 1048575));
    }

    private static boolean zzS(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzcb) {
            return ((zzcb) obj).zzt();
        }
        return true;
    }

    private final boolean zzT(Object obj, int i10, int i11) {
        return zzeq.zzc(obj, (long) (zzv(i11) & 1048575)) == i10;
    }

    private static boolean zzU(Object obj, long j10) {
        return ((Boolean) zzeq.zzf(obj, j10)).booleanValue();
    }

    private static final void zzV(int i10, Object obj, zzey zzeyVar) throws IOException {
        if (obj instanceof String) {
            zzeyVar.zzF(i10, (String) obj);
        } else {
            zzeyVar.zzd(i10, (zzba) obj);
        }
    }

    public static zzeh zzd(Object obj) {
        zzcb zzcbVar = (zzcb) obj;
        zzeh zzehVar = zzcbVar.zzc;
        if (zzehVar != zzeh.zzc()) {
            return zzehVar;
        }
        zzeh zzehVarZzf = zzeh.zzf();
        zzcbVar.zzc = zzehVarZzf;
        return zzehVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x024f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0252  */
    /* JADX WARN: Code duplicated, block: B:127:0x026a  */
    /* JADX WARN: Code duplicated, block: B:128:0x026d  */
    public static zzdi zzl(Class cls, zzdc zzdcVar, zzdk zzdkVar, zzct zzctVar, zzeg zzegVar, zzbo zzboVar, zzda zzdaVar) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        char cCharAt;
        int i17;
        char cCharAt2;
        int i18;
        char cCharAt3;
        int i19;
        char cCharAt4;
        int i20;
        char cCharAt5;
        int i21;
        char cCharAt6;
        int i22;
        char cCharAt7;
        int i23;
        char cCharAt8;
        int i24;
        int i25;
        int i26;
        int iObjectFieldOffset;
        int i27;
        int i28;
        int iObjectFieldOffset2;
        Field fieldZzF;
        char cCharAt9;
        int i29;
        int i30;
        int i31;
        Object obj;
        Field fieldZzF2;
        int i32;
        Object obj2;
        Field fieldZzF3;
        int i33;
        char cCharAt10;
        int i34;
        char cCharAt11;
        int i35;
        char cCharAt12;
        int i36;
        char cCharAt13;
        if (!(zzdcVar instanceof zzdo)) {
            throw null;
        }
        zzdo zzdoVar = (zzdo) zzdcVar;
        String strZzd = zzdoVar.zzd();
        int length = strZzd.length();
        char c10 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i37 = 1;
            while (true) {
                i10 = i37 + 1;
                if (strZzd.charAt(i37) < 55296) {
                    break;
                }
                i37 = i10;
            }
        } else {
            i10 = 1;
        }
        int i38 = i10 + 1;
        int iCharAt3 = strZzd.charAt(i10);
        if (iCharAt3 >= 55296) {
            int i39 = iCharAt3 & 8191;
            int i40 = 13;
            while (true) {
                i36 = i38 + 1;
                cCharAt13 = strZzd.charAt(i38);
                if (cCharAt13 < 55296) {
                    break;
                }
                i39 |= (cCharAt13 & 8191) << i40;
                i40 += 13;
                i38 = i36;
            }
            iCharAt3 = i39 | (cCharAt13 << i40);
            i38 = i36;
        }
        if (iCharAt3 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            i12 = 0;
            i15 = 0;
            i11 = 0;
            i13 = 0;
            iArr = zza;
            i14 = 0;
        } else {
            int i41 = i38 + 1;
            int iCharAt4 = strZzd.charAt(i38);
            if (iCharAt4 >= 55296) {
                int i42 = iCharAt4 & 8191;
                int i43 = 13;
                while (true) {
                    i23 = i41 + 1;
                    cCharAt8 = strZzd.charAt(i41);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt8 & 8191) << i43;
                    i43 += 13;
                    i41 = i23;
                }
                iCharAt4 = i42 | (cCharAt8 << i43);
                i41 = i23;
            }
            int i44 = i41 + 1;
            int iCharAt5 = strZzd.charAt(i41);
            if (iCharAt5 >= 55296) {
                int i45 = iCharAt5 & 8191;
                int i46 = 13;
                while (true) {
                    i22 = i44 + 1;
                    cCharAt7 = strZzd.charAt(i44);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt7 & 8191) << i46;
                    i46 += 13;
                    i44 = i22;
                }
                iCharAt5 = i45 | (cCharAt7 << i46);
                i44 = i22;
            }
            int i47 = i44 + 1;
            int iCharAt6 = strZzd.charAt(i44);
            if (iCharAt6 >= 55296) {
                int i48 = iCharAt6 & 8191;
                int i49 = 13;
                while (true) {
                    i21 = i47 + 1;
                    cCharAt6 = strZzd.charAt(i47);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt6 & 8191) << i49;
                    i49 += 13;
                    i47 = i21;
                }
                iCharAt6 = i48 | (cCharAt6 << i49);
                i47 = i21;
            }
            int i50 = i47 + 1;
            int iCharAt7 = strZzd.charAt(i47);
            if (iCharAt7 >= 55296) {
                int i51 = iCharAt7 & 8191;
                int i52 = 13;
                while (true) {
                    i20 = i50 + 1;
                    cCharAt5 = strZzd.charAt(i50);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt5 & 8191) << i52;
                    i52 += 13;
                    i50 = i20;
                }
                iCharAt7 = i51 | (cCharAt5 << i52);
                i50 = i20;
            }
            int i53 = i50 + 1;
            iCharAt = strZzd.charAt(i50);
            if (iCharAt >= 55296) {
                int i54 = iCharAt & 8191;
                int i55 = 13;
                while (true) {
                    i19 = i53 + 1;
                    cCharAt4 = strZzd.charAt(i53);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt4 & 8191) << i55;
                    i55 += 13;
                    i53 = i19;
                }
                iCharAt = i54 | (cCharAt4 << i55);
                i53 = i19;
            }
            int i56 = i53 + 1;
            iCharAt2 = strZzd.charAt(i53);
            if (iCharAt2 >= 55296) {
                int i57 = iCharAt2 & 8191;
                int i58 = 13;
                while (true) {
                    i18 = i56 + 1;
                    cCharAt3 = strZzd.charAt(i56);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt3 & 8191) << i58;
                    i58 += 13;
                    i56 = i18;
                }
                iCharAt2 = i57 | (cCharAt3 << i58);
                i56 = i18;
            }
            int i59 = i56 + 1;
            int iCharAt8 = strZzd.charAt(i56);
            if (iCharAt8 >= 55296) {
                int i60 = iCharAt8 & 8191;
                int i61 = 13;
                while (true) {
                    i17 = i59 + 1;
                    cCharAt2 = strZzd.charAt(i59);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt2 & 8191) << i61;
                    i61 += 13;
                    i59 = i17;
                }
                iCharAt8 = i60 | (cCharAt2 << i61);
                i59 = i17;
            }
            int i62 = i59 + 1;
            int iCharAt9 = strZzd.charAt(i59);
            if (iCharAt9 >= 55296) {
                int i63 = iCharAt9 & 8191;
                int i64 = 13;
                while (true) {
                    i16 = i62 + 1;
                    cCharAt = strZzd.charAt(i62);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i63 |= (cCharAt & 8191) << i64;
                    i64 += 13;
                    i62 = i16;
                }
                iCharAt9 = i63 | (cCharAt << i64);
                i62 = i16;
            }
            i11 = iCharAt4 + iCharAt4 + iCharAt5;
            iArr = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i12 = iCharAt6;
            i13 = iCharAt9;
            i14 = iCharAt4;
            i15 = iCharAt7;
            i38 = i62;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzdoVar.zze();
        Class<?> cls2 = zzdoVar.zza().getClass();
        int i65 = i13 + iCharAt2;
        int i66 = iCharAt + iCharAt;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr = new Object[i66];
        int i67 = 0;
        int i68 = 0;
        int i69 = i13;
        int i70 = i65;
        while (i38 < length) {
            int i71 = i38 + 1;
            int iCharAt10 = strZzd.charAt(i38);
            if (iCharAt10 >= c10) {
                int i72 = iCharAt10 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i35 = i73 + 1;
                    cCharAt12 = strZzd.charAt(i73);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i72 |= (cCharAt12 & 8191) << i74;
                    i74 += 13;
                    i73 = i35;
                }
                iCharAt10 = i72 | (cCharAt12 << i74);
                i24 = i35;
            } else {
                i24 = i71;
            }
            int i75 = i24 + 1;
            int iCharAt11 = strZzd.charAt(i24);
            if (iCharAt11 >= c10) {
                int i76 = iCharAt11 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i34 = i77 + 1;
                    cCharAt11 = strZzd.charAt(i77);
                    if (cCharAt11 < c10) {
                        break;
                    }
                    i76 |= (cCharAt11 & 8191) << i78;
                    i78 += 13;
                    i77 = i34;
                }
                iCharAt11 = i76 | (cCharAt11 << i78);
                i25 = i34;
            } else {
                i25 = i75;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i67] = i68;
                i67++;
            }
            int i79 = iCharAt11 & 255;
            if (i79 >= 51) {
                int i80 = i25 + 1;
                int iCharAt12 = strZzd.charAt(i25);
                char c11 = 55296;
                if (iCharAt12 >= 55296) {
                    int i81 = iCharAt12 & 8191;
                    int i82 = 13;
                    while (true) {
                        i33 = i80 + 1;
                        cCharAt10 = strZzd.charAt(i80);
                        if (cCharAt10 < c11) {
                            break;
                        }
                        i81 |= (cCharAt10 & 8191) << i82;
                        i82 += 13;
                        i80 = i33;
                        c11 = 55296;
                    }
                    iCharAt12 = i81 | (cCharAt10 << i82);
                    i80 = i33;
                }
                int i83 = i79 - 51;
                int i84 = i80;
                if (i83 == 9 || i83 == 17) {
                    int i85 = i68 / 3;
                    i30 = i11 + 1;
                    objArr[i85 + i85 + 1] = objArrZze[i11];
                } else {
                    if (i83 == 12 && (zzdoVar.zzc() == 1 || (iCharAt11 & 2048) != 0)) {
                        int i86 = i68 / 3;
                        i30 = i11 + 1;
                        objArr[i86 + i86 + 1] = objArrZze[i11];
                    }
                    i31 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i31];
                    if (obj instanceof Field) {
                        fieldZzF2 = (Field) obj;
                    } else {
                        fieldZzF2 = zzF(cls2, (String) obj);
                        objArrZze[i31] = fieldZzF2;
                    }
                    int i87 = i12;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzF2);
                    i32 = i31 + 1;
                    obj2 = objArrZze[i32];
                    if (obj2 instanceof Field) {
                        fieldZzF3 = (Field) obj2;
                    } else {
                        fieldZzF3 = zzF(cls2, (String) obj2);
                        objArrZze[i32] = fieldZzF3;
                    }
                    i26 = i87;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzF3);
                    i27 = i84;
                    i28 = 0;
                    strZzd = strZzd;
                }
                i11 = i30;
                i31 = iCharAt12 + iCharAt12;
                obj = objArrZze[i31];
                if (obj instanceof Field) {
                    fieldZzF2 = (Field) obj;
                } else {
                    fieldZzF2 = zzF(cls2, (String) obj);
                    objArrZze[i31] = fieldZzF2;
                }
                int i88 = i12;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzF2);
                i32 = i31 + 1;
                obj2 = objArrZze[i32];
                if (obj2 instanceof Field) {
                    fieldZzF3 = (Field) obj2;
                } else {
                    fieldZzF3 = zzF(cls2, (String) obj2);
                    objArrZze[i32] = fieldZzF3;
                }
                i26 = i88;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzF3);
                i27 = i84;
                i28 = 0;
                strZzd = strZzd;
            } else {
                i26 = i12;
                int i89 = i11 + 1;
                Field fieldZzF4 = zzF(cls2, (String) objArrZze[i11]);
                if (i79 == 9 || i79 == 17) {
                    i26 = i26;
                    int i90 = i68 / 3;
                    objArr[i90 + i90 + 1] = fieldZzF4.getType();
                } else {
                    if (i79 == 27 || i79 == 49) {
                        i26 = i26;
                        int i91 = i68 / 3;
                        i29 = i89 + 1;
                        objArr[i91 + i91 + 1] = objArrZze[i89];
                    } else if (i79 == 12 || i79 == 30 || i79 == 44) {
                        i26 = i26;
                        if (zzdoVar.zzc() == 1 || (iCharAt11 & 2048) != 0) {
                            int i92 = i68 / 3;
                            i29 = i89 + 1;
                            objArr[i92 + i92 + 1] = objArrZze[i89];
                        }
                    } else if (i79 == 50) {
                        int i93 = i69 + 1;
                        iArr[i69] = i68;
                        int i94 = i68 / 3;
                        int i95 = i89 + 1;
                        int i96 = i94 + i94;
                        objArr[i96] = objArrZze[i89];
                        if ((iCharAt11 & 2048) != 0) {
                            i89 = i95 + 1;
                            objArr[i96 + 1] = objArrZze[i95];
                            i69 = i93;
                        } else {
                            i69 = i93;
                            i89 = i95;
                        }
                    }
                    i89 = i29;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzF4);
                iObjectFieldOffset = 1048575;
                if ((iCharAt11 & 4096) == 0 || i79 > 17) {
                    i27 = i25;
                    i28 = 0;
                } else {
                    int i97 = i25 + 1;
                    int iCharAt13 = strZzd.charAt(i25);
                    if (iCharAt13 >= 55296) {
                        int i98 = iCharAt13 & 8191;
                        int i99 = 13;
                        while (true) {
                            i27 = i97 + 1;
                            cCharAt9 = strZzd.charAt(i97);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i98 |= (cCharAt9 & 8191) << i99;
                            i99 += 13;
                            i97 = i27;
                        }
                        iCharAt13 = i98 | (cCharAt9 << i99);
                    } else {
                        i27 = i97;
                    }
                    int i100 = (iCharAt13 / 32) + i14 + i14;
                    Object obj3 = objArrZze[i100];
                    if (obj3 instanceof Field) {
                        fieldZzF = (Field) obj3;
                    } else {
                        fieldZzF = zzF(cls2, (String) obj3);
                        objArrZze[i100] = fieldZzF;
                    }
                    i28 = iCharAt13 % 32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzF);
                }
                if (i79 >= 18 && i79 <= 49) {
                    iArr[i70] = iObjectFieldOffset3;
                    i70++;
                }
                iObjectFieldOffset2 = iObjectFieldOffset3;
                i11 = i89;
            }
            int i101 = i68 + 1;
            iArr2[i68] = iCharAt10;
            int i102 = i101 + 1;
            iArr2[i101] = iObjectFieldOffset2 | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i79 << 20);
            i68 = i102 + 1;
            iArr2[i102] = (i28 << 20) | iObjectFieldOffset;
            strZzd = strZzd;
            i38 = i27;
            length = length;
            i12 = i26;
            i15 = i15;
            c10 = 55296;
        }
        return new zzdi(iArr2, objArr, i12, i15, zzdoVar.zza(), zzdoVar.zzc(), false, iArr, i13, i65, zzdkVar, zzctVar, zzegVar, zzboVar, zzdaVar);
    }

    private static double zzm(Object obj, long j10) {
        return ((Double) zzeq.zzf(obj, j10)).doubleValue();
    }

    private static float zzn(Object obj, long j10) {
        return ((Float) zzeq.zzf(obj, j10)).floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0248 A[PHI: r3
  0x0248: PHI (r3v111 int) = 
  (r3v74 int)
  (r3v77 int)
  (r3v80 int)
  (r3v83 int)
  (r3v86 int)
  (r3v89 int)
  (r3v92 int)
  (r3v95 int)
  (r3v98 int)
  (r3v101 int)
  (r3v104 int)
  (r3v107 int)
  (r3v110 int)
  (r3v114 int)
 binds: [B:117:0x0246, B:114:0x0239, B:111:0x022c, B:108:0x021f, B:105:0x0212, B:102:0x0205, B:99:0x01f8, B:96:0x01eb, B:93:0x01db, B:90:0x01cd, B:87:0x01bf, B:84:0x01b1, B:81:0x01a3, B:78:0x0195] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:159:0x0356  */
    /* JADX WARN: Code duplicated, block: B:178:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    /* JADX WARN: Code duplicated, block: B:185:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0139  */
    /* JADX WARN: Code duplicated, block: B:71:0x0154  */
    /* JADX WARN: Code duplicated, block: B:74:0x0164  */
    private final int zzo(Object obj) {
        int i10;
        int iZzx;
        int iZzw;
        Object object;
        int i11;
        int iZzx2;
        int iZzx3;
        int iZzp;
        int iZzg;
        int iZzh;
        int iZzx4;
        Object object2;
        int i12;
        Unsafe unsafe = zzb;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1048575;
        while (i16 < this.zzc.length) {
            int iZzy = zzy(i16);
            int[] iArr = this.zzc;
            int i18 = iArr[i16];
            int iZzx5 = zzx(iZzy);
            if (iZzx5 <= 17) {
                int i19 = iArr[i16 + 2];
                int i20 = i19 & i13;
                int i21 = i19 >>> 20;
                if (i20 != i17) {
                    i14 = unsafe.getInt(obj, i20);
                    i17 = i20;
                }
                i10 = 1 << i21;
            } else {
                i10 = 0;
            }
            long j10 = i13 & iZzy;
            switch (iZzx5) {
                case 0:
                    if ((i14 & i10) != 0) {
                        iZzg = zzbi.zzx(i18 << 3) + 8;
                        i15 += iZzg;
                    }
                    break;
                case 1:
                    if ((i14 & i10) != 0) {
                        iZzg = zzbi.zzx(i18 << 3) + 4;
                        i15 += iZzg;
                    }
                    break;
                case 2:
                    if ((i14 & i10) != 0) {
                        int iZzy2 = zzbi.zzy(unsafe.getLong(obj, j10));
                        iZzx = zzbi.zzx(i18 << 3);
                        iZzw = iZzy2;
                        i15 = iZzx + iZzw + i15;
                    }
                    break;
                case 3:
                    if ((i14 & i10) != 0) {
                        int iZzy3 = zzbi.zzy(unsafe.getLong(obj, j10));
                        iZzx = zzbi.zzx(i18 << 3);
                        iZzw = iZzy3;
                        i15 = iZzx + iZzw + i15;
                    }
                    break;
                case 4:
                    if ((i14 & i10) != 0) {
                        i11 = i18 << 3;
                        iZzw = zzbi.zzu(unsafe.getInt(obj, j10));
                        iZzx = zzbi.zzx(i11);
                        i15 = iZzx + iZzw + i15;
                    }
                    break;
                case 5:
                    if ((i14 & i10) != 0) {
                        iZzg = zzbi.zzx(i18 << 3) + 8;
                        i15 += iZzg;
                    }
                    break;
                case 6:
                    if ((i14 & i10) != 0) {
                        iZzg = zzbi.zzx(i18 << 3) + 4;
                        i15 += iZzg;
                    }
                    break;
                case 7:
                    if ((i14 & i10) != 0) {
                        iZzg = zzbi.zzx(i18 << 3) + 1;
                        i15 += iZzg;
                    }
                    break;
                case 8:
                    if ((i14 & i10) != 0) {
                        object = unsafe.getObject(obj, j10);
                        if (!(object instanceof zzba)) {
                            i11 = i18 << 3;
                            iZzw = zzbi.zzw((String) object);
                            iZzx = zzbi.zzx(i11);
                            i15 = iZzx + iZzw + i15;
                        }
                        int i22 = zzbi.zzb;
                        int iZzd = ((zzba) object).zzd();
                        iZzx2 = iZzd + zzbi.zzx(iZzd);
                        iZzx3 = zzbi.zzx(i18 << 3);
                        iZzg = iZzx2 + iZzx3;
                        i15 += iZzg;
                        break;
                    }
                    break;
                case 9:
                    if ((i14 & i10) != 0) {
                        iZzg = zzdr.zzn(i18, unsafe.getObject(obj, j10), zzB(i16));
                        i15 += iZzg;
                    }
                    break;
                case 10:
                    if ((i14 & i10) != 0) {
                        object = unsafe.getObject(obj, j10);
                        int i23 = zzbi.zzb;
                        int iZzd2 = ((zzba) object).zzd();
                        iZzx2 = iZzd2 + zzbi.zzx(iZzd2);
                        iZzx3 = zzbi.zzx(i18 << 3);
                        iZzg = iZzx2 + iZzx3;
                        i15 += iZzg;
                    }
                    break;
                case 11:
                    if ((i14 & i10) != 0) {
                        i11 = i18 << 3;
                        iZzw = zzbi.zzx(unsafe.getInt(obj, j10));
                        iZzx = zzbi.zzx(i11);
                        i15 = iZzx + iZzw + i15;
                    }
                    break;
                case 12:
                    if ((i14 & i10) != 0) {
                        i11 = i18 << 3;
                        iZzw = zzbi.zzu(unsafe.getInt(obj, j10));
                        iZzx = zzbi.zzx(i11);
                        i15 = iZzx + iZzw + i15;
                    }
                    break;
                case 13:
                    if ((i14 & i10) != 0) {
                        iZzg = zzbi.zzx(i18 << 3) + 4;
                        i15 += iZzg;
                    }
                    break;
                case 14:
                    if ((i14 & i10) != 0) {
                        iZzg = zzbi.zzx(i18 << 3) + 8;
                        i15 += iZzg;
                    }
                    break;
                case 15:
                    if ((i14 & i10) != 0) {
                        iZzp = unsafe.getInt(obj, j10);
                        iZzg = zzbi.zzx((iZzp >> 31) ^ (iZzp + iZzp)) + zzbi.zzx(i18 << 3);
                        i15 += iZzg;
                    }
                    break;
                case 16:
                    if ((i10 & i14) != 0) {
                        long j11 = unsafe.getLong(obj, j10);
                        iZzx2 = zzbi.zzx(i18 << 3);
                        iZzx3 = zzbi.zzy((j11 >> 63) ^ (j11 + j11));
                        iZzg = iZzx2 + iZzx3;
                        i15 += iZzg;
                    }
                    break;
                case 17:
                    if ((i14 & i10) != 0) {
                        iZzg = zzbi.zzt(i18, (zzdf) unsafe.getObject(obj, j10), zzB(i16));
                        i15 += iZzg;
                    }
                    break;
                case 18:
                case 23:
                case 32:
                    iZzg = zzdr.zzg(i18, (List) unsafe.getObject(obj, j10), false);
                    i15 += iZzg;
                    break;
                case 19:
                case 24:
                case 31:
                    iZzg = zzdr.zze(i18, (List) unsafe.getObject(obj, j10), false);
                    i15 += iZzg;
                    break;
                case 20:
                    iZzg = zzdr.zzl(i18, (List) unsafe.getObject(obj, j10), false);
                    i15 += iZzg;
                    break;
                case 21:
                    iZzg = zzdr.zzw(i18, (List) unsafe.getObject(obj, j10), false);
                    i15 += iZzg;
                    break;
                case 22:
                    iZzg = zzdr.zzj(i18, (List) unsafe.getObject(obj, j10), false);
                    i15 += iZzg;
                    break;
                case 25:
                    iZzg = zzdr.zza(i18, (List) unsafe.getObject(obj, j10), false);
                    i15 += iZzg;
                    break;
                case 26:
                    iZzg = zzdr.zzt(i18, (List) unsafe.getObject(obj, j10));
                    i15 += iZzg;
                    break;
                case 27:
                    iZzg = zzdr.zzo(i18, (List) unsafe.getObject(obj, j10), zzB(i16));
                    i15 += iZzg;
                    break;
                case 28:
                    iZzg = zzdr.zzb(i18, (List) unsafe.getObject(obj, j10));
                    i15 += iZzg;
                    break;
                case 29:
                    iZzg = zzdr.zzu(i18, (List) unsafe.getObject(obj, j10), false);
                    i15 += iZzg;
                    break;
                case 30:
                    iZzg = zzdr.zzc(i18, (List) unsafe.getObject(obj, j10), false);
                    i15 += iZzg;
                    break;
                case 33:
                    iZzg = zzdr.zzp(i18, (List) unsafe.getObject(obj, j10), false);
                    i15 += iZzg;
                    break;
                case 34:
                    iZzg = zzdr.zzr(i18, (List) unsafe.getObject(obj, j10), false);
                    i15 += iZzg;
                    break;
                case 35:
                    iZzh = zzdr.zzh((List) unsafe.getObject(obj, j10));
                    if (iZzh > 0) {
                        iZzx4 = zzbi.zzx(i18 << 3) + zzbi.zzx(iZzh);
                        i15 += iZzx4 + iZzh;
                    }
                    break;
                case 36:
                    iZzh = zzdr.zzf((List) unsafe.getObject(obj, j10));
                    if (iZzh > 0) {
                        iZzx4 = zzbi.zzx(i18 << 3) + zzbi.zzx(iZzh);
                        i15 += iZzx4 + iZzh;
                    }
                    break;
                case 37:
                    iZzh = zzdr.zzm((List) unsafe.getObject(obj, j10));
                    if (iZzh > 0) {
                        iZzx4 = zzbi.zzx(i18 << 3) + zzbi.zzx(iZzh);
                        i15 += iZzx4 + iZzh;
                    }
                    break;
                case 38:
                    iZzh = zzdr.zzx((List) unsafe.getObject(obj, j10));
                    if (iZzh > 0) {
                        iZzx4 = zzbi.zzx(i18 << 3) + zzbi.zzx(iZzh);
                        i15 += iZzx4 + iZzh;
                    }
                    break;
                case 39:
                    iZzh = zzdr.zzk((List) unsafe.getObject(obj, j10));
                    if (iZzh > 0) {
                        iZzx4 = zzbi.zzx(i18 << 3) + zzbi.zzx(iZzh);
                        i15 += iZzx4 + iZzh;
                    }
                    break;
                case 40:
                    iZzh = zzdr.zzh((List) unsafe.getObject(obj, j10));
                    if (iZzh > 0) {
                        iZzx4 = zzbi.zzx(i18 << 3) + zzbi.zzx(iZzh);
                        i15 += iZzx4 + iZzh;
                    }
                    break;
                case 41:
                    iZzh = zzdr.zzf((List) unsafe.getObject(obj, j10));
                    if (iZzh > 0) {
                        iZzx4 = zzbi.zzx(i18 << 3) + zzbi.zzx(iZzh);
                        i15 += iZzx4 + iZzh;
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(obj, j10);
                    int i24 = zzdr.zza;
                    iZzh = list.size();
                    if (iZzh > 0) {
                        iZzx4 = zzbi.zzx(i18 << 3) + zzbi.zzx(iZzh);
                        i15 += iZzx4 + iZzh;
                    }
                    break;
                case 43:
                    iZzh = zzdr.zzv((List) unsafe.getObject(obj, j10));
                    if (iZzh > 0) {
                        iZzx4 = zzbi.zzx(i18 << 3) + zzbi.zzx(iZzh);
                        i15 += iZzx4 + iZzh;
                    }
                    break;
                case 44:
                    iZzh = zzdr.zzd((List) unsafe.getObject(obj, j10));
                    if (iZzh > 0) {
                        iZzx4 = zzbi.zzx(i18 << 3) + zzbi.zzx(iZzh);
                        i15 += iZzx4 + iZzh;
                    }
                    break;
                case 45:
                    iZzh = zzdr.zzf((List) unsafe.getObject(obj, j10));
                    if (iZzh > 0) {
                        iZzx4 = zzbi.zzx(i18 << 3) + zzbi.zzx(iZzh);
                        i15 += iZzx4 + iZzh;
                    }
                    break;
                case 46:
                    iZzh = zzdr.zzh((List) unsafe.getObject(obj, j10));
                    if (iZzh > 0) {
                        iZzx4 = zzbi.zzx(i18 << 3) + zzbi.zzx(iZzh);
                        i15 += iZzx4 + iZzh;
                    }
                    break;
                case 47:
                    iZzh = zzdr.zzq((List) unsafe.getObject(obj, j10));
                    if (iZzh > 0) {
                        iZzx4 = zzbi.zzx(i18 << 3) + zzbi.zzx(iZzh);
                        i15 += iZzx4 + iZzh;
                    }
                    break;
                case 48:
                    iZzh = zzdr.zzs((List) unsafe.getObject(obj, j10));
                    if (iZzh > 0) {
                        iZzx4 = zzbi.zzx(i18 << 3) + zzbi.zzx(iZzh);
                        i15 += iZzx4 + iZzh;
                    }
                    break;
                case 49:
                    iZzg = zzdr.zzi(i18, (List) unsafe.getObject(obj, j10), zzB(i16));
                    i15 += iZzg;
                    break;
                case 50:
                    zzda.zza(i18, unsafe.getObject(obj, j10), zzC(i16));
                    break;
                case 51:
                    if (zzT(obj, i18, i16)) {
                        iZzg = zzbi.zzx(i18 << 3) + 8;
                        i15 += iZzg;
                    }
                    break;
                case 52:
                    if (zzT(obj, i18, i16)) {
                        iZzg = zzbi.zzx(i18 << 3) + 4;
                        i15 += iZzg;
                    }
                    break;
                case 53:
                    if (zzT(obj, i18, i16)) {
                        int iZzy4 = zzbi.zzy(zzz(obj, j10));
                        iZzx4 = zzbi.zzx(i18 << 3);
                        iZzh = iZzy4;
                        i15 += iZzx4 + iZzh;
                    }
                    break;
                case 54:
                    if (zzT(obj, i18, i16)) {
                        int iZzy5 = zzbi.zzy(zzz(obj, j10));
                        iZzx4 = zzbi.zzx(i18 << 3);
                        iZzh = iZzy5;
                        i15 += iZzx4 + iZzh;
                    }
                    break;
                case 55:
                    if (zzT(obj, i18, i16)) {
                        i12 = i18 << 3;
                        iZzh = zzbi.zzu(zzp(obj, j10));
                        iZzx4 = zzbi.zzx(i12);
                        i15 += iZzx4 + iZzh;
                    }
                    break;
                case 56:
                    if (zzT(obj, i18, i16)) {
                        iZzg = zzbi.zzx(i18 << 3) + 8;
                        i15 += iZzg;
                    }
                    break;
                case 57:
                    if (zzT(obj, i18, i16)) {
                        iZzg = zzbi.zzx(i18 << 3) + 4;
                        i15 += iZzg;
                    }
                    break;
                case 58:
                    if (zzT(obj, i18, i16)) {
                        iZzg = zzbi.zzx(i18 << 3) + 1;
                        i15 += iZzg;
                    }
                    break;
                case 59:
                    if (zzT(obj, i18, i16)) {
                        object2 = unsafe.getObject(obj, j10);
                        if (!(object2 instanceof zzba)) {
                            i12 = i18 << 3;
                            iZzh = zzbi.zzw((String) object2);
                            iZzx4 = zzbi.zzx(i12);
                            i15 += iZzx4 + iZzh;
                        }
                        int i25 = zzbi.zzb;
                        int iZzd3 = ((zzba) object2).zzd();
                        iZzx2 = iZzd3 + zzbi.zzx(iZzd3);
                        iZzx3 = zzbi.zzx(i18 << 3);
                        iZzg = iZzx2 + iZzx3;
                        i15 += iZzg;
                        break;
                    }
                    break;
                case 60:
                    if (zzT(obj, i18, i16)) {
                        iZzg = zzdr.zzn(i18, unsafe.getObject(obj, j10), zzB(i16));
                        i15 += iZzg;
                    }
                    break;
                case 61:
                    if (zzT(obj, i18, i16)) {
                        object2 = unsafe.getObject(obj, j10);
                        int i26 = zzbi.zzb;
                        int iZzd4 = ((zzba) object2).zzd();
                        iZzx2 = iZzd4 + zzbi.zzx(iZzd4);
                        iZzx3 = zzbi.zzx(i18 << 3);
                        iZzg = iZzx2 + iZzx3;
                        i15 += iZzg;
                    }
                    break;
                case 62:
                    if (zzT(obj, i18, i16)) {
                        i12 = i18 << 3;
                        iZzh = zzbi.zzx(zzp(obj, j10));
                        iZzx4 = zzbi.zzx(i12);
                        i15 += iZzx4 + iZzh;
                    }
                    break;
                case 63:
                    if (zzT(obj, i18, i16)) {
                        i12 = i18 << 3;
                        iZzh = zzbi.zzu(zzp(obj, j10));
                        iZzx4 = zzbi.zzx(i12);
                        i15 += iZzx4 + iZzh;
                    }
                    break;
                case 64:
                    if (zzT(obj, i18, i16)) {
                        iZzg = zzbi.zzx(i18 << 3) + 4;
                        i15 += iZzg;
                    }
                    break;
                case 65:
                    if (zzT(obj, i18, i16)) {
                        iZzg = zzbi.zzx(i18 << 3) + 8;
                        i15 += iZzg;
                    }
                    break;
                case 66:
                    if (zzT(obj, i18, i16)) {
                        iZzp = zzp(obj, j10);
                        iZzg = zzbi.zzx((iZzp >> 31) ^ (iZzp + iZzp)) + zzbi.zzx(i18 << 3);
                        i15 += iZzg;
                    }
                    break;
                case 67:
                    if (zzT(obj, i18, i16)) {
                        long jZzz = zzz(obj, j10);
                        iZzx2 = zzbi.zzx(i18 << 3);
                        iZzx3 = zzbi.zzy((jZzz >> 63) ^ (jZzz + jZzz));
                        iZzg = iZzx2 + iZzx3;
                        i15 += iZzg;
                    }
                    break;
                case 68:
                    if (zzT(obj, i18, i16)) {
                        iZzg = zzbi.zzt(i18, (zzdf) unsafe.getObject(obj, j10), zzB(i16));
                        i15 += iZzg;
                    }
                    break;
            }
            i16 += 3;
            i13 = 1048575;
        }
        zzeg zzegVar = this.zzm;
        int iZza = i15 + zzegVar.zza(zzegVar.zzd(obj));
        if (!this.zzh) {
            return iZza;
        }
        this.zzn.zza(obj);
        throw null;
    }

    private static int zzp(Object obj, long j10) {
        return ((Integer) zzeq.zzf(obj, j10)).intValue();
    }

    private final int zzq(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, zzan zzanVar) throws IOException {
        Unsafe unsafe = zzb;
        Object objZzC = zzC(i12);
        Object object = unsafe.getObject(obj, j10);
        if (!((zzcz) object).zze()) {
            zzcz zzczVarZzb = zzcz.zza().zzb();
            zzda.zzb(zzczVarZzb, object);
            unsafe.putObject(obj, j10, zzczVarZzb);
        }
        throw null;
    }

    private final int zzr(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, zzan zzanVar) throws IOException {
        Unsafe unsafe = zzb;
        long j11 = this.zzc[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(zzao.zzp(bArr, i10))));
                int i18 = i10 + 8;
                unsafe.putInt(obj, j11, i13);
                return i18;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(zzao.zzb(bArr, i10))));
                int i19 = i10 + 4;
                unsafe.putInt(obj, j11, i13);
                return i19;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iZzm = zzao.zzm(bArr, i10, zzanVar);
                unsafe.putObject(obj, j10, Long.valueOf(zzanVar.zzb));
                unsafe.putInt(obj, j11, i13);
                return iZzm;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iZzj = zzao.zzj(bArr, i10, zzanVar);
                unsafe.putObject(obj, j10, Integer.valueOf(zzanVar.zza));
                unsafe.putInt(obj, j11, i13);
                return iZzj;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Long.valueOf(zzao.zzp(bArr, i10)));
                int i20 = i10 + 8;
                unsafe.putInt(obj, j11, i13);
                return i20;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(zzao.zzb(bArr, i10)));
                int i21 = i10 + 4;
                unsafe.putInt(obj, j11, i13);
                return i21;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iZzm2 = zzao.zzm(bArr, i10, zzanVar);
                unsafe.putObject(obj, j10, Boolean.valueOf(zzanVar.zzb != 0));
                unsafe.putInt(obj, j11, i13);
                return iZzm2;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iZzj2 = zzao.zzj(bArr, i10, zzanVar);
                int i22 = zzanVar.zza;
                if (i22 == 0) {
                    unsafe.putObject(obj, j10, "");
                } else {
                    if ((i15 & 536870912) != 0 && !zzev.zze(bArr, iZzj2, iZzj2 + i22)) {
                        throw zzci.zzc();
                    }
                    unsafe.putObject(obj, j10, new String(bArr, iZzj2, i22, zzcg.zzb));
                    iZzj2 += i22;
                }
                unsafe.putInt(obj, j11, i13);
                return iZzj2;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                Object objZzE = zzE(obj, i13, i17);
                int iZzo = zzao.zzo(objZzE, zzB(i17), bArr, i10, i11, zzanVar);
                zzM(obj, i13, i17, objZzE);
                return iZzo;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iZza = zzao.zza(bArr, i10, zzanVar);
                unsafe.putObject(obj, j10, zzanVar.zzc);
                unsafe.putInt(obj, j11, i13);
                return iZza;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iZzj3 = zzao.zzj(bArr, i10, zzanVar);
                int i23 = zzanVar.zza;
                zzce zzceVarZzA = zzA(i17);
                if (zzceVarZzA == null || zzceVarZzA.zza(i23)) {
                    unsafe.putObject(obj, j10, Integer.valueOf(i23));
                    unsafe.putInt(obj, j11, i13);
                } else {
                    zzd(obj).zzj(i12, Long.valueOf(i23));
                }
                return iZzj3;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                int iZzj4 = zzao.zzj(bArr, i10, zzanVar);
                unsafe.putObject(obj, j10, Integer.valueOf(zzbe.zzb(zzanVar.zza)));
                unsafe.putInt(obj, j11, i13);
                return iZzj4;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iZzm3 = zzao.zzm(bArr, i10, zzanVar);
                unsafe.putObject(obj, j10, Long.valueOf(zzbe.zzc(zzanVar.zzb)));
                unsafe.putInt(obj, j11, i13);
                return iZzm3;
            case 68:
                if (i14 != 3) {
                    return i10;
                }
                Object objZzE2 = zzE(obj, i13, i17);
                int iZzn = zzao.zzn(objZzE2, zzB(i17), bArr, i10, i11, (i12 & (-8)) | 4, zzanVar);
                zzM(obj, i13, i17, objZzE2);
                return iZzn;
            default:
                return i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:165:0x02a4 A[LOOP:11: B:166:0x02a5->B:165:0x02a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:168:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:171:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:314:0x02be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x02a2 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x01fe -> B:108:0x01dd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:136:0x0246 -> B:126:0x021d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:172:0x02bb -> B:164:0x02a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x0195 -> B:78:0x0170). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final int zzs(java.lang.Object r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.play_billing.zzan r30) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1146
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdi.zzs(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.play_billing.zzan):int");
    }

    private final int zzt(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzw(i10, 0);
    }

    private final int zzu(int i10, int i11) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzw(i10, i11);
    }

    private final int zzv(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzw(int i10, int i11) {
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

    private static int zzx(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzy(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzz(Object obj, long j10) {
        return ((Long) zzeq.zzf(obj, j10)).longValue();
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01c4 A[PHI: r4
  0x01c4: PHI (r4v105 int) = 
  (r4v68 int)
  (r4v71 int)
  (r4v74 int)
  (r4v77 int)
  (r4v80 int)
  (r4v83 int)
  (r4v86 int)
  (r4v89 int)
  (r4v92 int)
  (r4v95 int)
  (r4v98 int)
  (r4v101 int)
  (r4v104 int)
  (r4v108 int)
 binds: [B:113:0x01c2, B:110:0x01b5, B:107:0x01a8, B:104:0x019b, B:101:0x018e, B:98:0x0181, B:95:0x0174, B:92:0x0167, B:89:0x0157, B:86:0x0149, B:83:0x013b, B:80:0x012d, B:77:0x011f, B:74:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:130:0x0277  */
    /* JADX WARN: Code duplicated, block: B:154:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:157:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:167:0x033a  */
    /* JADX WARN: Code duplicated, block: B:176:0x0357  */
    /* JADX WARN: Code duplicated, block: B:184:0x0373  */
    /* JADX WARN: Code duplicated, block: B:189:0x038a  */
    /* JADX WARN: Code duplicated, block: B:192:0x039a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d4  */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0314, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.play_billing.zzba) != false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x032b, code lost:
    
        r5 = r6 << 3;
        r4 = com.google.android.gms.internal.play_billing.zzbi.zzw((java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009f, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.play_billing.zzba) != false) goto L163;
     */
    @Override // com.google.android.gms.internal.play_billing.zzdp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 1096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdi.zza(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e3 A[PHI: r3
  0x00e3: PHI (r3v12 java.lang.Object) = (r3v10 java.lang.Object), (r3v13 java.lang.Object) binds: [B:67:0x00e1, B:62:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x00eb  */
    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final int zzb(Object obj) {
        int i10;
        double dZza;
        int i11;
        float fZzb;
        long jZzd;
        int iZzc;
        boolean zZzw;
        int iHashCode;
        Object objZzf;
        Object objZzf2;
        int length = this.zzc.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iZzy = zzy(i13);
            int i14 = this.zzc[i13];
            long j10 = 1048575 & iZzy;
            int iHashCode2 = 37;
            switch (zzx(iZzy)) {
                case 0:
                    i10 = i12 * 53;
                    dZza = zzeq.zza(obj, j10);
                    jZzd = Double.doubleToLongBits(dZza);
                    byte[] bArr = zzcg.zzd;
                    iZzc = (int) (jZzd ^ (jZzd >>> 32));
                    i12 = i10 + iZzc;
                    break;
                case 1:
                    i11 = i12 * 53;
                    fZzb = zzeq.zzb(obj, j10);
                    iHashCode = Float.floatToIntBits(fZzb);
                    i12 = iHashCode + i11;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i10 = i12 * 53;
                    jZzd = zzeq.zzd(obj, j10);
                    byte[] bArr2 = zzcg.zzd;
                    iZzc = (int) (jZzd ^ (jZzd >>> 32));
                    i12 = i10 + iZzc;
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i10 = i12 * 53;
                    iZzc = zzeq.zzc(obj, j10);
                    i12 = i10 + iZzc;
                    break;
                case 7:
                    i11 = i12 * 53;
                    zZzw = zzeq.zzw(obj, j10);
                    iHashCode = zzcg.zza(zZzw);
                    i12 = iHashCode + i11;
                    break;
                case 8:
                    i11 = i12 * 53;
                    iHashCode = ((String) zzeq.zzf(obj, j10)).hashCode();
                    i12 = iHashCode + i11;
                    break;
                case 9:
                    objZzf = zzeq.zzf(obj, j10);
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
                    i11 = i12 * 53;
                    objZzf2 = zzeq.zzf(obj, j10);
                    iHashCode = objZzf2.hashCode();
                    i12 = iHashCode + i11;
                    break;
                case 17:
                    objZzf = zzeq.zzf(obj, j10);
                    if (objZzf != null) {
                        iHashCode2 = objZzf.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode2;
                    break;
                case 51:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        dZza = zzm(obj, j10);
                        jZzd = Double.doubleToLongBits(dZza);
                        byte[] bArr3 = zzcg.zzd;
                        iZzc = (int) (jZzd ^ (jZzd >>> 32));
                        i12 = i10 + iZzc;
                    }
                    break;
                case 52:
                    if (zzT(obj, i14, i13)) {
                        i11 = i12 * 53;
                        fZzb = zzn(obj, j10);
                        iHashCode = Float.floatToIntBits(fZzb);
                        i12 = iHashCode + i11;
                    }
                    break;
                case 53:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jZzd = zzz(obj, j10);
                        byte[] bArr4 = zzcg.zzd;
                        iZzc = (int) (jZzd ^ (jZzd >>> 32));
                        i12 = i10 + iZzc;
                    }
                    break;
                case 54:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jZzd = zzz(obj, j10);
                        byte[] bArr5 = zzcg.zzd;
                        iZzc = (int) (jZzd ^ (jZzd >>> 32));
                        i12 = i10 + iZzc;
                    }
                    break;
                case 55:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzp(obj, j10);
                        i12 = i10 + iZzc;
                    }
                    break;
                case 56:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jZzd = zzz(obj, j10);
                        byte[] bArr6 = zzcg.zzd;
                        iZzc = (int) (jZzd ^ (jZzd >>> 32));
                        i12 = i10 + iZzc;
                    }
                    break;
                case 57:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzp(obj, j10);
                        i12 = i10 + iZzc;
                    }
                    break;
                case 58:
                    if (zzT(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zZzw = zzU(obj, j10);
                        iHashCode = zzcg.zza(zZzw);
                        i12 = iHashCode + i11;
                    }
                    break;
                case 59:
                    if (zzT(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iHashCode = ((String) zzeq.zzf(obj, j10)).hashCode();
                        i12 = iHashCode + i11;
                    }
                    break;
                case 60:
                    if (zzT(obj, i14, i13)) {
                        objZzf2 = zzeq.zzf(obj, j10);
                        i11 = i12 * 53;
                        iHashCode = objZzf2.hashCode();
                        i12 = iHashCode + i11;
                    }
                    break;
                case 61:
                    if (zzT(obj, i14, i13)) {
                        i11 = i12 * 53;
                        objZzf2 = zzeq.zzf(obj, j10);
                        iHashCode = objZzf2.hashCode();
                        i12 = iHashCode + i11;
                    }
                    break;
                case 62:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzp(obj, j10);
                        i12 = i10 + iZzc;
                    }
                    break;
                case 63:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzp(obj, j10);
                        i12 = i10 + iZzc;
                    }
                    break;
                case 64:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzp(obj, j10);
                        i12 = i10 + iZzc;
                    }
                    break;
                case 65:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jZzd = zzz(obj, j10);
                        byte[] bArr7 = zzcg.zzd;
                        iZzc = (int) (jZzd ^ (jZzd >>> 32));
                        i12 = i10 + iZzc;
                    }
                    break;
                case 66:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzp(obj, j10);
                        i12 = i10 + iZzc;
                    }
                    break;
                case 67:
                    if (zzT(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jZzd = zzz(obj, j10);
                        byte[] bArr8 = zzcg.zzd;
                        iZzc = (int) (jZzd ^ (jZzd >>> 32));
                        i12 = i10 + iZzc;
                    }
                    break;
                case 68:
                    if (zzT(obj, i14, i13)) {
                        objZzf2 = zzeq.zzf(obj, j10);
                        i11 = i12 * 53;
                        iHashCode = objZzf2.hashCode();
                        i12 = iHashCode + i11;
                    }
                    break;
            }
        }
        int iHashCode3 = this.zzm.zzd(obj).hashCode() + (i12 * 53);
        if (!this.zzh) {
            return iHashCode3;
        }
        this.zzn.zza(obj);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x030c A[PHI: r0 r19 r22 r27 r31
  0x030c: PHI (r0v82 int) = (r0v76 int), (r0v79 int), (r0v84 int) binds: [B:122:0x0382, B:118:0x035c, B:109:0x030a] A[DONT_GENERATE, DONT_INLINE]
  0x030c: PHI (r19v5 int) = (r19v3 int), (r19v3 int), (r19v6 int) binds: [B:122:0x0382, B:118:0x035c, B:109:0x030a] A[DONT_GENERATE, DONT_INLINE]
  0x030c: PHI (r22v6 int) = (r22v4 int), (r22v4 int), (r22v8 int) binds: [B:122:0x0382, B:118:0x035c, B:109:0x030a] A[DONT_GENERATE, DONT_INLINE]
  0x030c: PHI (r27v8 sun.misc.Unsafe) = (r27v6 sun.misc.Unsafe), (r27v6 sun.misc.Unsafe), (r27v9 sun.misc.Unsafe) binds: [B:122:0x0382, B:118:0x035c, B:109:0x030a] A[DONT_GENERATE, DONT_INLINE]
  0x030c: PHI (r31v6 int) = (r31v4 int), (r31v4 int), (r31v7 int) binds: [B:122:0x0382, B:118:0x035c, B:109:0x030a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:112:0x0328 A[PHI: r0 r19 r22 r27 r31
  0x0328: PHI (r0v80 int) = (r0v76 int), (r0v79 int), (r0v84 int) binds: [B:122:0x0382, B:118:0x035c, B:109:0x030a] A[DONT_GENERATE, DONT_INLINE]
  0x0328: PHI (r19v4 int) = (r19v3 int), (r19v3 int), (r19v6 int) binds: [B:122:0x0382, B:118:0x035c, B:109:0x030a] A[DONT_GENERATE, DONT_INLINE]
  0x0328: PHI (r22v5 int) = (r22v4 int), (r22v4 int), (r22v8 int) binds: [B:122:0x0382, B:118:0x035c, B:109:0x030a] A[DONT_GENERATE, DONT_INLINE]
  0x0328: PHI (r27v7 sun.misc.Unsafe) = (r27v6 sun.misc.Unsafe), (r27v6 sun.misc.Unsafe), (r27v9 sun.misc.Unsafe) binds: [B:122:0x0382, B:118:0x035c, B:109:0x030a] A[DONT_GENERATE, DONT_INLINE]
  0x0328: PHI (r31v5 int) = (r31v4 int), (r31v4 int), (r31v7 int) binds: [B:122:0x0382, B:118:0x035c, B:109:0x030a] A[DONT_GENERATE, DONT_INLINE]] */
    public final int zzc(Object obj, byte[] bArr, int i10, int i11, int i12, zzan zzanVar) throws IOException {
        Unsafe unsafe;
        int i13;
        Object obj2;
        zzdi<T> zzdiVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        zzan zzanVar2;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int iZzb;
        int i30;
        int i31;
        int i32;
        zzdi<T> zzdiVar2 = this;
        Object obj3 = obj;
        bArr = bArr;
        i11 = i11;
        int i33 = i12;
        zzan zzanVar3 = zzanVar;
        zzG(obj);
        Unsafe unsafe2 = zzb;
        int i34 = -1;
        int iZzi = i10;
        int i35 = -1;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 1048575;
        while (true) {
            if (iZzi < i11) {
                int i40 = iZzi + 1;
                byte b10 = bArr[iZzi];
                if (b10 < 0) {
                    int iZzk = zzao.zzk(b10, bArr, i40, zzanVar3);
                    i14 = zzanVar3.zza;
                    i40 = iZzk;
                } else {
                    i14 = b10;
                }
                int i41 = i14 >>> 3;
                int iZzu = i41 > i35 ? zzdiVar2.zzu(i41, i36 / 3) : zzdiVar2.zzt(i41);
                if (iZzu == i34) {
                    i15 = i41;
                    i16 = i40;
                    i17 = i14;
                    i18 = i38;
                    i19 = i34;
                    unsafe = unsafe2;
                    i20 = i33;
                    i21 = 0;
                } else {
                    int i42 = i14 & 7;
                    int[] iArr = zzdiVar2.zzc;
                    int i43 = iArr[iZzu + 1];
                    int iZzx = zzx(i43);
                    int i44 = i40;
                    int i45 = i14;
                    long j10 = i43 & 1048575;
                    if (iZzx <= 17) {
                        int i46 = iArr[iZzu + 2];
                        int i47 = 1 << (i46 >>> 20);
                        int i48 = i46 & 1048575;
                        if (i48 != i39) {
                            if (i39 != 1048575) {
                                unsafe2.putInt(obj3, i39, i38);
                            }
                            i39 = i48;
                            i22 = unsafe2.getInt(obj3, i48);
                        } else {
                            i22 = i38;
                            i39 = i39;
                        }
                        switch (iZzx) {
                            case 0:
                                i23 = iZzu;
                                i24 = i41;
                                i25 = i44;
                                if (i42 == 1) {
                                    zzeq.zzo(obj3, j10, Double.longBitsToDouble(zzao.zzp(bArr, i25)));
                                    iZzi = i25 + 8;
                                    i38 = i22 | i47;
                                    i36 = i23;
                                    i35 = i24;
                                    i37 = i45;
                                    i34 = -1;
                                    i33 = i12;
                                } else {
                                    i30 = i23;
                                    i20 = i12;
                                    i18 = i22;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i21 = i30;
                                    i16 = i25;
                                    i17 = i45;
                                    i39 = i39;
                                    i19 = -1;
                                }
                                break;
                            case 1:
                                i23 = iZzu;
                                i24 = i41;
                                i25 = i44;
                                if (i42 == 5) {
                                    zzeq.zzp(obj3, j10, Float.intBitsToFloat(zzao.zzb(bArr, i25)));
                                    iZzi = i25 + 4;
                                    i38 = i22 | i47;
                                    i36 = i23;
                                    i35 = i24;
                                    i37 = i45;
                                    i34 = -1;
                                    i33 = i12;
                                } else {
                                    i30 = i23;
                                    i20 = i12;
                                    i18 = i22;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i21 = i30;
                                    i16 = i25;
                                    i17 = i45;
                                    i39 = i39;
                                    i19 = -1;
                                }
                                break;
                            case 2:
                            case 3:
                                i23 = iZzu;
                                i24 = i41;
                                i25 = i44;
                                if (i42 == 0) {
                                    int iZzm = zzao.zzm(bArr, i25, zzanVar3);
                                    unsafe2.putLong(obj, j10, zzanVar3.zzb);
                                    i38 = i22 | i47;
                                    i36 = i23;
                                    i35 = i24;
                                    iZzi = iZzm;
                                    i37 = i45;
                                    i34 = -1;
                                    i33 = i12;
                                } else {
                                    i30 = i23;
                                    i20 = i12;
                                    i18 = i22;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i21 = i30;
                                    i16 = i25;
                                    i17 = i45;
                                    i39 = i39;
                                    i19 = -1;
                                }
                                break;
                            case 4:
                            case 11:
                                i23 = iZzu;
                                i24 = i41;
                                i25 = i44;
                                if (i42 == 0) {
                                    iZzi = zzao.zzj(bArr, i25, zzanVar3);
                                    unsafe2.putInt(obj3, j10, zzanVar3.zza);
                                    i38 = i22 | i47;
                                    i36 = i23;
                                    i35 = i24;
                                    i37 = i45;
                                    i34 = -1;
                                    i33 = i12;
                                } else {
                                    i30 = i23;
                                    i20 = i12;
                                    i18 = i22;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i21 = i30;
                                    i16 = i25;
                                    i17 = i45;
                                    i39 = i39;
                                    i19 = -1;
                                }
                                break;
                            case 5:
                            case 14:
                                i23 = iZzu;
                                i24 = i41;
                                i26 = i44;
                                if (i42 == 1) {
                                    i25 = i26;
                                    unsafe2.putLong(obj, j10, zzao.zzp(bArr, i26));
                                    iZzi = i25 + 8;
                                    i38 = i22 | i47;
                                    i36 = i23;
                                    i35 = i24;
                                    i37 = i45;
                                    i34 = -1;
                                    i33 = i12;
                                } else {
                                    i25 = i26;
                                    i30 = i23;
                                    i20 = i12;
                                    i18 = i22;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i21 = i30;
                                    i16 = i25;
                                    i17 = i45;
                                    i39 = i39;
                                    i19 = -1;
                                }
                                break;
                            case 6:
                            case 13:
                                i23 = iZzu;
                                i24 = i41;
                                i26 = i44;
                                if (i42 == 5) {
                                    unsafe2.putInt(obj3, j10, zzao.zzb(bArr, i26));
                                    iZzi = i26 + 4;
                                    i38 = i22 | i47;
                                    i36 = i23;
                                    i35 = i24;
                                    i37 = i45;
                                    i34 = -1;
                                    i33 = i12;
                                } else {
                                    i25 = i26;
                                    i30 = i23;
                                    i20 = i12;
                                    i18 = i22;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i21 = i30;
                                    i16 = i25;
                                    i17 = i45;
                                    i39 = i39;
                                    i19 = -1;
                                }
                                break;
                            case 7:
                                i23 = iZzu;
                                i24 = i41;
                                i26 = i44;
                                if (i42 == 0) {
                                    iZzi = zzao.zzm(bArr, i26, zzanVar3);
                                    zzeq.zzm(obj3, j10, zzanVar3.zzb != 0);
                                    i38 = i22 | i47;
                                    i36 = i23;
                                    i35 = i24;
                                    i37 = i45;
                                    i34 = -1;
                                    i33 = i12;
                                } else {
                                    i25 = i26;
                                    i30 = i23;
                                    i20 = i12;
                                    i18 = i22;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i21 = i30;
                                    i16 = i25;
                                    i17 = i45;
                                    i39 = i39;
                                    i19 = -1;
                                }
                                break;
                            case 8:
                                i23 = iZzu;
                                i24 = i41;
                                i26 = i44;
                                if (i42 == 2) {
                                    iZzi = (i43 & 536870912) == 0 ? zzao.zzg(bArr, i26, zzanVar3) : zzao.zzh(bArr, i26, zzanVar3);
                                    unsafe2.putObject(obj3, j10, zzanVar3.zzc);
                                    i38 = i22 | i47;
                                    i36 = i23;
                                    i35 = i24;
                                    i37 = i45;
                                    i34 = -1;
                                    i33 = i12;
                                } else {
                                    i25 = i26;
                                    i30 = i23;
                                    i20 = i12;
                                    i18 = i22;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i21 = i30;
                                    i16 = i25;
                                    i17 = i45;
                                    i39 = i39;
                                    i19 = -1;
                                }
                                break;
                            case 9:
                                i23 = iZzu;
                                i24 = i41;
                                i26 = i44;
                                if (i42 == 2) {
                                    Object objZzD = zzdiVar2.zzD(obj3, i23);
                                    i45 = i45;
                                    iZzi = zzao.zzo(objZzD, zzdiVar2.zzB(i23), bArr, i26, i11, zzanVar);
                                    zzdiVar2.zzL(obj3, i23, objZzD);
                                    i38 = i22 | i47;
                                    i36 = i23;
                                    i35 = i24;
                                    i37 = i45;
                                    i34 = -1;
                                    i33 = i12;
                                } else {
                                    i45 = i45;
                                    i25 = i26;
                                    i30 = i23;
                                    i20 = i12;
                                    i18 = i22;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i21 = i30;
                                    i16 = i25;
                                    i17 = i45;
                                    i39 = i39;
                                    i19 = -1;
                                }
                                break;
                            case 10:
                                i27 = iZzu;
                                i24 = i41;
                                i28 = i45;
                                i29 = i44;
                                if (i42 == 2) {
                                    iZzi = zzao.zza(bArr, i29, zzanVar3);
                                    unsafe2.putObject(obj3, j10, zzanVar3.zzc);
                                    i38 = i22 | i47;
                                    i36 = i27;
                                    i35 = i24;
                                    i37 = i28;
                                    i34 = -1;
                                    i33 = i12;
                                } else {
                                    i30 = i27;
                                    i45 = i28;
                                    i25 = i29;
                                    i20 = i12;
                                    i18 = i22;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i21 = i30;
                                    i16 = i25;
                                    i17 = i45;
                                    i39 = i39;
                                    i19 = -1;
                                }
                                break;
                            case 12:
                                i27 = iZzu;
                                i24 = i41;
                                i28 = i45;
                                i29 = i44;
                                if (i42 == 0) {
                                    iZzi = zzao.zzj(bArr, i29, zzanVar3);
                                    iZzb = zzanVar3.zza;
                                    zzce zzceVarZzA = zzdiVar2.zzA(i27);
                                    if (zzceVarZzA == null || zzceVarZzA.zza(iZzb)) {
                                        unsafe2.putInt(obj3, j10, iZzb);
                                        i38 = i22 | i47;
                                        i36 = i27;
                                    } else {
                                        zzd(obj).zzj(i28, Long.valueOf(iZzb));
                                        i36 = i27;
                                        i38 = i22;
                                    }
                                    i35 = i24;
                                    i37 = i28;
                                    i34 = -1;
                                    i33 = i12;
                                } else {
                                    i30 = i27;
                                    i45 = i28;
                                    i25 = i29;
                                    i20 = i12;
                                    i18 = i22;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i21 = i30;
                                    i16 = i25;
                                    i17 = i45;
                                    i39 = i39;
                                    i19 = -1;
                                }
                                break;
                            case 15:
                                i27 = iZzu;
                                i24 = i41;
                                i28 = i45;
                                i29 = i44;
                                if (i42 == 0) {
                                    iZzi = zzao.zzj(bArr, i29, zzanVar3);
                                    iZzb = zzbe.zzb(zzanVar3.zza);
                                    unsafe2.putInt(obj3, j10, iZzb);
                                    i38 = i22 | i47;
                                    i36 = i27;
                                    i35 = i24;
                                    i37 = i28;
                                    i34 = -1;
                                    i33 = i12;
                                } else {
                                    i30 = i27;
                                    i45 = i28;
                                    i25 = i29;
                                    i20 = i12;
                                    i18 = i22;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i21 = i30;
                                    i16 = i25;
                                    i17 = i45;
                                    i39 = i39;
                                    i19 = -1;
                                }
                                break;
                            case 16:
                                if (i42 == 0) {
                                    int iZzm2 = zzao.zzm(bArr, i44, zzanVar3);
                                    unsafe2.putLong(obj, j10, zzbe.zzc(zzanVar3.zzb));
                                    i38 = i22 | i47;
                                    i36 = iZzu;
                                    i35 = i41;
                                    i37 = i45;
                                    iZzi = iZzm2;
                                    i34 = -1;
                                    i33 = i12;
                                } else {
                                    i24 = i41;
                                    i30 = iZzu;
                                    i25 = i44;
                                    i20 = i12;
                                    i18 = i22;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i21 = i30;
                                    i16 = i25;
                                    i17 = i45;
                                    i39 = i39;
                                    i19 = -1;
                                }
                                break;
                            default:
                                i23 = iZzu;
                                i24 = i41;
                                i25 = i44;
                                if (i42 == 3) {
                                    Object objZzD2 = zzdiVar2.zzD(obj3, i23);
                                    iZzi = zzao.zzn(objZzD2, zzdiVar2.zzB(i23), bArr, i25, i11, (i24 << 3) | 4, zzanVar);
                                    zzdiVar2.zzL(obj3, i23, objZzD2);
                                    i38 = i22 | i47;
                                    i35 = i24;
                                    i36 = i23;
                                    i37 = i45;
                                    i34 = -1;
                                    bArr = bArr;
                                    i33 = i12;
                                } else {
                                    i30 = i23;
                                    i20 = i12;
                                    i18 = i22;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i21 = i30;
                                    i16 = i25;
                                    i17 = i45;
                                    i39 = i39;
                                    i19 = -1;
                                }
                                break;
                        }
                    } else {
                        if (iZzx != 27) {
                            i18 = i38;
                            i31 = i39;
                            if (iZzx <= 49) {
                                i15 = i41;
                                i19 = -1;
                                unsafe = unsafe2;
                                i21 = iZzu;
                                iZzi = zzs(obj, bArr, i44, i11, i45, i41, i42, iZzu, i43, iZzx, j10, zzanVar);
                                if (iZzi != i44) {
                                    zzdiVar2 = this;
                                    obj3 = obj;
                                    i35 = i15;
                                    i33 = i12;
                                    zzanVar3 = zzanVar;
                                    i34 = i19;
                                    i38 = i18;
                                    i37 = i45;
                                    i36 = i21;
                                    i39 = i31;
                                } else {
                                    i16 = iZzi;
                                    i17 = i45;
                                    i39 = i31;
                                    i20 = i12;
                                }
                                unsafe2 = unsafe;
                            } else {
                                i15 = i41;
                                unsafe = unsafe2;
                                i21 = iZzu;
                                i32 = i44;
                                i19 = -1;
                                if (iZzx != 50) {
                                    iZzi = zzr(obj, bArr, i32, i11, i45, i15, i42, i43, iZzx, j10, i21, zzanVar);
                                    if (iZzi != i32) {
                                        zzdiVar2 = this;
                                        obj3 = obj;
                                        i35 = i15;
                                        i33 = i12;
                                        zzanVar3 = zzanVar;
                                        i34 = i19;
                                        i38 = i18;
                                        i37 = i45;
                                        i36 = i21;
                                        i39 = i31;
                                    } else {
                                        i16 = iZzi;
                                        i17 = i45;
                                        i39 = i31;
                                        i20 = i12;
                                    }
                                    unsafe2 = unsafe;
                                } else if (i42 == 2) {
                                    iZzi = zzq(obj, bArr, i32, i11, i21, j10, zzanVar);
                                    if (iZzi != i32) {
                                        zzdiVar2 = this;
                                        obj3 = obj;
                                        i35 = i15;
                                        i33 = i12;
                                        zzanVar3 = zzanVar;
                                        i34 = i19;
                                        i38 = i18;
                                        i37 = i45;
                                        i36 = i21;
                                        i39 = i31;
                                    } else {
                                        i16 = iZzi;
                                        i17 = i45;
                                        i39 = i31;
                                        i20 = i12;
                                    }
                                    unsafe2 = unsafe;
                                }
                            }
                        } else if (i42 == 2) {
                            zzcf zzcfVarZzd = (zzcf) unsafe2.getObject(obj3, j10);
                            if (!zzcfVarZzd.zzc()) {
                                int size = zzcfVarZzd.size();
                                zzcfVarZzd = zzcfVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj3, j10, zzcfVarZzd);
                            }
                            iZzi = zzao.zze(zzdiVar2.zzB(iZzu), i45, bArr, i44, i11, zzcfVarZzd, zzanVar);
                            i11 = i11;
                            i33 = i12;
                            i35 = i41;
                            i36 = iZzu;
                            i38 = i38;
                            i37 = i45;
                            i39 = i39;
                            i34 = -1;
                            bArr = bArr;
                        } else {
                            i18 = i38;
                            i31 = i39;
                            i15 = i41;
                            unsafe = unsafe2;
                            i21 = iZzu;
                            i32 = i44;
                            i19 = -1;
                        }
                        i20 = i12;
                        i16 = i32;
                        i17 = i45;
                        i39 = i31;
                    }
                }
                if (i17 != i20 || i20 == 0) {
                    int i49 = i20;
                    if (this.zzh) {
                        zzanVar2 = zzanVar;
                        zzbn zzbnVar = zzanVar2.zzd;
                        if (zzbnVar != zzbn.zza) {
                            i15 = i15;
                            if (zzbnVar.zzb(this.zzg, i15) != null) {
                                throw null;
                            }
                            iZzi = zzao.zzi(i17, bArr, i16, i11, zzd(obj), zzanVar);
                            obj = obj;
                        }
                        i37 = i17;
                        zzdiVar2 = this;
                        i35 = i15;
                        obj3 = obj;
                        i34 = i19;
                        i38 = i18;
                        i36 = i21;
                        i33 = i49;
                        zzanVar3 = zzanVar2;
                        unsafe2 = unsafe;
                    } else {
                        zzanVar2 = zzanVar;
                    }
                    iZzi = zzao.zzi(i17, bArr, i16, i11, zzd(obj), zzanVar);
                    i37 = i17;
                    zzdiVar2 = this;
                    i35 = i15;
                    obj3 = obj;
                    i34 = i19;
                    i38 = i18;
                    i36 = i21;
                    i33 = i49;
                    zzanVar3 = zzanVar2;
                    unsafe2 = unsafe;
                } else {
                    zzdiVar = this;
                    obj2 = obj;
                    i13 = i20;
                    iZzi = i16;
                    i37 = i17;
                    i38 = i18;
                }
            } else {
                unsafe = unsafe2;
                i13 = i33;
                obj2 = obj3;
                zzdiVar = zzdiVar2;
            }
        }
        if (i39 != 1048575) {
            unsafe.putInt(obj2, i39, i38);
        }
        for (int i50 = zzdiVar.zzj; i50 < zzdiVar.zzk; i50++) {
            int i51 = zzdiVar.zzi[i50];
            int i52 = zzdiVar.zzc[i51];
            Object objZzf = zzeq.zzf(obj2, zzdiVar.zzy(i51) & 1048575);
            if (objZzf != null && zzdiVar.zzA(i51) != null) {
                throw null;
            }
        }
        if (i13 == 0) {
            if (iZzi != i11) {
                throw zzci.zze();
            }
        } else if (iZzi > i11 || i37 != i13) {
            throw zzci.zze();
        }
        return iZzi;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final Object zze() {
        return ((zzcb) this.zzg).zzi();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Switch 'out' block B:27:0x0065 for B:16:0x0038 already processed. Defaulting to fallback option. */
    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final void zzf(Object obj) {
        if (zzS(obj)) {
            if (obj instanceof zzcb) {
                zzcb zzcbVar = (zzcb) obj;
                zzcbVar.zzq(Integer.MAX_VALUE);
                zzcbVar.zza = 0;
                zzcbVar.zzo();
            }
            int length = this.zzc.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iZzy = zzy(i10);
                int i11 = 1048575 & iZzy;
                int iZzx = zzx(iZzy);
                long j10 = i11;
                if (iZzx != 9) {
                    if (iZzx != 60 && iZzx != 68) {
                        switch (iZzx) {
                            case 17:
                                if (zzP(obj, i10)) {
                                    zzB(i10).zzf(zzb.getObject(obj, j10));
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
                                this.zzl.zza(obj, j10);
                                continue;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzcz) object).zzc();
                                    unsafe.putObject(obj, j10, object);
                                } else {
                                    continue;
                                }
                                break;
                            default:
                                continue;
                        }
                    } else if (zzT(obj, this.zzc[i10], i10)) {
                        zzB(i10).zzf(zzb.getObject(obj, j10));
                    }
                } else if (zzP(obj, i10)) {
                    zzB(i10).zzf(zzb.getObject(obj, j10));
                }
            }
            this.zzm.zzg(obj);
            if (this.zzh) {
                this.zzn.zzb(obj);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0034  */
    /* JADX WARN: Code duplicated, block: B:41:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d7  */
    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final void zzg(Object obj, Object obj2) {
        zzG(obj);
        Objects.requireNonNull(obj2);
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzy = zzy(i10);
            int i11 = this.zzc[i10];
            long j10 = 1048575 & iZzy;
            switch (zzx(iZzy)) {
                case 0:
                    if (zzP(obj2, i10)) {
                        zzeq.zzo(obj, j10, zzeq.zza(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 1:
                    if (zzP(obj2, i10)) {
                        zzeq.zzp(obj, j10, zzeq.zzb(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 2:
                    if (zzP(obj2, i10)) {
                        zzeq.zzr(obj, j10, zzeq.zzd(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 3:
                    if (zzP(obj2, i10)) {
                        zzeq.zzr(obj, j10, zzeq.zzd(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 4:
                    if (zzP(obj2, i10)) {
                        zzeq.zzq(obj, j10, zzeq.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 5:
                    if (zzP(obj2, i10)) {
                        zzeq.zzr(obj, j10, zzeq.zzd(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 6:
                    if (zzP(obj2, i10)) {
                        zzeq.zzq(obj, j10, zzeq.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 7:
                    if (zzP(obj2, i10)) {
                        zzeq.zzm(obj, j10, zzeq.zzw(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 8:
                    if (zzP(obj2, i10)) {
                        zzeq.zzs(obj, j10, zzeq.zzf(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 9:
                case 17:
                    zzH(obj, obj2, i10);
                    break;
                case 10:
                    if (zzP(obj2, i10)) {
                        zzeq.zzs(obj, j10, zzeq.zzf(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 11:
                    if (zzP(obj2, i10)) {
                        zzeq.zzq(obj, j10, zzeq.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 12:
                    if (zzP(obj2, i10)) {
                        zzeq.zzq(obj, j10, zzeq.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 13:
                    if (zzP(obj2, i10)) {
                        zzeq.zzq(obj, j10, zzeq.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 14:
                    if (zzP(obj2, i10)) {
                        zzeq.zzr(obj, j10, zzeq.zzd(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 15:
                    if (zzP(obj2, i10)) {
                        zzeq.zzq(obj, j10, zzeq.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 16:
                    if (zzP(obj2, i10)) {
                        zzeq.zzr(obj, j10, zzeq.zzd(obj2, j10));
                        zzJ(obj, i10);
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
                    int i12 = zzdr.zza;
                    zzeq.zzs(obj, j10, zzda.zzb(zzeq.zzf(obj, j10), zzeq.zzf(obj2, j10)));
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
                    if (zzT(obj2, i11, i10)) {
                        zzeq.zzs(obj, j10, zzeq.zzf(obj2, j10));
                        zzK(obj, i11, i10);
                    }
                    break;
                case 60:
                case 68:
                    zzI(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzT(obj2, i11, i10)) {
                        zzeq.zzs(obj, j10, zzeq.zzf(obj2, j10));
                        zzK(obj, i11, i10);
                    }
                    break;
            }
        }
        zzdr.zzB(this.zzm, obj, obj2);
        if (this.zzh) {
            this.zzn.zza(obj2);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x029e A[PHI: r0 r18 r25 r26 r27
  0x029e: PHI (r0v62 int) = (r0v58 int), (r0v61 int), (r0v65 int) binds: [B:111:0x02ed, B:106:0x02cb, B:98:0x0286] A[DONT_GENERATE, DONT_INLINE]
  0x029e: PHI (r18v4 int) = (r18v3 int), (r18v3 int), (r18v6 int) binds: [B:111:0x02ed, B:106:0x02cb, B:98:0x0286] A[DONT_GENERATE, DONT_INLINE]
  0x029e: PHI (r25v2 int) = (r25v1 int), (r25v1 int), (r25v4 int) binds: [B:111:0x02ed, B:106:0x02cb, B:98:0x0286] A[DONT_GENERATE, DONT_INLINE]
  0x029e: PHI (r26v1 int) = (r26v0 int), (r26v0 int), (r26v3 int) binds: [B:111:0x02ed, B:106:0x02cb, B:98:0x0286] A[DONT_GENERATE, DONT_INLINE]
  0x029e: PHI (r27v6 sun.misc.Unsafe) = (r27v5 sun.misc.Unsafe), (r27v5 sun.misc.Unsafe), (r27v8 sun.misc.Unsafe) binds: [B:111:0x02ed, B:106:0x02cb, B:98:0x0286] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x0288 A[PHI: r0 r18 r25 r26 r27
  0x0288: PHI (r0v63 int) = (r0v58 int), (r0v61 int), (r0v65 int) binds: [B:111:0x02ed, B:106:0x02cb, B:98:0x0286] A[DONT_GENERATE, DONT_INLINE]
  0x0288: PHI (r18v5 int) = (r18v3 int), (r18v3 int), (r18v6 int) binds: [B:111:0x02ed, B:106:0x02cb, B:98:0x0286] A[DONT_GENERATE, DONT_INLINE]
  0x0288: PHI (r25v3 int) = (r25v1 int), (r25v1 int), (r25v4 int) binds: [B:111:0x02ed, B:106:0x02cb, B:98:0x0286] A[DONT_GENERATE, DONT_INLINE]
  0x0288: PHI (r26v2 int) = (r26v0 int), (r26v0 int), (r26v3 int) binds: [B:111:0x02ed, B:106:0x02cb, B:98:0x0286] A[DONT_GENERATE, DONT_INLINE]
  0x0288: PHI (r27v7 sun.misc.Unsafe) = (r27v5 sun.misc.Unsafe), (r27v5 sun.misc.Unsafe), (r27v8 sun.misc.Unsafe) binds: [B:111:0x02ed, B:106:0x02cb, B:98:0x0286] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x008d. Please report as an issue. */
    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final void zzh(Object obj, byte[] bArr, int i10, int i11, zzan zzanVar) throws IOException {
        int i12;
        int iZzk;
        int i13;
        int i14;
        int i15;
        Unsafe unsafe;
        int i16;
        int i17;
        int i18;
        int iZzb;
        int i19;
        int i20;
        int i21;
        this = this;
        obj = obj;
        bArr = bArr;
        i11 = i11;
        zzanVar = zzanVar;
        zzew zzewVar = zzew.zza;
        int i22 = -1;
        if (this.zzo - 1 == 0) {
            zzc(obj, bArr, i10, i11, 0, zzanVar);
            return;
        }
        zzG(obj);
        Unsafe unsafe2 = zzb;
        int i23 = 1048575;
        int iZzi = i10;
        int i24 = 1048575;
        int i25 = -1;
        int i26 = 0;
        int i27 = 0;
        while (iZzi < i11) {
            int i28 = iZzi + 1;
            byte b10 = bArr[iZzi];
            if (b10 < 0) {
                iZzk = zzao.zzk(b10, bArr, i28, zzanVar);
                i12 = zzanVar.zza;
            } else {
                i12 = b10;
                iZzk = i28;
            }
            int i29 = i12 >>> 3;
            int iZzu = i29 > i25 ? this.zzu(i29, i26 / 3) : this.zzt(i29);
            if (iZzu == i22) {
                i13 = iZzk;
                i14 = i29;
                i15 = i22;
                unsafe = unsafe2;
                i16 = 0;
            } else {
                int i30 = i12 & 7;
                int[] iArr = this.zzc;
                int i31 = iArr[iZzu + 1];
                int iZzx = zzx(i31);
                long j10 = i31 & i23;
                if (iZzx <= 17) {
                    int i32 = iArr[iZzu + 2];
                    int i33 = 1 << (i32 >>> 20);
                    int i34 = 1048575;
                    int i35 = i32 & 1048575;
                    if (i35 != i24) {
                        if (i24 != 1048575) {
                            unsafe2.putInt(obj, i24, i27);
                        }
                        if (i35 != 1048575) {
                            i27 = unsafe2.getInt(obj, i35);
                        }
                        i24 = i35;
                    }
                    switch (iZzx) {
                        case 0:
                            i34 = 1048575;
                            i17 = iZzu;
                            i14 = i29;
                            i18 = iZzk;
                            if (i30 != 1) {
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                zzeq.zzo(obj, j10, Double.longBitsToDouble(zzao.zzp(bArr, i18)));
                                iZzi = i18 + 8;
                                i27 |= i33;
                                i26 = i17;
                                i25 = i14;
                                i23 = i34;
                                i22 = -1;
                                i11 = i11;
                            }
                            break;
                        case 1:
                            i34 = 1048575;
                            i17 = iZzu;
                            i14 = i29;
                            i18 = iZzk;
                            if (i30 != 5) {
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                zzeq.zzp(obj, j10, Float.intBitsToFloat(zzao.zzb(bArr, i18)));
                                iZzi = i18 + 4;
                                i27 |= i33;
                                i26 = i17;
                                i25 = i14;
                                i23 = i34;
                                i22 = -1;
                                i11 = i11;
                            }
                            break;
                        case 2:
                        case 3:
                            i34 = 1048575;
                            i17 = iZzu;
                            i14 = i29;
                            i18 = iZzk;
                            if (i30 != 0) {
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                int iZzm = zzao.zzm(bArr, i18, zzanVar);
                                unsafe2.putLong(obj, j10, zzanVar.zzb);
                                i27 |= i33;
                                i26 = i17;
                                iZzi = iZzm;
                                i25 = i14;
                                i23 = i34;
                                i22 = -1;
                                i11 = i11;
                            }
                            break;
                        case 4:
                        case 11:
                            i17 = iZzu;
                            i14 = i29;
                            i18 = iZzk;
                            if (i30 != 0) {
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                iZzi = zzao.zzj(bArr, i18, zzanVar);
                                iZzb = zzanVar.zza;
                                unsafe2.putInt(obj, j10, iZzb);
                                i27 |= i33;
                                i26 = i17;
                                i25 = i14;
                                i23 = i34;
                                i22 = -1;
                                i11 = i11;
                            }
                            break;
                        case 5:
                        case 14:
                            i34 = 1048575;
                            i17 = iZzu;
                            i14 = i29;
                            if (i30 != 1) {
                                i18 = iZzk;
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                unsafe2.putLong(obj, j10, zzao.zzp(bArr, iZzk));
                                iZzi = iZzk + 8;
                                i27 |= i33;
                                i26 = i17;
                                i25 = i14;
                                i23 = i34;
                                i22 = -1;
                                i11 = i11;
                            }
                            break;
                        case 6:
                        case 13:
                            i34 = 1048575;
                            i17 = iZzu;
                            i14 = i29;
                            if (i30 != 5) {
                                i18 = iZzk;
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                unsafe2.putInt(obj, j10, zzao.zzb(bArr, iZzk));
                                iZzi = iZzk + 4;
                                i27 |= i33;
                                i26 = i17;
                                i25 = i14;
                                i23 = i34;
                                i22 = -1;
                                i11 = i11;
                            }
                            break;
                        case 7:
                            i34 = 1048575;
                            i17 = iZzu;
                            i14 = i29;
                            if (i30 != 0) {
                                i18 = iZzk;
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                iZzi = zzao.zzm(bArr, iZzk, zzanVar);
                                zzeq.zzm(obj, j10, zzanVar.zzb != 0);
                                i27 |= i33;
                                i26 = i17;
                                i25 = i14;
                                i23 = i34;
                                i22 = -1;
                                i11 = i11;
                            }
                            break;
                        case 8:
                            i34 = 1048575;
                            i17 = iZzu;
                            i14 = i29;
                            if (i30 != 2) {
                                i18 = iZzk;
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                iZzi = (i31 & 536870912) == 0 ? zzao.zzg(bArr, iZzk, zzanVar) : zzao.zzh(bArr, iZzk, zzanVar);
                                unsafe2.putObject(obj, j10, zzanVar.zzc);
                                i27 |= i33;
                                i26 = i17;
                                i25 = i14;
                                i23 = i34;
                                i22 = -1;
                                i11 = i11;
                            }
                            break;
                        case 9:
                            i34 = 1048575;
                            i17 = iZzu;
                            i14 = i29;
                            if (i30 != 2) {
                                i18 = iZzk;
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                Object objZzD = this.zzD(obj, i17);
                                iZzi = zzao.zzo(objZzD, this.zzB(i17), bArr, iZzk, i11, zzanVar);
                                this.zzL(obj, i17, objZzD);
                                i27 |= i33;
                                i26 = i17;
                                i25 = i14;
                                i23 = i34;
                                i22 = -1;
                                i11 = i11;
                            }
                            break;
                        case 10:
                            i34 = 1048575;
                            i17 = iZzu;
                            i14 = i29;
                            if (i30 != 2) {
                                i18 = iZzk;
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                iZzi = zzao.zza(bArr, iZzk, zzanVar);
                                unsafe2.putObject(obj, j10, zzanVar.zzc);
                                i27 |= i33;
                                i26 = i17;
                                i25 = i14;
                                i23 = i34;
                                i22 = -1;
                                i11 = i11;
                            }
                            break;
                        case 12:
                            i17 = iZzu;
                            i14 = i29;
                            if (i30 != 0) {
                                i18 = iZzk;
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                iZzi = zzao.zzj(bArr, iZzk, zzanVar);
                                iZzb = zzanVar.zza;
                                unsafe2.putInt(obj, j10, iZzb);
                                i27 |= i33;
                                i26 = i17;
                                i25 = i14;
                                i23 = i34;
                                i22 = -1;
                                i11 = i11;
                            }
                            break;
                        case 15:
                            i34 = 1048575;
                            i17 = iZzu;
                            i14 = i29;
                            if (i30 != 0) {
                                i18 = iZzk;
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                iZzi = zzao.zzj(bArr, iZzk, zzanVar);
                                iZzb = zzbe.zzb(zzanVar.zza);
                                unsafe2.putInt(obj, j10, iZzb);
                                i27 |= i33;
                                i26 = i17;
                                i25 = i14;
                                i23 = i34;
                                i22 = -1;
                                i11 = i11;
                            }
                            break;
                        case 16:
                            if (i30 != 0) {
                                i14 = i29;
                                i18 = iZzk;
                                i17 = iZzu;
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                int iZzm2 = zzao.zzm(bArr, iZzk, zzanVar);
                                i14 = i29;
                                i34 = 1048575;
                                unsafe2.putLong(obj, j10, zzbe.zzc(zzanVar.zzb));
                                i27 |= i33;
                                i26 = iZzu;
                                iZzi = iZzm2;
                                i25 = i14;
                                i23 = i34;
                                i22 = -1;
                                i11 = i11;
                            }
                            break;
                        default:
                            i17 = iZzu;
                            i14 = i29;
                            i18 = iZzk;
                            i13 = i18;
                            unsafe = unsafe2;
                            i16 = i17;
                            i15 = -1;
                            break;
                    }
                } else {
                    i14 = i29;
                    int i36 = iZzk;
                    if (iZzx != 27) {
                        i16 = iZzu;
                        if (iZzx <= 49) {
                            i20 = i27;
                            i21 = i24;
                            unsafe = unsafe2;
                            i15 = -1;
                            iZzi = zzs(obj, bArr, i36, i11, i12, i14, i30, i16, i31, iZzx, j10, zzanVar);
                            if (iZzi != i36) {
                                i22 = i15;
                                i25 = i14;
                                i26 = i16;
                                i27 = i20;
                                i24 = i21;
                            } else {
                                i13 = iZzi;
                                i27 = i20;
                                i24 = i21;
                            }
                        } else {
                            i19 = i36;
                            i20 = i27;
                            i21 = i24;
                            unsafe = unsafe2;
                            i15 = -1;
                            if (iZzx == 50) {
                                if (i30 == 2) {
                                    iZzi = zzq(obj, bArr, i19, i11, i16, j10, zzanVar);
                                    if (iZzi != i19) {
                                        i22 = i15;
                                        i25 = i14;
                                        i26 = i16;
                                        i27 = i20;
                                        i24 = i21;
                                    } else {
                                        i13 = iZzi;
                                    }
                                }
                                i27 = i20;
                                i24 = i21;
                            } else {
                                iZzi = zzr(obj, bArr, i19, i11, i12, i14, i30, i31, iZzx, j10, i16, zzanVar);
                                if (iZzi != i19) {
                                    i22 = i15;
                                    i25 = i14;
                                    i26 = i16;
                                    i27 = i20;
                                    i24 = i21;
                                } else {
                                    i13 = iZzi;
                                    i27 = i20;
                                    i24 = i21;
                                }
                            }
                        }
                        unsafe2 = unsafe;
                        i23 = 1048575;
                    } else if (i30 == 2) {
                        zzcf zzcfVarZzd = (zzcf) unsafe2.getObject(obj, j10);
                        if (!zzcfVarZzd.zzc()) {
                            int size = zzcfVarZzd.size();
                            zzcfVarZzd = zzcfVarZzd.zzd(size == 0 ? 10 : size + size);
                            unsafe2.putObject(obj, j10, zzcfVarZzd);
                        }
                        iZzi = zzao.zze(this.zzB(iZzu), i12, bArr, i36, i11, zzcfVarZzd, zzanVar);
                        i11 = i11;
                        i27 = i27;
                        i25 = i14;
                        i26 = iZzu;
                        i23 = 1048575;
                        i22 = -1;
                    } else {
                        i16 = iZzu;
                        i19 = i36;
                        i20 = i27;
                        i21 = i24;
                        unsafe = unsafe2;
                        i15 = -1;
                    }
                    i13 = i19;
                    i27 = i20;
                    i24 = i21;
                }
            }
            iZzi = zzao.zzi(i12, bArr, i13, i11, zzd(obj), zzanVar);
            i22 = i15;
            i25 = i14;
            i26 = i16;
            unsafe2 = unsafe;
            i23 = 1048575;
        }
        int i37 = i27;
        Unsafe unsafe3 = unsafe2;
        if (i24 != i23) {
            unsafe3.putInt(obj, i24, i37);
        }
        if (iZzi != i11) {
            throw zzci.zze();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:127:0x0347  */
    /* JADX WARN: Code duplicated, block: B:130:0x035a  */
    /* JADX WARN: Code duplicated, block: B:133:0x036f  */
    /* JADX WARN: Failed to find 'out' block for switch in B:183:0x0442. Please report as an issue. */
    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final void zzi(Object obj, zzey zzeyVar) throws IOException {
        int i10;
        int i11;
        int i12;
        double dZza;
        float fZzb;
        long jZzd;
        long jZzd2;
        int iZzc;
        long jZzd3;
        int iZzc2;
        boolean zZzw;
        int iZzc3;
        int iZzc4;
        int iZzc5;
        long jZzd4;
        int iZzc6;
        long jZzd5;
        zzew zzewVar = zzew.zza;
        int i13 = 0;
        int i14 = 1048575;
        if (this.zzo - 1 != 0) {
            if (this.zzh) {
                this.zzn.zza(obj);
                throw null;
            }
            int length = this.zzc.length;
            for (int i15 = 0; i15 < length; i15 += 3) {
                int iZzy = zzy(i15);
                int i16 = this.zzc[i15];
                switch (zzx(iZzy)) {
                    case 0:
                        if (zzP(obj, i15)) {
                            dZza = zzeq.zza(obj, iZzy & 1048575);
                            zzeyVar.zzf(i16, dZza);
                        }
                        break;
                    case 1:
                        if (zzP(obj, i15)) {
                            fZzb = zzeq.zzb(obj, iZzy & 1048575);
                            zzeyVar.zzo(i16, fZzb);
                        }
                        break;
                    case 2:
                        if (zzP(obj, i15)) {
                            jZzd = zzeq.zzd(obj, iZzy & 1048575);
                            zzeyVar.zzt(i16, jZzd);
                        }
                        break;
                    case 3:
                        if (zzP(obj, i15)) {
                            jZzd2 = zzeq.zzd(obj, iZzy & 1048575);
                            zzeyVar.zzJ(i16, jZzd2);
                        }
                        break;
                    case 4:
                        if (zzP(obj, i15)) {
                            iZzc = zzeq.zzc(obj, iZzy & 1048575);
                            zzeyVar.zzr(i16, iZzc);
                        }
                        break;
                    case 5:
                        if (zzP(obj, i15)) {
                            jZzd3 = zzeq.zzd(obj, iZzy & 1048575);
                            zzeyVar.zzm(i16, jZzd3);
                        }
                        break;
                    case 6:
                        if (zzP(obj, i15)) {
                            iZzc2 = zzeq.zzc(obj, iZzy & 1048575);
                            zzeyVar.zzk(i16, iZzc2);
                        }
                        break;
                    case 7:
                        if (zzP(obj, i15)) {
                            zZzw = zzeq.zzw(obj, iZzy & 1048575);
                            zzeyVar.zzb(i16, zZzw);
                        }
                        break;
                    case 8:
                        if (zzP(obj, i15)) {
                            zzV(i16, zzeq.zzf(obj, iZzy & 1048575), zzeyVar);
                        }
                        break;
                    case 9:
                        if (zzP(obj, i15)) {
                            zzeyVar.zzv(i16, zzeq.zzf(obj, iZzy & 1048575), zzB(i15));
                        }
                        break;
                    case 10:
                        if (zzP(obj, i15)) {
                            zzeyVar.zzd(i16, (zzba) zzeq.zzf(obj, iZzy & 1048575));
                        }
                        break;
                    case 11:
                        if (zzP(obj, i15)) {
                            iZzc3 = zzeq.zzc(obj, iZzy & 1048575);
                            zzeyVar.zzH(i16, iZzc3);
                        }
                        break;
                    case 12:
                        if (zzP(obj, i15)) {
                            iZzc4 = zzeq.zzc(obj, iZzy & 1048575);
                            zzeyVar.zzi(i16, iZzc4);
                        }
                        break;
                    case 13:
                        if (zzP(obj, i15)) {
                            iZzc5 = zzeq.zzc(obj, iZzy & 1048575);
                            zzeyVar.zzw(i16, iZzc5);
                        }
                        break;
                    case 14:
                        if (zzP(obj, i15)) {
                            jZzd4 = zzeq.zzd(obj, iZzy & 1048575);
                            zzeyVar.zzy(i16, jZzd4);
                        }
                        break;
                    case 15:
                        if (zzP(obj, i15)) {
                            iZzc6 = zzeq.zzc(obj, iZzy & 1048575);
                            zzeyVar.zzA(i16, iZzc6);
                        }
                        break;
                    case 16:
                        if (zzP(obj, i15)) {
                            jZzd5 = zzeq.zzd(obj, iZzy & 1048575);
                            zzeyVar.zzC(i16, jZzd5);
                        }
                        break;
                    case 17:
                        if (zzP(obj, i15)) {
                            zzeyVar.zzq(i16, zzeq.zzf(obj, iZzy & 1048575), zzB(i15));
                        }
                        break;
                    case 18:
                        zzdr.zzF(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar, false);
                        break;
                    case 19:
                        zzdr.zzJ(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar, false);
                        break;
                    case 20:
                        zzdr.zzM(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar, false);
                        break;
                    case 21:
                        zzdr.zzU(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar, false);
                        break;
                    case 22:
                        zzdr.zzL(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar, false);
                        break;
                    case 23:
                        zzdr.zzI(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar, false);
                        break;
                    case 24:
                        zzdr.zzH(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar, false);
                        break;
                    case 25:
                        zzdr.zzD(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar, false);
                        break;
                    case 26:
                        zzdr.zzS(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar);
                        break;
                    case 27:
                        zzdr.zzN(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar, zzB(i15));
                        break;
                    case 28:
                        zzdr.zzE(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar);
                        break;
                    case 29:
                        zzdr.zzT(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar, false);
                        break;
                    case 30:
                        zzdr.zzG(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar, false);
                        break;
                    case 31:
                        zzdr.zzO(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar, false);
                        break;
                    case 32:
                        zzdr.zzP(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar, false);
                        break;
                    case 33:
                        zzdr.zzQ(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar, false);
                        break;
                    case 34:
                        zzdr.zzR(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar, false);
                        break;
                    case 35:
                        zzdr.zzF(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar, true);
                        break;
                    case 36:
                        zzdr.zzJ(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar, true);
                        break;
                    case 37:
                        zzdr.zzM(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar, true);
                        break;
                    case 38:
                        zzdr.zzU(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar, true);
                        break;
                    case 39:
                        zzdr.zzL(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar, true);
                        break;
                    case 40:
                        zzdr.zzI(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar, true);
                        break;
                    case 41:
                        zzdr.zzH(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar, true);
                        break;
                    case 42:
                        zzdr.zzD(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar, true);
                        break;
                    case 43:
                        zzdr.zzT(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar, true);
                        break;
                    case 44:
                        zzdr.zzG(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar, true);
                        break;
                    case 45:
                        zzdr.zzO(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar, true);
                        break;
                    case 46:
                        zzdr.zzP(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar, true);
                        break;
                    case 47:
                        zzdr.zzQ(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar, true);
                        break;
                    case 48:
                        zzdr.zzR(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar, true);
                        break;
                    case 49:
                        zzdr.zzK(i16, (List) zzeq.zzf(obj, iZzy & 1048575), zzeyVar, zzB(i15));
                        break;
                    case 50:
                        zzN(zzeyVar, i16, zzeq.zzf(obj, iZzy & 1048575), i15);
                        break;
                    case 51:
                        if (zzT(obj, i16, i15)) {
                            dZza = zzm(obj, iZzy & 1048575);
                            zzeyVar.zzf(i16, dZza);
                        }
                        break;
                    case 52:
                        if (zzT(obj, i16, i15)) {
                            fZzb = zzn(obj, iZzy & 1048575);
                            zzeyVar.zzo(i16, fZzb);
                        }
                        break;
                    case 53:
                        if (zzT(obj, i16, i15)) {
                            jZzd = zzz(obj, iZzy & 1048575);
                            zzeyVar.zzt(i16, jZzd);
                        }
                        break;
                    case 54:
                        if (zzT(obj, i16, i15)) {
                            jZzd2 = zzz(obj, iZzy & 1048575);
                            zzeyVar.zzJ(i16, jZzd2);
                        }
                        break;
                    case 55:
                        if (zzT(obj, i16, i15)) {
                            iZzc = zzp(obj, iZzy & 1048575);
                            zzeyVar.zzr(i16, iZzc);
                        }
                        break;
                    case 56:
                        if (zzT(obj, i16, i15)) {
                            jZzd3 = zzz(obj, iZzy & 1048575);
                            zzeyVar.zzm(i16, jZzd3);
                        }
                        break;
                    case 57:
                        if (zzT(obj, i16, i15)) {
                            iZzc2 = zzp(obj, iZzy & 1048575);
                            zzeyVar.zzk(i16, iZzc2);
                        }
                        break;
                    case 58:
                        if (zzT(obj, i16, i15)) {
                            zZzw = zzU(obj, iZzy & 1048575);
                            zzeyVar.zzb(i16, zZzw);
                        }
                        break;
                    case 59:
                        if (zzT(obj, i16, i15)) {
                            zzV(i16, zzeq.zzf(obj, iZzy & 1048575), zzeyVar);
                        }
                        break;
                    case 60:
                        if (zzT(obj, i16, i15)) {
                            zzeyVar.zzv(i16, zzeq.zzf(obj, iZzy & 1048575), zzB(i15));
                        }
                        break;
                    case 61:
                        if (zzT(obj, i16, i15)) {
                            zzeyVar.zzd(i16, (zzba) zzeq.zzf(obj, iZzy & 1048575));
                        }
                        break;
                    case 62:
                        if (zzT(obj, i16, i15)) {
                            iZzc3 = zzp(obj, iZzy & 1048575);
                            zzeyVar.zzH(i16, iZzc3);
                        }
                        break;
                    case 63:
                        if (zzT(obj, i16, i15)) {
                            iZzc4 = zzp(obj, iZzy & 1048575);
                            zzeyVar.zzi(i16, iZzc4);
                        }
                        break;
                    case 64:
                        if (zzT(obj, i16, i15)) {
                            iZzc5 = zzp(obj, iZzy & 1048575);
                            zzeyVar.zzw(i16, iZzc5);
                        }
                        break;
                    case 65:
                        if (zzT(obj, i16, i15)) {
                            jZzd4 = zzz(obj, iZzy & 1048575);
                            zzeyVar.zzy(i16, jZzd4);
                        }
                        break;
                    case 66:
                        if (zzT(obj, i16, i15)) {
                            iZzc6 = zzp(obj, iZzy & 1048575);
                            zzeyVar.zzA(i16, iZzc6);
                        }
                        break;
                    case 67:
                        if (zzT(obj, i16, i15)) {
                            jZzd5 = zzz(obj, iZzy & 1048575);
                            zzeyVar.zzC(i16, jZzd5);
                        }
                        break;
                    case 68:
                        if (zzT(obj, i16, i15)) {
                            zzeyVar.zzq(i16, zzeq.zzf(obj, iZzy & 1048575), zzB(i15));
                        }
                        break;
                }
            }
        } else {
            if (this.zzh) {
                this.zzn.zza(obj);
                throw null;
            }
            int length2 = this.zzc.length;
            Unsafe unsafe = zzb;
            int i17 = 0;
            int i18 = 0;
            int i19 = 1048575;
            while (i17 < length2) {
                int iZzy2 = zzy(i17);
                int[] iArr = this.zzc;
                int i20 = iArr[i17];
                int iZzx = zzx(iZzy2);
                if (iZzx <= 17) {
                    int i21 = iArr[i17 + 2];
                    int i22 = i21 & i14;
                    if (i22 != i19) {
                        i18 = unsafe.getInt(obj, i22);
                        i19 = i22;
                    }
                    i10 = 1 << (i21 >>> 20);
                } else {
                    i10 = i13;
                }
                long j10 = iZzy2 & i14;
                switch (iZzx) {
                    case 0:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzeyVar.zzf(i20, zzeq.zza(obj, j10));
                        }
                        break;
                    case 1:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzeyVar.zzo(i20, zzeq.zzb(obj, j10));
                        }
                        break;
                    case 2:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzeyVar.zzt(i20, unsafe.getLong(obj, j10));
                        }
                        break;
                    case 3:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzeyVar.zzJ(i20, unsafe.getLong(obj, j10));
                        }
                        break;
                    case 4:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzeyVar.zzr(i20, unsafe.getInt(obj, j10));
                        }
                        break;
                    case 5:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzeyVar.zzm(i20, unsafe.getLong(obj, j10));
                        }
                        break;
                    case 6:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzeyVar.zzk(i20, unsafe.getInt(obj, j10));
                        }
                        break;
                    case 7:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzeyVar.zzb(i20, zzeq.zzw(obj, j10));
                        }
                        break;
                    case 8:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzV(i20, unsafe.getObject(obj, j10), zzeyVar);
                        }
                        break;
                    case 9:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzeyVar.zzv(i20, unsafe.getObject(obj, j10), zzB(i17));
                        }
                        break;
                    case 10:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzeyVar.zzd(i20, (zzba) unsafe.getObject(obj, j10));
                        }
                        break;
                    case 11:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzeyVar.zzH(i20, unsafe.getInt(obj, j10));
                        }
                        break;
                    case 12:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzeyVar.zzi(i20, unsafe.getInt(obj, j10));
                        }
                        break;
                    case 13:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzeyVar.zzw(i20, unsafe.getInt(obj, j10));
                        }
                        break;
                    case 14:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzeyVar.zzy(i20, unsafe.getLong(obj, j10));
                        }
                        break;
                    case 15:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzeyVar.zzA(i20, unsafe.getInt(obj, j10));
                        }
                        break;
                    case 16:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzeyVar.zzC(i20, unsafe.getLong(obj, j10));
                        }
                        break;
                    case 17:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzeyVar.zzq(i20, unsafe.getObject(obj, j10), zzB(i17));
                        }
                        break;
                    case 18:
                        i11 = 0;
                        zzdr.zzF(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar, false);
                        break;
                    case 19:
                        i11 = 0;
                        zzdr.zzJ(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar, false);
                        break;
                    case 20:
                        i11 = 0;
                        zzdr.zzM(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar, false);
                        break;
                    case 21:
                        i11 = 0;
                        zzdr.zzU(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar, false);
                        break;
                    case 22:
                        i11 = 0;
                        zzdr.zzL(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar, false);
                        break;
                    case 23:
                        i11 = 0;
                        zzdr.zzI(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar, false);
                        break;
                    case 24:
                        i11 = 0;
                        zzdr.zzH(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar, false);
                        break;
                    case 25:
                        i11 = 0;
                        zzdr.zzD(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar, false);
                        break;
                    case 26:
                        zzdr.zzS(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar);
                        i11 = 0;
                        break;
                    case 27:
                        zzdr.zzN(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar, zzB(i17));
                        i11 = 0;
                        break;
                    case 28:
                        zzdr.zzE(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar);
                        i11 = 0;
                        break;
                    case 29:
                        i12 = 0;
                        zzdr.zzT(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar, false);
                        i11 = i12;
                        break;
                    case 30:
                        i12 = 0;
                        zzdr.zzG(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar, false);
                        i11 = i12;
                        break;
                    case 31:
                        i12 = 0;
                        zzdr.zzO(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar, false);
                        i11 = i12;
                        break;
                    case 32:
                        i12 = 0;
                        zzdr.zzP(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar, false);
                        i11 = i12;
                        break;
                    case 33:
                        i12 = 0;
                        zzdr.zzQ(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar, false);
                        i11 = i12;
                        break;
                    case 34:
                        i12 = 0;
                        zzdr.zzR(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar, false);
                        i11 = i12;
                        break;
                    case 35:
                        zzdr.zzF(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar, true);
                        i11 = 0;
                        break;
                    case 36:
                        zzdr.zzJ(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar, true);
                        i11 = 0;
                        break;
                    case 37:
                        zzdr.zzM(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar, true);
                        i11 = 0;
                        break;
                    case 38:
                        zzdr.zzU(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar, true);
                        i11 = 0;
                        break;
                    case 39:
                        zzdr.zzL(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar, true);
                        i11 = 0;
                        break;
                    case 40:
                        zzdr.zzI(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar, true);
                        i11 = 0;
                        break;
                    case 41:
                        zzdr.zzH(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar, true);
                        i11 = 0;
                        break;
                    case 42:
                        zzdr.zzD(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar, true);
                        i11 = 0;
                        break;
                    case 43:
                        zzdr.zzT(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar, true);
                        i11 = 0;
                        break;
                    case 44:
                        zzdr.zzG(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar, true);
                        i11 = 0;
                        break;
                    case 45:
                        zzdr.zzO(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar, true);
                        i11 = 0;
                        break;
                    case 46:
                        zzdr.zzP(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar, true);
                        i11 = 0;
                        break;
                    case 47:
                        zzdr.zzQ(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar, true);
                        i11 = 0;
                        break;
                    case 48:
                        zzdr.zzR(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar, true);
                        i11 = 0;
                        break;
                    case 49:
                        zzdr.zzK(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzeyVar, zzB(i17));
                        i11 = 0;
                        break;
                    case 50:
                        zzN(zzeyVar, i20, unsafe.getObject(obj, j10), i17);
                        i11 = 0;
                        break;
                    case 51:
                        if (zzT(obj, i20, i17)) {
                            zzeyVar.zzf(i20, zzm(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 52:
                        if (zzT(obj, i20, i17)) {
                            zzeyVar.zzo(i20, zzn(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 53:
                        if (zzT(obj, i20, i17)) {
                            zzeyVar.zzt(i20, zzz(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 54:
                        if (zzT(obj, i20, i17)) {
                            zzeyVar.zzJ(i20, zzz(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 55:
                        if (zzT(obj, i20, i17)) {
                            zzeyVar.zzr(i20, zzp(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 56:
                        if (zzT(obj, i20, i17)) {
                            zzeyVar.zzm(i20, zzz(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 57:
                        if (zzT(obj, i20, i17)) {
                            zzeyVar.zzk(i20, zzp(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 58:
                        if (zzT(obj, i20, i17)) {
                            zzeyVar.zzb(i20, zzU(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 59:
                        if (zzT(obj, i20, i17)) {
                            zzV(i20, unsafe.getObject(obj, j10), zzeyVar);
                        }
                        i11 = 0;
                        break;
                    case 60:
                        if (zzT(obj, i20, i17)) {
                            zzeyVar.zzv(i20, unsafe.getObject(obj, j10), zzB(i17));
                        }
                        i11 = 0;
                        break;
                    case 61:
                        if (zzT(obj, i20, i17)) {
                            zzeyVar.zzd(i20, (zzba) unsafe.getObject(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 62:
                        if (zzT(obj, i20, i17)) {
                            zzeyVar.zzH(i20, zzp(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 63:
                        if (zzT(obj, i20, i17)) {
                            zzeyVar.zzi(i20, zzp(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 64:
                        if (zzT(obj, i20, i17)) {
                            zzeyVar.zzw(i20, zzp(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 65:
                        if (zzT(obj, i20, i17)) {
                            zzeyVar.zzy(i20, zzz(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 66:
                        if (zzT(obj, i20, i17)) {
                            zzeyVar.zzA(i20, zzp(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 67:
                        if (zzT(obj, i20, i17)) {
                            zzeyVar.zzC(i20, zzz(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 68:
                        if (zzT(obj, i20, i17)) {
                            zzeyVar.zzq(i20, unsafe.getObject(obj, j10), zzB(i17));
                        }
                        i11 = 0;
                        break;
                    default:
                        i11 = 0;
                        break;
                }
                i17 += 3;
                i13 = i11;
                i14 = 1048575;
            }
        }
        zzeg zzegVar = this.zzm;
        zzegVar.zzi(zzegVar.zzd(obj), zzeyVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final boolean zzj(Object obj, Object obj2) {
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iZzy = zzy(i10);
            long j10 = iZzy & 1048575;
            switch (zzx(iZzy)) {
                case 0:
                    if (!zzO(obj, obj2, i10) || Double.doubleToLongBits(zzeq.zza(obj, j10)) != Double.doubleToLongBits(zzeq.zza(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 1:
                    if (!zzO(obj, obj2, i10) || Float.floatToIntBits(zzeq.zzb(obj, j10)) != Float.floatToIntBits(zzeq.zzb(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 2:
                    if (!zzO(obj, obj2, i10) || zzeq.zzd(obj, j10) != zzeq.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 3:
                    if (!zzO(obj, obj2, i10) || zzeq.zzd(obj, j10) != zzeq.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 4:
                    if (!zzO(obj, obj2, i10) || zzeq.zzc(obj, j10) != zzeq.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!zzO(obj, obj2, i10) || zzeq.zzd(obj, j10) != zzeq.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 6:
                    if (!zzO(obj, obj2, i10) || zzeq.zzc(obj, j10) != zzeq.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 7:
                    if (!zzO(obj, obj2, i10) || zzeq.zzw(obj, j10) != zzeq.zzw(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 8:
                    if (!zzO(obj, obj2, i10) || !zzdr.zzV(zzeq.zzf(obj, j10), zzeq.zzf(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 9:
                    if (!zzO(obj, obj2, i10) || !zzdr.zzV(zzeq.zzf(obj, j10), zzeq.zzf(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 10:
                    if (!zzO(obj, obj2, i10) || !zzdr.zzV(zzeq.zzf(obj, j10), zzeq.zzf(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 11:
                    if (!zzO(obj, obj2, i10) || zzeq.zzc(obj, j10) != zzeq.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 12:
                    if (!zzO(obj, obj2, i10) || zzeq.zzc(obj, j10) != zzeq.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 13:
                    if (!zzO(obj, obj2, i10) || zzeq.zzc(obj, j10) != zzeq.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 14:
                    if (!zzO(obj, obj2, i10) || zzeq.zzd(obj, j10) != zzeq.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 15:
                    if (!zzO(obj, obj2, i10) || zzeq.zzc(obj, j10) != zzeq.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 16:
                    if (!zzO(obj, obj2, i10) || zzeq.zzd(obj, j10) != zzeq.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 17:
                    if (!zzO(obj, obj2, i10) || !zzdr.zzV(zzeq.zzf(obj, j10), zzeq.zzf(obj2, j10))) {
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
                    if (!zzdr.zzV(zzeq.zzf(obj, j10), zzeq.zzf(obj2, j10))) {
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
                    long jZzv = zzv(i10) & 1048575;
                    if (zzeq.zzc(obj, jZzv) != zzeq.zzc(obj2, jZzv) || !zzdr.zzV(zzeq.zzf(obj, j10), zzeq.zzf(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
            }
        }
        if (!this.zzm.zzd(obj).equals(this.zzm.zzd(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzn.zza(obj);
        this.zzn.zza(obj2);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c3 A[LOOP:1: B:45:0x00b2->B:50:0x00c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e1 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.zzdp
    public final boolean zzk(Object obj) {
        int i10;
        int i11;
        List list;
        zzdp zzdpVarZzB;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.zzj) {
            int i16 = this.zzi[i15];
            int i17 = this.zzc[i16];
            int iZzy = zzy(i16);
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
            if ((268435456 & iZzy) != 0 && !zzQ(obj, i16, i10, i11, i20)) {
                return false;
            }
            int iZzx = zzx(iZzy);
            if (iZzx == 9 || iZzx == 17) {
                if (zzQ(obj, i16, i10, i11, i20) && !zzR(obj, iZzy, zzB(i16))) {
                    return false;
                }
            } else if (iZzx == 27) {
                list = (List) zzeq.zzf(obj, iZzy & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzdpVarZzB = zzB(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!zzdpVarZzB.zzk(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iZzx == 60 || iZzx == 68) {
                if (zzT(obj, i17, i16) && !zzR(obj, iZzy, zzB(i16))) {
                    return false;
                }
            } else if (iZzx == 49) {
                list = (List) zzeq.zzf(obj, iZzy & 1048575);
                if (list.isEmpty()) {
                    zzdpVarZzB = zzB(i16);
                    while (i12 < list.size()) {
                        if (!zzdpVarZzB.zzk(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzx == 50 && !((zzcz) zzeq.zzf(obj, iZzy & 1048575)).isEmpty()) {
                throw null;
            }
            i15++;
            i13 = i10;
            i14 = i11;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzn.zza(obj);
        throw null;
    }
}
