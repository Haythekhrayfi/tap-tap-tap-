package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import ch.qos.logback.core.joran.action.Action;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f2187f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Class<? extends Object>[] f2188g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f2189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, m1.b.c> f2190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, Object> f2191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, id.n<Object>> f2192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m1.b.c f2193e;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final e0 a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new e0();
                }
                HashMap map = new HashMap();
                for (String str : bundle2.keySet()) {
                    fd.j0.h(str, Action.KEY_ATTRIBUTE);
                    map.put(str, bundle2.get(str));
                }
                return new e0(map);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (!((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true)) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = parcelableArrayList.get(i10);
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
            }
            return new e0(linkedHashMap);
        }
    }

    public e0() {
        this.f2189a = new LinkedHashMap();
        this.f2190b = new LinkedHashMap();
        this.f2191c = new LinkedHashMap();
        this.f2192d = new LinkedHashMap();
        final int i10 = 0;
        this.f2193e = new m1.b.c(this) { // from class: androidx.lifecycle.d0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f2186b;

            {
                this.f2186b = this;
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
            @Override // m1.b.c
            public final Bundle a() {
                switch (i10) {
                }
                return e0.a(this.f2186b);
            }
        };
    }

    public e0(Map<String, ? extends Object> map) {
        fd.j0.i(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f2189a = linkedHashMap;
        this.f2190b = new LinkedHashMap();
        this.f2191c = new LinkedHashMap();
        this.f2192d = new LinkedHashMap();
        final int i10 = 1;
        this.f2193e = new m1.b.c(this) { // from class: androidx.lifecycle.d0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f2186b;

            {
                this.f2186b = this;
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
            @Override // m1.b.c
            public final Bundle a() {
                switch (i10) {
                }
                return e0.a(this.f2186b);
            }
        };
        linkedHashMap.putAll(map);
    }

    public static Bundle a(e0 e0Var) {
        fd.j0.i(e0Var, "this$0");
        Iterator it = kc.f0.k(e0Var.f2190b).entrySet().iterator();
        while (true) {
            boolean z10 = false;
            if (!it.hasNext()) {
                Set<String> setKeySet = e0Var.f2189a.keySet();
                ArrayList arrayList = new ArrayList(setKeySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : setKeySet) {
                    arrayList.add(str);
                    arrayList2.add(e0Var.f2189a.get(str));
                }
                return androidx.activity.i.a(new jc.h("keys", arrayList), new jc.h("values", arrayList2));
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            Bundle bundleA = ((m1.b.c) entry.getValue()).a();
            fd.j0.i(str2, Action.KEY_ATTRIBUTE);
            Objects.requireNonNull(f2187f);
            if (bundleA == null) {
                z10 = true;
                break;
            }
            for (Class<? extends Object> cls : f2188g) {
                fd.j0.f(cls);
                if (cls.isInstance(bundleA)) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't put value with type ");
                fd.j0.f(bundleA);
                sb2.append(bundleA.getClass());
                sb2.append(" into saved state");
                throw new IllegalArgumentException(sb2.toString());
            }
            Object obj = e0Var.f2191c.get(str2);
            v vVar = obj instanceof v ? (v) obj : null;
            if (vVar != null) {
                vVar.i(bundleA);
            } else {
                e0Var.f2189a.put(str2, bundleA);
            }
            id.n<Object> nVar = e0Var.f2192d.get(str2);
            if (nVar != null) {
                nVar.setValue(bundleA);
            }
        }
    }
}
