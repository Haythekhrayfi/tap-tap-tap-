package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.yandex.metrica.plugins.PluginErrorDetails;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzeae implements zzfvy {
    public final /* synthetic */ boolean zza;
    public final /* synthetic */ zzeaf zzb;

    public zzeae(zzeaf zzeafVar, boolean z10) {
        this.zzb = zzeafVar;
        this.zza = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zza(Throwable th) {
        zzbzr.zzg("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0092  */
    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a9  */
    @Override // com.google.android.gms.internal.ads.zzfvy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List listEmptyList;
        List listAsList;
        final ArrayList arrayList;
        Iterator it;
        byte b10;
        zzaxx zzaxxVar;
        Bundle bundle = (Bundle) obj;
        if (this.zzb.zzf()) {
            return;
        }
        Object obj2 = bundle.get("ad_types");
        if (!(obj2 instanceof List)) {
            if (obj2 instanceof String[]) {
                listAsList = Arrays.asList((String[]) obj2);
            } else {
                listEmptyList = Collections.emptyList();
            }
            arrayList = new ArrayList();
            it = listEmptyList.iterator();
            while (it.hasNext()) {
                switch ((String) it.next()) {
                    case "banner":
                        b10 = 0;
                        break;
                    case "native":
                        b10 = 2;
                        break;
                    case "rewarded":
                        b10 = 3;
                        break;
                    case "interstitial":
                        b10 = 1;
                        break;
                    default:
                        b10 = -1;
                        break;
                }
                if (b10 != 0) {
                    zzaxxVar = zzaxx.BANNER;
                } else if (b10 != 1) {
                    zzaxxVar = zzaxx.INTERSTITIAL;
                } else if (b10 != 2) {
                    zzaxxVar = zzaxx.NATIVE_APP_INSTALL;
                } else if (b10 != 3) {
                    zzaxxVar = zzaxx.AD_FORMAT_TYPE_UNSPECIFIED;
                } else {
                    zzaxxVar = zzaxx.REWARD_BASED_VIDEO_AD;
                }
                arrayList.add(zzaxxVar);
            }
            final zzazm zzazmVarZzb = zzeaf.zzb(this.zzb, bundle);
            final zzazd zzazdVarZza = zzeaf.zza(this.zzb, bundle);
            zzdzt zzdztVar = this.zzb.zza;
            final boolean z10 = this.zza;
            zzdztVar.zza(new zzfdo() { // from class: com.google.android.gms.internal.ads.zzead
                @Override // com.google.android.gms.internal.ads.zzfdo
                public final Object zza(Object obj3) {
                    zzeae zzeaeVar = this.zza;
                    boolean z11 = z10;
                    ArrayList arrayList2 = arrayList;
                    zzazd zzazdVar = zzazdVarZza;
                    zzazm zzazmVar = zzazmVarZzb;
                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                    if (zzeaeVar.zzb.zzf()) {
                        return null;
                    }
                    byte[] bArrZze = zzeaf.zze(zzeaeVar.zzb, z11, arrayList2, zzazdVar, zzazmVar);
                    zzeai.zzg(sQLiteDatabase, z11, true);
                    zzeai.zzd(sQLiteDatabase, zzeaeVar.zzb.zzf.zzd(), bArrZze);
                    return null;
                }
            });
        }
        listAsList = (List) obj2;
        ArrayList arrayList2 = new ArrayList(listAsList.size());
        for (Object obj3 : listAsList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        listEmptyList = Collections.unmodifiableList(arrayList2);
        arrayList = new ArrayList();
        it = listEmptyList.iterator();
        while (it.hasNext()) {
            switch ((String) it.next()) {
                case -1396342996:
                    if (!r1.equals("banner")) {
                        b10 = 0;
                    } else {
                        b10 = -1;
                    }
                    break;
                case -1052618729:
                    if (!r1.equals(PluginErrorDetails.Platform.NATIVE)) {
                        b10 = 2;
                    } else {
                        b10 = -1;
                    }
                    break;
                case -239580146:
                    if (!r1.equals("rewarded")) {
                        b10 = 3;
                    } else {
                        b10 = -1;
                    }
                    break;
                case 604727084:
                    if (!r1.equals("interstitial")) {
                        b10 = 1;
                    } else {
                        b10 = -1;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
            if (b10 != 0) {
                zzaxxVar = zzaxx.BANNER;
            } else if (b10 != 1) {
                zzaxxVar = zzaxx.INTERSTITIAL;
            } else if (b10 != 2) {
                zzaxxVar = zzaxx.NATIVE_APP_INSTALL;
            } else if (b10 != 3) {
                zzaxxVar = zzaxx.AD_FORMAT_TYPE_UNSPECIFIED;
            } else {
                zzaxxVar = zzaxx.REWARD_BASED_VIDEO_AD;
            }
            arrayList.add(zzaxxVar);
        }
        final zzazm zzazmVarZzb2 = zzeaf.zzb(this.zzb, bundle);
        final zzazd zzazdVarZza2 = zzeaf.zza(this.zzb, bundle);
        zzdzt zzdztVar2 = this.zzb.zza;
        final boolean z11 = this.zza;
        zzdztVar2.zza(new zzfdo() { // from class: com.google.android.gms.internal.ads.zzead
            @Override // com.google.android.gms.internal.ads.zzfdo
            public final Object zza(Object obj4) {
                zzeae zzeaeVar = this.zza;
                boolean z12 = z11;
                ArrayList arrayList3 = arrayList;
                zzazd zzazdVar = zzazdVarZza2;
                zzazm zzazmVar = zzazmVarZzb2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj4;
                if (zzeaeVar.zzb.zzf()) {
                    return null;
                }
                byte[] bArrZze = zzeaf.zze(zzeaeVar.zzb, z12, arrayList3, zzazdVar, zzazmVar);
                zzeai.zzg(sQLiteDatabase, z12, true);
                zzeai.zzd(sQLiteDatabase, zzeaeVar.zzb.zzf.zzd(), bArrZze);
                return null;
            }
        });
    }
}
