package com.google.android.gms.ads;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.util.DisplayMetrics;
import androidx.fragment.app.w;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbzk;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* JADX INFO: loaded from: classes.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private int zzi;
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, BaseTransientBottomBar.ANIMATION_DURATION, "300x250_as");
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(SyslogConstants.LOG_LOCAL4, 600, "160x600_as");

    @Deprecated
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");
    public static final AdSize INVALID = new AdSize(0, 0, "invalid");
    public static final AdSize zza = new AdSize(50, 50, "50x50_mb");
    public static final AdSize SEARCH = new AdSize(-3, 0, "search_v2");

    public AdSize(int i10, int i11) {
        this(i10, i11, w.a(i10 == -1 ? "FULL" : String.valueOf(i10), "x", i11 == -2 ? "AUTO" : String.valueOf(i11), "_as"));
    }

    public AdSize(int i10, int i11, String str) {
        if (i10 < 0 && i10 != -1 && i10 != -3) {
            throw new IllegalArgumentException(a.a("Invalid width for AdSize: ", i10));
        }
        if (i11 < 0 && i11 != -2 && i11 != -4) {
            throw new IllegalArgumentException(a.a("Invalid height for AdSize: ", i11));
        }
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = str;
    }

    public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i10) {
        AdSize adSizeZzc = zzbzk.zzc(context, i10, 50, 0);
        adSizeZzc.zze = true;
        return adSizeZzc;
    }

    public static AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i10) {
        int iZza = zzbzk.zza(context, 0);
        if (iZza == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i10, 0);
        adSize.zzg = iZza;
        adSize.zzf = true;
        return adSize;
    }

    public static AdSize getCurrentOrientationInterscrollerAdSize(Context context, int i10) {
        return zzj(i10, zzbzk.zza(context, 0));
    }

    public static AdSize getInlineAdaptiveBannerAdSize(int i10, int i11) {
        AdSize adSize = new AdSize(i10, 0);
        adSize.zzg = i11;
        adSize.zzf = true;
        if (i11 < 32) {
            zzbzr.zzj("The maximum height set for the inline adaptive ad size was " + i11 + " dp, which is below the minimum recommended value of 32 dp.");
        }
        return adSize;
    }

    public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(Context context, int i10) {
        AdSize adSizeZzc = zzbzk.zzc(context, i10, 50, 2);
        adSizeZzc.zze = true;
        return adSizeZzc;
    }

    public static AdSize getLandscapeInlineAdaptiveBannerAdSize(Context context, int i10) {
        int iZza = zzbzk.zza(context, 2);
        AdSize adSize = new AdSize(i10, 0);
        if (iZza == -1) {
            return INVALID;
        }
        adSize.zzg = iZza;
        adSize.zzf = true;
        return adSize;
    }

    public static AdSize getLandscapeInterscrollerAdSize(Context context, int i10) {
        return zzj(i10, zzbzk.zza(context, 2));
    }

    public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(Context context, int i10) {
        AdSize adSizeZzc = zzbzk.zzc(context, i10, 50, 1);
        adSizeZzc.zze = true;
        return adSizeZzc;
    }

    public static AdSize getPortraitInlineAdaptiveBannerAdSize(Context context, int i10) {
        int iZza = zzbzk.zza(context, 1);
        AdSize adSize = new AdSize(i10, 0);
        if (iZza == -1) {
            return INVALID;
        }
        adSize.zzg = iZza;
        adSize.zzf = true;
        return adSize;
    }

    public static AdSize getPortraitInterscrollerAdSize(Context context, int i10) {
        return zzj(i10, zzbzk.zza(context, 1));
    }

    private static AdSize zzj(int i10, int i11) {
        if (i11 == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i10, 0);
        adSize.zzi = i11;
        adSize.zzh = true;
        return adSize;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.zzb == adSize.zzb && this.zzc == adSize.zzc && this.zzd.equals(adSize.zzd);
    }

    public int getHeight() {
        return this.zzc;
    }

    public int getHeightInPixels(Context context) {
        int i10 = this.zzc;
        if (i10 == -4 || i10 == -3) {
            return -1;
        }
        if (i10 == -2) {
            return zzq.zza(context.getResources().getDisplayMetrics());
        }
        zzay.zzb();
        return zzbzk.zzx(context, this.zzc);
    }

    public int getWidth() {
        return this.zzb;
    }

    public int getWidthInPixels(Context context) {
        int i10 = this.zzb;
        if (i10 == -3) {
            return -1;
        }
        if (i10 != -1) {
            zzay.zzb();
            return zzbzk.zzx(context, this.zzb);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<zzq> creator = zzq.CREATOR;
        return displayMetrics.widthPixels;
    }

    public int hashCode() {
        return this.zzd.hashCode();
    }

    public boolean isAutoHeight() {
        return this.zzc == -2;
    }

    public boolean isFluid() {
        return this.zzb == -3 && this.zzc == -4;
    }

    public boolean isFullWidth() {
        return this.zzb == -1;
    }

    public String toString() {
        return this.zzd;
    }

    public final int zza() {
        return this.zzi;
    }

    public final int zzb() {
        return this.zzg;
    }

    public final void zzc(int i10) {
        this.zzg = i10;
    }

    public final void zzd(int i10) {
        this.zzi = i10;
    }

    public final void zze(boolean z10) {
        this.zzf = true;
    }

    public final void zzf(boolean z10) {
        this.zzh = true;
    }

    public final boolean zzg() {
        return this.zze;
    }

    public final boolean zzh() {
        return this.zzf;
    }

    public final boolean zzi() {
        return this.zzh;
    }
}
