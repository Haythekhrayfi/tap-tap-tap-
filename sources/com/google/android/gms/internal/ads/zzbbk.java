package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzbbk implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    public volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();

    private final void zzf() {
        if (this.zze == null) {
            return;
        }
        try {
            this.zzh = new JSONObject((String) zzbbr.zza(new zzfpx() { // from class: com.google.android.gms.internal.ads.zzbbi
                @Override // com.google.android.gms.internal.ads.zzfpx
                public final Object zza() {
                    return this.zza.zzd();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzf();
        }
    }

    public final Object zzb(final zzbbe zzbbeVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                if (!this.zza) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzd || this.zze == null) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null) {
                }
                return zzbbeVar.zzm();
            }
        }
        if (zzbbeVar.zze() != 2) {
            return (zzbbeVar.zze() == 1 && this.zzh.has(zzbbeVar.zzn())) ? zzbbeVar.zza(this.zzh) : zzbbr.zza(new zzfpx() { // from class: com.google.android.gms.internal.ads.zzbbh
                @Override // com.google.android.gms.internal.ads.zzfpx
                public final Object zza() {
                    return this.zza.zzc(zzbbeVar);
                }
            });
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zzbbeVar.zzm() : zzbbeVar.zzb(bundle);
    }

    public final /* synthetic */ Object zzc(zzbbe zzbbeVar) {
        return zzbbeVar.zzc(this.zze);
    }

    public final /* synthetic */ String zzd() {
        return this.zze.getString("flag_configuration", "{}");
    }

    public final void zze(Context context) {
        if (this.zzd) {
            return;
        }
        synchronized (this.zzb) {
            if (this.zzd) {
                return;
            }
            if (!this.zza) {
                this.zza = true;
            }
            Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
            this.zzg = applicationContext;
            try {
                this.zzf = Wrappers.packageManager(applicationContext).getApplicationInfo(this.zzg.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            try {
                Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
                if (remoteContext != null || (remoteContext = context.getApplicationContext()) != null) {
                    context = remoteContext;
                }
                if (context == null) {
                    this.zza = false;
                    this.zzc.open();
                    return;
                }
                com.google.android.gms.ads.internal.client.zzba.zzb();
                SharedPreferences sharedPreferencesZza = zzbbg.zza(context);
                this.zze = sharedPreferencesZza;
                if (sharedPreferencesZza != null) {
                    sharedPreferencesZza.registerOnSharedPreferenceChangeListener(this);
                }
                zzbdw.zzc(new zzbbj(this));
                zzf();
                this.zzd = true;
                this.zza = false;
                this.zzc.open();
            } catch (Throwable th) {
                this.zza = false;
                this.zzc.open();
                throw th;
            }
        }
    }
}
