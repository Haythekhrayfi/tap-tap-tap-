package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class zzffp implements zzffn {
    private final Context zza;
    private final int zzo;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzp = 2;
    private int zzq = 2;
    private int zze = 0;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private boolean zzm = false;
    private boolean zzn = false;

    public zzffp(Context context, int i10) {
        this.zza = context;
        this.zzo = i10;
    }

    public final synchronized zzffp zzH(int i10) {
        this.zzp = i10;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffn
    public final /* bridge */ /* synthetic */ zzffn zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzq(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffn
    public final /* bridge */ /* synthetic */ zzffn zzb(zzezy zzezyVar) {
        zzr(zzezyVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffn
    public final /* bridge */ /* synthetic */ zzffn zzc(String str) {
        zzs(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffn
    public final /* bridge */ /* synthetic */ zzffn zzd(String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffn
    public final /* bridge */ /* synthetic */ zzffn zze(String str) {
        zzu(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffn
    public final /* bridge */ /* synthetic */ zzffn zzf(boolean z10) {
        zzv(z10);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffn
    public final /* bridge */ /* synthetic */ zzffn zzg(Throwable th) {
        zzw(th);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffn
    public final /* bridge */ /* synthetic */ zzffn zzh() {
        zzx();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffn
    public final /* bridge */ /* synthetic */ zzffn zzi() {
        zzy();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffn
    public final synchronized boolean zzj() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzffn
    public final boolean zzk() {
        return !TextUtils.isEmpty(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzffn
    public final synchronized zzffr zzl() {
        zzffq zzffqVar = null;
        if (this.zzm) {
            return null;
        }
        this.zzm = true;
        if (!this.zzn) {
            zzx();
        }
        if (this.zzc < 0) {
            zzy();
        }
        return new zzffr(this, zzffqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzffn
    public final /* bridge */ /* synthetic */ zzffn zzm(int i10) {
        zzH(i10);
        return this;
    }

    public final synchronized zzffp zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        IBinder iBinder = zzeVar.zze;
        if (iBinder == null) {
            return this;
        }
        zzcuz zzcuzVar = (zzcuz) iBinder;
        String strZzk = zzcuzVar.zzk();
        if (!TextUtils.isEmpty(strZzk)) {
            this.zzf = strZzk;
        }
        String strZzi = zzcuzVar.zzi();
        if (!TextUtils.isEmpty(strZzi)) {
            this.zzg = strZzi;
        }
        return this;
    }

    public final synchronized zzffp zzr(zzezy zzezyVar) {
        if (!TextUtils.isEmpty(zzezyVar.zzb.zzb)) {
            this.zzf = zzezyVar.zzb.zzb;
        }
        for (zzezn zzeznVar : zzezyVar.zza) {
            if (!TextUtils.isEmpty(zzeznVar.zzac)) {
                this.zzg = zzeznVar.zzac;
                break;
            }
        }
        return this;
    }

    public final synchronized zzffp zzs(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzip)).booleanValue()) {
            this.zzl = str;
        }
        return this;
    }

    public final synchronized zzffp zzt(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzffp zzu(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzffp zzv(boolean z10) {
        this.zzd = z10;
        return this;
    }

    public final synchronized zzffp zzw(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzip)).booleanValue()) {
            this.zzk = zzbsw.zzd(th);
            this.zzj = (String) zzfpu.zzc(zzfos.zzc('\n')).zzd(zzbsw.zzc(th)).iterator().next();
        }
        return this;
    }

    public final synchronized zzffp zzx() {
        Configuration configuration;
        this.zze = com.google.android.gms.ads.internal.zzt.zzq().zzn(this.zza);
        Resources resources = this.zza.getResources();
        int i10 = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i10 = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzq = i10;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        this.zzn = true;
        return this;
    }

    public final synchronized zzffp zzy() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        return this;
    }
}
