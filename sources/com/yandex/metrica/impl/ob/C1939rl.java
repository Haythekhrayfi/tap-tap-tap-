package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.rl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1939rl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<C1939rl> f17248a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Wl f17249b;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.rl$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17251b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final JSONObject f17252c;

        public a(int i10, int i11, JSONObject jSONObject) {
            this.f17250a = i10;
            this.f17251b = i11;
            this.f17252c = jSONObject;
        }
    }

    public C1939rl(Wl wl) {
        this.f17249b = wl;
    }

    public Wl a() {
        return this.f17249b;
    }

    public a a(Kl kl, C1541bl c1541bl, int i10, int i11) {
        int length;
        JSONObject jSONObject = new JSONObject();
        int i12 = i11 + 1;
        try {
            Wl.b bVarA = this.f17249b.a(c1541bl);
            boolean z10 = true;
            boolean z11 = kl.f14364f || this.f17249b.a();
            if (bVarA != null && kl.f14367i) {
                z10 = false;
            }
            if (z11 && z10) {
                jSONObject = this.f17249b.a(kl, bVarA);
            }
            length = jSONObject.toString().getBytes().length + i10;
            try {
                JSONArray jSONArray = new JSONArray();
                jSONObject.put("ch", jSONArray);
                length += 8;
                if (length <= kl.f14372n && i12 <= kl.f14371m) {
                    Iterator<C1939rl> it = this.f17248a.iterator();
                    while (it.hasNext()) {
                        a aVarA = it.next().a(kl, c1541bl, length + 1, i12);
                        JSONObject jSONObject2 = aVarA.f17252c;
                        if (jSONObject2 != null) {
                            jSONArray.put(jSONObject2);
                        }
                        int i13 = aVarA.f17250a;
                        if (i13 == 0) {
                            break;
                        }
                        i12 += aVarA.f17251b;
                        length += i13;
                    }
                    return new a(length - i10, i12 - i11, jSONObject);
                }
                return new a(0, 0, null);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            length = i10;
        }
    }

    public void a(C1939rl c1939rl) {
        this.f17248a.add(c1939rl);
    }
}
