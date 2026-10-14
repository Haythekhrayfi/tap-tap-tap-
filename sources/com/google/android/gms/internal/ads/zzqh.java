package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqh extends zzds {
    private int zzd;
    private boolean zze;
    private byte[] zzf;
    private byte[] zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;
    private long zzl;

    public zzqh() {
        byte[] bArr = zzfj.zzf;
        this.zzf = bArr;
        this.zzg = bArr;
    }

    private final int zzq(long j10) {
        return (int) ((j10 * ((long) this.zzb.zzb)) / 1000000);
    }

    private final int zzr(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > 1024) {
                int i10 = this.zzd;
                return (iPosition / i10) * i10;
            }
        }
        return byteBuffer.limit();
    }

    private final void zzs(byte[] bArr, int i10) {
        zzj(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.zzk = true;
        }
    }

    private final void zzt(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int iMin = Math.min(byteBuffer.remaining(), this.zzj);
        int i11 = this.zzj - iMin;
        System.arraycopy(bArr, i10 - i11, this.zzg, 0, i11);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.zzg, i11, iMin);
    }

    @Override // com.google.android.gms.internal.ads.zzdr
    public final void zze(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !zzn()) {
            int i10 = this.zzh;
            int i11 = 1;
            if (i10 == 0) {
                iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.zzf.length));
                int iLimit2 = byteBuffer.limit();
                while (true) {
                    iLimit2 -= 2;
                    if (iLimit2 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else if (Math.abs((int) byteBuffer.getShort(iLimit2)) > 1024) {
                        int i12 = this.zzd;
                        iPosition = ((iLimit2 / i12) * i12) + i12;
                        break;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.zzh = i11;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    zzj(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.zzk = true;
                    }
                }
                byteBuffer.limit(iLimit);
            } else if (i10 != 1) {
                iLimit = byteBuffer.limit();
                int iZzr = zzr(byteBuffer);
                byteBuffer.limit(iZzr);
                this.zzl += (long) (byteBuffer.remaining() / this.zzd);
                zzt(byteBuffer, this.zzg, this.zzj);
                if (iZzr < iLimit) {
                    zzs(this.zzg, this.zzj);
                    this.zzh = 0;
                    byteBuffer.limit(iLimit);
                }
            } else {
                iLimit = byteBuffer.limit();
                int iZzr2 = zzr(byteBuffer);
                int iPosition2 = iZzr2 - byteBuffer.position();
                byte[] bArr = this.zzf;
                int length = bArr.length;
                int i13 = this.zzi;
                int i14 = length - i13;
                if (iZzr2 >= iLimit || iPosition2 >= i14) {
                    int iMin = Math.min(iPosition2, i14);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.zzf, this.zzi, iMin);
                    int i15 = this.zzi + iMin;
                    this.zzi = i15;
                    byte[] bArr2 = this.zzf;
                    if (i15 == bArr2.length) {
                        if (this.zzk) {
                            zzs(bArr2, this.zzj);
                            long j10 = this.zzl;
                            int i16 = this.zzi;
                            int i17 = this.zzj;
                            this.zzl = j10 + ((long) ((i16 - (i17 + i17)) / this.zzd));
                            i15 = i16;
                        } else {
                            this.zzl += (long) ((i15 - this.zzj) / this.zzd);
                        }
                        zzt(byteBuffer, this.zzf, i15);
                        this.zzi = 0;
                        i11 = 2;
                        this.zzh = i11;
                    }
                    byteBuffer.limit(iLimit);
                } else {
                    zzs(bArr, i13);
                    this.zzi = 0;
                    this.zzh = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzds, com.google.android.gms.internal.ads.zzdr
    public final boolean zzg() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzds
    public final zzdp zzi(zzdp zzdpVar) throws zzdq {
        if (zzdpVar.zzd == 2) {
            return this.zze ? zzdpVar : zzdp.zza;
        }
        throw new zzdq("Unhandled input format:", zzdpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzds
    public final void zzk() {
        if (this.zze) {
            this.zzd = this.zzb.zze;
            int iZzq = zzq(150000L) * this.zzd;
            if (this.zzf.length != iZzq) {
                this.zzf = new byte[iZzq];
            }
            int iZzq2 = zzq(20000L) * this.zzd;
            this.zzj = iZzq2;
            if (this.zzg.length != iZzq2) {
                this.zzg = new byte[iZzq2];
            }
        }
        this.zzh = 0;
        this.zzl = 0L;
        this.zzi = 0;
        this.zzk = false;
    }

    @Override // com.google.android.gms.internal.ads.zzds
    public final void zzl() {
        int i10 = this.zzi;
        if (i10 > 0) {
            zzs(this.zzf, i10);
        }
        if (this.zzk) {
            return;
        }
        this.zzl += (long) (this.zzj / this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzds
    public final void zzm() {
        this.zze = false;
        this.zzj = 0;
        byte[] bArr = zzfj.zzf;
        this.zzf = bArr;
        this.zzg = bArr;
    }

    public final long zzo() {
        return this.zzl;
    }

    public final void zzp(boolean z10) {
        this.zze = z10;
    }
}
