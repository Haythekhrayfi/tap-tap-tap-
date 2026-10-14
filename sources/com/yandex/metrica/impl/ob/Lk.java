package com.yandex.metrica.impl.ob;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Lk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedList<JSONObject> f14426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F9 f14427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedList<String> f14428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1691hl f14429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f14430e;

    public Lk(int i10, F9 f10) {
        this(i10, f10, new Gk());
    }

    public Lk(int i10, F9 f10, InterfaceC1691hl interfaceC1691hl) {
        this.f14426a = new LinkedList<>();
        this.f14428c = new LinkedList<>();
        this.f14430e = i10;
        this.f14427b = f10;
        this.f14429d = interfaceC1691hl;
        a(f10);
    }

    private void a(F9 f10) {
        List<String> listG = f10.g();
        for (int iMax = Math.max(0, listG.size() - this.f14430e); iMax < listG.size(); iMax++) {
            String str = listG.get(iMax);
            try {
                this.f14426a.addLast(new JSONObject(str));
                this.f14428c.addLast(str);
            } catch (Throwable unused) {
            }
        }
    }

    public JSONObject a() {
        return this.f14429d.a(new JSONArray((Collection) this.f14426a));
    }

    public void a(JSONObject jSONObject) {
        if (this.f14426a.size() == this.f14430e) {
            this.f14426a.removeLast();
            this.f14428c.removeLast();
        }
        String string = jSONObject.toString();
        this.f14426a.addFirst(jSONObject);
        this.f14428c.addFirst(string);
        if (this.f14428c.isEmpty()) {
            return;
        }
        this.f14427b.a(this.f14428c);
    }

    public List<JSONObject> b() {
        return this.f14426a;
    }
}
