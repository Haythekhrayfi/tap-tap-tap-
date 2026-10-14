package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdv extends zzds {
    @Override // com.google.android.gms.internal.ads.zzdr
    public final void zze(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.zzb.zzd;
        if (i11 == 3) {
            i10 += i10;
        } else if (i11 == 4) {
            i10 /= 2;
        } else if (i11 != 268435456) {
            if (i11 != 536870912) {
                if (i11 != 805306368) {
                    throw new IllegalStateException();
                }
                i10 /= 2;
            } else {
                i10 /= 3;
                i10 += i10;
            }
        }
        ByteBuffer byteBufferZzj = zzj(i10);
        int i12 = this.zzb.zzd;
        if (i12 == 3) {
            while (iPosition < iLimit) {
                byteBufferZzj.put((byte) 0);
                byteBufferZzj.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i12 == 4) {
            while (iPosition < iLimit) {
                short sMax = (short) (Math.max(-1.0f, Math.min(byteBuffer.getFloat(iPosition), 1.0f)) * 32767.0f);
                byteBufferZzj.put((byte) (sMax & 255));
                byteBufferZzj.put((byte) ((sMax >> 8) & 255));
                iPosition += 4;
            }
        } else if (i12 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferZzj.put(byteBuffer.get(iPosition + 1));
                byteBufferZzj.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i12 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferZzj.put(byteBuffer.get(iPosition + 1));
                byteBufferZzj.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i12 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferZzj.put(byteBuffer.get(iPosition + 2));
                byteBufferZzj.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferZzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzds
    public final zzdp zzi(zzdp zzdpVar) throws zzdq {
        int i10 = zzdpVar.zzd;
        if (i10 != 3) {
            if (i10 == 2) {
                return zzdp.zza;
            }
            if (i10 != 268435456 && i10 != 536870912 && i10 != 805306368 && i10 != 4) {
                throw new zzdq("Unhandled input format:", zzdpVar);
            }
        }
        return new zzdp(zzdpVar.zzb, zzdpVar.zzc, 2);
    }
}
