package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzekt implements zzeqx {
    public final zzfai zza;
    private final long zzb;

    public zzekt(zzfai zzfaiVar, long j10) {
        Preconditions.checkNotNull(zzfaiVar, "the targeting must not be null");
        this.zza = zzfaiVar;
        this.zzb = j10;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0053  */
    /* JADX WARN: Code duplicated, block: B:14:0x0055  */
    /* JADX WARN: Code duplicated, block: B:17:0x0067  */
    /* JADX WARN: Code duplicated, block: B:18:0x0069  */
    /* JADX WARN: Code duplicated, block: B:21:0x007a  */
    /* JADX WARN: Code duplicated, block: B:22:0x007c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0086  */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:43:0x0121  */
    /* JADX WARN: Code duplicated, block: B:44:0x0123  */
    /* JADX WARN: Code duplicated, block: B:47:0x012f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0134  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzeqx
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        boolean z13;
        boolean z14;
        Location location;
        boolean z15;
        String str;
        Bundle bundle = (Bundle) obj;
        com.google.android.gms.ads.internal.client.zzl zzlVar = this.zza.zzd;
        bundle.putInt("http_timeout_millis", zzlVar.zzw);
        bundle.putString("slotname", this.zza.zzf);
        int i12 = this.zza.zzo.zza;
        int i13 = i12 - 1;
        if (i12 == 0) {
            throw null;
        }
        if (i13 != 1) {
            str = i13 == 2 ? "is_rewarded_interstitial" : "is_new_rewarded";
            bundle.putLong("start_signals_timestamp", this.zzb);
            String str2 = new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzlVar.zzb));
            if (zzlVar.zzb != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            zzfat.zzf(bundle, "cust_age", str2, z10);
            zzfat.zzb(bundle, "extras", zzlVar.zzc);
            i10 = zzlVar.zzd;
            if (i10 != -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            zzfat.zze(bundle, "cust_gender", i10, z11);
            zzfat.zzd(bundle, "kw", zzlVar.zze);
            i11 = zzlVar.zzg;
            if (i11 != -1) {
                z12 = true;
            } else {
                z12 = false;
            }
            zzfat.zze(bundle, "tag_for_child_directed_treatment", i11, z12);
            if (zzlVar.zzf) {
                bundle.putBoolean("test_request", true);
            }
            if (zzlVar.zza >= 2 || !zzlVar.zzh) {
                z13 = false;
            } else {
                z13 = true;
            }
            zzfat.zze(bundle, "d_imp_hdr", 1, z13);
            String str3 = zzlVar.zzi;
            if (zzlVar.zza >= 2 || TextUtils.isEmpty(str3)) {
                z14 = false;
            } else {
                z14 = true;
            }
            zzfat.zzf(bundle, "ppid", str3, z14);
            location = zzlVar.zzk;
            if (location != null) {
                float accuracy = location.getAccuracy() * 1000.0f;
                long time = location.getTime() * 1000;
                double latitude = location.getLatitude() * 1.0E7d;
                double longitude = location.getLongitude() * 1.0E7d;
                Bundle bundle2 = new Bundle();
                bundle2.putFloat("radius", accuracy);
                bundle2.putLong("lat", (long) latitude);
                bundle2.putLong("long", (long) longitude);
                bundle2.putLong("time", time);
                bundle.putBundle("uule", bundle2);
            }
            zzfat.zzc(bundle, ImagesContract.URL, zzlVar.zzl);
            zzfat.zzd(bundle, "neighboring_content_urls", zzlVar.zzv);
            zzfat.zzb(bundle, "custom_targeting", zzlVar.zzn);
            zzfat.zzd(bundle, "category_exclusions", zzlVar.zzo);
            zzfat.zzc(bundle, "request_agent", zzlVar.zzp);
            zzfat.zzc(bundle, "request_pkg", zzlVar.zzq);
            boolean z16 = zzlVar.zzr;
            if (zzlVar.zza >= 7) {
                z15 = true;
            } else {
                z15 = false;
            }
            zzfat.zzg(bundle, "is_designed_for_families", z16, z15);
            if (zzlVar.zza >= 8) {
                int i14 = zzlVar.zzt;
                zzfat.zze(bundle, "tag_for_under_age_of_consent", i14, i14 != -1);
                zzfat.zzc(bundle, "max_ad_content_rating", zzlVar.zzu);
            }
        }
        bundle.putBoolean(str, true);
        bundle.putLong("start_signals_timestamp", this.zzb);
        String str4 = new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzlVar.zzb));
        if (zzlVar.zzb != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzfat.zzf(bundle, "cust_age", str4, z10);
        zzfat.zzb(bundle, "extras", zzlVar.zzc);
        i10 = zzlVar.zzd;
        if (i10 != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        zzfat.zze(bundle, "cust_gender", i10, z11);
        zzfat.zzd(bundle, "kw", zzlVar.zze);
        i11 = zzlVar.zzg;
        if (i11 != -1) {
            z12 = true;
        } else {
            z12 = false;
        }
        zzfat.zze(bundle, "tag_for_child_directed_treatment", i11, z12);
        if (zzlVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        if (zzlVar.zza >= 2) {
            z13 = false;
        } else {
            z13 = false;
        }
        zzfat.zze(bundle, "d_imp_hdr", 1, z13);
        String str5 = zzlVar.zzi;
        if (zzlVar.zza >= 2) {
            z14 = false;
        } else {
            z14 = false;
        }
        zzfat.zzf(bundle, "ppid", str5, z14);
        location = zzlVar.zzk;
        if (location != null) {
            float accuracy2 = location.getAccuracy() * 1000.0f;
            long time2 = location.getTime() * 1000;
            double latitude2 = location.getLatitude() * 1.0E7d;
            double longitude2 = location.getLongitude() * 1.0E7d;
            Bundle bundle3 = new Bundle();
            bundle3.putFloat("radius", accuracy2);
            bundle3.putLong("lat", (long) latitude2);
            bundle3.putLong("long", (long) longitude2);
            bundle3.putLong("time", time2);
            bundle.putBundle("uule", bundle3);
        }
        zzfat.zzc(bundle, ImagesContract.URL, zzlVar.zzl);
        zzfat.zzd(bundle, "neighboring_content_urls", zzlVar.zzv);
        zzfat.zzb(bundle, "custom_targeting", zzlVar.zzn);
        zzfat.zzd(bundle, "category_exclusions", zzlVar.zzo);
        zzfat.zzc(bundle, "request_agent", zzlVar.zzp);
        zzfat.zzc(bundle, "request_pkg", zzlVar.zzq);
        boolean z17 = zzlVar.zzr;
        if (zzlVar.zza >= 7) {
            z15 = true;
        } else {
            z15 = false;
        }
        zzfat.zzg(bundle, "is_designed_for_families", z17, z15);
        if (zzlVar.zza >= 8) {
            int i15 = zzlVar.zzt;
            zzfat.zze(bundle, "tag_for_under_age_of_consent", i15, i15 != -1);
            zzfat.zzc(bundle, "max_ad_content_rating", zzlVar.zzu);
        }
    }
}
