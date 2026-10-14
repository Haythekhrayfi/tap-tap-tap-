package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaig implements zzaju {
    private final List zza;

    public zzaig() {
        this(0);
    }

    public zzaig(int i10) {
        this.zza = zzfsc.zzl();
    }

    public zzaig(int i10, List list) {
        this.zza = list;
    }

    private final zzajk zzb(zzajt zzajtVar) {
        return new zzajk(zzd(zzajtVar));
    }

    private final zzajy zzc(zzajt zzajtVar) {
        return new zzajy(zzd(zzajtVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    private final List zzd(zzajt zzajtVar) {
        String str;
        int i10;
        zzfa zzfaVar = new zzfa(zzajtVar.zzd);
        ArrayList arrayList = this.zza;
        while (zzfaVar.zza() > 0) {
            int iZzk = zzfaVar.zzk();
            int iZzc = zzfaVar.zzc() + zzfaVar.zzk();
            if (iZzk == 134) {
                arrayList = new ArrayList();
                int iZzk2 = zzfaVar.zzk() & 31;
                for (int i11 = 0; i11 < iZzk2; i11++) {
                    String strZzx = zzfaVar.zzx(3, zzfot.zzc);
                    int iZzk3 = zzfaVar.zzk();
                    boolean z10 = (iZzk3 & 128) != 0;
                    if (z10) {
                        i10 = iZzk3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte bZzk = (byte) zzfaVar.zzk();
                    zzfaVar.zzG(1);
                    List listSingletonList = z10 ? Collections.singletonList((bZzk & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    zzak zzakVar = new zzak();
                    zzakVar.zzS(str);
                    zzakVar.zzK(strZzx);
                    zzakVar.zzu(i10);
                    zzakVar.zzI(listSingletonList);
                    arrayList.add(zzakVar.zzY());
                }
            }
            zzfaVar.zzF(iZzc);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzaju
    public final zzajw zza(int i10, zzajt zzajtVar) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new zzaja(new zzaix(zzajtVar.zzb));
            }
            if (i10 == 21) {
                return new zzaja(new zzaiv());
            }
            if (i10 == 27) {
                return new zzaja(new zzais(zzb(zzajtVar), false, false));
            }
            if (i10 == 36) {
                return new zzaja(new zzaiu(zzb(zzajtVar)));
            }
            if (i10 == 89) {
                return new zzaja(new zzaii(zzajtVar.zzc));
            }
            if (i10 == 138) {
                return new zzaja(new zzaih(zzajtVar.zzb));
            }
            if (i10 == 172) {
                return new zzaja(new zzaic(zzajtVar.zzb));
            }
            if (i10 == 257) {
                return new zzajj(new zzaiz("application/vnd.dvb.ait"));
            }
            if (i10 != 128) {
                if (i10 != 129) {
                    if (i10 == 134) {
                        return new zzajj(new zzaiz("application/x-scte35"));
                    }
                    if (i10 != 135) {
                        switch (i10) {
                            case 15:
                                return new zzaja(new zzaif(false, zzajtVar.zzb));
                            case 16:
                                return new zzaja(new zzaio(zzc(zzajtVar)));
                            case 17:
                                return new zzaja(new zzaiw(zzajtVar.zzb));
                            default:
                                return null;
                        }
                    }
                }
                return new zzaja(new zzahz(zzajtVar.zzb));
            }
        }
        return new zzaja(new zzail(zzc(zzajtVar)));
    }
}
