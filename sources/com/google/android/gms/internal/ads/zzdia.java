package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdia {
    public static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzfai zzc;
    private final zzdhf zzd;
    private final zzdha zze;
    private final zzdim zzf;
    private final zzdiu zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbef zzj;
    private final zzdgx zzk;

    public zzdia(com.google.android.gms.ads.internal.util.zzg zzgVar, zzfai zzfaiVar, zzdhf zzdhfVar, zzdha zzdhaVar, zzdim zzdimVar, zzdiu zzdiuVar, Executor executor, Executor executor2, zzdgx zzdgxVar) {
        this.zzb = zzgVar;
        this.zzc = zzfaiVar;
        this.zzj = zzfaiVar.zzi;
        this.zzd = zzdhfVar;
        this.zze = zzdhaVar;
        this.zzf = zzdimVar;
        this.zzg = zzdiuVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdgxVar;
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i10) {
        if (i10 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i10 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i10 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean zzi(ViewGroup viewGroup, boolean z10) {
        View viewZzf = z10 ? this.zze.zzf() : this.zze.zzg();
        if (viewZzf == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewZzf.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewZzf.getParent()).removeView(viewZzf);
        }
        viewGroup.addView(viewZzf, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdA)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    public final /* synthetic */ void zza(ViewGroup viewGroup) {
        zzdha zzdhaVar = this.zze;
        if (zzdhaVar.zzf() != null) {
            boolean z10 = viewGroup != null;
            if (zzdhaVar.zzc() == 2 || zzdhaVar.zzc() == 1) {
                this.zzb.zzI(this.zzc.zzf, String.valueOf(zzdhaVar.zzc()), z10);
            } else if (zzdhaVar.zzc() == 6) {
                this.zzb.zzI(this.zzc.zzf, "2", z10);
                this.zzb.zzI(this.zzc.zzf, "1", z10);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0192  */
    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zzb(zzdiw zzdiwVar) {
        ViewGroup viewGroup;
        View viewZze;
        final ViewGroup viewGroup2;
        zzbeo zzbeoVarZza;
        Drawable drawable;
        ImageView.ScaleType scaleType;
        if (!this.zzd.zzf() && !this.zzd.zze()) {
            viewGroup = null;
            break;
        }
        String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
        int i10 = 0;
        while (true) {
            if (i10 >= 2) {
                viewGroup = null;
                break;
            }
            View viewZzg = zzdiwVar.zzg(strArr[i10]);
            if (viewZzg != null && (viewZzg instanceof ViewGroup)) {
                viewGroup = (ViewGroup) viewZzg;
                break;
            }
            i10++;
        }
        Context context = zzdiwVar.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdha zzdhaVar = this.zze;
        if (zzdhaVar.zze() != null) {
            viewZze = zzdhaVar.zze();
            zzbef zzbefVar = this.zzj;
            if (zzbefVar != null && viewGroup == null) {
                zzh(layoutParams, zzbefVar.zze);
                viewZze.setLayoutParams(layoutParams);
            }
        } else if (zzdhaVar.zzl() instanceof zzbea) {
            zzbea zzbeaVar = (zzbea) zzdhaVar.zzl();
            if (viewGroup == null) {
                zzh(layoutParams, zzbeaVar.zzc());
            }
            View zzbebVar = new zzbeb(context, zzbeaVar, layoutParams);
            zzbebVar.setContentDescription((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdy));
            viewZze = zzbebVar;
        } else {
            viewZze = null;
        }
        if (viewZze != null) {
            if (viewZze.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewZze.getParent()).removeView(viewZze);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(viewZze);
            } else {
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdiwVar.zzf().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(viewZze);
                FrameLayout frameLayoutZzh = zzdiwVar.zzh();
                if (frameLayoutZzh != null) {
                    frameLayoutZzh.addView(zzaVar);
                }
            }
            zzdiwVar.zzq(zzdiwVar.zzk(), viewZze, true);
        }
        zzfsc zzfscVar = zzdhw.zza;
        int size = zzfscVar.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                viewGroup2 = null;
                break;
            }
            View viewZzg2 = zzdiwVar.zzg((String) zzfscVar.get(i11));
            i11++;
            if (viewZzg2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) viewZzg2;
                break;
            }
        }
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhx
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (zzi(viewGroup2, true)) {
            zzdha zzdhaVar2 = this.zze;
            if (zzdhaVar2.zzr() != null) {
                zzdhaVar2.zzr().zzao(new zzdhz(zzdiwVar, viewGroup2));
                return;
            }
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjg)).booleanValue() && zzi(viewGroup2, false)) {
            zzdha zzdhaVar3 = this.zze;
            if (zzdhaVar3.zzp() != null) {
                zzdhaVar3.zzp().zzao(new zzdhz(zzdiwVar, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View viewZzf = zzdiwVar.zzf();
        Context context2 = viewZzf != null ? viewZzf.getContext() : null;
        if (context2 == null || (zzbeoVarZza = this.zzk.zza()) == null) {
            return;
        }
        try {
            IObjectWrapper iObjectWrapperZzi = zzbeoVarZza.zzi();
            if (iObjectWrapperZzi == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapperZzi)) == null) {
                return;
            }
            ImageView imageView = new ImageView(context2);
            imageView.setImageDrawable(drawable);
            IObjectWrapper iObjectWrapperZzj = zzdiwVar.zzj();
            if (iObjectWrapperZzj == null) {
                scaleType = zza;
            } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfV)).booleanValue()) {
                scaleType = (ImageView.ScaleType) ObjectWrapper.unwrap(iObjectWrapperZzj);
            } else {
                scaleType = zza;
            }
            imageView.setScaleType(scaleType);
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(imageView);
        } catch (RemoteException unused) {
            zzbzr.zzj("Could not get main image drawable");
        }
    }

    public final void zzc(zzdiw zzdiwVar) {
        if (zzdiwVar == null || this.zzf == null || zzdiwVar.zzh() == null || !this.zzd.zzg()) {
            return;
        }
        try {
            zzdiwVar.zzh().addView(this.zzf.zza());
        } catch (zzcfk e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e10);
        }
    }

    public final void zzd(zzdiw zzdiwVar) {
        if (zzdiwVar == null) {
            return;
        }
        Context context = zzdiwVar.zzf().getContext();
        if (com.google.android.gms.ads.internal.util.zzbx.zzh(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                zzbzr.zze("Activity context is needed for policy validator.");
                return;
            }
            if (this.zzg == null || zzdiwVar.zzh() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(this.zzg.zza(zzdiwVar.zzh(), windowManager), com.google.android.gms.ads.internal.util.zzbx.zzb());
            } catch (zzcfk e10) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e10);
            }
        }
    }

    public final void zze(final zzdiw zzdiwVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhy
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(zzdiwVar);
            }
        });
    }

    public final boolean zzf(ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    public final boolean zzg(ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }
}
