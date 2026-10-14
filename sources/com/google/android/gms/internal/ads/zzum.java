package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzum implements zzxy, zztd {
    public final /* synthetic */ zzur zza;
    private final Uri zzc;
    private final zzhf zzd;
    private final zzuh zze;
    private final zzaaz zzf;
    private final zzeb zzg;
    private volatile boolean zzi;
    private long zzk;
    private zzabz zzm;
    private boolean zzn;
    private final zzabs zzh = new zzabs();
    private boolean zzj = true;
    private final long zzb = zztf.zza();
    private zzgj zzl = zzi(0);

    public zzum(zzur zzurVar, Uri uri, zzge zzgeVar, zzuh zzuhVar, zzaaz zzaazVar, zzeb zzebVar) {
        this.zza = zzurVar;
        this.zzc = uri;
        this.zzd = new zzhf(zzgeVar);
        this.zze = zzuhVar;
        this.zzf = zzaazVar;
        this.zzg = zzebVar;
    }

    public static /* bridge */ /* synthetic */ void zzf(zzum zzumVar, long j10, long j11) {
        zzumVar.zzh.zza = j10;
        zzumVar.zzk = j11;
        zzumVar.zzj = true;
        zzumVar.zzn = false;
    }

    private final zzgj zzi(long j10) {
        zzgh zzghVar = new zzgh();
        zzghVar.zzd(this.zzc);
        zzghVar.zzc(j10);
        zzghVar.zza(6);
        zzghVar.zzb(zzur.zzb);
        return zzghVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zztd
    public final void zza(zzfa zzfaVar) {
        long jMax = !this.zzn ? this.zzk : Math.max(zzur.zzq(this.zza, true), this.zzk);
        int iZza = zzfaVar.zza();
        zzabz zzabzVar = this.zzm;
        Objects.requireNonNull(zzabzVar);
        zzabx.zzb(zzabzVar, zzfaVar, iZza);
        zzabzVar.zzs(jMax, 1, iZza, 0, null);
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void zzg() {
        this.zzi = true;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x01c4 */
    @Override // com.google.android.gms.internal.ads.zzxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzum.zzh():void");
    }
}
