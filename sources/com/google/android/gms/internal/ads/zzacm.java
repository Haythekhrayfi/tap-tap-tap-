package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzacm implements zzaaw {
    private int zzc;
    private zzacn zze;
    private long zzh;
    private zzacp zzi;
    private int zzm;
    private boolean zzn;
    private final zzfa zza = new zzfa(12);
    private final zzacl zzb = new zzacl(null);
    private zzaaz zzd = new zzaau();
    private zzacp[] zzg = new zzacp[0];
    private long zzk = -1;
    private long zzl = -1;
    private int zzj = -1;
    private long zzf = -9223372036854775807L;

    private final zzacp zzf(int i10) {
        for (zzacp zzacpVar : this.zzg) {
            if (zzacpVar.zzg(i10)) {
                return zzacpVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0308  */
    @Override // com.google.android.gms.internal.ads.zzaaw
    public final int zza(zzaax zzaaxVar, zzabs zzabsVar) throws IOException {
        boolean z10;
        int i10;
        int i11;
        String str;
        long j10;
        long jZzf;
        long j11 = this.zzh;
        int i12 = 0;
        if (j11 != -1) {
            long jZzf2 = zzaaxVar.zzf();
            if (j11 < jZzf2 || j11 > 262144 + jZzf2) {
                zzabsVar.zza = j11;
                z10 = true;
            } else {
                ((zzaam) zzaaxVar).zzo((int) (j11 - jZzf2), false);
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.zzh = -1L;
        if (z10) {
            return 1;
        }
        int i13 = this.zzc;
        zzacp zzacpVar = null;
        if (i13 == 0) {
            if (!zzd(zzaaxVar)) {
                throw zzcd.zza("AVI Header List not found", null);
            }
            ((zzaam) zzaaxVar).zzo(12, false);
            this.zzc = 1;
            return 0;
        }
        if (i13 == 1) {
            ((zzaam) zzaaxVar).zzn(this.zza.zzH(), 0, 12, false);
            this.zza.zzF(0);
            zzacl zzaclVar = this.zzb;
            zzfa zzfaVar = this.zza;
            zzaclVar.zza(zzfaVar);
            int i14 = zzaclVar.zza;
            if (i14 != 1414744396) {
                throw zzcd.zza("LIST expected, found: " + i14, null);
            }
            zzaclVar.zzc = zzfaVar.zzg();
            zzacl zzaclVar2 = this.zzb;
            int i15 = zzaclVar2.zzc;
            if (i15 == 1819436136) {
                this.zzj = zzaclVar2.zzb;
                this.zzc = 2;
                return 0;
            }
            throw zzcd.zza("hdrl expected, found: " + i15, null);
        }
        if (i13 == 2) {
            int i16 = this.zzj - 4;
            zzfa zzfaVar2 = new zzfa(i16);
            ((zzaam) zzaaxVar).zzn(zzfaVar2.zzH(), 0, i16, false);
            zzacq zzacqVarZzc = zzacq.zzc(1819436136, zzfaVar2);
            if (zzacqVarZzc.zza() != 1819436136) {
                throw zzcd.zza("Unexpected header list type " + zzacqVarZzc.zza(), null);
            }
            zzacn zzacnVar = (zzacn) zzacqVarZzc.zzb(zzacn.class);
            if (zzacnVar == null) {
                throw zzcd.zza("AviHeader not found", null);
            }
            this.zze = zzacnVar;
            this.zzf = ((long) zzacnVar.zzc) * ((long) zzacnVar.zza);
            ArrayList arrayList = new ArrayList();
            zzfsc zzfscVar = zzacqVarZzc.zza;
            int size = zzfscVar.size();
            int i17 = 0;
            int i18 = 0;
            while (i17 < size) {
                zzaci zzaciVar = (zzaci) zzfscVar.get(i17);
                if (zzaciVar.zza() == 1819440243) {
                    zzacq zzacqVar = (zzacq) zzaciVar;
                    int i19 = i18 + 1;
                    zzaco zzacoVar = (zzaco) zzacqVar.zzb(zzaco.class);
                    zzacr zzacrVar = (zzacr) zzacqVar.zzb(zzacr.class);
                    if (zzacoVar == null) {
                        str = "Missing Stream Header";
                    } else {
                        if (zzacrVar == null) {
                            str = "Missing Stream Format";
                        } else {
                            i10 = i19;
                            long jZzp = zzfj.zzp(zzacoVar.zzd, ((long) zzacoVar.zzb) * 1000000, zzacoVar.zzc);
                            zzam zzamVar = zzacrVar.zza;
                            zzak zzakVarZzb = zzamVar.zzb();
                            zzakVarZzb.zzG(i18);
                            int i20 = zzacoVar.zze;
                            if (i20 != 0) {
                                zzakVarZzb.zzL(i20);
                            }
                            zzacs zzacsVar = (zzacs) zzacqVar.zzb(zzacs.class);
                            if (zzacsVar != null) {
                                zzakVarZzb.zzJ(zzacsVar.zza);
                            }
                            int iZzb = zzcc.zzb(zzamVar.zzm);
                            if (iZzb == 1) {
                                i11 = iZzb;
                            } else if (iZzb == 2) {
                                i11 = 2;
                            } else {
                                zzacpVar = null;
                            }
                            zzabz zzabzVarZzv = this.zzd.zzv(i18, i11);
                            zzabzVarZzv.zzk(zzakVarZzb.zzY());
                            zzacp zzacpVar2 = new zzacp(i18, i11, jZzp, zzacoVar.zzd, zzabzVarZzv);
                            this.zzf = jZzp;
                            zzacpVar = zzacpVar2;
                        }
                        if (zzacpVar != null) {
                            arrayList.add(zzacpVar);
                        }
                        i18 = i10;
                    }
                    zzer.zzf("AviExtractor", str);
                    i10 = i19;
                    if (zzacpVar != null) {
                        arrayList.add(zzacpVar);
                    }
                    i18 = i10;
                }
                i17++;
                zzacpVar = null;
                i12 = 0;
            }
            int i21 = i12;
            this.zzg = (zzacp[]) arrayList.toArray(new zzacp[i21]);
            this.zzd.zzC();
            this.zzc = 3;
            return i21;
        }
        if (i13 == 3) {
            long j12 = this.zzk;
            if (j12 != -1 && zzaaxVar.zzf() != j12) {
                this.zzh = j12;
                return 0;
            }
            ((zzaam) zzaaxVar).zzm(this.zza.zzH(), 0, 12, false);
            zzaaxVar.zzj();
            this.zza.zzF(0);
            this.zzb.zza(this.zza);
            int iZzg = this.zza.zzg();
            zzacl zzaclVar3 = this.zzb;
            int i22 = zzaclVar3.zza;
            if (i22 == 1179011410) {
                ((zzaam) zzaaxVar).zzo(12, false);
                return 0;
            }
            if (i22 != 1414744396 || iZzg != 1769369453) {
                this.zzh = zzaaxVar.zzf() + ((long) zzaclVar3.zzb) + 8;
                return 0;
            }
            long jZzf3 = zzaaxVar.zzf();
            this.zzk = jZzf3;
            long j13 = jZzf3 + ((long) zzaclVar3.zzb) + 8;
            this.zzl = j13;
            if (!this.zzn) {
                zzacn zzacnVar2 = this.zze;
                Objects.requireNonNull(zzacnVar2);
                if ((zzacnVar2.zzb & 16) == 16) {
                    this.zzc = 4;
                    this.zzh = j13;
                    return 0;
                }
                this.zzd.zzN(new zzabu(this.zzf, 0L));
                this.zzn = true;
            }
            this.zzh = zzaaxVar.zzf() + 12;
            this.zzc = 6;
            return 0;
        }
        if (i13 == 4) {
            ((zzaam) zzaaxVar).zzn(this.zza.zzH(), 0, 8, false);
            this.zza.zzF(0);
            int iZzg2 = this.zza.zzg();
            int iZzg3 = this.zza.zzg();
            if (iZzg2 == 829973609) {
                this.zzc = 5;
                this.zzm = iZzg3;
            } else {
                this.zzh = zzaaxVar.zzf() + ((long) iZzg3);
            }
            return 0;
        }
        if (i13 == 5) {
            zzfa zzfaVar3 = new zzfa(this.zzm);
            ((zzaam) zzaaxVar).zzn(zzfaVar3.zzH(), 0, this.zzm, false);
            if (zzfaVar3.zza() < 16) {
                j10 = 0;
            } else {
                int iZzc = zzfaVar3.zzc();
                zzfaVar3.zzG(8);
                long jZzg = zzfaVar3.zzg();
                long j14 = this.zzk;
                j10 = jZzg > j14 ? 0L : j14 + 8;
                zzfaVar3.zzF(iZzc);
            }
            while (zzfaVar3.zza() >= 16) {
                int iZzg4 = zzfaVar3.zzg();
                int iZzg5 = zzfaVar3.zzg();
                long jZzg2 = ((long) zzfaVar3.zzg()) + j10;
                zzfaVar3.zzg();
                zzacp zzacpVarZzf = zzf(iZzg4);
                if (zzacpVarZzf != null) {
                    if ((iZzg5 & 16) == 16) {
                        zzacpVarZzf.zzb(jZzg2);
                    }
                    zzacpVarZzf.zzd();
                }
            }
            for (zzacp zzacpVar3 : this.zzg) {
                zzacpVar3.zzc();
            }
            this.zzn = true;
            this.zzd.zzN(new zzacj(this, this.zzf));
            this.zzc = 6;
            this.zzh = this.zzk;
            return 0;
        }
        if (zzaaxVar.zzf() >= this.zzl) {
            return -1;
        }
        zzacp zzacpVar4 = this.zzi;
        if (zzacpVar4 != null) {
            if (!zzacpVar4.zzh(zzaaxVar)) {
                return 0;
            }
            this.zzi = null;
            return 0;
        }
        if ((zzaaxVar.zzf() & 1) == 1) {
            ((zzaam) zzaaxVar).zzo(1, false);
        }
        zzaam zzaamVar = (zzaam) zzaaxVar;
        zzaamVar.zzm(this.zza.zzH(), 0, 12, false);
        this.zza.zzF(0);
        int iZzg6 = this.zza.zzg();
        if (iZzg6 == 1414744396) {
            this.zza.zzF(8);
            zzaamVar.zzo(this.zza.zzg() != 1769369453 ? 8 : 12, false);
            zzaaxVar.zzj();
            return 0;
        }
        int iZzg7 = this.zza.zzg();
        if (iZzg6 == 1263424842) {
            jZzf = zzaaxVar.zzf() + ((long) iZzg7) + 8;
        } else {
            zzaamVar.zzo(8, false);
            zzaaxVar.zzj();
            zzacp zzacpVarZzf2 = zzf(iZzg6);
            if (zzacpVarZzf2 != null) {
                zzacpVarZzf2.zze(iZzg7);
                this.zzi = zzacpVarZzf2;
                return 0;
            }
            jZzf = zzaaxVar.zzf() + ((long) iZzg7);
        }
        this.zzh = jZzf;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzb(zzaaz zzaazVar) {
        this.zzc = 0;
        this.zzd = zzaazVar;
        this.zzh = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzc(long j10, long j11) {
        int i10;
        this.zzh = -1L;
        this.zzi = null;
        for (zzacp zzacpVar : this.zzg) {
            zzacpVar.zzf(j10);
        }
        if (j10 != 0) {
            i10 = 6;
        } else {
            if (this.zzg.length == 0) {
                this.zzc = 0;
                return;
            }
            i10 = 3;
        }
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final boolean zzd(zzaax zzaaxVar) throws IOException {
        ((zzaam) zzaaxVar).zzm(this.zza.zzH(), 0, 12, false);
        this.zza.zzF(0);
        if (this.zza.zzg() != 1179011410) {
            return false;
        }
        this.zza.zzG(4);
        return this.zza.zzg() == 541677121;
    }
}
