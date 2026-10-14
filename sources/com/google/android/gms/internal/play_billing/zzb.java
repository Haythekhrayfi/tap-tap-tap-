package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import ch.qos.logback.classic.Level;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.n;
import com.android.billingclient.api.r;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzb {
    public static final int zza = Runtime.getRuntime().availableProcessors();

    public static int zza(Intent intent, String str) {
        if (intent != null) {
            return zzl(intent.getExtras(), "ProxyBillingActivity");
        }
        zzj("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    public static int zzb(Bundle bundle, String str) {
        String strConcat;
        if (bundle == null) {
            strConcat = "Unexpected null bundle received!";
        } else {
            Object obj = bundle.get("RESPONSE_CODE");
            if (obj == null) {
                zzi(str, "getResponseCodeFromBundle() got null response code, assuming OK");
                return 0;
            }
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            strConcat = "Unexpected type for bundle response code: ".concat(obj.getClass().getName());
        }
        zzj(str, strConcat);
        return 6;
    }

    public static Bundle zzc(boolean z10, boolean z11, boolean z12, boolean z13, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z10) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static n zzd(Intent intent, String str) {
        if (intent == null) {
            zzj("BillingHelper", "Got null intent!");
            n nVar = new n();
            nVar.f3848a = 6;
            nVar.f3849b = "An internal error occurred.";
            return nVar;
        }
        int iZzb = zzb(intent.getExtras(), str);
        String strZzf = zzf(intent.getExtras(), str);
        n nVar2 = new n();
        nVar2.f3848a = iZzb;
        nVar2.f3849b = strZzf;
        return nVar2;
    }

    public static r zze(Bundle bundle, String str) {
        return bundle == null ? new r(0, null) : new r(zzl(bundle, "BillingClient"), bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN"));
    }

    public static String zzf(Bundle bundle, String str) {
        if (bundle == null) {
            zzj(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            zzi(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        zzj(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static String zzg(int i10) {
        return zza.zza(i10).toString();
    }

    public static List zzh(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase purchaseZzm = zzm(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (purchaseZzm == null) {
                zzi("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(purchaseZzm);
        } else {
            zzi("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i10 = 0; i10 < stringArrayList.size() && i10 < stringArrayList2.size(); i10++) {
                Purchase purchaseZzm2 = zzm(stringArrayList.get(i10), stringArrayList2.get(i10));
                if (purchaseZzm2 != null) {
                    arrayList.add(purchaseZzm2);
                }
            }
        }
        return arrayList;
    }

    public static void zzi(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i10 = Level.ERROR_INT;
            while (!str2.isEmpty() && i10 > 0) {
                int iMin = Math.min(str2.length(), Math.min(4000, i10));
                Log.v(str, str2.substring(0, iMin));
                str2 = str2.substring(iMin);
                i10 -= iMin;
            }
        }
    }

    public static void zzj(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void zzk(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    private static int zzl(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        zzj(str, "Unexpected null bundle received!");
        return 0;
    }

    private static Purchase zzm(String str, String str2) {
        if (str == null || str2 == null) {
            zzi("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e10) {
            zzj("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e10.toString()));
            return null;
        }
    }
}
