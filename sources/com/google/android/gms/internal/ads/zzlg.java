package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzlg extends zzhq {
    public static final /* synthetic */ int zzc = 0;
    private final int zzd;
    private final int zze;
    private final int[] zzf;
    private final int[] zzg;
    private final zzcw[] zzh;
    private final Object[] zzi;
    private final HashMap zzj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlg(Collection collection, zzvi zzviVar) {
        super(false, zzviVar);
        int iZzc = 0;
        int size = collection.size();
        this.zzf = new int[size];
        this.zzg = new int[size];
        this.zzh = new zzcw[size];
        this.zzi = new Object[size];
        this.zzj = new HashMap();
        Iterator it = collection.iterator();
        int iZzb = 0;
        int i10 = 0;
        while (it.hasNext()) {
            zzkq zzkqVar = (zzkq) it.next();
            this.zzh[i10] = zzkqVar.zza();
            this.zzg[i10] = iZzc;
            this.zzf[i10] = iZzb;
            iZzc += this.zzh[i10].zzc();
            iZzb += this.zzh[i10].zzb();
            this.zzi[i10] = zzkqVar.zzb();
            this.zzj.put(this.zzi[i10], Integer.valueOf(i10));
            i10++;
        }
        this.zzd = iZzc;
        this.zze = iZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public final int zzp(Object obj) {
        Integer num = (Integer) this.zzj.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public final int zzq(int i10) {
        return zzfj.zzb(this.zzf, i10 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public final int zzr(int i10) {
        return zzfj.zzb(this.zzg, i10 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public final int zzs(int i10) {
        return this.zzf[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public final int zzt(int i10) {
        return this.zzg[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public final zzcw zzu(int i10) {
        return this.zzh[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    public final Object zzv(int i10) {
        return this.zzi[i10];
    }

    public final List zzw() {
        return Arrays.asList(this.zzh);
    }
}
