package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import androidx.recyclerview.widget.o;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdjk {
    private final com.google.android.gms.ads.internal.util.zzbo zza;
    private final Clock zzb;
    private final Executor zzc;

    public zzdjk(com.google.android.gms.ads.internal.util.zzbo zzboVar, Clock clock, Executor executor) {
        this.zza = zzboVar;
        this.zzb = clock;
        this.zzc = executor;
    }

    private final Bitmap zzc(byte[] bArr, BitmapFactory.Options options) {
        long jElapsedRealtime = this.zzb.elapsedRealtime();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jElapsedRealtime2 = this.zzb.elapsedRealtime();
        if (bitmapDecodeByteArray != null) {
            long j10 = jElapsedRealtime2 - jElapsedRealtime;
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            int allocationByteCount = bitmapDecodeByteArray.getAllocationByteCount();
            boolean z10 = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sbA = o.a("Decoded image w: ", width, " h:", height, " bytes: ");
            sbA.append(allocationByteCount);
            sbA.append(" time: ");
            sbA.append(j10);
            sbA.append(" on ui thread: ");
            sbA.append(z10);
            com.google.android.gms.ads.internal.util.zze.zza(sbA.toString());
        }
        return bitmapDecodeByteArray;
    }

    public final /* synthetic */ Bitmap zza(double d10, boolean z10, zzalg zzalgVar) {
        byte[] bArr = zzalgVar.zzb;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d10 * 160.0d);
        if (!z10) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfT)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzc(bArr, options);
            options.inJustDecodeBounds = false;
            int i10 = options.outWidth * options.outHeight;
            if (i10 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i10 - 1) / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfU)).intValue())) / 2);
            }
        }
        return zzc(bArr, options);
    }

    public final zzfwm zzb(String str, final double d10, final boolean z10) {
        return zzfwc.zzl(this.zza.zza(str), new zzfov() { // from class: com.google.android.gms.internal.ads.zzdjj
            @Override // com.google.android.gms.internal.ads.zzfov
            public final Object apply(Object obj) {
                return this.zza.zza(d10, z10, (zzalg) obj);
            }
        }, this.zzc);
    }
}
