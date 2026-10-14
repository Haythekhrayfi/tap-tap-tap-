package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public class zzhp extends zzhj {
    public final zzhm zza = new zzhm();
    public ByteBuffer zzb;
    public boolean zzc;
    public long zzd;
    public ByteBuffer zze;
    private final int zzf;

    static {
        zzbq.zzb("media3.decoder");
    }

    public zzhp(int i10, int i11) {
        this.zzf = i10;
    }

    private final ByteBuffer zzm(int i10) {
        int i11 = this.zzf;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.zzb;
        throw new zzho(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public void zzb() {
        super.zzb();
        ByteBuffer byteBuffer = this.zzb;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.zze;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.zzc = false;
    }

    @EnsuresNonNull({"data"})
    public final void zzj(int i10) {
        ByteBuffer byteBuffer = this.zzb;
        if (byteBuffer == null) {
            this.zzb = zzm(i10);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (iCapacity >= i11) {
            this.zzb = byteBuffer;
            return;
        }
        ByteBuffer byteBufferZzm = zzm(i11);
        byteBufferZzm.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferZzm.put(byteBuffer);
        }
        this.zzb = byteBufferZzm;
    }

    public final void zzk() {
        ByteBuffer byteBuffer = this.zzb;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.zze;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean zzl() {
        return zzd(1073741824);
    }
}
