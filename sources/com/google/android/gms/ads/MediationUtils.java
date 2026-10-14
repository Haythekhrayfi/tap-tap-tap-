package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbm;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MediationUtils {
    public static final double MIN_HEIGHT_RATIO = 0.7d;
    public static final double MIN_WIDTH_RATIO = 0.5d;

    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x003a A[SYNTHETIC] */
    public static AdSize findClosestSize(Context context, AdSize adSize, List<AdSize> list) {
        AdSize adSize2 = null;
        if (list != null && adSize != null) {
            if (!adSize.zzh() && !adSize.zzi()) {
                float f10 = context.getResources().getDisplayMetrics().density;
                adSize = new AdSize(Math.round(adSize.getWidthInPixels(context) / f10), Math.round(adSize.getHeightInPixels(context) / f10));
            }
            for (AdSize adSize3 : list) {
                if (adSize3 != null) {
                    int width = adSize.getWidth();
                    int width2 = adSize3.getWidth();
                    int height = adSize.getHeight();
                    double d10 = ((double) width) * 0.5d;
                    double d11 = width2;
                    int height2 = adSize3.getHeight();
                    if (d10 <= d11 && width >= width2) {
                        if (adSize.zzi()) {
                            int iZza = adSize.zza();
                            if (((Integer) zzba.zzc().zzb(zzbbm.zzhu)).intValue() <= width2) {
                                if (((Integer) zzba.zzc().zzb(zzbbm.zzhv)).intValue() <= height2 && iZza >= height2) {
                                    if (adSize2 != null) {
                                        if (adSize2.getHeight() * adSize2.getWidth() <= adSize3.getHeight() * adSize3.getWidth()) {
                                        }
                                    }
                                    adSize2 = adSize3;
                                }
                            }
                        } else if (adSize.zzh()) {
                            if (adSize.zzb() >= height2) {
                                if (adSize2 != null) {
                                    if (adSize2.getHeight() * adSize2.getWidth() <= adSize3.getHeight() * adSize3.getWidth()) {
                                    }
                                }
                                adSize2 = adSize3;
                            }
                        } else if (((double) height) * 0.7d <= height2 && height >= height2) {
                            if (adSize2 != null) {
                                if (adSize2.getHeight() * adSize2.getWidth() <= adSize3.getHeight() * adSize3.getWidth()) {
                                }
                            }
                            adSize2 = adSize3;
                        }
                    }
                }
            }
        }
        return adSize2;
    }
}
