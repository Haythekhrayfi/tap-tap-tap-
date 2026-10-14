package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbdd;
import com.google.android.gms.internal.ads.zzbsw;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzbzr;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAdView extends ViewGroup {

    @NotOnlyInitialized
    public final zzea zza;

    public BaseAdView(Context context, int i10) {
        super(context);
        this.zza = new zzea(this, i10);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        this.zza = new zzea(this, attributeSet, false, i10);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
        this.zza = new zzea(this, attributeSet, false, i11);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i10, int i11, boolean z10) {
        super(context, attributeSet, i10);
        this.zza = new zzea(this, attributeSet, z10, i11);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, boolean z10) {
        super(context, attributeSet);
        this.zza = new zzea(this, attributeSet, z10);
    }

    public void destroy() {
        zzbbm.zza(getContext());
        if (((Boolean) zzbdd.zze.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbbm.zzjG)).booleanValue()) {
                zzbzg.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zze
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.zza.zzk();
                        } catch (IllegalStateException e10) {
                            zzbsw.zza(baseAdView.getContext()).zzf(e10, "BaseAdView.destroy");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzk();
    }

    public AdListener getAdListener() {
        return this.zza.zza();
    }

    public AdSize getAdSize() {
        return this.zza.zzb();
    }

    public String getAdUnitId() {
        return this.zza.zzj();
    }

    public OnPaidEventListener getOnPaidEventListener() {
        return this.zza.zzc();
    }

    public ResponseInfo getResponseInfo() {
        return this.zza.zzd();
    }

    public boolean isLoading() {
        return this.zza.zzA();
    }

    public void loadAd(final AdRequest adRequest) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbbm.zza(getContext());
        if (((Boolean) zzbdd.zzf.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbbm.zzjJ)).booleanValue()) {
                zzbzg.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.zza.zzm(adRequest.zza);
                        } catch (IllegalStateException e10) {
                            zzbsw.zza(baseAdView.getContext()).zzf(e10, "BaseAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzm(adRequest.zza);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i14 = ((i12 - i10) - measuredWidth) / 2;
        int i15 = ((i13 - i11) - measuredHeight) / 2;
        childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        AdSize adSize;
        int heightInPixels;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e10) {
                zzbzr.zzh("Unable to retrieve ad size.", e10);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                heightInPixels = adSize.getHeightInPixels(context);
                measuredWidth = widthInPixels;
            } else {
                heightInPixels = 0;
            }
        } else {
            measureChild(childAt, i10, i11);
            measuredWidth = childAt.getMeasuredWidth();
            heightInPixels = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i10), View.resolveSize(Math.max(heightInPixels, getSuggestedMinimumHeight()), i11));
    }

    public void pause() {
        zzbbm.zza(getContext());
        if (((Boolean) zzbdd.zzg.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbbm.zzjH)).booleanValue()) {
                zzbzg.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzd
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.zza.zzn();
                        } catch (IllegalStateException e10) {
                            zzbsw.zza(baseAdView.getContext()).zzf(e10, "BaseAdView.pause");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzn();
    }

    public void resume() {
        zzbbm.zza(getContext());
        if (((Boolean) zzbdd.zzh.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbbm.zzjF)).booleanValue()) {
                zzbzg.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzf
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.zza.zzp();
                        } catch (IllegalStateException e10) {
                            zzbsw.zza(baseAdView.getContext()).zzf(e10, "BaseAdView.resume");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(AdListener adListener) {
        this.zza.zzr(adListener);
        if (adListener == 0) {
            this.zza.zzq(null);
            return;
        }
        if (adListener instanceof com.google.android.gms.ads.internal.client.zza) {
            this.zza.zzq((com.google.android.gms.ads.internal.client.zza) adListener);
        }
        if (adListener instanceof AppEventListener) {
            this.zza.zzv((AppEventListener) adListener);
        }
    }

    public void setAdSize(AdSize adSize) {
        this.zza.zzs(adSize);
    }

    public void setAdUnitId(String str) {
        this.zza.zzu(str);
    }

    public void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.zza.zzx(onPaidEventListener);
    }
}
