package vc;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cd.c<Object>, d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f36995d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map<Class<? extends jc.b<?>>, Integer> f36996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap<String, String> f36997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Map<String, String> f36998g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class<?> f36999c;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i10 = 0;
        List listC = kc.l.c(uc.a.class, uc.l.class, uc.p.class, uc.q.class, uc.r.class, uc.s.class, uc.t.class, uc.u.class, uc.v.class, uc.w.class, uc.b.class, uc.c.class, uc.d.class, uc.e.class, uc.f.class, uc.g.class, uc.h.class, uc.i.class, uc.j.class, uc.k.class, uc.m.class, uc.n.class, uc.o.class);
        ArrayList arrayList = new ArrayList(kc.m.j(listC, 10));
        for (Object obj : listC) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kc.l.i();
                throw null;
            }
            arrayList.add(new jc.h((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f36996e = kc.f0.i(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        j0.h(collectionValues, "primitiveFqNames.values");
        for (String str : collectionValues) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            j0.h(str, "kotlinName");
            sb2.append(ed.u.V(str, CoreConstants.DOT, null, 2));
            sb2.append("CompanionObject");
            jc.h hVar = new jc.h(sb2.toString(), i.f.a(str, ".Companion"));
            map3.put(hVar.f31811c, hVar.f31812d);
        }
        for (Map.Entry<Class<? extends jc.b<?>>, Integer> entry : f36996e.entrySet()) {
            map3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f36997f = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kc.e0.a(map3.size()));
        Iterator it = map3.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            linkedHashMap.put(entry2.getKey(), ed.u.V((String) entry2.getValue(), CoreConstants.DOT, null, 2));
        }
        f36998g = linkedHashMap;
    }

    public e(Class<?> cls) {
        j0.i(cls, "jClass");
        this.f36999c = cls;
    }

    @Override // vc.d
    public Class<?> a() {
        return this.f36999c;
    }

    public String b() {
        String str;
        a aVar = f36995d;
        Class<?> cls = this.f36999c;
        Objects.requireNonNull(aVar);
        j0.i(cls, "jClass");
        String strA = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String str2 = f36997f.get(cls.getName());
            return str2 == null ? cls.getCanonicalName() : str2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (str = f36997f.get(componentType.getName())) != null) {
            strA = i.f.a(str, "Array");
        }
        return strA == null ? "kotlin.Array" : strA;
    }

    public String d() {
        StringBuilder sb2;
        String name;
        a aVar = f36995d;
        Class<?> cls = this.f36999c;
        Objects.requireNonNull(aVar);
        j0.i(cls, "jClass");
        String strA = null;
        if (!cls.isAnonymousClass()) {
            if (cls.isLocalClass()) {
                String simpleName = cls.getSimpleName();
                Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod != null) {
                    sb2 = new StringBuilder();
                    name = enclosingMethod.getName();
                } else {
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    if (enclosingConstructor == null) {
                        j0.i(simpleName, "<this>");
                        j0.i(simpleName, "missingDelimiterValue");
                        int iD = ed.u.D(simpleName, CoreConstants.DOLLAR, 0, false, 6);
                        if (iD == -1) {
                            return simpleName;
                        }
                        String strSubstring = simpleName.substring(iD + 1, simpleName.length());
                        j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        return strSubstring;
                    }
                    sb2 = new StringBuilder();
                    name = enclosingConstructor.getName();
                }
                return ed.u.U(simpleName, s.a.a(sb2, name, CoreConstants.DOLLAR), null, 2);
            }
            if (!cls.isArray()) {
                String str = (String) ((LinkedHashMap) f36998g).get(cls.getName());
                return str == null ? cls.getSimpleName() : str;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive()) {
                String str2 = (String) ((LinkedHashMap) f36998g).get(componentType.getName());
                if (str2 != null) {
                    strA = i.f.a(str2, "Array");
                }
            }
            if (strA == null) {
                return "Array";
            }
        }
        return strA;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && j0.d(h9.d.j(this), h9.d.j((cd.c) obj));
    }

    public int hashCode() {
        return h9.d.j(this).hashCode();
    }

    public String toString() {
        return this.f36999c.toString() + " (Kotlin reflection is not available)";
    }
}
