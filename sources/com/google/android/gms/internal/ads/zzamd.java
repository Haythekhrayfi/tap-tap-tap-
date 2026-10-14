package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzamd {
    public long zza;
    public final String zzb;
    public final String zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final long zzg;
    public final List zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    public zzamd(String str, zzakt zzaktVar) {
        String str2 = zzaktVar.zzb;
        long j10 = zzaktVar.zzc;
        long j11 = zzaktVar.zzd;
        long j12 = zzaktVar.zze;
        long j13 = zzaktVar.zzf;
        ?? arrayList = zzaktVar.zzh;
        if (arrayList == 0) {
            Map map = zzaktVar.zzg;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new zzalc((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j10, j11, j12, j13, arrayList);
    }

    private zzamd(String str, String str2, long j10, long j11, long j12, long j13, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j10;
        this.zze = j11;
        this.zzf = j12;
        this.zzg = j13;
        this.zzh = list;
    }

    public static zzamd zza(zzame zzameVar) throws IOException {
        if (zzamg.zze(zzameVar) != 538247942) {
            throw new IOException();
        }
        String strZzh = zzamg.zzh(zzameVar);
        String strZzh2 = zzamg.zzh(zzameVar);
        long jZzf = zzamg.zzf(zzameVar);
        long jZzf2 = zzamg.zzf(zzameVar);
        long jZzf3 = zzamg.zzf(zzameVar);
        long jZzf4 = zzamg.zzf(zzameVar);
        int iZze = zzamg.zze(zzameVar);
        if (iZze < 0) {
            throw new IOException(android.support.v4.media.a.a("readHeaderList size=", iZze));
        }
        List listEmptyList = iZze == 0 ? Collections.emptyList() : new ArrayList();
        for (int i10 = 0; i10 < iZze; i10++) {
            listEmptyList.add(new zzalc(zzamg.zzh(zzameVar).intern(), zzamg.zzh(zzameVar).intern()));
        }
        return new zzamd(strZzh, strZzh2, jZzf, jZzf2, jZzf3, jZzf4, listEmptyList);
    }
}
