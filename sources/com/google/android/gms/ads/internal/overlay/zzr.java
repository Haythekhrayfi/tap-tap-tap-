package com.google.android.gms.ads.internal.overlay;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbzk;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public final class zzr extends FrameLayout implements View.OnClickListener {
    private final ImageButton zza;
    private final zzad zzb;

    public zzr(Context context, zzq zzqVar, zzad zzadVar) {
        super(context);
        this.zzb = zzadVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.zza = imageButton;
        zzc();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        zzay.zzb();
        int iZzx = zzbzk.zzx(context, zzqVar.zza);
        zzay.zzb();
        int iZzx2 = zzbzk.zzx(context, 0);
        zzay.zzb();
        int iZzx3 = zzbzk.zzx(context, zzqVar.zzb);
        zzay.zzb();
        imageButton.setPadding(iZzx, iZzx2, iZzx3, zzbzk.zzx(context, zzqVar.zzc));
        imageButton.setContentDescription("Interstitial close button");
        zzay.zzb();
        int iZzx4 = zzbzk.zzx(context, zzqVar.zzd + zzqVar.zza + zzqVar.zzb);
        zzay.zzb();
        addView(imageButton, new FrameLayout.LayoutParams(iZzx4, zzbzk.zzx(context, zzqVar.zzd + zzqVar.zzc), 17));
        long jLongValue = ((Long) zzba.zzc().zzb(zzbbm.zzaZ)).longValue();
        if (jLongValue <= 0) {
            return;
        }
        zzp zzpVar = ((Boolean) zzba.zzc().zzb(zzbbm.zzba)).booleanValue() ? new zzp(this) : null;
        imageButton.setAlpha(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        imageButton.animate().alpha(1.0f).setDuration(jLongValue).setListener(zzpVar);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    private final void zzc() {
        ImageButton imageButton;
        int i10;
        String str = (String) zzba.zzc().zzb(zzbbm.zzaY);
        if (!PlatformVersion.isAtLeastLollipop() || TextUtils.isEmpty(str) || "default".equals(str)) {
            this.zza.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Resources resourcesZzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        if (resourcesZzd == null) {
            this.zza.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Drawable drawable = null;
        try {
            if (!"white".equals(str)) {
                if ("black".equals(str)) {
                    i10 = com.google.android.gms.ads.impl.R.drawable.admob_close_button_black_circle_white_cross;
                }
                imageButton = this.zza;
                if (drawable == null) {
                    imageButton.setImageResource(R.drawable.btn_dialog);
                } else {
                    imageButton.setImageDrawable(drawable);
                    this.zza.setScaleType(ImageView.ScaleType.CENTER);
                }
            }
            i10 = com.google.android.gms.ads.impl.R.drawable.admob_close_button_white_circle_black_cross;
            drawable = resourcesZzd.getDrawable(i10);
        } catch (Resources.NotFoundException unused) {
            zzbzr.zze("Close button resource not found, falling back to default.");
        }
        imageButton = this.zza;
        if (drawable == null) {
            imageButton.setImageResource(R.drawable.btn_dialog);
        } else {
            imageButton.setImageDrawable(drawable);
            this.zza.setScaleType(ImageView.ScaleType.CENTER);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzad zzadVar = this.zzb;
        if (zzadVar != null) {
            zzadVar.zzj();
        }
    }

    public final void zzb(boolean z10) {
        if (!z10) {
            this.zza.setVisibility(0);
            return;
        }
        this.zza.setVisibility(8);
        if (((Long) zzba.zzc().zzb(zzbbm.zzaZ)).longValue() > 0) {
            this.zza.animate().cancel();
            this.zza.clearAnimation();
        }
    }
}
