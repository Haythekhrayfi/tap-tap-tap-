package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class zzgqz<T> implements zzgrp<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgsq.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgqw zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzgqk zzm;
    private final zzgsg zzn;
    private final zzgoz zzo;
    private final int zzp;
    private final zzgrb zzq;
    private final zzgqr zzr;

    private zzgqz(int[] iArr, Object[] objArr, int i10, int i11, zzgqw zzgqwVar, int i12, boolean z10, int[] iArr2, int i13, int i14, zzgrb zzgrbVar, zzgqk zzgqkVar, zzgsg zzgsgVar, zzgoz zzgozVar, zzgqr zzgqrVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzgqwVar instanceof zzgpm;
        this.zzp = i12;
        boolean z11 = false;
        if (zzgozVar != null && zzgozVar.zzh(zzgqwVar)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzj = iArr2;
        this.zzk = i13;
        this.zzl = i14;
        this.zzq = zzgrbVar;
        this.zzm = zzgqkVar;
        this.zzn = zzgsgVar;
        this.zzo = zzgozVar;
        this.zzg = zzgqwVar;
        this.zzr = zzgqrVar;
    }

    private static long zzA(Object obj, long j10) {
        return ((Long) zzgsq.zzh(obj, j10)).longValue();
    }

    private final zzgpq zzB(int i10) {
        int i11 = i10 / 3;
        return (zzgpq) this.zzd[i11 + i11 + 1];
    }

    private final zzgrp zzC(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzgrp zzgrpVar = (zzgrp) this.zzd[i12];
        if (zzgrpVar != null) {
            return zzgrpVar;
        }
        zzgrp zzgrpVarZzb = zzgre.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzgrpVarZzb;
        return zzgrpVarZzb;
    }

    private final Object zzD(Object obj, int i10, Object obj2, zzgsg zzgsgVar, Object obj3) {
        int i11 = this.zzc[i10];
        Object objZzh = zzgsq.zzh(obj, zzz(i10) & 1048575);
        if (objZzh == null || zzB(i10) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzE(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final Object zzF(Object obj, int i10) {
        zzgrp zzgrpVarZzC = zzC(i10);
        int iZzz = zzz(i10) & 1048575;
        if (!zzS(obj, i10)) {
            return zzgrpVarZzC.zze();
        }
        Object object = zzb.getObject(obj, iZzz);
        if (zzV(object)) {
            return object;
        }
        Object objZze = zzgrpVarZzC.zze();
        if (object != null) {
            zzgrpVarZzC.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzG(Object obj, int i10, int i11) {
        zzgrp zzgrpVarZzC = zzC(i11);
        if (!zzW(obj, i10, i11)) {
            return zzgrpVarZzC.zze();
        }
        Object object = zzb.getObject(obj, zzz(i11) & 1048575);
        if (zzV(object)) {
            return object;
        }
        Object objZze = zzgrpVarZzC.zze();
        if (object != null) {
            zzgrpVarZzC.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzH(Class cls, String str) {
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
            StringBuilder sbA = q2.a.a("Field ", str, " for ", name, " not found. Known fields are ");
            sbA.append(string);
            throw new RuntimeException(sbA.toString());
        }
    }

    private static void zzI(Object obj) {
        if (!zzV(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzJ(Object obj, Object obj2, int i10) {
        if (zzS(obj2, i10)) {
            int iZzz = zzz(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzz;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzgrp zzgrpVarZzC = zzC(i10);
            if (!zzS(obj, i10)) {
                if (zzV(object)) {
                    Object objZze = zzgrpVarZzC.zze();
                    zzgrpVarZzC.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzM(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzV(object2)) {
                Object objZze2 = zzgrpVarZzC.zze();
                zzgrpVarZzC.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            zzgrpVarZzC.zzg(object2, object);
        }
    }

    private final void zzK(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (zzW(obj2, i11, i10)) {
            int iZzz = zzz(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzz;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzgrp zzgrpVarZzC = zzC(i10);
            if (!zzW(obj, i11, i10)) {
                if (zzV(object)) {
                    Object objZze = zzgrpVarZzC.zze();
                    zzgrpVarZzC.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzN(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzV(object2)) {
                Object objZze2 = zzgrpVarZzC.zze();
                zzgrpVarZzC.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            zzgrpVarZzC.zzg(object2, object);
        }
    }

    private final void zzL(Object obj, int i10, zzgrh zzgrhVar) throws IOException {
        int i11;
        Object objZzr;
        if (zzR(i10)) {
            i11 = i10 & 1048575;
            objZzr = zzgrhVar.zzs();
        } else {
            i11 = i10 & 1048575;
            objZzr = this.zzi ? zzgrhVar.zzr() : zzgrhVar.zzp();
        }
        zzgsq.zzv(obj, i11, objZzr);
    }

    private final void zzM(Object obj, int i10) {
        int iZzw = zzw(i10);
        long j10 = 1048575 & iZzw;
        if (j10 == 1048575) {
            return;
        }
        zzgsq.zzt(obj, j10, (1 << (iZzw >>> 20)) | zzgsq.zzd(obj, j10));
    }

    private final void zzN(Object obj, int i10, int i11) {
        zzgsq.zzt(obj, zzw(i11) & 1048575, i10);
    }

    private final void zzO(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzz(i10) & 1048575, obj2);
        zzM(obj, i10);
    }

    private final void zzP(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzz(i11) & 1048575, obj2);
        zzN(obj, i10, i11);
    }

    private final boolean zzQ(Object obj, Object obj2, int i10) {
        return zzS(obj, i10) == zzS(obj2, i10);
    }

    private static boolean zzR(int i10) {
        return (i10 & 536870912) != 0;
    }

    private final boolean zzS(Object obj, int i10) {
        int iZzw = zzw(i10);
        long j10 = iZzw & 1048575;
        if (j10 != 1048575) {
            return (zzgsq.zzd(obj, j10) & (1 << (iZzw >>> 20))) != 0;
        }
        int iZzz = zzz(i10);
        long j11 = iZzz & 1048575;
        switch (zzy(iZzz)) {
            case 0:
                return Double.doubleToRawLongBits(zzgsq.zzb(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzgsq.zzc(obj, j11)) != 0;
            case 2:
                return zzgsq.zzf(obj, j11) != 0;
            case 3:
                return zzgsq.zzf(obj, j11) != 0;
            case 4:
                return zzgsq.zzd(obj, j11) != 0;
            case 5:
                return zzgsq.zzf(obj, j11) != 0;
            case 6:
                return zzgsq.zzd(obj, j11) != 0;
            case 7:
                return zzgsq.zzz(obj, j11);
            case 8:
                Object objZzh = zzgsq.zzh(obj, j11);
                if (objZzh instanceof String) {
                    return !((String) objZzh).isEmpty();
                }
                if (objZzh instanceof zzgoe) {
                    return !zzgoe.zzb.equals(objZzh);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzgsq.zzh(obj, j11) != null;
            case 10:
                return !zzgoe.zzb.equals(zzgsq.zzh(obj, j11));
            case 11:
                return zzgsq.zzd(obj, j11) != 0;
            case 12:
                return zzgsq.zzd(obj, j11) != 0;
            case 13:
                return zzgsq.zzd(obj, j11) != 0;
            case 14:
                return zzgsq.zzf(obj, j11) != 0;
            case 15:
                return zzgsq.zzd(obj, j11) != 0;
            case 16:
                return zzgsq.zzf(obj, j11) != 0;
            case 17:
                return zzgsq.zzh(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzT(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzS(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    private static boolean zzU(Object obj, int i10, zzgrp zzgrpVar) {
        return zzgrpVar.zzk(zzgsq.zzh(obj, i10 & 1048575));
    }

    private static boolean zzV(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgpm) {
            return ((zzgpm) obj).zzaY();
        }
        return true;
    }

    private final boolean zzW(Object obj, int i10, int i11) {
        return zzgsq.zzd(obj, (long) (zzw(i11) & 1048575)) == i10;
    }

    private static boolean zzX(Object obj, long j10) {
        return ((Boolean) zzgsq.zzh(obj, j10)).booleanValue();
    }

    private final void zzY(zzgou zzgouVar, int i10, Object obj, int i11) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private static final void zzZ(int i10, Object obj, zzgou zzgouVar) throws IOException {
        if (obj instanceof String) {
            zzgouVar.zzF(i10, (String) obj);
        } else {
            zzgouVar.zzd(i10, (zzgoe) obj);
        }
    }

    public static zzgsh zzd(Object obj) {
        zzgpm zzgpmVar = (zzgpm) obj;
        zzgsh zzgshVar = zzgpmVar.zzc;
        if (zzgshVar != zzgsh.zzc()) {
            return zzgshVar;
        }
        zzgsh zzgshVarZzf = zzgsh.zzf();
        zzgpmVar.zzc = zzgshVarZzf;
        return zzgshVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x024f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0252  */
    /* JADX WARN: Code duplicated, block: B:127:0x026a  */
    /* JADX WARN: Code duplicated, block: B:128:0x026d  */
    public static zzgqz zzl(Class cls, zzgqt zzgqtVar, zzgrb zzgrbVar, zzgqk zzgqkVar, zzgsg zzgsgVar, zzgoz zzgozVar, zzgqr zzgqrVar) {
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
        Field fieldZzH;
        char cCharAt9;
        int i29;
        int i30;
        int i31;
        Object obj;
        Field fieldZzH2;
        int i32;
        Object obj2;
        Field fieldZzH3;
        int i33;
        char cCharAt10;
        int i34;
        char cCharAt11;
        int i35;
        char cCharAt12;
        int i36;
        char cCharAt13;
        if (!(zzgqtVar instanceof zzgrg)) {
            throw null;
        }
        zzgrg zzgrgVar = (zzgrg) zzgqtVar;
        String strZzd = zzgrgVar.zzd();
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
        Object[] objArrZze = zzgrgVar.zze();
        Class<?> cls2 = zzgrgVar.zza().getClass();
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
                    if (i83 == 12 && (zzgrgVar.zzc() == 1 || (iCharAt11 & 2048) != 0)) {
                        int i86 = i68 / 3;
                        i30 = i11 + 1;
                        objArr[i86 + i86 + 1] = objArrZze[i11];
                    }
                    i31 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i31];
                    if (obj instanceof Field) {
                        fieldZzH2 = (Field) obj;
                    } else {
                        fieldZzH2 = zzH(cls2, (String) obj);
                        objArrZze[i31] = fieldZzH2;
                    }
                    int i87 = i12;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzH2);
                    i32 = i31 + 1;
                    obj2 = objArrZze[i32];
                    if (obj2 instanceof Field) {
                        fieldZzH3 = (Field) obj2;
                    } else {
                        fieldZzH3 = zzH(cls2, (String) obj2);
                        objArrZze[i32] = fieldZzH3;
                    }
                    i26 = i87;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzH3);
                    i27 = i84;
                    i28 = 0;
                    strZzd = strZzd;
                }
                i11 = i30;
                i31 = iCharAt12 + iCharAt12;
                obj = objArrZze[i31];
                if (obj instanceof Field) {
                    fieldZzH2 = (Field) obj;
                } else {
                    fieldZzH2 = zzH(cls2, (String) obj);
                    objArrZze[i31] = fieldZzH2;
                }
                int i88 = i12;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzH2);
                i32 = i31 + 1;
                obj2 = objArrZze[i32];
                if (obj2 instanceof Field) {
                    fieldZzH3 = (Field) obj2;
                } else {
                    fieldZzH3 = zzH(cls2, (String) obj2);
                    objArrZze[i32] = fieldZzH3;
                }
                i26 = i88;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzH3);
                i27 = i84;
                i28 = 0;
                strZzd = strZzd;
            } else {
                i26 = i12;
                int i89 = i11 + 1;
                Field fieldZzH4 = zzH(cls2, (String) objArrZze[i11]);
                if (i79 == 9 || i79 == 17) {
                    i26 = i26;
                    int i90 = i68 / 3;
                    objArr[i90 + i90 + 1] = fieldZzH4.getType();
                } else {
                    if (i79 == 27 || i79 == 49) {
                        i26 = i26;
                        int i91 = i68 / 3;
                        i29 = i89 + 1;
                        objArr[i91 + i91 + 1] = objArrZze[i89];
                    } else if (i79 == 12 || i79 == 30 || i79 == 44) {
                        i26 = i26;
                        if (zzgrgVar.zzc() == 1 || (iCharAt11 & 2048) != 0) {
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
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzH4);
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
                        fieldZzH = (Field) obj3;
                    } else {
                        fieldZzH = zzH(cls2, (String) obj3);
                        objArrZze[i100] = fieldZzH;
                    }
                    i28 = iCharAt13 % 32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzH);
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
        return new zzgqz(iArr2, objArr, i12, i15, zzgrgVar.zza(), zzgrgVar.zzc(), false, iArr, i13, i65, zzgrbVar, zzgqkVar, zzgsgVar, zzgozVar, zzgqrVar);
    }

    private static double zzn(Object obj, long j10) {
        return ((Double) zzgsq.zzh(obj, j10)).doubleValue();
    }

    private static float zzo(Object obj, long j10) {
        return ((Float) zzgsq.zzh(obj, j10)).floatValue();
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
    private final int zzp(Object obj) {
        int i10;
        int iZzA;
        int iZzz;
        Object object;
        int i11;
        int iZzA2;
        int iZzA3;
        int iZzq;
        int iZzg;
        int iZzh;
        int iZzA4;
        Object object2;
        int i12;
        Unsafe unsafe = zzb;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1048575;
        while (i16 < this.zzc.length) {
            int iZzz2 = zzz(i16);
            int[] iArr = this.zzc;
            int i18 = iArr[i16];
            int iZzy = zzy(iZzz2);
            if (iZzy <= 17) {
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
            long j10 = i13 & iZzz2;
            switch (iZzy) {
                case 0:
                    if ((i14 & i10) != 0) {
                        iZzg = zzgot.zzA(i18 << 3) + 8;
                        i15 += iZzg;
                    }
                    break;
                case 1:
                    if ((i14 & i10) != 0) {
                        iZzg = zzgot.zzA(i18 << 3) + 4;
                        i15 += iZzg;
                    }
                    break;
                case 2:
                    if ((i14 & i10) != 0) {
                        int iZzB = zzgot.zzB(unsafe.getLong(obj, j10));
                        iZzA = zzgot.zzA(i18 << 3);
                        iZzz = iZzB;
                        i15 = iZzA + iZzz + i15;
                    }
                    break;
                case 3:
                    if ((i14 & i10) != 0) {
                        int iZzB2 = zzgot.zzB(unsafe.getLong(obj, j10));
                        iZzA = zzgot.zzA(i18 << 3);
                        iZzz = iZzB2;
                        i15 = iZzA + iZzz + i15;
                    }
                    break;
                case 4:
                    if ((i14 & i10) != 0) {
                        i11 = i18 << 3;
                        iZzz = zzgot.zzx(unsafe.getInt(obj, j10));
                        iZzA = zzgot.zzA(i11);
                        i15 = iZzA + iZzz + i15;
                    }
                    break;
                case 5:
                    if ((i14 & i10) != 0) {
                        iZzg = zzgot.zzA(i18 << 3) + 8;
                        i15 += iZzg;
                    }
                    break;
                case 6:
                    if ((i14 & i10) != 0) {
                        iZzg = zzgot.zzA(i18 << 3) + 4;
                        i15 += iZzg;
                    }
                    break;
                case 7:
                    if ((i14 & i10) != 0) {
                        iZzg = zzgot.zzA(i18 << 3) + 1;
                        i15 += iZzg;
                    }
                    break;
                case 8:
                    if ((i14 & i10) != 0) {
                        object = unsafe.getObject(obj, j10);
                        if (!(object instanceof zzgoe)) {
                            i11 = i18 << 3;
                            iZzz = zzgot.zzz((String) object);
                            iZzA = zzgot.zzA(i11);
                            i15 = iZzA + iZzz + i15;
                        }
                        int i22 = zzgot.zzf;
                        int iZzd = ((zzgoe) object).zzd();
                        iZzA2 = iZzd + zzgot.zzA(iZzd);
                        iZzA3 = zzgot.zzA(i18 << 3);
                        iZzg = iZzA2 + iZzA3;
                        i15 += iZzg;
                        break;
                    }
                    break;
                case 9:
                    if ((i14 & i10) != 0) {
                        iZzg = zzgrr.zzn(i18, unsafe.getObject(obj, j10), zzC(i16));
                        i15 += iZzg;
                    }
                    break;
                case 10:
                    if ((i14 & i10) != 0) {
                        object = unsafe.getObject(obj, j10);
                        int i23 = zzgot.zzf;
                        int iZzd2 = ((zzgoe) object).zzd();
                        iZzA2 = iZzd2 + zzgot.zzA(iZzd2);
                        iZzA3 = zzgot.zzA(i18 << 3);
                        iZzg = iZzA2 + iZzA3;
                        i15 += iZzg;
                    }
                    break;
                case 11:
                    if ((i14 & i10) != 0) {
                        i11 = i18 << 3;
                        iZzz = zzgot.zzA(unsafe.getInt(obj, j10));
                        iZzA = zzgot.zzA(i11);
                        i15 = iZzA + iZzz + i15;
                    }
                    break;
                case 12:
                    if ((i14 & i10) != 0) {
                        i11 = i18 << 3;
                        iZzz = zzgot.zzx(unsafe.getInt(obj, j10));
                        iZzA = zzgot.zzA(i11);
                        i15 = iZzA + iZzz + i15;
                    }
                    break;
                case 13:
                    if ((i14 & i10) != 0) {
                        iZzg = zzgot.zzA(i18 << 3) + 4;
                        i15 += iZzg;
                    }
                    break;
                case 14:
                    if ((i14 & i10) != 0) {
                        iZzg = zzgot.zzA(i18 << 3) + 8;
                        i15 += iZzg;
                    }
                    break;
                case 15:
                    if ((i14 & i10) != 0) {
                        iZzq = unsafe.getInt(obj, j10);
                        iZzg = zzgot.zzA((iZzq >> 31) ^ (iZzq + iZzq)) + zzgot.zzA(i18 << 3);
                        i15 += iZzg;
                    }
                    break;
                case 16:
                    if ((i10 & i14) != 0) {
                        long j11 = unsafe.getLong(obj, j10);
                        iZzA2 = zzgot.zzA(i18 << 3);
                        iZzA3 = zzgot.zzB((j11 >> 63) ^ (j11 + j11));
                        iZzg = iZzA2 + iZzA3;
                        i15 += iZzg;
                    }
                    break;
                case 17:
                    if ((i14 & i10) != 0) {
                        iZzg = zzgot.zzw(i18, (zzgqw) unsafe.getObject(obj, j10), zzC(i16));
                        i15 += iZzg;
                    }
                    break;
                case 18:
                case 23:
                case 32:
                    iZzg = zzgrr.zzg(i18, (List) unsafe.getObject(obj, j10), false);
                    i15 += iZzg;
                    break;
                case 19:
                case 24:
                case 31:
                    iZzg = zzgrr.zze(i18, (List) unsafe.getObject(obj, j10), false);
                    i15 += iZzg;
                    break;
                case 20:
                    iZzg = zzgrr.zzl(i18, (List) unsafe.getObject(obj, j10), false);
                    i15 += iZzg;
                    break;
                case 21:
                    iZzg = zzgrr.zzw(i18, (List) unsafe.getObject(obj, j10), false);
                    i15 += iZzg;
                    break;
                case 22:
                    iZzg = zzgrr.zzj(i18, (List) unsafe.getObject(obj, j10), false);
                    i15 += iZzg;
                    break;
                case 25:
                    iZzg = zzgrr.zza(i18, (List) unsafe.getObject(obj, j10), false);
                    i15 += iZzg;
                    break;
                case 26:
                    iZzg = zzgrr.zzt(i18, (List) unsafe.getObject(obj, j10));
                    i15 += iZzg;
                    break;
                case 27:
                    iZzg = zzgrr.zzo(i18, (List) unsafe.getObject(obj, j10), zzC(i16));
                    i15 += iZzg;
                    break;
                case 28:
                    iZzg = zzgrr.zzb(i18, (List) unsafe.getObject(obj, j10));
                    i15 += iZzg;
                    break;
                case 29:
                    iZzg = zzgrr.zzu(i18, (List) unsafe.getObject(obj, j10), false);
                    i15 += iZzg;
                    break;
                case 30:
                    iZzg = zzgrr.zzc(i18, (List) unsafe.getObject(obj, j10), false);
                    i15 += iZzg;
                    break;
                case 33:
                    iZzg = zzgrr.zzp(i18, (List) unsafe.getObject(obj, j10), false);
                    i15 += iZzg;
                    break;
                case 34:
                    iZzg = zzgrr.zzr(i18, (List) unsafe.getObject(obj, j10), false);
                    i15 += iZzg;
                    break;
                case 35:
                    iZzh = zzgrr.zzh((List) unsafe.getObject(obj, j10));
                    if (iZzh > 0) {
                        iZzA4 = zzgot.zzA(i18 << 3) + zzgot.zzA(iZzh);
                        i15 += iZzA4 + iZzh;
                    }
                    break;
                case 36:
                    iZzh = zzgrr.zzf((List) unsafe.getObject(obj, j10));
                    if (iZzh > 0) {
                        iZzA4 = zzgot.zzA(i18 << 3) + zzgot.zzA(iZzh);
                        i15 += iZzA4 + iZzh;
                    }
                    break;
                case 37:
                    iZzh = zzgrr.zzm((List) unsafe.getObject(obj, j10));
                    if (iZzh > 0) {
                        iZzA4 = zzgot.zzA(i18 << 3) + zzgot.zzA(iZzh);
                        i15 += iZzA4 + iZzh;
                    }
                    break;
                case 38:
                    iZzh = zzgrr.zzx((List) unsafe.getObject(obj, j10));
                    if (iZzh > 0) {
                        iZzA4 = zzgot.zzA(i18 << 3) + zzgot.zzA(iZzh);
                        i15 += iZzA4 + iZzh;
                    }
                    break;
                case 39:
                    iZzh = zzgrr.zzk((List) unsafe.getObject(obj, j10));
                    if (iZzh > 0) {
                        iZzA4 = zzgot.zzA(i18 << 3) + zzgot.zzA(iZzh);
                        i15 += iZzA4 + iZzh;
                    }
                    break;
                case 40:
                    iZzh = zzgrr.zzh((List) unsafe.getObject(obj, j10));
                    if (iZzh > 0) {
                        iZzA4 = zzgot.zzA(i18 << 3) + zzgot.zzA(iZzh);
                        i15 += iZzA4 + iZzh;
                    }
                    break;
                case 41:
                    iZzh = zzgrr.zzf((List) unsafe.getObject(obj, j10));
                    if (iZzh > 0) {
                        iZzA4 = zzgot.zzA(i18 << 3) + zzgot.zzA(iZzh);
                        i15 += iZzA4 + iZzh;
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(obj, j10);
                    int i24 = zzgrr.zza;
                    iZzh = list.size();
                    if (iZzh > 0) {
                        iZzA4 = zzgot.zzA(i18 << 3) + zzgot.zzA(iZzh);
                        i15 += iZzA4 + iZzh;
                    }
                    break;
                case 43:
                    iZzh = zzgrr.zzv((List) unsafe.getObject(obj, j10));
                    if (iZzh > 0) {
                        iZzA4 = zzgot.zzA(i18 << 3) + zzgot.zzA(iZzh);
                        i15 += iZzA4 + iZzh;
                    }
                    break;
                case 44:
                    iZzh = zzgrr.zzd((List) unsafe.getObject(obj, j10));
                    if (iZzh > 0) {
                        iZzA4 = zzgot.zzA(i18 << 3) + zzgot.zzA(iZzh);
                        i15 += iZzA4 + iZzh;
                    }
                    break;
                case 45:
                    iZzh = zzgrr.zzf((List) unsafe.getObject(obj, j10));
                    if (iZzh > 0) {
                        iZzA4 = zzgot.zzA(i18 << 3) + zzgot.zzA(iZzh);
                        i15 += iZzA4 + iZzh;
                    }
                    break;
                case 46:
                    iZzh = zzgrr.zzh((List) unsafe.getObject(obj, j10));
                    if (iZzh > 0) {
                        iZzA4 = zzgot.zzA(i18 << 3) + zzgot.zzA(iZzh);
                        i15 += iZzA4 + iZzh;
                    }
                    break;
                case 47:
                    iZzh = zzgrr.zzq((List) unsafe.getObject(obj, j10));
                    if (iZzh > 0) {
                        iZzA4 = zzgot.zzA(i18 << 3) + zzgot.zzA(iZzh);
                        i15 += iZzA4 + iZzh;
                    }
                    break;
                case 48:
                    iZzh = zzgrr.zzs((List) unsafe.getObject(obj, j10));
                    if (iZzh > 0) {
                        iZzA4 = zzgot.zzA(i18 << 3) + zzgot.zzA(iZzh);
                        i15 += iZzA4 + iZzh;
                    }
                    break;
                case 49:
                    iZzg = zzgrr.zzi(i18, (List) unsafe.getObject(obj, j10), zzC(i16));
                    i15 += iZzg;
                    break;
                case 50:
                    zzgqr.zza(i18, unsafe.getObject(obj, j10), zzE(i16));
                    break;
                case 51:
                    if (zzW(obj, i18, i16)) {
                        iZzg = zzgot.zzA(i18 << 3) + 8;
                        i15 += iZzg;
                    }
                    break;
                case 52:
                    if (zzW(obj, i18, i16)) {
                        iZzg = zzgot.zzA(i18 << 3) + 4;
                        i15 += iZzg;
                    }
                    break;
                case 53:
                    if (zzW(obj, i18, i16)) {
                        int iZzB3 = zzgot.zzB(zzA(obj, j10));
                        iZzA4 = zzgot.zzA(i18 << 3);
                        iZzh = iZzB3;
                        i15 += iZzA4 + iZzh;
                    }
                    break;
                case 54:
                    if (zzW(obj, i18, i16)) {
                        int iZzB4 = zzgot.zzB(zzA(obj, j10));
                        iZzA4 = zzgot.zzA(i18 << 3);
                        iZzh = iZzB4;
                        i15 += iZzA4 + iZzh;
                    }
                    break;
                case 55:
                    if (zzW(obj, i18, i16)) {
                        i12 = i18 << 3;
                        iZzh = zzgot.zzx(zzq(obj, j10));
                        iZzA4 = zzgot.zzA(i12);
                        i15 += iZzA4 + iZzh;
                    }
                    break;
                case 56:
                    if (zzW(obj, i18, i16)) {
                        iZzg = zzgot.zzA(i18 << 3) + 8;
                        i15 += iZzg;
                    }
                    break;
                case 57:
                    if (zzW(obj, i18, i16)) {
                        iZzg = zzgot.zzA(i18 << 3) + 4;
                        i15 += iZzg;
                    }
                    break;
                case 58:
                    if (zzW(obj, i18, i16)) {
                        iZzg = zzgot.zzA(i18 << 3) + 1;
                        i15 += iZzg;
                    }
                    break;
                case 59:
                    if (zzW(obj, i18, i16)) {
                        object2 = unsafe.getObject(obj, j10);
                        if (!(object2 instanceof zzgoe)) {
                            i12 = i18 << 3;
                            iZzh = zzgot.zzz((String) object2);
                            iZzA4 = zzgot.zzA(i12);
                            i15 += iZzA4 + iZzh;
                        }
                        int i25 = zzgot.zzf;
                        int iZzd3 = ((zzgoe) object2).zzd();
                        iZzA2 = iZzd3 + zzgot.zzA(iZzd3);
                        iZzA3 = zzgot.zzA(i18 << 3);
                        iZzg = iZzA2 + iZzA3;
                        i15 += iZzg;
                        break;
                    }
                    break;
                case 60:
                    if (zzW(obj, i18, i16)) {
                        iZzg = zzgrr.zzn(i18, unsafe.getObject(obj, j10), zzC(i16));
                        i15 += iZzg;
                    }
                    break;
                case 61:
                    if (zzW(obj, i18, i16)) {
                        object2 = unsafe.getObject(obj, j10);
                        int i26 = zzgot.zzf;
                        int iZzd4 = ((zzgoe) object2).zzd();
                        iZzA2 = iZzd4 + zzgot.zzA(iZzd4);
                        iZzA3 = zzgot.zzA(i18 << 3);
                        iZzg = iZzA2 + iZzA3;
                        i15 += iZzg;
                    }
                    break;
                case 62:
                    if (zzW(obj, i18, i16)) {
                        i12 = i18 << 3;
                        iZzh = zzgot.zzA(zzq(obj, j10));
                        iZzA4 = zzgot.zzA(i12);
                        i15 += iZzA4 + iZzh;
                    }
                    break;
                case 63:
                    if (zzW(obj, i18, i16)) {
                        i12 = i18 << 3;
                        iZzh = zzgot.zzx(zzq(obj, j10));
                        iZzA4 = zzgot.zzA(i12);
                        i15 += iZzA4 + iZzh;
                    }
                    break;
                case 64:
                    if (zzW(obj, i18, i16)) {
                        iZzg = zzgot.zzA(i18 << 3) + 4;
                        i15 += iZzg;
                    }
                    break;
                case 65:
                    if (zzW(obj, i18, i16)) {
                        iZzg = zzgot.zzA(i18 << 3) + 8;
                        i15 += iZzg;
                    }
                    break;
                case 66:
                    if (zzW(obj, i18, i16)) {
                        iZzq = zzq(obj, j10);
                        iZzg = zzgot.zzA((iZzq >> 31) ^ (iZzq + iZzq)) + zzgot.zzA(i18 << 3);
                        i15 += iZzg;
                    }
                    break;
                case 67:
                    if (zzW(obj, i18, i16)) {
                        long jZzA = zzA(obj, j10);
                        iZzA2 = zzgot.zzA(i18 << 3);
                        iZzA3 = zzgot.zzB((jZzA >> 63) ^ (jZzA + jZzA));
                        iZzg = iZzA2 + iZzA3;
                        i15 += iZzg;
                    }
                    break;
                case 68:
                    if (zzW(obj, i18, i16)) {
                        iZzg = zzgot.zzw(i18, (zzgqw) unsafe.getObject(obj, j10), zzC(i16));
                        i15 += iZzg;
                    }
                    break;
            }
            i16 += 3;
            i13 = 1048575;
        }
        zzgsg zzgsgVar = this.zzn;
        int iZza = i15 + zzgsgVar.zza(zzgsgVar.zzd(obj));
        if (!this.zzh) {
            return iZza;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private static int zzq(Object obj, long j10) {
        return ((Integer) zzgsq.zzh(obj, j10)).intValue();
    }

    private final int zzr(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, zzgnq zzgnqVar) throws IOException {
        Unsafe unsafe = zzb;
        Object objZzE = zzE(i12);
        Object object = unsafe.getObject(obj, j10);
        if (zzgqr.zzb(object)) {
            zzgqq zzgqqVarZzb = zzgqq.zza().zzb();
            zzgqr.zzc(zzgqqVarZzb, object);
            unsafe.putObject(obj, j10, zzgqqVarZzb);
        }
        throw null;
    }

    private final int zzs(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, zzgnq zzgnqVar) throws IOException {
        Unsafe unsafe = zzb;
        long j11 = this.zzc[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(zzgnr.zzp(bArr, i10))));
                int i18 = i10 + 8;
                unsafe.putInt(obj, j11, i13);
                return i18;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(zzgnr.zzb(bArr, i10))));
                int i19 = i10 + 4;
                unsafe.putInt(obj, j11, i13);
                return i19;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iZzm = zzgnr.zzm(bArr, i10, zzgnqVar);
                unsafe.putObject(obj, j10, Long.valueOf(zzgnqVar.zzb));
                unsafe.putInt(obj, j11, i13);
                return iZzm;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iZzj = zzgnr.zzj(bArr, i10, zzgnqVar);
                unsafe.putObject(obj, j10, Integer.valueOf(zzgnqVar.zza));
                unsafe.putInt(obj, j11, i13);
                return iZzj;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Long.valueOf(zzgnr.zzp(bArr, i10)));
                int i20 = i10 + 8;
                unsafe.putInt(obj, j11, i13);
                return i20;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(zzgnr.zzb(bArr, i10)));
                int i21 = i10 + 4;
                unsafe.putInt(obj, j11, i13);
                return i21;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iZzm2 = zzgnr.zzm(bArr, i10, zzgnqVar);
                unsafe.putObject(obj, j10, Boolean.valueOf(zzgnqVar.zzb != 0));
                unsafe.putInt(obj, j11, i13);
                return iZzm2;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iZzj2 = zzgnr.zzj(bArr, i10, zzgnqVar);
                int i22 = zzgnqVar.zza;
                if (i22 == 0) {
                    unsafe.putObject(obj, j10, "");
                } else {
                    if ((i15 & 536870912) != 0 && !zzgsv.zzj(bArr, iZzj2, iZzj2 + i22)) {
                        throw zzgpy.zzd();
                    }
                    unsafe.putObject(obj, j10, new String(bArr, iZzj2, i22, zzgpw.zzb));
                    iZzj2 += i22;
                }
                unsafe.putInt(obj, j11, i13);
                return iZzj2;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                Object objZzG = zzG(obj, i13, i17);
                int iZzo = zzgnr.zzo(objZzG, zzC(i17), bArr, i10, i11, zzgnqVar);
                zzP(obj, i13, i17, objZzG);
                return iZzo;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iZza = zzgnr.zza(bArr, i10, zzgnqVar);
                unsafe.putObject(obj, j10, zzgnqVar.zzc);
                unsafe.putInt(obj, j11, i13);
                return iZza;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iZzj3 = zzgnr.zzj(bArr, i10, zzgnqVar);
                int i23 = zzgnqVar.zza;
                zzgpq zzgpqVarZzB = zzB(i17);
                if (zzgpqVarZzB == null || zzgpqVarZzB.zza(i23)) {
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
                int iZzj4 = zzgnr.zzj(bArr, i10, zzgnqVar);
                unsafe.putObject(obj, j10, Integer.valueOf(zzgom.zzF(zzgnqVar.zza)));
                unsafe.putInt(obj, j11, i13);
                return iZzj4;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iZzm3 = zzgnr.zzm(bArr, i10, zzgnqVar);
                unsafe.putObject(obj, j10, Long.valueOf(zzgom.zzG(zzgnqVar.zzb)));
                unsafe.putInt(obj, j11, i13);
                return iZzm3;
            case 68:
                if (i14 != 3) {
                    return i10;
                }
                Object objZzG2 = zzG(obj, i13, i17);
                int iZzn = zzgnr.zzn(objZzG2, zzC(i17), bArr, i10, i11, (i12 & (-8)) | 4, zzgnqVar);
                zzP(obj, i13, i17, objZzG2);
                return iZzn;
            default:
                return i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0252 A[LOOP:9: B:146:0x0253->B:145:0x0252, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:148:0x0258  */
    /* JADX WARN: Code duplicated, block: B:151:0x0261  */
    /* JADX WARN: Code duplicated, block: B:286:0x026c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x01f3 -> B:105:0x01ca). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:152:0x0269 -> B:144:0x0250). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0142 -> B:57:0x011d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01ab -> B:87:0x018a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final int zzt(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.ads.zzgnq r29) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgqz.zzt(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.zzgnq):int");
    }

    private final int zzu(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzx(i10, 0);
    }

    private final int zzv(int i10, int i11) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzx(i10, i11);
    }

    private final int zzw(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzx(int i10, int i11) {
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

    private static int zzy(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzz(int i10) {
        return this.zzc[i10 + 1];
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
    
        if ((r4 instanceof com.google.android.gms.internal.ads.zzgoe) != false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x032b, code lost:
    
        r5 = r6 << 3;
        r4 = com.google.android.gms.internal.ads.zzgot.zzz((java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009f, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.ads.zzgoe) != false) goto L163;
     */
    @Override // com.google.android.gms.internal.ads.zzgrp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 1096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgqz.zza(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e3 A[PHI: r3
  0x00e3: PHI (r3v12 java.lang.Object) = (r3v10 java.lang.Object), (r3v13 java.lang.Object) binds: [B:67:0x00e1, B:62:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x00eb  */
    @Override // com.google.android.gms.internal.ads.zzgrp
    public final int zzb(Object obj) {
        int i10;
        double dZzb;
        int i11;
        float fZzc;
        long jZzf;
        int iZzd;
        boolean zZzz;
        int iHashCode;
        Object objZzh;
        Object objZzh2;
        int length = this.zzc.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iZzz = zzz(i13);
            int i14 = this.zzc[i13];
            long j10 = 1048575 & iZzz;
            int iHashCode2 = 37;
            switch (zzy(iZzz)) {
                case 0:
                    i10 = i12 * 53;
                    dZzb = zzgsq.zzb(obj, j10);
                    jZzf = Double.doubleToLongBits(dZzb);
                    byte[] bArr = zzgpw.zzd;
                    iZzd = (int) (jZzf ^ (jZzf >>> 32));
                    i12 = i10 + iZzd;
                    break;
                case 1:
                    i11 = i12 * 53;
                    fZzc = zzgsq.zzc(obj, j10);
                    iHashCode = Float.floatToIntBits(fZzc);
                    i12 = iHashCode + i11;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i10 = i12 * 53;
                    jZzf = zzgsq.zzf(obj, j10);
                    byte[] bArr2 = zzgpw.zzd;
                    iZzd = (int) (jZzf ^ (jZzf >>> 32));
                    i12 = i10 + iZzd;
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i10 = i12 * 53;
                    iZzd = zzgsq.zzd(obj, j10);
                    i12 = i10 + iZzd;
                    break;
                case 7:
                    i11 = i12 * 53;
                    zZzz = zzgsq.zzz(obj, j10);
                    iHashCode = zzgpw.zza(zZzz);
                    i12 = iHashCode + i11;
                    break;
                case 8:
                    i11 = i12 * 53;
                    iHashCode = ((String) zzgsq.zzh(obj, j10)).hashCode();
                    i12 = iHashCode + i11;
                    break;
                case 9:
                    objZzh = zzgsq.zzh(obj, j10);
                    if (objZzh != null) {
                        iHashCode2 = objZzh.hashCode();
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
                    objZzh2 = zzgsq.zzh(obj, j10);
                    iHashCode = objZzh2.hashCode();
                    i12 = iHashCode + i11;
                    break;
                case 17:
                    objZzh = zzgsq.zzh(obj, j10);
                    if (objZzh != null) {
                        iHashCode2 = objZzh.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode2;
                    break;
                case 51:
                    if (zzW(obj, i14, i13)) {
                        i10 = i12 * 53;
                        dZzb = zzn(obj, j10);
                        jZzf = Double.doubleToLongBits(dZzb);
                        byte[] bArr3 = zzgpw.zzd;
                        iZzd = (int) (jZzf ^ (jZzf >>> 32));
                        i12 = i10 + iZzd;
                    }
                    break;
                case 52:
                    if (zzW(obj, i14, i13)) {
                        i11 = i12 * 53;
                        fZzc = zzo(obj, j10);
                        iHashCode = Float.floatToIntBits(fZzc);
                        i12 = iHashCode + i11;
                    }
                    break;
                case 53:
                    if (zzW(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jZzf = zzA(obj, j10);
                        byte[] bArr4 = zzgpw.zzd;
                        iZzd = (int) (jZzf ^ (jZzf >>> 32));
                        i12 = i10 + iZzd;
                    }
                    break;
                case 54:
                    if (zzW(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jZzf = zzA(obj, j10);
                        byte[] bArr5 = zzgpw.zzd;
                        iZzd = (int) (jZzf ^ (jZzf >>> 32));
                        i12 = i10 + iZzd;
                    }
                    break;
                case 55:
                    if (zzW(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzd = zzq(obj, j10);
                        i12 = i10 + iZzd;
                    }
                    break;
                case 56:
                    if (zzW(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jZzf = zzA(obj, j10);
                        byte[] bArr6 = zzgpw.zzd;
                        iZzd = (int) (jZzf ^ (jZzf >>> 32));
                        i12 = i10 + iZzd;
                    }
                    break;
                case 57:
                    if (zzW(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzd = zzq(obj, j10);
                        i12 = i10 + iZzd;
                    }
                    break;
                case 58:
                    if (zzW(obj, i14, i13)) {
                        i11 = i12 * 53;
                        zZzz = zzX(obj, j10);
                        iHashCode = zzgpw.zza(zZzz);
                        i12 = iHashCode + i11;
                    }
                    break;
                case 59:
                    if (zzW(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iHashCode = ((String) zzgsq.zzh(obj, j10)).hashCode();
                        i12 = iHashCode + i11;
                    }
                    break;
                case 60:
                    if (zzW(obj, i14, i13)) {
                        objZzh2 = zzgsq.zzh(obj, j10);
                        i11 = i12 * 53;
                        iHashCode = objZzh2.hashCode();
                        i12 = iHashCode + i11;
                    }
                    break;
                case 61:
                    if (zzW(obj, i14, i13)) {
                        i11 = i12 * 53;
                        objZzh2 = zzgsq.zzh(obj, j10);
                        iHashCode = objZzh2.hashCode();
                        i12 = iHashCode + i11;
                    }
                    break;
                case 62:
                    if (zzW(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzd = zzq(obj, j10);
                        i12 = i10 + iZzd;
                    }
                    break;
                case 63:
                    if (zzW(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzd = zzq(obj, j10);
                        i12 = i10 + iZzd;
                    }
                    break;
                case 64:
                    if (zzW(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzd = zzq(obj, j10);
                        i12 = i10 + iZzd;
                    }
                    break;
                case 65:
                    if (zzW(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jZzf = zzA(obj, j10);
                        byte[] bArr7 = zzgpw.zzd;
                        iZzd = (int) (jZzf ^ (jZzf >>> 32));
                        i12 = i10 + iZzd;
                    }
                    break;
                case 66:
                    if (zzW(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzd = zzq(obj, j10);
                        i12 = i10 + iZzd;
                    }
                    break;
                case 67:
                    if (zzW(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jZzf = zzA(obj, j10);
                        byte[] bArr8 = zzgpw.zzd;
                        iZzd = (int) (jZzf ^ (jZzf >>> 32));
                        i12 = i10 + iZzd;
                    }
                    break;
                case 68:
                    if (zzW(obj, i14, i13)) {
                        objZzh2 = zzgsq.zzh(obj, j10);
                        i11 = i12 * 53;
                        iHashCode = objZzh2.hashCode();
                        i12 = iHashCode + i11;
                    }
                    break;
            }
        }
        int iHashCode3 = this.zzn.zzd(obj).hashCode() + (i12 * 53);
        if (!this.zzh) {
            return iHashCode3;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x030a A[PHI: r0 r18 r21 r26 r30
  0x030a: PHI (r0v88 int) = (r0v82 int), (r0v85 int), (r0v90 int) binds: [B:121:0x0380, B:117:0x035a, B:108:0x0308] A[DONT_GENERATE, DONT_INLINE]
  0x030a: PHI (r18v5 int) = (r18v3 int), (r18v3 int), (r18v6 int) binds: [B:121:0x0380, B:117:0x035a, B:108:0x0308] A[DONT_GENERATE, DONT_INLINE]
  0x030a: PHI (r21v10 int) = (r21v8 int), (r21v8 int), (r21v12 int) binds: [B:121:0x0380, B:117:0x035a, B:108:0x0308] A[DONT_GENERATE, DONT_INLINE]
  0x030a: PHI (r26v8 sun.misc.Unsafe) = (r26v6 sun.misc.Unsafe), (r26v6 sun.misc.Unsafe), (r26v9 sun.misc.Unsafe) binds: [B:121:0x0380, B:117:0x035a, B:108:0x0308] A[DONT_GENERATE, DONT_INLINE]
  0x030a: PHI (r30v6 int) = (r30v4 int), (r30v4 int), (r30v7 int) binds: [B:121:0x0380, B:117:0x035a, B:108:0x0308] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x0326 A[PHI: r0 r18 r21 r26 r30
  0x0326: PHI (r0v86 int) = (r0v82 int), (r0v85 int), (r0v90 int) binds: [B:121:0x0380, B:117:0x035a, B:108:0x0308] A[DONT_GENERATE, DONT_INLINE]
  0x0326: PHI (r18v4 int) = (r18v3 int), (r18v3 int), (r18v6 int) binds: [B:121:0x0380, B:117:0x035a, B:108:0x0308] A[DONT_GENERATE, DONT_INLINE]
  0x0326: PHI (r21v9 int) = (r21v8 int), (r21v8 int), (r21v12 int) binds: [B:121:0x0380, B:117:0x035a, B:108:0x0308] A[DONT_GENERATE, DONT_INLINE]
  0x0326: PHI (r26v7 sun.misc.Unsafe) = (r26v6 sun.misc.Unsafe), (r26v6 sun.misc.Unsafe), (r26v9 sun.misc.Unsafe) binds: [B:121:0x0380, B:117:0x035a, B:108:0x0308] A[DONT_GENERATE, DONT_INLINE]
  0x0326: PHI (r30v5 int) = (r30v4 int), (r30v4 int), (r30v7 int) binds: [B:121:0x0380, B:117:0x035a, B:108:0x0308] A[DONT_GENERATE, DONT_INLINE]] */
    public final int zzc(Object obj, byte[] bArr, int i10, int i11, int i12, zzgnq zzgnqVar) throws IOException {
        Unsafe unsafe;
        int i13;
        Object obj2;
        zzgqz<T> zzgqzVar;
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
        zzgnq zzgnqVar2;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int iZzF;
        int i33;
        int i34;
        int i35;
        zzgqz<T> zzgqzVar2 = this;
        Object obj3 = obj;
        bArr = bArr;
        i11 = i11;
        int i36 = i12;
        zzgnq zzgnqVar3 = zzgnqVar;
        zzI(obj);
        Unsafe unsafe2 = zzb;
        int i37 = -1;
        int iZzi = i10;
        int i38 = -1;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = 1048575;
        while (true) {
            if (iZzi < i11) {
                int i43 = iZzi + 1;
                byte b10 = bArr[iZzi];
                if (b10 < 0) {
                    int iZzk = zzgnr.zzk(b10, bArr, i43, zzgnqVar3);
                    i18 = zzgnqVar3.zza;
                    i43 = iZzk;
                } else {
                    i18 = b10;
                }
                int i44 = i18 >>> 3;
                int iZzv = i44 > i38 ? zzgqzVar2.zzv(i44, i39 / 3) : zzgqzVar2.zzu(i44);
                if (iZzv == i37) {
                    i19 = i44;
                    i20 = i43;
                    i15 = i18;
                    i21 = i41;
                    i22 = i37;
                    unsafe = unsafe2;
                    i23 = i36;
                    i24 = 0;
                } else {
                    int i45 = i18 & 7;
                    int[] iArr = zzgqzVar2.zzc;
                    int i46 = iArr[iZzv + 1];
                    int iZzy = zzy(i46);
                    int i47 = i43;
                    int i48 = i18;
                    long j10 = i46 & 1048575;
                    if (iZzy <= 17) {
                        int i49 = iArr[iZzv + 2];
                        int i50 = 1 << (i49 >>> 20);
                        int i51 = i49 & 1048575;
                        if (i51 != i42) {
                            if (i42 != 1048575) {
                                unsafe2.putInt(obj3, i42, i41);
                            }
                            i42 = i51;
                            i25 = unsafe2.getInt(obj3, i51);
                        } else {
                            i25 = i41;
                            i42 = i42;
                        }
                        switch (iZzy) {
                            case 0:
                                i26 = iZzv;
                                i27 = i44;
                                i28 = i47;
                                if (i45 == 1) {
                                    zzgsq.zzr(obj3, j10, Double.longBitsToDouble(zzgnr.zzp(bArr, i28)));
                                    iZzi = i28 + 8;
                                    i41 = i25 | i50;
                                    i39 = i26;
                                    i38 = i27;
                                    i40 = i48;
                                    i37 = -1;
                                    i36 = i12;
                                } else {
                                    i33 = i26;
                                    i23 = i12;
                                    i21 = i25;
                                    unsafe = unsafe2;
                                    i19 = i27;
                                    i24 = i33;
                                    i20 = i28;
                                    i15 = i48;
                                    i42 = i42;
                                    i22 = -1;
                                }
                                break;
                            case 1:
                                i26 = iZzv;
                                i27 = i44;
                                i28 = i47;
                                if (i45 == 5) {
                                    zzgsq.zzs(obj3, j10, Float.intBitsToFloat(zzgnr.zzb(bArr, i28)));
                                    iZzi = i28 + 4;
                                    i41 = i25 | i50;
                                    i39 = i26;
                                    i38 = i27;
                                    i40 = i48;
                                    i37 = -1;
                                    i36 = i12;
                                } else {
                                    i33 = i26;
                                    i23 = i12;
                                    i21 = i25;
                                    unsafe = unsafe2;
                                    i19 = i27;
                                    i24 = i33;
                                    i20 = i28;
                                    i15 = i48;
                                    i42 = i42;
                                    i22 = -1;
                                }
                                break;
                            case 2:
                            case 3:
                                i26 = iZzv;
                                i27 = i44;
                                i28 = i47;
                                if (i45 == 0) {
                                    int iZzm = zzgnr.zzm(bArr, i28, zzgnqVar3);
                                    unsafe2.putLong(obj, j10, zzgnqVar3.zzb);
                                    i41 = i25 | i50;
                                    i39 = i26;
                                    i38 = i27;
                                    iZzi = iZzm;
                                    i40 = i48;
                                    i37 = -1;
                                    i36 = i12;
                                } else {
                                    i33 = i26;
                                    i23 = i12;
                                    i21 = i25;
                                    unsafe = unsafe2;
                                    i19 = i27;
                                    i24 = i33;
                                    i20 = i28;
                                    i15 = i48;
                                    i42 = i42;
                                    i22 = -1;
                                }
                                break;
                            case 4:
                            case 11:
                                i26 = iZzv;
                                i27 = i44;
                                i28 = i47;
                                if (i45 == 0) {
                                    iZzi = zzgnr.zzj(bArr, i28, zzgnqVar3);
                                    unsafe2.putInt(obj3, j10, zzgnqVar3.zza);
                                    i41 = i25 | i50;
                                    i39 = i26;
                                    i38 = i27;
                                    i40 = i48;
                                    i37 = -1;
                                    i36 = i12;
                                } else {
                                    i33 = i26;
                                    i23 = i12;
                                    i21 = i25;
                                    unsafe = unsafe2;
                                    i19 = i27;
                                    i24 = i33;
                                    i20 = i28;
                                    i15 = i48;
                                    i42 = i42;
                                    i22 = -1;
                                }
                                break;
                            case 5:
                            case 14:
                                i26 = iZzv;
                                i27 = i44;
                                i29 = i47;
                                if (i45 == 1) {
                                    i28 = i29;
                                    unsafe2.putLong(obj, j10, zzgnr.zzp(bArr, i29));
                                    iZzi = i28 + 8;
                                    i41 = i25 | i50;
                                    i39 = i26;
                                    i38 = i27;
                                    i40 = i48;
                                    i37 = -1;
                                    i36 = i12;
                                } else {
                                    i28 = i29;
                                    i33 = i26;
                                    i23 = i12;
                                    i21 = i25;
                                    unsafe = unsafe2;
                                    i19 = i27;
                                    i24 = i33;
                                    i20 = i28;
                                    i15 = i48;
                                    i42 = i42;
                                    i22 = -1;
                                }
                                break;
                            case 6:
                            case 13:
                                i26 = iZzv;
                                i27 = i44;
                                i29 = i47;
                                if (i45 == 5) {
                                    unsafe2.putInt(obj3, j10, zzgnr.zzb(bArr, i29));
                                    iZzi = i29 + 4;
                                    i41 = i25 | i50;
                                    i39 = i26;
                                    i38 = i27;
                                    i40 = i48;
                                    i37 = -1;
                                    i36 = i12;
                                } else {
                                    i28 = i29;
                                    i33 = i26;
                                    i23 = i12;
                                    i21 = i25;
                                    unsafe = unsafe2;
                                    i19 = i27;
                                    i24 = i33;
                                    i20 = i28;
                                    i15 = i48;
                                    i42 = i42;
                                    i22 = -1;
                                }
                                break;
                            case 7:
                                i26 = iZzv;
                                i27 = i44;
                                i29 = i47;
                                if (i45 == 0) {
                                    iZzi = zzgnr.zzm(bArr, i29, zzgnqVar3);
                                    zzgsq.zzp(obj3, j10, zzgnqVar3.zzb != 0);
                                    i41 = i25 | i50;
                                    i39 = i26;
                                    i38 = i27;
                                    i40 = i48;
                                    i37 = -1;
                                    i36 = i12;
                                } else {
                                    i28 = i29;
                                    i33 = i26;
                                    i23 = i12;
                                    i21 = i25;
                                    unsafe = unsafe2;
                                    i19 = i27;
                                    i24 = i33;
                                    i20 = i28;
                                    i15 = i48;
                                    i42 = i42;
                                    i22 = -1;
                                }
                                break;
                            case 8:
                                i26 = iZzv;
                                i27 = i44;
                                i29 = i47;
                                if (i45 == 2) {
                                    iZzi = (i46 & 536870912) == 0 ? zzgnr.zzg(bArr, i29, zzgnqVar3) : zzgnr.zzh(bArr, i29, zzgnqVar3);
                                    unsafe2.putObject(obj3, j10, zzgnqVar3.zzc);
                                    i41 = i25 | i50;
                                    i39 = i26;
                                    i38 = i27;
                                    i40 = i48;
                                    i37 = -1;
                                    i36 = i12;
                                } else {
                                    i28 = i29;
                                    i33 = i26;
                                    i23 = i12;
                                    i21 = i25;
                                    unsafe = unsafe2;
                                    i19 = i27;
                                    i24 = i33;
                                    i20 = i28;
                                    i15 = i48;
                                    i42 = i42;
                                    i22 = -1;
                                }
                                break;
                            case 9:
                                i26 = iZzv;
                                i27 = i44;
                                i29 = i47;
                                if (i45 == 2) {
                                    Object objZzF = zzgqzVar2.zzF(obj3, i26);
                                    i48 = i48;
                                    iZzi = zzgnr.zzo(objZzF, zzgqzVar2.zzC(i26), bArr, i29, i11, zzgnqVar);
                                    zzgqzVar2.zzO(obj3, i26, objZzF);
                                    i41 = i25 | i50;
                                    i39 = i26;
                                    i38 = i27;
                                    i40 = i48;
                                    i37 = -1;
                                    i36 = i12;
                                } else {
                                    i48 = i48;
                                    i28 = i29;
                                    i33 = i26;
                                    i23 = i12;
                                    i21 = i25;
                                    unsafe = unsafe2;
                                    i19 = i27;
                                    i24 = i33;
                                    i20 = i28;
                                    i15 = i48;
                                    i42 = i42;
                                    i22 = -1;
                                }
                                break;
                            case 10:
                                i30 = iZzv;
                                i27 = i44;
                                i31 = i48;
                                i32 = i47;
                                if (i45 == 2) {
                                    iZzi = zzgnr.zza(bArr, i32, zzgnqVar3);
                                    unsafe2.putObject(obj3, j10, zzgnqVar3.zzc);
                                    i41 = i25 | i50;
                                    i39 = i30;
                                    i38 = i27;
                                    i40 = i31;
                                    i37 = -1;
                                    i36 = i12;
                                } else {
                                    i33 = i30;
                                    i48 = i31;
                                    i28 = i32;
                                    i23 = i12;
                                    i21 = i25;
                                    unsafe = unsafe2;
                                    i19 = i27;
                                    i24 = i33;
                                    i20 = i28;
                                    i15 = i48;
                                    i42 = i42;
                                    i22 = -1;
                                }
                                break;
                            case 12:
                                i30 = iZzv;
                                i27 = i44;
                                i31 = i48;
                                i32 = i47;
                                if (i45 == 0) {
                                    iZzi = zzgnr.zzj(bArr, i32, zzgnqVar3);
                                    iZzF = zzgnqVar3.zza;
                                    zzgpq zzgpqVarZzB = zzgqzVar2.zzB(i30);
                                    if (zzgpqVarZzB == null || zzgpqVarZzB.zza(iZzF)) {
                                        unsafe2.putInt(obj3, j10, iZzF);
                                        i41 = i25 | i50;
                                        i39 = i30;
                                    } else {
                                        zzd(obj).zzj(i31, Long.valueOf(iZzF));
                                        i39 = i30;
                                        i41 = i25;
                                    }
                                    i38 = i27;
                                    i40 = i31;
                                    i37 = -1;
                                    i36 = i12;
                                } else {
                                    i33 = i30;
                                    i48 = i31;
                                    i28 = i32;
                                    i23 = i12;
                                    i21 = i25;
                                    unsafe = unsafe2;
                                    i19 = i27;
                                    i24 = i33;
                                    i20 = i28;
                                    i15 = i48;
                                    i42 = i42;
                                    i22 = -1;
                                }
                                break;
                            case 15:
                                i30 = iZzv;
                                i27 = i44;
                                i31 = i48;
                                i32 = i47;
                                if (i45 == 0) {
                                    iZzi = zzgnr.zzj(bArr, i32, zzgnqVar3);
                                    iZzF = zzgom.zzF(zzgnqVar3.zza);
                                    unsafe2.putInt(obj3, j10, iZzF);
                                    i41 = i25 | i50;
                                    i39 = i30;
                                    i38 = i27;
                                    i40 = i31;
                                    i37 = -1;
                                    i36 = i12;
                                } else {
                                    i33 = i30;
                                    i48 = i31;
                                    i28 = i32;
                                    i23 = i12;
                                    i21 = i25;
                                    unsafe = unsafe2;
                                    i19 = i27;
                                    i24 = i33;
                                    i20 = i28;
                                    i15 = i48;
                                    i42 = i42;
                                    i22 = -1;
                                }
                                break;
                            case 16:
                                if (i45 == 0) {
                                    int iZzm2 = zzgnr.zzm(bArr, i47, zzgnqVar3);
                                    unsafe2.putLong(obj, j10, zzgom.zzG(zzgnqVar3.zzb));
                                    i41 = i25 | i50;
                                    i39 = iZzv;
                                    i38 = i44;
                                    i40 = i48;
                                    iZzi = iZzm2;
                                    i37 = -1;
                                    i36 = i12;
                                } else {
                                    i27 = i44;
                                    i33 = iZzv;
                                    i28 = i47;
                                    i23 = i12;
                                    i21 = i25;
                                    unsafe = unsafe2;
                                    i19 = i27;
                                    i24 = i33;
                                    i20 = i28;
                                    i15 = i48;
                                    i42 = i42;
                                    i22 = -1;
                                }
                                break;
                            default:
                                i26 = iZzv;
                                i27 = i44;
                                i28 = i47;
                                if (i45 == 3) {
                                    Object objZzF2 = zzgqzVar2.zzF(obj3, i26);
                                    iZzi = zzgnr.zzn(objZzF2, zzgqzVar2.zzC(i26), bArr, i28, i11, (i27 << 3) | 4, zzgnqVar);
                                    zzgqzVar2.zzO(obj3, i26, objZzF2);
                                    i41 = i25 | i50;
                                    i38 = i27;
                                    i39 = i26;
                                    i40 = i48;
                                    i37 = -1;
                                    bArr = bArr;
                                    i36 = i12;
                                } else {
                                    i33 = i26;
                                    i23 = i12;
                                    i21 = i25;
                                    unsafe = unsafe2;
                                    i19 = i27;
                                    i24 = i33;
                                    i20 = i28;
                                    i15 = i48;
                                    i42 = i42;
                                    i22 = -1;
                                }
                                break;
                        }
                    } else {
                        if (iZzy != 27) {
                            i21 = i41;
                            i34 = i42;
                            if (iZzy <= 49) {
                                i19 = i44;
                                i22 = -1;
                                unsafe = unsafe2;
                                i24 = iZzv;
                                iZzi = zzt(obj, bArr, i47, i11, i48, i44, i45, iZzv, i46, iZzy, j10, zzgnqVar);
                                if (iZzi != i47) {
                                    zzgqzVar2 = this;
                                    obj3 = obj;
                                    i38 = i19;
                                    i36 = i12;
                                    zzgnqVar3 = zzgnqVar;
                                    i37 = i22;
                                    i41 = i21;
                                    i40 = i48;
                                    i39 = i24;
                                    i42 = i34;
                                } else {
                                    i20 = iZzi;
                                    i15 = i48;
                                    i42 = i34;
                                    i23 = i12;
                                }
                                unsafe2 = unsafe;
                            } else {
                                i19 = i44;
                                unsafe = unsafe2;
                                i24 = iZzv;
                                i35 = i47;
                                i22 = -1;
                                if (iZzy != 50) {
                                    iZzi = zzs(obj, bArr, i35, i11, i48, i19, i45, i46, iZzy, j10, i24, zzgnqVar);
                                    if (iZzi != i35) {
                                        zzgqzVar2 = this;
                                        obj3 = obj;
                                        i38 = i19;
                                        i36 = i12;
                                        zzgnqVar3 = zzgnqVar;
                                        i37 = i22;
                                        i41 = i21;
                                        i40 = i48;
                                        i39 = i24;
                                        i42 = i34;
                                    } else {
                                        i20 = iZzi;
                                        i15 = i48;
                                        i42 = i34;
                                        i23 = i12;
                                    }
                                    unsafe2 = unsafe;
                                } else if (i45 == 2) {
                                    iZzi = zzr(obj, bArr, i35, i11, i24, j10, zzgnqVar);
                                    if (iZzi != i35) {
                                        zzgqzVar2 = this;
                                        obj3 = obj;
                                        i38 = i19;
                                        i36 = i12;
                                        zzgnqVar3 = zzgnqVar;
                                        i37 = i22;
                                        i41 = i21;
                                        i40 = i48;
                                        i39 = i24;
                                        i42 = i34;
                                    } else {
                                        i20 = iZzi;
                                        i15 = i48;
                                        i42 = i34;
                                        i23 = i12;
                                    }
                                    unsafe2 = unsafe;
                                }
                            }
                        } else if (i45 == 2) {
                            zzgpv zzgpvVarZzd = (zzgpv) unsafe2.getObject(obj3, j10);
                            if (!zzgpvVarZzd.zzc()) {
                                int size = zzgpvVarZzd.size();
                                zzgpvVarZzd = zzgpvVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj3, j10, zzgpvVarZzd);
                            }
                            iZzi = zzgnr.zze(zzgqzVar2.zzC(iZzv), i48, bArr, i47, i11, zzgpvVarZzd, zzgnqVar);
                            i11 = i11;
                            i36 = i12;
                            i38 = i44;
                            i39 = iZzv;
                            i41 = i41;
                            i40 = i48;
                            i42 = i42;
                            i37 = -1;
                            bArr = bArr;
                        } else {
                            i21 = i41;
                            i34 = i42;
                            i19 = i44;
                            unsafe = unsafe2;
                            i24 = iZzv;
                            i35 = i47;
                            i22 = -1;
                        }
                        i23 = i12;
                        i20 = i35;
                        i15 = i48;
                        i42 = i34;
                    }
                }
                if (i15 != i23 || i23 == 0) {
                    int i52 = i23;
                    if (this.zzh) {
                        zzgnqVar2 = zzgnqVar;
                        zzgoy zzgoyVar = zzgnqVar2.zzd;
                        if (zzgoyVar != zzgoy.zza) {
                            i19 = i19;
                            if (zzgoyVar.zzc(this.zzg, i19) != null) {
                                throw null;
                            }
                            iZzi = zzgnr.zzi(i15, bArr, i20, i11, zzd(obj), zzgnqVar);
                            obj = obj;
                        }
                        i40 = i15;
                        zzgqzVar2 = this;
                        i38 = i19;
                        obj3 = obj;
                        i37 = i22;
                        i41 = i21;
                        i39 = i24;
                        i36 = i52;
                        zzgnqVar3 = zzgnqVar2;
                        unsafe2 = unsafe;
                    } else {
                        zzgnqVar2 = zzgnqVar;
                    }
                    iZzi = zzgnr.zzi(i15, bArr, i20, i11, zzd(obj), zzgnqVar);
                    i40 = i15;
                    zzgqzVar2 = this;
                    i38 = i19;
                    obj3 = obj;
                    i37 = i22;
                    i41 = i21;
                    i39 = i24;
                    i36 = i52;
                    zzgnqVar3 = zzgnqVar2;
                    unsafe2 = unsafe;
                } else {
                    zzgqzVar = this;
                    obj2 = obj;
                    i13 = i23;
                    i16 = i42;
                    i41 = i21;
                    i17 = 1048575;
                    i14 = i20;
                }
            } else {
                int i53 = i42;
                unsafe = unsafe2;
                i13 = i36;
                obj2 = obj3;
                zzgqzVar = zzgqzVar2;
                i14 = iZzi;
                i15 = i40;
                i16 = i53;
                i17 = 1048575;
            }
        }
        if (i16 != i17) {
            unsafe.putInt(obj2, i16, i41);
        }
        for (int i54 = zzgqzVar.zzk; i54 < zzgqzVar.zzl; i54++) {
            zzD(obj, zzgqzVar.zzj[i54], null, zzgqzVar.zzn, obj);
        }
        if (i13 == 0) {
            if (i14 != i11) {
                throw zzgpy.zzg();
            }
        } else if (i14 > i11 || i15 != i13) {
            throw zzgpy.zzg();
        }
        return i14;
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    public final Object zze() {
        return ((zzgpm) this.zzg).zzaD();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Switch 'out' block B:27:0x0065 for B:16:0x0038 already processed. Defaulting to fallback option. */
    @Override // com.google.android.gms.internal.ads.zzgrp
    public final void zzf(Object obj) {
        if (zzV(obj)) {
            if (obj instanceof zzgpm) {
                zzgpm zzgpmVar = (zzgpm) obj;
                zzgpmVar.zzaV(Integer.MAX_VALUE);
                zzgpmVar.zza = 0;
                zzgpmVar.zzaT();
            }
            int length = this.zzc.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iZzz = zzz(i10);
                int i11 = 1048575 & iZzz;
                int iZzy = zzy(iZzz);
                long j10 = i11;
                if (iZzy != 9) {
                    if (iZzy != 60 && iZzy != 68) {
                        switch (iZzy) {
                            case 17:
                                if (zzS(obj, i10)) {
                                    zzC(i10).zzf(zzb.getObject(obj, j10));
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
                                this.zzm.zzb(obj, j10);
                                continue;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzgqq) object).zzc();
                                    unsafe.putObject(obj, j10, object);
                                } else {
                                    continue;
                                }
                                break;
                            default:
                                continue;
                        }
                    } else if (zzW(obj, this.zzc[i10], i10)) {
                        zzC(i10).zzf(zzb.getObject(obj, j10));
                    }
                } else if (zzS(obj, i10)) {
                    zzC(i10).zzf(zzb.getObject(obj, j10));
                }
            }
            this.zzn.zzm(obj);
            if (this.zzh) {
                this.zzo.zze(obj);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0034  */
    /* JADX WARN: Code duplicated, block: B:41:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d7  */
    @Override // com.google.android.gms.internal.ads.zzgrp
    public final void zzg(Object obj, Object obj2) {
        zzI(obj);
        Objects.requireNonNull(obj2);
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzz = zzz(i10);
            int i11 = this.zzc[i10];
            long j10 = 1048575 & iZzz;
            switch (zzy(iZzz)) {
                case 0:
                    if (zzS(obj2, i10)) {
                        zzgsq.zzr(obj, j10, zzgsq.zzb(obj2, j10));
                        zzM(obj, i10);
                    }
                    break;
                case 1:
                    if (zzS(obj2, i10)) {
                        zzgsq.zzs(obj, j10, zzgsq.zzc(obj2, j10));
                        zzM(obj, i10);
                    }
                    break;
                case 2:
                    if (zzS(obj2, i10)) {
                        zzgsq.zzu(obj, j10, zzgsq.zzf(obj2, j10));
                        zzM(obj, i10);
                    }
                    break;
                case 3:
                    if (zzS(obj2, i10)) {
                        zzgsq.zzu(obj, j10, zzgsq.zzf(obj2, j10));
                        zzM(obj, i10);
                    }
                    break;
                case 4:
                    if (zzS(obj2, i10)) {
                        zzgsq.zzt(obj, j10, zzgsq.zzd(obj2, j10));
                        zzM(obj, i10);
                    }
                    break;
                case 5:
                    if (zzS(obj2, i10)) {
                        zzgsq.zzu(obj, j10, zzgsq.zzf(obj2, j10));
                        zzM(obj, i10);
                    }
                    break;
                case 6:
                    if (zzS(obj2, i10)) {
                        zzgsq.zzt(obj, j10, zzgsq.zzd(obj2, j10));
                        zzM(obj, i10);
                    }
                    break;
                case 7:
                    if (zzS(obj2, i10)) {
                        zzgsq.zzp(obj, j10, zzgsq.zzz(obj2, j10));
                        zzM(obj, i10);
                    }
                    break;
                case 8:
                    if (zzS(obj2, i10)) {
                        zzgsq.zzv(obj, j10, zzgsq.zzh(obj2, j10));
                        zzM(obj, i10);
                    }
                    break;
                case 9:
                case 17:
                    zzJ(obj, obj2, i10);
                    break;
                case 10:
                    if (zzS(obj2, i10)) {
                        zzgsq.zzv(obj, j10, zzgsq.zzh(obj2, j10));
                        zzM(obj, i10);
                    }
                    break;
                case 11:
                    if (zzS(obj2, i10)) {
                        zzgsq.zzt(obj, j10, zzgsq.zzd(obj2, j10));
                        zzM(obj, i10);
                    }
                    break;
                case 12:
                    if (zzS(obj2, i10)) {
                        zzgsq.zzt(obj, j10, zzgsq.zzd(obj2, j10));
                        zzM(obj, i10);
                    }
                    break;
                case 13:
                    if (zzS(obj2, i10)) {
                        zzgsq.zzt(obj, j10, zzgsq.zzd(obj2, j10));
                        zzM(obj, i10);
                    }
                    break;
                case 14:
                    if (zzS(obj2, i10)) {
                        zzgsq.zzu(obj, j10, zzgsq.zzf(obj2, j10));
                        zzM(obj, i10);
                    }
                    break;
                case 15:
                    if (zzS(obj2, i10)) {
                        zzgsq.zzt(obj, j10, zzgsq.zzd(obj2, j10));
                        zzM(obj, i10);
                    }
                    break;
                case 16:
                    if (zzS(obj2, i10)) {
                        zzgsq.zzu(obj, j10, zzgsq.zzf(obj2, j10));
                        zzM(obj, i10);
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
                    this.zzm.zzc(obj, obj2, j10);
                    break;
                case 50:
                    int i12 = zzgrr.zza;
                    zzgsq.zzv(obj, j10, zzgqr.zzc(zzgsq.zzh(obj, j10), zzgsq.zzh(obj2, j10)));
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
                    if (zzW(obj2, i11, i10)) {
                        zzgsq.zzv(obj, j10, zzgsq.zzh(obj2, j10));
                        zzN(obj, i11, i10);
                    }
                    break;
                case 60:
                case 68:
                    zzK(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzW(obj2, i11, i10)) {
                        zzgsq.zzv(obj, j10, zzgsq.zzh(obj2, j10));
                        zzN(obj, i11, i10);
                    }
                    break;
            }
        }
        zzgrr.zzC(this.zzn, obj, obj2);
        if (this.zzh) {
            this.zzo.zza(obj2);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:187:0x05af A[Catch: all -> 0x05a4, TryCatch #2 {all -> 0x05a4, blocks: (B:171:0x057d, B:185:0x05aa, B:187:0x05af, B:188:0x05b4), top: B:211:0x057d }] */
    /* JADX WARN: Code duplicated, block: B:193:0x05c0 A[LOOP:2: B:191:0x05bc->B:193:0x05c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:195:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:205:0x05e7 A[LOOP:3: B:203:0x05e3->B:205:0x05e7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:207:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:233:0x05ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgrp
    public final void zzh(Object obj, zzgrh zzgrhVar, zzgoy zzgoyVar) throws Throwable {
        Object obj2;
        zzgsg zzgsgVar;
        int i10;
        zzgsg zzgsgVar2;
        Object obj3;
        int i11;
        zzgqw zzgqwVar;
        List listZza;
        List listZza2;
        List listZza3;
        List listZza4;
        List listZza5;
        List listZza6;
        List listZza7;
        List listZza8;
        List listZza9;
        zzgqw zzgqwVar2;
        Object obj4 = obj;
        zzgoy zzgoyVar2 = zzgoyVar;
        Objects.requireNonNull(zzgoyVar);
        zzI(obj);
        zzgsg zzgsgVar3 = this.zzn;
        zzgoz zzgozVar = this.zzo;
        Object objZzD = null;
        zzgpd zzgpdVar = null;
        while (true) {
            try {
                int iZzc = zzgrhVar.zzc();
                int iZzu = zzu(iZzc);
                if (iZzu >= 0) {
                    zzgsgVar = zzgsgVar3;
                    obj4 = obj4;
                    try {
                        int iZzz = zzz(iZzu);
                        try {
                            switch (zzy(iZzz)) {
                                case 0:
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsq.zzr(obj4, iZzz & 1048575, zzgrhVar.zza());
                                    zzM(obj4, iZzu);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 1:
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsq.zzs(obj4, iZzz & 1048575, zzgrhVar.zzb());
                                    zzM(obj4, iZzu);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 2:
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsq.zzu(obj4, iZzz & 1048575, zzgrhVar.zzl());
                                    zzM(obj4, iZzu);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 3:
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsq.zzu(obj4, iZzz & 1048575, zzgrhVar.zzo());
                                    zzM(obj4, iZzu);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 4:
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsq.zzt(obj4, iZzz & 1048575, zzgrhVar.zzg());
                                    zzM(obj4, iZzu);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 5:
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsq.zzu(obj4, iZzz & 1048575, zzgrhVar.zzk());
                                    zzM(obj4, iZzu);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 6:
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsq.zzt(obj4, iZzz & 1048575, zzgrhVar.zzf());
                                    zzM(obj4, iZzu);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 7:
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsq.zzp(obj4, iZzz & 1048575, zzgrhVar.zzN());
                                    zzM(obj4, iZzu);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 8:
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzL(obj4, iZzz, zzgrhVar);
                                    zzM(obj4, iZzu);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 9:
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgqwVar = (zzgqw) zzF(obj4, iZzu);
                                    zzgrhVar.zzu(zzgqwVar, zzC(iZzu), zzgoyVar2);
                                    zzO(obj4, iZzu, zzgqwVar);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 10:
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsq.zzv(obj4, iZzz & 1048575, zzgrhVar.zzp());
                                    zzM(obj4, iZzu);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 11:
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsq.zzt(obj4, iZzz & 1048575, zzgrhVar.zzj());
                                    zzM(obj4, iZzu);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 12:
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    int iZze = zzgrhVar.zze();
                                    zzgpq zzgpqVarZzB = zzB(iZzu);
                                    if (zzgpqVarZzB != null && !zzgpqVarZzB.zza(iZze)) {
                                        objZzD = zzgrr.zzB(obj4, iZzc, iZze, objZzD, zzgsgVar);
                                        zzgozVar = zzgozVar;
                                        zzgoyVar2 = zzgoyVar2;
                                        zzgsgVar3 = zzgsgVar;
                                    }
                                    zzgsq.zzt(obj4, iZzz & 1048575, iZze);
                                    zzM(obj4, iZzu);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 13:
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsq.zzt(obj4, iZzz & 1048575, zzgrhVar.zzh());
                                    zzM(obj4, iZzu);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 14:
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsq.zzu(obj4, iZzz & 1048575, zzgrhVar.zzm());
                                    zzM(obj4, iZzu);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 15:
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsq.zzt(obj4, iZzz & 1048575, zzgrhVar.zzi());
                                    zzM(obj4, iZzu);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 16:
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsq.zzu(obj4, iZzz & 1048575, zzgrhVar.zzn());
                                    zzM(obj4, iZzu);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 17:
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgqwVar = (zzgqw) zzF(obj4, iZzu);
                                    zzgrhVar.zzt(zzgqwVar, zzC(iZzu), zzgoyVar2);
                                    zzO(obj4, iZzu, zzgqwVar);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 18:
                                    listZza = this.zzm.zza(obj4, iZzz & 1048575);
                                    zzgrhVar.zzx(listZza);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 19:
                                    listZza2 = this.zzm.zza(obj4, iZzz & 1048575);
                                    zzgrhVar.zzB(listZza2);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 20:
                                    listZza3 = this.zzm.zza(obj4, iZzz & 1048575);
                                    zzgrhVar.zzE(listZza3);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 21:
                                    listZza4 = this.zzm.zza(obj4, iZzz & 1048575);
                                    zzgrhVar.zzM(listZza4);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 22:
                                    listZza5 = this.zzm.zza(obj4, iZzz & 1048575);
                                    zzgrhVar.zzD(listZza5);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 23:
                                    listZza6 = this.zzm.zza(obj4, iZzz & 1048575);
                                    zzgrhVar.zzA(listZza6);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 24:
                                    listZza7 = this.zzm.zza(obj4, iZzz & 1048575);
                                    zzgrhVar.zzz(listZza7);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 25:
                                    listZza8 = this.zzm.zza(obj4, iZzz & 1048575);
                                    zzgrhVar.zzv(listZza8);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 26:
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    if (zzR(iZzz)) {
                                        ((zzgon) zzgrhVar).zzK(this.zzm.zza(obj4, iZzz & 1048575), true);
                                    } else {
                                        ((zzgon) zzgrhVar).zzK(this.zzm.zza(obj4, iZzz & 1048575), false);
                                    }
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 27:
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgrhVar.zzF(this.zzm.zza(obj4, iZzz & 1048575), zzC(iZzu), zzgoyVar2);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 28:
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgrhVar.zzw(this.zzm.zza(obj4, iZzz & 1048575));
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 29:
                                    listZza9 = this.zzm.zza(obj4, iZzz & 1048575);
                                    zzgrhVar.zzL(listZza9);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 30:
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    List listZza10 = this.zzm.zza(obj4, iZzz & 1048575);
                                    zzgrhVar.zzy(listZza10);
                                    objZzD = zzgrr.zzA(obj, iZzc, listZza10, zzB(iZzu), objZzD, zzgsgVar);
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 31:
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgrhVar.zzG(this.zzm.zza(obj4, iZzz & 1048575));
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 32:
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgrhVar.zzH(this.zzm.zza(obj4, iZzz & 1048575));
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 33:
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgrhVar.zzI(this.zzm.zza(obj4, iZzz & 1048575));
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 34:
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgrhVar.zzJ(this.zzm.zza(obj4, iZzz & 1048575));
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 35:
                                    listZza = this.zzm.zza(obj4, iZzz & 1048575);
                                    zzgrhVar.zzx(listZza);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 36:
                                    listZza2 = this.zzm.zza(obj4, iZzz & 1048575);
                                    zzgrhVar.zzB(listZza2);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 37:
                                    listZza3 = this.zzm.zza(obj4, iZzz & 1048575);
                                    zzgrhVar.zzE(listZza3);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 38:
                                    listZza4 = this.zzm.zza(obj4, iZzz & 1048575);
                                    zzgrhVar.zzM(listZza4);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 39:
                                    listZza5 = this.zzm.zza(obj4, iZzz & 1048575);
                                    zzgrhVar.zzD(listZza5);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 40:
                                    listZza6 = this.zzm.zza(obj4, iZzz & 1048575);
                                    zzgrhVar.zzA(listZza6);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 41:
                                    listZza7 = this.zzm.zza(obj4, iZzz & 1048575);
                                    zzgrhVar.zzz(listZza7);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 42:
                                    listZza8 = this.zzm.zza(obj4, iZzz & 1048575);
                                    zzgrhVar.zzv(listZza8);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 43:
                                    listZza9 = this.zzm.zza(obj4, iZzz & 1048575);
                                    zzgrhVar.zzL(listZza9);
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 44:
                                    List listZza11 = this.zzm.zza(obj4, iZzz & 1048575);
                                    zzgrhVar.zzy(listZza11);
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    objZzD = zzgrr.zzA(obj, iZzc, listZza11, zzB(iZzu), objZzD, zzgsgVar);
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 45:
                                    zzgrhVar.zzG(this.zzm.zza(obj4, iZzz & 1048575));
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 46:
                                    zzgrhVar.zzH(this.zzm.zza(obj4, iZzz & 1048575));
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 47:
                                    zzgrhVar.zzI(this.zzm.zza(obj4, iZzz & 1048575));
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 48:
                                    zzgrhVar.zzJ(this.zzm.zza(obj4, iZzz & 1048575));
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 49:
                                    zzgrhVar.zzC(this.zzm.zza(obj4, iZzz & 1048575), zzC(iZzu), zzgoyVar2);
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 50:
                                    Object objZzE = zzE(iZzu);
                                    long jZzz = zzz(iZzu) & 1048575;
                                    Object objZzh = zzgsq.zzh(obj4, jZzz);
                                    if (objZzh == null) {
                                        objZzh = zzgqq.zza().zzb();
                                        zzgsq.zzv(obj4, jZzz, objZzh);
                                    } else if (zzgqr.zzb(objZzh)) {
                                        Object objZzb = zzgqq.zza().zzb();
                                        zzgqr.zzc(objZzb, objZzh);
                                        zzgsq.zzv(obj4, jZzz, objZzb);
                                        objZzh = objZzb;
                                    }
                                    throw null;
                                case 51:
                                    zzgsq.zzv(obj4, iZzz & 1048575, Double.valueOf(zzgrhVar.zza()));
                                    zzN(obj4, iZzc, iZzu);
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 52:
                                    zzgsq.zzv(obj4, iZzz & 1048575, Float.valueOf(zzgrhVar.zzb()));
                                    zzN(obj4, iZzc, iZzu);
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 53:
                                    zzgsq.zzv(obj4, iZzz & 1048575, Long.valueOf(zzgrhVar.zzl()));
                                    zzN(obj4, iZzc, iZzu);
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 54:
                                    zzgsq.zzv(obj4, iZzz & 1048575, Long.valueOf(zzgrhVar.zzo()));
                                    zzN(obj4, iZzc, iZzu);
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 55:
                                    zzgsq.zzv(obj4, iZzz & 1048575, Integer.valueOf(zzgrhVar.zzg()));
                                    zzN(obj4, iZzc, iZzu);
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 56:
                                    zzgsq.zzv(obj4, iZzz & 1048575, Long.valueOf(zzgrhVar.zzk()));
                                    zzN(obj4, iZzc, iZzu);
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 57:
                                    zzgsq.zzv(obj4, iZzz & 1048575, Integer.valueOf(zzgrhVar.zzf()));
                                    zzN(obj4, iZzc, iZzu);
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 58:
                                    zzgsq.zzv(obj4, iZzz & 1048575, Boolean.valueOf(zzgrhVar.zzN()));
                                    zzN(obj4, iZzc, iZzu);
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 59:
                                    zzL(obj4, iZzz, zzgrhVar);
                                    zzN(obj4, iZzc, iZzu);
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 60:
                                    zzgqwVar2 = (zzgqw) zzG(obj4, iZzc, iZzu);
                                    zzgrhVar.zzu(zzgqwVar2, zzC(iZzu), zzgoyVar2);
                                    zzP(obj4, iZzc, iZzu, zzgqwVar2);
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 61:
                                    zzgsq.zzv(obj4, iZzz & 1048575, zzgrhVar.zzp());
                                    zzN(obj4, iZzc, iZzu);
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 62:
                                    zzgsq.zzv(obj4, iZzz & 1048575, Integer.valueOf(zzgrhVar.zzj()));
                                    zzN(obj4, iZzc, iZzu);
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 63:
                                    int iZze2 = zzgrhVar.zze();
                                    zzgpq zzgpqVarZzB2 = zzB(iZzu);
                                    if (zzgpqVarZzB2 == null || zzgpqVarZzB2.zza(iZze2)) {
                                        zzgsq.zzv(obj4, iZzz & 1048575, Integer.valueOf(iZze2));
                                        zzN(obj4, iZzc, iZzu);
                                        objZzD = objZzD;
                                        zzgozVar = zzgozVar;
                                        zzgoyVar2 = zzgoyVar2;
                                        zzgozVar = zzgozVar;
                                        objZzD = objZzD;
                                        zzgoyVar2 = zzgoyVar2;
                                    } else {
                                        objZzD = zzgrr.zzB(obj4, iZzc, iZze2, objZzD, zzgsgVar);
                                        obj4 = obj4;
                                    }
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 64:
                                    zzgsq.zzv(obj4, iZzz & 1048575, Integer.valueOf(zzgrhVar.zzh()));
                                    zzN(obj4, iZzc, iZzu);
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 65:
                                    zzgsq.zzv(obj4, iZzz & 1048575, Long.valueOf(zzgrhVar.zzm()));
                                    zzN(obj4, iZzc, iZzu);
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 66:
                                    zzgsq.zzv(obj4, iZzz & 1048575, Integer.valueOf(zzgrhVar.zzi()));
                                    zzN(obj4, iZzc, iZzu);
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 67:
                                    zzgsq.zzv(obj4, iZzz & 1048575, Long.valueOf(zzgrhVar.zzn()));
                                    zzN(obj4, iZzc, iZzu);
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                case 68:
                                    zzgqwVar2 = (zzgqw) zzG(obj4, iZzc, iZzu);
                                    zzgrhVar.zzt(zzgqwVar2, zzC(iZzu), zzgoyVar2);
                                    zzP(obj4, iZzc, iZzu, zzgqwVar2);
                                    objZzD = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgozVar = zzgozVar;
                                    objZzD = objZzD;
                                    zzgoyVar2 = zzgoyVar2;
                                    zzgsgVar3 = zzgsgVar;
                                    break;
                                default:
                                    obj2 = objZzD;
                                    zzgozVar = zzgozVar;
                                    zzgoyVar2 = zzgoyVar2;
                                    if (obj2 == null) {
                                        try {
                                            objZzD = zzgsgVar.zzc(obj4);
                                        } catch (zzgpx unused) {
                                            objZzD = obj2;
                                            zzgsgVar.zzq(zzgrhVar);
                                            if (objZzD == null) {
                                                objZzD = zzgsgVar.zzc(obj4);
                                            }
                                            if (!zzgsgVar.zzp(objZzD, zzgrhVar)) {
                                                for (i11 = this.zzk; i11 < this.zzl; i11++) {
                                                    objZzD = zzD(obj, this.zzj[i11], objZzD, zzgsgVar, obj);
                                                }
                                                if (objZzD != null) {
                                                    zzgsgVar.zzn(obj4, objZzD);
                                                    return;
                                                }
                                                return;
                                            }
                                            zzgozVar = zzgozVar;
                                            zzgoyVar2 = zzgoyVar2;
                                            zzgsgVar3 = zzgsgVar;
                                        } catch (Throwable th) {
                                            th = th;
                                            objZzD = obj2;
                                        }
                                    } else {
                                        objZzD = obj2;
                                    }
                                    try {
                                        try {
                                            if (!zzgsgVar.zzp(objZzD, zzgrhVar)) {
                                                for (int i12 = this.zzk; i12 < this.zzl; i12++) {
                                                    objZzD = zzD(obj, this.zzj[i12], objZzD, zzgsgVar, obj);
                                                }
                                                if (objZzD != null) {
                                                    zzgsgVar.zzn(obj4, objZzD);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (zzgpx unused2) {
                                            zzgsgVar.zzq(zzgrhVar);
                                            if (objZzD == null) {
                                                objZzD = zzgsgVar.zzc(obj4);
                                            }
                                            if (!zzgsgVar.zzp(objZzD, zzgrhVar)) {
                                                while (i11 < this.zzl) {
                                                    objZzD = zzD(obj, this.zzj[i11], objZzD, zzgsgVar, obj);
                                                }
                                                if (objZzD != null) {
                                                    zzgsgVar.zzn(obj4, objZzD);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        zzgozVar = zzgozVar;
                                        zzgoyVar2 = zzgoyVar2;
                                        zzgsgVar3 = zzgsgVar;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                    break;
                            }
                        } catch (zzgpx unused3) {
                            obj2 = objZzD;
                            zzgozVar = zzgozVar;
                            zzgoyVar2 = zzgoyVar2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        obj2 = objZzD;
                    }
                } else {
                    if (iZzc == Integer.MAX_VALUE) {
                        for (int i13 = this.zzk; i13 < this.zzl; i13++) {
                            objZzD = zzD(obj, this.zzj[i13], objZzD, zzgsgVar3, obj);
                        }
                        if (objZzD != null) {
                            zzgsgVar3.zzn(obj4, objZzD);
                            return;
                        }
                        return;
                    }
                    try {
                        Object objZzc = !this.zzh ? null : zzgozVar.zzc(zzgoyVar2, this.zzg, iZzc);
                        if (objZzc != null) {
                            zzgpd zzgpdVarZzb = zzgpdVar == null ? zzgozVar.zzb(obj4) : zzgpdVar;
                            zzgsgVar2 = zzgsgVar3;
                            obj3 = obj4;
                            try {
                                objZzD = zzgozVar.zzd(obj, zzgrhVar, objZzc, zzgoyVar, zzgpdVarZzb, objZzD, zzgsgVar2);
                                zzgpdVar = zzgpdVarZzb;
                            } catch (Throwable th4) {
                                th = th4;
                                obj4 = obj3;
                                zzgsgVar = zzgsgVar2;
                                obj2 = objZzD;
                                objZzD = obj2;
                                for (i10 = this.zzk; i10 < this.zzl; i10++) {
                                    objZzD = zzD(obj, this.zzj[i10], objZzD, zzgsgVar, obj);
                                }
                                if (objZzD != null) {
                                    zzgsgVar.zzn(obj4, objZzD);
                                }
                                throw th;
                            }
                        } else {
                            zzgsgVar2 = zzgsgVar3;
                            obj3 = obj4;
                            zzgsgVar2.zzq(zzgrhVar);
                            if (objZzD == null) {
                                objZzD = zzgsgVar2.zzc(obj3);
                            }
                            try {
                                if (!zzgsgVar2.zzp(objZzD, zzgrhVar)) {
                                    int i14 = this.zzk;
                                    while (i14 < this.zzl) {
                                        zzgsg zzgsgVar4 = zzgsgVar2;
                                        objZzD = zzD(obj, this.zzj[i14], objZzD, zzgsgVar4, obj);
                                        i14++;
                                        obj3 = obj3;
                                        zzgsgVar2 = zzgsgVar4;
                                    }
                                    Object obj5 = obj3;
                                    zzgsg zzgsgVar5 = zzgsgVar2;
                                    if (objZzD != null) {
                                        zzgsgVar5.zzn(obj5, objZzD);
                                        return;
                                    }
                                    return;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                obj4 = obj3;
                                zzgsgVar = zzgsgVar2;
                            }
                        }
                        obj4 = obj3;
                        zzgsgVar3 = zzgsgVar2;
                    } catch (Throwable th6) {
                        th = th6;
                        zzgsgVar = zzgsgVar3;
                        obj4 = obj4;
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                obj2 = objZzD;
                zzgsgVar = zzgsgVar3;
                obj4 = obj4;
            }
            objZzD = obj2;
            while (i10 < this.zzl) {
                objZzD = zzD(obj, this.zzj[i10], objZzD, zzgsgVar, obj);
            }
            if (objZzD != null) {
                zzgsgVar.zzn(obj4, objZzD);
            }
            throw th;
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
    @Override // com.google.android.gms.internal.ads.zzgrp
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzgnq zzgnqVar) throws IOException {
        int i12;
        int iZzk;
        int i13;
        int i14;
        int i15;
        Unsafe unsafe;
        int i16;
        int i17;
        int i18;
        int iZzF;
        int i19;
        int i20;
        int i21;
        this = this;
        obj = obj;
        bArr = bArr;
        i11 = i11;
        zzgnqVar = zzgnqVar;
        zzgsw zzgswVar = zzgsw.zza;
        int i22 = -1;
        if (this.zzp - 1 == 0) {
            zzc(obj, bArr, i10, i11, 0, zzgnqVar);
            return;
        }
        zzI(obj);
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
                iZzk = zzgnr.zzk(b10, bArr, i28, zzgnqVar);
                i12 = zzgnqVar.zza;
            } else {
                i12 = b10;
                iZzk = i28;
            }
            int i29 = i12 >>> 3;
            int iZzv = i29 > i25 ? this.zzv(i29, i26 / 3) : this.zzu(i29);
            if (iZzv == i22) {
                i13 = iZzk;
                i14 = i29;
                i15 = i22;
                unsafe = unsafe2;
                i16 = 0;
            } else {
                int i30 = i12 & 7;
                int[] iArr = this.zzc;
                int i31 = iArr[iZzv + 1];
                int iZzy = zzy(i31);
                long j10 = i31 & i23;
                if (iZzy <= 17) {
                    int i32 = iArr[iZzv + 2];
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
                    switch (iZzy) {
                        case 0:
                            i34 = 1048575;
                            i17 = iZzv;
                            i14 = i29;
                            i18 = iZzk;
                            if (i30 != 1) {
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                zzgsq.zzr(obj, j10, Double.longBitsToDouble(zzgnr.zzp(bArr, i18)));
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
                            i17 = iZzv;
                            i14 = i29;
                            i18 = iZzk;
                            if (i30 != 5) {
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                zzgsq.zzs(obj, j10, Float.intBitsToFloat(zzgnr.zzb(bArr, i18)));
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
                            i17 = iZzv;
                            i14 = i29;
                            i18 = iZzk;
                            if (i30 != 0) {
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                int iZzm = zzgnr.zzm(bArr, i18, zzgnqVar);
                                unsafe2.putLong(obj, j10, zzgnqVar.zzb);
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
                            i17 = iZzv;
                            i14 = i29;
                            i18 = iZzk;
                            if (i30 != 0) {
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                iZzi = zzgnr.zzj(bArr, i18, zzgnqVar);
                                iZzF = zzgnqVar.zza;
                                unsafe2.putInt(obj, j10, iZzF);
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
                            i17 = iZzv;
                            i14 = i29;
                            if (i30 != 1) {
                                i18 = iZzk;
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                unsafe2.putLong(obj, j10, zzgnr.zzp(bArr, iZzk));
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
                            i17 = iZzv;
                            i14 = i29;
                            if (i30 != 5) {
                                i18 = iZzk;
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                unsafe2.putInt(obj, j10, zzgnr.zzb(bArr, iZzk));
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
                            i17 = iZzv;
                            i14 = i29;
                            if (i30 != 0) {
                                i18 = iZzk;
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                iZzi = zzgnr.zzm(bArr, iZzk, zzgnqVar);
                                zzgsq.zzp(obj, j10, zzgnqVar.zzb != 0);
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
                            i17 = iZzv;
                            i14 = i29;
                            if (i30 != 2) {
                                i18 = iZzk;
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                iZzi = (i31 & 536870912) == 0 ? zzgnr.zzg(bArr, iZzk, zzgnqVar) : zzgnr.zzh(bArr, iZzk, zzgnqVar);
                                unsafe2.putObject(obj, j10, zzgnqVar.zzc);
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
                            i17 = iZzv;
                            i14 = i29;
                            if (i30 != 2) {
                                i18 = iZzk;
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                Object objZzF = this.zzF(obj, i17);
                                iZzi = zzgnr.zzo(objZzF, this.zzC(i17), bArr, iZzk, i11, zzgnqVar);
                                this.zzO(obj, i17, objZzF);
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
                            i17 = iZzv;
                            i14 = i29;
                            if (i30 != 2) {
                                i18 = iZzk;
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                iZzi = zzgnr.zza(bArr, iZzk, zzgnqVar);
                                unsafe2.putObject(obj, j10, zzgnqVar.zzc);
                                i27 |= i33;
                                i26 = i17;
                                i25 = i14;
                                i23 = i34;
                                i22 = -1;
                                i11 = i11;
                            }
                            break;
                        case 12:
                            i17 = iZzv;
                            i14 = i29;
                            if (i30 != 0) {
                                i18 = iZzk;
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                iZzi = zzgnr.zzj(bArr, iZzk, zzgnqVar);
                                iZzF = zzgnqVar.zza;
                                unsafe2.putInt(obj, j10, iZzF);
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
                            i17 = iZzv;
                            i14 = i29;
                            if (i30 != 0) {
                                i18 = iZzk;
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                iZzi = zzgnr.zzj(bArr, iZzk, zzgnqVar);
                                iZzF = zzgom.zzF(zzgnqVar.zza);
                                unsafe2.putInt(obj, j10, iZzF);
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
                                i17 = iZzv;
                                i13 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                int iZzm2 = zzgnr.zzm(bArr, iZzk, zzgnqVar);
                                i14 = i29;
                                i34 = 1048575;
                                unsafe2.putLong(obj, j10, zzgom.zzG(zzgnqVar.zzb));
                                i27 |= i33;
                                i26 = iZzv;
                                iZzi = iZzm2;
                                i25 = i14;
                                i23 = i34;
                                i22 = -1;
                                i11 = i11;
                            }
                            break;
                        default:
                            i17 = iZzv;
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
                    if (iZzy != 27) {
                        i16 = iZzv;
                        if (iZzy <= 49) {
                            i20 = i27;
                            i21 = i24;
                            unsafe = unsafe2;
                            i15 = -1;
                            iZzi = zzt(obj, bArr, i36, i11, i12, i14, i30, i16, i31, iZzy, j10, zzgnqVar);
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
                            if (iZzy == 50) {
                                if (i30 == 2) {
                                    iZzi = zzr(obj, bArr, i19, i11, i16, j10, zzgnqVar);
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
                                iZzi = zzs(obj, bArr, i19, i11, i12, i14, i30, i31, iZzy, j10, i16, zzgnqVar);
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
                        zzgpv zzgpvVarZzd = (zzgpv) unsafe2.getObject(obj, j10);
                        if (!zzgpvVarZzd.zzc()) {
                            int size = zzgpvVarZzd.size();
                            zzgpvVarZzd = zzgpvVarZzd.zzd(size == 0 ? 10 : size + size);
                            unsafe2.putObject(obj, j10, zzgpvVarZzd);
                        }
                        iZzi = zzgnr.zze(this.zzC(iZzv), i12, bArr, i36, i11, zzgpvVarZzd, zzgnqVar);
                        i11 = i11;
                        i27 = i27;
                        i25 = i14;
                        i26 = iZzv;
                        i23 = 1048575;
                        i22 = -1;
                    } else {
                        i16 = iZzv;
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
            iZzi = zzgnr.zzi(i12, bArr, i13, i11, zzd(obj), zzgnqVar);
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
            throw zzgpy.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    public final boolean zzj(Object obj, Object obj2) {
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iZzz = zzz(i10);
            long j10 = iZzz & 1048575;
            switch (zzy(iZzz)) {
                case 0:
                    if (!zzQ(obj, obj2, i10) || Double.doubleToLongBits(zzgsq.zzb(obj, j10)) != Double.doubleToLongBits(zzgsq.zzb(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 1:
                    if (!zzQ(obj, obj2, i10) || Float.floatToIntBits(zzgsq.zzc(obj, j10)) != Float.floatToIntBits(zzgsq.zzc(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 2:
                    if (!zzQ(obj, obj2, i10) || zzgsq.zzf(obj, j10) != zzgsq.zzf(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 3:
                    if (!zzQ(obj, obj2, i10) || zzgsq.zzf(obj, j10) != zzgsq.zzf(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 4:
                    if (!zzQ(obj, obj2, i10) || zzgsq.zzd(obj, j10) != zzgsq.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!zzQ(obj, obj2, i10) || zzgsq.zzf(obj, j10) != zzgsq.zzf(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 6:
                    if (!zzQ(obj, obj2, i10) || zzgsq.zzd(obj, j10) != zzgsq.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 7:
                    if (!zzQ(obj, obj2, i10) || zzgsq.zzz(obj, j10) != zzgsq.zzz(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 8:
                    if (!zzQ(obj, obj2, i10) || !zzgrr.zzE(zzgsq.zzh(obj, j10), zzgsq.zzh(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 9:
                    if (!zzQ(obj, obj2, i10) || !zzgrr.zzE(zzgsq.zzh(obj, j10), zzgsq.zzh(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 10:
                    if (!zzQ(obj, obj2, i10) || !zzgrr.zzE(zzgsq.zzh(obj, j10), zzgsq.zzh(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 11:
                    if (!zzQ(obj, obj2, i10) || zzgsq.zzd(obj, j10) != zzgsq.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 12:
                    if (!zzQ(obj, obj2, i10) || zzgsq.zzd(obj, j10) != zzgsq.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 13:
                    if (!zzQ(obj, obj2, i10) || zzgsq.zzd(obj, j10) != zzgsq.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 14:
                    if (!zzQ(obj, obj2, i10) || zzgsq.zzf(obj, j10) != zzgsq.zzf(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 15:
                    if (!zzQ(obj, obj2, i10) || zzgsq.zzd(obj, j10) != zzgsq.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 16:
                    if (!zzQ(obj, obj2, i10) || zzgsq.zzf(obj, j10) != zzgsq.zzf(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 17:
                    if (!zzQ(obj, obj2, i10) || !zzgrr.zzE(zzgsq.zzh(obj, j10), zzgsq.zzh(obj2, j10))) {
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
                    if (!zzgrr.zzE(zzgsq.zzh(obj, j10), zzgsq.zzh(obj2, j10))) {
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
                    long jZzw = zzw(i10) & 1048575;
                    if (zzgsq.zzd(obj, jZzw) != zzgsq.zzd(obj2, jZzw) || !zzgrr.zzE(zzgsq.zzh(obj, j10), zzgsq.zzh(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c3 A[LOOP:1: B:45:0x00b2->B:50:0x00c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e1 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgrp
    public final boolean zzk(Object obj) {
        int i10;
        int i11;
        List list;
        zzgrp zzgrpVarZzC;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.zzk) {
            int i16 = this.zzj[i15];
            int i17 = this.zzc[i16];
            int iZzz = zzz(i16);
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
            if ((268435456 & iZzz) != 0 && !zzT(obj, i16, i10, i11, i20)) {
                return false;
            }
            int iZzy = zzy(iZzz);
            if (iZzy == 9 || iZzy == 17) {
                if (zzT(obj, i16, i10, i11, i20) && !zzU(obj, iZzz, zzC(i16))) {
                    return false;
                }
            } else if (iZzy == 27) {
                list = (List) zzgsq.zzh(obj, iZzz & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgrpVarZzC = zzC(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!zzgrpVarZzC.zzk(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iZzy == 60 || iZzy == 68) {
                if (zzW(obj, i17, i16) && !zzU(obj, iZzz, zzC(i16))) {
                    return false;
                }
            } else if (iZzy == 49) {
                list = (List) zzgsq.zzh(obj, iZzz & 1048575);
                if (list.isEmpty()) {
                    zzgrpVarZzC = zzC(i16);
                    while (i12 < list.size()) {
                        if (!zzgrpVarZzC.zzk(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzy == 50 && !((zzgqq) zzgsq.zzh(obj, iZzz & 1048575)).isEmpty()) {
                throw null;
            }
            i15++;
            i13 = i10;
            i14 = i11;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:127:0x0347  */
    /* JADX WARN: Code duplicated, block: B:130:0x035a  */
    /* JADX WARN: Code duplicated, block: B:133:0x036f  */
    /* JADX WARN: Failed to find 'out' block for switch in B:183:0x0442. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzgrp
    public final void zzm(Object obj, zzgou zzgouVar) throws IOException {
        int i10;
        int i11;
        int i12;
        double dZzb;
        float fZzc;
        long jZzf;
        long jZzf2;
        int iZzd;
        long jZzf3;
        int iZzd2;
        boolean zZzz;
        int iZzd3;
        int iZzd4;
        int iZzd5;
        long jZzf4;
        int iZzd6;
        long jZzf5;
        zzgsw zzgswVar = zzgsw.zza;
        int i13 = 0;
        int i14 = 1048575;
        if (this.zzp - 1 != 0) {
            if (this.zzh) {
                this.zzo.zza(obj);
                throw null;
            }
            int length = this.zzc.length;
            for (int i15 = 0; i15 < length; i15 += 3) {
                int iZzz = zzz(i15);
                int i16 = this.zzc[i15];
                switch (zzy(iZzz)) {
                    case 0:
                        if (zzS(obj, i15)) {
                            dZzb = zzgsq.zzb(obj, iZzz & 1048575);
                            zzgouVar.zzf(i16, dZzb);
                        }
                        break;
                    case 1:
                        if (zzS(obj, i15)) {
                            fZzc = zzgsq.zzc(obj, iZzz & 1048575);
                            zzgouVar.zzo(i16, fZzc);
                        }
                        break;
                    case 2:
                        if (zzS(obj, i15)) {
                            jZzf = zzgsq.zzf(obj, iZzz & 1048575);
                            zzgouVar.zzt(i16, jZzf);
                        }
                        break;
                    case 3:
                        if (zzS(obj, i15)) {
                            jZzf2 = zzgsq.zzf(obj, iZzz & 1048575);
                            zzgouVar.zzJ(i16, jZzf2);
                        }
                        break;
                    case 4:
                        if (zzS(obj, i15)) {
                            iZzd = zzgsq.zzd(obj, iZzz & 1048575);
                            zzgouVar.zzr(i16, iZzd);
                        }
                        break;
                    case 5:
                        if (zzS(obj, i15)) {
                            jZzf3 = zzgsq.zzf(obj, iZzz & 1048575);
                            zzgouVar.zzm(i16, jZzf3);
                        }
                        break;
                    case 6:
                        if (zzS(obj, i15)) {
                            iZzd2 = zzgsq.zzd(obj, iZzz & 1048575);
                            zzgouVar.zzk(i16, iZzd2);
                        }
                        break;
                    case 7:
                        if (zzS(obj, i15)) {
                            zZzz = zzgsq.zzz(obj, iZzz & 1048575);
                            zzgouVar.zzb(i16, zZzz);
                        }
                        break;
                    case 8:
                        if (zzS(obj, i15)) {
                            zzZ(i16, zzgsq.zzh(obj, iZzz & 1048575), zzgouVar);
                        }
                        break;
                    case 9:
                        if (zzS(obj, i15)) {
                            zzgouVar.zzv(i16, zzgsq.zzh(obj, iZzz & 1048575), zzC(i15));
                        }
                        break;
                    case 10:
                        if (zzS(obj, i15)) {
                            zzgouVar.zzd(i16, (zzgoe) zzgsq.zzh(obj, iZzz & 1048575));
                        }
                        break;
                    case 11:
                        if (zzS(obj, i15)) {
                            iZzd3 = zzgsq.zzd(obj, iZzz & 1048575);
                            zzgouVar.zzH(i16, iZzd3);
                        }
                        break;
                    case 12:
                        if (zzS(obj, i15)) {
                            iZzd4 = zzgsq.zzd(obj, iZzz & 1048575);
                            zzgouVar.zzi(i16, iZzd4);
                        }
                        break;
                    case 13:
                        if (zzS(obj, i15)) {
                            iZzd5 = zzgsq.zzd(obj, iZzz & 1048575);
                            zzgouVar.zzw(i16, iZzd5);
                        }
                        break;
                    case 14:
                        if (zzS(obj, i15)) {
                            jZzf4 = zzgsq.zzf(obj, iZzz & 1048575);
                            zzgouVar.zzy(i16, jZzf4);
                        }
                        break;
                    case 15:
                        if (zzS(obj, i15)) {
                            iZzd6 = zzgsq.zzd(obj, iZzz & 1048575);
                            zzgouVar.zzA(i16, iZzd6);
                        }
                        break;
                    case 16:
                        if (zzS(obj, i15)) {
                            jZzf5 = zzgsq.zzf(obj, iZzz & 1048575);
                            zzgouVar.zzC(i16, jZzf5);
                        }
                        break;
                    case 17:
                        if (zzS(obj, i15)) {
                            zzgouVar.zzq(i16, zzgsq.zzh(obj, iZzz & 1048575), zzC(i15));
                        }
                        break;
                    case 18:
                        zzgrr.zzH(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar, false);
                        break;
                    case 19:
                        zzgrr.zzL(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar, false);
                        break;
                    case 20:
                        zzgrr.zzO(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar, false);
                        break;
                    case 21:
                        zzgrr.zzW(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar, false);
                        break;
                    case 22:
                        zzgrr.zzN(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar, false);
                        break;
                    case 23:
                        zzgrr.zzK(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar, false);
                        break;
                    case 24:
                        zzgrr.zzJ(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar, false);
                        break;
                    case 25:
                        zzgrr.zzF(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar, false);
                        break;
                    case 26:
                        zzgrr.zzU(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar);
                        break;
                    case 27:
                        zzgrr.zzP(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar, zzC(i15));
                        break;
                    case 28:
                        zzgrr.zzG(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar);
                        break;
                    case 29:
                        zzgrr.zzV(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar, false);
                        break;
                    case 30:
                        zzgrr.zzI(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar, false);
                        break;
                    case 31:
                        zzgrr.zzQ(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar, false);
                        break;
                    case 32:
                        zzgrr.zzR(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar, false);
                        break;
                    case 33:
                        zzgrr.zzS(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar, false);
                        break;
                    case 34:
                        zzgrr.zzT(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar, false);
                        break;
                    case 35:
                        zzgrr.zzH(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar, true);
                        break;
                    case 36:
                        zzgrr.zzL(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar, true);
                        break;
                    case 37:
                        zzgrr.zzO(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar, true);
                        break;
                    case 38:
                        zzgrr.zzW(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar, true);
                        break;
                    case 39:
                        zzgrr.zzN(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar, true);
                        break;
                    case 40:
                        zzgrr.zzK(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar, true);
                        break;
                    case 41:
                        zzgrr.zzJ(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar, true);
                        break;
                    case 42:
                        zzgrr.zzF(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar, true);
                        break;
                    case 43:
                        zzgrr.zzV(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar, true);
                        break;
                    case 44:
                        zzgrr.zzI(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar, true);
                        break;
                    case 45:
                        zzgrr.zzQ(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar, true);
                        break;
                    case 46:
                        zzgrr.zzR(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar, true);
                        break;
                    case 47:
                        zzgrr.zzS(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar, true);
                        break;
                    case 48:
                        zzgrr.zzT(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar, true);
                        break;
                    case 49:
                        zzgrr.zzM(i16, (List) zzgsq.zzh(obj, iZzz & 1048575), zzgouVar, zzC(i15));
                        break;
                    case 50:
                        zzY(zzgouVar, i16, zzgsq.zzh(obj, iZzz & 1048575), i15);
                        break;
                    case 51:
                        if (zzW(obj, i16, i15)) {
                            dZzb = zzn(obj, iZzz & 1048575);
                            zzgouVar.zzf(i16, dZzb);
                        }
                        break;
                    case 52:
                        if (zzW(obj, i16, i15)) {
                            fZzc = zzo(obj, iZzz & 1048575);
                            zzgouVar.zzo(i16, fZzc);
                        }
                        break;
                    case 53:
                        if (zzW(obj, i16, i15)) {
                            jZzf = zzA(obj, iZzz & 1048575);
                            zzgouVar.zzt(i16, jZzf);
                        }
                        break;
                    case 54:
                        if (zzW(obj, i16, i15)) {
                            jZzf2 = zzA(obj, iZzz & 1048575);
                            zzgouVar.zzJ(i16, jZzf2);
                        }
                        break;
                    case 55:
                        if (zzW(obj, i16, i15)) {
                            iZzd = zzq(obj, iZzz & 1048575);
                            zzgouVar.zzr(i16, iZzd);
                        }
                        break;
                    case 56:
                        if (zzW(obj, i16, i15)) {
                            jZzf3 = zzA(obj, iZzz & 1048575);
                            zzgouVar.zzm(i16, jZzf3);
                        }
                        break;
                    case 57:
                        if (zzW(obj, i16, i15)) {
                            iZzd2 = zzq(obj, iZzz & 1048575);
                            zzgouVar.zzk(i16, iZzd2);
                        }
                        break;
                    case 58:
                        if (zzW(obj, i16, i15)) {
                            zZzz = zzX(obj, iZzz & 1048575);
                            zzgouVar.zzb(i16, zZzz);
                        }
                        break;
                    case 59:
                        if (zzW(obj, i16, i15)) {
                            zzZ(i16, zzgsq.zzh(obj, iZzz & 1048575), zzgouVar);
                        }
                        break;
                    case 60:
                        if (zzW(obj, i16, i15)) {
                            zzgouVar.zzv(i16, zzgsq.zzh(obj, iZzz & 1048575), zzC(i15));
                        }
                        break;
                    case 61:
                        if (zzW(obj, i16, i15)) {
                            zzgouVar.zzd(i16, (zzgoe) zzgsq.zzh(obj, iZzz & 1048575));
                        }
                        break;
                    case 62:
                        if (zzW(obj, i16, i15)) {
                            iZzd3 = zzq(obj, iZzz & 1048575);
                            zzgouVar.zzH(i16, iZzd3);
                        }
                        break;
                    case 63:
                        if (zzW(obj, i16, i15)) {
                            iZzd4 = zzq(obj, iZzz & 1048575);
                            zzgouVar.zzi(i16, iZzd4);
                        }
                        break;
                    case 64:
                        if (zzW(obj, i16, i15)) {
                            iZzd5 = zzq(obj, iZzz & 1048575);
                            zzgouVar.zzw(i16, iZzd5);
                        }
                        break;
                    case 65:
                        if (zzW(obj, i16, i15)) {
                            jZzf4 = zzA(obj, iZzz & 1048575);
                            zzgouVar.zzy(i16, jZzf4);
                        }
                        break;
                    case 66:
                        if (zzW(obj, i16, i15)) {
                            iZzd6 = zzq(obj, iZzz & 1048575);
                            zzgouVar.zzA(i16, iZzd6);
                        }
                        break;
                    case 67:
                        if (zzW(obj, i16, i15)) {
                            jZzf5 = zzA(obj, iZzz & 1048575);
                            zzgouVar.zzC(i16, jZzf5);
                        }
                        break;
                    case 68:
                        if (zzW(obj, i16, i15)) {
                            zzgouVar.zzq(i16, zzgsq.zzh(obj, iZzz & 1048575), zzC(i15));
                        }
                        break;
                }
            }
        } else {
            if (this.zzh) {
                this.zzo.zza(obj);
                throw null;
            }
            int length2 = this.zzc.length;
            Unsafe unsafe = zzb;
            int i17 = 0;
            int i18 = 0;
            int i19 = 1048575;
            while (i17 < length2) {
                int iZzz2 = zzz(i17);
                int[] iArr = this.zzc;
                int i20 = iArr[i17];
                int iZzy = zzy(iZzz2);
                if (iZzy <= 17) {
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
                long j10 = iZzz2 & i14;
                switch (iZzy) {
                    case 0:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzgouVar.zzf(i20, zzgsq.zzb(obj, j10));
                        }
                        break;
                    case 1:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzgouVar.zzo(i20, zzgsq.zzc(obj, j10));
                        }
                        break;
                    case 2:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzgouVar.zzt(i20, unsafe.getLong(obj, j10));
                        }
                        break;
                    case 3:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzgouVar.zzJ(i20, unsafe.getLong(obj, j10));
                        }
                        break;
                    case 4:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzgouVar.zzr(i20, unsafe.getInt(obj, j10));
                        }
                        break;
                    case 5:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzgouVar.zzm(i20, unsafe.getLong(obj, j10));
                        }
                        break;
                    case 6:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzgouVar.zzk(i20, unsafe.getInt(obj, j10));
                        }
                        break;
                    case 7:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzgouVar.zzb(i20, zzgsq.zzz(obj, j10));
                        }
                        break;
                    case 8:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzZ(i20, unsafe.getObject(obj, j10), zzgouVar);
                        }
                        break;
                    case 9:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzgouVar.zzv(i20, unsafe.getObject(obj, j10), zzC(i17));
                        }
                        break;
                    case 10:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzgouVar.zzd(i20, (zzgoe) unsafe.getObject(obj, j10));
                        }
                        break;
                    case 11:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzgouVar.zzH(i20, unsafe.getInt(obj, j10));
                        }
                        break;
                    case 12:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzgouVar.zzi(i20, unsafe.getInt(obj, j10));
                        }
                        break;
                    case 13:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzgouVar.zzw(i20, unsafe.getInt(obj, j10));
                        }
                        break;
                    case 14:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzgouVar.zzy(i20, unsafe.getLong(obj, j10));
                        }
                        break;
                    case 15:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzgouVar.zzA(i20, unsafe.getInt(obj, j10));
                        }
                        break;
                    case 16:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzgouVar.zzC(i20, unsafe.getLong(obj, j10));
                        }
                        break;
                    case 17:
                        i11 = 0;
                        if ((i18 & i10) != 0) {
                            zzgouVar.zzq(i20, unsafe.getObject(obj, j10), zzC(i17));
                        }
                        break;
                    case 18:
                        i11 = 0;
                        zzgrr.zzH(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar, false);
                        break;
                    case 19:
                        i11 = 0;
                        zzgrr.zzL(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar, false);
                        break;
                    case 20:
                        i11 = 0;
                        zzgrr.zzO(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar, false);
                        break;
                    case 21:
                        i11 = 0;
                        zzgrr.zzW(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar, false);
                        break;
                    case 22:
                        i11 = 0;
                        zzgrr.zzN(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar, false);
                        break;
                    case 23:
                        i11 = 0;
                        zzgrr.zzK(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar, false);
                        break;
                    case 24:
                        i11 = 0;
                        zzgrr.zzJ(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar, false);
                        break;
                    case 25:
                        i11 = 0;
                        zzgrr.zzF(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar, false);
                        break;
                    case 26:
                        zzgrr.zzU(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar);
                        i11 = 0;
                        break;
                    case 27:
                        zzgrr.zzP(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar, zzC(i17));
                        i11 = 0;
                        break;
                    case 28:
                        zzgrr.zzG(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar);
                        i11 = 0;
                        break;
                    case 29:
                        i12 = 0;
                        zzgrr.zzV(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar, false);
                        i11 = i12;
                        break;
                    case 30:
                        i12 = 0;
                        zzgrr.zzI(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar, false);
                        i11 = i12;
                        break;
                    case 31:
                        i12 = 0;
                        zzgrr.zzQ(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar, false);
                        i11 = i12;
                        break;
                    case 32:
                        i12 = 0;
                        zzgrr.zzR(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar, false);
                        i11 = i12;
                        break;
                    case 33:
                        i12 = 0;
                        zzgrr.zzS(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar, false);
                        i11 = i12;
                        break;
                    case 34:
                        i12 = 0;
                        zzgrr.zzT(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar, false);
                        i11 = i12;
                        break;
                    case 35:
                        zzgrr.zzH(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar, true);
                        i11 = 0;
                        break;
                    case 36:
                        zzgrr.zzL(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar, true);
                        i11 = 0;
                        break;
                    case 37:
                        zzgrr.zzO(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar, true);
                        i11 = 0;
                        break;
                    case 38:
                        zzgrr.zzW(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar, true);
                        i11 = 0;
                        break;
                    case 39:
                        zzgrr.zzN(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar, true);
                        i11 = 0;
                        break;
                    case 40:
                        zzgrr.zzK(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar, true);
                        i11 = 0;
                        break;
                    case 41:
                        zzgrr.zzJ(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar, true);
                        i11 = 0;
                        break;
                    case 42:
                        zzgrr.zzF(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar, true);
                        i11 = 0;
                        break;
                    case 43:
                        zzgrr.zzV(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar, true);
                        i11 = 0;
                        break;
                    case 44:
                        zzgrr.zzI(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar, true);
                        i11 = 0;
                        break;
                    case 45:
                        zzgrr.zzQ(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar, true);
                        i11 = 0;
                        break;
                    case 46:
                        zzgrr.zzR(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar, true);
                        i11 = 0;
                        break;
                    case 47:
                        zzgrr.zzS(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar, true);
                        i11 = 0;
                        break;
                    case 48:
                        zzgrr.zzT(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar, true);
                        i11 = 0;
                        break;
                    case 49:
                        zzgrr.zzM(this.zzc[i17], (List) unsafe.getObject(obj, j10), zzgouVar, zzC(i17));
                        i11 = 0;
                        break;
                    case 50:
                        zzY(zzgouVar, i20, unsafe.getObject(obj, j10), i17);
                        i11 = 0;
                        break;
                    case 51:
                        if (zzW(obj, i20, i17)) {
                            zzgouVar.zzf(i20, zzn(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 52:
                        if (zzW(obj, i20, i17)) {
                            zzgouVar.zzo(i20, zzo(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 53:
                        if (zzW(obj, i20, i17)) {
                            zzgouVar.zzt(i20, zzA(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 54:
                        if (zzW(obj, i20, i17)) {
                            zzgouVar.zzJ(i20, zzA(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 55:
                        if (zzW(obj, i20, i17)) {
                            zzgouVar.zzr(i20, zzq(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 56:
                        if (zzW(obj, i20, i17)) {
                            zzgouVar.zzm(i20, zzA(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 57:
                        if (zzW(obj, i20, i17)) {
                            zzgouVar.zzk(i20, zzq(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 58:
                        if (zzW(obj, i20, i17)) {
                            zzgouVar.zzb(i20, zzX(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 59:
                        if (zzW(obj, i20, i17)) {
                            zzZ(i20, unsafe.getObject(obj, j10), zzgouVar);
                        }
                        i11 = 0;
                        break;
                    case 60:
                        if (zzW(obj, i20, i17)) {
                            zzgouVar.zzv(i20, unsafe.getObject(obj, j10), zzC(i17));
                        }
                        i11 = 0;
                        break;
                    case 61:
                        if (zzW(obj, i20, i17)) {
                            zzgouVar.zzd(i20, (zzgoe) unsafe.getObject(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 62:
                        if (zzW(obj, i20, i17)) {
                            zzgouVar.zzH(i20, zzq(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 63:
                        if (zzW(obj, i20, i17)) {
                            zzgouVar.zzi(i20, zzq(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 64:
                        if (zzW(obj, i20, i17)) {
                            zzgouVar.zzw(i20, zzq(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 65:
                        if (zzW(obj, i20, i17)) {
                            zzgouVar.zzy(i20, zzA(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 66:
                        if (zzW(obj, i20, i17)) {
                            zzgouVar.zzA(i20, zzq(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 67:
                        if (zzW(obj, i20, i17)) {
                            zzgouVar.zzC(i20, zzA(obj, j10));
                        }
                        i11 = 0;
                        break;
                    case 68:
                        if (zzW(obj, i20, i17)) {
                            zzgouVar.zzq(i20, unsafe.getObject(obj, j10), zzC(i17));
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
        zzgsg zzgsgVar = this.zzn;
        zzgsgVar.zzr(zzgsgVar.zzd(obj), zzgouVar);
    }
}
