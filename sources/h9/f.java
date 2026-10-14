package h9;

import android.annotation.SuppressLint;
import ch.qos.logback.core.joran.action.Action;
import fd.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kc.t;
import kc.w;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p7.d1;
import y8.c0;

/* JADX INFO: loaded from: classes2.dex */
public final class f {
    public static final void a(String str, Map<String, List<String>> map, Set<String> set, Set<String> set2, LinkedHashMap<String, Set<String>> linkedHashMap) throws a {
        List list;
        if (set.contains(str)) {
            List listH = t.H(set);
            StringBuilder sb2 = new StringBuilder();
            int size = listH.size();
            for (int iIndexOf = listH.indexOf(str); iIndexOf < size; iIndexOf++) {
                sb2.append((String) listH.get(iIndexOf));
                sb2.append(" -> ");
            }
            sb2.append(str);
            String string = sb2.toString();
            j0.h(string, "output.toString()");
            throw new a(string);
        }
        if (set2.contains(str)) {
            return;
        }
        List<String> list2 = map.get(str);
        if (list2 == null) {
            list = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (map.containsKey((String) obj)) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        if (!(list == null || list.isEmpty())) {
            set.add(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a((String) it.next(), map, set, set2, linkedHashMap);
            }
            set.remove(str);
        }
        set2.add(str);
        if (list == null) {
            list = w.f32009c;
        }
        linkedHashMap.put(str, t.L(list));
    }

    public static final void b(JSONObject jSONObject, boolean z10, List<String> list, u9.e eVar, u9.c cVar) throws JSONException {
        String str;
        if (z10) {
            str = (String) d.n(jSONObject, "type", i5.a.f31263s, eVar, cVar);
        } else {
            d1 d1Var = d1.f34488l;
            j0.i(jSONObject, "<this>");
            j0.i("type", Action.KEY_ATTRIBUTE);
            j0.i(d1Var, "validator");
            j0.i(eVar, "logger");
            j0.i(cVar, "env");
            Object objL = d.l(jSONObject, "type");
            Object obj = null;
            if (objL != null) {
                if (!d1Var.d(objL)) {
                    eVar.b(c0.q(jSONObject, "type", objL));
                    objL = null;
                }
                obj = objL;
            }
            str = (String) obj;
        }
        if (str != null) {
            list.add(str);
        }
        Iterator<String> itKeys = jSONObject.keys();
        j0.h(itKeys, "keys");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj2 = jSONObject.get(next);
            if (obj2 instanceof JSONObject) {
                j0.h(next, Action.KEY_ATTRIBUTE);
                b((JSONObject) obj2, false, list, eVar, cVar);
            }
        }
        Iterator<String> itKeys2 = jSONObject.keys();
        j0.h(itKeys2, "keys");
        while (itKeys2.hasNext()) {
            String next2 = itKeys2.next();
            Object obj3 = jSONObject.get(next2);
            if (obj3 instanceof JSONArray) {
                j0.h(next2, Action.KEY_ATTRIBUTE);
                JSONArray jSONArray = (JSONArray) obj3;
                int length = jSONArray.length();
                int i10 = 0;
                while (i10 < length) {
                    int i11 = i10 + 1;
                    Object obj4 = jSONArray.get(i10);
                    if (obj4 instanceof JSONObject) {
                        b((JSONObject) obj4, false, list, eVar, cVar);
                    }
                    i10 = i11;
                }
            }
        }
    }

    @SuppressLint({"NewApi"})
    public static final Map<String, Set<String>> c(JSONObject jSONObject, u9.e eVar, u9.c cVar) throws JSONException, a, u9.f {
        j0.i(eVar, "logger");
        LinkedHashMap linkedHashMap = new LinkedHashMap(jSONObject.length());
        Iterator<String> itKeys = jSONObject.keys();
        j0.h(itKeys, "keys");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                j0.h(next, Action.KEY_ATTRIBUTE);
                ArrayList arrayList = new ArrayList();
                b((JSONObject) obj, true, arrayList, new j(eVar, next), cVar);
                linkedHashMap.put(next, arrayList);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            a((String) it.next(), linkedHashMap, linkedHashSet, linkedHashSet2, linkedHashMap2);
        }
        return linkedHashMap2;
    }
}
