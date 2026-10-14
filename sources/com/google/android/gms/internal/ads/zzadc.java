package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzadc extends zzade {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzadc() {
        super(new zzaav());
        this.zzb = -9223372036854775807L;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static Double zzg(zzfa zzfaVar) {
        return Double.valueOf(Double.longBitsToDouble(zzfaVar.zzr()));
    }

    private static Object zzh(zzfa zzfaVar, int i10) {
        if (i10 == 0) {
            return zzg(zzfaVar);
        }
        if (i10 == 1) {
            return Boolean.valueOf(zzfaVar.zzk() == 1);
        }
        if (i10 == 2) {
            return zzi(zzfaVar);
        }
        if (i10 != 3) {
            if (i10 == 8) {
                return zzj(zzfaVar);
            }
            if (i10 != 10) {
                if (i10 != 11) {
                    return null;
                }
                Date date = new Date((long) zzg(zzfaVar).doubleValue());
                zzfaVar.zzG(2);
                return date;
            }
            int iZzn = zzfaVar.zzn();
            ArrayList arrayList = new ArrayList(iZzn);
            for (int i11 = 0; i11 < iZzn; i11++) {
                Object objZzh = zzh(zzfaVar, zzfaVar.zzk());
                if (objZzh != null) {
                    arrayList.add(objZzh);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strZzi = zzi(zzfaVar);
            int iZzk = zzfaVar.zzk();
            if (iZzk == 9) {
                return map;
            }
            Object objZzh2 = zzh(zzfaVar, iZzk);
            if (objZzh2 != null) {
                map.put(strZzi, objZzh2);
            }
        }
    }

    private static String zzi(zzfa zzfaVar) {
        int iZzo = zzfaVar.zzo();
        int iZzc = zzfaVar.zzc();
        zzfaVar.zzG(iZzo);
        return new String(zzfaVar.zzH(), iZzc, iZzo);
    }

    private static HashMap zzj(zzfa zzfaVar) {
        int iZzn = zzfaVar.zzn();
        HashMap map = new HashMap(iZzn);
        for (int i10 = 0; i10 < iZzn; i10++) {
            String strZzi = zzi(zzfaVar);
            Object objZzh = zzh(zzfaVar, zzfaVar.zzk());
            if (objZzh != null) {
                map.put(strZzi, objZzh);
            }
        }
        return map;
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final boolean zza(zzfa zzfaVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final boolean zzb(zzfa zzfaVar, long j10) {
        if (zzfaVar.zzk() != 2 || !"onMetaData".equals(zzi(zzfaVar)) || zzfaVar.zza() == 0 || zzfaVar.zzk() != 8) {
            return false;
        }
        HashMap mapZzj = zzj(zzfaVar);
        Object obj = mapZzj.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.zzb = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapZzj.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.zzc = new long[size];
                this.zzd = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.zzc = new long[0];
                        this.zzd = new long[0];
                        break;
                    }
                    this.zzc[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.zzd[i10] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzd;
    }

    public final long[] zze() {
        return this.zzc;
    }
}
