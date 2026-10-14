package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Gh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q9<Eh> f14101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Fh f14102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final W0 f14103c;

    public Gh(Q9<Eh> q10) {
        this(q10, new Fh(), Oh.a());
    }

    public Gh(Q9<Eh> q10, Fh fh, W0 w10) {
        this.f14101a = q10;
        this.f14102b = fh;
        this.f14103c = w10;
    }

    public void a() {
        W0 w10 = this.f14103c;
        Fh fh = this.f14102b;
        List<Hh> list = ((Eh) this.f14101a.b()).f13908a;
        Objects.requireNonNull(fh);
        ArrayList<Hh> arrayList = new ArrayList();
        for (Hh hh : list) {
            ArrayList arrayList2 = new ArrayList(hh.f14149b.size());
            for (String str : hh.f14149b) {
                if (B2.a(str)) {
                    arrayList2.add(str);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new Hh(hh.f14148a, arrayList2));
            }
        }
        JSONObject jSONObject = new JSONObject();
        for (Hh hh2 : arrayList) {
            try {
                jSONObject.put(hh2.f14148a, new JSONObject().put("classes", new JSONArray((Collection) hh2.f14149b)));
            } catch (Throwable unused) {
            }
        }
        w10.reportEvent("sdk_list", jSONObject.toString());
    }
}
