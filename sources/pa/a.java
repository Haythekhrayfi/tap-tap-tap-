package pa;

import ch.qos.logback.core.joran.action.Action;
import ed.o;
import ed.p;
import ed.u;
import fd.j0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements oa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<String, String> f34633a = new HashMap<>();

    @Override // oa.a
    public boolean a(String str, boolean z10) {
        return oa.a.C0376a.b(this, str, z10);
    }

    @Override // oa.a
    public String b() {
        return "Debug Override";
    }

    @Override // oa.a
    public Map<String, String> c() {
        return this.f34633a;
    }

    @Override // oa.a
    public boolean contains(String str) {
        j0.i(str, Action.KEY_ATTRIBUTE);
        return this.f34633a.containsKey(str);
    }

    @Override // oa.a
    public <T> T d(oa.a aVar, String str, T t10) {
        j0.i(aVar, "<this>");
        Object objE = null;
        if (t10 instanceof String) {
            objE = this.f34633a.get(str);
        } else if (t10 instanceof Boolean) {
            String str2 = this.f34633a.get(str);
            if (str2 != null) {
                objE = u.X(str2);
            }
        } else if (t10 instanceof Long) {
            String str3 = this.f34633a.get(str);
            if (str3 != null) {
                objE = p.g(str3);
            }
        } else {
            if (!(t10 instanceof Double)) {
                throw new IllegalStateException("Unsupported type".toString());
            }
            String str4 = this.f34633a.get(str);
            if (str4 != null) {
                objE = o.e(str4);
            }
        }
        return objE == null ? t10 : (T) objE;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f34633a.isEmpty()) {
            sb2.append("Debug Override");
            sb2.append('\n');
            Set<Map.Entry<String, String>> setEntrySet = this.f34633a.entrySet();
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
