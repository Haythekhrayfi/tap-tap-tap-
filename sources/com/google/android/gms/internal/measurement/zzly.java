package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzly {
    private static final Class zza;
    private static final zzmn zzb;
    private static final zzmn zzc;
    private static final zzmn zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzab(false);
        zzc = zzab(true);
        zzd = new zzmp();
    }

    public static zzmn zzA() {
        return zzc;
    }

    public static zzmn zzB() {
        return zzd;
    }

    public static Object zzC(int i10, List list, zzki zzkiVar, Object obj, zzmn zzmnVar) {
        if (zzkiVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int iIntValue = ((Integer) list.get(i12)).intValue();
                if (zzkiVar.zza(iIntValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(iIntValue));
                    }
                    i11++;
                } else {
                    obj = zzD(i10, iIntValue, obj, zzmnVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!zzkiVar.zza(iIntValue2)) {
                    obj = zzD(i10, iIntValue2, obj, zzmnVar);
                    it.remove();
                }
            }
        }
        return obj;
    }

    public static Object zzD(int i10, int i11, Object obj, zzmn zzmnVar) {
        if (obj == null) {
            obj = zzmnVar.zze();
        }
        zzmnVar.zzf(obj, i10, i11);
        return obj;
    }

    public static void zzE(zzjr zzjrVar, Object obj, Object obj2) {
        zzjrVar.zza(obj2);
        throw null;
    }

    public static void zzF(zzmn zzmnVar, Object obj, Object obj2) {
        zzmnVar.zzh(obj, zzmnVar.zzd(zzmnVar.zzc(obj), zzmnVar.zzc(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzke.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzH(int i10, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzc(i10, list, z10);
    }

    public static void zzI(int i10, List list, zznf zznfVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zze(i10, list);
    }

    public static void zzJ(int i10, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzg(i10, list, z10);
    }

    public static void zzK(int i10, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzj(i10, list, z10);
    }

    public static void zzL(int i10, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzl(i10, list, z10);
    }

    public static void zzM(int i10, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzn(i10, list, z10);
    }

    public static void zzN(int i10, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzp(i10, list, z10);
    }

    public static void zzO(int i10, List list, zznf zznfVar, zzlw zzlwVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((zzjm) zznfVar).zzq(i10, list.get(i11), zzlwVar);
        }
    }

    public static void zzP(int i10, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzs(i10, list, z10);
    }

    public static void zzQ(int i10, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzu(i10, list, z10);
    }

    public static void zzR(int i10, List list, zznf zznfVar, zzlw zzlwVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((zzjm) zznfVar).zzv(i10, list.get(i11), zzlwVar);
        }
    }

    public static void zzS(int i10, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzx(i10, list, z10);
    }

    public static void zzT(int i10, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzz(i10, list, z10);
    }

    public static void zzU(int i10, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzB(i10, list, z10);
    }

    public static void zzV(int i10, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzD(i10, list, z10);
    }

    public static void zzW(int i10, List list, zznf zznfVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzG(i10, list);
    }

    public static void zzX(int i10, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzI(i10, list, z10);
    }

    public static void zzY(int i10, List list, zznf zznfVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznfVar.zzK(i10, list, z10);
    }

    public static boolean zzZ(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int zza(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjl.zzA(i10 << 3) + 1) * size;
    }

    public static void zzaa(zzlg zzlgVar, Object obj, Object obj2, long j10) {
        zzmx.zzs(obj, j10, zzlg.zzb(zzmx.zzf(obj, j10), zzmx.zzf(obj2, j10)));
    }

    private static zzmn zzab(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzmn) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int zzb(List list) {
        return list.size();
    }

    public static int zzc(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzz = zzjl.zzz(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzz += zzjl.zzt((zzjd) list.get(i11));
        }
        return iZzz;
    }

    public static int zzd(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjl.zzz(i10) * size) + zze(list);
    }

    public static int zze(List list) {
        int iZzv;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkf) {
            zzkf zzkfVar = (zzkf) list;
            iZzv = 0;
            while (i10 < size) {
                iZzv += zzjl.zzv(zzkfVar.zze(i10));
                i10++;
            }
        } else {
            iZzv = 0;
            while (i10 < size) {
                iZzv += zzjl.zzv(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzv;
    }

    public static int zzf(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjl.zzA(i10 << 3) + 4) * size;
    }

    public static int zzg(List list) {
        return list.size() * 4;
    }

    public static int zzh(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjl.zzA(i10 << 3) + 8) * size;
    }

    public static int zzi(List list) {
        return list.size() * 8;
    }

    public static int zzj(int i10, List list, zzlw zzlwVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzu = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iZzu += zzjl.zzu(i10, (zzll) list.get(i11), zzlwVar);
        }
        return iZzu;
    }

    public static int zzk(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjl.zzz(i10) * size) + zzl(list);
    }

    public static int zzl(List list) {
        int iZzv;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkf) {
            zzkf zzkfVar = (zzkf) list;
            iZzv = 0;
            while (i10 < size) {
                iZzv += zzjl.zzv(zzkfVar.zze(i10));
                i10++;
            }
        } else {
            iZzv = 0;
            while (i10 < size) {
                iZzv += zzjl.zzv(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzv;
    }

    public static int zzm(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzjl.zzz(i10) * list.size()) + zzn(list);
    }

    public static int zzn(List list) {
        int iZzB;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzla) {
            zzla zzlaVar = (zzla) list;
            iZzB = 0;
            while (i10 < size) {
                iZzB += zzjl.zzB(zzlaVar.zza(i10));
                i10++;
            }
        } else {
            iZzB = 0;
            while (i10 < size) {
                iZzB += zzjl.zzB(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iZzB;
    }

    public static int zzo(int i10, Object obj, zzlw zzlwVar) {
        if (!(obj instanceof zzkr)) {
            return zzjl.zzx((zzll) obj, zzlwVar) + zzjl.zzA(i10 << 3);
        }
        int iZzA = zzjl.zzA(i10 << 3);
        int iZza = ((zzkr) obj).zza();
        return zzjl.zzA(iZza) + iZza + iZzA;
    }

    public static int zzp(int i10, List list, zzlw zzlwVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzz = zzjl.zzz(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            iZzz = (obj instanceof zzkr ? zzjl.zzw((zzkr) obj) : zzjl.zzx((zzll) obj, zzlwVar)) + iZzz;
        }
        return iZzz;
    }

    public static int zzq(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjl.zzz(i10) * size) + zzr(list);
    }

    public static int zzr(List list) {
        int iZzA;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkf) {
            zzkf zzkfVar = (zzkf) list;
            iZzA = 0;
            while (i10 < size) {
                int iZze = zzkfVar.zze(i10);
                iZzA += zzjl.zzA((iZze >> 31) ^ (iZze + iZze));
                i10++;
            }
        } else {
            iZzA = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iZzA += zzjl.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
        }
        return iZzA;
    }

    public static int zzs(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjl.zzz(i10) * size) + zzt(list);
    }

    public static int zzt(List list) {
        int iZzB;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzla) {
            zzla zzlaVar = (zzla) list;
            iZzB = 0;
            while (i10 < size) {
                long jZza = zzlaVar.zza(i10);
                iZzB += zzjl.zzB((jZza >> 63) ^ (jZza + jZza));
                i10++;
            }
        } else {
            iZzB = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iZzB += zzjl.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
        }
        return iZzB;
    }

    public static int zzu(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzz = zzjl.zzz(i10) * size;
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            while (i11 < size) {
                Object objZzf = zzktVar.zzf(i11);
                iZzz = (objZzf instanceof zzjd ? zzjl.zzt((zzjd) objZzf) : zzjl.zzy((String) objZzf)) + iZzz;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                iZzz = (obj instanceof zzjd ? zzjl.zzt((zzjd) obj) : zzjl.zzy((String) obj)) + iZzz;
                i11++;
            }
        }
        return iZzz;
    }

    public static int zzv(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjl.zzz(i10) * size) + zzw(list);
    }

    public static int zzw(List list) {
        int iZzA;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkf) {
            zzkf zzkfVar = (zzkf) list;
            iZzA = 0;
            while (i10 < size) {
                iZzA += zzjl.zzA(zzkfVar.zze(i10));
                i10++;
            }
        } else {
            iZzA = 0;
            while (i10 < size) {
                iZzA += zzjl.zzA(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzA;
    }

    public static int zzx(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjl.zzz(i10) * size) + zzy(list);
    }

    public static int zzy(List list) {
        int iZzB;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzla) {
            zzla zzlaVar = (zzla) list;
            iZzB = 0;
            while (i10 < size) {
                iZzB += zzjl.zzB(zzlaVar.zza(i10));
                i10++;
            }
        } else {
            iZzB = 0;
            while (i10 < size) {
                iZzB += zzjl.zzB(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iZzB;
    }

    public static zzmn zzz() {
        return zzb;
    }
}
