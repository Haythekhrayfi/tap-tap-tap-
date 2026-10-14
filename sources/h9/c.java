package h9;

import ch.qos.logback.core.joran.action.Action;
import fd.j0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p7.d1;
import uc.p;
import y8.c0;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m<?> f30971a = d1.f34485i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m<String> f30972b = i5.a.f31259o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final uc.l<?, ?> f30973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v9.c<?> f30974d;

    public interface a {

        /* JADX INFO: renamed from: y1, reason: collision with root package name */
        public static final a f30975y1 = d1.f34487k;

        /* JADX INFO: renamed from: z1, reason: collision with root package name */
        public static final a f30976z1 = i5.a.f31260p;

        static /* synthetic */ void g(u9.f fVar) {
            throw fVar;
        }

        void b(u9.f fVar);
    }

    static {
        d1 d1Var = d1.f34486j;
        f30973c = new uc.l() { // from class: h9.b
            @Override // uc.l
            public final Object invoke(Object obj) {
                m<?> mVar = c.f30971a;
                return obj;
            }
        };
        f30974d = new v9.a(Collections.emptyList());
    }

    public static <T> T a(T t10) {
        if (t10 == null || t10 == JSONObject.NULL) {
            return null;
        }
        return t10;
    }

    public static Object b(JSONObject jSONObject, String str) {
        Object objOpt = jSONObject.opt(str);
        if (objOpt == null || objOpt == JSONObject.NULL) {
            return null;
        }
        return objOpt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object c(JSONObject jSONObject, String str, uc.l lVar, m mVar) {
        Object objB = b(jSONObject, str);
        if (objB == null) {
            throw c0.A(jSONObject, str);
        }
        try {
            Object objInvoke = lVar.invoke(objB);
            if (objInvoke == null) {
                throw c0.q(jSONObject, str, objB);
            }
            try {
                if (mVar.d(objInvoke)) {
                    return objInvoke;
                }
                throw c0.q(jSONObject, str, objInvoke);
            } catch (ClassCastException unused) {
                throw c0.U(jSONObject, str, objInvoke);
            }
        } catch (ClassCastException unused2) {
            throw c0.U(jSONObject, str, objB);
        } catch (Exception e10) {
            throw c0.r(jSONObject, str, objB, e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object d(JSONObject jSONObject, String str, p pVar, m mVar, u9.c cVar) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            throw c0.A(jSONObject, str);
        }
        try {
            Object objInvoke = pVar.invoke(cVar, jSONObjectOptJSONObject);
            if (objInvoke == null) {
                throw c0.q(jSONObject, str, null);
            }
            try {
                if (mVar.d(objInvoke)) {
                    return objInvoke;
                }
                throw c0.q(jSONObject, str, objInvoke);
            } catch (ClassCastException unused) {
                throw c0.U(jSONObject, str, objInvoke);
            }
        } catch (u9.f e10) {
            throw c0.h(jSONObject, str, e10);
        }
    }

    public static <T> v9.b<T> e(JSONObject jSONObject, String str, m<T> mVar, u9.e eVar, u9.c cVar, k<T> kVar) {
        return g(jSONObject, str, f30973c, mVar, eVar, kVar);
    }

    public static v9.b<String> f(JSONObject jSONObject, String str, u9.e eVar, u9.c cVar, k<String> kVar) {
        return g(jSONObject, str, f30973c, f30972b, eVar, kVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static v9.b g(JSONObject jSONObject, String str, uc.l lVar, m mVar, u9.e eVar, k kVar) {
        Object objB = b(jSONObject, str);
        if (objB == null) {
            throw c0.A(jSONObject, str);
        }
        if (v9.b.d(objB)) {
            return new v9.b.c(str, objB.toString(), lVar, mVar, eVar, kVar, null);
        }
        try {
            Object objInvoke = lVar.invoke(objB);
            if (objInvoke == null) {
                throw c0.q(jSONObject, str, objB);
            }
            try {
                if (mVar.d(objInvoke)) {
                    return v9.b.a(objInvoke);
                }
                throw c0.q(jSONObject, str, objB);
            } catch (ClassCastException unused) {
                throw c0.U(jSONObject, str, objB);
            }
        } catch (ClassCastException unused2) {
            throw c0.U(jSONObject, str, objB);
        } catch (Exception e10) {
            throw c0.r(jSONObject, str, objB, e10);
        }
    }

    public static <R, T> v9.b<T> h(JSONObject jSONObject, String str, uc.l<R, T> lVar, u9.e eVar, u9.c cVar, k<T> kVar) {
        return g(jSONObject, str, lVar, f30971a, eVar, kVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, T> v9.c i(JSONObject jSONObject, String str, uc.l<R, T> lVar, g<T> gVar, m<T> mVar, u9.e eVar, u9.c cVar, k<T> kVar, a aVar) {
        a aVar2;
        int i10;
        ArrayList arrayList;
        int i11;
        u9.f fVarP;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            aVar.b(c0.A(jSONObject, str));
            return null;
        }
        int length = jSONArrayOptJSONArray.length();
        if (length == 0) {
            List<? extends T> listEmptyList = Collections.emptyList();
            try {
                if (gVar.isValid(listEmptyList)) {
                    return f30974d;
                }
                eVar.b(c0.q(jSONObject, str, listEmptyList));
                return f30974d;
            } catch (ClassCastException unused) {
                eVar.b(c0.U(jSONObject, str, listEmptyList));
                return f30974d;
            }
        }
        ArrayList arrayList2 = new ArrayList(length);
        boolean z10 = false;
        int i12 = 0;
        while (i12 < length) {
            Object objA = a(jSONArrayOptJSONArray.opt(i12));
            if (objA == null) {
                i10 = i12;
                arrayList = arrayList2;
                i11 = length;
            } else if (v9.b.d(objA)) {
                i10 = i12;
                arrayList = arrayList2;
                i11 = length;
                arrayList.add(new v9.b.c(str + "[" + i12 + "]", objA.toString(), lVar, mVar, eVar, kVar, null));
                z10 = true;
            } else {
                i10 = i12;
                arrayList = arrayList2;
                i11 = length;
                try {
                    T tInvoke = lVar.invoke(objA);
                    if (tInvoke != null) {
                        try {
                            if (mVar.d(tInvoke)) {
                                arrayList.add(tInvoke);
                            } else {
                                eVar.b(c0.o(jSONArrayOptJSONArray, str, i10, tInvoke));
                            }
                        } catch (ClassCastException unused2) {
                            fVarP = c0.T(jSONArrayOptJSONArray, str, i10, tInvoke);
                            eVar.b(fVarP);
                        }
                    }
                } catch (ClassCastException unused3) {
                    fVarP = c0.T(jSONArrayOptJSONArray, str, i10, objA);
                } catch (Exception e10) {
                    fVarP = c0.p(jSONArrayOptJSONArray, str, i10, objA, e10);
                }
            }
            i12 = i10 + 1;
            arrayList2 = arrayList;
            length = i11;
        }
        ArrayList arrayList3 = arrayList2;
        if (z10) {
            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                Object obj = arrayList3.get(i13);
                if (!(obj instanceof v9.b)) {
                    arrayList3.set(i13, v9.b.a(obj));
                }
            }
            return new v9.e(str, arrayList3, gVar, cVar.a());
        }
        try {
            if (gVar.isValid(arrayList3)) {
                return new v9.a(arrayList3);
            }
            aVar2 = aVar;
            try {
                aVar2.b(c0.q(jSONObject, str, arrayList3));
                return null;
            } catch (ClassCastException unused4) {
            }
        } catch (ClassCastException unused5) {
            aVar2 = aVar;
        }
        aVar2.b(c0.U(jSONObject, str, arrayList3));
        return null;
    }

    public static <R, T> v9.c<T> j(JSONObject jSONObject, String str, uc.l<R, T> lVar, g<T> gVar, u9.e eVar, u9.c cVar, k<T> kVar) {
        v9.c<T> cVarI = i(jSONObject, str, lVar, gVar, f30971a, eVar, cVar, kVar, a.f30975y1);
        if (cVarI != null) {
            return cVarI;
        }
        throw c0.n(str, jSONObject);
    }

    public static <T> List<T> k(JSONObject jSONObject, String str, p<u9.c, JSONObject, T> pVar, g<T> gVar, m<T> mVar, u9.e eVar, u9.c cVar) {
        u9.f fVarP;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            throw c0.A(jSONObject, str);
        }
        int length = jSONArrayOptJSONArray.length();
        if (length == 0) {
            List<T> listEmptyList = Collections.emptyList();
            try {
                if (!gVar.isValid(listEmptyList)) {
                    eVar.b(c0.q(jSONObject, str, listEmptyList));
                }
                return listEmptyList;
            } catch (ClassCastException unused) {
                eVar.b(c0.U(jSONObject, str, listEmptyList));
                return listEmptyList;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject2 = (JSONObject) a(jSONArrayOptJSONArray.optJSONObject(i10));
            if (jSONObject2 != null) {
                try {
                    try {
                        T tInvoke = pVar.invoke(cVar, jSONObject2);
                        if (tInvoke != null) {
                            if (mVar.d(tInvoke)) {
                                arrayList.add(tInvoke);
                            } else {
                                eVar.b(c0.o(jSONArrayOptJSONArray, str, i10, tInvoke));
                            }
                        }
                    } catch (ClassCastException unused2) {
                        fVarP = c0.T(jSONArrayOptJSONArray, str, i10, jSONObject2);
                        eVar.b(fVarP);
                    }
                } catch (Exception e10) {
                    fVarP = c0.p(jSONArrayOptJSONArray, str, i10, jSONObject2, e10);
                    eVar.b(fVarP);
                }
            }
        }
        try {
            if (gVar.isValid(arrayList)) {
                return arrayList;
            }
            throw c0.q(jSONObject, str, arrayList);
        } catch (ClassCastException unused3) {
            throw c0.U(jSONObject, str, arrayList);
        }
    }

    public static <T> List<T> l(JSONObject jSONObject, String str, p<u9.c, JSONObject, T> pVar, g<T> gVar, u9.e eVar, u9.c cVar) {
        return k(jSONObject, str, pVar, gVar, f30971a, eVar, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object m(JSONObject jSONObject, String str, uc.l lVar, m mVar, u9.e eVar) {
        u9.f fVarR;
        Object objB = b(jSONObject, str);
        if (objB == null) {
            return null;
        }
        try {
            try {
                Object objInvoke = lVar.invoke(objB);
                if (objInvoke != null) {
                    if (mVar.d(objInvoke)) {
                        return objInvoke;
                    }
                    eVar.b(c0.q(jSONObject, str, objB));
                    return null;
                }
                fVarR = c0.q(jSONObject, str, objB);
            } catch (ClassCastException unused) {
                fVarR = c0.U(jSONObject, str, objB);
            }
        } catch (Exception e10) {
            fVarR = c0.r(jSONObject, str, objB, e10);
        }
        eVar.b(fVarR);
        return null;
    }

    public static <T extends u9.a> T n(JSONObject jSONObject, String str, p<u9.c, JSONObject, T> pVar, u9.e eVar, u9.c cVar) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        try {
            return pVar.invoke(cVar, jSONObjectOptJSONObject);
        } catch (u9.f e10) {
            eVar.b(e10);
            return null;
        }
    }

    public static <T> v9.b<T> o(JSONObject jSONObject, String str, m<T> mVar, u9.e eVar, u9.c cVar, k<T> kVar) {
        return q(jSONObject, str, f30973c, mVar, eVar, cVar, kVar);
    }

    public static v9.b<String> p(JSONObject jSONObject, String str, u9.e eVar, u9.c cVar, k<String> kVar) {
        return q(jSONObject, str, f30973c, f30972b, eVar, cVar, kVar);
    }

    public static <R, T> v9.b<T> q(JSONObject jSONObject, String str, uc.l<R, T> lVar, m<T> mVar, u9.e eVar, u9.c cVar, k<T> kVar) {
        return r(jSONObject, str, lVar, mVar, eVar, null, kVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static v9.b r(JSONObject jSONObject, String str, uc.l lVar, m mVar, u9.e eVar, v9.b bVar, k kVar) {
        u9.f fVarU;
        Object objB = b(jSONObject, str);
        if (objB == null) {
            return null;
        }
        if (v9.b.d(objB)) {
            return new v9.b.c(str, objB.toString(), lVar, mVar, eVar, kVar, bVar);
        }
        try {
            try {
                Object objInvoke = lVar.invoke(objB);
                if (objInvoke != null) {
                    if (mVar.d(objInvoke)) {
                        return v9.b.a(objInvoke);
                    }
                    eVar.b(c0.q(jSONObject, str, objB));
                    return null;
                }
                fVarU = c0.q(jSONObject, str, objB);
            } catch (Exception e10) {
                fVarU = c0.r(jSONObject, str, objB, e10);
            }
        } catch (ClassCastException unused) {
            fVarU = c0.U(jSONObject, str, objB);
        }
        eVar.b(fVarU);
        return null;
    }

    public static <R, T> v9.b<T> s(JSONObject jSONObject, String str, uc.l<R, T> lVar, u9.e eVar, u9.c cVar, k<T> kVar) {
        return q(jSONObject, str, lVar, f30971a, eVar, cVar, kVar);
    }

    public static <R, T> v9.b<T> t(JSONObject jSONObject, String str, uc.l<R, T> lVar, u9.e eVar, u9.c cVar, v9.b<T> bVar, k<T> kVar) {
        return r(jSONObject, str, lVar, f30971a, eVar, bVar, kVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List u(JSONObject jSONObject, String str, uc.l lVar, g gVar, m mVar, u9.e eVar) {
        u9.f fVarU;
        u9.f fVarT;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int length = jSONArrayOptJSONArray.length();
        if (length == 0) {
            List<? extends T> listEmptyList = Collections.emptyList();
            try {
                if (gVar.isValid(listEmptyList)) {
                    return listEmptyList;
                }
                eVar.b(c0.q(jSONObject, str, listEmptyList));
                return null;
            } catch (ClassCastException unused) {
                fVarU = c0.U(jSONObject, str, listEmptyList);
            }
        } else {
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                Object objOpt = jSONArrayOptJSONArray.opt(i10);
                if (j0.d(objOpt, JSONObject.NULL)) {
                    objOpt = null;
                }
                if (objOpt != null) {
                    try {
                        try {
                            Object objInvoke = lVar.invoke(objOpt);
                            if (objInvoke != null) {
                                if (mVar.d(objInvoke)) {
                                    arrayList.add(objInvoke);
                                } else {
                                    eVar.b(c0.o(jSONArrayOptJSONArray, str, i10, objInvoke));
                                }
                            }
                        } catch (Exception e10) {
                            fVarT = c0.p(jSONArrayOptJSONArray, str, i10, objOpt, e10);
                            eVar.b(fVarT);
                        }
                    } catch (ClassCastException unused2) {
                        fVarT = c0.T(jSONArrayOptJSONArray, str, i10, objOpt);
                        eVar.b(fVarT);
                    }
                }
            }
            try {
                if (gVar.isValid(arrayList)) {
                    return arrayList;
                }
                eVar.b(c0.q(jSONObject, str, arrayList));
                return null;
            } catch (ClassCastException unused3) {
                fVarU = c0.U(jSONObject, str, arrayList);
            }
        }
        eVar.b(fVarU);
        return null;
    }

    public static <R, T> List<T> v(JSONObject jSONObject, String str, uc.l<R, T> lVar, g<T> gVar, u9.e eVar, u9.c cVar) {
        return u(jSONObject, str, lVar, gVar, f30971a, eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, T> List<T> w(JSONObject jSONObject, String str, p<u9.c, R, T> pVar, g<T> gVar, u9.e eVar, u9.c cVar) {
        u9.f fVarU;
        Object objInvoke;
        m<?> mVar = f30971a;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int length = jSONArrayOptJSONArray.length();
        if (length == 0) {
            List<T> listEmptyList = Collections.emptyList();
            try {
                if (gVar.isValid(listEmptyList)) {
                    return listEmptyList;
                }
                eVar.b(c0.q(jSONObject, str, listEmptyList));
                return null;
            } catch (ClassCastException unused) {
                fVarU = c0.U(jSONObject, str, listEmptyList);
            }
        } else {
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                Object objA = a(jSONArrayOptJSONArray.optJSONObject(i10));
                if (objA != null && (objInvoke = pVar.invoke(cVar, objA)) != null) {
                    try {
                        if (((d1) mVar).d(objInvoke)) {
                            arrayList.add(objInvoke);
                        } else {
                            eVar.b(c0.o(jSONArrayOptJSONArray, str, i10, objInvoke));
                        }
                    } catch (ClassCastException unused2) {
                        eVar.b(c0.T(jSONArrayOptJSONArray, str, i10, objInvoke));
                    }
                }
            }
            try {
                if (gVar.isValid(arrayList)) {
                    return arrayList;
                }
                eVar.b(c0.q(jSONObject, str, arrayList));
                return null;
            } catch (ClassCastException unused3) {
                fVarU = c0.U(jSONObject, str, arrayList);
            }
        }
        eVar.b(fVarU);
        return null;
    }

    public static <T> List<T> x(JSONObject jSONObject, String str, p<u9.c, JSONObject, T> pVar, g<T> gVar, m<T> mVar, u9.e eVar, u9.c cVar) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            throw c0.A(jSONObject, str);
        }
        int length = jSONArrayOptJSONArray.length();
        if (length == 0) {
            List<T> listEmptyList = Collections.emptyList();
            try {
                if (!gVar.isValid(listEmptyList)) {
                    eVar.b(c0.q(jSONObject, str, listEmptyList));
                }
                return listEmptyList;
            } catch (ClassCastException unused) {
                eVar.b(c0.U(jSONObject, str, listEmptyList));
                return listEmptyList;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject2 = (JSONObject) a(jSONArrayOptJSONArray.optJSONObject(i10));
            if (jSONObject2 == null) {
                j0.i(jSONArrayOptJSONArray, "json");
                j0.i(str, Action.KEY_ATTRIBUTE);
                throw new u9.f(u9.g.MISSING_VALUE, "Value at " + i10 + " position of '" + str + "' is missing", null, new k9.b(jSONArrayOptJSONArray), c0.O(jSONArrayOptJSONArray, 0, 1), 4, null);
            }
            try {
                T tInvoke = pVar.invoke(cVar, jSONObject2);
                if (tInvoke == null) {
                    throw c0.o(jSONArrayOptJSONArray, str, i10, jSONObject2);
                }
                try {
                    if (!mVar.d(tInvoke)) {
                        throw c0.o(jSONArrayOptJSONArray, str, i10, jSONObject2);
                    }
                    arrayList.add(tInvoke);
                } catch (ClassCastException unused2) {
                    throw c0.T(jSONArrayOptJSONArray, str, i10, tInvoke);
                }
            } catch (ClassCastException unused3) {
                throw c0.T(jSONArrayOptJSONArray, str, i10, jSONObject2);
            } catch (Exception e10) {
                throw c0.p(jSONArrayOptJSONArray, str, i10, jSONObject2, e10);
            }
        }
        try {
            if (gVar.isValid(arrayList)) {
                return arrayList;
            }
            throw c0.q(jSONObject, str, arrayList);
        } catch (ClassCastException unused4) {
            throw c0.U(jSONObject, str, arrayList);
        }
    }

    public static <T> List<T> y(JSONObject jSONObject, String str, p<u9.c, JSONObject, T> pVar, g<T> gVar, u9.e eVar, u9.c cVar) {
        return x(jSONObject, str, pVar, gVar, f30971a, eVar, cVar);
    }
}
