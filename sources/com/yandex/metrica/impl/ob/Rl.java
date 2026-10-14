package com.yandex.metrica.impl.ob;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Rl implements InterfaceC1740jl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Wl> f14980a;

    public Rl(List<Wl> list) {
        this.f14980a = list;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1740jl
    public Object a(Gl gl, Kl kl, C1541bl c1541bl, int i10) {
        JSONArray jSONArray = new JSONArray();
        if (this.f14980a.isEmpty()) {
            return jSONArray;
        }
        for (Wl wl : this.f14980a) {
            Wl.b bVarA = wl.a(c1541bl);
            int i11 = 0;
            if ((kl.f14364f || wl.a()) && (bVarA == null || !kl.f14367i)) {
                JSONObject jSONObjectA = wl.a(kl, bVarA);
                int length = jSONObjectA.toString().getBytes().length + 1;
                int length2 = jSONArray.length();
                if (i10 + length <= kl.f14372n && length2 < kl.f14371m) {
                    jSONArray.put(jSONObjectA);
                    i11 = length;
                }
            }
            i10 += i11;
        }
        return jSONArray;
    }
}
