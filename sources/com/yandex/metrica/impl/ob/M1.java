package com.yandex.metrica.impl.ob;

import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class M1 implements O1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Zm<String, Integer> f14461a = new Zm<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<e, d> f14462b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<e, d> f14463c = new LinkedHashMap();

    public class a implements d {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.M1.d
        public boolean a(Intent intent, M1 m10) {
            return M1.a(M1.this, intent);
        }
    }

    public class b implements d {
        public b() {
        }

        @Override // com.yandex.metrica.impl.ob.M1.d
        public boolean a(Intent intent, M1 m10) {
            return M1.this.e(intent);
        }
    }

    public class c implements d {
        public c() {
        }

        @Override // com.yandex.metrica.impl.ob.M1.d
        public boolean a(Intent intent, M1 m10) {
            return M1.this.e(intent) && M1.a(M1.this);
        }
    }

    public interface d {
        boolean a(Intent intent, M1 m10);
    }

    public interface e {
        void a(Intent intent);
    }

    private void a(Intent intent, Map<e, d> map) {
        for (Map.Entry<e, d> entry : map.entrySet()) {
            if (entry.getValue().a(intent, this)) {
                entry.getKey().a(intent);
            }
        }
    }

    public static boolean a(M1 m10) {
        return m10.c() == 0;
    }

    public static boolean a(M1 m10, Intent intent) {
        if (m10.e(intent)) {
            return m10.c() == 1;
        }
        return false;
    }

    private int c() {
        Collection<Integer> collectionA = this.f14461a.a("com.yandex.metrica.IMetricaService");
        if (U2.b(collectionA)) {
            return 0;
        }
        Iterator<Integer> it = collectionA.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (!(it.next().intValue() == Process.myPid())) {
                i10++;
            }
        }
        return i10;
    }

    private int d(Intent intent) {
        Uri data = intent.getData();
        if (data != null && data.getPath().equals("/client")) {
            try {
                return Integer.parseInt(data.getQueryParameter("pid"));
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(Intent intent) {
        if ("com.yandex.metrica.IMetricaService".equals(intent.getAction())) {
            return !(d(intent) == Process.myPid());
        }
        return false;
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void a(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f14461a.a(action, Integer.valueOf(d(intent)));
            }
            a(intent, this.f14462b);
        }
    }

    public void a(e eVar) {
        this.f14463c.put(eVar, new c());
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void b(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f14461a.b(action, Integer.valueOf(d(intent)));
            }
            a(intent, this.f14463c);
        }
    }

    public void b(e eVar) {
        this.f14462b.put(eVar, new N1(this));
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void c(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f14461a.a(action, Integer.valueOf(d(intent)));
            }
            a(intent, this.f14462b);
        }
    }

    public void c(e eVar) {
        this.f14463c.put(eVar, new N1(this));
    }

    public void d(e eVar) {
        this.f14462b.put(eVar, new a());
    }

    public void e(e eVar) {
        this.f14462b.put(eVar, new b());
    }
}
