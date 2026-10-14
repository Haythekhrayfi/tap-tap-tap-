package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzavm {
    private final zzavb zza;
    private final int zzb;
    private String zzc;
    private final int zzd;

    public zzavm(int i10, int i11, int i12) {
        this.zzb = i10;
        i11 = (i11 > 64 || i11 < 0) ? 64 : i11;
        if (i12 <= 0) {
            this.zzd = 1;
        } else {
            this.zzd = i12;
        }
        this.zza = new zzavk(i11);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    public final String zza(ArrayList arrayList, ArrayList arrayList2) {
        Collections.sort(arrayList2, new zzavl(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            String[] strArrSplit = Normalizer.normalize((CharSequence) arrayList.get(((zzava) arrayList2.get(i10)).zze()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (strArrSplit.length != 0) {
                for (String str : strArrSplit) {
                    if (str.contains("'")) {
                        StringBuilder sb2 = new StringBuilder(str);
                        int i11 = 1;
                        boolean z10 = false;
                        while (true) {
                            int i12 = i11 + 2;
                            if (i12 > sb2.length()) {
                                break;
                            }
                            if (sb2.charAt(i11) == '\'') {
                                if (sb2.charAt(i11 - 1) != ' ') {
                                    int i13 = i11 + 1;
                                    if ((sb2.charAt(i13) == 's' || sb2.charAt(i13) == 'S') && (i12 == sb2.length() || sb2.charAt(i12) == ' ')) {
                                        sb2.insert(i11, ' ');
                                        i11 = i12;
                                    } else {
                                        sb2.setCharAt(i11, ' ');
                                    }
                                } else {
                                    sb2.setCharAt(i11, ' ');
                                }
                                z10 = true;
                            }
                            i11++;
                        }
                        String string = z10 ? sb2.toString() : null;
                        if (string != null) {
                            this.zzc = string;
                            str = string;
                        }
                    }
                    String[] strArrZzb = zzavf.zzb(str, true);
                    if (strArrZzb.length >= this.zzd) {
                        for (int i14 = 0; i14 < strArrZzb.length; i14++) {
                            String strConcat = "";
                            for (int i15 = 0; i15 < this.zzd; i15++) {
                                int i16 = i14 + i15;
                                if (i16 >= strArrZzb.length) {
                                    break;
                                }
                                if (i15 > 0) {
                                    strConcat = strConcat.concat(" ");
                                }
                                strConcat = strConcat.concat(String.valueOf(strArrZzb[i16]));
                            }
                            hashSet.add(strConcat);
                            if (hashSet.size() >= this.zzb) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.zzb) {
                            break loop0;
                        }
                    }
                }
            }
        }
        zzavd zzavdVar = new zzavd();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                zzavdVar.zzb.write(this.zza.zzb((String) it.next()));
            } catch (IOException e10) {
                zzbzr.zzh("Error while writing hash to byteStream", e10);
            }
        }
        return zzavdVar.toString();
    }
}
