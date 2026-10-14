package l8;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class s4 implements w7.f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o8.p f32830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p4 f32831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i8.k f32832c;

    public static final class a implements r9.d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p4 f32833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i8.k f32834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o8.p f32835c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ uc.l<Long, jc.w> f32836d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(p4 p4Var, i8.k kVar, o8.p pVar, uc.l<? super Long, jc.w> lVar) {
            this.f32833a = p4Var;
            this.f32834b = kVar;
            this.f32835c = pVar;
            this.f32836d = lVar;
        }

        @Override // r9.d.b
        public void a(Float f10) {
            this.f32833a.f32740b.f(this.f32834b, this.f32835c, f10);
            this.f32836d.invoke(Long.valueOf(f10 == null ? 0L : xc.b.d(f10.floatValue())));
        }
    }

    public s4(o8.p pVar, p4 p4Var, i8.k kVar) {
        this.f32830a = pVar;
        this.f32831b = p4Var;
        this.f32832c = kVar;
    }

    @Override // w7.f.a
    public void a(Object obj) {
        Long l10 = (Long) obj;
        this.f32830a.p(l10 == null ? null : Float.valueOf(l10.longValue()), false, true);
    }

    @Override // w7.f.a
    public void b(uc.l<? super Long, jc.w> lVar) {
        o8.p pVar = this.f32830a;
        a aVar = new a(this.f32831b, this.f32832c, pVar, lVar);
        Objects.requireNonNull(pVar);
        pVar.f35314d.b(aVar);
    }
}
