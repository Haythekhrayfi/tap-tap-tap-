package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class zznw implements zzoa {
    public static final zzfpx zza = new zzfpx() { // from class: com.google.android.gms.internal.ads.zznu
        @Override // com.google.android.gms.internal.ads.zzfpx
        public final Object zza() {
            return zznw.zzl();
        }
    };
    private static final Random zzb = new Random();
    private final zzcv zzc;
    private final zzct zzd;
    private final HashMap zze;
    private final zzfpx zzf;
    private zznz zzg;
    private zzcw zzh;
    private String zzi;

    public zznw() {
        throw null;
    }

    public zznw(zzfpx zzfpxVar) {
        this.zzf = zzfpxVar;
        this.zzc = new zzcv();
        this.zzd = new zzct();
        this.zze = new HashMap();
        this.zzh = zzcw.zza;
    }

    private final zznv zzk(int i10, zzto zztoVar) {
        long j10 = RecyclerView.FOREVER_NS;
        zznv zznvVar = null;
        for (zznv zznvVar2 : this.zze.values()) {
            zznvVar2.zzg(i10, zztoVar);
            if (zznvVar2.zzj(i10, zztoVar)) {
                long j11 = zznvVar2.zzd;
                if (j11 == -1 || j11 < j10) {
                    zznvVar = zznvVar2;
                    j10 = j11;
                } else if (j11 == j10) {
                    int i11 = zzfj.zza;
                    if (zznvVar.zze != null && zznvVar2.zze != null) {
                        zznvVar = zznvVar2;
                    }
                }
            }
        }
        if (zznvVar != null) {
            return zznvVar;
        }
        String strZzl = zzl();
        zznv zznvVar3 = new zznv(this, strZzl, i10, zztoVar);
        this.zze.put(strZzl, zznvVar3);
        return zznvVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzl() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private final void zzm(zzlt zzltVar) {
        if (zzltVar.zzb.zzo()) {
            this.zzi = null;
            return;
        }
        zznv zznvVar = (zznv) this.zze.get(this.zzi);
        zznv zznvVarZzk = zzk(zzltVar.zzc, zzltVar.zzd);
        this.zzi = zznvVarZzk.zzb;
        zzh(zzltVar);
        zzto zztoVar = zzltVar.zzd;
        if (zztoVar == null || !zztoVar.zzb()) {
            return;
        }
        if (zznvVar != null && zznvVar.zzd == zzltVar.zzd.zzd && zznvVar.zze != null && zznvVar.zze.zzb == zzltVar.zzd.zzb && zznvVar.zze.zzc == zzltVar.zzd.zzc) {
            return;
        }
        zzto zztoVar2 = zzltVar.zzd;
        String unused = zzk(zzltVar.zzc, new zzto(zztoVar2.zza, zztoVar2.zzd)).zzb;
        String unused2 = zznvVarZzk.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzoa
    public final synchronized String zzd() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzoa
    public final synchronized String zze(zzcw zzcwVar, zzto zztoVar) {
        return zzk(zzcwVar.zzn(zztoVar.zza, this.zzd).zzd, zztoVar).zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzoa
    public final synchronized void zzf(zzlt zzltVar) {
        zznz zznzVar;
        this.zzi = null;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zznv zznvVar = (zznv) it.next();
            it.remove();
            if (zznvVar.zzf && (zznzVar = this.zzg) != null) {
                zznzVar.zzd(zzltVar, zznvVar.zzb, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoa
    public final void zzg(zznz zznzVar) {
        this.zzg = zznzVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        if (r10.zzd.zzd < r0.zzd) goto L20;
     */
    @Override // com.google.android.gms.internal.ads.zzoa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzh(com.google.android.gms.internal.ads.zzlt r10) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznw.zzh(com.google.android.gms.internal.ads.zzlt):void");
    }

    @Override // com.google.android.gms.internal.ads.zzoa
    public final synchronized void zzi(zzlt zzltVar, int i10) {
        Objects.requireNonNull(this.zzg);
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zznv zznvVar = (zznv) it.next();
            if (zznvVar.zzk(zzltVar)) {
                it.remove();
                if (zznvVar.zzf) {
                    boolean zEquals = zznvVar.zzb.equals(this.zzi);
                    boolean z10 = false;
                    if (i10 == 0 && zEquals && zznvVar.zzg) {
                        z10 = true;
                    }
                    if (zEquals) {
                        this.zzi = null;
                    }
                    this.zzg.zzd(zzltVar, zznvVar.zzb, z10);
                }
            }
        }
        zzm(zzltVar);
    }

    @Override // com.google.android.gms.internal.ads.zzoa
    public final synchronized void zzj(zzlt zzltVar) {
        Objects.requireNonNull(this.zzg);
        zzcw zzcwVar = this.zzh;
        this.zzh = zzltVar.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zznv zznvVar = (zznv) it.next();
            if (!zznvVar.zzl(zzcwVar, this.zzh) || zznvVar.zzk(zzltVar)) {
                it.remove();
                if (zznvVar.zzf) {
                    if (zznvVar.zzb.equals(this.zzi)) {
                        this.zzi = null;
                    }
                    this.zzg.zzd(zzltVar, zznvVar.zzb, false);
                }
            }
        }
        zzm(zzltVar);
    }
}
