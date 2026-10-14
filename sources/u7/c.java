package u7;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import h9.k;
import h9.m;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jc.w;
import p7.i1;
import vc.l;
import w7.h;
import y8.c0;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements v9.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f36038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q8.d f36039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x8.f f36040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, Object> f36041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, Set<String>> f36042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<String, i1<uc.a<w>>> f36043g;

    public static final class a extends l implements uc.l<w8.d, w> {
        public a() {
            super(1);
        }

        @Override // uc.l
        public w invoke(w8.d dVar) {
            w8.d dVar2 = dVar;
            j0.i(dVar2, "v");
            Set<String> set = c.this.f36042f.get(dVar2.a());
            if (set != null) {
                c cVar = c.this;
                for (String str : set) {
                    cVar.f36041e.remove(str);
                    i1<uc.a<w>> i1Var = cVar.f36043g.get(str);
                    if (i1Var != null) {
                        Iterator<uc.a<w>> it = i1Var.iterator();
                        while (true) {
                            i1.b bVar = (i1.b) it;
                            if (bVar.hasNext()) {
                                ((uc.a) bVar.next()).invoke();
                            }
                        }
                    }
                }
            }
            return w.f31842a;
        }
    }

    public c(h hVar, u7.a aVar, q8.d dVar) {
        j0.i(hVar, "variableController");
        j0.i(aVar, "evaluatorFactory");
        j0.i(dVar, "errorCollector");
        this.f36038b = hVar;
        this.f36039c = dVar;
        this.f36040d = new x8.f(new d0.a(this), aVar.f36033a);
        this.f36041e = new LinkedHashMap();
        this.f36042f = new LinkedHashMap();
        this.f36043g = new LinkedHashMap();
        a aVar2 = new a();
        int i10 = e9.a.f29114a;
        hVar.f37157d = aVar2;
    }

    @Override // v9.d
    public void a(u9.f fVar) {
        j0.i(fVar, "e");
        this.f36039c.a(fVar);
    }

    @Override // v9.d
    public <R, T> T b(String str, String str2, x8.a aVar, uc.l<? super R, ? extends T> lVar, m<T> mVar, k<T> kVar, u9.e eVar) {
        j0.i(str, "expressionKey");
        j0.i(str2, "rawExpression");
        j0.i(mVar, "validator");
        j0.i(kVar, "fieldType");
        j0.i(eVar, "logger");
        try {
            return (T) e(str, str2, aVar, lVar, mVar, kVar);
        } catch (u9.f e10) {
            if (e10.f36171c == u9.g.MISSING_VARIABLE) {
                throw e10;
            }
            eVar.b(e10);
            this.f36039c.a(e10);
            return (T) e(str, str2, aVar, lVar, mVar, kVar);
        }
    }

    @Override // v9.d
    public p7.d c(String str, List<String> list, uc.a<w> aVar) {
        j0.i(str, "rawExpression");
        for (String str2 : list) {
            Map<String, Set<String>> map = this.f36042f;
            Set<String> linkedHashSet = map.get(str2);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>();
                map.put(str2, linkedHashSet);
            }
            linkedHashSet.add(str);
        }
        Map<String, i1<uc.a<w>>> map2 = this.f36043g;
        i1<uc.a<w>> i1Var = map2.get(str);
        if (i1Var == null) {
            i1Var = new i1<>();
            map2.put(str, i1Var);
        }
        i1Var.b(aVar);
        return new b(this, str, aVar);
    }

    public final <R> R d(String str, x8.a aVar) {
        Object obj = this.f36041e.get(str);
        if (obj == null) {
            obj = (R) null;
        }
        if (obj == null) {
            obj = (R) this.f36040d.a(aVar);
            if (aVar.f37521b) {
                for (String str2 : aVar.c()) {
                    Map<String, Set<String>> map = this.f36042f;
                    Set<String> linkedHashSet = map.get(str2);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet<>();
                        map.put(str2, linkedHashSet);
                    }
                    linkedHashSet.add(str);
                }
                this.f36041e.put(str, obj);
            }
        }
        return (R) obj;
    }

    public final <R, T> T e(String str, String str2, x8.a aVar, uc.l<? super R, ? extends T> lVar, m<T> mVar, k<T> kVar) {
        T tInvoke;
        try {
            Object obj = (Object) d(str2, aVar);
            if (!kVar.b(obj)) {
                if (lVar == null) {
                    tInvoke = (T) obj;
                } else {
                    try {
                        tInvoke = lVar.invoke(obj);
                    } catch (ClassCastException e10) {
                        throw c0.S(str, str2, obj, e10);
                    } catch (Exception e11) {
                        u9.g gVar = u9.g.INVALID_VALUE;
                        StringBuilder sbA = q2.a.a("Field '", str, "' with expression '", str2, "' received wrong value: '");
                        sbA.append(obj);
                        sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
                        throw new u9.f(gVar, sbA.toString(), e11, null, null, 24, null);
                    }
                }
                boolean z10 = false;
                if (tInvoke != null && (kVar.a() instanceof String) && !kVar.b(tInvoke)) {
                    z10 = true;
                }
                if (z10) {
                    tInvoke = String.valueOf(tInvoke);
                }
                if (tInvoke == null) {
                    u9.g gVar2 = u9.g.INVALID_VALUE;
                    StringBuilder sbA2 = defpackage.a.a("Value '");
                    sbA2.append(c0.R(obj));
                    sbA2.append("' for key '");
                    sbA2.append(str);
                    sbA2.append("' at path '");
                    sbA2.append(str2);
                    sbA2.append("' is not valid");
                    throw new u9.f(gVar2, sbA2.toString(), null, null, null, 28, null);
                }
                obj = (T) tInvoke;
            }
            try {
                if (mVar.d(obj)) {
                    return (T) obj;
                }
                throw c0.n(str2, obj);
            } catch (ClassCastException e12) {
                throw c0.S(str, str2, obj, e12);
            }
        } catch (x8.b e13) {
            String str3 = e13 instanceof x8.l ? ((x8.l) e13).f37574c : null;
            if (str3 != null) {
                throw new u9.f(u9.g.MISSING_VARIABLE, s.a.a(q2.a.a("Undefined variable '", str3, "' at \"", str, "\": \""), str2, CoreConstants.DOUBLE_QUOTE_CHAR), e13, null, null, 24, null);
            }
            throw c0.G(str, str2, e13);
        }
    }
}
