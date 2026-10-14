package com.google.android.gms.internal.ads;

import android.net.Uri;
import ch.qos.logback.core.util.FileUtil;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafx implements zzaaw {
    public static final zzabd zza = new zzabd() { // from class: com.google.android.gms.internal.ads.zzafv
        @Override // com.google.android.gms.internal.ads.zzabd
        public final /* synthetic */ zzaaw[] zza(Uri uri, Map map) {
            int i10 = zzabc.zza;
            zzabd zzabdVar = zzafx.zza;
            return new zzaaw[]{new zzafx(0)};
        }
    };
    private static final zzaek zzb = new zzaek() { // from class: com.google.android.gms.internal.ads.zzafw
    };
    private final zzfa zzc;
    private final zzabp zzd;
    private final zzabl zze;
    private final zzabn zzf;
    private final zzabz zzg;
    private zzaaz zzh;
    private zzabz zzi;
    private zzabz zzj;
    private int zzk;
    private zzbz zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzafz zzq;
    private boolean zzr;

    public zzafx() {
        this(0);
    }

    public zzafx(int i10) {
        this.zzc = new zzfa(10);
        this.zzd = new zzabp();
        this.zze = new zzabl();
        this.zzm = -9223372036854775807L;
        this.zzf = new zzabn();
        zzaav zzaavVar = new zzaav();
        this.zzg = zzaavVar;
        this.zzj = zzaavVar;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x023f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0248  */
    /* JADX WARN: Code duplicated, block: B:115:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x011a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    /* JADX WARN: Code duplicated, block: B:21:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:50:0x0102  */
    /* JADX WARN: Code duplicated, block: B:53:0x010b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0112  */
    /* JADX WARN: Code duplicated, block: B:59:0x0123  */
    /* JADX WARN: Code duplicated, block: B:61:0x012b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0151 A[LOOP:0: B:54:0x0110->B:67:0x0151, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x0154 A[EDGE_INSN: B:68:0x0154->B:69:0x0155 BREAK  A[LOOP:0: B:54:0x0110->B:67:0x0151]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0159  */
    /* JADX WARN: Code duplicated, block: B:72:0x015f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0161  */
    /* JADX WARN: Code duplicated, block: B:74:0x0163 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0165  */
    /* JADX WARN: Code duplicated, block: B:77:0x0168  */
    /* JADX WARN: Code duplicated, block: B:78:0x016c  */
    /* JADX WARN: Multi-variable type inference failed */
    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    private final int zzf(zzaax zzaaxVar) throws Throwable {
        int iZze;
        int i10;
        int i11;
        int i12;
        zzagb zzagbVarZza;
        zzafz zzafzVarZzh;
        zzabl zzablVar;
        int i13;
        int i14;
        zzbz zzbzVar;
        long jZzf;
        zzafu zzafuVarZza;
        int iZza;
        int i15;
        zzby zzbyVarZzb;
        int iZza2;
        int i16;
        long jZzo;
        zzby zzbyVarZzb2;
        zzaev zzaevVar;
        int iZze2;
        if (this.zzk == 0) {
            try {
                zzk(zzaaxVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.zzq == null) {
            zzfa zzfaVar = new zzfa(this.zzd.zzc);
            ((zzaam) zzaaxVar).zzm(zzfaVar.zzH(), 0, this.zzd.zzc, false);
            zzabp zzabpVar = this.zzd;
            int i17 = zzabpVar.zza & 1;
            int i18 = 21;
            int i19 = zzabpVar.zze;
            if (i17 != 0) {
                if (i19 != 1) {
                    i11 = 36;
                }
                if (zzfaVar.zzd() >= i11 + 4) {
                    zzfaVar.zzF(i11);
                    iZze2 = zzfaVar.zze();
                    if (iZze2 != 1483304551) {
                        i12 = iZze2;
                    } else if (iZze2 == 1231971951) {
                        i12 = 1231971951;
                    } else if (zzfaVar.zzd() >= 40) {
                        zzfaVar.zzF(36);
                        if (zzfaVar.zze() == 1447187017) {
                            i12 = 1447187017;
                        } else {
                            i12 = 0;
                        }
                    } else {
                        i12 = 0;
                    }
                } else if (zzfaVar.zzd() >= 40) {
                    zzfaVar.zzF(36);
                    if (zzfaVar.zze() == 1447187017) {
                        i12 = 1447187017;
                    } else {
                        i12 = 0;
                    }
                } else {
                    i12 = 0;
                }
                if (i12 != 1483304551 || i12 == 1231971951) {
                    int i20 = i12;
                    zzagbVarZza = zzagb.zza(zzaaxVar.zzd(), zzaaxVar.zzf(), this.zzd, zzfaVar);
                    if (zzagbVarZza != null && !this.zze.zza()) {
                        zzaaxVar.zzj();
                        zzaam zzaamVar = (zzaam) zzaaxVar;
                        zzaamVar.zzl(i11 + 141, false);
                        zzaamVar.zzm(this.zzc.zzH(), 0, 3, false);
                        this.zzc.zzF(0);
                        zzablVar = this.zze;
                        int iZzm = this.zzc.zzm();
                        i13 = iZzm >> 12;
                        i14 = iZzm & 4095;
                        if (i13 <= 0 || i14 > 0) {
                            zzablVar.zza = i13;
                            zzablVar.zzb = i14;
                        }
                    }
                    ((zzaam) zzaaxVar).zzo(this.zzd.zzc, false);
                    if (zzagbVarZza == null && !zzagbVarZza.zzh() && i20 == 1231971951) {
                        zzafzVarZzh = zzh(zzaaxVar, false);
                    } else {
                        zzafzVarZzh = zzagbVarZza;
                    }
                } else if (i12 == 1447187017) {
                    zzafzVarZzh = zzaga.zza(zzaaxVar.zzd(), zzaaxVar.zzf(), this.zzd, zzfaVar);
                    ((zzaam) zzaaxVar).zzo(this.zzd.zzc, false);
                } else {
                    zzaaxVar.zzj();
                    zzafzVarZzh = null;
                }
                zzbzVar = this.zzl;
                jZzf = zzaaxVar.zzf();
                if (zzbzVar != null) {
                    zzafuVarZza = null;
                    break;
                }
                iZza = zzbzVar.zza();
                i15 = 0;
                while (true) {
                    if (i15 < iZza) {
                        zzafuVarZza = null;
                        break;
                    }
                    zzbyVarZzb = zzbzVar.zzb(i15);
                    if (zzbyVarZzb instanceof zzaer) {
                        zzaer zzaerVar = (zzaer) zzbyVarZzb;
                        iZza2 = zzbzVar.zza();
                        i16 = 0;
                        while (true) {
                            if (i16 < iZza2) {
                                jZzo = -9223372036854775807L;
                                break;
                            }
                            zzbyVarZzb2 = zzbzVar.zzb(i16);
                            if (zzbyVarZzb2 instanceof zzaev) {
                                zzaevVar = (zzaev) zzbyVarZzb2;
                                if (zzaevVar.zzf.equals("TLEN")) {
                                    jZzo = zzfj.zzo(Long.parseLong((String) zzaevVar.zzc.get(0)));
                                    break;
                                }
                            }
                            i16++;
                        }
                        zzafuVarZza = zzafu.zza(jZzf, zzaerVar, jZzo);
                        break;
                    }
                    i15++;
                }
                if (this.zzr) {
                    zzafzVarZzh = new zzafy();
                } else {
                    if (zzafuVarZza != null) {
                        zzafzVarZzh = zzafuVarZza;
                    } else if (zzafzVarZzh == null) {
                        zzafzVarZzh = null;
                    }
                    if (zzafzVarZzh != null) {
                        zzafzVarZzh.zzh();
                    } else {
                        zzafzVarZzh = zzh(zzaaxVar, false);
                    }
                }
                this.zzq = zzafzVarZzh;
                this.zzh.zzN(zzafzVarZzh);
                zzabz zzabzVar = this.zzj;
                zzak zzakVar = new zzak();
                zzakVar.zzS(this.zzd.zzb);
                zzakVar.zzL(4096);
                zzakVar.zzw(this.zzd.zze);
                zzakVar.zzT(this.zzd.zzd);
                zzakVar.zzC(this.zze.zza);
                zzakVar.zzD(this.zze.zzb);
                zzakVar.zzM(this.zzl);
                zzabzVar.zzk(zzakVar.zzY());
                this.zzo = zzaaxVar.zzf();
            } else if (i19 == 1) {
                i18 = 13;
            }
            i11 = i18;
            if (zzfaVar.zzd() >= i11 + 4) {
                zzfaVar.zzF(i11);
                iZze2 = zzfaVar.zze();
                if (iZze2 != 1483304551) {
                    i12 = iZze2;
                } else if (iZze2 == 1231971951) {
                    i12 = 1231971951;
                } else if (zzfaVar.zzd() >= 40) {
                    zzfaVar.zzF(36);
                    if (zzfaVar.zze() == 1447187017) {
                        i12 = 1447187017;
                    } else {
                        i12 = 0;
                    }
                } else {
                    i12 = 0;
                }
            } else if (zzfaVar.zzd() >= 40) {
                zzfaVar.zzF(36);
                if (zzfaVar.zze() == 1447187017) {
                    i12 = 1447187017;
                } else {
                    i12 = 0;
                }
            } else {
                i12 = 0;
            }
            if (i12 != 1483304551) {
                int i21 = i12;
                zzagbVarZza = zzagb.zza(zzaaxVar.zzd(), zzaaxVar.zzf(), this.zzd, zzfaVar);
                if (zzagbVarZza != null) {
                    zzaaxVar.zzj();
                    zzaam zzaamVar2 = (zzaam) zzaaxVar;
                    zzaamVar2.zzl(i11 + 141, false);
                    zzaamVar2.zzm(this.zzc.zzH(), 0, 3, false);
                    this.zzc.zzF(0);
                    zzablVar = this.zze;
                    int iZzm2 = this.zzc.zzm();
                    i13 = iZzm2 >> 12;
                    i14 = iZzm2 & 4095;
                    if (i13 <= 0) {
                        zzablVar.zza = i13;
                        zzablVar.zzb = i14;
                    } else {
                        zzablVar.zza = i13;
                        zzablVar.zzb = i14;
                    }
                }
                ((zzaam) zzaaxVar).zzo(this.zzd.zzc, false);
                if (zzagbVarZza == null) {
                    zzafzVarZzh = zzagbVarZza;
                } else {
                    zzafzVarZzh = zzagbVarZza;
                }
            } else {
                int i22 = i12;
                zzagbVarZza = zzagb.zza(zzaaxVar.zzd(), zzaaxVar.zzf(), this.zzd, zzfaVar);
                if (zzagbVarZza != null) {
                    zzaaxVar.zzj();
                    zzaam zzaamVar3 = (zzaam) zzaaxVar;
                    zzaamVar3.zzl(i11 + 141, false);
                    zzaamVar3.zzm(this.zzc.zzH(), 0, 3, false);
                    this.zzc.zzF(0);
                    zzablVar = this.zze;
                    int iZzm3 = this.zzc.zzm();
                    i13 = iZzm3 >> 12;
                    i14 = iZzm3 & 4095;
                    if (i13 <= 0) {
                        zzablVar.zza = i13;
                        zzablVar.zzb = i14;
                    } else {
                        zzablVar.zza = i13;
                        zzablVar.zzb = i14;
                    }
                }
                ((zzaam) zzaaxVar).zzo(this.zzd.zzc, false);
                if (zzagbVarZza == null) {
                    zzafzVarZzh = zzagbVarZza;
                } else {
                    zzafzVarZzh = zzagbVarZza;
                }
            }
            zzbzVar = this.zzl;
            jZzf = zzaaxVar.zzf();
            if (zzbzVar != null) {
                zzafuVarZza = null;
                break;
            }
            iZza = zzbzVar.zza();
            i15 = 0;
            while (true) {
                if (i15 < iZza) {
                    zzafuVarZza = null;
                    break;
                }
                zzbyVarZzb = zzbzVar.zzb(i15);
                if (zzbyVarZzb instanceof zzaer) {
                    zzaer zzaerVar2 = (zzaer) zzbyVarZzb;
                    iZza2 = zzbzVar.zza();
                    i16 = 0;
                    while (true) {
                        if (i16 < iZza2) {
                            jZzo = -9223372036854775807L;
                            break;
                        }
                        zzbyVarZzb2 = zzbzVar.zzb(i16);
                        if (zzbyVarZzb2 instanceof zzaev) {
                            zzaevVar = (zzaev) zzbyVarZzb2;
                            if (zzaevVar.zzf.equals("TLEN")) {
                                jZzo = zzfj.zzo(Long.parseLong((String) zzaevVar.zzc.get(0)));
                                break;
                            }
                        }
                        i16++;
                    }
                    zzafuVarZza = zzafu.zza(jZzf, zzaerVar2, jZzo);
                    break;
                }
                i15++;
            }
            if (this.zzr) {
                zzafzVarZzh = new zzafy();
            } else {
                if (zzafuVarZza != null) {
                    zzafzVarZzh = zzafuVarZza;
                } else if (zzafzVarZzh == null) {
                    zzafzVarZzh = null;
                }
                if (zzafzVarZzh != null) {
                    zzafzVarZzh.zzh();
                } else {
                    zzafzVarZzh = zzh(zzaaxVar, false);
                }
            }
            this.zzq = zzafzVarZzh;
            this.zzh.zzN(zzafzVarZzh);
            zzabz zzabzVar2 = this.zzj;
            zzak zzakVar2 = new zzak();
            zzakVar2.zzS(this.zzd.zzb);
            zzakVar2.zzL(4096);
            zzakVar2.zzw(this.zzd.zze);
            zzakVar2.zzT(this.zzd.zzd);
            zzakVar2.zzC(this.zze.zza);
            zzakVar2.zzD(this.zze.zzb);
            zzakVar2.zzM(this.zzl);
            zzabzVar2.zzk(zzakVar2.zzY());
            this.zzo = zzaaxVar.zzf();
        } else {
            long j10 = this.zzo;
            if (j10 != 0) {
                long jZzf2 = zzaaxVar.zzf();
                if (jZzf2 < j10) {
                    ((zzaam) zzaaxVar).zzo((int) (j10 - jZzf2), false);
                }
            }
        }
        int i23 = this.zzp;
        if (i23 == 0) {
            zzaaxVar.zzj();
            if (zzj(zzaaxVar)) {
                return -1;
            }
            this.zzc.zzF(0);
            int iZze3 = this.zzc.zze();
            if (!zzi(iZze3, this.zzk) || zzabq.zzb(iZze3) == -1) {
                ((zzaam) zzaaxVar).zzo(1, false);
                this.zzk = 0;
            } else {
                this.zzd.zza(iZze3);
                if (this.zzm == -9223372036854775807L) {
                    this.zzm = this.zzq.zzc(zzaaxVar.zzf());
                }
                zzabp zzabpVar2 = this.zzd;
                int i24 = zzabpVar2.zzc;
                this.zzp = i24;
                zzafz zzafzVar = this.zzq;
                if (zzafzVar instanceof zzaft) {
                    zzg(this.zzn + ((long) zzabpVar2.zzg));
                    throw null;
                }
                i23 = i24;
                iZze = this.zzj.zze(zzaaxVar, i23, true);
                if (iZze == -1) {
                    return -1;
                }
                i10 = this.zzp - iZze;
                this.zzp = i10;
                if (i10 <= 0) {
                    this.zzj.zzs(zzg(this.zzn), 1, this.zzd.zzc, 0, null);
                    this.zzn += (long) this.zzd.zzg;
                    this.zzp = 0;
                    return 0;
                }
            }
        } else {
            iZze = this.zzj.zze(zzaaxVar, i23, true);
            if (iZze == -1) {
                return -1;
            }
            i10 = this.zzp - iZze;
            this.zzp = i10;
            if (i10 <= 0) {
                this.zzj.zzs(zzg(this.zzn), 1, this.zzd.zzc, 0, null);
                this.zzn += (long) this.zzd.zzg;
                this.zzp = 0;
                return 0;
            }
        }
        return 0;
    }

    private final long zzg(long j10) {
        return ((j10 * 1000000) / ((long) this.zzd.zzd)) + this.zzm;
    }

    private final zzafz zzh(zzaax zzaaxVar, boolean z10) throws IOException {
        ((zzaam) zzaaxVar).zzm(this.zzc.zzH(), 0, 4, false);
        this.zzc.zzF(0);
        this.zzd.zza(this.zzc.zze());
        return new zzafs(zzaaxVar.zzd(), zzaaxVar.zzf(), this.zzd, false);
    }

    private static boolean zzi(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    private final boolean zzj(zzaax zzaaxVar) throws IOException {
        zzafz zzafzVar = this.zzq;
        if (zzafzVar != null) {
            long jZzb = zzafzVar.zzb();
            if (jZzb != -1 && zzaaxVar.zze() > jZzb - 4) {
                return true;
            }
        }
        try {
            return !zzaaxVar.zzm(this.zzc.zzH(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzk(zzaax zzaaxVar, boolean z10) throws Throwable {
        int iZze;
        int i10;
        int iZzb;
        zzaaxVar.zzj();
        if (zzaaxVar.zzf() == 0) {
            zzbz zzbzVarZza = this.zzf.zza(zzaaxVar, null);
            this.zzl = zzbzVarZza;
            if (zzbzVarZza != null) {
                this.zze.zzb(zzbzVarZza);
            }
            iZze = (int) zzaaxVar.zze();
            if (!z10) {
                ((zzaam) zzaaxVar).zzo(iZze, false);
            }
            i10 = 0;
        } else {
            iZze = 0;
            i10 = 0;
        }
        int i11 = i10;
        int i12 = i11;
        while (true) {
            if (zzj(zzaaxVar)) {
                if (i11 > 0) {
                    break;
                }
                throw new EOFException();
            }
            this.zzc.zzF(0);
            int iZze2 = this.zzc.zze();
            if ((i10 == 0 || zzi(iZze2, i10)) && (iZzb = zzabq.zzb(iZze2)) != -1) {
                i11++;
                if (i11 != 1) {
                    if (i11 == 4) {
                        break;
                    }
                } else {
                    this.zzd.zza(iZze2);
                    i10 = iZze2;
                }
                ((zzaam) zzaaxVar).zzl(iZzb - 4, false);
            } else {
                int i13 = i12 + 1;
                if (i12 == (true != z10 ? 131072 : FileUtil.BUF_SIZE)) {
                    if (z10) {
                        return false;
                    }
                    throw zzcd.zza("Searched too many bytes.", null);
                }
                if (z10) {
                    zzaaxVar.zzj();
                    ((zzaam) zzaaxVar).zzl(iZze + i13, false);
                } else {
                    ((zzaam) zzaaxVar).zzo(1, false);
                }
                i10 = 0;
                i12 = i13;
                i11 = 0;
            }
        }
        if (z10) {
            ((zzaam) zzaaxVar).zzo(iZze + i12, false);
        } else {
            zzaaxVar.zzj();
        }
        this.zzk = i10;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final int zza(zzaax zzaaxVar, zzabs zzabsVar) throws Throwable {
        zzdy.zzb(this.zzi);
        int i10 = zzfj.zza;
        int iZzf = zzf(zzaaxVar);
        if (iZzf == -1 && (this.zzq instanceof zzaft)) {
            if (this.zzq.zze() != zzg(this.zzn)) {
                throw null;
            }
        }
        return iZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzb(zzaaz zzaazVar) {
        this.zzh = zzaazVar;
        zzabz zzabzVarZzv = zzaazVar.zzv(0, 1);
        this.zzi = zzabzVarZzv;
        this.zzj = zzabzVarZzv;
        this.zzh.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzc(long j10, long j11) {
        this.zzk = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0L;
        this.zzp = 0;
        zzafz zzafzVar = this.zzq;
        if (zzafzVar instanceof zzaft) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final boolean zzd(zzaax zzaaxVar) throws IOException {
        return zzk(zzaaxVar, true);
    }

    public final void zze() {
        this.zzr = true;
    }
}
