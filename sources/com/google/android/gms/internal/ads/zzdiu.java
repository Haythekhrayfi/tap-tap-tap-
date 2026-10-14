package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.applovin.impl.mediation.b.a.c;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdiu {
    private final zzdni zza;
    private final zzdlx zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdiu(zzdni zzdniVar, zzdlx zzdlxVar) {
        this.zza = zzdniVar;
        this.zzb = zzdlxVar;
    }

    private static final int zzf(Context context, String str, int i10) {
        try {
            i10 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        return zzbzk.zzx(context, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zza(final View view, final WindowManager windowManager) throws zzcfk {
        zzcez zzcezVarZza = this.zza.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        View view2 = (View) zzcezVarZza;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        zzcezVarZza.zzad("/sendMessageToSdk", new zzbij() { // from class: com.google.android.gms.internal.ads.zzdiq
            @Override // com.google.android.gms.internal.ads.zzbij
            public final void zza(Object obj, Map map) {
                this.zza.zzb((zzcez) obj, map);
            }
        });
        zzcezVarZza.zzad("/hideValidatorOverlay", new zzbij() { // from class: com.google.android.gms.internal.ads.zzdir
            @Override // com.google.android.gms.internal.ads.zzbij
            public final void zza(Object obj, Map map) {
                this.zza.zzc(windowManager, view, (zzcez) obj, map);
            }
        });
        zzcezVarZza.zzad("/open", new zzbit(null, null, null, null, null));
        this.zzb.zzj(new WeakReference(zzcezVarZza), "/loadNativeAdPolicyViolations", new zzbij() { // from class: com.google.android.gms.internal.ads.zzdis
            @Override // com.google.android.gms.internal.ads.zzbij
            public final void zza(Object obj, Map map) {
                this.zza.zze(view, windowManager, (zzcez) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zzcezVarZza), "/showValidatorOverlay", new zzbij() { // from class: com.google.android.gms.internal.ads.zzdit
            @Override // com.google.android.gms.internal.ads.zzbij
            public final void zza(Object obj, Map map) {
                zzbzr.zze("Show native ad policy validator overlay.");
                ((zzcez) obj).zzF().setVisibility(0);
            }
        });
        return (View) zzcezVarZza;
    }

    public final /* synthetic */ void zzb(zzcez zzcezVar, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(WindowManager windowManager, View view, zzcez zzcezVar, Map map) {
        zzbzr.zze("Hide native ad policy validator overlay.");
        zzcezVar.zzF().setVisibility(8);
        if (zzcezVar.zzF().getWindowToken() != null) {
            windowManager.removeView(zzcezVar.zzF());
        }
        zzcezVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.zzc);
    }

    public final /* synthetic */ void zzd(Map map, boolean z10) {
        HashMap mapA = c.a("messageType", "validatorHtmlLoaded");
        mapA.put(FacebookMediationAdapter.KEY_ID, (String) map.get(FacebookMediationAdapter.KEY_ID));
        this.zzb.zzg("sendMessageToNativeJs", mapA);
    }

    public final /* synthetic */ void zze(final View view, final WindowManager windowManager, final zzcez zzcezVar, final Map map) {
        zzcezVar.zzN().zzA(new zzcgk() { // from class: com.google.android.gms.internal.ads.zzdio
            @Override // com.google.android.gms.internal.ads.zzcgk
            public final void zza(boolean z10) {
                this.zza.zzd(map, z10);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int iZzf = zzf(context, (String) map.get("validator_width"), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhF)).intValue());
        int iZzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhG)).intValue());
        int iZzf3 = zzf(context, (String) map.get("validator_x"), 0);
        int iZzf4 = zzf(context, (String) map.get("validator_y"), 0);
        zzcezVar.zzag(zzcgo.zzb(iZzf, iZzf2));
        try {
            zzcezVar.zzG().getSettings().setUseWideViewPort(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhH)).booleanValue());
            zzcezVar.zzG().getSettings().setLoadWithOverviewMode(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhI)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams layoutParamsZzb = com.google.android.gms.ads.internal.util.zzbx.zzb();
        layoutParamsZzb.x = iZzf3;
        layoutParamsZzb.y = iZzf4;
        windowManager.updateViewLayout(zzcezVar.zzF(), layoutParamsZzb);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i10 = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - iZzf4;
            this.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdip
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    View view2 = view;
                    zzcez zzcezVar2 = zzcezVar;
                    String str2 = str;
                    WindowManager.LayoutParams layoutParams = layoutParamsZzb;
                    int i11 = i10;
                    WindowManager windowManager2 = windowManager;
                    Rect rect2 = new Rect();
                    if (!view2.getGlobalVisibleRect(rect2) || zzcezVar2.zzF().getWindowToken() == null) {
                        return;
                    }
                    layoutParams.y = (("1".equals(str2) || "2".equals(str2)) ? rect2.bottom : rect2.top) - i11;
                    windowManager2.updateViewLayout(zzcezVar2.zzF(), layoutParams);
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.zzc);
            }
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zzcezVar.loadUrl(str2);
    }
}
