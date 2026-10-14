package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgy;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zzid;
import com.google.android.gms.measurement.internal.zzlc;
import java.util.List;
import java.util.Map;
import q.a;

/* JADX INFO: loaded from: classes2.dex */
final class zza extends zzd {
    private final zzfy zza;
    private final zzid zzb;

    public zza(zzfy zzfyVar) {
        super(null);
        Preconditions.checkNotNull(zzfyVar);
        this.zza = zzfyVar;
        this.zzb = zzfyVar.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final int zza(String str) {
        this.zzb.zzh(str);
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final long zzb() {
        return this.zza.zzv().zzq();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Boolean zzc() {
        return this.zzb.zzi();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Double zzd() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Integer zze() {
        return this.zzb.zzl();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Long zzf() {
        return this.zzb.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final Object zzg(int i10) {
        if (i10 == 0) {
            return this.zzb.zzr();
        }
        if (i10 == 1) {
            return this.zzb.zzm();
        }
        if (i10 != 2) {
            return i10 != 3 ? this.zzb.zzi() : this.zzb.zzl();
        }
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzh() {
        return this.zzb.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzi() {
        return this.zzb.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzj() {
        return this.zzb.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzk() {
        return this.zzb.zzo();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final String zzl() {
        return this.zzb.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final List zzm(String str, String str2) {
        return this.zzb.zzs(str, str2);
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Map zzn(boolean z10) {
        List<zzlc> listZzt = this.zzb.zzt(z10);
        a aVar = new a(listZzt.size());
        for (zzlc zzlcVar : listZzt) {
            Object objZza = zzlcVar.zza();
            if (objZza != null) {
                aVar.put(zzlcVar.zzb, objZza);
            }
        }
        return aVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final Map zzo(String str, String str2, boolean z10) {
        return this.zzb.zzu(str, str2, z10);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzp(String str) {
        this.zza.zzd().zzd(str, this.zza.zzav().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzq(String str, String str2, Bundle bundle) {
        this.zza.zzq().zzA(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzr(String str) {
        this.zza.zzd().zze(str, this.zza.zzav().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzs(String str, String str2, Bundle bundle) {
        this.zzb.zzD(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzt(String str, String str2, Bundle bundle, long j10) {
        this.zzb.zzE(str, str2, bundle, true, false, j10);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzu(zzgz zzgzVar) {
        this.zzb.zzJ(zzgzVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzv(Bundle bundle) {
        this.zzb.zzP(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzw(zzgy zzgyVar) {
        this.zzb.zzT(zzgyVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzx(zzgz zzgzVar) {
        this.zzb.zzZ(zzgzVar);
    }
}
