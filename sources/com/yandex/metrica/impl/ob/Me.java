package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Me implements InterfaceC1605ea<Le, C1661gg.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ke f14503a = new Ke();

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public Le a(C1661gg.a aVar) {
        JSONObject jSONObject;
        String str = aVar.f16215b;
        String str2 = aVar.f16216c;
        if (TextUtils.isEmpty(str2)) {
            jSONObject = new JSONObject();
        } else {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
                jSONObject = new JSONObject();
            }
        }
        return new Le(str, jSONObject, aVar.f16217d, aVar.f16218e, this.f14503a.a(Integer.valueOf(aVar.f16219f)));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1661gg.a b(Le le2) {
        C1661gg.a aVar = new C1661gg.a();
        if (!TextUtils.isEmpty(le2.f14405a)) {
            aVar.f16215b = le2.f14405a;
        }
        aVar.f16216c = le2.f14406b.toString();
        aVar.f16217d = le2.f14407c;
        aVar.f16218e = le2.f14408d;
        aVar.f16219f = this.f14503a.b(le2.f14409e).intValue();
        return aVar;
    }
}
