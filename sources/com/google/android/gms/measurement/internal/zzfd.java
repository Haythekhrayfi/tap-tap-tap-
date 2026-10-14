package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import ch.qos.logback.core.spi.ComponentTracker;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzfd extends zzgs {

    @VisibleForTesting
    public static final Pair zza = new Pair("", 0L);
    public zzfb zzb;
    public final zzez zzc;
    public final zzez zzd;
    public final zzfc zze;
    public final zzez zzf;
    public final zzex zzg;
    public final zzfc zzh;
    public final zzex zzi;
    public final zzez zzj;
    public boolean zzk;
    public final zzex zzl;
    public final zzex zzm;
    public final zzez zzn;
    public final zzfc zzo;
    public final zzfc zzp;
    public final zzez zzq;
    public final zzey zzr;
    private SharedPreferences zzt;
    private String zzu;
    private boolean zzv;
    private long zzw;

    public zzfd(zzfy zzfyVar) {
        super(zzfyVar);
        this.zzf = new zzez(this, "session_timeout", ComponentTracker.DEFAULT_TIMEOUT);
        this.zzg = new zzex(this, "start_new_session", true);
        this.zzj = new zzez(this, "last_pause_time", 0L);
        this.zzh = new zzfc(this, "non_personalized_ads", null);
        this.zzi = new zzex(this, "allow_remote_dynamite", false);
        this.zzc = new zzez(this, "first_open_time", 0L);
        this.zzd = new zzez(this, "app_install_time", 0L);
        this.zze = new zzfc(this, "app_instance_id", null);
        this.zzl = new zzex(this, "app_backgrounded", false);
        this.zzm = new zzex(this, "deep_link_retrieval_complete", false);
        this.zzn = new zzez(this, "deep_link_retrieval_attempts", 0L);
        this.zzo = new zzfc(this, "firebase_feature_rollouts", null);
        this.zzp = new zzfc(this, "deferred_attribution_cache", null);
        this.zzq = new zzez(this, "deferred_attribution_cache_timestamp", 0L);
        this.zzr = new zzey(this, "default_event_parameters", null);
    }

    @VisibleForTesting
    public final SharedPreferences zza() {
        zzg();
        zzu();
        Preconditions.checkNotNull(this.zzt);
        return this.zzt;
    }

    @Override // com.google.android.gms.measurement.internal.zzgs
    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    public final void zzaA() {
        SharedPreferences sharedPreferences = this.zzs.zzau().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.zzt = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.zzk = z10;
        if (!z10) {
            SharedPreferences.Editor editorEdit = this.zzt.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        this.zzs.zzf();
        this.zzb = new zzfb(this, "health_monitor", Math.max(0L, ((Long) zzeb.zzb.zza(null)).longValue()), null);
    }

    public final Pair zzb(String str) {
        zzg();
        long jElapsedRealtime = this.zzs.zzav().elapsedRealtime();
        String str2 = this.zzu;
        if (str2 != null && jElapsedRealtime < this.zzw) {
            return new Pair(str2, Boolean.valueOf(this.zzv));
        }
        this.zzw = this.zzs.zzf().zzi(str, zzeb.zza) + jElapsedRealtime;
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zzs.zzau());
            this.zzu = "";
            String id2 = advertisingIdInfo.getId();
            if (id2 != null) {
                this.zzu = id2;
            }
            this.zzv = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e10) {
            this.zzs.zzay().zzc().zzb("Unable to get advertising id", e10);
            this.zzu = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(this.zzu, Boolean.valueOf(this.zzv));
    }

    public final zzai zzc() {
        zzg();
        return zzai.zzb(zza().getString("consent_settings", "G1"));
    }

    public final Boolean zzd() {
        zzg();
        if (zza().contains("measurement_enabled")) {
            return Boolean.valueOf(zza().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgs
    public final boolean zzf() {
        return true;
    }

    public final void zzh(Boolean bool) {
        zzg();
        SharedPreferences.Editor editorEdit = zza().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    public final void zzi(boolean z10) {
        zzg();
        this.zzs.zzay().zzj().zzb("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor editorEdit = zza().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z10);
        editorEdit.apply();
    }

    public final boolean zzj() {
        SharedPreferences sharedPreferences = this.zzt;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    public final boolean zzk(long j10) {
        return j10 - this.zzf.zza() > this.zzj.zza();
    }

    public final boolean zzl(int i10) {
        return zzai.zzj(i10, zza().getInt("consent_source", 100));
    }
}
