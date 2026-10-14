package com.yandex.metrica.impl.ob;

import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import okhttp3.internal.http2.Http2;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.u5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1998u5 extends AbstractC1948s5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Wn f17513b;

    public C1998u5(C1624f4 c1624f4) {
        this(c1624f4, new Wn());
    }

    public C1998u5(C1624f4 c1624f4, Wn wn) {
        super(c1624f4);
        this.f17513b = wn;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1824n5
    public boolean a(C1744k0 c1744k0) {
        C1624f4 c1624f4A = a();
        if (c1624f4A.w().m() && c1624f4A.B()) {
            G9 g9F = c1624f4A.f();
            String strF = a().f().f();
            HashSet hashSet = null;
            if (!TextUtils.isEmpty(strF)) {
                try {
                    HashSet hashSet2 = new HashSet();
                    JSONArray jSONArray = new JSONArray(strF);
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        hashSet2.add(new Zb(jSONArray.getJSONObject(i10)));
                    }
                    hashSet = hashSet2;
                } catch (Throwable unused) {
                }
            }
            try {
                ArrayList<Zb> arrayListB = b();
                if (C1694i.a(hashSet, arrayListB)) {
                    c1624f4A.x();
                } else {
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator<Zb> it = arrayListB.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put(it.next().a());
                    }
                    c1624f4A.r().c(C1744k0.a(c1744k0, new JSONObject().put("features", jSONArray2).toString()));
                    g9F.g(jSONArray2.toString());
                }
            } catch (Throwable unused2) {
            }
        }
        return false;
    }

    public ArrayList<Zb> b() {
        FeatureInfo[] featureInfoArr;
        try {
            C1624f4 c1624f4A = a();
            PackageInfo packageInfoB = this.f17513b.b(c1624f4A.g(), c1624f4A.g().getPackageName(), Http2.INITIAL_MAX_FRAME_SIZE);
            ArrayList<Zb> arrayList = new ArrayList<>();
            Yb aVar = U2.a(24) ? new Yb.a() : new Yb.b();
            if (packageInfoB != null && (featureInfoArr = packageInfoB.reqFeatures) != null) {
                for (FeatureInfo featureInfo : featureInfoArr) {
                    arrayList.add(aVar.a(featureInfo));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }
}
