package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.developer.filepicker.model.DialogConfigs;
import java.util.ArrayList;
import java.util.List;
import y.q;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaev extends zzaen {
    public static final Parcelable.Creator<zzaev> CREATOR = new zzaeu();
    public final String zza;

    @Deprecated
    public final String zzb;
    public final zzfsc zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public zzaev(String str, String str2, List list) {
        super(str);
        zzdy.zzd(!list.isEmpty());
        this.zza = str2;
        zzfsc zzfscVarZzj = zzfsc.zzj(list);
        this.zzc = zzfscVarZzj;
        this.zzb = (String) zzfscVarZzj.get(0);
    }

    private static List zzb(String str) {
        int i10;
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                i10 = Integer.parseInt(str.substring(8, 10));
            } else {
                if (str.length() < 7) {
                    if (str.length() >= 4) {
                        i10 = Integer.parseInt(str.substring(0, 4));
                    }
                    return arrayList;
                }
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                i10 = Integer.parseInt(str.substring(5, 7));
            }
            arrayList.add(Integer.valueOf(i10));
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaev.class == obj.getClass()) {
            zzaev zzaevVar = (zzaev) obj;
            if (zzfj.zzC(this.zzf, zzaevVar.zzf) && zzfj.zzC(this.zza, zzaevVar.zza) && this.zzc.equals(zzaevVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        return this.zzc.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final String toString() {
        return q.a(this.zzf, ": description=", this.zza, ": values=", String.valueOf(this.zzc));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeStringArray((String[]) this.zzc.toArray(new String[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzaen, com.google.android.gms.internal.ads.zzby
    public final void zza(zzbt zzbtVar) {
        switch (this.zzf) {
            case "TT2":
            case "TIT2":
                zzbtVar.zzq((CharSequence) this.zzc.get(0));
                break;
            case "TP1":
            case "TPE1":
                zzbtVar.zze((CharSequence) this.zzc.get(0));
                break;
            case "TP2":
            case "TPE2":
                zzbtVar.zzc((CharSequence) this.zzc.get(0));
                break;
            case "TAL":
            case "TALB":
                zzbtVar.zzd((CharSequence) this.zzc.get(0));
                break;
            case "TRK":
            case "TRCK":
                String str = (String) this.zzc.get(0);
                int i10 = zzfj.zza;
                String[] strArrSplit = str.split(DialogConfigs.DIRECTORY_SEPERATOR, -1);
                try {
                    int i11 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    zzbtVar.zzs(Integer.valueOf(i11));
                    zzbtVar.zzr(numValueOf);
                    break;
                } catch (NumberFormatException unused) {
                    return;
                }
                break;
            case "TYE":
            case "TYER":
                try {
                    zzbtVar.zzl(Integer.valueOf(Integer.parseInt((String) this.zzc.get(0))));
                    break;
                } catch (NumberFormatException unused2) {
                    return;
                }
                break;
            case "TDA":
            case "TDAT":
                try {
                    String str2 = (String) this.zzc.get(0);
                    int i12 = Integer.parseInt(str2.substring(2, 4));
                    int i13 = Integer.parseInt(str2.substring(0, 2));
                    zzbtVar.zzk(Integer.valueOf(i12));
                    zzbtVar.zzj(Integer.valueOf(i13));
                    break;
                } catch (NumberFormatException | StringIndexOutOfBoundsException unused3) {
                    return;
                }
                break;
            case "TDRC":
                List listZzb = zzb((String) this.zzc.get(0));
                int size = listZzb.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size == 3) {
                            zzbtVar.zzj((Integer) listZzb.get(2));
                        }
                    }
                    zzbtVar.zzk((Integer) listZzb.get(1));
                }
                zzbtVar.zzl((Integer) listZzb.get(0));
                break;
            case "TDRL":
                List listZzb2 = zzb((String) this.zzc.get(0));
                int size2 = listZzb2.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 == 3) {
                            zzbtVar.zzm((Integer) listZzb2.get(2));
                        }
                    }
                    zzbtVar.zzn((Integer) listZzb2.get(1));
                }
                zzbtVar.zzo((Integer) listZzb2.get(0));
                break;
            case "TCM":
            case "TCOM":
                zzbtVar.zzf((CharSequence) this.zzc.get(0));
                break;
            case "TP3":
            case "TPE3":
                zzbtVar.zzg((CharSequence) this.zzc.get(0));
                break;
            case "TXT":
            case "TEXT":
                zzbtVar.zzt((CharSequence) this.zzc.get(0));
                break;
        }
    }
}
