package h9;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import org.json.JSONObject;
import p7.d1;
import uc.p;
import y8.c0;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m<String> f30977a = i5.a.f31262r;

    public static <R, T> j9.a<v9.c<T>> a(JSONObject jSONObject, String str, boolean z10, j9.a<v9.c<T>> aVar, uc.l<R, T> lVar, g<T> gVar, u9.e eVar, u9.c cVar, k<T> kVar) {
        v9.c cVarI = c.i(jSONObject, str, lVar, gVar, c.f30971a, eVar, cVar, kVar, c.a.f30976z1);
        if (cVarI != null) {
            return new j9.a.e(z10, cVarI);
        }
        String strV = v(jSONObject, str, eVar, cVar);
        if (strV != null) {
            return new j9.a.d(z10, strV);
        }
        return aVar != null ? c0.f(aVar, z10) : j9.a.f31787b.a(z10);
    }

    public static <T> j9.a<T> b(JSONObject jSONObject, String str, boolean z10, j9.a<T> aVar, m<T> mVar, u9.e eVar, u9.c cVar) {
        return d(jSONObject, str, z10, aVar, c.f30973c, mVar, eVar, cVar);
    }

    public static <T> j9.a<T> c(JSONObject jSONObject, String str, boolean z10, j9.a<T> aVar, u9.e eVar, u9.c cVar) {
        return d(jSONObject, str, z10, aVar, c.f30973c, c.f30971a, eVar, cVar);
    }

    public static <R, T> j9.a<T> d(JSONObject jSONObject, String str, boolean z10, j9.a<T> aVar, uc.l<R, T> lVar, m<T> mVar, u9.e eVar, u9.c cVar) {
        try {
            return new j9.a.e(z10, c.c(jSONObject, str, lVar, mVar));
        } catch (u9.f e10) {
            d.s(e10);
            j9.a<T> aVarW = w(z10, v(jSONObject, str, eVar, cVar), aVar);
            if (aVarW != null) {
                return aVarW;
            }
            throw e10;
        }
    }

    public static <R, T> j9.a<T> e(JSONObject jSONObject, String str, boolean z10, j9.a<T> aVar, uc.l<R, T> lVar, u9.e eVar, u9.c cVar) {
        return d(jSONObject, str, z10, aVar, lVar, c.f30971a, eVar, cVar);
    }

    public static <T> j9.a<T> f(JSONObject jSONObject, String str, boolean z10, j9.a<T> aVar, p<u9.c, JSONObject, T> pVar, u9.e eVar, u9.c cVar) {
        try {
            return new j9.a.e(z10, c.d(jSONObject, str, pVar, c.f30971a, cVar));
        } catch (u9.f e10) {
            d.s(e10);
            j9.a<T> aVarW = w(z10, v(jSONObject, str, eVar, cVar), aVar);
            if (aVarW != null) {
                return aVarW;
            }
            throw e10;
        }
    }

    public static <T> j9.a<v9.b<T>> g(JSONObject jSONObject, String str, boolean z10, j9.a<v9.b<T>> aVar, m<T> mVar, u9.e eVar, u9.c cVar, k<T> kVar) {
        return i(jSONObject, str, z10, aVar, c.f30973c, mVar, eVar, cVar, kVar);
    }

    public static <T> j9.a<v9.b<T>> h(JSONObject jSONObject, String str, boolean z10, j9.a<v9.b<T>> aVar, u9.e eVar, u9.c cVar, k<T> kVar) {
        return i(jSONObject, str, z10, aVar, c.f30973c, c.f30971a, eVar, cVar, kVar);
    }

    public static <R, T> j9.a<v9.b<T>> i(JSONObject jSONObject, String str, boolean z10, j9.a<v9.b<T>> aVar, uc.l<R, T> lVar, m<T> mVar, u9.e eVar, u9.c cVar, k<T> kVar) {
        try {
            return new j9.a.e(z10, c.g(jSONObject, str, lVar, mVar, eVar, kVar));
        } catch (u9.f e10) {
            d.s(e10);
            j9.a<v9.b<T>> aVarW = w(z10, v(jSONObject, str, eVar, cVar), aVar);
            if (aVarW != null) {
                return aVarW;
            }
            throw e10;
        }
    }

    public static <R, T> j9.a<v9.b<T>> j(JSONObject jSONObject, String str, boolean z10, j9.a<v9.b<T>> aVar, uc.l<R, T> lVar, u9.e eVar, u9.c cVar, k<T> kVar) {
        return i(jSONObject, str, z10, aVar, lVar, c.f30971a, eVar, cVar, kVar);
    }

    public static <T> j9.a<List<T>> k(JSONObject jSONObject, String str, boolean z10, j9.a<List<T>> aVar, p<u9.c, JSONObject, T> pVar, g<T> gVar, u9.e eVar, u9.c cVar) {
        try {
            return new j9.a.e(z10, c.k(jSONObject, str, pVar, gVar, c.f30971a, eVar, cVar));
        } catch (u9.f e10) {
            d.s(e10);
            j9.a<List<T>> aVarW = w(z10, v(jSONObject, str, eVar, cVar), aVar);
            if (aVarW != null) {
                return aVarW;
            }
            throw e10;
        }
    }

    public static <T> j9.a<T> l(JSONObject jSONObject, String str, boolean z10, j9.a<T> aVar, m<T> mVar, u9.e eVar, u9.c cVar) {
        return n(jSONObject, str, z10, aVar, c.f30973c, mVar, eVar, cVar);
    }

    public static <T> j9.a<T> m(JSONObject jSONObject, String str, boolean z10, j9.a<T> aVar, u9.e eVar, u9.c cVar) {
        return n(jSONObject, str, z10, aVar, c.f30973c, c.f30971a, eVar, cVar);
    }

    public static <R, T> j9.a<T> n(JSONObject jSONObject, String str, boolean z10, j9.a<T> aVar, uc.l<R, T> lVar, m<T> mVar, u9.e eVar, u9.c cVar) {
        Object objM = c.m(jSONObject, str, lVar, mVar, eVar);
        if (objM != null) {
            return new j9.a.e(z10, objM);
        }
        String strV = v(jSONObject, str, eVar, cVar);
        if (strV != null) {
            return new j9.a.d(z10, strV);
        }
        return aVar != null ? c0.f(aVar, z10) : j9.a.f31787b.a(z10);
    }

    public static <T> j9.a<T> o(JSONObject jSONObject, String str, boolean z10, j9.a<T> aVar, p<u9.c, JSONObject, T> pVar, u9.e eVar, u9.c cVar) {
        u9.f fVarR;
        T tInvoke;
        m<?> mVar = c.f30971a;
        m<?> mVar2 = c.f30971a;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            tInvoke = null;
        } else {
            try {
                try {
                    tInvoke = pVar.invoke(cVar, jSONObjectOptJSONObject);
                    if (tInvoke == null) {
                        fVarR = c0.q(jSONObject, str, jSONObjectOptJSONObject);
                        eVar.b(fVarR);
                        tInvoke = null;
                    } else if (!((d1) mVar).d(tInvoke)) {
                        eVar.b(c0.q(jSONObject, str, jSONObjectOptJSONObject));
                        tInvoke = null;
                    }
                } catch (ClassCastException unused) {
                    fVarR = c0.U(jSONObject, str, jSONObjectOptJSONObject);
                }
            } catch (Exception e10) {
                fVarR = c0.r(jSONObject, str, jSONObjectOptJSONObject, e10);
            }
        }
        if (tInvoke != null) {
            return new j9.a.e(z10, tInvoke);
        }
        String strV = v(jSONObject, str, eVar, cVar);
        if (strV != null) {
            return new j9.a.d(z10, strV);
        }
        return aVar != null ? c0.f(aVar, z10) : j9.a.f31787b.a(z10);
    }

    public static <T> j9.a<v9.b<T>> p(JSONObject jSONObject, String str, boolean z10, j9.a<v9.b<T>> aVar, m<T> mVar, u9.e eVar, u9.c cVar, k<T> kVar) {
        return r(jSONObject, str, z10, aVar, c.f30973c, mVar, eVar, cVar, kVar);
    }

    public static <T> j9.a<v9.b<T>> q(JSONObject jSONObject, String str, boolean z10, j9.a<v9.b<T>> aVar, u9.e eVar, u9.c cVar, k<T> kVar) {
        return r(jSONObject, str, z10, aVar, c.f30973c, c.f30971a, eVar, cVar, kVar);
    }

    public static <R, T> j9.a<v9.b<T>> r(JSONObject jSONObject, String str, boolean z10, j9.a<v9.b<T>> aVar, uc.l<R, T> lVar, m<T> mVar, u9.e eVar, u9.c cVar, k<T> kVar) {
        v9.b bVarR = c.r(jSONObject, str, lVar, mVar, eVar, null, kVar);
        if (bVarR != null) {
            return new j9.a.e(z10, bVarR);
        }
        String strV = v(jSONObject, str, eVar, cVar);
        if (strV != null) {
            return new j9.a.d(z10, strV);
        }
        return aVar != null ? c0.f(aVar, z10) : j9.a.f31787b.a(z10);
    }

    public static <R, T> j9.a<v9.b<T>> s(JSONObject jSONObject, String str, boolean z10, j9.a<v9.b<T>> aVar, uc.l<R, T> lVar, u9.e eVar, u9.c cVar, k<T> kVar) {
        return r(jSONObject, str, z10, aVar, lVar, c.f30971a, eVar, cVar, kVar);
    }

    public static <R, T> j9.a<List<T>> t(JSONObject jSONObject, String str, boolean z10, j9.a<List<T>> aVar, uc.l<R, T> lVar, g<T> gVar, u9.e eVar, u9.c cVar) {
        List listU = c.u(jSONObject, str, lVar, gVar, c.f30971a, eVar);
        if (listU != null) {
            return new j9.a.e(z10, listU);
        }
        String strV = v(jSONObject, str, eVar, cVar);
        if (strV != null) {
            return new j9.a.d(z10, strV);
        }
        return aVar != null ? c0.f(aVar, z10) : j9.a.f31787b.a(z10);
    }

    public static <R, T> j9.a<List<T>> u(JSONObject jSONObject, String str, boolean z10, j9.a<List<T>> aVar, p<u9.c, R, T> pVar, g<T> gVar, u9.e eVar, u9.c cVar) {
        List listW = c.w(jSONObject, str, pVar, gVar, eVar, cVar);
        if (listW != null) {
            return new j9.a.e(z10, listW);
        }
        String strV = v(jSONObject, str, eVar, cVar);
        if (strV != null) {
            return new j9.a.d(z10, strV);
        }
        return aVar != null ? c0.f(aVar, z10) : j9.a.f31787b.a(z10);
    }

    public static String v(JSONObject jSONObject, String str, u9.e eVar, u9.c cVar) {
        return (String) c.m(jSONObject, CoreConstants.DOLLAR + str, c.f30973c, f30977a, eVar);
    }

    public static <T> j9.a<T> w(boolean z10, String str, j9.a<T> aVar) {
        if (str != null) {
            return new j9.a.d(z10, str);
        }
        if (aVar != null) {
            return c0.f(aVar, z10);
        }
        if (z10) {
            return j9.a.f31787b.a(z10);
        }
        return null;
    }
}
