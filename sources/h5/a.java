package h5;

import ch.qos.logback.core.joran.action.Action;
import com.applovin.sdk.AppLovinEventTypes;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r5.a f30593a = new a();

    /* JADX INFO: renamed from: h5.a$a, reason: collision with other inner class name */
    public static final class C0284a implements q5.e<a0.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0284a f30594a = new C0284a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q5.d f30595b = q5.d.a("pid");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q5.d f30596c = q5.d.a("processName");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final q5.d f30597d = q5.d.a("reasonCode");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final q5.d f30598e = q5.d.a("importance");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final q5.d f30599f = q5.d.a("pss");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final q5.d f30600g = q5.d.a("rss");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final q5.d f30601h = q5.d.a("timestamp");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final q5.d f30602i = q5.d.a("traceFile");

        @Override // q5.b
        public void encode(Object obj, q5.f fVar) throws IOException {
            a0.a aVar = (a0.a) obj;
            q5.f fVar2 = fVar;
            fVar2.b(f30595b, aVar.b());
            fVar2.a(f30596c, aVar.c());
            fVar2.b(f30597d, aVar.e());
            fVar2.b(f30598e, aVar.a());
            fVar2.c(f30599f, aVar.d());
            fVar2.c(f30600g, aVar.f());
            fVar2.c(f30601h, aVar.g());
            fVar2.a(f30602i, aVar.h());
        }
    }

    public static final class b implements q5.e<a0.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f30603a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q5.d f30604b = q5.d.a(Action.KEY_ATTRIBUTE);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q5.d f30605c = q5.d.a("value");

        @Override // q5.b
        public void encode(Object obj, q5.f fVar) throws IOException {
            a0.c cVar = (a0.c) obj;
            q5.f fVar2 = fVar;
            fVar2.a(f30604b, cVar.a());
            fVar2.a(f30605c, cVar.b());
        }
    }

    public static final class c implements q5.e<a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f30606a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q5.d f30607b = q5.d.a("sdkVersion");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q5.d f30608c = q5.d.a("gmpAppId");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final q5.d f30609d = q5.d.a("platform");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final q5.d f30610e = q5.d.a("installationUuid");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final q5.d f30611f = q5.d.a("buildVersion");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final q5.d f30612g = q5.d.a("displayVersion");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final q5.d f30613h = q5.d.a("session");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final q5.d f30614i = q5.d.a("ndkPayload");

        @Override // q5.b
        public void encode(Object obj, q5.f fVar) throws IOException {
            a0 a0Var = (a0) obj;
            q5.f fVar2 = fVar;
            fVar2.a(f30607b, a0Var.g());
            fVar2.a(f30608c, a0Var.c());
            fVar2.b(f30609d, a0Var.f());
            fVar2.a(f30610e, a0Var.d());
            fVar2.a(f30611f, a0Var.a());
            fVar2.a(f30612g, a0Var.b());
            fVar2.a(f30613h, a0Var.h());
            fVar2.a(f30614i, a0Var.e());
        }
    }

    public static final class d implements q5.e<a0.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f30615a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q5.d f30616b = q5.d.a("files");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q5.d f30617c = q5.d.a("orgId");

        @Override // q5.b
        public void encode(Object obj, q5.f fVar) throws IOException {
            a0.d dVar = (a0.d) obj;
            q5.f fVar2 = fVar;
            fVar2.a(f30616b, dVar.a());
            fVar2.a(f30617c, dVar.b());
        }
    }

    public static final class e implements q5.e<a0.d.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f30618a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q5.d f30619b = q5.d.a("filename");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q5.d f30620c = q5.d.a("contents");

        @Override // q5.b
        public void encode(Object obj, q5.f fVar) throws IOException {
            a0.d.b bVar = (a0.d.b) obj;
            q5.f fVar2 = fVar;
            fVar2.a(f30619b, bVar.b());
            fVar2.a(f30620c, bVar.a());
        }
    }

    public static final class f implements q5.e<a0.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f30621a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q5.d f30622b = q5.d.a("identifier");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q5.d f30623c = q5.d.a("version");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final q5.d f30624d = q5.d.a("displayVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final q5.d f30625e = q5.d.a("organization");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final q5.d f30626f = q5.d.a("installationUuid");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final q5.d f30627g = q5.d.a("developmentPlatform");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final q5.d f30628h = q5.d.a("developmentPlatformVersion");

        @Override // q5.b
        public void encode(Object obj, q5.f fVar) throws IOException {
            a0.e.a aVar = (a0.e.a) obj;
            q5.f fVar2 = fVar;
            fVar2.a(f30622b, aVar.d());
            fVar2.a(f30623c, aVar.g());
            fVar2.a(f30624d, aVar.c());
            fVar2.a(f30625e, aVar.f());
            fVar2.a(f30626f, aVar.e());
            fVar2.a(f30627g, aVar.a());
            fVar2.a(f30628h, aVar.b());
        }
    }

    public static final class g implements q5.e<a0.e.a.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f30629a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q5.d f30630b = q5.d.a("clsId");

        @Override // q5.b
        public void encode(Object obj, q5.f fVar) throws IOException {
            fVar.a(f30630b, ((a0.e.a.b) obj).a());
        }
    }

    public static final class h implements q5.e<a0.e.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f30631a = new h();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q5.d f30632b = q5.d.a("arch");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q5.d f30633c = q5.d.a("model");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final q5.d f30634d = q5.d.a("cores");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final q5.d f30635e = q5.d.a("ram");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final q5.d f30636f = q5.d.a("diskSpace");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final q5.d f30637g = q5.d.a("simulator");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final q5.d f30638h = q5.d.a("state");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final q5.d f30639i = q5.d.a("manufacturer");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final q5.d f30640j = q5.d.a("modelClass");

        @Override // q5.b
        public void encode(Object obj, q5.f fVar) throws IOException {
            a0.e.c cVar = (a0.e.c) obj;
            q5.f fVar2 = fVar;
            fVar2.b(f30632b, cVar.a());
            fVar2.a(f30633c, cVar.e());
            fVar2.b(f30634d, cVar.b());
            fVar2.c(f30635e, cVar.g());
            fVar2.c(f30636f, cVar.c());
            fVar2.d(f30637g, cVar.i());
            fVar2.b(f30638h, cVar.h());
            fVar2.a(f30639i, cVar.d());
            fVar2.a(f30640j, cVar.f());
        }
    }

    public static final class i implements q5.e<a0.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f30641a = new i();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q5.d f30642b = q5.d.a("generator");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q5.d f30643c = q5.d.a("identifier");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final q5.d f30644d = q5.d.a("startedAt");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final q5.d f30645e = q5.d.a("endedAt");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final q5.d f30646f = q5.d.a("crashed");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final q5.d f30647g = q5.d.a("app");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final q5.d f30648h = q5.d.a("user");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final q5.d f30649i = q5.d.a("os");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final q5.d f30650j = q5.d.a("device");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final q5.d f30651k = q5.d.a("events");

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final q5.d f30652l = q5.d.a("generatorType");

        @Override // q5.b
        public void encode(Object obj, q5.f fVar) throws IOException {
            a0.e eVar = (a0.e) obj;
            q5.f fVar2 = fVar;
            fVar2.a(f30642b, eVar.e());
            fVar2.a(f30643c, eVar.g().getBytes(a0.f30712a));
            fVar2.c(f30644d, eVar.i());
            fVar2.a(f30645e, eVar.c());
            fVar2.d(f30646f, eVar.k());
            fVar2.a(f30647g, eVar.a());
            fVar2.a(f30648h, eVar.j());
            fVar2.a(f30649i, eVar.h());
            fVar2.a(f30650j, eVar.b());
            fVar2.a(f30651k, eVar.d());
            fVar2.b(f30652l, eVar.f());
        }
    }

    public static final class j implements q5.e<a0.e.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f30653a = new j();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q5.d f30654b = q5.d.a("execution");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q5.d f30655c = q5.d.a("customAttributes");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final q5.d f30656d = q5.d.a("internalKeys");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final q5.d f30657e = q5.d.a("background");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final q5.d f30658f = q5.d.a("uiOrientation");

        @Override // q5.b
        public void encode(Object obj, q5.f fVar) throws IOException {
            a0.e.d.a aVar = (a0.e.d.a) obj;
            q5.f fVar2 = fVar;
            fVar2.a(f30654b, aVar.c());
            fVar2.a(f30655c, aVar.b());
            fVar2.a(f30656d, aVar.d());
            fVar2.a(f30657e, aVar.a());
            fVar2.b(f30658f, aVar.e());
        }
    }

    public static final class k implements q5.e<a0.e.d.a.b.AbstractC0288a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f30659a = new k();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q5.d f30660b = q5.d.a("baseAddress");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q5.d f30661c = q5.d.a("size");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final q5.d f30662d = q5.d.a("name");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final q5.d f30663e = q5.d.a("uuid");

        @Override // q5.b
        public void encode(Object obj, q5.f fVar) throws IOException {
            a0.e.d.a.b.AbstractC0288a abstractC0288a = (a0.e.d.a.b.AbstractC0288a) obj;
            q5.f fVar2 = fVar;
            fVar2.c(f30660b, abstractC0288a.a());
            fVar2.c(f30661c, abstractC0288a.c());
            fVar2.a(f30662d, abstractC0288a.b());
            q5.d dVar = f30663e;
            String strD = abstractC0288a.d();
            fVar2.a(dVar, strD != null ? strD.getBytes(a0.f30712a) : null);
        }
    }

    public static final class l implements q5.e<a0.e.d.a.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f30664a = new l();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q5.d f30665b = q5.d.a("threads");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q5.d f30666c = q5.d.a("exception");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final q5.d f30667d = q5.d.a("appExitInfo");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final q5.d f30668e = q5.d.a("signal");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final q5.d f30669f = q5.d.a("binaries");

        @Override // q5.b
        public void encode(Object obj, q5.f fVar) throws IOException {
            a0.e.d.a.b bVar = (a0.e.d.a.b) obj;
            q5.f fVar2 = fVar;
            fVar2.a(f30665b, bVar.e());
            fVar2.a(f30666c, bVar.c());
            fVar2.a(f30667d, bVar.a());
            fVar2.a(f30668e, bVar.d());
            fVar2.a(f30669f, bVar.b());
        }
    }

    public static final class m implements q5.e<a0.e.d.a.b.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f30670a = new m();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q5.d f30671b = q5.d.a("type");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q5.d f30672c = q5.d.a("reason");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final q5.d f30673d = q5.d.a("frames");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final q5.d f30674e = q5.d.a("causedBy");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final q5.d f30675f = q5.d.a("overflowCount");

        @Override // q5.b
        public void encode(Object obj, q5.f fVar) throws IOException {
            a0.e.d.a.b.c cVar = (a0.e.d.a.b.c) obj;
            q5.f fVar2 = fVar;
            fVar2.a(f30671b, cVar.e());
            fVar2.a(f30672c, cVar.d());
            fVar2.a(f30673d, cVar.b());
            fVar2.a(f30674e, cVar.a());
            fVar2.b(f30675f, cVar.c());
        }
    }

    public static final class n implements q5.e<a0.e.d.a.b.AbstractC0292d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f30676a = new n();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q5.d f30677b = q5.d.a("name");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q5.d f30678c = q5.d.a("code");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final q5.d f30679d = q5.d.a("address");

        @Override // q5.b
        public void encode(Object obj, q5.f fVar) throws IOException {
            a0.e.d.a.b.AbstractC0292d abstractC0292d = (a0.e.d.a.b.AbstractC0292d) obj;
            q5.f fVar2 = fVar;
            fVar2.a(f30677b, abstractC0292d.c());
            fVar2.a(f30678c, abstractC0292d.b());
            fVar2.c(f30679d, abstractC0292d.a());
        }
    }

    public static final class o implements q5.e<a0.e.d.a.b.AbstractC0294e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f30680a = new o();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q5.d f30681b = q5.d.a("name");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q5.d f30682c = q5.d.a("importance");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final q5.d f30683d = q5.d.a("frames");

        @Override // q5.b
        public void encode(Object obj, q5.f fVar) throws IOException {
            a0.e.d.a.b.AbstractC0294e abstractC0294e = (a0.e.d.a.b.AbstractC0294e) obj;
            q5.f fVar2 = fVar;
            fVar2.a(f30681b, abstractC0294e.c());
            fVar2.b(f30682c, abstractC0294e.b());
            fVar2.a(f30683d, abstractC0294e.a());
        }
    }

    public static final class p implements q5.e<a0.e.d.a.b.AbstractC0294e.AbstractC0296b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f30684a = new p();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q5.d f30685b = q5.d.a("pc");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q5.d f30686c = q5.d.a("symbol");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final q5.d f30687d = q5.d.a(Action.FILE_ATTRIBUTE);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final q5.d f30688e = q5.d.a("offset");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final q5.d f30689f = q5.d.a("importance");

        @Override // q5.b
        public void encode(Object obj, q5.f fVar) throws IOException {
            a0.e.d.a.b.AbstractC0294e.AbstractC0296b abstractC0296b = (a0.e.d.a.b.AbstractC0294e.AbstractC0296b) obj;
            q5.f fVar2 = fVar;
            fVar2.c(f30685b, abstractC0296b.d());
            fVar2.a(f30686c, abstractC0296b.e());
            fVar2.a(f30687d, abstractC0296b.a());
            fVar2.c(f30688e, abstractC0296b.c());
            fVar2.b(f30689f, abstractC0296b.b());
        }
    }

    public static final class q implements q5.e<a0.e.d.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f30690a = new q();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q5.d f30691b = q5.d.a("batteryLevel");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q5.d f30692c = q5.d.a("batteryVelocity");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final q5.d f30693d = q5.d.a("proximityOn");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final q5.d f30694e = q5.d.a("orientation");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final q5.d f30695f = q5.d.a("ramUsed");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final q5.d f30696g = q5.d.a("diskUsed");

        @Override // q5.b
        public void encode(Object obj, q5.f fVar) throws IOException {
            a0.e.d.c cVar = (a0.e.d.c) obj;
            q5.f fVar2 = fVar;
            fVar2.a(f30691b, cVar.a());
            fVar2.b(f30692c, cVar.b());
            fVar2.d(f30693d, cVar.f());
            fVar2.b(f30694e, cVar.d());
            fVar2.c(f30695f, cVar.e());
            fVar2.c(f30696g, cVar.c());
        }
    }

    public static final class r implements q5.e<a0.e.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f30697a = new r();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q5.d f30698b = q5.d.a("timestamp");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q5.d f30699c = q5.d.a("type");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final q5.d f30700d = q5.d.a("app");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final q5.d f30701e = q5.d.a("device");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final q5.d f30702f = q5.d.a("log");

        @Override // q5.b
        public void encode(Object obj, q5.f fVar) throws IOException {
            a0.e.d dVar = (a0.e.d) obj;
            q5.f fVar2 = fVar;
            fVar2.c(f30698b, dVar.d());
            fVar2.a(f30699c, dVar.e());
            fVar2.a(f30700d, dVar.a());
            fVar2.a(f30701e, dVar.b());
            fVar2.a(f30702f, dVar.c());
        }
    }

    public static final class s implements q5.e<a0.e.d.AbstractC0298d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f30703a = new s();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q5.d f30704b = q5.d.a(AppLovinEventTypes.USER_VIEWED_CONTENT);

        @Override // q5.b
        public void encode(Object obj, q5.f fVar) throws IOException {
            fVar.a(f30704b, ((a0.e.d.AbstractC0298d) obj).a());
        }
    }

    public static final class t implements q5.e<a0.e.AbstractC0299e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t f30705a = new t();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q5.d f30706b = q5.d.a("platform");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q5.d f30707c = q5.d.a("version");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final q5.d f30708d = q5.d.a("buildVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final q5.d f30709e = q5.d.a("jailbroken");

        @Override // q5.b
        public void encode(Object obj, q5.f fVar) throws IOException {
            a0.e.AbstractC0299e abstractC0299e = (a0.e.AbstractC0299e) obj;
            q5.f fVar2 = fVar;
            fVar2.b(f30706b, abstractC0299e.b());
            fVar2.a(f30707c, abstractC0299e.c());
            fVar2.a(f30708d, abstractC0299e.a());
            fVar2.d(f30709e, abstractC0299e.d());
        }
    }

    public static final class u implements q5.e<a0.e.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final u f30710a = new u();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q5.d f30711b = q5.d.a("identifier");

        @Override // q5.b
        public void encode(Object obj, q5.f fVar) throws IOException {
            fVar.a(f30711b, ((a0.e.f) obj).a());
        }
    }

    @Override // r5.a
    public void configure(r5.b<?> bVar) {
        c cVar = c.f30606a;
        bVar.a(a0.class, cVar);
        bVar.a(h5.b.class, cVar);
        i iVar = i.f30641a;
        bVar.a(a0.e.class, iVar);
        bVar.a(h5.g.class, iVar);
        f fVar = f.f30621a;
        bVar.a(a0.e.a.class, fVar);
        bVar.a(h5.h.class, fVar);
        g gVar = g.f30629a;
        bVar.a(a0.e.a.b.class, gVar);
        bVar.a(h5.i.class, gVar);
        u uVar = u.f30710a;
        bVar.a(a0.e.f.class, uVar);
        bVar.a(v.class, uVar);
        t tVar = t.f30705a;
        bVar.a(a0.e.AbstractC0299e.class, tVar);
        bVar.a(h5.u.class, tVar);
        h hVar = h.f30631a;
        bVar.a(a0.e.c.class, hVar);
        bVar.a(h5.j.class, hVar);
        r rVar = r.f30697a;
        bVar.a(a0.e.d.class, rVar);
        bVar.a(h5.k.class, rVar);
        j jVar = j.f30653a;
        bVar.a(a0.e.d.a.class, jVar);
        bVar.a(h5.l.class, jVar);
        l lVar = l.f30664a;
        bVar.a(a0.e.d.a.b.class, lVar);
        bVar.a(h5.m.class, lVar);
        o oVar = o.f30680a;
        bVar.a(a0.e.d.a.b.AbstractC0294e.class, oVar);
        bVar.a(h5.q.class, oVar);
        p pVar = p.f30684a;
        bVar.a(a0.e.d.a.b.AbstractC0294e.AbstractC0296b.class, pVar);
        bVar.a(h5.r.class, pVar);
        m mVar = m.f30670a;
        bVar.a(a0.e.d.a.b.c.class, mVar);
        bVar.a(h5.o.class, mVar);
        C0284a c0284a = C0284a.f30594a;
        bVar.a(a0.a.class, c0284a);
        bVar.a(h5.c.class, c0284a);
        n nVar = n.f30676a;
        bVar.a(a0.e.d.a.b.AbstractC0292d.class, nVar);
        bVar.a(h5.p.class, nVar);
        k kVar = k.f30659a;
        bVar.a(a0.e.d.a.b.AbstractC0288a.class, kVar);
        bVar.a(h5.n.class, kVar);
        b bVar2 = b.f30603a;
        bVar.a(a0.c.class, bVar2);
        bVar.a(h5.d.class, bVar2);
        q qVar = q.f30690a;
        bVar.a(a0.e.d.c.class, qVar);
        bVar.a(h5.s.class, qVar);
        s sVar = s.f30703a;
        bVar.a(a0.e.d.AbstractC0298d.class, sVar);
        bVar.a(h5.t.class, sVar);
        d dVar = d.f30615a;
        bVar.a(a0.d.class, dVar);
        bVar.a(h5.e.class, dVar);
        e eVar = e.f30618a;
        bVar.a(a0.d.b.class, eVar);
        bVar.a(h5.f.class, eVar);
    }
}
