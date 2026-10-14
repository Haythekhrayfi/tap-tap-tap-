package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Lh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<C1785lg.e.b.a, String> f14424a = Collections.unmodifiableMap(new a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<C1522b2.d, String> f14425b = Collections.unmodifiableMap(new b());

    public class a extends HashMap<C1785lg.e.b.a, String> {
        public a() {
            put(C1785lg.e.b.a.COMPLETE, "complete");
            put(C1785lg.e.b.a.ERROR, "error");
            put(C1785lg.e.b.a.OFFLINE, "offline");
            put(C1785lg.e.b.a.INCOMPATIBLE_NETWORK_TYPE, "incompatible_network_type");
        }
    }

    public class b extends HashMap<C1522b2.d, String> {
        public b() {
            put(C1522b2.d.WIFI, "wifi");
            put(C1522b2.d.CELL, "cell");
            put(C1522b2.d.OFFLINE, "offline");
            put(C1522b2.d.UNDEFINED, AdError.UNDEFINED_DOMAIN);
        }
    }

    private JSONObject a(Map<String, List<String>> map) throws JSONException {
        if (U2.b(map)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!U2.b(entry.getValue())) {
                List<String> value = entry.getValue();
                if (value.size() > 10) {
                    ArrayList arrayList = new ArrayList(10);
                    for (int i10 = 0; i10 < 10; i10++) {
                        arrayList.add(value.get(i10));
                    }
                    value = arrayList;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : value) {
                    if (!TextUtils.isEmpty(str)) {
                        arrayList2.add(U2.a(str, 100));
                    }
                }
                jSONObject.putOpt(key, TextUtils.join(",", arrayList2));
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0074 A[Catch: all -> 0x00a9, TryCatch #0 {all -> 0x00a9, blocks: (B:2:0x0000, B:4:0x0007, B:6:0x0012, B:8:0x001d, B:10:0x002c, B:13:0x0040, B:14:0x0048, B:20:0x0061, B:22:0x006e, B:24:0x0074, B:26:0x0092, B:28:0x0097, B:15:0x004c, B:17:0x0056), top: B:33:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0091  */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x0074, please report this as an issue */
    public String a(C1785lg.e.b bVar) {
        String strEncodeToString;
        Throwable thC;
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt(FacebookMediationAdapter.KEY_ID, bVar.d().f16842a);
            jSONObject.putOpt(ImagesContract.URL, bVar.d().f16843b);
            jSONObject.putOpt("status", f14424a.get(bVar.h()));
            jSONObject.putOpt("code", bVar.f());
            if (U2.a(bVar.e())) {
                if (!U2.a(bVar.b())) {
                    strEncodeToString = Base64.encodeToString(bVar.b(), 0);
                }
                jSONObject.putOpt("headers", a(bVar.g()));
                thC = bVar.c();
                if (thC != null) {
                    str = thC.toString() + "\n" + Log.getStackTraceString(thC);
                } else {
                    str = null;
                }
                jSONObject.putOpt("error", str);
                jSONObject.putOpt("network_type", f14425b.get(bVar.a()));
                return jSONObject.toString();
            }
            strEncodeToString = Base64.encodeToString(bVar.e(), 0);
            jSONObject.putOpt("body", strEncodeToString);
            jSONObject.putOpt("headers", a(bVar.g()));
            thC = bVar.c();
            if (thC != null) {
                str = thC.toString() + "\n" + Log.getStackTraceString(thC);
            } else {
                str = null;
            }
            jSONObject.putOpt("error", str);
            jSONObject.putOpt("network_type", f14425b.get(bVar.a()));
            return jSONObject.toString();
        } catch (Throwable th) {
            return th.toString();
        }
    }
}
