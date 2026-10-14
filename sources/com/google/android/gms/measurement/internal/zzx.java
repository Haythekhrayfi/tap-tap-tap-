package com.google.android.gms.measurement.internal;

import android.util.Log;
import com.google.android.gms.internal.measurement.zzny;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzx extends zzy {
    public final /* synthetic */ zzaa zza;
    private final com.google.android.gms.internal.measurement.zzej zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzx(zzaa zzaaVar, String str, int i10, com.google.android.gms.internal.measurement.zzej zzejVar) {
        super(str, i10);
        this.zza = zzaaVar;
        this.zzh = zzejVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    public final int zza() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    public final boolean zzb() {
        return this.zzh.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    public final boolean zzc() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:106:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:108:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:109:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:111:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:113:0x0307  */
    /* JADX WARN: Code duplicated, block: B:116:0x0313  */
    /* JADX WARN: Code duplicated, block: B:123:0x0375  */
    /* JADX WARN: Code duplicated, block: B:124:0x0398  */
    /* JADX WARN: Code duplicated, block: B:159:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x03b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0224 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0290 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x03ba A[EDGE_INSN: B:171:0x03ba->B:126:0x03ba BREAK  A[LOOP:0: B:41:0x0122->B:47:0x0157], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x03ba A[EDGE_INSN: B:174:0x03ba->B:126:0x03ba BREAK  A[LOOP:0: B:41:0x0122->B:47:0x0157], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x02dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x0294 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x036b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0343 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x031b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x03ba A[EDGE_INSN: B:182:0x03ba->B:126:0x03ba BREAK  A[LOOP:0: B:41:0x0122->B:47:0x0157], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0115  */
    /* JADX WARN: Code duplicated, block: B:43:0x0128  */
    /* JADX WARN: Code duplicated, block: B:47:0x0157 A[LOOP:0: B:41:0x0122->B:47:0x0157, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x0172  */
    /* JADX WARN: Code duplicated, block: B:55:0x0188  */
    /* JADX WARN: Code duplicated, block: B:57:0x0192  */
    /* JADX WARN: Code duplicated, block: B:58:0x019b A[PHI: r12
  0x019b: PHI (r12v13 java.lang.String) = (r12v12 java.lang.String), (r12v15 java.lang.String) binds: [B:62:0x01ab, B:56:0x0190] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x019d  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x0205  */
    /* JADX WARN: Code duplicated, block: B:78:0x0219  */
    /* JADX WARN: Code duplicated, block: B:82:0x0240  */
    /* JADX WARN: Code duplicated, block: B:87:0x0276  */
    /* JADX WARN: Code duplicated, block: B:90:0x0288  */
    /* JADX WARN: Code duplicated, block: B:98:0x02c2  */
    public final boolean zzd(Long l10, Long l11, com.google.android.gms.internal.measurement.zzfs zzfsVar, long j10, zzas zzasVar, boolean z10) {
        HashSet hashSet;
        Iterator it;
        q.a aVar;
        Iterator it2;
        Iterator it3;
        com.google.android.gms.internal.measurement.zzel zzelVar;
        boolean z11;
        String strZze;
        zzem zzemVarZzk;
        String strZzd;
        String str;
        Object obj;
        zzem zzemVarZzk2;
        String strZzd2;
        String strZze2;
        String str2;
        Boolean boolZzh;
        Boolean boolZzg;
        zzeo zzeoVarZzay;
        String str3;
        Boolean boolZzi;
        com.google.android.gms.internal.measurement.zzfw zzfwVar;
        String strZzg;
        Object objZzh;
        com.google.android.gms.internal.measurement.zzel zzelVar2;
        zzny.zzc();
        boolean zZzs = this.zza.zzs.zzf().zzs(this.zzb, zzeb.zzW);
        long j11 = this.zzh.zzn() ? zzasVar.zze : j10;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (Log.isLoggable(this.zza.zzs.zzay().zzq(), 2)) {
            this.zza.zzs.zzay().zzj().zzd("Evaluating filter. audience, filter, event", Integer.valueOf(this.zzc), this.zzh.zzp() ? Integer.valueOf(this.zzh.zzb()) : null, this.zza.zzs.zzj().zzd(this.zzh.zzg()));
            this.zza.zzs.zzay().zzj().zzb("Filter definition", this.zza.zzf.zzu().zzo(this.zzh));
        }
        if (!this.zzh.zzp() || this.zzh.zzb() > 256) {
            this.zza.zzs.zzay().zzk().zzc("Invalid event filter ID. appId, id", zzeo.zzn(this.zzb), String.valueOf(this.zzh.zzp() ? Integer.valueOf(this.zzh.zzb()) : null));
            return false;
        }
        boolean z12 = this.zzh.zzk() || this.zzh.zzm() || this.zzh.zzn();
        if (z10 && !z12) {
            this.zza.zzs.zzay().zzj().zzc("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzc), this.zzh.zzp() ? Integer.valueOf(this.zzh.zzb()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.zzej zzejVar = this.zzh;
        String strZzh = zzfsVar.zzh();
        if (!zzejVar.zzo()) {
            hashSet = new HashSet();
            it = zzejVar.zzh().iterator();
            while (true) {
                if (it.hasNext()) {
                    aVar = new q.a();
                    it2 = zzfsVar.zzi().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = zzejVar.zzh().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                zzelVar = (com.google.android.gms.internal.measurement.zzel) it3.next();
                                if (zzelVar.zzh() || !zzelVar.zzg()) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                strZze = zzelVar.zze();
                                if (strZze.isEmpty()) {
                                    zzemVarZzk = this.zza.zzs.zzay().zzk();
                                    strZzd = this.zza.zzs.zzj().zzd(strZzh);
                                    str = "Event has empty param name. event";
                                } else {
                                    obj = aVar.get(strZze);
                                    if (obj instanceof Long) {
                                        if (!zzelVar.zzi()) {
                                            boolZzh = zzy.zzh(((Long) obj).longValue(), zzelVar.zzc());
                                            if (boolZzh != null) {
                                                break;
                                            }
                                            if (boolZzh.booleanValue() == z11) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        } else {
                                            zzemVarZzk2 = this.zza.zzs.zzay().zzk();
                                            strZzd2 = this.zza.zzs.zzj().zzd(strZzh);
                                            strZze2 = this.zza.zzs.zzj().zze(strZze);
                                            str2 = "No number filter for long param. event, param";
                                        }
                                    } else if (obj instanceof Double) {
                                        if (!zzelVar.zzi()) {
                                            boolZzg = zzy.zzg(((Double) obj).doubleValue(), zzelVar.zzc());
                                            if (boolZzg != null) {
                                                break;
                                            }
                                            if (boolZzg.booleanValue() == z11) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        } else {
                                            zzemVarZzk2 = this.zza.zzs.zzay().zzk();
                                            strZzd2 = this.zza.zzs.zzj().zzd(strZzh);
                                            strZze2 = this.zza.zzs.zzj().zze(strZze);
                                            str2 = "No number filter for double param. event, param";
                                        }
                                    } else if (obj instanceof String) {
                                        if (zzelVar.zzk()) {
                                            boolZzi = zzy.zzf((String) obj, zzelVar.zzd(), this.zza.zzs.zzay());
                                        } else if (zzelVar.zzi()) {
                                            str3 = (String) obj;
                                            if (zzlb.zzx(str3)) {
                                                boolZzi = zzy.zzi(str3, zzelVar.zzc());
                                            } else {
                                                zzemVarZzk2 = this.zza.zzs.zzay().zzk();
                                                strZzd2 = this.zza.zzs.zzj().zzd(strZzh);
                                                strZze2 = this.zza.zzs.zzj().zze(strZze);
                                                str2 = "Invalid param value for number filter. event, param";
                                            }
                                        } else {
                                            zzemVarZzk2 = this.zza.zzs.zzay().zzk();
                                            strZzd2 = this.zza.zzs.zzj().zzd(strZzh);
                                            strZze2 = this.zza.zzs.zzj().zze(strZze);
                                            str2 = "No filter for String param. event, param";
                                        }
                                        if (boolZzi != null) {
                                            break;
                                        }
                                        if (boolZzi.booleanValue() == z11) {
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                    } else {
                                        zzeoVarZzay = this.zza.zzs.zzay();
                                        if (obj == null) {
                                            zzeoVarZzay.zzj().zzc("Missing param for filter. event, param", this.zza.zzs.zzj().zzd(strZzh), this.zza.zzs.zzj().zze(strZze));
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                        zzemVarZzk2 = zzeoVarZzay.zzk();
                                        strZzd2 = this.zza.zzs.zzj().zzd(strZzh);
                                        strZze2 = this.zza.zzs.zzj().zze(strZze);
                                        str2 = "Unknown param type. event, param";
                                    }
                                }
                            }
                        } else {
                            zzfwVar = (com.google.android.gms.internal.measurement.zzfw) it2.next();
                            if (!hashSet.contains(zzfwVar.zzg())) {
                                if (zzfwVar.zzw()) {
                                    strZzg = zzfwVar.zzg();
                                    if (zzfwVar.zzw()) {
                                        objZzh = Long.valueOf(zzfwVar.zzd());
                                    } else {
                                        objZzh = null;
                                    }
                                } else if (zzfwVar.zzu()) {
                                    strZzg = zzfwVar.zzg();
                                    if (zzfwVar.zzu()) {
                                        objZzh = Double.valueOf(zzfwVar.zza());
                                    } else {
                                        objZzh = null;
                                    }
                                } else if (zzfwVar.zzy()) {
                                    strZzg = zzfwVar.zzg();
                                    objZzh = zzfwVar.zzh();
                                } else {
                                    zzemVarZzk2 = this.zza.zzs.zzay().zzk();
                                    strZzd2 = this.zza.zzs.zzj().zzd(strZzh);
                                    strZze2 = this.zza.zzs.zzj().zze(zzfwVar.zzg());
                                    str2 = "Unknown value for param. event, param";
                                }
                                aVar.put(strZzg, objZzh);
                            }
                        }
                        zzemVarZzk2.zzc(str2, strZzd2, strZze2);
                        break;
                    }
                }
                zzelVar2 = (com.google.android.gms.internal.measurement.zzel) it.next();
                if (zzelVar2.zze().isEmpty()) {
                    zzemVarZzk = this.zza.zzs.zzay().zzk();
                    strZzd = this.zza.zzs.zzj().zzd(strZzh);
                    str = "null or empty param name in filter. event";
                } else {
                    hashSet.add(zzelVar2.zze());
                }
                zzemVarZzk.zzb(str, strZzd);
                break;
            }
        }
        Boolean boolZzh2 = zzy.zzh(j11, zzejVar.zzf());
        if (boolZzh2 != null) {
            if (!boolZzh2.booleanValue()) {
                bool = Boolean.FALSE;
                break;
            }
            hashSet = new HashSet();
            it = zzejVar.zzh().iterator();
            while (true) {
                if (it.hasNext()) {
                    aVar = new q.a();
                    it2 = zzfsVar.zzi().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = zzejVar.zzh().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                zzelVar = (com.google.android.gms.internal.measurement.zzel) it3.next();
                                if (zzelVar.zzh()) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                strZze = zzelVar.zze();
                                if (strZze.isEmpty()) {
                                    zzemVarZzk = this.zza.zzs.zzay().zzk();
                                    strZzd = this.zza.zzs.zzj().zzd(strZzh);
                                    str = "Event has empty param name. event";
                                } else {
                                    obj = aVar.get(strZze);
                                    if (obj instanceof Long) {
                                        if (!zzelVar.zzi()) {
                                            boolZzh = zzy.zzh(((Long) obj).longValue(), zzelVar.zzc());
                                            if (boolZzh != null) {
                                                break;
                                                break;
                                            }
                                            if (boolZzh.booleanValue() == z11) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        } else {
                                            zzemVarZzk2 = this.zza.zzs.zzay().zzk();
                                            strZzd2 = this.zza.zzs.zzj().zzd(strZzh);
                                            strZze2 = this.zza.zzs.zzj().zze(strZze);
                                            str2 = "No number filter for long param. event, param";
                                        }
                                    } else if (obj instanceof Double) {
                                        if (!zzelVar.zzi()) {
                                            boolZzg = zzy.zzg(((Double) obj).doubleValue(), zzelVar.zzc());
                                            if (boolZzg != null) {
                                                break;
                                                break;
                                            }
                                            if (boolZzg.booleanValue() == z11) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        } else {
                                            zzemVarZzk2 = this.zza.zzs.zzay().zzk();
                                            strZzd2 = this.zza.zzs.zzj().zzd(strZzh);
                                            strZze2 = this.zza.zzs.zzj().zze(strZze);
                                            str2 = "No number filter for double param. event, param";
                                        }
                                    } else if (obj instanceof String) {
                                        if (zzelVar.zzk()) {
                                            boolZzi = zzy.zzf((String) obj, zzelVar.zzd(), this.zza.zzs.zzay());
                                        } else if (zzelVar.zzi()) {
                                            str3 = (String) obj;
                                            if (zzlb.zzx(str3)) {
                                                boolZzi = zzy.zzi(str3, zzelVar.zzc());
                                            } else {
                                                zzemVarZzk2 = this.zza.zzs.zzay().zzk();
                                                strZzd2 = this.zza.zzs.zzj().zzd(strZzh);
                                                strZze2 = this.zza.zzs.zzj().zze(strZze);
                                                str2 = "Invalid param value for number filter. event, param";
                                            }
                                        } else {
                                            zzemVarZzk2 = this.zza.zzs.zzay().zzk();
                                            strZzd2 = this.zza.zzs.zzj().zzd(strZzh);
                                            strZze2 = this.zza.zzs.zzj().zze(strZze);
                                            str2 = "No filter for String param. event, param";
                                        }
                                        if (boolZzi != null) {
                                            break;
                                            break;
                                        }
                                        if (boolZzi.booleanValue() == z11) {
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                    } else {
                                        zzeoVarZzay = this.zza.zzs.zzay();
                                        if (obj == null) {
                                            zzeoVarZzay.zzj().zzc("Missing param for filter. event, param", this.zza.zzs.zzj().zzd(strZzh), this.zza.zzs.zzj().zze(strZze));
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                        zzemVarZzk2 = zzeoVarZzay.zzk();
                                        strZzd2 = this.zza.zzs.zzj().zzd(strZzh);
                                        strZze2 = this.zza.zzs.zzj().zze(strZze);
                                        str2 = "Unknown param type. event, param";
                                    }
                                }
                            }
                        } else {
                            zzfwVar = (com.google.android.gms.internal.measurement.zzfw) it2.next();
                            if (!hashSet.contains(zzfwVar.zzg())) {
                                if (zzfwVar.zzw()) {
                                    strZzg = zzfwVar.zzg();
                                    if (zzfwVar.zzw()) {
                                        objZzh = Long.valueOf(zzfwVar.zzd());
                                    } else {
                                        objZzh = null;
                                    }
                                } else if (zzfwVar.zzu()) {
                                    strZzg = zzfwVar.zzg();
                                    if (zzfwVar.zzu()) {
                                        objZzh = Double.valueOf(zzfwVar.zza());
                                    } else {
                                        objZzh = null;
                                    }
                                } else if (zzfwVar.zzy()) {
                                    strZzg = zzfwVar.zzg();
                                    objZzh = zzfwVar.zzh();
                                } else {
                                    zzemVarZzk2 = this.zza.zzs.zzay().zzk();
                                    strZzd2 = this.zza.zzs.zzj().zzd(strZzh);
                                    strZze2 = this.zza.zzs.zzj().zze(zzfwVar.zzg());
                                    str2 = "Unknown value for param. event, param";
                                }
                                aVar.put(strZzg, objZzh);
                            }
                        }
                        zzemVarZzk2.zzc(str2, strZzd2, strZze2);
                        break;
                    }
                }
                zzelVar2 = (com.google.android.gms.internal.measurement.zzel) it.next();
                if (zzelVar2.zze().isEmpty()) {
                    zzemVarZzk = this.zza.zzs.zzay().zzk();
                    strZzd = this.zza.zzs.zzj().zzd(strZzh);
                    str = "null or empty param name in filter. event";
                } else {
                    hashSet.add(zzelVar2.zze());
                }
                zzemVarZzk.zzb(str, strZzd);
                break;
            }
        }
        this.zza.zzs.zzay().zzj().zzb("Event filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.zzd = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.zze = bool2;
        if (z12 && zzfsVar.zzu()) {
            Long lValueOf = Long.valueOf(zzfsVar.zzd());
            if (this.zzh.zzm()) {
                if (zZzs && this.zzh.zzo()) {
                    lValueOf = l10;
                }
                this.zzg = lValueOf;
            } else {
                if (zZzs && this.zzh.zzo()) {
                    lValueOf = l11;
                }
                this.zzf = lValueOf;
            }
        }
        return true;
    }
}
