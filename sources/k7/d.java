package k7;

import ch.qos.logback.core.joran.action.Action;
import com.google.gson.Gson;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f31915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f31916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f31917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f31918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f31919e;

    public d(i iVar) {
        if (iVar.f31926e == null) {
            a aVar = new a(iVar.f31922a);
            iVar.f31926e = aVar;
            if (!aVar.c()) {
                iVar.f31926e = new q();
            }
        }
        e eVar = iVar.f31926e;
        this.f31917c = eVar;
        if (iVar.f31923b == null) {
            iVar.f31923b = new t(iVar.f31922a, "Hawk2");
        }
        this.f31915a = iVar.f31923b;
        if (iVar.f31924c == null) {
            if (iVar.f31925d == null) {
                iVar.f31925d = new f(new Gson());
            }
            iVar.f31924c = new m(iVar.f31925d);
        }
        this.f31916b = iVar.f31924c;
        if (iVar.f31927f == null) {
            if (iVar.f31928g == null) {
                iVar.f31928g = new h(iVar);
            }
            iVar.f31927f = new o(iVar.f31928g);
        }
        this.f31918d = iVar.f31927f;
        if (iVar.f31928g == null) {
            iVar.f31928g = new h(iVar);
        }
        p pVar = iVar.f31928g;
        this.f31919e = pVar;
        Objects.requireNonNull(eVar);
        Objects.requireNonNull(pVar);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:46:0x0116  */
    @Override // k7.n
    public <T> boolean a(String str, T t10) {
        char c10;
        String name;
        String name2;
        x1.q.e("Key", str);
        Objects.toString(t10);
        Objects.requireNonNull(this.f31919e);
        if (t10 == null) {
            Objects.requireNonNull(this.f31919e);
            return ((t) this.f31915a).f31931a.edit().remove(str).commit();
        }
        m mVar = (m) this.f31916b;
        Objects.requireNonNull(mVar);
        String strG = ((f) mVar.f31929a).f31920a.g(t10);
        Objects.requireNonNull(this.f31919e);
        if (strG == null) {
            Objects.requireNonNull(this.f31919e);
            return false;
        }
        String strB = null;
        try {
            strB = this.f31917c.b(str, strG);
            Objects.requireNonNull(this.f31919e);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (strB == null) {
            Objects.requireNonNull(this.f31919e);
            return false;
        }
        Objects.requireNonNull((o) this.f31918d);
        if (strB.trim().length() == 0) {
            throw new NullPointerException("Cipher text should not be null or empty");
        }
        x1.q.e("Value", t10);
        String name3 = "";
        if (List.class.isAssignableFrom(t10.getClass())) {
            List list = (List) t10;
            name = !list.isEmpty() ? list.get(0).getClass().getName() : "";
            c10 = '1';
        } else if (Map.class.isAssignableFrom(t10.getClass())) {
            c10 = '2';
            Map map = (Map) t10;
            if (map.isEmpty()) {
                name2 = "";
            } else {
                Iterator it = map.entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    name3 = entry.getKey().getClass().getName();
                    name2 = entry.getValue().getClass().getName();
                } else {
                    name2 = "";
                }
            }
            String str2 = name3;
            name3 = name2;
            name = str2;
        } else if (Set.class.isAssignableFrom(t10.getClass())) {
            Set set = (Set) t10;
            if (set.isEmpty()) {
                name = "";
            } else {
                Iterator it2 = set.iterator();
                if (it2.hasNext()) {
                    name = it2.next().getClass().getName();
                } else {
                    name = "";
                }
            }
            c10 = '3';
        } else {
            c10 = '0';
            name = t10.getClass().getName();
        }
        String str3 = name + "#" + name3 + "#" + c10 + "V@" + strB;
        Objects.requireNonNull(this.f31919e);
        if (str3 == null) {
            Objects.requireNonNull(this.f31919e);
            return false;
        }
        t tVar = (t) this.f31915a;
        Objects.requireNonNull(tVar);
        x1.q.e(Action.KEY_ATTRIBUTE, str);
        if (tVar.f31931a.edit().putString(str, str3).commit()) {
            Objects.requireNonNull(this.f31919e);
            return true;
        }
        Objects.requireNonNull(this.f31919e);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ae A[PHI: r0
  0x00ae: PHI (r0v2 T) = (r0v1 T), (r0v1 T), (r0v1 T), (r0v4 T) binds: [B:3:0x0006, B:6:0x0019, B:37:0x009a, B:47:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // k7.n
    public <T> T b(String str, T t10) {
        Class<?> cls;
        Class<?> cls2;
        Exception e10;
        String strA;
        Objects.requireNonNull(this.f31919e);
        T t11 = null;
        if (str == null) {
            Objects.requireNonNull(this.f31919e);
        } else {
            String string = ((t) this.f31915a).f31931a.getString(str, null);
            Objects.requireNonNull(this.f31919e);
            if (string == null) {
                Objects.requireNonNull(this.f31919e);
            } else {
                o oVar = (o) this.f31918d;
                Objects.requireNonNull(oVar);
                String[] strArrSplit = string.split("#");
                char cCharAt = strArrSplit[2].charAt(0);
                String str2 = strArrSplit[0];
                if (str2 == null || str2.length() == 0) {
                    cls = null;
                } else {
                    try {
                        cls = Class.forName(str2);
                    } catch (ClassNotFoundException e11) {
                        p pVar = oVar.f31930a;
                        e11.getMessage();
                        Objects.requireNonNull(pVar);
                        cls = null;
                    }
                }
                String str3 = strArrSplit[1];
                if (str3 == null || str3.length() == 0) {
                    cls2 = null;
                } else {
                    try {
                        cls2 = Class.forName(str3);
                    } catch (ClassNotFoundException e12) {
                        p pVar2 = oVar.f31930a;
                        e12.getMessage();
                        Objects.requireNonNull(pVar2);
                        cls2 = null;
                    }
                }
                String str4 = strArrSplit[strArrSplit.length - 1];
                int iIndexOf = str4.indexOf(64);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Text should contain delimiter");
                }
                String strSubstring = str4.substring(iIndexOf + 1);
                c cVar = new c(cCharAt, strSubstring, cls, cls2);
                Objects.requireNonNull(this.f31919e);
                try {
                    strA = this.f31917c.a(str, strSubstring);
                    try {
                        Objects.requireNonNull(this.f31919e);
                    } catch (Exception e13) {
                        e10 = e13;
                        e10.getMessage();
                        Objects.requireNonNull(this.f31919e);
                    }
                } catch (Exception e14) {
                    e10 = e14;
                    strA = null;
                }
                if (strA == null) {
                    Objects.requireNonNull(this.f31919e);
                } else {
                    try {
                        t11 = (T) ((m) this.f31916b).a(strA, cVar);
                        Objects.toString(t11);
                        Objects.requireNonNull(this.f31919e);
                    } catch (Exception unused) {
                        Objects.requireNonNull(this.f31919e);
                    }
                }
            }
        }
        return t11 == null ? t10 : t11;
    }
}
