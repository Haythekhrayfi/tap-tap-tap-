package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzacf {
    public static int zza(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i10 >>>= 1;
            i11++;
        }
        return i11;
    }

    public static zzbz zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            int i11 = zzfj.zza;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                zzer.zzf("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzads.zzb(new zzfa(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e10) {
                    zzer.zzg("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new zzaff(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbz(arrayList);
    }

    public static zzacc zzc(zzfa zzfaVar, boolean z10, boolean z11) throws zzcd {
        if (z10) {
            zzd(3, zzfaVar, false);
        }
        String strZzx = zzfaVar.zzx((int) zzfaVar.zzq(), zzfot.zzc);
        int length = strZzx.length();
        long jZzq = zzfaVar.zzq();
        String[] strArr = new String[(int) jZzq];
        int length2 = length + 15;
        for (int i10 = 0; i10 < jZzq; i10++) {
            String strZzx2 = zzfaVar.zzx((int) zzfaVar.zzq(), zzfot.zzc);
            strArr[i10] = strZzx2;
            length2 = length2 + 4 + strZzx2.length();
        }
        if (z11 && (zzfaVar.zzk() & 1) == 0) {
            throw zzcd.zza("framing bit expected to be set", null);
        }
        return new zzacc(strZzx, strArr, length2 + 1);
    }

    public static boolean zzd(int i10, zzfa zzfaVar, boolean z10) throws zzcd {
        if (zzfaVar.zza() < 7) {
            if (z10) {
                return false;
            }
            throw zzcd.zza("too short header: " + zzfaVar.zza(), null);
        }
        if (zzfaVar.zzk() != i10) {
            if (z10) {
                return false;
            }
            throw zzcd.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i10))), null);
        }
        if (zzfaVar.zzk() == 118 && zzfaVar.zzk() == 111 && zzfaVar.zzk() == 114 && zzfaVar.zzk() == 98 && zzfaVar.zzk() == 105 && zzfaVar.zzk() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw zzcd.zza("expected characters 'vorbis'", null);
    }
}
