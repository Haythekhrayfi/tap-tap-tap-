package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzep;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbzr;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes.dex */
public final class NativeAdView extends FrameLayout {

    @NotOnlyInitialized
    private final FrameLayout zza;

    @NotOnlyInitialized
    private final zzbev zzb;

    public NativeAdView(Context context) {
        super(context);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    @TargetApi(21)
    public NativeAdView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    private final FrameLayout zzd(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    @RequiresNonNull({"overlayFrame"})
    private final zzbev zze() {
        if (isInEditMode()) {
            return null;
        }
        return zzay.zza().zzh(this.zza.getContext(), this, this.zza);
    }

    private final void zzf(String str, View view) {
        zzbev zzbevVar = this.zzb;
        if (zzbevVar != null) {
            try {
                zzbevVar.zzbs(str, ObjectWrapper.wrap(view));
            } catch (RemoteException e10) {
                zzbzr.zzh("Unable to call setAssetView on delegate", e10);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        super.bringChildToFront(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.zza;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public void destroy() {
        zzbev zzbevVar = this.zzb;
        if (zzbevVar != null) {
            try {
                zzbevVar.zzc();
            } catch (RemoteException e10) {
                zzbzr.zzh("Unable to destroy native ad view", e10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.zzb != null) {
            if (((Boolean) zzba.zzc().zzb(zzbbm.zzjS)).booleanValue()) {
                try {
                    this.zzb.zzd(ObjectWrapper.wrap(motionEvent));
                } catch (RemoteException e10) {
                    zzbzr.zzh("Unable to call handleTouchEvent on delegate", e10);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public AdChoicesView getAdChoicesView() {
        View viewZza = zza("3011");
        if (viewZza instanceof AdChoicesView) {
            return (AdChoicesView) viewZza;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return zza("3005");
    }

    public final View getBodyView() {
        return zza("3004");
    }

    public final View getCallToActionView() {
        return zza("3002");
    }

    public final View getHeadlineView() {
        return zza("3001");
    }

    public final View getIconView() {
        return zza("3003");
    }

    public final View getImageView() {
        return zza("3008");
    }

    public final MediaView getMediaView() {
        View viewZza = zza("3010");
        if (viewZza instanceof MediaView) {
            return (MediaView) viewZza;
        }
        if (viewZza == null) {
            return null;
        }
        zzbzr.zze("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return zza("3007");
    }

    public final View getStarRatingView() {
        return zza("3009");
    }

    public final View getStoreView() {
        return zza("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        zzbev zzbevVar = this.zzb;
        if (zzbevVar != null) {
            try {
                zzbevVar.zze(ObjectWrapper.wrap(view), i10);
            } catch (RemoteException e10) {
                zzbzr.zzh("Unable to call onVisibilityChanged on delegate", e10);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.zza == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        zzf("3011", adChoicesView);
    }

    public final void setAdvertiserView(View view) {
        zzf("3005", view);
    }

    public final void setBodyView(View view) {
        zzf("3004", view);
    }

    public final void setCallToActionView(View view) {
        zzf("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        zzbev zzbevVar = this.zzb;
        if (zzbevVar != null) {
            try {
                zzbevVar.zzbt(ObjectWrapper.wrap(view));
            } catch (RemoteException e10) {
                zzbzr.zzh("Unable to call setClickConfirmingView on delegate", e10);
            }
        }
    }

    public final void setHeadlineView(View view) {
        zzf("3001", view);
    }

    public final void setIconView(View view) {
        zzf("3003", view);
    }

    public final void setImageView(View view) {
        zzf("3008", view);
    }

    public final void setMediaView(MediaView mediaView) {
        zzf("3010", mediaView);
        if (mediaView == null) {
            return;
        }
        mediaView.zza(new zzb(this));
        mediaView.zzb(new zzc(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.dynamic.IObjectWrapper, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setNativeAd(NativeAd nativeAd) {
        zzbev zzbevVar = this.zzb;
        if (zzbevVar != 0) {
            try {
                zzbevVar.zzbw(nativeAd.zza());
            } catch (RemoteException e10) {
                zzbzr.zzh("Unable to call setNativeAd on delegate", e10);
            }
        }
    }

    public final void setPriceView(View view) {
        zzf("3007", view);
    }

    public final void setStarRatingView(View view) {
        zzf("3009", view);
    }

    public final void setStoreView(View view) {
        zzf("3006", view);
    }

    public final View zza(String str) {
        zzbev zzbevVar = this.zzb;
        if (zzbevVar != null) {
            try {
                IObjectWrapper iObjectWrapperZzb = zzbevVar.zzb(str);
                if (iObjectWrapperZzb != null) {
                    return (View) ObjectWrapper.unwrap(iObjectWrapperZzb);
                }
            } catch (RemoteException e10) {
                zzbzr.zzh("Unable to call getAssetView on delegate", e10);
            }
        }
        return null;
    }

    public final /* synthetic */ void zzb(MediaContent mediaContent) {
        zzbev zzbevVar = this.zzb;
        if (zzbevVar == null) {
            return;
        }
        try {
            if (mediaContent instanceof zzep) {
                zzbevVar.zzbu(((zzep) mediaContent).zzc());
            } else if (mediaContent == null) {
                zzbevVar.zzbu(null);
            } else {
                zzbzr.zze("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e10) {
            zzbzr.zzh("Unable to call setMediaContent on delegate", e10);
        }
    }

    public final /* synthetic */ void zzc(ImageView.ScaleType scaleType) {
        zzbev zzbevVar = this.zzb;
        if (zzbevVar == null || scaleType == null) {
            return;
        }
        try {
            zzbevVar.zzbv(ObjectWrapper.wrap(scaleType));
        } catch (RemoteException e10) {
            zzbzr.zzh("Unable to call setMediaViewImageScaleType on delegate", e10);
        }
    }
}
