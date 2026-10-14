package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbb {
    public static zzap zza(String str, zzae zzaeVar, zzg zzgVar, List list) {
        String str2;
        byte b10;
        String strZzi;
        zzai zzaiVar;
        switch (str.hashCode()) {
            case -1776922004:
                str2 = "toString";
                b10 = str.equals(str2) ? (byte) 18 : (byte) -1;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str2 = "toString";
                    b10 = 0;
                } else {
                    str2 = "toString";
                }
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    str2 = "toString";
                    b10 = 2;
                } else {
                    str2 = "toString";
                }
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    b10 = 10;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case -895859076:
                if (str.equals("splice")) {
                    b10 = 17;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    b10 = 3;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b10 = 6;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    b10 = 19;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 107868:
                if (str.equals("map")) {
                    b10 = 7;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 111185:
                if (str.equals("pop")) {
                    b10 = 8;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 3267882:
                if (str.equals("join")) {
                    b10 = 5;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 3452698:
                if (str.equals("push")) {
                    b10 = 9;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 3536116:
                if (str.equals("some")) {
                    b10 = 15;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 3536286:
                if (str.equals("sort")) {
                    b10 = 16;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 96891675:
                if (str.equals("every")) {
                    str2 = "toString";
                    b10 = 1;
                } else {
                    str2 = "toString";
                }
                break;
            case 109407362:
                if (str.equals("shift")) {
                    b10 = 13;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b10 = 14;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    b10 = 11;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    b10 = 12;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    b10 = 4;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            default:
                str2 = "toString";
                break;
        }
        double dZzc = 0.0d;
        switch (b10) {
            case 0:
                zzap zzapVarZzd = zzaeVar.zzd();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        zzap zzapVarZzb = zzgVar.zzb((zzap) it.next());
                        if (zzapVarZzb instanceof zzag) {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                        zzae zzaeVar2 = (zzae) zzapVarZzd;
                        int iZzc = zzaeVar2.zzc();
                        if (zzapVarZzb instanceof zzae) {
                            zzae zzaeVar3 = (zzae) zzapVarZzb;
                            Iterator itZzk = zzaeVar3.zzk();
                            while (itZzk.hasNext()) {
                                Integer num = (Integer) itZzk.next();
                                zzaeVar2.zzq(num.intValue() + iZzc, zzaeVar3.zze(num.intValue()));
                            }
                        } else {
                            zzaeVar2.zzq(iZzc, zzapVarZzb);
                        }
                    }
                }
                return zzapVarZzd;
            case 1:
                zzh.zzh("every", 1, list);
                zzap zzapVarZzb2 = zzgVar.zzb((zzap) list.get(0));
                if (zzapVarZzb2 instanceof zzao) {
                    return (zzaeVar.zzc() == 0 || zzb(zzaeVar, zzgVar, (zzao) zzapVarZzb2, Boolean.FALSE, Boolean.TRUE).zzc() == zzaeVar.zzc()) ? zzap.zzk : zzap.zzl;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 2:
                zzh.zzh("filter", 1, list);
                zzap zzapVarZzb3 = zzgVar.zzb((zzap) list.get(0));
                if (!(zzapVarZzb3 instanceof zzao)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (zzaeVar.zzb() == 0) {
                    return new zzae();
                }
                zzap zzapVarZzd2 = zzaeVar.zzd();
                zzae zzaeVarZzb = zzb(zzaeVar, zzgVar, (zzao) zzapVarZzb3, null, Boolean.TRUE);
                zzae zzaeVar4 = new zzae();
                Iterator itZzk2 = zzaeVarZzb.zzk();
                while (itZzk2.hasNext()) {
                    zzaeVar4.zzq(zzaeVar4.zzc(), ((zzae) zzapVarZzd2).zze(((Integer) itZzk2.next()).intValue()));
                }
                return zzaeVar4;
            case 3:
                zzh.zzh("forEach", 1, list);
                zzap zzapVarZzb4 = zzgVar.zzb((zzap) list.get(0));
                if (!(zzapVarZzb4 instanceof zzao)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (zzaeVar.zzb() != 0) {
                    zzb(zzaeVar, zzgVar, (zzao) zzapVarZzb4, null, null);
                }
                return zzap.zzf;
            case 4:
                zzh.zzj("indexOf", 2, list);
                zzap zzapVarZzb5 = zzap.zzf;
                if (!list.isEmpty()) {
                    zzapVarZzb5 = zzgVar.zzb((zzap) list.get(0));
                }
                if (list.size() > 1) {
                    double dZza = zzh.zza(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue());
                    if (dZza >= zzaeVar.zzc()) {
                        return new zzah(Double.valueOf(-1.0d));
                    }
                    dZzc = dZza < 0.0d ? ((double) zzaeVar.zzc()) + dZza : dZza;
                }
                Iterator itZzk3 = zzaeVar.zzk();
                while (itZzk3.hasNext()) {
                    int iIntValue = ((Integer) itZzk3.next()).intValue();
                    double d10 = iIntValue;
                    if (d10 >= dZzc && zzh.zzl(zzaeVar.zze(iIntValue), zzapVarZzb5)) {
                        return new zzah(Double.valueOf(d10));
                    }
                }
                return new zzah(Double.valueOf(-1.0d));
            case 5:
                zzh.zzj("join", 1, list);
                if (zzaeVar.zzc() == 0) {
                    return zzap.zzm;
                }
                if (list.isEmpty()) {
                    strZzi = ",";
                } else {
                    zzap zzapVarZzb6 = zzgVar.zzb((zzap) list.get(0));
                    strZzi = ((zzapVarZzb6 instanceof zzan) || (zzapVarZzb6 instanceof zzau)) ? "" : zzapVarZzb6.zzi();
                }
                return new zzat(zzaeVar.zzj(strZzi));
            case 6:
                zzh.zzj("lastIndexOf", 2, list);
                zzap zzapVarZzb7 = zzap.zzf;
                if (!list.isEmpty()) {
                    zzapVarZzb7 = zzgVar.zzb((zzap) list.get(0));
                }
                double dZzc2 = zzaeVar.zzc() - 1;
                if (list.size() > 1) {
                    zzap zzapVarZzb8 = zzgVar.zzb((zzap) list.get(1));
                    dZzc2 = Double.isNaN(zzapVarZzb8.zzh().doubleValue()) ? zzaeVar.zzc() - 1 : zzh.zza(zzapVarZzb8.zzh().doubleValue());
                    if (dZzc2 < 0.0d) {
                        dZzc2 += (double) zzaeVar.zzc();
                    }
                }
                if (dZzc2 < 0.0d) {
                    return new zzah(Double.valueOf(-1.0d));
                }
                for (int iMin = (int) Math.min(zzaeVar.zzc(), dZzc2); iMin >= 0; iMin--) {
                    if (zzaeVar.zzs(iMin) && zzh.zzl(zzaeVar.zze(iMin), zzapVarZzb7)) {
                        return new zzah(Double.valueOf(iMin));
                    }
                }
                return new zzah(Double.valueOf(-1.0d));
            case 7:
                zzh.zzh("map", 1, list);
                zzap zzapVarZzb9 = zzgVar.zzb((zzap) list.get(0));
                if (zzapVarZzb9 instanceof zzao) {
                    return zzaeVar.zzc() == 0 ? new zzae() : zzb(zzaeVar, zzgVar, (zzao) zzapVarZzb9, null, null);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 8:
                zzh.zzh("pop", 0, list);
                int iZzc2 = zzaeVar.zzc();
                if (iZzc2 == 0) {
                    return zzap.zzf;
                }
                int i10 = iZzc2 - 1;
                zzap zzapVarZze = zzaeVar.zze(i10);
                zzaeVar.zzp(i10);
                return zzapVarZze;
            case 9:
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        zzaeVar.zzq(zzaeVar.zzc(), zzgVar.zzb((zzap) it2.next()));
                    }
                }
                return new zzah(Double.valueOf(zzaeVar.zzc()));
            case 10:
                return zzc(zzaeVar, zzgVar, list, true);
            case 11:
                return zzc(zzaeVar, zzgVar, list, false);
            case 12:
                zzh.zzh("reverse", 0, list);
                int iZzc3 = zzaeVar.zzc();
                if (iZzc3 != 0) {
                    for (int i11 = 0; i11 < iZzc3 / 2; i11++) {
                        if (zzaeVar.zzs(i11)) {
                            zzap zzapVarZze2 = zzaeVar.zze(i11);
                            zzaeVar.zzq(i11, null);
                            int i12 = (iZzc3 - 1) - i11;
                            if (zzaeVar.zzs(i12)) {
                                zzaeVar.zzq(i11, zzaeVar.zze(i12));
                            }
                            zzaeVar.zzq(i12, zzapVarZze2);
                        }
                    }
                }
                return zzaeVar;
            case 13:
                zzh.zzh("shift", 0, list);
                if (zzaeVar.zzc() == 0) {
                    return zzap.zzf;
                }
                zzap zzapVarZze3 = zzaeVar.zze(0);
                zzaeVar.zzp(0);
                return zzapVarZze3;
            case 14:
                zzh.zzj("slice", 2, list);
                if (list.isEmpty()) {
                    return zzaeVar.zzd();
                }
                double dZzc3 = zzaeVar.zzc();
                double dZza2 = zzh.zza(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue());
                double dMax = dZza2 < 0.0d ? Math.max(dZza2 + dZzc3, 0.0d) : Math.min(dZza2, dZzc3);
                if (list.size() == 2) {
                    double dZza3 = zzh.zza(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue());
                    dZzc3 = dZza3 < 0.0d ? Math.max(dZzc3 + dZza3, 0.0d) : Math.min(dZzc3, dZza3);
                }
                zzae zzaeVar5 = new zzae();
                for (int i13 = (int) dMax; i13 < dZzc3; i13++) {
                    zzaeVar5.zzq(zzaeVar5.zzc(), zzaeVar.zze(i13));
                }
                return zzaeVar5;
            case 15:
                zzh.zzh("some", 1, list);
                zzap zzapVarZzb10 = zzgVar.zzb((zzap) list.get(0));
                if (!(zzapVarZzb10 instanceof zzai)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (zzaeVar.zzc() != 0) {
                    zzai zzaiVar2 = (zzai) zzapVarZzb10;
                    Iterator itZzk4 = zzaeVar.zzk();
                    while (itZzk4.hasNext()) {
                        int iIntValue2 = ((Integer) itZzk4.next()).intValue();
                        if (zzaeVar.zzs(iIntValue2) && zzaiVar2.zza(zzgVar, Arrays.asList(zzaeVar.zze(iIntValue2), new zzah(Double.valueOf(iIntValue2)), zzaeVar)).zzg().booleanValue()) {
                            return zzap.zzk;
                        }
                    }
                }
                return zzap.zzl;
            case 16:
                zzh.zzj("sort", 1, list);
                if (zzaeVar.zzc() >= 2) {
                    List listZzm = zzaeVar.zzm();
                    if (list.isEmpty()) {
                        zzaiVar = null;
                    } else {
                        zzap zzapVarZzb11 = zzgVar.zzb((zzap) list.get(0));
                        if (!(zzapVarZzb11 instanceof zzai)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        zzaiVar = (zzai) zzapVarZzb11;
                    }
                    Collections.sort(listZzm, new zzba(zzaiVar, zzgVar));
                    zzaeVar.zzn();
                    Iterator it3 = listZzm.iterator();
                    int i14 = 0;
                    while (it3.hasNext()) {
                        zzaeVar.zzq(i14, (zzap) it3.next());
                        i14++;
                    }
                }
                return zzaeVar;
            case 17:
                if (list.isEmpty()) {
                    return new zzae();
                }
                int iZza = (int) zzh.zza(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue());
                if (iZza < 0) {
                    iZza = Math.max(0, zzaeVar.zzc() + iZza);
                } else if (iZza > zzaeVar.zzc()) {
                    iZza = zzaeVar.zzc();
                }
                int iZzc4 = zzaeVar.zzc();
                zzae zzaeVar6 = new zzae();
                if (list.size() > 1) {
                    int iMax = Math.max(0, (int) zzh.zza(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()));
                    if (iMax > 0) {
                        for (int i15 = iZza; i15 < Math.min(iZzc4, iZza + iMax); i15++) {
                            zzaeVar6.zzq(zzaeVar6.zzc(), zzaeVar.zze(iZza));
                            zzaeVar.zzp(iZza);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i16 = 2; i16 < list.size(); i16++) {
                            zzap zzapVarZzb12 = zzgVar.zzb((zzap) list.get(i16));
                            if (zzapVarZzb12 instanceof zzag) {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                            zzaeVar.zzo((iZza + i16) - 2, zzapVarZzb12);
                        }
                    }
                } else {
                    while (iZza < iZzc4) {
                        zzaeVar6.zzq(zzaeVar6.zzc(), zzaeVar.zze(iZza));
                        zzaeVar.zzq(iZza, null);
                        iZza++;
                    }
                }
                return zzaeVar6;
            case 18:
                zzh.zzh(str2, 0, list);
                return new zzat(zzaeVar.zzj(","));
            case 19:
                if (!list.isEmpty()) {
                    zzae zzaeVar7 = new zzae();
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        zzap zzapVarZzb13 = zzgVar.zzb((zzap) it4.next());
                        if (zzapVarZzb13 instanceof zzag) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        zzaeVar7.zzq(zzaeVar7.zzc(), zzapVarZzb13);
                    }
                    int iZzc5 = zzaeVar7.zzc();
                    Iterator itZzk5 = zzaeVar.zzk();
                    while (itZzk5.hasNext()) {
                        Integer num2 = (Integer) itZzk5.next();
                        zzaeVar7.zzq(num2.intValue() + iZzc5, zzaeVar.zze(num2.intValue()));
                    }
                    zzaeVar.zzn();
                    Iterator itZzk6 = zzaeVar7.zzk();
                    while (itZzk6.hasNext()) {
                        Integer num3 = (Integer) itZzk6.next();
                        zzaeVar.zzq(num3.intValue(), zzaeVar7.zze(num3.intValue()));
                    }
                }
                return new zzah(Double.valueOf(zzaeVar.zzc()));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    private static zzae zzb(zzae zzaeVar, zzg zzgVar, zzai zzaiVar, Boolean bool, Boolean bool2) {
        zzae zzaeVar2 = new zzae();
        Iterator itZzk = zzaeVar.zzk();
        while (itZzk.hasNext()) {
            int iIntValue = ((Integer) itZzk.next()).intValue();
            if (zzaeVar.zzs(iIntValue)) {
                zzap zzapVarZza = zzaiVar.zza(zzgVar, Arrays.asList(zzaeVar.zze(iIntValue), new zzah(Double.valueOf(iIntValue)), zzaeVar));
                if (zzapVarZza.zzg().equals(bool)) {
                    return zzaeVar2;
                }
                if (bool2 == null || zzapVarZza.zzg().equals(bool2)) {
                    zzaeVar2.zzq(iIntValue, zzapVarZza);
                }
            }
        }
        return zzaeVar2;
    }

    private static zzap zzc(zzae zzaeVar, zzg zzgVar, List list, boolean z10) {
        zzap zzapVarZza;
        zzh.zzi("reduce", 1, list);
        zzh.zzj("reduce", 2, list);
        zzap zzapVarZzb = zzgVar.zzb((zzap) list.get(0));
        if (!(zzapVarZzb instanceof zzai)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            zzapVarZza = zzgVar.zzb((zzap) list.get(1));
            if (zzapVarZza instanceof zzag) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (zzaeVar.zzc() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            zzapVarZza = null;
        }
        zzai zzaiVar = (zzai) zzapVarZzb;
        int iZzc = zzaeVar.zzc();
        int i10 = z10 ? 0 : iZzc - 1;
        int i11 = z10 ? iZzc - 1 : 0;
        int i12 = true == z10 ? 1 : -1;
        if (zzapVarZza == null) {
            zzapVarZza = zzaeVar.zze(i10);
            i10 += i12;
        }
        while ((i11 - i10) * i12 >= 0) {
            if (zzaeVar.zzs(i10)) {
                zzapVarZza = zzaiVar.zza(zzgVar, Arrays.asList(zzapVarZza, zzaeVar.zze(i10), new zzah(Double.valueOf(i10)), zzaeVar));
                if (zzapVarZza instanceof zzag) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i10 += i12;
            } else {
                i10 += i12;
            }
        }
        return zzapVarZza;
    }
}
