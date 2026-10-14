package com.google.android.gms.ads.internal.client;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbeo;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public final class zzep implements MediaContent {
    private final zzbeo zza;
    private final VideoController zzb = new VideoController();
    private final zzbfl zzc;

    public zzep(zzbeo zzbeoVar, zzbfl zzbflVar) {
        this.zza = zzbeoVar;
        this.zzc = zzbflVar;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getAspectRatio() {
        try {
            return this.zza.zze();
        } catch (RemoteException e10) {
            zzbzr.zzh("", e10);
            return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getCurrentTime() {
        try {
            return this.zza.zzf();
        } catch (RemoteException e10) {
            zzbzr.zzh("", e10);
            return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getDuration() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e10) {
            zzbzr.zzh("", e10);
            return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final Drawable getMainImage() {
        try {
            IObjectWrapper iObjectWrapperZzi = this.zza.zzi();
            if (iObjectWrapperZzi != null) {
                return (Drawable) ObjectWrapper.unwrap(iObjectWrapperZzi);
            }
            return null;
        } catch (RemoteException e10) {
            zzbzr.zzh("", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final VideoController getVideoController() {
        try {
            if (this.zza.zzh() != null) {
                this.zzb.zzb(this.zza.zzh());
            }
        } catch (RemoteException e10) {
            zzbzr.zzh("Exception occurred while getting video controller", e10);
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean hasVideoContent() {
        try {
            return this.zza.zzl();
        } catch (RemoteException e10) {
            zzbzr.zzh("", e10);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final void setMainImage(Drawable drawable) {
        try {
            this.zza.zzj(ObjectWrapper.wrap(drawable));
        } catch (RemoteException e10) {
            zzbzr.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final zzbfl zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean zzb() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e10) {
            zzbzr.zzh("", e10);
            return false;
        }
    }

    public final zzbeo zzc() {
        return this.zza;
    }
}
