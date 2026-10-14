package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzccw {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzamz zzamzVar;
        zzamy zzamyVar;
        long j10 = this.zza;
        if (j10 > 0) {
            return j10;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator it = new zzamu(new zzccv(byteBufferDuplicate), zzccy.zzb).zze().iterator();
            while (true) {
                zzamzVar = null;
                if (!it.hasNext()) {
                    zzamyVar = null;
                    break;
                }
                zzamw zzamwVar = (zzamw) it.next();
                if (zzamwVar instanceof zzamy) {
                    zzamyVar = (zzamy) zzamwVar;
                    break;
                }
            }
            for (zzamw zzamwVar2 : zzamyVar.zze()) {
                if (zzamwVar2 instanceof zzamz) {
                    zzamzVar = (zzamz) zzamwVar2;
                    break;
                }
            }
            long jZzd = (zzamzVar.zzd() * 1000) / zzamzVar.zze();
            this.zza = jZzd;
            return jZzd;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
