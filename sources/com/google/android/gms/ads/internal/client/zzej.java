package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbdd;
import com.google.android.gms.internal.ads.zzbkf;
import com.google.android.gms.internal.ads.zzbkn;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbnp;
import com.google.android.gms.internal.ads.zzbnt;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzfpw;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class zzej {
    private static zzej zza;
    private zzco zzg;
    private final Object zzb = new Object();
    private boolean zzd = false;
    private boolean zze = false;
    private final Object zzf = new Object();

    @Nullable
    private OnAdInspectorClosedListener zzh = null;
    private RequestConfiguration zzi = new RequestConfiguration.Builder().build();
    private final ArrayList zzc = new ArrayList();

    private zzej() {
    }

    private final void zzA(Context context) {
        if (this.zzg == null) {
            this.zzg = (zzco) new zzaq(zzay.zza(), context).zzd(context, false);
        }
    }

    private final void zzB(RequestConfiguration requestConfiguration) {
        try {
            this.zzg.zzu(new zzff(requestConfiguration));
        } catch (RemoteException e10) {
            zzbzr.zzh("Unable to set request configuration parcel.", e10);
        }
    }

    public static zzej zzf() {
        zzej zzejVar;
        synchronized (zzej.class) {
            if (zza == null) {
                zza = new zzej();
            }
            zzejVar = zza;
        }
        return zzejVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InitializationStatus zzy(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbkf zzbkfVar = (zzbkf) it.next();
            map.put(zzbkfVar.zza, new zzbkn(zzbkfVar.zzb ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzbkfVar.zzd, zzbkfVar.zzc));
        }
        return new zzbko(map);
    }

    private final void zzz(Context context, @Nullable String str) {
        try {
            zzbnp.zza().zzb(context, null);
            this.zzg.zzk();
            this.zzg.zzl(null, ObjectWrapper.wrap(null));
        } catch (RemoteException e10) {
            zzbzr.zzk("MobileAdsSettingManager initialization failed", e10);
        }
    }

    public final float zza() {
        synchronized (this.zzf) {
            zzco zzcoVar = this.zzg;
            float fZze = 1.0f;
            if (zzcoVar == null) {
                return 1.0f;
            }
            try {
                fZze = zzcoVar.zze();
            } catch (RemoteException e10) {
                zzbzr.zzh("Unable to get app volume.", e10);
            }
            return fZze;
        }
    }

    public final RequestConfiguration zzc() {
        return this.zzi;
    }

    public final InitializationStatus zze() {
        InitializationStatus initializationStatusZzy;
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                initializationStatusZzy = zzy(this.zzg.zzg());
            } catch (RemoteException unused) {
                zzbzr.zzg("Unable to get Initialization status.");
                return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzeb
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final Map getAdapterStatusMap() {
                        zzej zzejVar = this.zza;
                        HashMap map = new HashMap();
                        map.put("com.google.android.gms.ads.MobileAds", new zzee(zzejVar));
                        return map;
                    }
                };
            }
        }
        return initializationStatusZzy;
    }

    public final String zzh() {
        String strZzc;
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                strZzc = zzfpw.zzc(this.zzg.zzf());
            } catch (RemoteException e10) {
                zzbzr.zzh("Unable to get internal version.", e10);
                return "";
            }
        }
        return strZzc;
    }

    public final void zzl(Context context) {
        synchronized (this.zzf) {
            zzA(context);
            try {
                this.zzg.zzi();
            } catch (RemoteException unused) {
                zzbzr.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void zzm(boolean z10) {
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to enable/disable Same App Key.");
            try {
                this.zzg.zzj(z10);
            } catch (RemoteException e10) {
                zzbzr.zzh("Unable to " + (z10 ? "enable" : "disable") + " Same App Key.", e10);
                if (e10.getMessage() != null && e10.getMessage().toLowerCase(Locale.ROOT).contains("paid")) {
                    throw new IllegalStateException(e10);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0099 A[Catch: all -> 0x005e, TryCatch #2 {, blocks: (B:24:0x0030, B:26:0x0050, B:34:0x0066, B:36:0x0077, B:38:0x0089, B:45:0x00cc, B:39:0x0099, B:41:0x00a7, B:43:0x00b9, B:44:0x00c4, B:28:0x0058, B:33:0x0061), top: B:54:0x0030, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7 A[Catch: all -> 0x005e, TryCatch #2 {, blocks: (B:24:0x0030, B:26:0x0050, B:34:0x0066, B:36:0x0077, B:38:0x0089, B:45:0x00cc, B:39:0x0099, B:41:0x00a7, B:43:0x00b9, B:44:0x00c4, B:28:0x0058, B:33:0x0061), top: B:54:0x0030, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b9 A[Catch: all -> 0x005e, TryCatch #2 {, blocks: (B:24:0x0030, B:26:0x0050, B:34:0x0066, B:36:0x0077, B:38:0x0089, B:45:0x00cc, B:39:0x0099, B:41:0x00a7, B:43:0x00b9, B:44:0x00c4, B:28:0x0058, B:33:0x0061), top: B:54:0x0030, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4 A[Catch: all -> 0x005e, TryCatch #2 {, blocks: (B:24:0x0030, B:26:0x0050, B:34:0x0066, B:36:0x0077, B:38:0x0089, B:45:0x00cc, B:39:0x0099, B:41:0x00a7, B:43:0x00b9, B:44:0x00c4, B:28:0x0058, B:33:0x0061), top: B:54:0x0030, inners: #0 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzn(final Context context, @Nullable String str, @Nullable OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.zzb) {
            if (this.zzd) {
                if (onInitializationCompleteListener != null) {
                    this.zzc.add(onInitializationCompleteListener);
                }
                return;
            }
            if (this.zze) {
                if (onInitializationCompleteListener != null) {
                    onInitializationCompleteListener.onInitializationComplete(zze());
                }
                return;
            }
            this.zzd = true;
            if (onInitializationCompleteListener != null) {
                this.zzc.add(onInitializationCompleteListener);
            }
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null.");
            }
            synchronized (this.zzf) {
                zzeh zzehVar = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                try {
                    zzA(context);
                    this.zzg.zzs(new zzei(this, zzehVar));
                    this.zzg.zzo(new zzbnt());
                    if (this.zzi.getTagForChildDirectedTreatment() != -1 || this.zzi.getTagForUnderAgeOfConsent() != -1) {
                        zzB(this.zzi);
                    }
                } catch (RemoteException e10) {
                    zzbzr.zzk("MobileAdsSettingManager initialization failed", e10);
                }
                zzbbm.zza(context);
                if (((Boolean) zzbdd.zza.zze()).booleanValue()) {
                    if (((Boolean) zzba.zzc().zzb(zzbbm.zzjI)).booleanValue()) {
                        zzbzr.zze("Initializing on bg thread");
                        ThreadPoolExecutor threadPoolExecutor = zzbzg.zza;
                        final Object[] objArr3 = objArr2 == true ? 1 : 0;
                        threadPoolExecutor.execute(new Runnable(context, objArr3) { // from class: com.google.android.gms.ads.internal.client.zzec
                            public final /* synthetic */ Context zzb;

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zzo(this.zzb, null);
                            }
                        });
                    } else if (((Boolean) zzbdd.zzb.zze()).booleanValue()) {
                        if (((Boolean) zzba.zzc().zzb(zzbbm.zzjI)).booleanValue()) {
                            ExecutorService executorService = zzbzg.zzb;
                            final Object[] objArr4 = objArr == true ? 1 : 0;
                            executorService.execute(new Runnable(context, objArr4) { // from class: com.google.android.gms.ads.internal.client.zzed
                                public final /* synthetic */ Context zzb;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.zza.zzp(this.zzb, null);
                                }
                            });
                        } else {
                            zzbzr.zze("Initializing on calling thread");
                            zzz(context, null);
                        }
                    } else {
                        zzbzr.zze("Initializing on calling thread");
                        zzz(context, null);
                    }
                } else if (((Boolean) zzbdd.zzb.zze()).booleanValue()) {
                    if (((Boolean) zzba.zzc().zzb(zzbbm.zzjI)).booleanValue()) {
                        ExecutorService executorService2 = zzbzg.zzb;
                        final String objArr5 = objArr == true ? 1 : 0;
                        executorService2.execute(new Runnable(context, objArr5) { // from class: com.google.android.gms.ads.internal.client.zzed
                            public final /* synthetic */ Context zzb;

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zzp(this.zzb, null);
                            }
                        });
                    } else {
                        zzbzr.zze("Initializing on calling thread");
                        zzz(context, null);
                    }
                } else {
                    zzbzr.zze("Initializing on calling thread");
                    zzz(context, null);
                }
            }
        }
    }

    public final /* synthetic */ void zzo(Context context, String str) {
        synchronized (this.zzf) {
            zzz(context, null);
        }
    }

    public final /* synthetic */ void zzp(Context context, String str) {
        synchronized (this.zzf) {
            zzz(context, null);
        }
    }

    public final void zzq(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.zzf) {
            zzA(context);
            this.zzh = onAdInspectorClosedListener;
            try {
                this.zzg.zzm(new zzeg(null));
            } catch (RemoteException unused) {
                zzbzr.zzg("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final void zzr(Context context, String str) {
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.zzg.zzn(ObjectWrapper.wrap(context), str);
            } catch (RemoteException e10) {
                zzbzr.zzh("Unable to open debug menu.", e10);
            }
        }
    }

    public final void zzs(Class cls) {
        synchronized (this.zzf) {
            try {
                this.zzg.zzh(cls.getCanonicalName());
            } catch (RemoteException e10) {
                zzbzr.zzh("Unable to register RtbAdapter", e10);
            }
        }
    }

    public final void zzt(boolean z10) {
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.zzg.zzp(z10);
            } catch (RemoteException e10) {
                zzbzr.zzh("Unable to set app mute state.", e10);
            }
        }
    }

    public final void zzu(float f10) {
        boolean z10 = true;
        Preconditions.checkArgument(f10 >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && f10 <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.zzf) {
            if (this.zzg == null) {
                z10 = false;
            }
            Preconditions.checkState(z10, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.zzg.zzq(f10);
            } catch (RemoteException e10) {
                zzbzr.zzh("Unable to set app volume.", e10);
            }
        }
    }

    public final void zzv(String str) {
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.zzg.zzt(str);
            } catch (RemoteException e10) {
                zzbzr.zzh("Unable to set plugin.", e10);
            }
        }
    }

    public final void zzw(RequestConfiguration requestConfiguration) {
        Preconditions.checkArgument(requestConfiguration != null, "Null passed to setRequestConfiguration.");
        synchronized (this.zzf) {
            RequestConfiguration requestConfiguration2 = this.zzi;
            this.zzi = requestConfiguration;
            if (this.zzg == null) {
                return;
            }
            if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                zzB(requestConfiguration);
            }
        }
    }

    public final boolean zzx() {
        synchronized (this.zzf) {
            zzco zzcoVar = this.zzg;
            boolean zZzv = false;
            if (zzcoVar == null) {
                return false;
            }
            try {
                zZzv = zzcoVar.zzv();
            } catch (RemoteException e10) {
                zzbzr.zzh("Unable to get app mute state.", e10);
            }
            return zZzv;
        }
    }
}
