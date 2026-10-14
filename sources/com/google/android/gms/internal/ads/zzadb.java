package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class zzadb implements zzaaw {
    public static final zzabd zza = new zzabd() { // from class: com.google.android.gms.internal.ads.zzada
        @Override // com.google.android.gms.internal.ads.zzabd
        public final /* synthetic */ zzaaw[] zza(Uri uri, Map map) {
            int i10 = zzabc.zza;
            zzabd zzabdVar = zzadb.zza;
            return new zzaaw[]{new zzadb()};
        }
    };
    private zzaaz zzg;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private boolean zzo;
    private zzacz zzp;
    private zzadf zzq;
    private final zzfa zzb = new zzfa(4);
    private final zzfa zzc = new zzfa(9);
    private final zzfa zzd = new zzfa(11);
    private final zzfa zze = new zzfa();
    private final zzadc zzf = new zzadc();
    private int zzh = 1;

    private final zzfa zze(zzaax zzaaxVar) throws IOException {
        if (this.zzm > this.zze.zzb()) {
            zzfa zzfaVar = this.zze;
            int iZzb = zzfaVar.zzb();
            zzfaVar.zzD(new byte[Math.max(iZzb + iZzb, this.zzm)], 0);
        } else {
            this.zze.zzF(0);
        }
        this.zze.zzE(this.zzm);
        ((zzaam) zzaaxVar).zzn(this.zze.zzH(), 0, this.zzm, false);
        return this.zze;
    }

    @RequiresNonNull({"extractorOutput"})
    private final void zzf() {
        if (this.zzo) {
            return;
        }
        this.zzg.zzN(new zzabu(-9223372036854775807L, 0L));
        this.zzo = true;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaaw
    public final int zza(zzaax zzaaxVar, zzabs zzabsVar) throws IOException {
        long j10;
        boolean zZzf;
        boolean z10;
        zzade zzadeVar;
        long j11;
        zzdy.zzb(this.zzg);
        while (true) {
            int i10 = this.zzh;
            int i11 = 8;
            if (i10 != 1) {
                if (i10 == 2) {
                    ((zzaam) zzaaxVar).zzo(this.zzk, false);
                    this.zzk = 0;
                    this.zzh = 3;
                } else if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    if (this.zzi) {
                        j10 = this.zzj + this.zzn;
                    } else {
                        j10 = this.zzf.zzc() == -9223372036854775807L ? 0L : this.zzn;
                    }
                    int i12 = this.zzl;
                    if (i12 == 8) {
                        if (this.zzp != null) {
                            zzf();
                            zzadeVar = this.zzp;
                        }
                        zZzf = zzadeVar.zzf(zze(zzaaxVar), j10);
                        z10 = true;
                        if (!this.zzi && zZzf) {
                            this.zzi = true;
                            if (this.zzf.zzc() == -9223372036854775807L) {
                                j11 = -this.zzn;
                            } else {
                                j11 = 0;
                            }
                            this.zzj = j11;
                        }
                        this.zzk = 4;
                        this.zzh = 2;
                        if (z10) {
                            return 0;
                        }
                    } else {
                        i11 = i12;
                    }
                    if (i11 == 9) {
                        if (this.zzq != null) {
                            zzf();
                            zzadeVar = this.zzq;
                            zZzf = zzadeVar.zzf(zze(zzaaxVar), j10);
                            z10 = true;
                        }
                        if (!this.zzi) {
                            this.zzi = true;
                            if (this.zzf.zzc() == -9223372036854775807L) {
                                j11 = -this.zzn;
                            } else {
                                j11 = 0;
                            }
                            this.zzj = j11;
                        }
                        this.zzk = 4;
                        this.zzh = 2;
                        if (z10) {
                            return 0;
                        }
                    } else {
                        if (i11 == 18 && !this.zzo) {
                            zZzf = this.zzf.zzf(zze(zzaaxVar), j10);
                            zzadc zzadcVar = this.zzf;
                            long jZzc = zzadcVar.zzc();
                            if (jZzc != -9223372036854775807L) {
                                this.zzg.zzN(new zzabo(zzadcVar.zzd(), zzadcVar.zze(), jZzc));
                                this.zzo = true;
                            }
                            z10 = true;
                        }
                        if (!this.zzi) {
                            this.zzi = true;
                            if (this.zzf.zzc() == -9223372036854775807L) {
                                j11 = -this.zzn;
                            } else {
                                j11 = 0;
                            }
                            this.zzj = j11;
                        }
                        this.zzk = 4;
                        this.zzh = 2;
                        if (z10) {
                            return 0;
                        }
                    }
                    ((zzaam) zzaaxVar).zzo(this.zzm, false);
                    zZzf = false;
                    z10 = false;
                    if (!this.zzi) {
                        this.zzi = true;
                        if (this.zzf.zzc() == -9223372036854775807L) {
                            j11 = -this.zzn;
                        } else {
                            j11 = 0;
                        }
                        this.zzj = j11;
                    }
                    this.zzk = 4;
                    this.zzh = 2;
                    if (z10) {
                        return 0;
                    }
                } else {
                    if (!zzaaxVar.zzn(this.zzd.zzH(), 0, 11, true)) {
                        return -1;
                    }
                    this.zzd.zzF(0);
                    this.zzl = this.zzd.zzk();
                    this.zzm = this.zzd.zzm();
                    this.zzn = this.zzd.zzm();
                    this.zzn = (((long) (this.zzd.zzk() << 24)) | this.zzn) * 1000;
                    this.zzd.zzG(3);
                    this.zzh = 4;
                }
            } else {
                if (!zzaaxVar.zzn(this.zzc.zzH(), 0, 9, true)) {
                    return -1;
                }
                this.zzc.zzF(0);
                this.zzc.zzG(4);
                int iZzk = this.zzc.zzk();
                int i13 = iZzk & 4;
                int i14 = iZzk & 1;
                if (i13 != 0 && this.zzp == null) {
                    this.zzp = new zzacz(this.zzg.zzv(8, 1));
                }
                if (i14 != 0 && this.zzq == null) {
                    this.zzq = new zzadf(this.zzg.zzv(9, 2));
                }
                this.zzg.zzC();
                this.zzk = this.zzc.zze() - 5;
                this.zzh = 2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzb(zzaaz zzaazVar) {
        this.zzg = zzaazVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzc(long j10, long j11) {
        if (j10 == 0) {
            this.zzh = 1;
            this.zzi = false;
        } else {
            this.zzh = 3;
        }
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final boolean zzd(zzaax zzaaxVar) throws IOException {
        zzaam zzaamVar = (zzaam) zzaaxVar;
        zzaamVar.zzm(this.zzb.zzH(), 0, 3, false);
        this.zzb.zzF(0);
        if (this.zzb.zzm() != 4607062) {
            return false;
        }
        zzaamVar.zzm(this.zzb.zzH(), 0, 2, false);
        this.zzb.zzF(0);
        if ((this.zzb.zzo() & BaseTransientBottomBar.ANIMATION_DURATION) != 0) {
            return false;
        }
        zzaamVar.zzm(this.zzb.zzH(), 0, 4, false);
        this.zzb.zzF(0);
        int iZze = this.zzb.zze();
        zzaaxVar.zzj();
        zzaam zzaamVar2 = (zzaam) zzaaxVar;
        zzaamVar2.zzl(iZze, false);
        zzaamVar2.zzm(this.zzb.zzH(), 0, 4, false);
        this.zzb.zzF(0);
        return this.zzb.zze() == 0;
    }
}
