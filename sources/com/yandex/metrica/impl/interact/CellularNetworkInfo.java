package com.yandex.metrica.impl.interact;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.impl.ob.Ak;
import com.yandex.metrica.impl.ob.Bk;
import com.yandex.metrica.impl.ob.C2118yk;
import com.yandex.metrica.impl.ob.Vj;
import com.yandex.metrica.impl.ob.Y;
import java.util.HashMap;
import java.util.Map;
import v.e;

/* JADX INFO: loaded from: classes.dex */
public class CellularNetworkInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13611a = "";

    public class a implements Bk {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.Bk
        public void a(Ak ak) {
            Vj vjB = ak.b();
            if (vjB != null) {
                String strM = vjB.m();
                String strN = vjB.n();
                Integer numL = vjB.l();
                Integer numK = vjB.k();
                Integer numB = vjB.b();
                Integer numE = vjB.e();
                Integer numP = vjB.p();
                HashMap map = new HashMap();
                map.put("network_type", strM);
                map.put("operator_name", strN);
                map.put("country_code", numK != null ? String.valueOf(numK) : null);
                map.put("operator_id", numL != null ? String.valueOf(numL) : null);
                map.put("cell_id", numB != null ? String.valueOf(numB) : null);
                map.put("lac", numE != null ? String.valueOf(numE) : null);
                map.put("signal_strength", numP != null ? String.valueOf(numP) : null);
                StringBuilder sb2 = new StringBuilder();
                String str = "";
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = (String) entry.getValue();
                    if (!TextUtils.isEmpty(str2)) {
                        sb2.append(str);
                        e.a(sb2, (String) entry.getKey(), "=", str2);
                        str = "&";
                    }
                }
                CellularNetworkInfo.this.f13611a = sb2.toString();
            }
        }
    }

    public CellularNetworkInfo(Context context) {
        new C2118yk(context, Y.g().d().b()).a(new a());
    }

    public String getCelluralInfo() {
        return this.f13611a;
    }
}
