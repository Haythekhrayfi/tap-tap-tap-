package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbqy extends NativeAd.AdChoicesInfo {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbqy(zzbej zzbejVar) {
        try {
            this.zzb = zzbejVar.zzg();
        } catch (RemoteException e10) {
            zzbzr.zzh("", e10);
            this.zzb = "";
        }
        try {
            for (Object obj : zzbejVar.zzh()) {
                zzber zzberVarZzg = obj instanceof IBinder ? zzbeq.zzg((IBinder) obj) : null;
                if (zzberVarZzg != null) {
                    this.zza.add(new zzbra(zzberVarZzg));
                }
            }
        } catch (RemoteException e11) {
            zzbzr.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzb;
    }
}
