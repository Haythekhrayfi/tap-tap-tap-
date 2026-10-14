package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
final class zzk extends com.google.android.gms.ads.internal.util.zzb {
    public final /* synthetic */ zzl zza;

    public /* synthetic */ zzk(zzl zzlVar, zzj zzjVar) {
        this.zza = zzlVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        final BitmapDrawable bitmapDrawable;
        Bitmap bitmapZza = com.google.android.gms.ads.internal.zzt.zzu().zza(Integer.valueOf(this.zza.zzc.zzo.zzf));
        if (bitmapZza != null) {
            com.google.android.gms.ads.internal.zzt.zzp();
            zzl zzlVar = this.zza;
            Activity activity = zzlVar.zzb;
            com.google.android.gms.ads.internal.zzj zzjVar = zzlVar.zzc.zzo;
            boolean z10 = zzjVar.zzd;
            float f10 = zzjVar.zze;
            if (!z10 || f10 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || f10 > 25.0f) {
                bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapZza);
            } else {
                try {
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapZza, bitmapZza.getWidth(), bitmapZza.getHeight(), false);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
                    RenderScript renderScriptCreate = RenderScript.create(activity);
                    ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                    Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
                    Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                    scriptIntrinsicBlurCreate.setRadius(f10);
                    scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                    scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                    allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapCreateBitmap);
                } catch (RuntimeException unused) {
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapZza);
                }
            }
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzi
                @Override // java.lang.Runnable
                public final void run() {
                    zzk zzkVar = this.zza;
                    zzkVar.zza.zzb.getWindow().setBackgroundDrawable(bitmapDrawable);
                }
            });
        }
    }
}
