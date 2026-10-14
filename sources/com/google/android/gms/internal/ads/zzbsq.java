package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbsq {

    @Nonnull
    private final View zza;
    private final Map zzb;
    private final zzbyi zzc;

    public zzbsq(zzbsp zzbspVar) {
        View view = zzbspVar.zza;
        this.zza = view;
        Map map = zzbspVar.zzb;
        this.zzb = map;
        zzbyi zzbyiVarZza = zzbsk.zza(zzbspVar.zza.getContext());
        this.zzc = zzbyiVarZza;
        if (zzbyiVarZza == null || map.isEmpty()) {
            return;
        }
        try {
            zzbyiVarZza.zzf(new zzbsr(ObjectWrapper.wrap(view).asBinder(), ObjectWrapper.wrap(map).asBinder()));
        } catch (RemoteException unused) {
            zzbzr.zzg("Failed to call remote method.");
        }
    }

    public final void zza(List list) {
        if (list == null || list.isEmpty()) {
            zzbzr.zzj("No click urls were passed to recordClick");
            return;
        }
        if (this.zzc == null) {
            zzbzr.zzj("Failed to get internal reporting info generator in recordClick.");
        }
        try {
            this.zzc.zzg(list, ObjectWrapper.wrap(this.zza), new zzbso(this, list));
        } catch (RemoteException e10) {
            zzbzr.zzg("RemoteException recording click: ".concat(e10.toString()));
        }
    }

    public final void zzb(List list) {
        if (list == null || list.isEmpty()) {
            zzbzr.zzj("No impression urls were passed to recordImpression");
            return;
        }
        zzbyi zzbyiVar = this.zzc;
        if (zzbyiVar == null) {
            zzbzr.zzj("Failed to get internal reporting info generator from recordImpression.");
            return;
        }
        try {
            zzbyiVar.zzh(list, ObjectWrapper.wrap(this.zza), new zzbsn(this, list));
        } catch (RemoteException e10) {
            zzbzr.zzg("RemoteException recording impression urls: ".concat(e10.toString()));
        }
    }

    public final void zzc(MotionEvent motionEvent) {
        zzbyi zzbyiVar = this.zzc;
        if (zzbyiVar == null) {
            zzbzr.zze("Failed to get internal reporting info generator.");
            return;
        }
        try {
            zzbyiVar.zzj(ObjectWrapper.wrap(motionEvent));
        } catch (RemoteException unused) {
            zzbzr.zzg("Failed to call remote method.");
        }
    }

    public final void zzd(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.zzc == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzk(new ArrayList(Arrays.asList(uri)), ObjectWrapper.wrap(this.zza), new zzbsm(this, updateClickUrlCallback));
        } catch (RemoteException e10) {
            updateClickUrlCallback.onFailure("Internal error: ".concat(e10.toString()));
        }
    }

    public final void zze(List list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.zzc == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzl(list, ObjectWrapper.wrap(this.zza), new zzbsl(this, updateImpressionUrlsCallback));
        } catch (RemoteException e10) {
            updateImpressionUrlsCallback.onFailure("Internal error: ".concat(e10.toString()));
        }
    }
}
