package com.google.android.gms.internal.ads;

import android.support.v4.media.session.e;
import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class zzamz extends zzgvn {
    private Date zza;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzgvx zzm;
    private long zzn;

    public zzamz() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzgvx.zza;
    }

    public final String toString() {
        StringBuilder sbA = defpackage.a.a("MovieHeaderBox[creationTime=");
        sbA.append(this.zza);
        sbA.append(";modificationTime=");
        sbA.append(this.zzh);
        sbA.append(";timescale=");
        sbA.append(this.zzi);
        sbA.append(";duration=");
        sbA.append(this.zzj);
        sbA.append(";rate=");
        sbA.append(this.zzk);
        sbA.append(";volume=");
        sbA.append(this.zzl);
        sbA.append(";matrix=");
        sbA.append(this.zzm);
        sbA.append(";nextTrackId=");
        return e.a(sbA, this.zzn, "]");
    }

    public final long zzd() {
        return this.zzj;
    }

    public final long zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzgvl
    public final void zzf(ByteBuffer byteBuffer) {
        long jZze;
        zzi(byteBuffer);
        if (zzh() == 1) {
            this.zza = zzgvs.zza(zzamv.zzf(byteBuffer));
            this.zzh = zzgvs.zza(zzamv.zzf(byteBuffer));
            this.zzi = zzamv.zze(byteBuffer);
            jZze = zzamv.zzf(byteBuffer);
        } else {
            this.zza = zzgvs.zza(zzamv.zze(byteBuffer));
            this.zzh = zzgvs.zza(zzamv.zze(byteBuffer));
            this.zzi = zzamv.zze(byteBuffer);
            jZze = zzamv.zze(byteBuffer);
        }
        this.zzj = jZze;
        this.zzk = zzamv.zzb(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.zzl = ((short) ((bArr[1] & 255) | ((short) (65280 & (bArr[0] << 8))))) / 256.0f;
        zzamv.zzd(byteBuffer);
        zzamv.zze(byteBuffer);
        zzamv.zze(byteBuffer);
        this.zzm = new zzgvx(zzamv.zzb(byteBuffer), zzamv.zzb(byteBuffer), zzamv.zzb(byteBuffer), zzamv.zzb(byteBuffer), zzamv.zza(byteBuffer), zzamv.zza(byteBuffer), zzamv.zza(byteBuffer), zzamv.zzb(byteBuffer), zzamv.zzb(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzamv.zze(byteBuffer);
    }
}
