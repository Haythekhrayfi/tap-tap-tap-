package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzgrr {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzgsg zzc;
    private static final zzgsg zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzgsg zzgsgVar = null;
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
                zzgsgVar = (zzgsg) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzgsgVar;
        zzd = new zzgsi();
    }

    public static Object zzA(Object obj, int i10, List list, zzgpq zzgpqVar, Object obj2, zzgsg zzgsgVar) {
        if (zzgpqVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int iIntValue = ((Integer) list.get(i12)).intValue();
                if (zzgpqVar.zza(iIntValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(iIntValue));
                    }
                    i11++;
                } else {
                    obj2 = zzB(obj, i10, iIntValue, obj2, zzgsgVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!zzgpqVar.zza(iIntValue2)) {
                    obj2 = zzB(obj, i10, iIntValue2, obj2, zzgsgVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Object zzB(Object obj, int i10, int i11, Object obj2, zzgsg zzgsgVar) {
        if (obj2 == null) {
            obj2 = zzgsgVar.zzc(obj);
        }
        zzgsgVar.zzl(obj2, i10, i11);
        return obj2;
    }

    public static void zzC(zzgsg zzgsgVar, Object obj, Object obj2) {
        zzgsgVar.zzo(obj, zzgsgVar.zze(zzgsgVar.zzd(obj), zzgsgVar.zzd(obj2)));
    }

    public static void zzD(Class cls) {
        Class cls2;
        if (!zzgpm.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean zzE(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void zzF(int i10, List list, zzgou zzgouVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgouVar.zzc(i10, list, z10);
    }

    public static void zzG(int i10, List list, zzgou zzgouVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgouVar.zze(i10, list);
    }

    public static void zzH(int i10, List list, zzgou zzgouVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgouVar.zzg(i10, list, z10);
    }

    public static void zzI(int i10, List list, zzgou zzgouVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgouVar.zzj(i10, list, z10);
    }

    public static void zzJ(int i10, List list, zzgou zzgouVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgouVar.zzl(i10, list, z10);
    }

    public static void zzK(int i10, List list, zzgou zzgouVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgouVar.zzn(i10, list, z10);
    }

    public static void zzL(int i10, List list, zzgou zzgouVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgouVar.zzp(i10, list, z10);
    }

    public static void zzM(int i10, List list, zzgou zzgouVar, zzgrp zzgrpVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzgouVar.zzq(i10, list.get(i11), zzgrpVar);
        }
    }

    public static void zzN(int i10, List list, zzgou zzgouVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgouVar.zzs(i10, list, z10);
    }

    public static void zzO(int i10, List list, zzgou zzgouVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgouVar.zzu(i10, list, z10);
    }

    public static void zzP(int i10, List list, zzgou zzgouVar, zzgrp zzgrpVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzgouVar.zzv(i10, list.get(i11), zzgrpVar);
        }
    }

    public static void zzQ(int i10, List list, zzgou zzgouVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgouVar.zzx(i10, list, z10);
    }

    public static void zzR(int i10, List list, zzgou zzgouVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgouVar.zzz(i10, list, z10);
    }

    public static void zzS(int i10, List list, zzgou zzgouVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgouVar.zzB(i10, list, z10);
    }

    public static void zzT(int i10, List list, zzgou zzgouVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgouVar.zzD(i10, list, z10);
    }

    public static void zzU(int i10, List list, zzgou zzgouVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgouVar.zzG(i10, list);
    }

    public static void zzV(int i10, List list, zzgou zzgouVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgouVar.zzI(i10, list, z10);
    }

    public static void zzW(int i10, List list, zzgou zzgouVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgouVar.zzK(i10, list, z10);
    }

    public static int zza(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgot.zzA(i10 << 3) + 1) * size;
    }

    public static int zzb(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzA = zzgot.zzA(i10 << 3) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int iZzd = ((zzgoe) list.get(i11)).zzd();
            iZzA += zzgot.zzA(iZzd) + iZzd;
        }
        return iZzA;
    }

    public static int zzc(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgot.zzA(i10 << 3) * size) + zzd(list);
    }

    public static int zzd(List list) {
        int iZzx;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgpn) {
            zzgpn zzgpnVar = (zzgpn) list;
            iZzx = 0;
            while (i10 < size) {
                iZzx += zzgot.zzx(zzgpnVar.zze(i10));
                i10++;
            }
        } else {
            iZzx = 0;
            while (i10 < size) {
                iZzx += zzgot.zzx(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzx;
    }

    public static int zze(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgot.zzA(i10 << 3) + 4) * size;
    }

    public static int zzf(List list) {
        return list.size() * 4;
    }

    public static int zzg(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgot.zzA(i10 << 3) + 8) * size;
    }

    public static int zzh(List list) {
        return list.size() * 8;
    }

    public static int zzi(int i10, List list, zzgrp zzgrpVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzw = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iZzw += zzgot.zzw(i10, (zzgqw) list.get(i11), zzgrpVar);
        }
        return iZzw;
    }

    public static int zzj(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgot.zzA(i10 << 3) * size) + zzk(list);
    }

    public static int zzk(List list) {
        int iZzx;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgpn) {
            zzgpn zzgpnVar = (zzgpn) list;
            iZzx = 0;
            while (i10 < size) {
                iZzx += zzgot.zzx(zzgpnVar.zze(i10));
                i10++;
            }
        } else {
            iZzx = 0;
            while (i10 < size) {
                iZzx += zzgot.zzx(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzx;
    }

    public static int zzl(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzgot.zzA(i10 << 3) * list.size()) + zzm(list);
    }

    public static int zzm(List list) {
        int iZzB;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgql) {
            zzgql zzgqlVar = (zzgql) list;
            iZzB = 0;
            while (i10 < size) {
                iZzB += zzgot.zzB(zzgqlVar.zze(i10));
                i10++;
            }
        } else {
            iZzB = 0;
            while (i10 < size) {
                iZzB += zzgot.zzB(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iZzB;
    }

    public static int zzn(int i10, Object obj, zzgrp zzgrpVar) {
        if (!(obj instanceof zzgqc)) {
            return zzgot.zzA(i10 << 3) + zzgot.zzy((zzgqw) obj, zzgrpVar);
        }
        int i11 = zzgot.zzf;
        int iZza = ((zzgqc) obj).zza();
        return zzgot.zzA(i10 << 3) + zzgot.zzA(iZza) + iZza;
    }

    public static int zzo(int i10, List list, zzgrp zzgrpVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzA = zzgot.zzA(i10 << 3) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof zzgqc) {
                int iZza = ((zzgqc) obj).zza();
                iZzA = zzgot.zzA(iZza) + iZza + iZzA;
            } else {
                iZzA = zzgot.zzy((zzgqw) obj, zzgrpVar) + iZzA;
            }
        }
        return iZzA;
    }

    public static int zzp(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgot.zzA(i10 << 3) * size) + zzq(list);
    }

    public static int zzq(List list) {
        int iZzA;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgpn) {
            zzgpn zzgpnVar = (zzgpn) list;
            iZzA = 0;
            while (i10 < size) {
                int iZze = zzgpnVar.zze(i10);
                iZzA += zzgot.zzA((iZze >> 31) ^ (iZze + iZze));
                i10++;
            }
        } else {
            iZzA = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iZzA += zzgot.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
        }
        return iZzA;
    }

    public static int zzr(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgot.zzA(i10 << 3) * size) + zzs(list);
    }

    public static int zzs(List list) {
        int iZzB;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgql) {
            zzgql zzgqlVar = (zzgql) list;
            iZzB = 0;
            while (i10 < size) {
                long jZze = zzgqlVar.zze(i10);
                iZzB += zzgot.zzB((jZze >> 63) ^ (jZze + jZze));
                i10++;
            }
        } else {
            iZzB = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iZzB += zzgot.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
        }
        return iZzB;
    }

    public static int zzt(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        boolean z10 = list instanceof zzgqe;
        int iZzA = zzgot.zzA(i10 << 3) * size;
        if (z10) {
            zzgqe zzgqeVar = (zzgqe) list;
            while (i11 < size) {
                Object objZzf = zzgqeVar.zzf(i11);
                if (objZzf instanceof zzgoe) {
                    int iZzd = ((zzgoe) objZzf).zzd();
                    iZzA = zzgot.zzA(iZzd) + iZzd + iZzA;
                } else {
                    iZzA = zzgot.zzz((String) objZzf) + iZzA;
                }
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof zzgoe) {
                    int iZzd2 = ((zzgoe) obj).zzd();
                    iZzA = zzgot.zzA(iZzd2) + iZzd2 + iZzA;
                } else {
                    iZzA = zzgot.zzz((String) obj) + iZzA;
                }
                i11++;
            }
        }
        return iZzA;
    }

    public static int zzu(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgot.zzA(i10 << 3) * size) + zzv(list);
    }

    public static int zzv(List list) {
        int iZzA;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgpn) {
            zzgpn zzgpnVar = (zzgpn) list;
            iZzA = 0;
            while (i10 < size) {
                iZzA += zzgot.zzA(zzgpnVar.zze(i10));
                i10++;
            }
        } else {
            iZzA = 0;
            while (i10 < size) {
                iZzA += zzgot.zzA(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzA;
    }

    public static int zzw(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgot.zzA(i10 << 3) * size) + zzx(list);
    }

    public static int zzx(List list) {
        int iZzB;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgql) {
            zzgql zzgqlVar = (zzgql) list;
            iZzB = 0;
            while (i10 < size) {
                iZzB += zzgot.zzB(zzgqlVar.zze(i10));
                i10++;
            }
        } else {
            iZzB = 0;
            while (i10 < size) {
                iZzB += zzgot.zzB(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iZzB;
    }

    public static zzgsg zzy() {
        return zzc;
    }

    public static zzgsg zzz() {
        return zzd;
    }
}
