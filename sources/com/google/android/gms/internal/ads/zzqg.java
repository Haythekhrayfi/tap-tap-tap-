package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqg {
    private ByteBuffer zza = zzdr.zza;
    private int zzc = 0;
    private int zzb = 2;

    public final void zza(zzhp zzhpVar) {
        ByteBuffer byteBuffer = zzhpVar.zzb;
        Objects.requireNonNull(byteBuffer);
        if (byteBuffer.limit() - zzhpVar.zzb.position() == 0) {
            return;
        }
        ByteBuffer byteBuffer2 = zzhpVar.zzb;
        int iPosition = byteBuffer2.position();
        int iLimit = byteBuffer2.limit();
        int i10 = iLimit - iPosition;
        int i11 = (i10 + 255) / 255;
        int i12 = i11 + 27 + i10;
        if (this.zza.capacity() < i12) {
            this.zza = ByteBuffer.allocate(i12).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.zza.clear();
        }
        ByteBuffer byteBuffer3 = this.zza;
        byteBuffer3.put((byte) 79);
        byteBuffer3.put((byte) 103);
        byteBuffer3.put((byte) 103);
        byteBuffer3.put((byte) 83);
        byteBuffer3.put((byte) 0);
        byteBuffer3.put((byte) 0);
        int iZzb = this.zzc + zzabr.zzb(byteBuffer2);
        this.zzc = iZzb;
        byteBuffer3.putLong(iZzb);
        byteBuffer3.putInt(0);
        byteBuffer3.putInt(this.zzb);
        this.zzb++;
        byteBuffer3.putInt(0);
        byteBuffer3.put((byte) i11);
        for (int i13 = 0; i13 < i11; i13++) {
            if (i10 >= 255) {
                byteBuffer3.put((byte) -1);
                i10 -= 255;
            } else {
                byteBuffer3.put((byte) i10);
                i10 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBuffer3.put(byteBuffer2.get(iPosition));
            iPosition++;
        }
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer3.flip();
        byteBuffer3.putInt(22, zzfj.zzd(byteBuffer3.array(), byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0));
        byteBuffer3.position(0);
        this.zza = byteBuffer3;
        zzhpVar.zzb();
        zzhpVar.zzj(this.zza.remaining());
        zzhpVar.zzb.put(this.zza);
        zzhpVar.zzk();
    }

    public final void zzb() {
        this.zza = zzdr.zza;
        this.zzc = 0;
        this.zzb = 2;
    }
}
