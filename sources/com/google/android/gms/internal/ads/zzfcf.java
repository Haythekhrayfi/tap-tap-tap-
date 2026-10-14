package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfcf implements zzfce {
    private final Object[] zza;

    /* JADX WARN: Code duplicated, block: B:17:0x0066  */
    /* JADX WARN: Code duplicated, block: B:20:0x0078  */
    /* JADX WARN: Code duplicated, block: B:22:0x007c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0084  */
    /* JADX WARN: Code duplicated, block: B:26:0x008f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00db  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:50:0x0104  */
    /* JADX WARN: Code duplicated, block: B:53:0x0115  */
    /* JADX WARN: Code duplicated, block: B:55:0x0119  */
    /* JADX WARN: Code duplicated, block: B:56:0x0121  */
    /* JADX WARN: Code duplicated, block: B:59:0x012c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0139  */
    /* JADX WARN: Code duplicated, block: B:65:0x0146  */
    /* JADX WARN: Code duplicated, block: B:68:0x0157  */
    /* JADX WARN: Code duplicated, block: B:71:0x0168  */
    /* JADX WARN: Code duplicated, block: B:74:0x0175 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0177  */
    /* JADX WARN: Code duplicated, block: B:76:0x0181  */
    public zzfcf(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, int i10, String str2, com.google.android.gms.ads.internal.client.zzw zzwVar) {
        List list;
        Location location;
        List list2;
        String string;
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i10));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(zzlVar.zzb));
        }
        if (!hashSet.contains("extras")) {
            string = hashSet.contains("npa") ? zzlVar.zzc.getString("npa") : string;
            if (hashSet.contains("gender")) {
                arrayList.add(Integer.valueOf(zzlVar.zzd));
            }
            if (hashSet.contains("keywords")) {
                list2 = zzlVar.zze;
                if (list2 != null) {
                    arrayList.add(list2.toString());
                } else {
                    arrayList.add(null);
                }
            }
            if (hashSet.contains("isTestDevice")) {
                arrayList.add(Boolean.valueOf(zzlVar.zzf));
            }
            if (hashSet.contains("tagForChildDirectedTreatment")) {
                arrayList.add(Integer.valueOf(zzlVar.zzg));
            }
            if (hashSet.contains("manualImpressionsEnabled")) {
                arrayList.add(Boolean.valueOf(zzlVar.zzh));
            }
            if (hashSet.contains("publisherProvidedId")) {
                arrayList.add(zzlVar.zzi);
            }
            if (hashSet.contains("location")) {
                location = zzlVar.zzk;
                if (location != null) {
                    arrayList.add(location.toString());
                } else {
                    arrayList.add(null);
                }
            }
            if (hashSet.contains("contentUrl")) {
                arrayList.add(zzlVar.zzl);
            }
            if (hashSet.contains("networkExtras")) {
                arrayList.add(zza(zzlVar.zzm));
            }
            if (hashSet.contains("customTargeting")) {
                arrayList.add(zza(zzlVar.zzn));
            }
            if (hashSet.contains("categoryExclusions")) {
                list = zzlVar.zzo;
                if (list != null) {
                    arrayList.add(list.toString());
                } else {
                    arrayList.add(null);
                }
            }
            if (hashSet.contains("requestAgent")) {
                arrayList.add(zzlVar.zzp);
            }
            if (hashSet.contains("requestPackage")) {
                arrayList.add(zzlVar.zzq);
            }
            if (hashSet.contains("isDesignedForFamilies")) {
                arrayList.add(Boolean.valueOf(zzlVar.zzr));
            }
            if (hashSet.contains("tagForUnderAgeOfConsent")) {
                arrayList.add(Integer.valueOf(zzlVar.zzt));
            }
            if (hashSet.contains("maxAdContentRating")) {
                arrayList.add(zzlVar.zzu);
            }
            if (hashSet.contains("orientation")) {
                if (zzwVar != null) {
                    arrayList.add(Integer.valueOf(zzwVar.zza));
                } else {
                    arrayList.add(null);
                }
            }
            this.zza = arrayList.toArray();
        }
        string = zza(zzlVar.zzc);
        arrayList.add(string);
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(zzlVar.zzd));
        }
        if (hashSet.contains("keywords")) {
            list2 = zzlVar.zze;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzlVar.zzf));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzlVar.zzg));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzlVar.zzh));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzlVar.zzi);
        }
        if (hashSet.contains("location")) {
            location = zzlVar.zzk;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(zzlVar.zzl);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(zza(zzlVar.zzm));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(zza(zzlVar.zzn));
        }
        if (hashSet.contains("categoryExclusions")) {
            list = zzlVar.zzo;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzlVar.zzp);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzlVar.zzq);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzlVar.zzr));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(zzlVar.zzt));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(zzlVar.zzu);
        }
        if (hashSet.contains("orientation")) {
            if (zzwVar != null) {
                arrayList.add(Integer.valueOf(zzwVar.zza));
            } else {
                arrayList.add(null);
            }
        }
        this.zza = arrayList.toArray();
    }

    private static String zza(Bundle bundle) {
        String strZza;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            if (obj == null) {
                strZza = "null";
            } else {
                strZza = obj instanceof Bundle ? zza((Bundle) obj) : obj.toString();
            }
            sb2.append(strZza);
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfce
    public final boolean equals(Object obj) {
        if (obj instanceof zzfcf) {
            return Arrays.equals(this.zza, ((zzfcf) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfce
    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return "[PoolKey#" + Arrays.hashCode(this.zza) + " " + Arrays.toString(this.zza) + "]";
    }
}
