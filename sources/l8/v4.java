package l8;

import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class v4 implements w7.f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o8.p f32907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p4 f32908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i8.k f32909c;

    public static final class a implements r9.d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p4 f32910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i8.k f32911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o8.p f32912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ uc.l<Long, jc.w> f32913d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(p4 p4Var, i8.k kVar, o8.p pVar, uc.l<? super Long, jc.w> lVar) {
            this.f32910a = p4Var;
            this.f32911b = kVar;
            this.f32912c = pVar;
            this.f32913d = lVar;
        }

        @Override // r9.d.b
        public void b(float f10) {
            this.f32910a.f32740b.f(this.f32911b, this.f32912c, Float.valueOf(f10));
            this.f32913d.invoke(Long.valueOf(xc.b.d(f10)));
        }
    }

    public v4(o8.p pVar, p4 p4Var, i8.k kVar) {
        this.f32907a = pVar;
        this.f32908b = p4Var;
        this.f32909c = kVar;
    }

    @Override // w7.f.a
    public void a(Object obj) {
        Long l10 = (Long) obj;
        this.f32907a.q(l10 == null ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : l10.longValue(), false, true);
    }

    @Override // w7.f.a
    public void b(uc.l<? super Long, jc.w> lVar) {
        o8.p pVar = this.f32907a;
        a aVar = new a(this.f32908b, this.f32909c, pVar, lVar);
        Objects.requireNonNull(pVar);
        pVar.f35314d.b(aVar);
    }
}
