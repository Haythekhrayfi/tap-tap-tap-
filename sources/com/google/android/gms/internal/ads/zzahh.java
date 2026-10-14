package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
final class zzahh implements zzabv {
    public final /* synthetic */ zzahi zza;

    public /* synthetic */ zzahh(zzahi zzahiVar, zzahg zzahgVar) {
        this.zza = zzahiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final long zze() {
        zzahi zzahiVar = this.zza;
        return zzahiVar.zzd.zzf(zzahiVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final zzabt zzg(long j10) {
        zzahi zzahiVar = this.zza;
        long jZzg = zzahiVar.zzd.zzg(j10);
        long j11 = zzahiVar.zzb;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(jZzg);
        zzahi zzahiVar2 = this.zza;
        long jLongValue = bigIntegerValueOf.multiply(BigInteger.valueOf(zzahiVar2.zzc - zzahiVar2.zzb)).divide(BigInteger.valueOf(this.zza.zzf)).longValue() + j11;
        zzahi zzahiVar3 = this.zza;
        zzabw zzabwVar = new zzabw(j10, Math.max(zzahiVar3.zzb, Math.min(jLongValue - 30000, zzahiVar3.zzc - 1)));
        return new zzabt(zzabwVar, zzabwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final boolean zzh() {
        return true;
    }
}
