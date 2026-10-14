package com.google.android.gms.internal.auth;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes2.dex */
final class zzgw {
    public static String zza(zzee zzeeVar) {
        String str;
        StringBuilder sb2 = new StringBuilder(zzeeVar.zzd());
        for (int i10 = 0; i10 < zzeeVar.zzd(); i10++) {
            int iZza = zzeeVar.zza(i10);
            if (iZza == 34) {
                str = "\\\"";
            } else if (iZza == 39) {
                str = "\\'";
            } else if (iZza != 92) {
                switch (iZza) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (iZza < 32 || iZza > 126) {
                            sb2.append(CoreConstants.ESCAPE_CHAR);
                            sb2.append((char) (((iZza >>> 6) & 3) + 48));
                            sb2.append((char) (((iZza >>> 3) & 7) + 48));
                            iZza = (iZza & 7) + 48;
                        }
                        sb2.append((char) iZza);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb2.append(str);
        }
        return sb2.toString();
    }
}
