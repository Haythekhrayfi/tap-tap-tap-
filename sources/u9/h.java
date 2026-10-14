package u9;

import fd.j0;
import h9.i;
import h9.j;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONObject;
import p7.d1;
import u9.b;
import y9.i7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h<T extends u9.b<?>> implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f36174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w9.a<T> f36175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w9.e<T> f36176c;

    public interface a<T> {
    }

    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, T> f36177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, Set<String>> f36178b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Map<String, ? extends T> map, Map<String, ? extends Set<String>> map2) {
            j0.i(map, "parsedTemplates");
            j0.i(map2, "templateDependencies");
            this.f36177a = map;
            this.f36178b = map2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(e eVar) {
        this(eVar, null, 2, null);
        j0.i(eVar, "logger");
    }

    public h(e eVar, w9.a<T> aVar) {
        j0.i(eVar, "logger");
        j0.i(aVar, "mainTemplateProvider");
        this.f36174a = eVar;
        this.f36175b = aVar;
        this.f36176c = aVar;
    }

    public h(e eVar, w9.a aVar, int i10, vc.g gVar) {
        if ((i10 & 2) != 0) {
            w9.b bVar = new w9.b();
            int i11 = w9.e.f37196a;
            aVar = new w9.a(bVar, new w9.c());
        }
        this(eVar, aVar);
    }

    @Override // u9.c
    public e a() {
        return this.f36174a;
    }

    @Override // u9.c
    public w9.e<T> b() {
        return this.f36176c;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void c(JSONObject jSONObject) {
        q.a aVar = new q.a();
        q.a aVar2 = new q.a();
        try {
            Map<String, Set<String>> mapC = h9.f.c(jSONObject, this.f36174a, this);
            w9.a<T> aVar3 = this.f36175b;
            Objects.requireNonNull(aVar3);
            w9.b<T> bVar = aVar3.f37192b;
            Objects.requireNonNull(bVar);
            aVar.putAll(bVar.f37194b);
            w9.d dVar = new w9.d(aVar);
            for (Map.Entry entry : ((LinkedHashMap) mapC).entrySet()) {
                String str = (String) entry.getKey();
                Set set = (Set) entry.getValue();
                try {
                    i iVar = new i(dVar, new j(this.f36174a, str));
                    a<i7> aVar4 = ((w8.a) this).f37164e;
                    JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                    j0.h(jSONObject2, "json.getJSONObject(name)");
                    Objects.requireNonNull((d1) aVar4);
                    aVar.put(str, i7.f40616a.a(iVar, true, jSONObject2));
                    if (!set.isEmpty()) {
                        aVar2.put(str, set);
                    }
                } catch (f e10) {
                    this.f36174a.c(e10, str);
                }
            }
        } catch (Exception e11) {
            this.f36174a.b(e11);
        }
        Map<String, T> map = new b(aVar, aVar2).f36177a;
        w9.a<T> aVar5 = this.f36175b;
        Objects.requireNonNull(aVar5);
        j0.i(map, "parsed");
        for (Map.Entry entry2 : map.entrySet()) {
            w9.b<T> bVar2 = aVar5.f37192b;
            String str2 = (String) entry2.getKey();
            u9.b bVar3 = (u9.b) entry2.getValue();
            Objects.requireNonNull(bVar2);
            j0.i(str2, "templateId");
            j0.i(bVar3, "jsonTemplate");
            bVar2.f37194b.put(str2, (T) bVar3);
        }
    }
}
