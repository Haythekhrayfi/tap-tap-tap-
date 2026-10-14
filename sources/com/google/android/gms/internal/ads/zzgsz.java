package com.google.android.gms.internal.ads;

import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes2.dex */
final class zzgsz implements zzgpq {
    public static final zzgpq zza = new zzgsz();

    private zzgsz() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpq
    public final boolean zza(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 1999) {
            switch (i10) {
                case 1000:
                case 1001:
                case 1002:
                case 1003:
                case 1004:
                case WebSocketProtocol.CLOSE_NO_STATUS_CODE /* 1005 */:
                case 1006:
                case 1007:
                case 1008:
                case 1009:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
