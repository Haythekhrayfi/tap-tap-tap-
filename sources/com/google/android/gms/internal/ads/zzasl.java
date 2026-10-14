package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class zzasl extends zzath {
    public zzasl(zzart zzartVar, String str, String str2, zzanq zzanqVar, int i10, int i11) {
        super(zzartVar, "sjJJMjdJ4ejENjGN3VSKrjMe8gO2ipNVGbEWPt320LzidWuv9Vye4oanMfYCO4eP", "M+JigCCNgE9WH1drVXVCETLYEk7iaWPFwZXUH8JlEbE=", zzanqVar, i10, 24);
    }

    private final void zzc() {
        AdvertisingIdClient advertisingIdClientZzh = this.zzb.zzh();
        if (advertisingIdClientZzh == null) {
            return;
        }
        try {
            AdvertisingIdClient.Info info = advertisingIdClientZzh.getInfo();
            String id2 = info.getId();
            int i10 = zzarw.zza;
            if (id2 != null && id2.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                UUID uuidFromString = UUID.fromString(id2);
                byte[] bArr = new byte[16];
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
                byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
                id2 = zzapd.zza(bArr, true);
            }
            if (id2 != null) {
                synchronized (this.zze) {
                    this.zze.zzs(id2);
                    this.zze.zzr(info.isLimitAdTrackingEnabled());
                    this.zze.zzab(6);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzath, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzl();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzb.zzq()) {
            zzc();
            return;
        }
        synchronized (this.zze) {
            this.zze.zzs((String) this.zzf.invoke(null, this.zzb.zzb()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final Void zzl() throws Exception {
        if (this.zzb.zzr()) {
            super.zzl();
            return null;
        }
        if (this.zzb.zzq()) {
            zzc();
        }
        return null;
    }
}
