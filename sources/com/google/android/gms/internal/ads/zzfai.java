package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfai {
    public final com.google.android.gms.ads.internal.client.zzfl zza;
    public final zzbkr zzb;
    public final zzejm zzc;
    public final com.google.android.gms.ads.internal.client.zzl zzd;
    public final com.google.android.gms.ads.internal.client.zzq zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbef zzi;
    public final com.google.android.gms.ads.internal.client.zzw zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final com.google.android.gms.ads.internal.client.zzcb zzn;
    public final zzezv zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final com.google.android.gms.ads.internal.client.zzcf zzr;

    public /* synthetic */ zzfai(zzfag zzfagVar, zzfah zzfahVar) {
        this.zze = zzfagVar.zzb;
        this.zzf = zzfagVar.zzc;
        this.zzr = zzfagVar.zzs;
        int i10 = zzfagVar.zza.zza;
        long j10 = zzfagVar.zza.zzb;
        Bundle bundle = zzfagVar.zza.zzc;
        int i11 = zzfagVar.zza.zzd;
        List list = zzfagVar.zza.zze;
        boolean z10 = zzfagVar.zza.zzf;
        int i12 = zzfagVar.zza.zzg;
        boolean z11 = true;
        if (!zzfagVar.zza.zzh && !zzfagVar.zze) {
            z11 = false;
        }
        this.zzd = new com.google.android.gms.ads.internal.client.zzl(i10, j10, bundle, i11, list, z10, i12, z11, zzfagVar.zza.zzi, zzfagVar.zza.zzj, zzfagVar.zza.zzk, zzfagVar.zza.zzl, zzfagVar.zza.zzm, zzfagVar.zza.zzn, zzfagVar.zza.zzo, zzfagVar.zza.zzp, zzfagVar.zza.zzq, zzfagVar.zza.zzr, zzfagVar.zza.zzs, zzfagVar.zza.zzt, zzfagVar.zza.zzu, zzfagVar.zza.zzv, com.google.android.gms.ads.internal.util.zzs.zza(zzfagVar.zza.zzw), zzfagVar.zza.zzx);
        this.zza = zzfagVar.zzd != null ? zzfagVar.zzd : zzfagVar.zzh != null ? zzfagVar.zzh.zzf : null;
        this.zzg = zzfagVar.zzf;
        this.zzh = zzfagVar.zzg;
        this.zzi = zzfagVar.zzf == null ? null : zzfagVar.zzh == null ? new zzbef(new NativeAdOptions.Builder().build()) : zzfagVar.zzh;
        this.zzj = zzfagVar.zzi;
        this.zzk = zzfagVar.zzm;
        this.zzl = zzfagVar.zzj;
        this.zzm = zzfagVar.zzk;
        this.zzn = zzfagVar.zzl;
        this.zzb = zzfagVar.zzn;
        this.zzo = new zzezv(zzfagVar.zzo, null);
        this.zzp = zzfagVar.zzp;
        this.zzc = zzfagVar.zzq;
        this.zzq = zzfagVar.zzr;
    }

    public final zzbgi zza() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && this.zzl == null) {
            return null;
        }
        return publisherAdViewOptions != null ? publisherAdViewOptions.zzb() : this.zzl.zza();
    }

    public final boolean zzb() {
        return this.zzf.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcO));
    }
}
