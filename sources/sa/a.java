package sa;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ed.o;
import ed.q;
import ed.u;
import fd.g0;
import fd.j0;
import fd.z;
import i.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import jc.w;
import mc.d;
import oc.c;
import oc.e;
import oc.h;
import uc.p;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements oa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f35499a;

    /* JADX INFO: renamed from: sa.a$a, reason: collision with other inner class name */
    @e(c = "com.zipoapps.premiumhelper.configuration.toto.TotoConfigRepository", f = "TotoConfigRepository.kt", l = {62}, m = "allPreferencesToString")
    public static final class C0413a extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f35500c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f35502e;

        public C0413a(d<? super C0413a> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f35500c = obj;
            this.f35502e |= Integer.MIN_VALUE;
            return a.this.e(this);
        }
    }

    @e(c = "com.zipoapps.premiumhelper.configuration.toto.TotoConfigRepository$allPreferencesToString$2", f = "TotoConfigRepository.kt", l = {}, m = "invokeSuspend")
    public static final class b extends h implements p<g0, d<? super String>, Object> {
        public b(d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // oc.a
        public final d<w> create(Object obj, d<?> dVar) {
            return a.this.new b(dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, d<? super String> dVar) {
            return a.this.new b(dVar).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            h9.d.t(obj);
            StringBuilder sb2 = new StringBuilder();
            Iterator<T> it = a.this.f35499a.getAll().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                sb2.append(((String) entry.getKey()) + " : " + entry.getValue());
                sb2.append('\n');
            }
            return sb2.toString();
        }
    }

    public a(Context context) {
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f35499a = context.getSharedPreferences("toto_configuration", 0);
    }

    @Override // oa.a
    public boolean a(String str, boolean z10) {
        return oa.a.C0376a.b(this, str, z10);
    }

    @Override // oa.a
    public String b() {
        return "Toto Service";
    }

    @Override // oa.a
    public Map<String, String> c() {
        HashMap map = new HashMap();
        Map<String, ?> all = this.f35499a.getAll();
        j0.h(all, "sharedPreferences.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            j0.h(key, "it.key");
            if (!q.h(key, "_hash", false, 2)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (!((String) entry2.getKey()).equals("x-country")) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            Object key2 = entry3.getKey();
            j0.h(key2, "entry.key");
            String lowerCase = String.valueOf(entry3.getValue()).toLowerCase(Locale.ROOT);
            j0.h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            map.put(key2, lowerCase);
        }
        return map;
    }

    @Override // oa.a
    public boolean contains(String str) {
        j0.i(str, Action.KEY_ATTRIBUTE);
        return this.f35499a.contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oa.a
    public <T> T d(oa.a aVar, String str, T t10) {
        j0.i(aVar, "<this>");
        Object objE = null;
        if (t10 instanceof String) {
            objE = this.f35499a.getString(str, (String) t10);
        } else if (t10 instanceof Boolean) {
            String string = this.f35499a.getString(str, null);
            if (string != null) {
                objE = u.X(string);
            }
        } else if (t10 instanceof Long) {
            String string2 = this.f35499a.getString(str, null);
            if (string2 != null) {
                objE = ed.p.g(string2);
            }
        } else {
            if (!(t10 instanceof Double)) {
                throw new IllegalStateException("Unsupported type".toString());
            }
            String string3 = this.f35499a.getString(str, null);
            if (string3 != null) {
                objE = o.e(string3);
            }
        }
        return objE == null ? t10 : (T) objE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(d<? super String> dVar) {
        C0413a c0413a;
        if (dVar instanceof C0413a) {
            c0413a = (C0413a) dVar;
            int i10 = c0413a.f35502e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0413a.f35502e = i10 - Integer.MIN_VALUE;
            } else {
                c0413a = new C0413a(dVar);
            }
        } else {
            c0413a = new C0413a(dVar);
        }
        Object objL = c0413a.f35500c;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = c0413a.f35502e;
        if (i11 == 0) {
            h9.d.t(objL);
            b bVar = new b(null);
            c0413a.f35502e = 1;
            objL = z.l(bVar, c0413a);
            if (objL == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9.d.t(objL);
        }
        j0.h(objL, "suspend fun allPreferenc…oString()\n        }\n    }");
        return objL;
    }

    public final String f(String str) {
        return f.a(str, "_hash");
    }
}
