package com.iab.omid.library.applovin.walking;

import android.view.View;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f13000a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0166a> f13001b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f13002c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f13003d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f13004e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f13005f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f13006g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f13007h = new WeakHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f13008i;

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.walking.a$a, reason: collision with other inner class name */
    public static class C0166a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f13009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f13010b = new ArrayList<>();

        public C0166a(e eVar, String str) {
            this.f13009a = eVar;
            a(str);
        }

        public e a() {
            return this.f13009a;
        }

        public void a(String str) {
            this.f13010b.add(str);
        }

        public ArrayList<String> b() {
            return this.f13010b;
        }
    }

    private String a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (b(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strA = h.a(view);
            if (strA != null) {
                return strA;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f13003d.addAll(hashSet);
        return null;
    }

    private void a(com.iab.omid.library.applovin.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.applovin.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0166a c0166a = this.f13001b.get(view);
        if (c0166a != null) {
            c0166a.a(aVar.getAdSessionId());
        } else {
            this.f13001b.put(view, new C0166a(eVar, aVar.getAdSessionId()));
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f13007h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f13007h.containsKey(view)) {
            return this.f13007h.get(view);
        }
        Map<View, Boolean> map = this.f13007h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f13002c.get(str);
    }

    public void a() {
        this.f13000a.clear();
        this.f13001b.clear();
        this.f13002c.clear();
        this.f13003d.clear();
        this.f13004e.clear();
        this.f13005f.clear();
        this.f13006g.clear();
        this.f13008i = false;
    }

    public String b(String str) {
        return this.f13006g.get(str);
    }

    public HashSet<String> b() {
        return this.f13005f;
    }

    public C0166a c(View view) {
        C0166a c0166a = this.f13001b.get(view);
        if (c0166a != null) {
            this.f13001b.remove(view);
        }
        return c0166a;
    }

    public HashSet<String> c() {
        return this.f13004e;
    }

    public String d(View view) {
        if (this.f13000a.size() == 0) {
            return null;
        }
        String str = this.f13000a.get(view);
        if (str != null) {
            this.f13000a.remove(view);
        }
        return str;
    }

    public void d() {
        this.f13008i = true;
    }

    public c e(View view) {
        if (this.f13003d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f13008i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.applovin.internal.c cVarC = com.iab.omid.library.applovin.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.applovin.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        String strA = a(viewC);
                        if (strA == null) {
                            this.f13004e.add(adSessionId);
                            this.f13000a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f13005f.add(adSessionId);
                            this.f13002c.put(adSessionId, viewC);
                            this.f13006g.put(adSessionId, strA);
                        }
                    } else {
                        this.f13005f.add(adSessionId);
                        this.f13006g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public boolean f(View view) {
        if (!this.f13007h.containsKey(view)) {
            return true;
        }
        this.f13007h.put(view, Boolean.TRUE);
        return false;
    }
}
