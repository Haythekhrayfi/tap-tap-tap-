package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.developer.filepicker.model.DialogConfigs;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeqv implements zzeqy {
    private final zzfwn zza;
    private final Context zzb;

    public zzeqv(zzfwn zzfwnVar, Context context) {
        this.zza = zzfwnVar;
        this.zzb = context;
    }

    public static Bundle zzc(Context context, JSONArray jSONArray) {
        int i10;
        SharedPreferences sharedPreferences;
        String str;
        Bundle bundle = new Bundle();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i11);
            String strOptString = jSONObjectOptJSONObject.optString("bk");
            String strOptString2 = jSONObjectOptJSONObject.optString("sk");
            int iOptInt = jSONObjectOptJSONObject.optInt("type", -1);
            if (iOptInt == 0) {
                i10 = 1;
            } else if (iOptInt != 1) {
                i10 = iOptInt != 2 ? 0 : 3;
            } else {
                i10 = 2;
            }
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && i10 != 0) {
                String[] strArrSplit = strOptString2.split(DialogConfigs.DIRECTORY_SEPERATOR);
                int length = strArrSplit.length;
                Object obj = null;
                if (length <= 2 && length != 0) {
                    if (length == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str = strArrSplit[0];
                    } else {
                        sharedPreferences = context.getSharedPreferences(strArrSplit[0], 0);
                        str = strArrSplit[1];
                    }
                    obj = sharedPreferences.getAll().get(str);
                }
                if (obj != null) {
                    int i12 = i10 - 1;
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(strOptString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(strOptString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(strOptString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(strOptString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(strOptString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final int zza() {
        return 37;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final zzfwm zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzd();
            }
        });
    }

    public final /* synthetic */ zzeqx zzd() throws Exception {
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfS);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            final Bundle bundleZzc = zzc(this.zzb, new JSONArray(str));
            return new zzeqx() { // from class: com.google.android.gms.internal.ads.zzequ
                @Override // com.google.android.gms.internal.ads.zzeqx
                public final void zzh(Object obj) {
                    ((Bundle) obj).putBundle("shared_pref", bundleZzc);
                }
            };
        } catch (JSONException e10) {
            zzbzr.zzf("JSON parsing error", e10);
            return null;
        }
    }
}
