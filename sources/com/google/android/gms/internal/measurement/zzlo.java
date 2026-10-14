package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class zzlo<T> implements zzlw<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmx.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzll zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzkz zzm;
    private final zzmn zzn;
    private final zzjr zzo;
    private final zzlq zzp;
    private final zzlg zzq;

    private zzlo(int[] iArr, Object[] objArr, int i10, int i11, zzll zzllVar, boolean z10, boolean z11, int[] iArr2, int i12, int i13, zzlq zzlqVar, zzkz zzkzVar, zzmn zzmnVar, zzjr zzjrVar, zzlg zzlgVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = z10;
        boolean z12 = false;
        if (zzjrVar != null && zzjrVar.zzc(zzllVar)) {
            z12 = true;
        }
        this.zzh = z12;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzp = zzlqVar;
        this.zzm = zzkzVar;
        this.zzn = zzmnVar;
        this.zzo = zzjrVar;
        this.zzg = zzllVar;
        this.zzq = zzlgVar;
    }

    private static int zzA(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzB(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzC(Object obj, long j10) {
        return ((Long) zzmx.zzf(obj, j10)).longValue();
    }

    private final zzki zzD(int i10) {
        int i11 = i10 / 3;
        return (zzki) this.zzd[i11 + i11 + 1];
    }

    private final zzlw zzE(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzlw zzlwVar = (zzlw) this.zzd[i12];
        if (zzlwVar != null) {
            return zzlwVar;
        }
        zzlw zzlwVarZzb = zzlt.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzlwVarZzb;
        return zzlwVarZzb;
    }

    private final Object zzF(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private static Field zzG(Class cls, String str) {
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

    private final void zzH(Object obj, Object obj2, int i10) {
        long jZzB = zzB(i10) & 1048575;
        if (zzO(obj2, i10)) {
            Object objZzf = zzmx.zzf(obj, jZzB);
            Object objZzf2 = zzmx.zzf(obj2, jZzB);
            if (objZzf != null && objZzf2 != null) {
                objZzf2 = zzkm.zzg(objZzf, objZzf2);
            } else if (objZzf2 == null) {
                return;
            }
            zzmx.zzs(obj, jZzB, objZzf2);
            zzJ(obj, i10);
        }
    }

    private final void zzI(Object obj, Object obj2, int i10) {
        int iZzB = zzB(i10);
        int i11 = this.zzc[i10];
        long j10 = iZzB & 1048575;
        if (zzR(obj2, i11, i10)) {
            Object objZzf = zzR(obj, i11, i10) ? zzmx.zzf(obj, j10) : null;
            Object objZzf2 = zzmx.zzf(obj2, j10);
            if (objZzf != null && objZzf2 != null) {
                objZzf2 = zzkm.zzg(objZzf, objZzf2);
            } else if (objZzf2 == null) {
                return;
            }
            zzmx.zzs(obj, j10, objZzf2);
            zzK(obj, i11, i10);
        }
    }

    private final void zzJ(Object obj, int i10) {
        int iZzy = zzy(i10);
        long j10 = 1048575 & iZzy;
        if (j10 == 1048575) {
            return;
        }
        zzmx.zzq(obj, j10, (1 << (iZzy >>> 20)) | zzmx.zzc(obj, j10));
    }

    private final void zzK(Object obj, int i10, int i11) {
        zzmx.zzq(obj, zzy(i11) & 1048575, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzL(Object obj, zznf zznfVar) throws IOException {
        int i10;
        boolean z10;
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int iZzB = zzB(i13);
            int[] iArr = this.zzc;
            int i15 = iArr[i13];
            int iZzA = zzA(iZzB);
            if (iZzA <= 17) {
                int i16 = iArr[i13 + 2];
                int i17 = i16 & i11;
                if (i17 != i12) {
                    i14 = unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            long j10 = iZzB & i11;
            switch (iZzA) {
                case 0:
                    if ((i14 & i10) != 0) {
                        zznfVar.zzf(i15, zzmx.zza(obj, j10));
                    }
                    break;
                case 1:
                    if ((i14 & i10) != 0) {
                        zznfVar.zzo(i15, zzmx.zzb(obj, j10));
                    }
                    break;
                case 2:
                    if ((i14 & i10) != 0) {
                        zznfVar.zzt(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 3:
                    if ((i14 & i10) != 0) {
                        zznfVar.zzJ(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 4:
                    if ((i14 & i10) != 0) {
                        zznfVar.zzr(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 5:
                    if ((i14 & i10) != 0) {
                        zznfVar.zzm(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 6:
                    if ((i14 & i10) != 0) {
                        zznfVar.zzk(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 7:
                    if ((i14 & i10) != 0) {
                        zznfVar.zzb(i15, zzmx.zzw(obj, j10));
                    }
                    break;
                case 8:
                    if ((i14 & i10) != 0) {
                        zzT(i15, unsafe.getObject(obj, j10), zznfVar);
                    }
                    break;
                case 9:
                    if ((i14 & i10) != 0) {
                        zznfVar.zzv(i15, unsafe.getObject(obj, j10), zzE(i13));
                    }
                    break;
                case 10:
                    if ((i14 & i10) != 0) {
                        zznfVar.zzd(i15, (zzjd) unsafe.getObject(obj, j10));
                    }
                    break;
                case 11:
                    if ((i14 & i10) != 0) {
                        zznfVar.zzH(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 12:
                    if ((i14 & i10) != 0) {
                        zznfVar.zzi(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 13:
                    if ((i14 & i10) != 0) {
                        zznfVar.zzw(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 14:
                    if ((i14 & i10) != 0) {
                        zznfVar.zzy(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 15:
                    if ((i14 & i10) != 0) {
                        zznfVar.zzA(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 16:
                    if ((i14 & i10) != 0) {
                        zznfVar.zzC(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 17:
                    if ((i14 & i10) != 0) {
                        zznfVar.zzq(i15, unsafe.getObject(obj, j10), zzE(i13));
                    }
                    break;
                case 18:
                    zzly.zzJ(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, false);
                    break;
                case 19:
                    zzly.zzN(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, false);
                    break;
                case 20:
                    zzly.zzQ(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, false);
                    break;
                case 21:
                    zzly.zzY(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, false);
                    break;
                case 22:
                    zzly.zzP(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, false);
                    break;
                case 23:
                    zzly.zzM(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, false);
                    break;
                case 24:
                    zzly.zzL(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, false);
                    break;
                case 25:
                    zzly.zzH(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, false);
                    break;
                case 26:
                    zzly.zzW(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar);
                    break;
                case 27:
                    zzly.zzR(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, zzE(i13));
                    break;
                case 28:
                    zzly.zzI(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar);
                    break;
                case 29:
                    z10 = false;
                    zzly.zzX(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, false);
                    break;
                case 30:
                    z10 = false;
                    zzly.zzK(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, false);
                    break;
                case 31:
                    z10 = false;
                    zzly.zzS(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, false);
                    break;
                case 32:
                    z10 = false;
                    zzly.zzT(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, false);
                    break;
                case 33:
                    z10 = false;
                    zzly.zzU(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, false);
                    break;
                case 34:
                    z10 = false;
                    zzly.zzV(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, false);
                    break;
                case 35:
                    zzly.zzJ(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, true);
                    break;
                case 36:
                    zzly.zzN(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, true);
                    break;
                case 37:
                    zzly.zzQ(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, true);
                    break;
                case 38:
                    zzly.zzY(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, true);
                    break;
                case 39:
                    zzly.zzP(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, true);
                    break;
                case 40:
                    zzly.zzM(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, true);
                    break;
                case 41:
                    zzly.zzL(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, true);
                    break;
                case 42:
                    zzly.zzH(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, true);
                    break;
                case 43:
                    zzly.zzX(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, true);
                    break;
                case 44:
                    zzly.zzK(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, true);
                    break;
                case 45:
                    zzly.zzS(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, true);
                    break;
                case 46:
                    zzly.zzT(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, true);
                    break;
                case 47:
                    zzly.zzU(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, true);
                    break;
                case 48:
                    zzly.zzV(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, true);
                    break;
                case 49:
                    zzly.zzO(this.zzc[i13], (List) unsafe.getObject(obj, j10), zznfVar, zzE(i13));
                    break;
                case 50:
                    zzM(zznfVar, i15, unsafe.getObject(obj, j10), i13);
                    break;
                case 51:
                    if (zzR(obj, i15, i13)) {
                        zznfVar.zzf(i15, zzn(obj, j10));
                    }
                    break;
                case 52:
                    if (zzR(obj, i15, i13)) {
                        zznfVar.zzo(i15, zzo(obj, j10));
                    }
                    break;
                case 53:
                    if (zzR(obj, i15, i13)) {
                        zznfVar.zzt(i15, zzC(obj, j10));
                    }
                    break;
                case 54:
                    if (zzR(obj, i15, i13)) {
                        zznfVar.zzJ(i15, zzC(obj, j10));
                    }
                    break;
                case 55:
                    if (zzR(obj, i15, i13)) {
                        zznfVar.zzr(i15, zzr(obj, j10));
                    }
                    break;
                case 56:
                    if (zzR(obj, i15, i13)) {
                        zznfVar.zzm(i15, zzC(obj, j10));
                    }
                    break;
                case 57:
                    if (zzR(obj, i15, i13)) {
                        zznfVar.zzk(i15, zzr(obj, j10));
                    }
                    break;
                case 58:
                    if (zzR(obj, i15, i13)) {
                        zznfVar.zzb(i15, zzS(obj, j10));
                    }
                    break;
                case 59:
                    if (zzR(obj, i15, i13)) {
                        zzT(i15, unsafe.getObject(obj, j10), zznfVar);
                    }
                    break;
                case 60:
                    if (zzR(obj, i15, i13)) {
                        zznfVar.zzv(i15, unsafe.getObject(obj, j10), zzE(i13));
                    }
                    break;
                case 61:
                    if (zzR(obj, i15, i13)) {
                        zznfVar.zzd(i15, (zzjd) unsafe.getObject(obj, j10));
                    }
                    break;
                case 62:
                    if (zzR(obj, i15, i13)) {
                        zznfVar.zzH(i15, zzr(obj, j10));
                    }
                    break;
                case 63:
                    if (zzR(obj, i15, i13)) {
                        zznfVar.zzi(i15, zzr(obj, j10));
                    }
                    break;
                case 64:
                    if (zzR(obj, i15, i13)) {
                        zznfVar.zzw(i15, zzr(obj, j10));
                    }
                    break;
                case 65:
                    if (zzR(obj, i15, i13)) {
                        zznfVar.zzy(i15, zzC(obj, j10));
                    }
                    break;
                case 66:
                    if (zzR(obj, i15, i13)) {
                        zznfVar.zzA(i15, zzr(obj, j10));
                    }
                    break;
                case 67:
                    if (zzR(obj, i15, i13)) {
                        zznfVar.zzC(i15, zzC(obj, j10));
                    }
                    break;
                case 68:
                    if (zzR(obj, i15, i13)) {
                        zznfVar.zzq(i15, unsafe.getObject(obj, j10), zzE(i13));
                    }
                    break;
                default:
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
        zzmn zzmnVar = this.zzn;
        zzmnVar.zzi(zzmnVar.zzc(obj), zznfVar);
    }

    private final void zzM(zznf zznfVar, int i10, Object obj, int i11) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzN(Object obj, Object obj2, int i10) {
        return zzO(obj, i10) == zzO(obj2, i10);
    }

    private final boolean zzO(Object obj, int i10) {
        int iZzy = zzy(i10);
        long j10 = iZzy & 1048575;
        if (j10 != 1048575) {
            return (zzmx.zzc(obj, j10) & (1 << (iZzy >>> 20))) != 0;
        }
        int iZzB = zzB(i10);
        long j11 = iZzB & 1048575;
        switch (zzA(iZzB)) {
            case 0:
                return Double.doubleToRawLongBits(zzmx.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmx.zzb(obj, j11)) != 0;
            case 2:
                return zzmx.zzd(obj, j11) != 0;
            case 3:
                return zzmx.zzd(obj, j11) != 0;
            case 4:
                return zzmx.zzc(obj, j11) != 0;
            case 5:
                return zzmx.zzd(obj, j11) != 0;
            case 6:
                return zzmx.zzc(obj, j11) != 0;
            case 7:
                return zzmx.zzw(obj, j11);
            case 8:
                Object objZzf = zzmx.zzf(obj, j11);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzjd) {
                    return !zzjd.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzmx.zzf(obj, j11) != null;
            case 10:
                return !zzjd.zzb.equals(zzmx.zzf(obj, j11));
            case 11:
                return zzmx.zzc(obj, j11) != 0;
            case 12:
                return zzmx.zzc(obj, j11) != 0;
            case 13:
                return zzmx.zzc(obj, j11) != 0;
            case 14:
                return zzmx.zzd(obj, j11) != 0;
            case 15:
                return zzmx.zzc(obj, j11) != 0;
            case 16:
                return zzmx.zzd(obj, j11) != 0;
            case 17:
                return zzmx.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzP(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzO(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    private static boolean zzQ(Object obj, int i10, zzlw zzlwVar) {
        return zzlwVar.zzk(zzmx.zzf(obj, i10 & 1048575));
    }

    private final boolean zzR(Object obj, int i10, int i11) {
        return zzmx.zzc(obj, (long) (zzy(i11) & 1048575)) == i10;
    }

    private static boolean zzS(Object obj, long j10) {
        return ((Boolean) zzmx.zzf(obj, j10)).booleanValue();
    }

    private static final void zzT(int i10, Object obj, zznf zznfVar) throws IOException {
        if (obj instanceof String) {
            zznfVar.zzF(i10, (String) obj);
        } else {
            zznfVar.zzd(i10, (zzjd) obj);
        }
    }

    public static zzmo zzd(Object obj) {
        zzke zzkeVar = (zzke) obj;
        zzmo zzmoVar = zzkeVar.zzc;
        if (zzmoVar != zzmo.zzc()) {
            return zzmoVar;
        }
        zzmo zzmoVarZze = zzmo.zze();
        zzkeVar.zzc = zzmoVarZze;
        return zzmoVarZze;
    }

    public static zzlo zzl(Class cls, zzli zzliVar, zzlq zzlqVar, zzkz zzkzVar, zzmn zzmnVar, zzjr zzjrVar, zzlg zzlgVar) {
        if (zzliVar instanceof zzlv) {
            return zzm((zzlv) zzliVar, zzlqVar, zzkzVar, zzmnVar, zzjrVar, zzlgVar);
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
    public static zzlo zzm(zzlv zzlvVar, zzlq zzlqVar, zzkz zzkzVar, zzmn zzmnVar, zzjr zzjrVar, zzlg zzlgVar) {
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
        Field fieldZzG;
        char cCharAt9;
        int i30;
        int i31;
        int i32;
        int i33;
        Object obj;
        Field fieldZzG2;
        int i34;
        Object obj2;
        Field fieldZzG3;
        int i35;
        char cCharAt10;
        int i36;
        char cCharAt11;
        int i37;
        char cCharAt12;
        int i38;
        char cCharAt13;
        boolean z10 = zzlvVar.zzc() == 2;
        String strZzd = zzlvVar.zzd();
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
        Object[] objArrZze = zzlvVar.zze();
        Class<?> cls = zzlvVar.zza().getClass();
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
                        fieldZzG2 = (Field) obj;
                    } else {
                        fieldZzG2 = zzG(cls, (String) obj);
                        objArrZze[i33] = fieldZzG2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzG2);
                    i34 = i33 + 1;
                    obj2 = objArrZze[i34];
                    if (obj2 instanceof Field) {
                        fieldZzG3 = (Field) obj2;
                    } else {
                        fieldZzG3 = zzG(cls, (String) obj2);
                        objArrZze[i34] = fieldZzG3;
                    }
                    cls = cls;
                    strZzd = strZzd;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzG3);
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i29 = 0;
                }
                i11 = i32;
                i33 = iCharAt12 + iCharAt12;
                obj = objArrZze[i33];
                if (obj instanceof Field) {
                    fieldZzG2 = (Field) obj;
                } else {
                    fieldZzG2 = zzG(cls, (String) obj);
                    objArrZze[i33] = fieldZzG2;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzG2);
                i34 = i33 + 1;
                obj2 = objArrZze[i34];
                if (obj2 instanceof Field) {
                    fieldZzG3 = (Field) obj2;
                } else {
                    fieldZzG3 = zzG(cls, (String) obj2);
                    objArrZze[i34] = fieldZzG3;
                }
                cls = cls;
                strZzd = strZzd;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzG3);
                iObjectFieldOffset = iObjectFieldOffset4;
                i29 = 0;
            } else {
                i26 = i13;
                int i90 = i11 + 1;
                Field fieldZzG4 = zzG(cls, (String) objArrZze[i11]);
                if (i81 == 9 || i81 == 17) {
                    int i91 = i71 / 3;
                    objArr[i91 + i91 + 1] = fieldZzG4.getType();
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzG4);
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
                                fieldZzG = (Field) obj3;
                            } else {
                                fieldZzG = zzG(cls, (String) obj3);
                                objArrZze[i101] = fieldZzG;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzG);
                            i29 = iCharAt13 % 32;
                        }
                        if (i81 >= 18 && i81 <= 49) {
                            iArr[i70] = iObjectFieldOffset;
                            i70++;
                        }
                        i11 = i27;
                    }
                    i27 = i30;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzG4);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzG4);
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
        return new zzlo(iArr2, objArr, iCharAt, i13, zzlvVar.zza(), z10, false, iArr, iCharAt3, i68, zzlqVar, zzkzVar, zzmnVar, zzjrVar, zzlgVar, null);
    }

    private static double zzn(Object obj, long j10) {
        return ((Double) zzmx.zzf(obj, j10)).doubleValue();
    }

    private static float zzo(Object obj, long j10) {
        return ((Float) zzmx.zzf(obj, j10)).floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0241 A[PHI: r1
  0x0241: PHI (r1v107 int) = 
  (r1v70 int)
  (r1v73 int)
  (r1v76 int)
  (r1v79 int)
  (r1v82 int)
  (r1v85 int)
  (r1v88 int)
  (r1v91 int)
  (r1v94 int)
  (r1v97 int)
  (r1v100 int)
  (r1v103 int)
  (r1v106 int)
  (r1v110 int)
 binds: [B:117:0x023f, B:114:0x0232, B:111:0x0225, B:108:0x0218, B:105:0x020b, B:102:0x01fe, B:99:0x01f1, B:96:0x01e4, B:93:0x01d6, B:90:0x01c8, B:87:0x01ba, B:84:0x01ac, B:81:0x019e, B:78:0x0190] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:160:0x034e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:179:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:185:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:60:0x011a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0138  */
    /* JADX WARN: Code duplicated, block: B:71:0x014f  */
    /* JADX WARN: Code duplicated, block: B:74:0x015f  */
    private final int zzp(Object obj) {
        int i10;
        long jZzC;
        Object object;
        int iZzA;
        int iZzy;
        int i11;
        long jZzC2;
        int iZzh;
        int iZzi;
        int iZzA2;
        Object object2;
        int iZzr;
        Unsafe unsafe = zzb;
        int i12 = 1048575;
        int i13 = 0;
        int iZzA3 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i14 < this.zzc.length) {
            int iZzB = zzB(i14);
            int[] iArr = this.zzc;
            int i16 = iArr[i14];
            int iZzA4 = zzA(iZzB);
            if (iZzA4 <= 17) {
                int i17 = iArr[i14 + 2];
                int i18 = i17 & i12;
                i10 = 1 << (i17 >>> 20);
                if (i18 != i15) {
                    i13 = unsafe.getInt(obj, i18);
                    i15 = i18;
                }
            } else {
                i10 = 0;
            }
            long j10 = i12 & iZzB;
            switch (iZzA4) {
                case 0:
                    if ((i13 & i10) != 0) {
                        iZzh = zzjl.zzA(i16 << 3) + 8;
                        iZzA3 += iZzh;
                    }
                    break;
                case 1:
                    if ((i13 & i10) != 0) {
                        iZzh = zzjl.zzA(i16 << 3) + 4;
                        iZzA3 += iZzh;
                    }
                    break;
                case 2:
                    if ((i13 & i10) != 0) {
                        jZzC = unsafe.getLong(obj, j10);
                        iZzh = zzjl.zzA(i16 << 3) + zzjl.zzB(jZzC);
                        iZzA3 += iZzh;
                    }
                    break;
                case 3:
                    if ((i13 & i10) != 0) {
                        jZzC = unsafe.getLong(obj, j10);
                        iZzh = zzjl.zzA(i16 << 3) + zzjl.zzB(jZzC);
                        iZzA3 += iZzh;
                    }
                    break;
                case 4:
                    if ((i13 & i10) != 0) {
                        int i19 = unsafe.getInt(obj, j10);
                        iZzA = zzjl.zzA(i16 << 3);
                        iZzy = zzjl.zzv(i19);
                        iZzh = iZzy + iZzA;
                        iZzA3 += iZzh;
                    }
                    break;
                case 5:
                    if ((i13 & i10) != 0) {
                        iZzh = zzjl.zzA(i16 << 3) + 8;
                        iZzA3 += iZzh;
                    }
                    break;
                case 6:
                    if ((i13 & i10) != 0) {
                        iZzh = zzjl.zzA(i16 << 3) + 4;
                        iZzA3 += iZzh;
                    }
                    break;
                case 7:
                    if ((i13 & i10) != 0) {
                        iZzh = zzjl.zzA(i16 << 3) + 1;
                        iZzA3 += iZzh;
                    }
                    break;
                case 8:
                    if ((i13 & i10) != 0) {
                        object = unsafe.getObject(obj, j10);
                        if (!(object instanceof zzjd)) {
                            iZzA = zzjl.zzA(i16 << 3);
                            iZzy = zzjl.zzy((String) object);
                            iZzh = iZzy + iZzA;
                            iZzA3 += iZzh;
                        } else {
                            int iZzA5 = zzjl.zzA(i16 << 3);
                            int iZzd = ((zzjd) object).zzd();
                            iZzA3 = zzjl.zzA(iZzd) + iZzd + iZzA5 + iZzA3;
                        }
                    }
                    break;
                case 9:
                    if ((i13 & i10) != 0) {
                        iZzh = zzly.zzo(i16, unsafe.getObject(obj, j10), zzE(i14));
                        iZzA3 += iZzh;
                    }
                    break;
                case 10:
                    if ((i13 & i10) != 0) {
                        object = unsafe.getObject(obj, j10);
                        int iZzA6 = zzjl.zzA(i16 << 3);
                        int iZzd2 = ((zzjd) object).zzd();
                        iZzA3 = zzjl.zzA(iZzd2) + iZzd2 + iZzA6 + iZzA3;
                    }
                    break;
                case 11:
                    if ((i13 & i10) != 0) {
                        i11 = unsafe.getInt(obj, j10);
                        iZzA = zzjl.zzA(i16 << 3);
                        iZzy = zzjl.zzA(i11);
                        iZzh = iZzy + iZzA;
                        iZzA3 += iZzh;
                    }
                    break;
                case 12:
                    if ((i13 & i10) != 0) {
                        int i110 = unsafe.getInt(obj, j10);
                        iZzA = zzjl.zzA(i16 << 3);
                        iZzy = zzjl.zzv(i110);
                        iZzh = iZzy + iZzA;
                        iZzA3 += iZzh;
                    }
                    break;
                case 13:
                    if ((i13 & i10) != 0) {
                        iZzh = zzjl.zzA(i16 << 3) + 4;
                        iZzA3 += iZzh;
                    }
                    break;
                case 14:
                    if ((i13 & i10) != 0) {
                        iZzh = zzjl.zzA(i16 << 3) + 8;
                        iZzA3 += iZzh;
                    }
                    break;
                case 15:
                    if ((i13 & i10) != 0) {
                        int i20 = unsafe.getInt(obj, j10);
                        iZzA = zzjl.zzA(i16 << 3);
                        i11 = (i20 >> 31) ^ (i20 + i20);
                        iZzy = zzjl.zzA(i11);
                        iZzh = iZzy + iZzA;
                        iZzA3 += iZzh;
                    }
                    break;
                case 16:
                    if ((i10 & i13) != 0) {
                        jZzC2 = unsafe.getLong(obj, j10);
                        iZzh = zzjl.zzB((jZzC2 >> 63) ^ (jZzC2 + jZzC2)) + zzjl.zzA(i16 << 3);
                        iZzA3 += iZzh;
                    }
                    break;
                case 17:
                    if ((i13 & i10) != 0) {
                        iZzh = zzjl.zzu(i16, (zzll) unsafe.getObject(obj, j10), zzE(i14));
                        iZzA3 += iZzh;
                    }
                    break;
                case 18:
                case 23:
                case 32:
                    iZzh = zzly.zzh(i16, (List) unsafe.getObject(obj, j10), false);
                    iZzA3 += iZzh;
                    break;
                case 19:
                case 24:
                case 31:
                    iZzh = zzly.zzf(i16, (List) unsafe.getObject(obj, j10), false);
                    iZzA3 += iZzh;
                    break;
                case 20:
                    iZzh = zzly.zzm(i16, (List) unsafe.getObject(obj, j10), false);
                    iZzA3 += iZzh;
                    break;
                case 21:
                    iZzh = zzly.zzx(i16, (List) unsafe.getObject(obj, j10), false);
                    iZzA3 += iZzh;
                    break;
                case 22:
                    iZzh = zzly.zzk(i16, (List) unsafe.getObject(obj, j10), false);
                    iZzA3 += iZzh;
                    break;
                case 25:
                    iZzh = zzly.zza(i16, (List) unsafe.getObject(obj, j10), false);
                    iZzA3 += iZzh;
                    break;
                case 26:
                    iZzh = zzly.zzu(i16, (List) unsafe.getObject(obj, j10));
                    iZzA3 += iZzh;
                    break;
                case 27:
                    iZzh = zzly.zzp(i16, (List) unsafe.getObject(obj, j10), zzE(i14));
                    iZzA3 += iZzh;
                    break;
                case 28:
                    iZzh = zzly.zzc(i16, (List) unsafe.getObject(obj, j10));
                    iZzA3 += iZzh;
                    break;
                case 29:
                    iZzh = zzly.zzv(i16, (List) unsafe.getObject(obj, j10), false);
                    iZzA3 += iZzh;
                    break;
                case 30:
                    iZzh = zzly.zzd(i16, (List) unsafe.getObject(obj, j10), false);
                    iZzA3 += iZzh;
                    break;
                case 33:
                    iZzh = zzly.zzq(i16, (List) unsafe.getObject(obj, j10), false);
                    iZzA3 += iZzh;
                    break;
                case 34:
                    iZzh = zzly.zzs(i16, (List) unsafe.getObject(obj, j10), false);
                    iZzA3 += iZzh;
                    break;
                case 35:
                    iZzi = zzly.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzA2 = zzjl.zzA(iZzi) + zzjl.zzz(i16) + iZzi;
                        iZzA3 += iZzA2;
                    }
                    break;
                case 36:
                    iZzi = zzly.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzA2 = zzjl.zzA(iZzi) + zzjl.zzz(i16) + iZzi;
                        iZzA3 += iZzA2;
                    }
                    break;
                case 37:
                    iZzi = zzly.zzn((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzA2 = zzjl.zzA(iZzi) + zzjl.zzz(i16) + iZzi;
                        iZzA3 += iZzA2;
                    }
                    break;
                case 38:
                    iZzi = zzly.zzy((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzA2 = zzjl.zzA(iZzi) + zzjl.zzz(i16) + iZzi;
                        iZzA3 += iZzA2;
                    }
                    break;
                case 39:
                    iZzi = zzly.zzl((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzA2 = zzjl.zzA(iZzi) + zzjl.zzz(i16) + iZzi;
                        iZzA3 += iZzA2;
                    }
                    break;
                case 40:
                    iZzi = zzly.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzA2 = zzjl.zzA(iZzi) + zzjl.zzz(i16) + iZzi;
                        iZzA3 += iZzA2;
                    }
                    break;
                case 41:
                    iZzi = zzly.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzA2 = zzjl.zzA(iZzi) + zzjl.zzz(i16) + iZzi;
                        iZzA3 += iZzA2;
                    }
                    break;
                case 42:
                    iZzi = zzly.zzb((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzA2 = zzjl.zzA(iZzi) + zzjl.zzz(i16) + iZzi;
                        iZzA3 += iZzA2;
                    }
                    break;
                case 43:
                    iZzi = zzly.zzw((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzA2 = zzjl.zzA(iZzi) + zzjl.zzz(i16) + iZzi;
                        iZzA3 += iZzA2;
                    }
                    break;
                case 44:
                    iZzi = zzly.zze((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzA2 = zzjl.zzA(iZzi) + zzjl.zzz(i16) + iZzi;
                        iZzA3 += iZzA2;
                    }
                    break;
                case 45:
                    iZzi = zzly.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzA2 = zzjl.zzA(iZzi) + zzjl.zzz(i16) + iZzi;
                        iZzA3 += iZzA2;
                    }
                    break;
                case 46:
                    iZzi = zzly.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzA2 = zzjl.zzA(iZzi) + zzjl.zzz(i16) + iZzi;
                        iZzA3 += iZzA2;
                    }
                    break;
                case 47:
                    iZzi = zzly.zzr((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzA2 = zzjl.zzA(iZzi) + zzjl.zzz(i16) + iZzi;
                        iZzA3 += iZzA2;
                    }
                    break;
                case 48:
                    iZzi = zzly.zzt((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzA2 = zzjl.zzA(iZzi) + zzjl.zzz(i16) + iZzi;
                        iZzA3 += iZzA2;
                    }
                    break;
                case 49:
                    iZzh = zzly.zzj(i16, (List) unsafe.getObject(obj, j10), zzE(i14));
                    iZzA3 += iZzh;
                    break;
                case 50:
                    zzlg.zza(i16, unsafe.getObject(obj, j10), zzF(i14));
                    break;
                case 51:
                    if (zzR(obj, i16, i14)) {
                        iZzh = zzjl.zzA(i16 << 3) + 8;
                        iZzA3 += iZzh;
                    }
                    break;
                case 52:
                    if (zzR(obj, i16, i14)) {
                        iZzh = zzjl.zzA(i16 << 3) + 4;
                        iZzA3 += iZzh;
                    }
                    break;
                case 53:
                    if (zzR(obj, i16, i14)) {
                        jZzC = zzC(obj, j10);
                        iZzh = zzjl.zzA(i16 << 3) + zzjl.zzB(jZzC);
                        iZzA3 += iZzh;
                    }
                    break;
                case 54:
                    if (zzR(obj, i16, i14)) {
                        jZzC = zzC(obj, j10);
                        iZzh = zzjl.zzA(i16 << 3) + zzjl.zzB(jZzC);
                        iZzA3 += iZzh;
                    }
                    break;
                case 55:
                    if (zzR(obj, i16, i14)) {
                        int iZzr2 = zzr(obj, j10);
                        iZzA = zzjl.zzA(i16 << 3);
                        iZzy = zzjl.zzv(iZzr2);
                        iZzh = iZzy + iZzA;
                        iZzA3 += iZzh;
                    }
                    break;
                case 56:
                    if (zzR(obj, i16, i14)) {
                        iZzh = zzjl.zzA(i16 << 3) + 8;
                        iZzA3 += iZzh;
                    }
                    break;
                case 57:
                    if (zzR(obj, i16, i14)) {
                        iZzh = zzjl.zzA(i16 << 3) + 4;
                        iZzA3 += iZzh;
                    }
                    break;
                case 58:
                    if (zzR(obj, i16, i14)) {
                        iZzh = zzjl.zzA(i16 << 3) + 1;
                        iZzA3 += iZzh;
                    }
                    break;
                case 59:
                    if (zzR(obj, i16, i14)) {
                        object2 = unsafe.getObject(obj, j10);
                        if (!(object2 instanceof zzjd)) {
                            iZzA = zzjl.zzA(i16 << 3);
                            iZzy = zzjl.zzy((String) object2);
                            iZzh = iZzy + iZzA;
                            iZzA3 += iZzh;
                        }
                        int iZzA7 = zzjl.zzA(i16 << 3);
                        int iZzd3 = ((zzjd) object2).zzd();
                        iZzA2 = zzjl.zzA(iZzd3) + iZzd3 + iZzA7;
                        iZzA3 += iZzA2;
                        break;
                    }
                    break;
                case 60:
                    if (zzR(obj, i16, i14)) {
                        iZzh = zzly.zzo(i16, unsafe.getObject(obj, j10), zzE(i14));
                        iZzA3 += iZzh;
                    }
                    break;
                case 61:
                    if (zzR(obj, i16, i14)) {
                        object2 = unsafe.getObject(obj, j10);
                        int iZzA8 = zzjl.zzA(i16 << 3);
                        int iZzd4 = ((zzjd) object2).zzd();
                        iZzA2 = zzjl.zzA(iZzd4) + iZzd4 + iZzA8;
                        iZzA3 += iZzA2;
                    }
                    break;
                case 62:
                    if (zzR(obj, i16, i14)) {
                        iZzr = zzr(obj, j10);
                        iZzA = zzjl.zzA(i16 << 3);
                        iZzy = zzjl.zzA(iZzr);
                        iZzh = iZzy + iZzA;
                        iZzA3 += iZzh;
                    }
                    break;
                case 63:
                    if (zzR(obj, i16, i14)) {
                        int iZzr3 = zzr(obj, j10);
                        iZzA = zzjl.zzA(i16 << 3);
                        iZzy = zzjl.zzv(iZzr3);
                        iZzh = iZzy + iZzA;
                        iZzA3 += iZzh;
                    }
                    break;
                case 64:
                    if (zzR(obj, i16, i14)) {
                        iZzh = zzjl.zzA(i16 << 3) + 4;
                        iZzA3 += iZzh;
                    }
                    break;
                case 65:
                    if (zzR(obj, i16, i14)) {
                        iZzh = zzjl.zzA(i16 << 3) + 8;
                        iZzA3 += iZzh;
                    }
                    break;
                case 66:
                    if (zzR(obj, i16, i14)) {
                        int iZzr4 = zzr(obj, j10);
                        iZzA = zzjl.zzA(i16 << 3);
                        iZzr = (iZzr4 >> 31) ^ (iZzr4 + iZzr4);
                        iZzy = zzjl.zzA(iZzr);
                        iZzh = iZzy + iZzA;
                        iZzA3 += iZzh;
                    }
                    break;
                case 67:
                    if (zzR(obj, i16, i14)) {
                        jZzC2 = zzC(obj, j10);
                        iZzh = zzjl.zzB((jZzC2 >> 63) ^ (jZzC2 + jZzC2)) + zzjl.zzA(i16 << 3);
                        iZzA3 += iZzh;
                    }
                    break;
                case 68:
                    if (zzR(obj, i16, i14)) {
                        iZzh = zzjl.zzu(i16, (zzll) unsafe.getObject(obj, j10), zzE(i14));
                        iZzA3 += iZzh;
                    }
                    break;
            }
            i14 += 3;
            i12 = 1048575;
        }
        zzmn zzmnVar = this.zzn;
        int iZza = iZzA3 + zzmnVar.zza(zzmnVar.zzc(obj));
        if (!this.zzh) {
            return iZza;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01ba A[PHI: r4
  0x01ba: PHI (r4v107 int) = 
  (r4v70 int)
  (r4v73 int)
  (r4v76 int)
  (r4v79 int)
  (r4v82 int)
  (r4v85 int)
  (r4v88 int)
  (r4v91 int)
  (r4v94 int)
  (r4v97 int)
  (r4v100 int)
  (r4v103 int)
  (r4v106 int)
  (r4v110 int)
 binds: [B:111:0x01b8, B:108:0x01ab, B:105:0x019e, B:102:0x0191, B:99:0x0184, B:96:0x0177, B:93:0x016a, B:90:0x015d, B:87:0x014f, B:84:0x0141, B:81:0x0133, B:78:0x0125, B:75:0x0117, B:72:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x026c  */
    /* JADX WARN: Code duplicated, block: B:153:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:156:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:167:0x0331  */
    /* JADX WARN: Code duplicated, block: B:176:0x034e  */
    /* JADX WARN: Code duplicated, block: B:184:0x036b  */
    /* JADX WARN: Code duplicated, block: B:188:0x0382  */
    /* JADX WARN: Code duplicated, block: B:191:0x0392  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cc  */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0307, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.measurement.zzjd) != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x031e, code lost:
    
        r5 = com.google.android.gms.internal.measurement.zzjl.zzA(r6 << 3);
        r4 = com.google.android.gms.internal.measurement.zzjl.zzy((java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.measurement.zzjd) != false) goto L162;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzq(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlo.zzq(java.lang.Object):int");
    }

    private static int zzr(Object obj, long j10) {
        return ((Integer) zzmx.zzf(obj, j10)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, zziq zziqVar) throws IOException {
        Unsafe unsafe = zzb;
        Object objZzF = zzF(i12);
        Object object = unsafe.getObject(obj, j10);
        if (!((zzlf) object).zze()) {
            zzlf zzlfVarZzb = zzlf.zza().zzb();
            zzlg.zzb(zzlfVarZzb, object);
            unsafe.putObject(obj, j10, zzlfVarZzb);
        }
        throw null;
    }

    private final int zzt(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, zziq zziqVar) throws IOException {
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
                unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(zzir.zzn(bArr, i10))));
                unsafe.putInt(obj, j11, i13);
                return i10 + 8;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(zzir.zzb(bArr, i10))));
                unsafe.putInt(obj, j11, i13);
                return i10 + 4;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                iZzm = zzir.zzm(bArr, i10, zziqVar);
                jZzc = zziqVar.zzb;
                objValueOf = Long.valueOf(jZzc);
                unsafe.putObject(obj, j10, objValueOf);
                unsafe.putInt(obj, j11, i13);
                return iZzm;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                iZzm = zzir.zzj(bArr, i10, zziqVar);
                iZzb = zziqVar.zza;
                objValueOf = Integer.valueOf(iZzb);
                unsafe.putObject(obj, j10, objValueOf);
                unsafe.putInt(obj, j11, i13);
                return iZzm;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Long.valueOf(zzir.zzn(bArr, i10)));
                unsafe.putInt(obj, j11, i13);
                return i10 + 8;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(zzir.zzb(bArr, i10)));
                unsafe.putInt(obj, j11, i13);
                return i10 + 4;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                iZzm = zzir.zzm(bArr, i10, zziqVar);
                objValueOf = Boolean.valueOf(zziqVar.zzb != 0);
                unsafe.putObject(obj, j10, objValueOf);
                unsafe.putInt(obj, j11, i13);
                return iZzm;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                iZzj = zzir.zzj(bArr, i10, zziqVar);
                int i18 = zziqVar.zza;
                if (i18 == 0) {
                    objZzg = "";
                    unsafe.putObject(obj, j10, objZzg);
                } else {
                    if ((i15 & 536870912) != 0 && !zznc.zzf(bArr, iZzj, iZzj + i18)) {
                        throw zzko.zzc();
                    }
                    unsafe.putObject(obj, j10, new String(bArr, iZzj, i18, zzkm.zzb));
                    iZzj += i18;
                }
                unsafe.putInt(obj, j11, i13);
                return iZzj;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                iZzj = zzir.zzd(zzE(i17), bArr, i10, i11, zziqVar);
                Object object = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                objZzg = zziqVar.zzc;
                if (object != null) {
                    objZzg = zzkm.zzg(object, objZzg);
                }
                unsafe.putObject(obj, j10, objZzg);
                unsafe.putInt(obj, j11, i13);
                return iZzj;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                iZzm = zzir.zza(bArr, i10, zziqVar);
                objValueOf = zziqVar.zzc;
                unsafe.putObject(obj, j10, objValueOf);
                unsafe.putInt(obj, j11, i13);
                return iZzm;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iZzj2 = zzir.zzj(bArr, i10, zziqVar);
                int i19 = zziqVar.zza;
                zzki zzkiVarZzD = zzD(i17);
                if (zzkiVarZzD == null || zzkiVarZzD.zza(i19)) {
                    unsafe.putObject(obj, j10, Integer.valueOf(i19));
                    unsafe.putInt(obj, j11, i13);
                } else {
                    zzd(obj).zzh(i12, Long.valueOf(i19));
                }
                return iZzj2;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                iZzm = zzir.zzj(bArr, i10, zziqVar);
                iZzb = zzjh.zzb(zziqVar.zza);
                objValueOf = Integer.valueOf(iZzb);
                unsafe.putObject(obj, j10, objValueOf);
                unsafe.putInt(obj, j11, i13);
                return iZzm;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                iZzm = zzir.zzm(bArr, i10, zziqVar);
                jZzc = zzjh.zzc(zziqVar.zzb);
                objValueOf = Long.valueOf(jZzc);
                unsafe.putObject(obj, j10, objValueOf);
                unsafe.putInt(obj, j11, i13);
                return iZzm;
            case 68:
                if (i14 != 3) {
                    return i10;
                }
                iZzj = zzir.zzc(zzE(i17), bArr, i10, i11, (i12 & (-8)) | 4, zziqVar);
                Object object2 = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                objZzg = zziqVar.zzc;
                if (object2 != null) {
                    objZzg = zzkm.zzg(object2, objZzg);
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
    private final int zzu(Object obj, byte[] bArr, int i10, int i11, zziq zziqVar) throws IOException {
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
        zziqVar = zziqVar;
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
                iZzk = zzir.zzk(b10, bArr, i30, zziqVar);
                i12 = zziqVar.zza;
            } else {
                i12 = b10;
                iZzk = i30;
            }
            int i31 = i12 >>> 3;
            int i32 = i12 & 7;
            int iZzx = i31 > i27 ? this.zzx(i31, i28 / 3) : this.zzw(i31);
            if (iZzx == i24) {
                i13 = iZzk;
                i14 = i31;
                unsafe = unsafe5;
                i15 = i24;
                i16 = 0;
            } else {
                int[] iArr = this.zzc;
                int i33 = iArr[iZzx + 1];
                int iZzA = zzA(i33);
                Unsafe unsafe6 = unsafe5;
                long j10 = i33 & i25;
                if (iZzA <= 17) {
                    int i34 = iArr[iZzx + 2];
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
                    switch (iZzA) {
                        case 0:
                            i17 = 1048575;
                            i21 = i26;
                            i22 = iZzx;
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
                                zzmx.zzo(obj, j10, Double.longBitsToDouble(zzir.zzn(bArr, i23)));
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
                            i22 = iZzx;
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
                                zzmx.zzp(obj, j10, Float.intBitsToFloat(zzir.zzb(bArr, i23)));
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
                            i22 = iZzx;
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
                                int iZzm = zzir.zzm(bArr, i23, zziqVar);
                                unsafe3.putLong(obj, j10, zziqVar.zzb);
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
                            i22 = iZzx;
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
                                iZzi = zzir.zzj(bArr, i23, zziqVar);
                                iZzb = zziqVar.zza;
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
                            i22 = iZzx;
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
                                unsafe3.putLong(obj, j10, zzir.zzn(bArr, iZzk));
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
                            i22 = iZzx;
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
                                unsafe3.putInt(obj, j10, zzir.zzb(bArr, iZzk));
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
                            i22 = iZzx;
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
                                iZzi = zzir.zzm(bArr, iZzk, zziqVar);
                                zzmx.zzm(obj, j10, zziqVar.zzb != 0);
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
                            i22 = iZzx;
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
                                iZzi = (i33 & 536870912) == 0 ? zzir.zzg(bArr, iZzk, zziqVar) : zzir.zzh(bArr, iZzk, zziqVar);
                                objZzg = zziqVar.zzc;
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
                            i22 = iZzx;
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
                                iZzi = zzir.zzd(this.zzE(i22), bArr, iZzk, i11, zziqVar);
                                Object object = unsafe3.getObject(obj, j10);
                                objZzg = object == null ? zziqVar.zzc : zzkm.zzg(object, zziqVar.zzc);
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
                            i22 = iZzx;
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
                                iZzi = zzir.zza(bArr, iZzk, zziqVar);
                                objZzg = zziqVar.zzc;
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
                            i22 = iZzx;
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
                                iZzi = zzir.zzj(bArr, iZzk, zziqVar);
                                iZzb = zziqVar.zza;
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
                            i22 = iZzx;
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
                                iZzi = zzir.zzj(bArr, iZzk, zziqVar);
                                iZzb = zzjh.zzb(zziqVar.zza);
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
                                i22 = iZzx;
                                i13 = i23;
                                unsafe = unsafe3;
                                i16 = i22;
                                i26 = i21;
                                i15 = -1;
                            } else {
                                int iZzm2 = zzir.zzm(bArr, iZzk, zziqVar);
                                i21 = i26;
                                i14 = i31;
                                i17 = 1048575;
                                unsafe2.putLong(obj, j10, zzjh.zzc(zziqVar.zzb));
                                i29 |= i35;
                                unsafe5 = unsafe2;
                                i28 = iZzx;
                                iZzi = iZzm2;
                                i26 = i21;
                                i27 = i14;
                                i25 = i17;
                                i24 = -1;
                            }
                            break;
                        default:
                            i21 = i26;
                            i22 = iZzx;
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
                    if (iZzA != 27) {
                        i16 = iZzx;
                        if (iZzA <= 49) {
                            i19 = i29;
                            i20 = i38;
                            unsafe = unsafe6;
                            i15 = -1;
                            iZzi = zzv(obj, bArr, i37, i11, i12, i14, i32, i16, i33, iZzA, j10, zziqVar);
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
                            if (iZzA == 50) {
                                if (i32 == 2) {
                                    iZzi = zzs(obj, bArr, i18, i11, i16, j10, zziqVar);
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
                                iZzi = zzt(obj, bArr, i18, i11, i12, i14, i32, i33, iZzA, j10, i16, zziqVar);
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
                        zzkl zzklVarZzd = (zzkl) unsafe6.getObject(obj, j10);
                        if (!zzklVarZzd.zzc()) {
                            int size = zzklVarZzd.size();
                            zzklVarZzd = zzklVarZzd.zzd(size == 0 ? 10 : size + size);
                            unsafe6.putObject(obj, j10, zzklVarZzd);
                        }
                        iZzi = zzir.zze(this.zzE(iZzx), i12, bArr, i37, i11, zzklVarZzd, zziqVar);
                        unsafe5 = unsafe6;
                        i29 = i29;
                        i26 = i38;
                        i27 = i14;
                        i28 = iZzx;
                        i25 = i17;
                        i24 = -1;
                    } else {
                        i16 = iZzx;
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
            iZzi = zzir.zzi(i12, bArr, i13, i11, zzd(obj), zziqVar);
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
        throw zzko.zze();
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
    private final int zzv(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.measurement.zziq r29) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlo.zzv(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.zziq):int");
    }

    private final int zzw(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzz(i10, 0);
    }

    private final int zzx(int i10, int i11) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzz(i10, i11);
    }

    private final int zzy(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzz(int i10, int i11) {
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

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final int zza(Object obj) {
        return this.zzi ? zzq(obj) : zzp(obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dc A[PHI: r3
  0x00dc: PHI (r3v13 java.lang.Object) = (r3v10 java.lang.Object), (r3v14 java.lang.Object) binds: [B:66:0x00da, B:62:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x00e4  */
    @Override // com.google.android.gms.internal.measurement.zzlw
    public final int zzb(Object obj) {
        int i10;
        double dZza;
        float fZzb;
        long jZzd;
        int i11;
        int iZzc;
        boolean zZzw;
        int iHashCode;
        Object objZzf;
        int length = this.zzc.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iZzB = zzB(i13);
            int i14 = this.zzc[i13];
            long j10 = 1048575 & iZzB;
            int iHashCode2 = 37;
            switch (zzA(iZzB)) {
                case 0:
                    i10 = i12 * 53;
                    dZza = zzmx.zza(obj, j10);
                    jZzd = Double.doubleToLongBits(dZza);
                    iHashCode = zzkm.zzc(jZzd);
                    i12 = iHashCode + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    fZzb = zzmx.zzb(obj, j10);
                    iHashCode = Float.floatToIntBits(fZzb);
                    i12 = iHashCode + i10;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i10 = i12 * 53;
                    jZzd = zzmx.zzd(obj, j10);
                    iHashCode = zzkm.zzc(jZzd);
                    i12 = iHashCode + i10;
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i11 = i12 * 53;
                    iZzc = zzmx.zzc(obj, j10);
                    i12 = i11 + iZzc;
                    break;
                case 7:
                    i10 = i12 * 53;
                    zZzw = zzmx.zzw(obj, j10);
                    iHashCode = zzkm.zza(zZzw);
                    i12 = iHashCode + i10;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iHashCode = ((String) zzmx.zzf(obj, j10)).hashCode();
                    i12 = iHashCode + i10;
                    break;
                case 9:
                    objZzf = zzmx.zzf(obj, j10);
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
                    iHashCode = zzmx.zzf(obj, j10).hashCode();
                    i12 = iHashCode + i10;
                    break;
                case 17:
                    objZzf = zzmx.zzf(obj, j10);
                    if (objZzf != null) {
                        iHashCode2 = objZzf.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode2;
                    break;
                case 51:
                    if (zzR(obj, i14, i13)) {
                        i10 = i12 * 53;
                        dZza = zzn(obj, j10);
                        jZzd = Double.doubleToLongBits(dZza);
                        iHashCode = zzkm.zzc(jZzd);
                        i12 = iHashCode + i10;
                    }
                    break;
                case 52:
                    if (zzR(obj, i14, i13)) {
                        i10 = i12 * 53;
                        fZzb = zzo(obj, j10);
                        iHashCode = Float.floatToIntBits(fZzb);
                        i12 = iHashCode + i10;
                    }
                    break;
                case 53:
                    if (zzR(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jZzd = zzC(obj, j10);
                        iHashCode = zzkm.zzc(jZzd);
                        i12 = iHashCode + i10;
                    }
                    break;
                case 54:
                    if (zzR(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jZzd = zzC(obj, j10);
                        iHashCode = zzkm.zzc(jZzd);
                        i12 = iHashCode + i10;
                    }
                    break;
                case 55:
                    if (zzR(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzr(obj, j10);
                        i12 = i11 + iZzc;
                    }
                    break;
                case 56:
                    if (zzR(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jZzd = zzC(obj, j10);
                        iHashCode = zzkm.zzc(jZzd);
                        i12 = iHashCode + i10;
                    }
                    break;
                case 57:
                    if (zzR(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzr(obj, j10);
                        i12 = i11 + iZzc;
                    }
                    break;
                case 58:
                    if (zzR(obj, i14, i13)) {
                        i10 = i12 * 53;
                        zZzw = zzS(obj, j10);
                        iHashCode = zzkm.zza(zZzw);
                        i12 = iHashCode + i10;
                    }
                    break;
                case 59:
                    if (zzR(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iHashCode = ((String) zzmx.zzf(obj, j10)).hashCode();
                        i12 = iHashCode + i10;
                    }
                    break;
                case 60:
                    if (zzR(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iHashCode = zzmx.zzf(obj, j10).hashCode();
                        i12 = iHashCode + i10;
                    }
                    break;
                case 61:
                    if (zzR(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iHashCode = zzmx.zzf(obj, j10).hashCode();
                        i12 = iHashCode + i10;
                    }
                    break;
                case 62:
                    if (zzR(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzr(obj, j10);
                        i12 = i11 + iZzc;
                    }
                    break;
                case 63:
                    if (zzR(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzr(obj, j10);
                        i12 = i11 + iZzc;
                    }
                    break;
                case 64:
                    if (zzR(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzr(obj, j10);
                        i12 = i11 + iZzc;
                    }
                    break;
                case 65:
                    if (zzR(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jZzd = zzC(obj, j10);
                        iHashCode = zzkm.zzc(jZzd);
                        i12 = iHashCode + i10;
                    }
                    break;
                case 66:
                    if (zzR(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzr(obj, j10);
                        i12 = i11 + iZzc;
                    }
                    break;
                case 67:
                    if (zzR(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jZzd = zzC(obj, j10);
                        iHashCode = zzkm.zzc(jZzd);
                        i12 = iHashCode + i10;
                    }
                    break;
                case 68:
                    if (zzR(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iHashCode = zzmx.zzf(obj, j10).hashCode();
                        i12 = iHashCode + i10;
                    }
                    break;
            }
        }
        int iHashCode3 = this.zzn.zzc(obj).hashCode() + (i12 * 53);
        if (!this.zzh) {
            return iHashCode3;
        }
        this.zzo.zza(obj);
        throw null;
    }

    public final int zzc(Object obj, byte[] bArr, int i10, int i11, int i12, zziq zziqVar) throws IOException {
        Unsafe unsafe;
        Object obj2;
        zzlo<T> zzloVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        zziq zziqVar2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        long j10;
        Object objZzg;
        long j11;
        int iZzb;
        int i25;
        int i26;
        zzlo<T> zzloVar2 = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i27 = i11;
        i12 = i12;
        zziq zziqVar3 = zziqVar;
        Unsafe unsafe2 = zzb;
        int iZzi = i10;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = -1;
        int i32 = 1048575;
        while (true) {
            if (iZzi < i27) {
                int i33 = iZzi + 1;
                byte b10 = bArr2[iZzi];
                if (b10 < 0) {
                    int iZzk = zzir.zzk(b10, bArr2, i33, zziqVar3);
                    i13 = zziqVar3.zza;
                    i33 = iZzk;
                } else {
                    i13 = b10;
                }
                int i34 = i13 >>> 3;
                int i35 = i13 & 7;
                int iZzx = i34 > i31 ? zzloVar2.zzx(i34, i29 / 3) : zzloVar2.zzw(i34);
                if (iZzx == -1) {
                    i14 = i34;
                    i15 = i33;
                    i16 = i13;
                    i17 = i30;
                    unsafe = unsafe2;
                    i12 = i12;
                    i18 = 0;
                } else {
                    int[] iArr = zzloVar2.zzc;
                    int i36 = iArr[iZzx + 1];
                    int iZzA = zzA(i36);
                    int i37 = i33;
                    long j12 = i36 & 1048575;
                    if (iZzA <= 17) {
                        int i38 = iArr[iZzx + 2];
                        int i39 = 1 << (i38 >>> 20);
                        int i40 = i38 & 1048575;
                        int i41 = i13;
                        if (i40 != i32) {
                            if (i32 != 1048575) {
                                unsafe2.putInt(obj3, i32, i30);
                            }
                            i30 = unsafe2.getInt(obj3, i40);
                            i32 = i40;
                        } else {
                            i32 = i32;
                        }
                        int i42 = i30;
                        switch (iZzA) {
                            case 0:
                                i19 = iZzx;
                                i14 = i34;
                                i20 = i37;
                                if (i35 == 1) {
                                    zzmx.zzo(obj3, j12, Double.longBitsToDouble(zzir.zzn(bArr2, i20)));
                                    iZzi = i20 + 8;
                                    i30 = i42 | i39;
                                    i31 = i14;
                                    i29 = i19;
                                    i28 = i41;
                                    i32 = i32;
                                    i27 = i11;
                                } else {
                                    i37 = i20;
                                    i12 = i12;
                                    i17 = i42;
                                    unsafe = unsafe2;
                                    i16 = i41;
                                    i15 = i37;
                                    i32 = i32;
                                    i18 = i19;
                                }
                                break;
                            case 1:
                                i19 = iZzx;
                                i14 = i34;
                                i20 = i37;
                                if (i35 == 5) {
                                    zzmx.zzp(obj3, j12, Float.intBitsToFloat(zzir.zzb(bArr2, i20)));
                                    iZzi = i20 + 4;
                                    i30 = i42 | i39;
                                    i31 = i14;
                                    i29 = i19;
                                    i28 = i41;
                                    i32 = i32;
                                    i27 = i11;
                                } else {
                                    i37 = i20;
                                    i12 = i12;
                                    i17 = i42;
                                    unsafe = unsafe2;
                                    i16 = i41;
                                    i15 = i37;
                                    i32 = i32;
                                    i18 = i19;
                                }
                                break;
                            case 2:
                            case 3:
                                i19 = iZzx;
                                i14 = i34;
                                i20 = i37;
                                if (i35 == 0) {
                                    int iZzm = zzir.zzm(bArr2, i20, zziqVar3);
                                    unsafe2.putLong(obj, j12, zziqVar3.zzb);
                                    i30 = i42 | i39;
                                    i31 = i14;
                                    iZzi = iZzm;
                                    i29 = i19;
                                    i28 = i41;
                                    i32 = i32;
                                    i27 = i11;
                                } else {
                                    i37 = i20;
                                    i12 = i12;
                                    i17 = i42;
                                    unsafe = unsafe2;
                                    i16 = i41;
                                    i15 = i37;
                                    i32 = i32;
                                    i18 = i19;
                                }
                                break;
                            case 4:
                            case 11:
                                i19 = iZzx;
                                i14 = i34;
                                i20 = i37;
                                if (i35 == 0) {
                                    iZzi = zzir.zzj(bArr2, i20, zziqVar3);
                                    unsafe2.putInt(obj3, j12, zziqVar3.zza);
                                    i30 = i42 | i39;
                                    i31 = i14;
                                    i29 = i19;
                                    i28 = i41;
                                    i32 = i32;
                                    i27 = i11;
                                } else {
                                    i37 = i20;
                                    i12 = i12;
                                    i17 = i42;
                                    unsafe = unsafe2;
                                    i16 = i41;
                                    i15 = i37;
                                    i32 = i32;
                                    i18 = i19;
                                }
                                break;
                            case 5:
                            case 14:
                                i14 = i34;
                                if (i35 == 1) {
                                    i19 = iZzx;
                                    i41 = i41;
                                    i20 = i37;
                                    unsafe2.putLong(obj, j12, zzir.zzn(bArr2, i37));
                                    iZzi = i20 + 8;
                                    i30 = i42 | i39;
                                    i31 = i14;
                                    i29 = i19;
                                    i28 = i41;
                                    i32 = i32;
                                    i27 = i11;
                                } else {
                                    i19 = iZzx;
                                    i41 = i41;
                                    i37 = i37;
                                    i12 = i12;
                                    i17 = i42;
                                    unsafe = unsafe2;
                                    i16 = i41;
                                    i15 = i37;
                                    i32 = i32;
                                    i18 = i19;
                                }
                                break;
                            case 6:
                            case 13:
                                i21 = i41;
                                i14 = i34;
                                i22 = i37;
                                if (i35 == 5) {
                                    unsafe2.putInt(obj3, j12, zzir.zzb(bArr2, i22));
                                    iZzi = i22 + 4;
                                    i30 = i42 | i39;
                                    i29 = iZzx;
                                    i28 = i21;
                                    i31 = i14;
                                    i12 = i12;
                                } else {
                                    i19 = iZzx;
                                    i37 = i22;
                                    i41 = i21;
                                    i12 = i12;
                                    i17 = i42;
                                    unsafe = unsafe2;
                                    i16 = i41;
                                    i15 = i37;
                                    i32 = i32;
                                    i18 = i19;
                                }
                                break;
                            case 7:
                                i21 = i41;
                                i14 = i34;
                                i22 = i37;
                                if (i35 == 0) {
                                    iZzi = zzir.zzm(bArr2, i22, zziqVar3);
                                    zzmx.zzm(obj3, j12, zziqVar3.zzb != 0);
                                    i30 = i42 | i39;
                                    i29 = iZzx;
                                    i28 = i21;
                                    i31 = i14;
                                    i12 = i12;
                                } else {
                                    i19 = iZzx;
                                    i37 = i22;
                                    i41 = i21;
                                    i12 = i12;
                                    i17 = i42;
                                    unsafe = unsafe2;
                                    i16 = i41;
                                    i15 = i37;
                                    i32 = i32;
                                    i18 = i19;
                                }
                                break;
                            case 8:
                                i21 = i41;
                                i14 = i34;
                                i22 = i37;
                                if (i35 == 2) {
                                    iZzi = (536870912 & i36) == 0 ? zzir.zzg(bArr2, i22, zziqVar3) : zzir.zzh(bArr2, i22, zziqVar3);
                                    unsafe2.putObject(obj3, j12, zziqVar3.zzc);
                                    i30 = i42 | i39;
                                    i29 = iZzx;
                                    i28 = i21;
                                    i31 = i14;
                                    i12 = i12;
                                } else {
                                    i19 = iZzx;
                                    i37 = i22;
                                    i41 = i21;
                                    i12 = i12;
                                    i17 = i42;
                                    unsafe = unsafe2;
                                    i16 = i41;
                                    i15 = i37;
                                    i32 = i32;
                                    i18 = i19;
                                }
                                break;
                            case 9:
                                i23 = iZzx;
                                i21 = i41;
                                i14 = i34;
                                i24 = i37;
                                j10 = j12;
                                if (i35 == 2) {
                                    iZzi = zzir.zzd(zzloVar2.zzE(i23), bArr2, i24, i27, zziqVar3);
                                    objZzg = (i42 & i39) == 0 ? zziqVar3.zzc : zzkm.zzg(unsafe2.getObject(obj3, j10), zziqVar3.zzc);
                                    unsafe2.putObject(obj3, j10, objZzg);
                                    i30 = i42 | i39;
                                    i31 = i14;
                                    i29 = i23;
                                    i28 = i21;
                                    i12 = i12;
                                } else {
                                    i37 = i24;
                                    i19 = i23;
                                    i41 = i21;
                                    i12 = i12;
                                    i17 = i42;
                                    unsafe = unsafe2;
                                    i16 = i41;
                                    i15 = i37;
                                    i32 = i32;
                                    i18 = i19;
                                }
                                break;
                            case 10:
                                i23 = iZzx;
                                i21 = i41;
                                i14 = i34;
                                i24 = i37;
                                j10 = j12;
                                if (i35 == 2) {
                                    iZzi = zzir.zza(bArr2, i24, zziqVar3);
                                    objZzg = zziqVar3.zzc;
                                    unsafe2.putObject(obj3, j10, objZzg);
                                    i30 = i42 | i39;
                                    i31 = i14;
                                    i29 = i23;
                                    i28 = i21;
                                    i12 = i12;
                                } else {
                                    i37 = i24;
                                    i19 = i23;
                                    i41 = i21;
                                    i12 = i12;
                                    i17 = i42;
                                    unsafe = unsafe2;
                                    i16 = i41;
                                    i15 = i37;
                                    i32 = i32;
                                    i18 = i19;
                                }
                                break;
                            case 12:
                                i23 = iZzx;
                                i21 = i41;
                                i14 = i34;
                                i24 = i37;
                                j11 = j12;
                                if (i35 == 0) {
                                    iZzi = zzir.zzj(bArr2, i24, zziqVar3);
                                    iZzb = zziqVar3.zza;
                                    zzki zzkiVarZzD = zzloVar2.zzD(i23);
                                    if (zzkiVarZzD == null || zzkiVarZzD.zza(iZzb)) {
                                        unsafe2.putInt(obj3, j11, iZzb);
                                        i30 = i42 | i39;
                                        i31 = i14;
                                    } else {
                                        zzd(obj).zzh(i21, Long.valueOf(iZzb));
                                        i31 = i14;
                                        i30 = i42;
                                    }
                                    i29 = i23;
                                    i28 = i21;
                                    i12 = i12;
                                } else {
                                    i37 = i24;
                                    i19 = i23;
                                    i41 = i21;
                                    i12 = i12;
                                    i17 = i42;
                                    unsafe = unsafe2;
                                    i16 = i41;
                                    i15 = i37;
                                    i32 = i32;
                                    i18 = i19;
                                }
                                break;
                            case 15:
                                i23 = iZzx;
                                i21 = i41;
                                i14 = i34;
                                i24 = i37;
                                if (i35 == 0) {
                                    iZzi = zzir.zzj(bArr2, i24, zziqVar3);
                                    iZzb = zzjh.zzb(zziqVar3.zza);
                                    j11 = j12;
                                    unsafe2.putInt(obj3, j11, iZzb);
                                    i30 = i42 | i39;
                                    i31 = i14;
                                    i29 = i23;
                                    i28 = i21;
                                    i12 = i12;
                                } else {
                                    i37 = i24;
                                    i19 = i23;
                                    i41 = i21;
                                    i12 = i12;
                                    i17 = i42;
                                    unsafe = unsafe2;
                                    i16 = i41;
                                    i15 = i37;
                                    i32 = i32;
                                    i18 = i19;
                                }
                                break;
                            case 16:
                                if (i35 == 0) {
                                    int iZzm2 = zzir.zzm(bArr2, i37, zziqVar3);
                                    i23 = iZzx;
                                    i21 = i41;
                                    unsafe2.putLong(obj, j12, zzjh.zzc(zziqVar3.zzb));
                                    i30 = i42 | i39;
                                    i31 = i34;
                                    iZzi = iZzm2;
                                    i29 = i23;
                                    i28 = i21;
                                    i12 = i12;
                                } else {
                                    i14 = i34;
                                    i19 = iZzx;
                                    i12 = i12;
                                    i17 = i42;
                                    unsafe = unsafe2;
                                    i16 = i41;
                                    i15 = i37;
                                    i32 = i32;
                                    i18 = i19;
                                }
                                break;
                            default:
                                i19 = iZzx;
                                i14 = i34;
                                i20 = i37;
                                if (i35 == 3) {
                                    iZzi = zzir.zzc(zzloVar2.zzE(i19), bArr, i20, i11, (i14 << 3) | 4, zziqVar);
                                    unsafe2.putObject(obj3, j12, (i42 & i39) == 0 ? zziqVar3.zzc : zzkm.zzg(unsafe2.getObject(obj3, j12), zziqVar3.zzc));
                                    i30 = i42 | i39;
                                    bArr2 = bArr;
                                    i31 = i14;
                                    i29 = i19;
                                    i28 = i41;
                                    i32 = i32;
                                    i27 = i11;
                                } else {
                                    i37 = i20;
                                    i12 = i12;
                                    i17 = i42;
                                    unsafe = unsafe2;
                                    i16 = i41;
                                    i15 = i37;
                                    i32 = i32;
                                    i18 = i19;
                                }
                                break;
                        }
                    } else {
                        int i43 = iZzx;
                        int i44 = i13;
                        if (iZzA != 27) {
                            i17 = i30;
                            i25 = i32;
                            if (iZzA <= 49) {
                                i14 = i34;
                                unsafe = unsafe2;
                                i18 = i43;
                                iZzi = zzv(obj, bArr, i37, i11, i44, i34, i35, i43, i36, iZzA, j12, zziqVar);
                                if (iZzi != i37) {
                                    zzloVar2 = this;
                                    obj3 = obj;
                                    bArr2 = bArr;
                                    i31 = i14;
                                    i27 = i11;
                                    i12 = i12;
                                    zziqVar3 = zziqVar;
                                    i28 = i44;
                                    i29 = i18;
                                    i30 = i17;
                                    i32 = i25;
                                    unsafe2 = unsafe;
                                } else {
                                    i15 = iZzi;
                                    i16 = i44;
                                    i32 = i25;
                                }
                            } else {
                                i14 = i34;
                                unsafe = unsafe2;
                                i26 = i37;
                                i18 = i43;
                                if (iZzA != 50) {
                                    iZzi = zzt(obj, bArr, i26, i11, i44, i14, i35, i36, iZzA, j12, i18, zziqVar);
                                    if (iZzi != i26) {
                                        zzloVar2 = this;
                                        obj3 = obj;
                                        bArr2 = bArr;
                                        i31 = i14;
                                        i27 = i11;
                                        i12 = i12;
                                        zziqVar3 = zziqVar;
                                        i28 = i44;
                                        i29 = i18;
                                        i30 = i17;
                                        i32 = i25;
                                        unsafe2 = unsafe;
                                    } else {
                                        i15 = iZzi;
                                        i16 = i44;
                                        i32 = i25;
                                    }
                                } else if (i35 == 2) {
                                    iZzi = zzs(obj, bArr, i26, i11, i18, j12, zziqVar);
                                    if (iZzi != i26) {
                                        zzloVar2 = this;
                                        obj3 = obj;
                                        bArr2 = bArr;
                                        i31 = i14;
                                        i27 = i11;
                                        i12 = i12;
                                        zziqVar3 = zziqVar;
                                        i28 = i44;
                                        i29 = i18;
                                        i30 = i17;
                                        i32 = i25;
                                        unsafe2 = unsafe;
                                    } else {
                                        i15 = iZzi;
                                        i16 = i44;
                                        i32 = i25;
                                    }
                                }
                            }
                        } else if (i35 == 2) {
                            zzkl zzklVarZzd = (zzkl) unsafe2.getObject(obj3, j12);
                            if (!zzklVarZzd.zzc()) {
                                int size = zzklVarZzd.size();
                                zzklVarZzd = zzklVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj3, j12, zzklVarZzd);
                            }
                            i28 = i44;
                            i32 = i32;
                            iZzi = zzir.zze(zzloVar2.zzE(i43), i28, bArr, i37, i11, zzklVarZzd, zziqVar);
                            bArr2 = bArr;
                            i12 = i12;
                            i31 = i34;
                            i29 = i43;
                            i30 = i30;
                            i32 = i32;
                            i27 = i11;
                        } else {
                            i17 = i30;
                            i25 = i32;
                            i14 = i34;
                            unsafe = unsafe2;
                            i26 = i37;
                            i18 = i43;
                        }
                        i15 = i26;
                        i16 = i44;
                        i32 = i25;
                    }
                }
                if (i16 != i12 || i12 == 0) {
                    if (this.zzh) {
                        zziqVar2 = zziqVar;
                        zzjq zzjqVar = zziqVar2.zzd;
                        if (zzjqVar != zzjq.zza) {
                            i14 = i14;
                            if (zzjqVar.zzb(this.zzg, i14) != null) {
                                throw null;
                            }
                            iZzi = zzir.zzi(i16, bArr, i15, i11, zzd(obj), zziqVar);
                            obj = obj;
                        }
                        i27 = i11;
                        i28 = i16;
                        zzloVar2 = this;
                        zziqVar3 = zziqVar2;
                        i31 = i14;
                        obj3 = obj;
                        i29 = i18;
                        i30 = i17;
                        unsafe2 = unsafe;
                        bArr2 = bArr;
                        i12 = i12;
                    } else {
                        zziqVar2 = zziqVar;
                    }
                    iZzi = zzir.zzi(i16, bArr, i15, i11, zzd(obj), zziqVar);
                    i27 = i11;
                    i28 = i16;
                    zzloVar2 = this;
                    zziqVar3 = zziqVar2;
                    i31 = i14;
                    obj3 = obj;
                    i29 = i18;
                    i30 = i17;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i12 = i12;
                } else {
                    zzloVar = this;
                    obj2 = obj;
                    iZzi = i15;
                    i28 = i16;
                    i30 = i17;
                }
            } else {
                unsafe = unsafe2;
                i12 = i12;
                obj2 = obj3;
                zzloVar = zzloVar2;
            }
        }
        if (i32 != 1048575) {
            unsafe.putInt(obj2, i32, i30);
        }
        for (int i45 = zzloVar.zzk; i45 < zzloVar.zzl; i45++) {
            int i46 = zzloVar.zzj[i45];
            int i47 = zzloVar.zzc[i46];
            Object objZzf = zzmx.zzf(obj2, zzloVar.zzB(i46) & 1048575);
            if (objZzf != null && zzloVar.zzD(i46) != null) {
                throw null;
            }
        }
        if (i12 == 0) {
            if (iZzi != i11) {
                throw zzko.zze();
            }
        } else if (iZzi > i11 || i28 != i12) {
            throw zzko.zze();
        }
        return iZzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final Object zze() {
        return ((zzke) this.zzg).zzl(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final void zzf(Object obj) {
        int i10;
        int i11 = this.zzk;
        while (true) {
            i10 = this.zzl;
            if (i11 >= i10) {
                break;
            }
            long jZzB = zzB(this.zzj[i11]) & 1048575;
            Object objZzf = zzmx.zzf(obj, jZzB);
            if (objZzf != null) {
                ((zzlf) objZzf).zzc();
                zzmx.zzs(obj, jZzB, objZzf);
            }
            i11++;
        }
        int length = this.zzj.length;
        while (i10 < length) {
            this.zzm.zza(obj, this.zzj[i10]);
            i10++;
        }
        this.zzn.zzg(obj);
        if (this.zzh) {
            this.zzo.zzb(obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:41:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c8  */
    @Override // com.google.android.gms.internal.measurement.zzlw
    public final void zzg(Object obj, Object obj2) {
        Objects.requireNonNull(obj2);
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzB = zzB(i10);
            long j10 = 1048575 & iZzB;
            int i11 = this.zzc[i10];
            switch (zzA(iZzB)) {
                case 0:
                    if (zzO(obj2, i10)) {
                        zzmx.zzo(obj, j10, zzmx.zza(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 1:
                    if (zzO(obj2, i10)) {
                        zzmx.zzp(obj, j10, zzmx.zzb(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 2:
                    if (zzO(obj2, i10)) {
                        zzmx.zzr(obj, j10, zzmx.zzd(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 3:
                    if (zzO(obj2, i10)) {
                        zzmx.zzr(obj, j10, zzmx.zzd(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 4:
                    if (zzO(obj2, i10)) {
                        zzmx.zzq(obj, j10, zzmx.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 5:
                    if (zzO(obj2, i10)) {
                        zzmx.zzr(obj, j10, zzmx.zzd(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 6:
                    if (zzO(obj2, i10)) {
                        zzmx.zzq(obj, j10, zzmx.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 7:
                    if (zzO(obj2, i10)) {
                        zzmx.zzm(obj, j10, zzmx.zzw(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 8:
                    if (zzO(obj2, i10)) {
                        zzmx.zzs(obj, j10, zzmx.zzf(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 9:
                case 17:
                    zzH(obj, obj2, i10);
                    break;
                case 10:
                    if (zzO(obj2, i10)) {
                        zzmx.zzs(obj, j10, zzmx.zzf(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 11:
                    if (zzO(obj2, i10)) {
                        zzmx.zzq(obj, j10, zzmx.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 12:
                    if (zzO(obj2, i10)) {
                        zzmx.zzq(obj, j10, zzmx.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 13:
                    if (zzO(obj2, i10)) {
                        zzmx.zzq(obj, j10, zzmx.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 14:
                    if (zzO(obj2, i10)) {
                        zzmx.zzr(obj, j10, zzmx.zzd(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 15:
                    if (zzO(obj2, i10)) {
                        zzmx.zzq(obj, j10, zzmx.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 16:
                    if (zzO(obj2, i10)) {
                        zzmx.zzr(obj, j10, zzmx.zzd(obj2, j10));
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
                    this.zzm.zzb(obj, obj2, j10);
                    break;
                case 50:
                    zzly.zzaa(this.zzq, obj, obj2, j10);
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
                    if (zzR(obj2, i11, i10)) {
                        zzmx.zzs(obj, j10, zzmx.zzf(obj2, j10));
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
                    if (zzR(obj2, i11, i10)) {
                        zzmx.zzs(obj, j10, zzmx.zzf(obj2, j10));
                        zzK(obj, i11, i10);
                    }
                    break;
            }
        }
        zzly.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzly.zzE(this.zzo, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final void zzh(Object obj, byte[] bArr, int i10, int i11, zziq zziqVar) throws IOException {
        if (this.zzi) {
            zzu(obj, bArr, i10, i11, zziqVar);
        } else {
            zzc(obj, bArr, i10, i11, 0, zziqVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:127:0x033c  */
    /* JADX WARN: Code duplicated, block: B:130:0x034f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0364  */
    @Override // com.google.android.gms.internal.measurement.zzlw
    public final void zzi(Object obj, zznf zznfVar) throws IOException {
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
        if (!this.zzi) {
            zzL(obj, zznfVar);
            return;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iZzB = zzB(i10);
            int i11 = this.zzc[i10];
            switch (zzA(iZzB)) {
                case 0:
                    if (zzO(obj, i10)) {
                        dZza = zzmx.zza(obj, iZzB & 1048575);
                        zznfVar.zzf(i11, dZza);
                    }
                    break;
                case 1:
                    if (zzO(obj, i10)) {
                        fZzb = zzmx.zzb(obj, iZzB & 1048575);
                        zznfVar.zzo(i11, fZzb);
                    }
                    break;
                case 2:
                    if (zzO(obj, i10)) {
                        jZzd = zzmx.zzd(obj, iZzB & 1048575);
                        zznfVar.zzt(i11, jZzd);
                    }
                    break;
                case 3:
                    if (zzO(obj, i10)) {
                        jZzd2 = zzmx.zzd(obj, iZzB & 1048575);
                        zznfVar.zzJ(i11, jZzd2);
                    }
                    break;
                case 4:
                    if (zzO(obj, i10)) {
                        iZzc = zzmx.zzc(obj, iZzB & 1048575);
                        zznfVar.zzr(i11, iZzc);
                    }
                    break;
                case 5:
                    if (zzO(obj, i10)) {
                        jZzd3 = zzmx.zzd(obj, iZzB & 1048575);
                        zznfVar.zzm(i11, jZzd3);
                    }
                    break;
                case 6:
                    if (zzO(obj, i10)) {
                        iZzc2 = zzmx.zzc(obj, iZzB & 1048575);
                        zznfVar.zzk(i11, iZzc2);
                    }
                    break;
                case 7:
                    if (zzO(obj, i10)) {
                        zZzw = zzmx.zzw(obj, iZzB & 1048575);
                        zznfVar.zzb(i11, zZzw);
                    }
                    break;
                case 8:
                    if (zzO(obj, i10)) {
                        zzT(i11, zzmx.zzf(obj, iZzB & 1048575), zznfVar);
                    }
                    break;
                case 9:
                    if (zzO(obj, i10)) {
                        zznfVar.zzv(i11, zzmx.zzf(obj, iZzB & 1048575), zzE(i10));
                    }
                    break;
                case 10:
                    if (zzO(obj, i10)) {
                        zznfVar.zzd(i11, (zzjd) zzmx.zzf(obj, iZzB & 1048575));
                    }
                    break;
                case 11:
                    if (zzO(obj, i10)) {
                        iZzc3 = zzmx.zzc(obj, iZzB & 1048575);
                        zznfVar.zzH(i11, iZzc3);
                    }
                    break;
                case 12:
                    if (zzO(obj, i10)) {
                        iZzc4 = zzmx.zzc(obj, iZzB & 1048575);
                        zznfVar.zzi(i11, iZzc4);
                    }
                    break;
                case 13:
                    if (zzO(obj, i10)) {
                        iZzc5 = zzmx.zzc(obj, iZzB & 1048575);
                        zznfVar.zzw(i11, iZzc5);
                    }
                    break;
                case 14:
                    if (zzO(obj, i10)) {
                        jZzd4 = zzmx.zzd(obj, iZzB & 1048575);
                        zznfVar.zzy(i11, jZzd4);
                    }
                    break;
                case 15:
                    if (zzO(obj, i10)) {
                        iZzc6 = zzmx.zzc(obj, iZzB & 1048575);
                        zznfVar.zzA(i11, iZzc6);
                    }
                    break;
                case 16:
                    if (zzO(obj, i10)) {
                        jZzd5 = zzmx.zzd(obj, iZzB & 1048575);
                        zznfVar.zzC(i11, jZzd5);
                    }
                    break;
                case 17:
                    if (zzO(obj, i10)) {
                        zznfVar.zzq(i11, zzmx.zzf(obj, iZzB & 1048575), zzE(i10));
                    }
                    break;
                case 18:
                    zzly.zzJ(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 19:
                    zzly.zzN(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 20:
                    zzly.zzQ(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 21:
                    zzly.zzY(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 22:
                    zzly.zzP(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 23:
                    zzly.zzM(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 24:
                    zzly.zzL(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 25:
                    zzly.zzH(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 26:
                    zzly.zzW(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar);
                    break;
                case 27:
                    zzly.zzR(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, zzE(i10));
                    break;
                case 28:
                    zzly.zzI(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar);
                    break;
                case 29:
                    zzly.zzX(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 30:
                    zzly.zzK(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 31:
                    zzly.zzS(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 32:
                    zzly.zzT(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 33:
                    zzly.zzU(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 34:
                    zzly.zzV(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, false);
                    break;
                case 35:
                    zzly.zzJ(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 36:
                    zzly.zzN(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 37:
                    zzly.zzQ(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 38:
                    zzly.zzY(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 39:
                    zzly.zzP(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 40:
                    zzly.zzM(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 41:
                    zzly.zzL(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 42:
                    zzly.zzH(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 43:
                    zzly.zzX(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 44:
                    zzly.zzK(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 45:
                    zzly.zzS(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 46:
                    zzly.zzT(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 47:
                    zzly.zzU(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 48:
                    zzly.zzV(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, true);
                    break;
                case 49:
                    zzly.zzO(i11, (List) zzmx.zzf(obj, iZzB & 1048575), zznfVar, zzE(i10));
                    break;
                case 50:
                    zzM(zznfVar, i11, zzmx.zzf(obj, iZzB & 1048575), i10);
                    break;
                case 51:
                    if (zzR(obj, i11, i10)) {
                        dZza = zzn(obj, iZzB & 1048575);
                        zznfVar.zzf(i11, dZza);
                    }
                    break;
                case 52:
                    if (zzR(obj, i11, i10)) {
                        fZzb = zzo(obj, iZzB & 1048575);
                        zznfVar.zzo(i11, fZzb);
                    }
                    break;
                case 53:
                    if (zzR(obj, i11, i10)) {
                        jZzd = zzC(obj, iZzB & 1048575);
                        zznfVar.zzt(i11, jZzd);
                    }
                    break;
                case 54:
                    if (zzR(obj, i11, i10)) {
                        jZzd2 = zzC(obj, iZzB & 1048575);
                        zznfVar.zzJ(i11, jZzd2);
                    }
                    break;
                case 55:
                    if (zzR(obj, i11, i10)) {
                        iZzc = zzr(obj, iZzB & 1048575);
                        zznfVar.zzr(i11, iZzc);
                    }
                    break;
                case 56:
                    if (zzR(obj, i11, i10)) {
                        jZzd3 = zzC(obj, iZzB & 1048575);
                        zznfVar.zzm(i11, jZzd3);
                    }
                    break;
                case 57:
                    if (zzR(obj, i11, i10)) {
                        iZzc2 = zzr(obj, iZzB & 1048575);
                        zznfVar.zzk(i11, iZzc2);
                    }
                    break;
                case 58:
                    if (zzR(obj, i11, i10)) {
                        zZzw = zzS(obj, iZzB & 1048575);
                        zznfVar.zzb(i11, zZzw);
                    }
                    break;
                case 59:
                    if (zzR(obj, i11, i10)) {
                        zzT(i11, zzmx.zzf(obj, iZzB & 1048575), zznfVar);
                    }
                    break;
                case 60:
                    if (zzR(obj, i11, i10)) {
                        zznfVar.zzv(i11, zzmx.zzf(obj, iZzB & 1048575), zzE(i10));
                    }
                    break;
                case 61:
                    if (zzR(obj, i11, i10)) {
                        zznfVar.zzd(i11, (zzjd) zzmx.zzf(obj, iZzB & 1048575));
                    }
                    break;
                case 62:
                    if (zzR(obj, i11, i10)) {
                        iZzc3 = zzr(obj, iZzB & 1048575);
                        zznfVar.zzH(i11, iZzc3);
                    }
                    break;
                case 63:
                    if (zzR(obj, i11, i10)) {
                        iZzc4 = zzr(obj, iZzB & 1048575);
                        zznfVar.zzi(i11, iZzc4);
                    }
                    break;
                case 64:
                    if (zzR(obj, i11, i10)) {
                        iZzc5 = zzr(obj, iZzB & 1048575);
                        zznfVar.zzw(i11, iZzc5);
                    }
                    break;
                case 65:
                    if (zzR(obj, i11, i10)) {
                        jZzd4 = zzC(obj, iZzB & 1048575);
                        zznfVar.zzy(i11, jZzd4);
                    }
                    break;
                case 66:
                    if (zzR(obj, i11, i10)) {
                        iZzc6 = zzr(obj, iZzB & 1048575);
                        zznfVar.zzA(i11, iZzc6);
                    }
                    break;
                case 67:
                    if (zzR(obj, i11, i10)) {
                        jZzd5 = zzC(obj, iZzB & 1048575);
                        zznfVar.zzC(i11, jZzd5);
                    }
                    break;
                case 68:
                    if (zzR(obj, i11, i10)) {
                        zznfVar.zzq(i11, zzmx.zzf(obj, iZzB & 1048575), zzE(i10));
                    }
                    break;
            }
        }
        zzmn zzmnVar = this.zzn;
        zzmnVar.zzi(zzmnVar.zzc(obj), zznfVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final boolean zzj(Object obj, Object obj2) {
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iZzB = zzB(i10);
            long j10 = iZzB & 1048575;
            switch (zzA(iZzB)) {
                case 0:
                    if (!zzN(obj, obj2, i10) || Double.doubleToLongBits(zzmx.zza(obj, j10)) != Double.doubleToLongBits(zzmx.zza(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 1:
                    if (!zzN(obj, obj2, i10) || Float.floatToIntBits(zzmx.zzb(obj, j10)) != Float.floatToIntBits(zzmx.zzb(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 2:
                    if (!zzN(obj, obj2, i10) || zzmx.zzd(obj, j10) != zzmx.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 3:
                    if (!zzN(obj, obj2, i10) || zzmx.zzd(obj, j10) != zzmx.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 4:
                    if (!zzN(obj, obj2, i10) || zzmx.zzc(obj, j10) != zzmx.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!zzN(obj, obj2, i10) || zzmx.zzd(obj, j10) != zzmx.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 6:
                    if (!zzN(obj, obj2, i10) || zzmx.zzc(obj, j10) != zzmx.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 7:
                    if (!zzN(obj, obj2, i10) || zzmx.zzw(obj, j10) != zzmx.zzw(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 8:
                    if (!zzN(obj, obj2, i10) || !zzly.zzZ(zzmx.zzf(obj, j10), zzmx.zzf(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 9:
                    if (!zzN(obj, obj2, i10) || !zzly.zzZ(zzmx.zzf(obj, j10), zzmx.zzf(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 10:
                    if (!zzN(obj, obj2, i10) || !zzly.zzZ(zzmx.zzf(obj, j10), zzmx.zzf(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 11:
                    if (!zzN(obj, obj2, i10) || zzmx.zzc(obj, j10) != zzmx.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 12:
                    if (!zzN(obj, obj2, i10) || zzmx.zzc(obj, j10) != zzmx.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 13:
                    if (!zzN(obj, obj2, i10) || zzmx.zzc(obj, j10) != zzmx.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 14:
                    if (!zzN(obj, obj2, i10) || zzmx.zzd(obj, j10) != zzmx.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 15:
                    if (!zzN(obj, obj2, i10) || zzmx.zzc(obj, j10) != zzmx.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 16:
                    if (!zzN(obj, obj2, i10) || zzmx.zzd(obj, j10) != zzmx.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 17:
                    if (!zzN(obj, obj2, i10) || !zzly.zzZ(zzmx.zzf(obj, j10), zzmx.zzf(obj2, j10))) {
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
                    if (!zzly.zzZ(zzmx.zzf(obj, j10), zzmx.zzf(obj2, j10))) {
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
                    long jZzy = zzy(i10) & 1048575;
                    if (zzmx.zzc(obj, jZzy) != zzmx.zzc(obj2, jZzy) || !zzly.zzZ(zzmx.zzf(obj, j10), zzmx.zzf(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
            }
        }
        if (!this.zzn.zzc(obj).equals(this.zzn.zzc(obj2))) {
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
    @Override // com.google.android.gms.internal.measurement.zzlw
    public final boolean zzk(Object obj) {
        int i10;
        int i11;
        List list;
        zzlw zzlwVarZzE;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.zzk) {
            int i16 = this.zzj[i15];
            int i17 = this.zzc[i16];
            int iZzB = zzB(i16);
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
            if ((268435456 & iZzB) != 0 && !zzP(obj, i16, i10, i11, i20)) {
                return false;
            }
            int iZzA = zzA(iZzB);
            if (iZzA == 9 || iZzA == 17) {
                if (zzP(obj, i16, i10, i11, i20) && !zzQ(obj, iZzB, zzE(i16))) {
                    return false;
                }
            } else if (iZzA == 27) {
                list = (List) zzmx.zzf(obj, iZzB & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzlwVarZzE = zzE(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!zzlwVarZzE.zzk(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iZzA == 60 || iZzA == 68) {
                if (zzR(obj, i17, i16) && !zzQ(obj, iZzB, zzE(i16))) {
                    return false;
                }
            } else if (iZzA == 49) {
                list = (List) zzmx.zzf(obj, iZzB & 1048575);
                if (list.isEmpty()) {
                    zzlwVarZzE = zzE(i16);
                    while (i12 < list.size()) {
                        if (!zzlwVarZzE.zzk(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzA == 50 && !((zzlf) zzmx.zzf(obj, iZzB & 1048575)).isEmpty()) {
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
}
