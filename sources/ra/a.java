package ra;

import android.content.Context;
import ch.qos.logback.core.joran.action.Action;
import ed.o;
import ed.p;
import ed.u;
import fd.j0;
import fd.s0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import jc.w;
import oc.e;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements oa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<String, String> f35345a = new HashMap<>();

    /* JADX INFO: renamed from: ra.a$a, reason: collision with other inner class name */
    @e(c = "com.zipoapps.premiumhelper.configuration.testy.TestyConfiguration", f = "TestyConfiguration.kt", l = {42, 44}, m = "init")
    public static final class C0403a extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f35346c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f35347d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f35348e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f35350g;

        public C0403a(mc.d<? super C0403a> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f35348e = obj;
            this.f35350g |= Integer.MIN_VALUE;
            return a.this.e(null, this);
        }
    }

    @Override // oa.a
    public boolean a(String str, boolean z10) {
        return oa.a.C0376a.b(this, str, z10);
    }

    @Override // oa.a
    public String b() {
        return "Testy Configuration";
    }

    @Override // oa.a
    public Map<String, String> c() {
        return this.f35345a;
    }

    @Override // oa.a
    public boolean contains(String str) {
        j0.i(str, Action.KEY_ATTRIBUTE);
        return this.f35345a.containsKey(str);
    }

    @Override // oa.a
    public <T> T d(oa.a aVar, String str, T t10) {
        j0.i(aVar, "<this>");
        Object objE = null;
        if (t10 instanceof String) {
            objE = this.f35345a.get(str);
        } else if (t10 instanceof Boolean) {
            String str2 = this.f35345a.get(str);
            if (str2 != null) {
                objE = u.X(str2);
            }
        } else if (t10 instanceof Long) {
            String str3 = this.f35345a.get(str);
            if (str3 != null) {
                objE = p.g(str3);
            }
        } else {
            if (!(t10 instanceof Double)) {
                throw new IllegalStateException("Unsupported type".toString());
            }
            String str4 = this.f35345a.get(str);
            if (str4 != null) {
                objE = o.e(str4);
            }
        }
        return objE == null ? t10 : (T) objE;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(Context context, mc.d<? super w> dVar) throws Throwable {
        C0403a c0403a;
        Object obj;
        Context context2;
        a aVar;
        Map<? extends String, ? extends String> map;
        if (dVar instanceof C0403a) {
            c0403a = (C0403a) dVar;
            int i10 = c0403a.f35350g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0403a.f35350g = i10 - Integer.MIN_VALUE;
            } else {
                c0403a = new C0403a(dVar);
            }
        } else {
            c0403a = new C0403a(dVar);
        }
        Object objV = c0403a.f35348e;
        nc.a aVar2 = nc.a.COROUTINE_SUSPENDED;
        int i11 = c0403a.f35350g;
        if (i11 != 0) {
            if (i11 == 1) {
                Context context3 = (Context) c0403a.f35347d;
                a aVar3 = (a) c0403a.f35346c;
                h9.d.t(objV);
                context2 = context3;
                aVar = aVar3;
                obj = objV;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (a) c0403a.f35346c;
                h9.d.t(objV);
            }
            map = (Map) objV;
            if (map != null) {
                aVar.f35345a.putAll(map);
            }
            return w.f31842a;
        }
        h9.d.t(objV);
        b bVar = b.f35351a;
        c0403a.f35346c = this;
        c0403a.f35347d = context;
        c0403a.f35350g = 1;
        Object objA = bVar.a(context, c0403a);
        if (objA == aVar2) {
            return aVar2;
        }
        obj = objA;
        context2 = context;
        aVar = this;
        if (((Boolean) obj).booleanValue()) {
            xe.a.f37601c.g("Found Testy app", new Object[0]);
            c0403a.f35346c = aVar;
            c0403a.f35347d = null;
            c0403a.f35350g = 2;
            objV = c0.V(s0.f29620b, new d(context2, null), c0403a);
            if (objV == aVar2) {
                return aVar2;
            }
            map = (Map) objV;
            if (map != null) {
                aVar.f35345a.putAll(map);
            }
        }
        return w.f31842a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f35345a.isEmpty()) {
            sb2.append("Debug Override");
            sb2.append('\n');
            Set<Map.Entry<String, String>> setEntrySet = this.f35345a.entrySet();
            j0.h(setEntrySet, "values.entries");
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                j0.h(entry, "(key, value)");
                sb2.append(((String) entry.getKey()) + " : " + ((String) entry.getValue()));
                sb2.append('\n');
            }
        }
        String string = sb2.toString();
        j0.h(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
