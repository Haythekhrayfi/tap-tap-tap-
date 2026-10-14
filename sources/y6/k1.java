package y6;

import com.inscode.autoclicker.service.ClickService;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k1 implements le.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jc.e f38267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jc.e f38268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f38269e;

    public static final class a extends vc.l implements uc.a<uc.a<? extends ClickService>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ le.a f38270c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f38271d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f38272e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f38273f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(le.a aVar, String str, de.a aVar2, uc.a aVar3) {
            super(0);
            this.f38270c = aVar;
            this.f38271d = str;
            this.f38272e = aVar2;
            this.f38273f = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, uc.a<? extends com.inscode.autoclicker.service.ClickService>] */
        @Override // uc.a
        public final uc.a<? extends ClickService> invoke() {
            return this.f38270c.getKoin().f37311a.c(new yd.h(this.f38271d, vc.b0.a(uc.a.class), this.f38272e, this.f38273f));
        }
    }

    public static final class b extends vc.l implements uc.a<r6.e> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ le.a f38274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f38275d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f38276e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f38277f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(le.a aVar, String str, de.a aVar2, uc.a aVar3) {
            super(0);
            this.f38274c = aVar;
            this.f38275d = str;
            this.f38276e = aVar2;
            this.f38277f = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, r6.e] */
        @Override // uc.a
        public final r6.e invoke() {
            return this.f38274c.getKoin().f37311a.c(new yd.h(this.f38275d, vc.b0.a(r6.e.class), this.f38276e, this.f38277f));
        }
    }

    public k1() {
        ae.b bVar = ae.b.f348c;
        this.f38267c = jc.f.b(new a(this, "", null, bVar));
        this.f38268d = jc.f.b(new b(this, "", null, bVar));
        this.f38269e = true;
    }

    public void a() {
    }

    public abstract void b();

    public abstract r6.k c();

    public void d() {
    }

    public abstract void e();

    public abstract void f();

    @Override // le.a
    public wd.b getKoin() {
        return le.a.C0352a.a();
    }
}
