package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.impl.interact.CellularNetworkInfo;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.sg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1959sg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1984tg f17309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f17310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1810mg f17311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final uo<Context> f17312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final uo<String> f17313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Pm f17314f;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.sg$a */
    public class a extends Km {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f17315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IIdentifierCallback f17316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f17317c;

        public a(Context context, IIdentifierCallback iIdentifierCallback, List list) {
            this.f17315a = context;
            this.f17316b = iIdentifierCallback;
            this.f17317c = list;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() throws Exception {
            C1984tg c1984tg = C1959sg.this.f17309a;
            Context context = this.f17315a;
            Objects.requireNonNull(c1984tg);
            C1772l3.a(context).a(this.f17316b, this.f17317c);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.sg$b */
    public class b extends Jm<String> {
        public b() {
        }

        @Override // com.yandex.metrica.impl.ob.Jm
        public String a() throws Exception {
            Objects.requireNonNull(C1959sg.this.f17309a);
            C1772l3 c1772l3K = C1772l3.k();
            if (c1772l3K == null) {
                return null;
            }
            return c1772l3K.e().a();
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.sg$c */
    public class c extends Jm<Boolean> {
        public c() {
        }

        @Override // com.yandex.metrica.impl.ob.Jm
        public Boolean a() throws Exception {
            Objects.requireNonNull(C1959sg.this.f17309a);
            C1772l3 c1772l3K = C1772l3.k();
            if (c1772l3K == null) {
                return null;
            }
            return c1772l3K.e().b();
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.sg$d */
    public class d extends Km {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f17321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f17322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f17323c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Map f17324d;

        public d(int i10, String str, String str2, Map map) {
            this.f17321a = i10;
            this.f17322b = str;
            this.f17323c = str2;
            this.f17324d = map;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() throws Exception {
            C1959sg.b(C1959sg.this).a(this.f17321a, this.f17322b, this.f17323c, this.f17324d);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.sg$e */
    public class e extends Km {
        public e() {
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() throws Exception {
            C1959sg.b(C1959sg.this).sendEventsBuffer();
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.sg$f */
    public class f extends Km {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f17327a;

        public f(boolean z10) {
            this.f17327a = z10;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() throws Exception {
            C1984tg c1984tg = C1959sg.this.f17309a;
            boolean z10 = this.f17327a;
            Objects.requireNonNull(c1984tg);
            C1772l3.b(z10);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.sg$g */
    public class g extends Km {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.yandex.metrica.p.Ucc f17329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f17330b;

        /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.sg$g$a */
        public class a implements Ol {
            public a() {
            }

            @Override // com.yandex.metrica.impl.ob.Ol
            public void onError(String str) {
                g.this.f17329a.onError(str);
            }

            @Override // com.yandex.metrica.impl.ob.Ol
            public void onResult(JSONObject jSONObject) {
                g.this.f17329a.onResult(jSONObject);
            }
        }

        public g(com.yandex.metrica.p.Ucc ucc, boolean z10) {
            this.f17329a = ucc;
            this.f17330b = z10;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() throws Exception {
            C1959sg.b(C1959sg.this).a(new a(), this.f17330b);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.sg$h */
    public class h extends Km {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f17333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f17334b;

        public h(Context context, Map map) {
            this.f17333a = context;
            this.f17334b = map;
        }

        @Override // com.yandex.metrica.impl.ob.Km
        public void a() throws Exception {
            C1984tg c1984tg = C1959sg.this.f17309a;
            Context context = this.f17333a;
            Objects.requireNonNull(c1984tg);
            C1772l3.a(context).a(this.f17334b);
        }
    }

    public C1959sg(InterfaceExecutorC1966sn interfaceExecutorC1966sn, C1984tg c1984tg) {
        this(interfaceExecutorC1966sn, c1984tg, new C1810mg(c1984tg), new ro(new qo("Context")), new ro(new qo("Event name")), new Pm());
    }

    public C1959sg(InterfaceExecutorC1966sn interfaceExecutorC1966sn, C1984tg c1984tg, C1810mg c1810mg, uo<Context> uoVar, uo<String> uoVar2, Pm pm) {
        this.f17309a = c1984tg;
        this.f17310b = interfaceExecutorC1966sn;
        this.f17311c = c1810mg;
        this.f17312d = uoVar;
        this.f17313e = uoVar2;
        this.f17314f = pm;
    }

    public static U0 b(C1959sg c1959sg) {
        Objects.requireNonNull(c1959sg.f17309a);
        return C1772l3.k().d().b();
    }

    public String a(Context context) {
        this.f17312d.a(context);
        return this.f17314f.a(context) ? new CellularNetworkInfo(context).getCelluralInfo() : "";
    }

    public void a(int i10, String str, String str2, Map<String, String> map) {
        this.f17311c.a(null);
        this.f17313e.a(str);
        ((C1941rn) this.f17310b).execute(new d(i10, str, str2, map));
    }

    public void a(Context context, IIdentifierCallback iIdentifierCallback, List<String> list) {
        this.f17312d.a(context);
        ((C1941rn) this.f17310b).execute(new a(context, iIdentifierCallback, list));
    }

    public void a(Context context, Map<String, Object> map) {
        this.f17312d.a(context);
        ((C1941rn) this.f17310b).execute(new h(context, map));
    }

    public void a(Context context, boolean z10) {
        this.f17312d.a(context);
        ((C1941rn) this.f17310b).execute(new f(z10));
    }

    public void a(com.yandex.metrica.p.Ucc ucc, boolean z10) {
        Objects.requireNonNull(this.f17309a);
        if (!C1772l3.i()) {
            ucc.onError("Main API key is not activated");
            return;
        }
        ((C1941rn) this.f17310b).execute(new g(ucc, z10));
    }

    public boolean a() {
        Objects.requireNonNull(this.f17309a);
        return C1772l3.h();
    }

    public String b(Context context) {
        this.f17312d.a(context);
        Objects.requireNonNull(this.f17309a);
        return C1772l3.a(context).c();
    }

    public Future<String> b() {
        return ((C1941rn) this.f17310b).a(new b());
    }

    public String c(Context context) {
        this.f17312d.a(context);
        return context.getPackageName();
    }

    public Future<Boolean> c() {
        return ((C1941rn) this.f17310b).a(new c());
    }

    public String d(Context context) {
        this.f17312d.a(context);
        Objects.requireNonNull(this.f17309a);
        return C1772l3.a(context).a();
    }

    public void d() {
        this.f17311c.a(null);
        ((C1941rn) this.f17310b).execute(new e());
    }
}
