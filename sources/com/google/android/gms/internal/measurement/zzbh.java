package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbh extends zzaw {
    public zzbh() {
        this.zza.add(zzbl.FOR_IN);
        this.zza.add(zzbl.FOR_IN_CONST);
        this.zza.add(zzbl.FOR_IN_LET);
        this.zza.add(zzbl.FOR_LET);
        this.zza.add(zzbl.FOR_OF);
        this.zza.add(zzbl.FOR_OF_CONST);
        this.zza.add(zzbl.FOR_OF_LET);
        this.zza.add(zzbl.WHILE);
    }

    private static zzap zzc(zzbf zzbfVar, Iterator it, zzap zzapVar) {
        if (it != null) {
            while (it.hasNext()) {
                zzap zzapVarZzc = zzbfVar.zza((zzap) it.next()).zzc((zzae) zzapVar);
                if (zzapVarZzc instanceof zzag) {
                    zzag zzagVar = (zzag) zzapVarZzc;
                    if ("break".equals(zzagVar.zzc())) {
                        return zzap.zzf;
                    }
                    if ("return".equals(zzagVar.zzc())) {
                        return zzagVar;
                    }
                }
            }
        }
        return zzap.zzf;
    }

    private static zzap zzd(zzbf zzbfVar, zzap zzapVar, zzap zzapVar2) {
        return zzc(zzbfVar, zzapVar.zzl(), zzapVar2);
    }

    private static zzap zze(zzbf zzbfVar, zzap zzapVar, zzap zzapVar2) {
        if (zzapVar instanceof Iterable) {
            return zzc(zzbfVar, ((Iterable) zzapVar).iterator(), zzapVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x029f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x029f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x027c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0287  */
    /* JADX WARN: Code duplicated, block: B:86:0x0294  */
    /* JADX WARN: Code duplicated, block: B:98:0x02a3 A[EDGE_INSN: B:98:0x02a3->B:90:0x02a3 BREAK  A[LOOP:3: B:79:0x026e->B:89:0x029f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x02a5 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List list) {
        zzap zzapVarZzc;
        zzag zzagVar;
        zzbl zzblVar = zzbl.ADD;
        int iOrdinal = zzh.zze(str).ordinal();
        if (iOrdinal == 65) {
            zzap zzapVar = (zzap) a.a(zzbl.WHILE, 4, list, 0);
            zzap zzapVar2 = (zzap) list.get(1);
            zzap zzapVar3 = (zzap) list.get(2);
            zzap zzapVarZzb = zzgVar.zzb((zzap) list.get(3));
            if (zzgVar.zzb(zzapVar3).zzg().booleanValue()) {
                zzap zzapVarZzc2 = zzgVar.zzc((zzae) zzapVarZzb);
                if (zzapVarZzc2 instanceof zzag) {
                    zzag zzagVar2 = (zzag) zzapVarZzc2;
                    if (!"break".equals(zzagVar2.zzc())) {
                        if ("return".equals(zzagVar2.zzc())) {
                            return zzagVar2;
                        }
                        while (zzgVar.zzb(zzapVar).zzg().booleanValue()) {
                            zzapVarZzc = zzgVar.zzc((zzae) zzapVarZzb);
                            if (zzapVarZzc instanceof zzag) {
                                zzagVar = (zzag) zzapVarZzc;
                                if ("break".equals(zzagVar.zzc())) {
                                    break;
                                    break;
                                }
                                if ("return".equals(zzagVar.zzc())) {
                                    return zzagVar;
                                }
                            }
                            zzgVar.zzb(zzapVar2);
                        }
                    }
                } else {
                    while (zzgVar.zzb(zzapVar).zzg().booleanValue()) {
                        zzapVarZzc = zzgVar.zzc((zzae) zzapVarZzb);
                        if (zzapVarZzc instanceof zzag) {
                            zzagVar = (zzag) zzapVarZzc;
                            if ("break".equals(zzagVar.zzc())) {
                                break;
                                break;
                            }
                            if ("return".equals(zzagVar.zzc())) {
                                return zzagVar;
                            }
                        }
                        zzgVar.zzb(zzapVar2);
                    }
                }
            } else {
                while (zzgVar.zzb(zzapVar).zzg().booleanValue()) {
                    zzapVarZzc = zzgVar.zzc((zzae) zzapVarZzb);
                    if (zzapVarZzc instanceof zzag) {
                        zzagVar = (zzag) zzapVarZzc;
                        if ("break".equals(zzagVar.zzc())) {
                            break;
                        }
                        if ("return".equals(zzagVar.zzc())) {
                            return zzagVar;
                        }
                    }
                    zzgVar.zzb(zzapVar2);
                }
            }
            return zzap.zzf;
        }
        switch (iOrdinal) {
            case 26:
                if (!(a.a(zzbl.FOR_IN, 3, list, 0) instanceof zzat)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                return zzd(new zzbg(zzgVar, ((zzap) list.get(0)).zzi()), zzgVar.zzb((zzap) list.get(1)), zzgVar.zzb((zzap) list.get(2)));
            case 27:
                if (!(a.a(zzbl.FOR_IN_CONST, 3, list, 0) instanceof zzat)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                return zzd(new zzbd(zzgVar, ((zzap) list.get(0)).zzi()), zzgVar.zzb((zzap) list.get(1)), zzgVar.zzb((zzap) list.get(2)));
            case 28:
                if (!(a.a(zzbl.FOR_IN_LET, 3, list, 0) instanceof zzat)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                return zzd(new zzbe(zzgVar, ((zzap) list.get(0)).zzi()), zzgVar.zzb((zzap) list.get(1)), zzgVar.zzb((zzap) list.get(2)));
            case 29:
                zzap zzapVarZzb2 = zzgVar.zzb((zzap) a.a(zzbl.FOR_LET, 4, list, 0));
                if (!(zzapVarZzb2 instanceof zzae)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                zzae zzaeVar = (zzae) zzapVarZzb2;
                zzap zzapVar4 = (zzap) list.get(1);
                zzap zzapVar5 = (zzap) list.get(2);
                zzap zzapVarZzb3 = zzgVar.zzb((zzap) list.get(3));
                zzg zzgVarZza = zzgVar.zza();
                for (int i10 = 0; i10 < zzaeVar.zzc(); i10++) {
                    String strZzi = zzaeVar.zze(i10).zzi();
                    zzgVarZza.zzg(strZzi, zzgVar.zzd(strZzi));
                }
                while (zzgVar.zzb(zzapVar4).zzg().booleanValue()) {
                    zzap zzapVarZzc3 = zzgVar.zzc((zzae) zzapVarZzb3);
                    if (zzapVarZzc3 instanceof zzag) {
                        zzag zzagVar3 = (zzag) zzapVarZzc3;
                        if ("break".equals(zzagVar3.zzc())) {
                            return zzap.zzf;
                        }
                        if ("return".equals(zzagVar3.zzc())) {
                            return zzagVar3;
                        }
                    }
                    zzg zzgVarZza2 = zzgVar.zza();
                    for (int i11 = 0; i11 < zzaeVar.zzc(); i11++) {
                        String strZzi2 = zzaeVar.zze(i11).zzi();
                        zzgVarZza2.zzg(strZzi2, zzgVarZza.zzd(strZzi2));
                    }
                    zzgVarZza2.zzb(zzapVar5);
                    zzgVarZza = zzgVarZza2;
                }
                return zzap.zzf;
            case 30:
                if (!(a.a(zzbl.FOR_OF, 3, list, 0) instanceof zzat)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                return zze(new zzbg(zzgVar, ((zzap) list.get(0)).zzi()), zzgVar.zzb((zzap) list.get(1)), zzgVar.zzb((zzap) list.get(2)));
            case 31:
                if (!(a.a(zzbl.FOR_OF_CONST, 3, list, 0) instanceof zzat)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                return zze(new zzbd(zzgVar, ((zzap) list.get(0)).zzi()), zzgVar.zzb((zzap) list.get(1)), zzgVar.zzb((zzap) list.get(2)));
            case 32:
                if (!(a.a(zzbl.FOR_OF_LET, 3, list, 0) instanceof zzat)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                return zze(new zzbe(zzgVar, ((zzap) list.get(0)).zzi()), zzgVar.zzb((zzap) list.get(1)), zzgVar.zzb((zzap) list.get(2)));
            default:
                return super.zzb(str);
        }
    }
}
