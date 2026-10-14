package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzia {
    public static final /* synthetic */ int zzc = 0;

    @Nullable
    private static volatile zzhy zze;
    private static volatile boolean zzf;
    public final zzhx zza;
    public final String zzb;
    private final Object zzj;
    private volatile int zzk = -1;
    private volatile Object zzl;
    private final boolean zzm;
    private static final Object zzd = new Object();
    private static final AtomicReference zzg = new AtomicReference();
    private static final zzic zzh = new zzic(zzhs.zza, null);
    private static final AtomicInteger zzi = new AtomicInteger();

    public /* synthetic */ zzia(zzhx zzhxVar, String str, Object obj, boolean z10, zzhz zzhzVar) {
        if (zzhxVar.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zza = zzhxVar;
        this.zzb = str;
        this.zzj = obj;
        this.zzm = true;
    }

    public static void zzd() {
        zzi.incrementAndGet();
    }

    public static void zze(final Context context) {
        if (zze == null) {
            Object obj = zzd;
            synchronized (obj) {
                if (zze == null) {
                    synchronized (obj) {
                        zzhy zzhyVar = zze;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (zzhyVar == null || zzhyVar.zza() != context) {
                            zzhe.zze();
                            zzib.zzc();
                            zzhm.zze();
                            zze = new zzhb(context, zzil.zza(new zzih() { // from class: com.google.android.gms.internal.measurement.zzhr
                                @Override // com.google.android.gms.internal.measurement.zzih
                                public final Object zza() {
                                    Context context2 = context;
                                    int i10 = zzia.zzc;
                                    return zzhn.zza(context2);
                                }
                            }));
                            zzi.incrementAndGet();
                        }
                    }
                }
            }
        }
    }

    public abstract Object zza(Object obj);

    /* JADX WARN: Code duplicated, block: B:35:0x0096  */
    public final Object zzb() {
        zzhj zzhjVarZza;
        Object objZzb;
        if (!this.zzm) {
            Objects.requireNonNull(this.zzb, "flagName must not be null");
        }
        int i10 = zzi.get();
        if (this.zzk < i10) {
            synchronized (this) {
                if (this.zzk < i10) {
                    zzhy zzhyVar = zze;
                    if (zzhyVar == null) {
                        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                    }
                    zzhx zzhxVar = this.zza;
                    boolean z10 = zzhxVar.zzf;
                    if (zzhxVar.zzb == null) {
                        Context contextZza = zzhyVar.zza();
                        String str = this.zza.zza;
                        zzhjVarZza = zzib.zza(contextZza, null, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhq
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzia.zzd();
                            }
                        });
                    } else if (zzho.zza(zzhyVar.zza(), this.zza.zzb)) {
                        boolean z11 = this.zza.zzh;
                        zzhjVarZza = zzhe.zza(zzhyVar.zza().getContentResolver(), this.zza.zzb, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhq
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzia.zzd();
                            }
                        });
                    } else {
                        zzhjVarZza = null;
                    }
                    Object objZza = (zzhjVarZza == null || (objZzb = zzhjVarZza.zzb(zzc())) == null) ? null : zza(objZzb);
                    if (objZza == null) {
                        if (this.zza.zze) {
                            objZza = null;
                        } else {
                            String strZzc = zzhm.zza(zzhyVar.zza()).zzb(this.zza.zze ? null : this.zzb);
                            if (strZzc != null) {
                                objZza = zza(strZzc);
                            } else {
                                objZza = null;
                            }
                        }
                        if (objZza == null) {
                            objZza = this.zzj;
                        }
                    }
                    zzif zzifVar = (zzif) zzhyVar.zzb().zza();
                    if (zzifVar.zzb()) {
                        zzhg zzhgVar = (zzhg) zzifVar.zza();
                        zzhx zzhxVar2 = this.zza;
                        String strZza = zzhgVar.zza(zzhxVar2.zzb, null, zzhxVar2.zzd, this.zzb);
                        objZza = strZza == null ? this.zzj : zza(strZza);
                    }
                    this.zzl = objZza;
                    this.zzk = i10;
                }
            }
        }
        return this.zzl;
    }

    public final String zzc() {
        String str = this.zza.zzd;
        return this.zzb;
    }
}
