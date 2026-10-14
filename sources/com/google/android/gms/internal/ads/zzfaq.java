package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfaq implements zzfvy {
    public final /* synthetic */ zzcez zza;
    public final /* synthetic */ zzfgr zzb;
    public final /* synthetic */ zzeba zzc;

    public zzfaq(zzcez zzcezVar, zzfgr zzfgrVar, zzeba zzebaVar) {
        this.zza = zzcezVar;
        this.zzb = zzfgrVar;
        this.zzc = zzebaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zza(Throwable th) {
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0054  */
    @Override // com.google.android.gms.internal.ads.zzfvy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        if (!this.zza.zzD().zzaj) {
            this.zzb.zzc(str, null);
            return;
        }
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        String str2 = this.zza.zzP().zzb;
        int i10 = 1;
        if (com.google.android.gms.ads.internal.zzt.zzo().zzx(this.zza.getContext())) {
            i10 = 2;
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgb)).booleanValue() && this.zza.zzD().zzT) {
                i10 = 2;
            }
        }
        this.zzc.zzd(new zzebc(jCurrentTimeMillis, str2, str, i10));
    }
}
