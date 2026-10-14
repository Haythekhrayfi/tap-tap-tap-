package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzlk;
import com.google.android.gms.internal.measurement.zzoz;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlb extends zzkn {
    public zzlb(zzkz zzkzVar) {
        super(zzkzVar);
    }

    public static final boolean zzA(zzaw zzawVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzawVar);
        Preconditions.checkNotNull(zzqVar);
        return (TextUtils.isEmpty(zzqVar.zzb) && TextUtils.isEmpty(zzqVar.zzq)) ? false : true;
    }

    public static final com.google.android.gms.internal.measurement.zzfw zzB(com.google.android.gms.internal.measurement.zzfs zzfsVar, String str) {
        for (com.google.android.gms.internal.measurement.zzfw zzfwVar : zzfsVar.zzi()) {
            if (zzfwVar.zzg().equals(str)) {
                return zzfwVar;
            }
        }
        return null;
    }

    public static final Object zzC(com.google.android.gms.internal.measurement.zzfs zzfsVar, String str) {
        com.google.android.gms.internal.measurement.zzfw zzfwVarZzB = zzB(zzfsVar, str);
        if (zzfwVarZzB == null) {
            return null;
        }
        if (zzfwVarZzB.zzy()) {
            return zzfwVarZzB.zzh();
        }
        if (zzfwVarZzB.zzw()) {
            return Long.valueOf(zzfwVarZzB.zzd());
        }
        if (zzfwVarZzB.zzu()) {
            return Double.valueOf(zzfwVarZzB.zza());
        }
        if (zzfwVarZzB.zzc() <= 0) {
            return null;
        }
        List<com.google.android.gms.internal.measurement.zzfw> listZzi = zzfwVarZzB.zzi();
        ArrayList arrayList = new ArrayList();
        for (com.google.android.gms.internal.measurement.zzfw zzfwVar : listZzi) {
            if (zzfwVar != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.zzfw zzfwVar2 : zzfwVar.zzi()) {
                    if (zzfwVar2.zzy()) {
                        bundle.putString(zzfwVar2.zzg(), zzfwVar2.zzh());
                    } else if (zzfwVar2.zzw()) {
                        bundle.putLong(zzfwVar2.zzg(), zzfwVar2.zzd());
                    } else if (zzfwVar2.zzu()) {
                        bundle.putDouble(zzfwVar2.zzg(), zzfwVar2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private final void zzD(StringBuilder sb2, int i10, List list) {
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzfw zzfwVar = (com.google.android.gms.internal.measurement.zzfw) it.next();
            if (zzfwVar != null) {
                zzF(sb2, i11);
                sb2.append("param {\n");
                zzI(sb2, i11, "name", zzfwVar.zzx() ? this.zzs.zzj().zze(zzfwVar.zzg()) : null);
                zzI(sb2, i11, "string_value", zzfwVar.zzy() ? zzfwVar.zzh() : null);
                zzI(sb2, i11, "int_value", zzfwVar.zzw() ? Long.valueOf(zzfwVar.zzd()) : null);
                zzI(sb2, i11, "double_value", zzfwVar.zzu() ? Double.valueOf(zzfwVar.zza()) : null);
                if (zzfwVar.zzc() > 0) {
                    zzD(sb2, i11, zzfwVar.zzi());
                }
                zzF(sb2, i11);
                sb2.append("}\n");
            }
        }
    }

    private final void zzE(StringBuilder sb2, int i10, com.google.android.gms.internal.measurement.zzel zzelVar) {
        String str;
        if (zzelVar == null) {
            return;
        }
        zzF(sb2, i10);
        sb2.append("filter {\n");
        if (zzelVar.zzh()) {
            zzI(sb2, i10, "complement", Boolean.valueOf(zzelVar.zzg()));
        }
        if (zzelVar.zzj()) {
            zzI(sb2, i10, "param_name", this.zzs.zzj().zze(zzelVar.zze()));
        }
        if (zzelVar.zzk()) {
            int i11 = i10 + 1;
            com.google.android.gms.internal.measurement.zzex zzexVarZzd = zzelVar.zzd();
            if (zzexVarZzd != null) {
                zzF(sb2, i11);
                sb2.append("string_filter {\n");
                if (zzexVarZzd.zzi()) {
                    switch (zzexVarZzd.zzj()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    zzI(sb2, i11, "match_type", str);
                }
                if (zzexVarZzd.zzh()) {
                    zzI(sb2, i11, "expression", zzexVarZzd.zzd());
                }
                if (zzexVarZzd.zzg()) {
                    zzI(sb2, i11, "case_sensitive", Boolean.valueOf(zzexVarZzd.zzf()));
                }
                if (zzexVarZzd.zza() > 0) {
                    zzF(sb2, i11 + 1);
                    sb2.append("expression_list {\n");
                    for (String str2 : zzexVarZzd.zze()) {
                        zzF(sb2, i11 + 2);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                zzF(sb2, i11);
                sb2.append("}\n");
            }
        }
        if (zzelVar.zzi()) {
            zzJ(sb2, i10 + 1, "number_filter", zzelVar.zzc());
        }
        zzF(sb2, i10);
        sb2.append("}\n");
    }

    private static final void zzF(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    private static final String zzG(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    private static final void zzH(StringBuilder sb2, int i10, String str, com.google.android.gms.internal.measurement.zzgh zzghVar) {
        if (zzghVar == null) {
            return;
        }
        zzF(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzghVar.zzb() != 0) {
            zzF(sb2, 4);
            sb2.append("results: ");
            int i11 = 0;
            for (Long l10 : zzghVar.zzk()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (zzghVar.zzd() != 0) {
            zzF(sb2, 4);
            sb2.append("status: ");
            int i13 = 0;
            for (Long l11 : zzghVar.zzn()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i13 = i14;
            }
            sb2.append('\n');
        }
        if (zzghVar.zza() != 0) {
            zzF(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i15 = 0;
            for (com.google.android.gms.internal.measurement.zzfq zzfqVar : zzghVar.zzj()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzfqVar.zzh() ? Integer.valueOf(zzfqVar.zza()) : null);
                sb2.append(":");
                sb2.append(zzfqVar.zzg() ? Long.valueOf(zzfqVar.zzb()) : null);
                i15 = i16;
            }
            sb2.append("}\n");
        }
        if (zzghVar.zzc() != 0) {
            zzF(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i17 = 0;
            for (com.google.android.gms.internal.measurement.zzgj zzgjVar : zzghVar.zzm()) {
                int i18 = i17 + 1;
                if (i17 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzgjVar.zzi() ? Integer.valueOf(zzgjVar.zzb()) : null);
                sb2.append(": [");
                Iterator it = zzgjVar.zzf().iterator();
                int i19 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i20 = i19 + 1;
                    if (i19 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(jLongValue);
                    i19 = i20;
                }
                sb2.append("]");
                i17 = i18;
            }
            sb2.append("}\n");
        }
        zzF(sb2, 3);
        sb2.append("}\n");
    }

    private static final void zzI(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        zzF(sb2, i10 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    private static final void zzJ(StringBuilder sb2, int i10, String str, com.google.android.gms.internal.measurement.zzeq zzeqVar) {
        String str2;
        if (zzeqVar == null) {
            return;
        }
        zzF(sb2, i10);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzeqVar.zzg()) {
            int iZzm = zzeqVar.zzm();
            if (iZzm == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iZzm == 2) {
                str2 = "LESS_THAN";
            } else if (iZzm != 3) {
                str2 = iZzm != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            zzI(sb2, i10, "comparison_type", str2);
        }
        if (zzeqVar.zzi()) {
            zzI(sb2, i10, "match_as_float", Boolean.valueOf(zzeqVar.zzf()));
        }
        if (zzeqVar.zzh()) {
            zzI(sb2, i10, "comparison_value", zzeqVar.zzc());
        }
        if (zzeqVar.zzk()) {
            zzI(sb2, i10, "min_comparison_value", zzeqVar.zze());
        }
        if (zzeqVar.zzj()) {
            zzI(sb2, i10, "max_comparison_value", zzeqVar.zzd());
        }
        zzF(sb2, i10);
        sb2.append("}\n");
    }

    public static int zza(com.google.android.gms.internal.measurement.zzgb zzgbVar, String str) {
        if (zzgbVar != null) {
            for (int i10 = 0; i10 < zzgbVar.zzb(); i10++) {
                if (str.equals(zzgbVar.zzao(i10).zzf())) {
                    return i10;
                }
            }
        }
        return -1;
    }

    public static zzlk zzl(zzlk zzlkVar, byte[] bArr) throws com.google.android.gms.internal.measurement.zzko {
        com.google.android.gms.internal.measurement.zzjq zzjqVarZza = com.google.android.gms.internal.measurement.zzjq.zza();
        return zzjqVarZza != null ? zzlkVar.zzaA(bArr, zzjqVarZza) : zzlkVar.zzaz(bArr);
    }

    public static List zzr(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static boolean zzv(List list, int i10) {
        if (i10 < list.size() * 64) {
            return ((1 << (i10 % 64)) & ((Long) list.get(i10 / 64)).longValue()) != 0;
        }
        return false;
    }

    public static boolean zzx(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static final void zzz(com.google.android.gms.internal.measurement.zzfr zzfrVar, String str, Object obj) {
        List listZzp = zzfrVar.zzp();
        int i10 = 0;
        while (true) {
            if (i10 >= listZzp.size()) {
                i10 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.zzfw) listZzp.get(i10)).zzg())) {
                break;
            } else {
                i10++;
            }
        }
        com.google.android.gms.internal.measurement.zzfv zzfvVarZze = com.google.android.gms.internal.measurement.zzfw.zze();
        zzfvVarZze.zzj(str);
        if (obj instanceof Long) {
            zzfvVarZze.zzi(((Long) obj).longValue());
        }
        if (i10 >= 0) {
            zzfrVar.zzj(i10, zzfvVarZze);
        } else {
            zzfrVar.zze(zzfvVarZze);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    public final boolean zzb() {
        return false;
    }

    public final long zzd(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        this.zzs.zzv().zzg();
        MessageDigest messageDigestZzF = zzlh.zzF();
        if (messageDigestZzF != null) {
            return zzlh.zzp(messageDigestZzF.digest(bArr));
        }
        a.a(this.zzs, "Failed to get MD5");
        return 0L;
    }

    public final Bundle zzf(Map map, boolean z10) {
        String string;
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                string = null;
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                string = obj.toString();
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(zzf((Map) arrayList.get(i10), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
            bundle.putString(str, string);
        }
        return bundle;
    }

    public final Parcelable zzh(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (SafeParcelReader.ParseException unused) {
            this.zzs.zzay().zzd().zza("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    public final zzaw zzi(com.google.android.gms.internal.measurement.zzaa zzaaVar) {
        Object obj;
        Bundle bundleZzf = zzf(zzaaVar.zze(), true);
        String string = (!bundleZzf.containsKey("_o") || (obj = bundleZzf.get("_o")) == null) ? "app" : obj.toString();
        String strZzb = zzgv.zzb(zzaaVar.zzd());
        if (strZzb == null) {
            strZzb = zzaaVar.zzd();
        }
        return new zzaw(strZzb, new zzau(bundleZzf), string, zzaaVar.zza());
    }

    public final com.google.android.gms.internal.measurement.zzfs zzj(zzar zzarVar) {
        com.google.android.gms.internal.measurement.zzfr zzfrVarZze = com.google.android.gms.internal.measurement.zzfs.zze();
        zzfrVarZze.zzl(zzarVar.zze);
        zzat zzatVar = new zzat(zzarVar.zzf);
        while (zzatVar.hasNext()) {
            String next = zzatVar.next();
            com.google.android.gms.internal.measurement.zzfv zzfvVarZze = com.google.android.gms.internal.measurement.zzfw.zze();
            zzfvVarZze.zzj(next);
            Object objZzf = zzarVar.zzf.zzf(next);
            Preconditions.checkNotNull(objZzf);
            zzt(zzfvVarZze, objZzf);
            zzfrVarZze.zze(zzfvVarZze);
        }
        return (com.google.android.gms.internal.measurement.zzfs) zzfrVarZze.zzaE();
    }

    public final String zzm(com.google.android.gms.internal.measurement.zzga zzgaVar) {
        if (zzgaVar == null) {
            return "";
        }
        StringBuilder sbA = defpackage.a.a("\nbatch {\n");
        for (com.google.android.gms.internal.measurement.zzgc zzgcVar : zzgaVar.zzd()) {
            if (zzgcVar != null) {
                zzF(sbA, 1);
                sbA.append("bundle {\n");
                if (zzgcVar.zzbj()) {
                    zzI(sbA, 1, "protocol_version", Integer.valueOf(zzgcVar.zzd()));
                }
                zzoz.zzc();
                if (this.zzs.zzf().zzs(null, zzeb.zzar) && zzgcVar.zzbm()) {
                    zzI(sbA, 1, "session_stitching_token", zzgcVar.zzK());
                }
                zzI(sbA, 1, "platform", zzgcVar.zzI());
                if (zzgcVar.zzbf()) {
                    zzI(sbA, 1, "gmp_version", Long.valueOf(zzgcVar.zzm()));
                }
                if (zzgcVar.zzbq()) {
                    zzI(sbA, 1, "uploading_gmp_version", Long.valueOf(zzgcVar.zzr()));
                }
                if (zzgcVar.zzbd()) {
                    zzI(sbA, 1, "dynamite_version", Long.valueOf(zzgcVar.zzj()));
                }
                if (zzgcVar.zzba()) {
                    zzI(sbA, 1, "config_version", Long.valueOf(zzgcVar.zzh()));
                }
                zzI(sbA, 1, "gmp_app_id", zzgcVar.zzF());
                zzI(sbA, 1, "admob_app_id", zzgcVar.zzw());
                zzI(sbA, 1, "app_id", zzgcVar.zzx());
                zzI(sbA, 1, "app_version", zzgcVar.zzA());
                if (zzgcVar.zzaY()) {
                    zzI(sbA, 1, "app_version_major", Integer.valueOf(zzgcVar.zza()));
                }
                zzI(sbA, 1, "firebase_instance_id", zzgcVar.zzE());
                if (zzgcVar.zzbc()) {
                    zzI(sbA, 1, "dev_cert_hash", Long.valueOf(zzgcVar.zzi()));
                }
                zzI(sbA, 1, "app_store", zzgcVar.zzz());
                if (zzgcVar.zzbp()) {
                    zzI(sbA, 1, "upload_timestamp_millis", Long.valueOf(zzgcVar.zzq()));
                }
                if (zzgcVar.zzbn()) {
                    zzI(sbA, 1, "start_timestamp_millis", Long.valueOf(zzgcVar.zzp()));
                }
                if (zzgcVar.zzbe()) {
                    zzI(sbA, 1, "end_timestamp_millis", Long.valueOf(zzgcVar.zzk()));
                }
                if (zzgcVar.zzbi()) {
                    zzI(sbA, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzgcVar.zzo()));
                }
                if (zzgcVar.zzbh()) {
                    zzI(sbA, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzgcVar.zzn()));
                }
                zzI(sbA, 1, "app_instance_id", zzgcVar.zzy());
                zzI(sbA, 1, "resettable_device_id", zzgcVar.zzJ());
                zzI(sbA, 1, "ds_id", zzgcVar.zzD());
                if (zzgcVar.zzbg()) {
                    zzI(sbA, 1, "limited_ad_tracking", Boolean.valueOf(zzgcVar.zzaW()));
                }
                zzI(sbA, 1, "os_version", zzgcVar.zzH());
                zzI(sbA, 1, "device_model", zzgcVar.zzC());
                zzI(sbA, 1, "user_default_language", zzgcVar.zzL());
                if (zzgcVar.zzbo()) {
                    zzI(sbA, 1, "time_zone_offset_minutes", Integer.valueOf(zzgcVar.zzf()));
                }
                if (zzgcVar.zzaZ()) {
                    zzI(sbA, 1, "bundle_sequential_index", Integer.valueOf(zzgcVar.zzb()));
                }
                if (zzgcVar.zzbl()) {
                    zzI(sbA, 1, "service_upload", Boolean.valueOf(zzgcVar.zzaX()));
                }
                zzI(sbA, 1, "health_monitor", zzgcVar.zzG());
                if (zzgcVar.zzbk()) {
                    zzI(sbA, 1, "retry_counter", Integer.valueOf(zzgcVar.zze()));
                }
                if (zzgcVar.zzbb()) {
                    zzI(sbA, 1, "consent_signals", zzgcVar.zzB());
                }
                List<com.google.android.gms.internal.measurement.zzgl> listZzO = zzgcVar.zzO();
                if (listZzO != null) {
                    for (com.google.android.gms.internal.measurement.zzgl zzglVar : listZzO) {
                        if (zzglVar != null) {
                            zzF(sbA, 2);
                            sbA.append("user_property {\n");
                            zzI(sbA, 2, "set_timestamp_millis", zzglVar.zzs() ? Long.valueOf(zzglVar.zzc()) : null);
                            zzI(sbA, 2, "name", this.zzs.zzj().zzf(zzglVar.zzf()));
                            zzI(sbA, 2, "string_value", zzglVar.zzg());
                            zzI(sbA, 2, "int_value", zzglVar.zzr() ? Long.valueOf(zzglVar.zzb()) : null);
                            zzI(sbA, 2, "double_value", zzglVar.zzq() ? Double.valueOf(zzglVar.zza()) : null);
                            zzF(sbA, 2);
                            sbA.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzfo> listZzM = zzgcVar.zzM();
                if (listZzM != null) {
                    for (com.google.android.gms.internal.measurement.zzfo zzfoVar : listZzM) {
                        if (zzfoVar != null) {
                            zzF(sbA, 2);
                            sbA.append("audience_membership {\n");
                            if (zzfoVar.zzk()) {
                                zzI(sbA, 2, "audience_id", Integer.valueOf(zzfoVar.zza()));
                            }
                            if (zzfoVar.zzm()) {
                                zzI(sbA, 2, "new_audience", Boolean.valueOf(zzfoVar.zzj()));
                            }
                            zzH(sbA, 2, "current_data", zzfoVar.zzd());
                            if (zzfoVar.zzn()) {
                                zzH(sbA, 2, "previous_data", zzfoVar.zze());
                            }
                            zzF(sbA, 2);
                            sbA.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzfs> listZzN = zzgcVar.zzN();
                if (listZzN != null) {
                    for (com.google.android.gms.internal.measurement.zzfs zzfsVar : listZzN) {
                        if (zzfsVar != null) {
                            zzF(sbA, 2);
                            sbA.append("event {\n");
                            zzI(sbA, 2, "name", this.zzs.zzj().zzd(zzfsVar.zzh()));
                            if (zzfsVar.zzu()) {
                                zzI(sbA, 2, "timestamp_millis", Long.valueOf(zzfsVar.zzd()));
                            }
                            if (zzfsVar.zzt()) {
                                zzI(sbA, 2, "previous_timestamp_millis", Long.valueOf(zzfsVar.zzc()));
                            }
                            if (zzfsVar.zzs()) {
                                zzI(sbA, 2, "count", Integer.valueOf(zzfsVar.zza()));
                            }
                            if (zzfsVar.zzb() != 0) {
                                zzD(sbA, 2, zzfsVar.zzi());
                            }
                            zzF(sbA, 2);
                            sbA.append("}\n");
                        }
                    }
                }
                zzF(sbA, 1);
                sbA.append("}\n");
            }
        }
        sbA.append("}\n");
        return sbA.toString();
    }

    public final String zzo(com.google.android.gms.internal.measurement.zzej zzejVar) {
        if (zzejVar == null) {
            return "null";
        }
        StringBuilder sbA = defpackage.a.a("\nevent_filter {\n");
        if (zzejVar.zzp()) {
            zzI(sbA, 0, "filter_id", Integer.valueOf(zzejVar.zzb()));
        }
        zzI(sbA, 0, "event_name", this.zzs.zzj().zzd(zzejVar.zzg()));
        String strZzG = zzG(zzejVar.zzk(), zzejVar.zzm(), zzejVar.zzn());
        if (!strZzG.isEmpty()) {
            zzI(sbA, 0, "filter_type", strZzG);
        }
        if (zzejVar.zzo()) {
            zzJ(sbA, 1, "event_count_filter", zzejVar.zzf());
        }
        if (zzejVar.zza() > 0) {
            sbA.append("  filters {\n");
            Iterator it = zzejVar.zzh().iterator();
            while (it.hasNext()) {
                zzE(sbA, 2, (com.google.android.gms.internal.measurement.zzel) it.next());
            }
        }
        zzF(sbA, 1);
        sbA.append("}\n}\n");
        return sbA.toString();
    }

    public final String zzp(com.google.android.gms.internal.measurement.zzes zzesVar) {
        if (zzesVar == null) {
            return "null";
        }
        StringBuilder sbA = defpackage.a.a("\nproperty_filter {\n");
        if (zzesVar.zzj()) {
            zzI(sbA, 0, "filter_id", Integer.valueOf(zzesVar.zza()));
        }
        zzI(sbA, 0, "property_name", this.zzs.zzj().zzf(zzesVar.zze()));
        String strZzG = zzG(zzesVar.zzg(), zzesVar.zzh(), zzesVar.zzi());
        if (!strZzG.isEmpty()) {
            zzI(sbA, 0, "filter_type", strZzG);
        }
        zzE(sbA, 1, zzesVar.zzb());
        sbA.append("}\n");
        return sbA.toString();
    }

    public final List zzq(List list, List list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.zzs.zzay().zzk().zzb("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    this.zzs.zzay().zzk().zzc("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    public final Map zzs(Bundle bundle, boolean z10) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z11 = obj instanceof Parcelable[];
            if (z11 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    if (z11) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(zzs((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            Object obj2 = arrayList2.get(i10);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(zzs((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(zzs((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public final void zzt(com.google.android.gms.internal.measurement.zzfv zzfvVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzfvVar.zzg();
        zzfvVar.zze();
        zzfvVar.zzd();
        zzfvVar.zzf();
        if (obj instanceof String) {
            zzfvVar.zzk((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzfvVar.zzi(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            zzfvVar.zzh(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            this.zzs.zzay().zzd().zzb("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.zzfv zzfvVarZze = com.google.android.gms.internal.measurement.zzfw.zze();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.zzfv zzfvVarZze2 = com.google.android.gms.internal.measurement.zzfw.zze();
                    zzfvVarZze2.zzj(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        zzfvVarZze2.zzi(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        zzfvVarZze2.zzk((String) obj2);
                    } else if (obj2 instanceof Double) {
                        zzfvVarZze2.zzh(((Double) obj2).doubleValue());
                    }
                    zzfvVarZze.zzc(zzfvVarZze2);
                }
                if (zzfvVarZze.zza() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.zzfw) zzfvVarZze.zzaE());
                }
            }
        }
        zzfvVar.zzb(arrayList);
    }

    public final void zzu(com.google.android.gms.internal.measurement.zzgk zzgkVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzgkVar.zzc();
        zzgkVar.zzb();
        zzgkVar.zza();
        if (obj instanceof String) {
            zzgkVar.zzh((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzgkVar.zze(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzgkVar.zzd(((Double) obj).doubleValue());
        } else {
            this.zzs.zzay().zzd().zzb("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final boolean zzw(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(this.zzs.zzav().currentTimeMillis() - j10) > j11;
    }

    public final byte[] zzy(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            this.zzs.zzay().zzd().zzb("Failed to gzip content", e10);
            throw e10;
        }
    }
}
