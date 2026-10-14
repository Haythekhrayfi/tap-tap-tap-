package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2137ze implements InterfaceC1605ea<Be.a, C1661gg.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ke f18023a;

    public C2137ze() {
        this(new Ke());
    }

    public C2137ze(Ke ke2) {
        this.f18023a = ke2;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public Be.a a(C1661gg.b bVar) {
        JSONObject jSONObject;
        String str = bVar.f16221b;
        String str2 = bVar.f16222c;
        if (TextUtils.isEmpty(str2)) {
            jSONObject = new JSONObject();
        } else {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
                jSONObject = new JSONObject();
            }
        }
        return new Be.a(str, jSONObject, this.f18023a.a(Integer.valueOf(bVar.f16223d)));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1661gg.b b(Be.a aVar) {
        C1661gg.b bVar = new C1661gg.b();
        if (!TextUtils.isEmpty(aVar.f13723a)) {
            bVar.f16221b = aVar.f13723a;
        }
        bVar.f16222c = aVar.f13724b.toString();
        bVar.f16223d = this.f18023a.b(aVar.f13725c).intValue();
        return bVar;
    }
}
