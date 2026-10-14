package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzbzk;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class(creator = "AdSizeParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();

    @SafeParcelable.Field(id = 2)
    public final String zza;

    @SafeParcelable.Field(id = 3)
    public final int zzb;

    @SafeParcelable.Field(id = 4)
    public final int zzc;

    @SafeParcelable.Field(id = 5)
    public final boolean zzd;

    @SafeParcelable.Field(id = 6)
    public final int zze;

    @SafeParcelable.Field(id = 7)
    public final int zzf;

    @SafeParcelable.Field(id = 8)
    public final zzq[] zzg;

    @SafeParcelable.Field(id = 9)
    public final boolean zzh;

    @SafeParcelable.Field(id = 10)
    public final boolean zzi;

    @SafeParcelable.Field(id = 11)
    public boolean zzj;

    @SafeParcelable.Field(id = 12)
    public boolean zzk;

    @SafeParcelable.Field(id = 13)
    public boolean zzl;

    @SafeParcelable.Field(id = 14)
    public boolean zzm;

    @SafeParcelable.Field(id = 15)
    public boolean zzn;

    @SafeParcelable.Field(id = 16)
    public boolean zzo;

    public zzq() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public zzq(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e1  */
    public zzq(Context context, AdSize[] adSizeArr) {
        int height;
        int i10;
        String string;
        int dimensionPixelSize;
        AdSize adSize = adSizeArr[0];
        this.zzd = false;
        boolean zIsFluid = adSize.isFluid();
        this.zzi = zIsFluid;
        this.zzm = com.google.android.gms.ads.zzb.zzf(adSize);
        this.zzn = com.google.android.gms.ads.zzb.zzg(adSize);
        boolean zZzh = com.google.android.gms.ads.zzb.zzh(adSize);
        this.zzo = zZzh;
        if (zIsFluid) {
            AdSize adSize2 = AdSize.BANNER;
            this.zze = adSize2.getWidth();
            height = adSize2.getHeight();
        } else if (this.zzn) {
            this.zze = adSize.getWidth();
            height = com.google.android.gms.ads.zzb.zza(adSize);
        } else if (zZzh) {
            this.zze = adSize.getWidth();
            height = com.google.android.gms.ads.zzb.zzb(adSize);
        } else {
            this.zze = adSize.getWidth();
            height = adSize.getHeight();
        }
        this.zzb = height;
        boolean z10 = this.zze == -1;
        boolean z11 = height == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z10) {
            zzay.zzb();
            if (context.getResources().getConfiguration().orientation != 2) {
                dimensionPixelSize = displayMetrics.widthPixels;
            } else {
                DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                if (((int) (displayMetrics2.heightPixels / displayMetrics2.density)) < 600) {
                    zzay.zzb();
                    DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics3);
                        int i11 = displayMetrics3.heightPixels;
                        int i12 = displayMetrics3.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics3);
                        int i13 = displayMetrics3.heightPixels;
                        int i14 = displayMetrics3.widthPixels;
                        if (i13 == i11 && i14 == i12) {
                            int i15 = displayMetrics.widthPixels;
                            zzay.zzb();
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
                            dimensionPixelSize = i15 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                        } else {
                            dimensionPixelSize = displayMetrics.widthPixels;
                        }
                    } else {
                        dimensionPixelSize = displayMetrics.widthPixels;
                    }
                } else {
                    dimensionPixelSize = displayMetrics.widthPixels;
                }
            }
            this.zzf = dimensionPixelSize;
            double d10 = dimensionPixelSize / displayMetrics.density;
            i10 = (int) d10;
            if (d10 - ((double) i10) >= 0.01d) {
                i10++;
            }
        } else {
            i10 = this.zze;
            zzay.zzb();
            this.zzf = zzbzk.zzp(displayMetrics, this.zze);
        }
        int iZzf = z11 ? zzf(displayMetrics) : this.zzb;
        zzay.zzb();
        this.zzc = zzbzk.zzp(displayMetrics, iZzf);
        if (z10 || z11) {
            string = i10 + "x" + iZzf + "_as";
        } else if (this.zzn || this.zzo) {
            string = this.zze + "x" + this.zzb + "_as";
        } else {
            string = zIsFluid ? "320x50_mb" : adSize.toString();
        }
        this.zza = string;
        int length = adSizeArr.length;
        if (length > 1) {
            this.zzg = new zzq[length];
            for (int i16 = 0; i16 < adSizeArr.length; i16++) {
                this.zzg[i16] = new zzq(context, adSizeArr[i16]);
            }
        } else {
            this.zzg = null;
        }
        this.zzh = false;
        this.zzj = false;
    }

    @SafeParcelable.Constructor
    public zzq(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i10, @SafeParcelable.Param(id = 4) int i11, @SafeParcelable.Param(id = 5) boolean z10, @SafeParcelable.Param(id = 6) int i12, @SafeParcelable.Param(id = 7) int i13, @SafeParcelable.Param(id = 8) zzq[] zzqVarArr, @SafeParcelable.Param(id = 9) boolean z11, @SafeParcelable.Param(id = 10) boolean z12, @SafeParcelable.Param(id = 11) boolean z13, @SafeParcelable.Param(id = 12) boolean z14, @SafeParcelable.Param(id = 13) boolean z15, @SafeParcelable.Param(id = 14) boolean z16, @SafeParcelable.Param(id = 15) boolean z17, @SafeParcelable.Param(id = 16) boolean z18) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = z10;
        this.zze = i12;
        this.zzf = i13;
        this.zzg = zzqVarArr;
        this.zzh = z11;
        this.zzi = z12;
        this.zzj = z13;
        this.zzk = z14;
        this.zzl = z15;
        this.zzm = z16;
        this.zzn = z17;
        this.zzo = z18;
    }

    public static int zza(DisplayMetrics displayMetrics) {
        return (int) (zzf(displayMetrics) * displayMetrics.density);
    }

    public static zzq zzb() {
        return new zzq("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static zzq zzc() {
        return new zzq("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static zzq zzd() {
        return new zzq("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static zzq zze() {
        return new zzq("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
    }

    private static int zzf(DisplayMetrics displayMetrics) {
        int i10 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i10 <= 400) {
            return 32;
        }
        return i10 <= 720 ? 50 : 90;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzd);
        SafeParcelWriter.writeInt(parcel, 6, this.zze);
        SafeParcelWriter.writeInt(parcel, 7, this.zzf);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.zzg, i10, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzj);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzk);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzl);
        SafeParcelWriter.writeBoolean(parcel, 14, this.zzm);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzn);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzo);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
