package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgvl implements zzamw {
    private static final zzgvw zza = zzgvw.zzb(zzgvl.class);
    public final String zzb;
    public long zze;
    public zzgvq zzg;
    private zzamx zzh;
    private ByteBuffer zzi;
    public long zzf = -1;
    private ByteBuffer zzj = null;
    public boolean zzd = true;
    public boolean zzc = true;

    public zzgvl(String str) {
        this.zzb = str;
    }

    private final synchronized void zzd() {
        if (this.zzd) {
            return;
        }
        try {
            zzgvw zzgvwVar = zza;
            String str = this.zzb;
            zzgvwVar.zza(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
            this.zzi = this.zzg.zzd(this.zze, this.zzf);
            this.zzd = true;
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamw
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzamw
    public final void zzb(zzgvq zzgvqVar, ByteBuffer byteBuffer, long j10, zzamt zzamtVar) throws IOException {
        this.zze = zzgvqVar.zzb();
        byteBuffer.remaining();
        this.zzf = j10;
        this.zzg = zzgvqVar;
        zzgvqVar.zze(zzgvqVar.zzb() + j10);
        this.zzd = false;
        this.zzc = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzamw
    public final void zzc(zzamx zzamxVar) {
        this.zzh = zzamxVar;
    }

    public abstract void zzf(ByteBuffer byteBuffer);

    public final synchronized void zzg() {
        zzd();
        zzgvw zzgvwVar = zza;
        String str = this.zzb;
        zzgvwVar.zza(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.zzi;
        if (byteBuffer != null) {
            this.zzc = true;
            byteBuffer.rewind();
            zzf(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.zzj = byteBuffer.slice();
            }
            this.zzi = null;
        }
    }
}
