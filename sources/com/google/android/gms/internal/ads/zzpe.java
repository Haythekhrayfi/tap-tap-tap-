package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzpe extends zzds {
    private int[] zzd;
    private int[] zze;

    @Override // com.google.android.gms.internal.ads.zzdr
    public final void zze(ByteBuffer byteBuffer) {
        int[] iArr = this.zze;
        Objects.requireNonNull(iArr);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferZzj = zzj(((iLimit - iPosition) / this.zzb.zze) * this.zzc.zze);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferZzj.putShort(byteBuffer.getShort(i10 + i10 + iPosition));
            }
            iPosition += this.zzb.zze;
        }
        byteBuffer.position(iLimit);
        byteBufferZzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzds
    public final zzdp zzi(zzdp zzdpVar) throws zzdq {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzdp.zza;
        }
        if (zzdpVar.zzd != 2) {
            throw new zzdq("Unhandled input format:", zzdpVar);
        }
        boolean z10 = zzdpVar.zzc != iArr.length;
        int i10 = 0;
        while (true) {
            int length = iArr.length;
            if (i10 >= length) {
                return z10 ? new zzdp(zzdpVar.zzb, length, 2) : zzdp.zza;
            }
            int i11 = iArr[i10];
            if (i11 >= zzdpVar.zzc) {
                throw new zzdq("Unhandled input format:", zzdpVar);
            }
            z10 |= i11 != i10;
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzds
    public final void zzk() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzds
    public final void zzm() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzo(int[] iArr) {
        this.zzd = iArr;
    }
}
