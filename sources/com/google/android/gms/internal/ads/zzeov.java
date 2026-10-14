package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeov implements zzeqy {
    private final zzfwn zza;
    private final zzfai zzb;
    private final PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzeov(zzfwn zzfwnVar, zzfai zzfaiVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzfwnVar;
        this.zzb = zzfaiVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    public static /* synthetic */ zzeow zzc(final zzeov zzeovVar) {
        final ArrayList arrayList = zzeovVar.zzb.zzg;
        if (arrayList == null) {
            return new zzeow() { // from class: com.google.android.gms.internal.ads.zzeor
                @Override // com.google.android.gms.internal.ads.zzeqx
                public final void zzh(Object obj) {
                }
            };
        }
        return arrayList.isEmpty() ? new zzeow() { // from class: com.google.android.gms.internal.ads.zzeos
            @Override // com.google.android.gms.internal.ads.zzeqx
            public final void zzh(Object obj) {
                ((Bundle) obj).putInt("native_version", 0);
            }
        } : new zzeow() { // from class: com.google.android.gms.internal.ads.zzeot
            @Override // com.google.android.gms.internal.ads.zzeqx
            public final void zzh(Object obj) {
                this.zza.zzd(arrayList, (Bundle) obj);
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final zzfwm zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeou
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeov.zzc(this.zza);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:63:0x011e  */
    public final /* synthetic */ void zzd(ArrayList arrayList, Bundle bundle) {
        JSONArray jSONArrayOptJSONArray;
        String str;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", this.zzb.zzh);
        String str2 = "landscape";
        if (this.zzb.zzi.zza > 3) {
            bundle.putBoolean("enable_native_media_orientation", true);
            int i10 = this.zzb.zzi.zzh;
            if (i10 == 1) {
                str = "any";
            } else if (i10 == 2) {
                str = "landscape";
            } else if (i10 != 3) {
                str = i10 != 4 ? AppLovinMediationProvider.UNKNOWN : "square";
            } else {
                str = "portrait";
            }
            if (!AppLovinMediationProvider.UNKNOWN.equals(str)) {
                bundle.putString("native_media_orientation", str);
            }
        }
        int i11 = this.zzb.zzi.zzc;
        if (i11 == 0) {
            str2 = "any";
        } else if (i11 == 1) {
            str2 = "portrait";
        } else if (i11 != 2) {
            str2 = AppLovinMediationProvider.UNKNOWN;
        }
        if (!AppLovinMediationProvider.UNKNOWN.equals(str2)) {
            bundle.putString("native_image_orientation", str2);
        }
        bundle.putBoolean("native_multiple_images", this.zzb.zzi.zzd);
        bundle.putBoolean("use_custom_mute", this.zzb.zzi.zzg);
        zzbef zzbefVar = this.zzb.zzi;
        if (zzbefVar.zzi != 0) {
            bundle.putBoolean("sccg_tap", zzbefVar.zzj);
            bundle.putInt("sccg_dir", this.zzb.zzi.zzi);
        }
        PackageInfo packageInfo = this.zzc;
        int i12 = packageInfo == null ? 0 : packageInfo.versionCode;
        if (i12 > this.zzd.zza()) {
            this.zzd.zzs();
            this.zzd.zzv(i12);
        }
        JSONObject jSONObjectZzp = this.zzd.zzp();
        String string = null;
        if (jSONObjectZzp != null && (jSONArrayOptJSONArray = jSONObjectZzp.optJSONArray(this.zzb.zzf)) != null) {
            string = jSONArrayOptJSONArray.toString();
        }
        if (!TextUtils.isEmpty(string)) {
            bundle.putString("native_advanced_settings", string);
        }
        int i13 = this.zzb.zzk;
        if (i13 > 1) {
            bundle.putInt("max_num_ads", i13);
        }
        zzbkr zzbkrVar = this.zzb.zzb;
        if (zzbkrVar != null) {
            if (TextUtils.isEmpty(zzbkrVar.zzc)) {
                String str3 = "p";
                if (zzbkrVar.zza >= 2) {
                    int i14 = zzbkrVar.zzd;
                    if (i14 == 2 || i14 != 3) {
                        str3 = "l";
                    }
                } else {
                    int i15 = zzbkrVar.zzb;
                    if (i15 == 1) {
                        str3 = "l";
                    } else if (i15 != 2) {
                        zzbzr.zzg("Instream ad video aspect ratio " + i15 + " is wrong.");
                        str3 = "l";
                    }
                }
                bundle.putString("ia_var", str3);
            } else {
                bundle.putString("ad_tag", zzbkrVar.zzc);
            }
            bundle.putBoolean("instr", true);
        }
        if (this.zzb.zza() != null) {
            bundle.putBoolean("has_delayed_banner_listener", true);
        }
    }
}
