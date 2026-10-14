package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzaw;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.util.zzcg;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zzauu;
import com.google.android.gms.internal.ads.zzawh;
import com.google.android.gms.internal.ads.zzaww;
import com.google.android.gms.internal.ads.zzbbv;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzbmq;
import com.google.android.gms.internal.ads.zzbns;
import com.google.android.gms.internal.ads.zzbum;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcak;
import com.google.android.gms.internal.ads.zzcar;
import com.google.android.gms.internal.ads.zzcde;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzeby;
import com.google.android.gms.internal.ads.zzebz;

/* JADX INFO: loaded from: classes.dex */
public final class zzt {
    private static final zzt zza = new zzt();
    private final zzbxw zzA;
    private final zzcg zzB;
    private final zzcde zzC;
    private final zzcar zzD;
    private final com.google.android.gms.ads.internal.overlay.zza zzb;
    private final com.google.android.gms.ads.internal.overlay.zzm zzc;
    private final com.google.android.gms.ads.internal.util.zzs zzd;
    private final zzcfl zze;
    private final zzaa zzf;
    private final zzauu zzg;
    private final zzbza zzh;
    private final zzab zzi;
    private final zzawh zzj;
    private final Clock zzk;
    private final zze zzl;
    private final zzbbv zzm;
    private final zzaw zzn;
    private final zzbum zzo;
    private final zzblf zzp;
    private final zzcak zzq;
    private final zzbmq zzr;
    private final zzw zzs;
    private final zzbv zzt;
    private final com.google.android.gms.ads.internal.overlay.zzaa zzu;
    private final com.google.android.gms.ads.internal.overlay.zzab zzv;
    private final zzbns zzw;
    private final zzbw zzx;
    private final zzebz zzy;
    private final zzaww zzz;

    public zzt() {
        com.google.android.gms.ads.internal.overlay.zza zzaVar = new com.google.android.gms.ads.internal.overlay.zza();
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = new com.google.android.gms.ads.internal.overlay.zzm();
        com.google.android.gms.ads.internal.util.zzs zzsVar = new com.google.android.gms.ads.internal.util.zzs();
        zzcfl zzcflVar = new zzcfl();
        zzaa zzaaVarZzo = zzaa.zzo(Build.VERSION.SDK_INT);
        zzauu zzauuVar = new zzauu();
        zzbza zzbzaVar = new zzbza();
        zzab zzabVar = new zzab();
        zzawh zzawhVar = new zzawh();
        Clock defaultClock = DefaultClock.getInstance();
        zze zzeVar = new zze();
        zzbbv zzbbvVar = new zzbbv();
        zzaw zzawVar = new zzaw();
        zzbum zzbumVar = new zzbum();
        zzblf zzblfVar = new zzblf();
        zzcak zzcakVar = new zzcak();
        zzbmq zzbmqVar = new zzbmq();
        zzw zzwVar = new zzw();
        zzbv zzbvVar = new zzbv();
        com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = new com.google.android.gms.ads.internal.overlay.zzaa();
        com.google.android.gms.ads.internal.overlay.zzab zzabVar2 = new com.google.android.gms.ads.internal.overlay.zzab();
        zzbns zzbnsVar = new zzbns();
        zzbw zzbwVar = new zzbw();
        zzeby zzebyVar = new zzeby();
        zzaww zzawwVar = new zzaww();
        zzbxw zzbxwVar = new zzbxw();
        zzcg zzcgVar = new zzcg();
        zzcde zzcdeVar = new zzcde();
        zzcar zzcarVar = new zzcar();
        this.zzb = zzaVar;
        this.zzc = zzmVar;
        this.zzd = zzsVar;
        this.zze = zzcflVar;
        this.zzf = zzaaVarZzo;
        this.zzg = zzauuVar;
        this.zzh = zzbzaVar;
        this.zzi = zzabVar;
        this.zzj = zzawhVar;
        this.zzk = defaultClock;
        this.zzl = zzeVar;
        this.zzm = zzbbvVar;
        this.zzn = zzawVar;
        this.zzo = zzbumVar;
        this.zzp = zzblfVar;
        this.zzq = zzcakVar;
        this.zzr = zzbmqVar;
        this.zzt = zzbvVar;
        this.zzs = zzwVar;
        this.zzu = zzaaVar;
        this.zzv = zzabVar2;
        this.zzw = zzbnsVar;
        this.zzx = zzbwVar;
        this.zzy = zzebyVar;
        this.zzz = zzawwVar;
        this.zzA = zzbxwVar;
        this.zzB = zzcgVar;
        this.zzC = zzcdeVar;
        this.zzD = zzcarVar;
    }

    public static zzebz zzA() {
        return zza.zzy;
    }

    public static Clock zzB() {
        return zza.zzk;
    }

    public static zze zza() {
        return zza.zzl;
    }

    public static zzauu zzb() {
        return zza.zzg;
    }

    public static zzawh zzc() {
        return zza.zzj;
    }

    public static zzaww zzd() {
        return zza.zzz;
    }

    public static zzbbv zze() {
        return zza.zzm;
    }

    public static zzbmq zzf() {
        return zza.zzr;
    }

    public static zzbns zzg() {
        return zza.zzw;
    }

    public static com.google.android.gms.ads.internal.overlay.zza zzh() {
        return zza.zzb;
    }

    public static com.google.android.gms.ads.internal.overlay.zzm zzi() {
        return zza.zzc;
    }

    public static zzw zzj() {
        return zza.zzs;
    }

    public static com.google.android.gms.ads.internal.overlay.zzaa zzk() {
        return zza.zzu;
    }

    public static com.google.android.gms.ads.internal.overlay.zzab zzl() {
        return zza.zzv;
    }

    public static zzbum zzm() {
        return zza.zzo;
    }

    public static zzbxw zzn() {
        return zza.zzA;
    }

    public static zzbza zzo() {
        return zza.zzh;
    }

    public static com.google.android.gms.ads.internal.util.zzs zzp() {
        return zza.zzd;
    }

    public static zzaa zzq() {
        return zza.zzf;
    }

    public static zzab zzr() {
        return zza.zzi;
    }

    public static zzaw zzs() {
        return zza.zzn;
    }

    public static zzbv zzt() {
        return zza.zzt;
    }

    public static zzbw zzu() {
        return zza.zzx;
    }

    public static zzcg zzv() {
        return zza.zzB;
    }

    public static zzcak zzw() {
        return zza.zzq;
    }

    public static zzcar zzx() {
        return zza.zzD;
    }

    public static zzcde zzy() {
        return zza.zzC;
    }

    public static zzcfl zzz() {
        return zza.zze;
    }
}
