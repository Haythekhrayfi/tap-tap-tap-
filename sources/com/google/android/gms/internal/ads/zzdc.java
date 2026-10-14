package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class zzdc {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private final zzfsc zzh;
    private final zzfsc zzi;
    private final int zzj;
    private final int zzk;
    private final zzfsc zzl;
    private zzfsc zzm;
    private int zzn;
    private final HashMap zzo;
    private final HashSet zzp;

    @Deprecated
    public zzdc() {
        this.zza = Integer.MAX_VALUE;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = Integer.MAX_VALUE;
        this.zzd = Integer.MAX_VALUE;
        this.zze = Integer.MAX_VALUE;
        this.zzf = Integer.MAX_VALUE;
        this.zzg = true;
        this.zzh = zzfsc.zzl();
        this.zzi = zzfsc.zzl();
        this.zzj = Integer.MAX_VALUE;
        this.zzk = Integer.MAX_VALUE;
        this.zzl = zzfsc.zzl();
        this.zzm = zzfsc.zzl();
        this.zzn = 0;
        this.zzo = new HashMap();
        this.zzp = new HashSet();
    }

    public zzdc(zzdd zzddVar) {
        this.zza = Integer.MAX_VALUE;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = Integer.MAX_VALUE;
        this.zzd = Integer.MAX_VALUE;
        this.zze = zzddVar.zzl;
        this.zzf = zzddVar.zzm;
        this.zzg = zzddVar.zzn;
        this.zzh = zzddVar.zzo;
        this.zzi = zzddVar.zzq;
        this.zzj = Integer.MAX_VALUE;
        this.zzk = Integer.MAX_VALUE;
        this.zzl = zzddVar.zzu;
        this.zzm = zzddVar.zzw;
        this.zzn = zzddVar.zzx;
        this.zzp = new HashSet(zzddVar.zzD);
        this.zzo = new HashMap(zzddVar.zzC);
    }

    public final zzdc zzd(Context context) {
        CaptioningManager captioningManager;
        if ((zzfj.zza >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.zzn = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.zzm = zzfsc.zzm(zzfj.zzx(locale));
            }
        }
        return this;
    }

    public zzdc zze(int i10, int i11, boolean z10) {
        this.zze = i10;
        this.zzf = i11;
        this.zzg = true;
        return this;
    }
}
