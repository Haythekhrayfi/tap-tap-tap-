package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class km1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f22444a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, a> f22445b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f22446c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f22447d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f22448e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f22449f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f22450g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final WeakHashMap f22451h = new WeakHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f22452i;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final wm1 f22453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f22454b = new ArrayList<>();

        public a(wm1 wm1Var, String str) {
            this.f22453a = wm1Var;
            a(str);
        }

        public final wm1 a() {
            return this.f22453a;
        }

        public final void a(String str) {
            this.f22454b.add(str);
        }

        public final ArrayList<String> b() {
            return this.f22454b;
        }
    }

    public final String a(View view) {
        if (this.f22444a.size() == 0) {
            return null;
        }
        String str = this.f22444a.get(view);
        if (str != null) {
            this.f22444a.remove(view);
        }
        return str;
    }

    public final String a(String str) {
        return this.f22450g.get(str);
    }

    public final HashSet<String> a() {
        return this.f22448e;
    }

    public final View b(String str) {
        return this.f22446c.get(str);
    }

    public final a b(View view) {
        a aVar = this.f22445b.get(view);
        if (aVar != null) {
            this.f22445b.remove(view);
        }
        return aVar;
    }

    public final HashSet<String> b() {
        return this.f22449f;
    }

    public final int c(View view) {
        if (this.f22447d.contains(view)) {
            return 1;
        }
        return this.f22452i ? 2 : 3;
    }

    public final void c() {
        Boolean bool;
        fm1 fm1VarA = fm1.a();
        if (fm1VarA != null) {
            for (em1 em1Var : fm1VarA.c()) {
                View viewE = em1Var.e();
                if (em1Var.f()) {
                    String strH = em1Var.h();
                    if (viewE != null) {
                        String str = null;
                        if (viewE.isAttachedToWindow()) {
                            if (viewE.hasWindowFocus()) {
                                this.f22451h.remove(viewE);
                                bool = Boolean.FALSE;
                            } else if (this.f22451h.containsKey(viewE)) {
                                bool = (Boolean) this.f22451h.get(viewE);
                            } else {
                                WeakHashMap weakHashMap = this.f22451h;
                                Boolean bool2 = Boolean.FALSE;
                                weakHashMap.put(viewE, bool2);
                                bool = bool2;
                            }
                            if (bool.booleanValue()) {
                                str = "noWindowFocus";
                            } else {
                                HashSet hashSet = new HashSet();
                                View view = viewE;
                                while (true) {
                                    if (view == null) {
                                        this.f22447d.addAll(hashSet);
                                        break;
                                    }
                                    String strC = ln1.c(view);
                                    if (strC != null) {
                                        str = strC;
                                        break;
                                    } else {
                                        hashSet.add(view);
                                        Object parent = view.getParent();
                                        view = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.f22448e.add(strH);
                            this.f22444a.put(viewE, strH);
                            for (wm1 wm1Var : em1Var.c()) {
                                View view2 = wm1Var.a().get();
                                if (view2 != null) {
                                    a aVar = this.f22445b.get(view2);
                                    if (aVar != null) {
                                        aVar.a(em1Var.h());
                                    } else {
                                        this.f22445b.put(view2, new a(wm1Var, em1Var.h()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f22449f.add(strH);
                            this.f22446c.put(strH, viewE);
                            this.f22450g.put(strH, str);
                        }
                    } else {
                        this.f22449f.add(strH);
                        this.f22450g.put(strH, "noAdView");
                    }
                }
            }
        }
    }

    public final void d() {
        this.f22444a.clear();
        this.f22445b.clear();
        this.f22446c.clear();
        this.f22447d.clear();
        this.f22448e.clear();
        this.f22449f.clear();
        this.f22450g.clear();
        this.f22452i = false;
    }

    public final boolean d(View view) {
        if (!this.f22451h.containsKey(view)) {
            return true;
        }
        this.f22451h.put(view, Boolean.TRUE);
        return false;
    }

    public final void e() {
        this.f22452i = true;
    }
}
