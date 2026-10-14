package com.google.android.gms.internal.ads;

import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
final class zzqi extends zzds {
    private static final int zzd = Float.floatToIntBits(Float.NaN);

    private static void zzo(int i10, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i10) * 4.656612875245797E-10d));
        if (iFloatToIntBits == zzd) {
            iFloatToIntBits = Float.floatToIntBits(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final void zze(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferZzj;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.zzb.zzd;
        if (i11 == 536870912) {
            byteBufferZzj = zzj((i10 / 3) * 4);
            while (iPosition < iLimit) {
                zzo(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferZzj);
                iPosition += 3;
            }
        } else {
            if (i11 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferZzj = zzj(i10);
            while (iPosition < iLimit) {
                int i12 = byteBuffer.get(iPosition) & 255;
                int i13 = (byteBuffer.get(iPosition + 1) & 255) << 8;
                zzo(i12 | i13 | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferZzj);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferZzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzds
    public final zzdp zzi(zzdp zzdpVar) throws zzdq {
        int i10 = zzdpVar.zzd;
        int i11 = zzfj.zza;
        if (i10 == 536870912 || i10 == 805306368) {
            return new zzdp(zzdpVar.zzb, zzdpVar.zzc, 4);
        }
        if (i10 == 4) {
            return zzdp.zza;
        }
        throw new zzdq("Unhandled input format:", zzdpVar);
    }
}
