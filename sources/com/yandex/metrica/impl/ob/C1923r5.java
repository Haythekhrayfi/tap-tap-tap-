package com.yandex.metrica.impl.ob;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.r5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1923r5 extends AbstractC1948s5 {
    public C1923r5(C1624f4 c1624f4) {
        super(c1624f4);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x008b A[SYNTHETIC] */
    private boolean a(String str) {
        boolean z10;
        Object obj;
        if (!TextUtils.isEmpty(str)) {
            try {
                String queryParameter = Uri.parse(str).getQueryParameter("referrer");
                if (!TextUtils.isEmpty(queryParameter)) {
                    C1862oi c1862oiB = a().v().b();
                    for (String str2 : queryParameter.split("&")) {
                        int iIndexOf = str2.indexOf("=");
                        if (iIndexOf >= 0) {
                            String strDecode = Uri.decode(str2.substring(0, iIndexOf));
                            String strDecode2 = Uri.decode(str2.substring(iIndexOf + 1));
                            if (!"reattribution".equals(strDecode) || !"1".equals(strDecode2)) {
                                if (c1862oiB != null) {
                                    Iterator<Pair<String, C1862oi.a>> it = c1862oiB.f17022a.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            Pair<String, C1862oi.a> next = it.next();
                                            if (!U2.a(next.first, strDecode) || ((obj = next.second) != null && !((C1862oi.a) obj).f17023a.equals(strDecode2))) {
                                            }
                                        }
                                    }
                                }
                                z10 = false;
                                if (z10) {
                                    return true;
                                }
                            }
                            z10 = true;
                            if (z10) {
                                return true;
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1824n5
    public boolean a(C1744k0 c1744k0) {
        String strP = c1744k0.p();
        if (TextUtils.isEmpty(strP)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strP);
            if (!"open".equals(jSONObject.optString("type"))) {
                return false;
            }
            a().w().l();
            if (!a(jSONObject.optString("link"))) {
                return false;
            }
            c1744k0.a(Boolean.TRUE);
            a().w().k();
            a().C();
            a().j().a();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
