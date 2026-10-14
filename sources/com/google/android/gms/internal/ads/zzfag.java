package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfag {
    private com.google.android.gms.ads.internal.client.zzl zza;
    private com.google.android.gms.ads.internal.client.zzq zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzfl zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzbef zzh;
    private com.google.android.gms.ads.internal.client.zzw zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;
    private com.google.android.gms.ads.internal.client.zzcb zzl;
    private zzbkr zzn;
    private zzejm zzq;
    private com.google.android.gms.ads.internal.client.zzcf zzs;
    private int zzm = 1;
    private final zzezt zzo = new zzezt();
    private boolean zzp = false;
    private boolean zzr = false;

    public final zzfag zzA(zzbef zzbefVar) {
        this.zzh = zzbefVar;
        return this;
    }

    public final zzfag zzB(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfag zzC(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfag zzD(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zzc();
            this.zzl = publisherAdViewOptions.zza();
        }
        return this;
    }

    public final zzfag zzE(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zza = zzlVar;
        return this;
    }

    public final zzfag zzF(com.google.android.gms.ads.internal.client.zzfl zzflVar) {
        this.zzd = zzflVar;
        return this;
    }

    public final zzfai zzG() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzfai(this, null);
    }

    public final String zzI() {
        return this.zzc;
    }

    public final boolean zzO() {
        return this.zzp;
    }

    public final zzfag zzQ(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        this.zzs = zzcfVar;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzl zze() {
        return this.zza;
    }

    public final com.google.android.gms.ads.internal.client.zzq zzg() {
        return this.zzb;
    }

    public final zzezt zzo() {
        return this.zzo;
    }

    public final zzfag zzp(zzfai zzfaiVar) {
        this.zzo.zza(zzfaiVar.zzo.zza);
        this.zza = zzfaiVar.zzd;
        this.zzb = zzfaiVar.zze;
        this.zzs = zzfaiVar.zzr;
        this.zzc = zzfaiVar.zzf;
        this.zzd = zzfaiVar.zza;
        this.zzf = zzfaiVar.zzg;
        this.zzg = zzfaiVar.zzh;
        this.zzh = zzfaiVar.zzi;
        this.zzi = zzfaiVar.zzj;
        zzq(zzfaiVar.zzl);
        zzD(zzfaiVar.zzm);
        this.zzp = zzfaiVar.zzp;
        this.zzq = zzfaiVar.zzc;
        this.zzr = zzfaiVar.zzq;
        return this;
    }

    public final zzfag zzq(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfag zzr(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.zzb = zzqVar;
        return this;
    }

    public final zzfag zzs(String str) {
        this.zzc = str;
        return this;
    }

    public final zzfag zzt(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi = zzwVar;
        return this;
    }

    public final zzfag zzu(zzejm zzejmVar) {
        this.zzq = zzejmVar;
        return this;
    }

    public final zzfag zzv(zzbkr zzbkrVar) {
        this.zzn = zzbkrVar;
        this.zzd = new com.google.android.gms.ads.internal.client.zzfl(false, true, false);
        return this;
    }

    public final zzfag zzw(boolean z10) {
        this.zzp = z10;
        return this;
    }

    public final zzfag zzx(boolean z10) {
        this.zzr = true;
        return this;
    }

    public final zzfag zzy(boolean z10) {
        this.zze = z10;
        return this;
    }

    public final zzfag zzz(int i10) {
        this.zzm = i10;
        return this;
    }
}
