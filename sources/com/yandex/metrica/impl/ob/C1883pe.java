package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1883pe {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<String, String> f17077b = Collections.unmodifiableMap(new a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C1908qe f17078a;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pe$a */
    public class a extends HashMap<String, String> {
        public a() {
            put("20799a27-fa80-4b36-b2db-0f8141f24180", "13");
            put("01528cc0-dd34-494d-9218-24af1317e1ee", "17233");
            put("4e610cd2-753f-4bfc-9b05-772ce8905c5e", "21952");
            put("67bb016b-be40-4c08-a190-96a3f3b503d3", "22675");
            put("e4250327-8d3c-4d35-b9e8-3c1720a64b91", "22678");
            put("6c5f504e-8928-47b5-bfb5-73af8d8bf4b4", "30404");
            put("7d962ba4-a392-449a-a02d-6c5be5613928", "30407");
        }
    }

    public C1883pe(C1908qe c1908qe) {
        this.f17078a = c1908qe;
    }

    public void a() {
        if (this.f17078a.b(null) != null) {
            this.f17078a.j();
            this.f17078a.f();
        }
    }

    public void a(String str) {
        if (str != null) {
            C1908qe c1908qe = this.f17078a;
            Objects.requireNonNull(c1908qe);
            c1908qe.f17243b.edit().remove(new C2112ye("init_event_pref_key", str).a()).apply();
            this.f17078a.j();
        }
    }

    public void b() {
        Map<String, ?> all = this.f17078a.f17243b.getAll();
        for (String str : f17077b.values()) {
            int i10 = C1908qe.f17169j;
            all.remove(new C2112ye("init_event_pref_key", str).a());
        }
        LinkedList linkedList = new LinkedList();
        for (String str2 : all.keySet()) {
            try {
                int i11 = C1908qe.f17169j;
                linkedList.add(Integer.valueOf(Integer.parseInt(str2.replace("init_event_pref_key", ""))));
            } catch (Throwable unused) {
            }
        }
        a(linkedList.size() == 1 ? ((Integer) linkedList.getFirst()).toString() : null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0035  */
    public void c() {
        boolean z10;
        String str = f17077b.get(this.f17078a.f17242a);
        if (TextUtils.isEmpty(str)) {
            z10 = false;
        } else {
            Map<String, ?> all = this.f17078a.f17243b.getAll();
            int i10 = C1908qe.f17169j;
            if ("DONE".equals(all.get(new C2112ye("init_event_pref_key", str).a()))) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10) {
            a(str);
        }
    }
}
