package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface Ma<T> {

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap<Class<?>, Ma<?>> f14479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Ma<Ri> f14480b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Ma<C1785lg.e> f14481c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Ma<List<C1709ie>> f14482d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Ma<C1509ae> f14483e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Ma<Eh> f14484f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Deprecated
        private final Ma<Le> f14485g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Deprecated
        private final Ma<C1970t2> f14486h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Ma<Be> f14487i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final Ma<C1921r3> f14488j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final Ma<P3> f14489k;

        public class a extends Na<P3> {
            public a(b bVar) {
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public Q9<P3> a(Context context, InterfaceC2106y8 interfaceC2106y8) {
                return new Q9<>("clids_info", interfaceC2106y8, new La(new C1593dn(context)).c(), new C1580da());
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC2106y8 c(Context context) {
                return Qa.a(context).n();
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC2106y8 d(Context context) {
                return Qa.a(context).o();
            }
        }

        /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.Ma$b$b, reason: collision with other inner class name */
        public class C0175b extends Na<Ri> {
            public C0175b(b bVar) {
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public Q9<Ri> a(Context context, InterfaceC2106y8 interfaceC2106y8) {
                return new Q9<>("startup_state", interfaceC2106y8, new La(new C1593dn(context)).i(), new Ea());
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC2106y8 c(Context context) {
                return Qa.a(context).n();
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC2106y8 d(Context context) {
                return Qa.a(context).o();
            }
        }

        public class c extends Na<C1785lg.e> {
            public c(b bVar) {
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public Q9<C1785lg.e> a(Context context, InterfaceC2106y8 interfaceC2106y8) {
                return new Q9<>("provided_request_state", interfaceC2106y8, new La(new C1593dn(context)).g(), new C2108ya());
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC2106y8 c(Context context) {
                return Qa.a(context).n();
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC2106y8 d(Context context) {
                return Qa.a(context).o();
            }
        }

        public class d extends Na<List<C1709ie>> {
            public d(b bVar) {
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public Q9<List<C1709ie>> a(Context context, InterfaceC2106y8 interfaceC2106y8) {
                return new Q9<>("permission_list", interfaceC2106y8, new La(new C1593dn(context)).d(), new C2058wa());
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC2106y8 c(Context context) {
                return Qa.a(context).n();
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC2106y8 d(Context context) {
                return Qa.a(context).o();
            }
        }

        public class e extends Na<C1509ae> {
            public e(b bVar) {
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public Q9<C1509ae> a(Context context, InterfaceC2106y8 interfaceC2106y8) {
                return new Q9<>("app_permissions_state", interfaceC2106y8, new La(new C1593dn(context)).a(), new X9());
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC2106y8 c(Context context) {
                return Qa.a(context).n();
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC2106y8 d(Context context) {
                return Qa.a(context).o();
            }
        }

        public class f extends Na<Eh> {
            public f(b bVar) {
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public Q9<Eh> a(Context context, InterfaceC2106y8 interfaceC2106y8) {
                return new Q9<>("sdk_fingerprinting", interfaceC2106y8, new La(new C1593dn(context)).h(), new Ca());
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC2106y8 c(Context context) {
                return Qa.a(context).n();
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC2106y8 d(Context context) {
                return Qa.a(context).o();
            }
        }

        public class g extends Na<Le> {
            public g(b bVar) {
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public Q9<Le> a(Context context, InterfaceC2106y8 interfaceC2106y8) {
                return new Q9<>("preload_info", interfaceC2106y8, new La(new C1593dn(context)).f(), new Me());
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC2106y8 c(Context context) {
                return Qa.a(context).n();
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC2106y8 d(Context context) {
                return Qa.a(context).o();
            }
        }

        public class h extends Na<C1970t2> {
            public h(b bVar) {
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public Q9<C1970t2> a(Context context, InterfaceC2106y8 interfaceC2106y8) {
                return new Q9<>("satellite_clids_info", interfaceC2106y8, new S9(), new Aa());
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC2106y8 c(Context context) {
                return Qa.a(context).n();
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC2106y8 d(Context context) {
                return Qa.a(context).o();
            }
        }

        public class i extends Na<Be> {
            public i(b bVar) {
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public Q9<Be> a(Context context, InterfaceC2106y8 interfaceC2106y8) {
                return new Q9<>("preload_info_data", interfaceC2106y8, new La(new C1593dn(context)).e(), new De());
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC2106y8 c(Context context) {
                return Qa.a(context).n();
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC2106y8 d(Context context) {
                return Qa.a(context).o();
            }
        }

        public class j extends Na<C1921r3> {
            public j(b bVar) {
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public Q9<C1921r3> a(Context context, InterfaceC2106y8 interfaceC2106y8) {
                return new Q9<>("auto_inapp_collecting_info_data", interfaceC2106y8, new La(new C1593dn(context)).b(), new C1946s3());
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC2106y8 c(Context context) {
                return Qa.a(context).a();
            }

            @Override // com.yandex.metrica.impl.ob.Na
            public InterfaceC2106y8 d(Context context) {
                return Qa.a(context).b();
            }
        }

        public static final class k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f14490a = new b();
        }

        private b() {
            HashMap<Class<?>, Ma<?>> map = new HashMap<>();
            this.f14479a = map;
            C0175b c0175b = new C0175b(this);
            this.f14480b = c0175b;
            c cVar = new c(this);
            this.f14481c = cVar;
            d dVar = new d(this);
            this.f14482d = dVar;
            e eVar = new e(this);
            this.f14483e = eVar;
            f fVar = new f(this);
            this.f14484f = fVar;
            g gVar = new g(this);
            this.f14485g = gVar;
            h hVar = new h(this);
            this.f14486h = hVar;
            i iVar = new i(this);
            this.f14487i = iVar;
            j jVar = new j(this);
            this.f14488j = jVar;
            a aVar = new a(this);
            this.f14489k = aVar;
            map.put(Ri.class, c0175b);
            map.put(C1785lg.e.class, cVar);
            map.put(C1709ie.class, dVar);
            map.put(C1509ae.class, eVar);
            map.put(Eh.class, fVar);
            map.put(Le.class, gVar);
            map.put(C1970t2.class, hVar);
            map.put(Be.class, iVar);
            map.put(C1921r3.class, jVar);
            map.put(P3.class, aVar);
        }

        public static <T> Ma<T> a(Class<T> cls) {
            return (Ma) k.f14490a.f14479a.get(cls);
        }

        public static <T> Ma<Collection<T>> b(Class<T> cls) {
            return (Ma) k.f14490a.f14479a.get(cls);
        }
    }

    Q9<T> a(Context context);

    Q9<T> b(Context context);
}
