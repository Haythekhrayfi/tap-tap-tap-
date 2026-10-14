package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzug extends zzsx {
    private static final zzbp zza;
    private final zztq[] zzb;
    private final zzcw[] zzc;
    private final ArrayList zzd;
    private final Map zze;
    private final zzfsy zzf;
    private int zzg;
    private long[][] zzh;
    private zzuf zzi;
    private final zzsz zzj;

    static {
        zzar zzarVar = new zzar();
        zzarVar.zza("MergingMediaSource");
        zza = zzarVar.zzc();
    }

    public zzug(boolean z10, boolean z11, zztq... zztqVarArr) {
        zzsz zzszVar = new zzsz();
        this.zzb = zztqVarArr;
        this.zzj = zzszVar;
        this.zzd = new ArrayList(Arrays.asList(zztqVarArr));
        this.zzg = -1;
        this.zzc = new zzcw[zztqVarArr.length];
        this.zzh = new long[0][];
        this.zze = new HashMap();
        this.zzf = zzftg.zzb(8).zzb(2).zza();
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzF(zztm zztmVar) {
        zzue zzueVar = (zzue) zztmVar;
        int i10 = 0;
        while (true) {
            zztq[] zztqVarArr = this.zzb;
            if (i10 >= zztqVarArr.length) {
                return;
            }
            zztqVarArr[i10].zzF(zzueVar.zzn(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final zztm zzH(zzto zztoVar, zzxp zzxpVar, long j10) {
        int length = this.zzb.length;
        zztm[] zztmVarArr = new zztm[length];
        int iZza = this.zzc[0].zza(zztoVar.zza);
        for (int i10 = 0; i10 < length; i10++) {
            zztmVarArr[i10] = this.zzb[i10].zzH(zztoVar.zzc(this.zzc[i10].zzf(iZza)), zzxpVar, j10 - this.zzh[iZza][i10]);
        }
        return new zzue(this.zzj, this.zzh[iZza], zztmVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final zzbp zzI() {
        zztq[] zztqVarArr = this.zzb;
        return zztqVarArr.length > 0 ? zztqVarArr[0].zzI() : zza;
    }

    @Override // com.google.android.gms.internal.ads.zzsx, com.google.android.gms.internal.ads.zzsp
    public final void zzn(zzhg zzhgVar) {
        super.zzn(zzhgVar);
        for (int i10 = 0; i10 < this.zzb.length; i10++) {
            zzA(Integer.valueOf(i10), this.zzb[i10]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsx, com.google.android.gms.internal.ads.zzsp
    public final void zzq() {
        super.zzq();
        Arrays.fill(this.zzc, (Object) null);
        this.zzg = -1;
        this.zzi = null;
        this.zzd.clear();
        Collections.addAll(this.zzd, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzsx
    public final /* bridge */ /* synthetic */ zzto zzx(Object obj, zzto zztoVar) {
        if (((Integer) obj).intValue() == 0) {
            return zztoVar;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzsx, com.google.android.gms.internal.ads.zztq
    public final void zzy() throws IOException {
        zzuf zzufVar = this.zzi;
        if (zzufVar != null) {
            throw zzufVar;
        }
        super.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzsx
    public final /* bridge */ /* synthetic */ void zzz(Object obj, zztq zztqVar, zzcw zzcwVar) {
        int iZzb;
        if (this.zzi != null) {
            return;
        }
        if (this.zzg == -1) {
            iZzb = zzcwVar.zzb();
            this.zzg = iZzb;
        } else {
            int iZzb2 = zzcwVar.zzb();
            int i10 = this.zzg;
            if (iZzb2 != i10) {
                this.zzi = new zzuf(0);
                return;
            }
            iZzb = i10;
        }
        if (this.zzh.length == 0) {
            this.zzh = (long[][]) Array.newInstance((Class<?>) long.class, iZzb, this.zzc.length);
        }
        this.zzd.remove(zztqVar);
        this.zzc[((Integer) obj).intValue()] = zzcwVar;
        if (this.zzd.isEmpty()) {
            zzo(this.zzc[0]);
        }
    }
}
