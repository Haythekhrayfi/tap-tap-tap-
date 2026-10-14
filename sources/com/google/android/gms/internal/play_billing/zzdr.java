package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzdr {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzeg zzc;
    private static final zzeg zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzeg zzegVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zzegVar = (zzeg) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzegVar;
        zzd = new zzei();
    }

    public static Object zzA(Object obj, int i10, int i11, Object obj2, zzeg zzegVar) {
        if (obj2 == null) {
            obj2 = zzegVar.zzc(obj);
        }
        zzegVar.zzf(obj2, i10, i11);
        return obj2;
    }

    public static void zzB(zzeg zzegVar, Object obj, Object obj2) {
        zzegVar.zzh(obj, zzegVar.zze(zzegVar.zzd(obj), zzegVar.zzd(obj2)));
    }

    public static void zzC(Class cls) {
        Class cls2;
        if (!zzcb.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzD(int i10, List list, zzey zzeyVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeyVar.zzc(i10, list, z10);
    }

    public static void zzE(int i10, List list, zzey zzeyVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeyVar.zze(i10, list);
    }

    public static void zzF(int i10, List list, zzey zzeyVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeyVar.zzg(i10, list, z10);
    }

    public static void zzG(int i10, List list, zzey zzeyVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeyVar.zzj(i10, list, z10);
    }

    public static void zzH(int i10, List list, zzey zzeyVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeyVar.zzl(i10, list, z10);
    }

    public static void zzI(int i10, List list, zzey zzeyVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeyVar.zzn(i10, list, z10);
    }

    public static void zzJ(int i10, List list, zzey zzeyVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeyVar.zzp(i10, list, z10);
    }

    public static void zzK(int i10, List list, zzey zzeyVar, zzdp zzdpVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((zzbj) zzeyVar).zzq(i10, list.get(i11), zzdpVar);
        }
    }

    public static void zzL(int i10, List list, zzey zzeyVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeyVar.zzs(i10, list, z10);
    }

    public static void zzM(int i10, List list, zzey zzeyVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeyVar.zzu(i10, list, z10);
    }

    public static void zzN(int i10, List list, zzey zzeyVar, zzdp zzdpVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((zzbj) zzeyVar).zzv(i10, list.get(i11), zzdpVar);
        }
    }

    public static void zzO(int i10, List list, zzey zzeyVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeyVar.zzx(i10, list, z10);
    }

    public static void zzP(int i10, List list, zzey zzeyVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeyVar.zzz(i10, list, z10);
    }

    public static void zzQ(int i10, List list, zzey zzeyVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeyVar.zzB(i10, list, z10);
    }

    public static void zzR(int i10, List list, zzey zzeyVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeyVar.zzD(i10, list, z10);
    }

    public static void zzS(int i10, List list, zzey zzeyVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeyVar.zzG(i10, list);
    }

    public static void zzT(int i10, List list, zzey zzeyVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeyVar.zzI(i10, list, z10);
    }

    public static void zzU(int i10, List list, zzey zzeyVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzeyVar.zzK(i10, list, z10);
    }

    public static boolean zzV(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int zza(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzbi.zzx(i10 << 3) + 1) * size;
    }

    public static int zzb(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzx = zzbi.zzx(i10 << 3) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int iZzd = ((zzba) list.get(i11)).zzd();
            iZzx += zzbi.zzx(iZzd) + iZzd;
        }
        return iZzx;
    }

    public static int zzc(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzbi.zzx(i10 << 3) * size) + zzd(list);
    }

    public static int zzd(List list) {
        int iZzu;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzcc) {
            zzcc zzccVar = (zzcc) list;
            iZzu = 0;
            while (i10 < size) {
                iZzu += zzbi.zzu(zzccVar.zze(i10));
                i10++;
            }
        } else {
            iZzu = 0;
            while (i10 < size) {
                iZzu += zzbi.zzu(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzu;
    }

    public static int zze(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzbi.zzx(i10 << 3) + 4) * size;
    }

    public static int zzf(List list) {
        return list.size() * 4;
    }

    public static int zzg(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzbi.zzx(i10 << 3) + 8) * size;
    }

    public static int zzh(List list) {
        return list.size() * 8;
    }

    public static int zzi(int i10, List list, zzdp zzdpVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzt = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iZzt += zzbi.zzt(i10, (zzdf) list.get(i11), zzdpVar);
        }
        return iZzt;
    }

    public static int zzj(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzbi.zzx(i10 << 3) * size) + zzk(list);
    }

    public static int zzk(List list) {
        int iZzu;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzcc) {
            zzcc zzccVar = (zzcc) list;
            iZzu = 0;
            while (i10 < size) {
                iZzu += zzbi.zzu(zzccVar.zze(i10));
                i10++;
            }
        } else {
            iZzu = 0;
            while (i10 < size) {
                iZzu += zzbi.zzu(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzu;
    }

    public static int zzl(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzbi.zzx(i10 << 3) * list.size()) + zzm(list);
    }

    public static int zzm(List list) {
        int iZzy;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzcu) {
            zzcu zzcuVar = (zzcu) list;
            iZzy = 0;
            while (i10 < size) {
                iZzy += zzbi.zzy(zzcuVar.zze(i10));
                i10++;
            }
        } else {
            iZzy = 0;
            while (i10 < size) {
                iZzy += zzbi.zzy(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iZzy;
    }

    public static int zzn(int i10, Object obj, zzdp zzdpVar) {
        if (!(obj instanceof zzcl)) {
            return zzbi.zzx(i10 << 3) + zzbi.zzv((zzdf) obj, zzdpVar);
        }
        int i11 = zzbi.zzb;
        int iZza = ((zzcl) obj).zza();
        return zzbi.zzx(i10 << 3) + zzbi.zzx(iZza) + iZza;
    }

    public static int zzo(int i10, List list, zzdp zzdpVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzx = zzbi.zzx(i10 << 3) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof zzcl) {
                int iZza = ((zzcl) obj).zza();
                iZzx = zzbi.zzx(iZza) + iZza + iZzx;
            } else {
                iZzx = zzbi.zzv((zzdf) obj, zzdpVar) + iZzx;
            }
        }
        return iZzx;
    }

    public static int zzp(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzbi.zzx(i10 << 3) * size) + zzq(list);
    }

    public static int zzq(List list) {
        int iZzx;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzcc) {
            zzcc zzccVar = (zzcc) list;
            iZzx = 0;
            while (i10 < size) {
                int iZze = zzccVar.zze(i10);
                iZzx += zzbi.zzx((iZze >> 31) ^ (iZze + iZze));
                i10++;
            }
        } else {
            iZzx = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iZzx += zzbi.zzx((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
        }
        return iZzx;
    }

    public static int zzr(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzbi.zzx(i10 << 3) * size) + zzs(list);
    }

    public static int zzs(List list) {
        int iZzy;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzcu) {
            zzcu zzcuVar = (zzcu) list;
            iZzy = 0;
            while (i10 < size) {
                long jZze = zzcuVar.zze(i10);
                iZzy += zzbi.zzy((jZze >> 63) ^ (jZze + jZze));
                i10++;
            }
        } else {
            iZzy = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iZzy += zzbi.zzy((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
        }
        return iZzy;
    }

    public static int zzt(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        boolean z10 = list instanceof zzcn;
        int iZzx = zzbi.zzx(i10 << 3) * size;
        if (z10) {
            zzcn zzcnVar = (zzcn) list;
            while (i11 < size) {
                Object objZzf = zzcnVar.zzf(i11);
                if (objZzf instanceof zzba) {
                    int iZzd = ((zzba) objZzf).zzd();
                    iZzx = zzbi.zzx(iZzd) + iZzd + iZzx;
                } else {
                    iZzx = zzbi.zzw((String) objZzf) + iZzx;
                }
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof zzba) {
                    int iZzd2 = ((zzba) obj).zzd();
                    iZzx = zzbi.zzx(iZzd2) + iZzd2 + iZzx;
                } else {
                    iZzx = zzbi.zzw((String) obj) + iZzx;
                }
                i11++;
            }
        }
        return iZzx;
    }

    public static int zzu(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzbi.zzx(i10 << 3) * size) + zzv(list);
    }

    public static int zzv(List list) {
        int iZzx;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzcc) {
            zzcc zzccVar = (zzcc) list;
            iZzx = 0;
            while (i10 < size) {
                iZzx += zzbi.zzx(zzccVar.zze(i10));
                i10++;
            }
        } else {
            iZzx = 0;
            while (i10 < size) {
                iZzx += zzbi.zzx(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzx;
    }

    public static int zzw(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzbi.zzx(i10 << 3) * size) + zzx(list);
    }

    public static int zzx(List list) {
        int iZzy;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzcu) {
            zzcu zzcuVar = (zzcu) list;
            iZzy = 0;
            while (i10 < size) {
                iZzy += zzbi.zzy(zzcuVar.zze(i10));
                i10++;
            }
        } else {
            iZzy = 0;
            while (i10 < size) {
                iZzy += zzbi.zzy(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iZzy;
    }

    public static zzeg zzy() {
        return zzc;
    }

    public static zzeg zzz() {
        return zzd;
    }
}
