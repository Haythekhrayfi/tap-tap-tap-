package ma;

import androidx.appcompat.app.AppCompatActivity;
import fd.g0;
import fd.j0;
import fd.z;
import java.util.Objects;
import jc.w;

/* JADX INFO: loaded from: classes3.dex */
@oc.e(c = "com.zipoapps.premiumhelper.PremiumHelper$onHappyMoment$1", f = "PremiumHelper.kt", l = {274, 280}, m = "invokeSuspend")
public final class s extends oc.h implements uc.p<g0, mc.d<? super w>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f33505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f33506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f33507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f33508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ uc.a<w> f33509h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(int i10, h hVar, AppCompatActivity appCompatActivity, int i11, uc.a<w> aVar, mc.d<? super s> dVar) {
        super(2, dVar);
        this.f33505d = i10;
        this.f33506e = hVar;
        this.f33507f = appCompatActivity;
        this.f33508g = i11;
        this.f33509h = aVar;
    }

    @Override // oc.a
    public final mc.d<w> create(Object obj, mc.d<?> dVar) {
        return new s(this.f33505d, this.f33506e, this.f33507f, this.f33508g, this.f33509h, dVar);
    }

    @Override // uc.p
    public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
        return new s(this.f33505d, this.f33506e, this.f33507f, this.f33508g, this.f33509h, dVar).invokeSuspend(w.f31842a);
    }

    @Override // oc.a
    public final Object invokeSuspend(Object obj) {
        uc.a<w> cVar;
        uc.a<w> dVar;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i10 = this.f33504c;
        if (i10 != 0) {
            if (i10 == 1) {
                h9.d.t(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            this.f33506e.f33423l.f269h = false;
            return w.f31842a;
        }
        h9.d.t(obj);
        long j10 = this.f33505d;
        this.f33504c = 1;
        if (z.m(j10, this) == aVar) {
            return aVar;
        }
        wa.a aVar2 = this.f33506e.f33425n;
        AppCompatActivity appCompatActivity = this.f33507f;
        int i11 = this.f33508g;
        uc.a<w> aVar3 = this.f33509h;
        Objects.requireNonNull(aVar2);
        j0.i(appCompatActivity, "activity");
        wa.a.EnumC0448a enumC0448a = (wa.a.EnumC0448a) aVar2.f37198b.g(oa.b.f34201x);
        switch (wa.a.b.f37201a[enumC0448a.ordinal()]) {
            case 1:
                cVar = new wa.c(enumC0448a, aVar2, appCompatActivity, i11, aVar3);
                dVar = new wa.d(appCompatActivity, aVar3);
                aVar2.b(cVar, dVar);
                break;
            case 2:
                aVar2.b(new wa.e(enumC0448a, aVar2, appCompatActivity, aVar3), new wa.f(aVar3));
                break;
            case 3:
                aVar2.b(new wa.g(enumC0448a, aVar2, appCompatActivity, i11, aVar3), new wa.h(aVar3));
                break;
            case 4:
                aVar2.b(new wa.j(enumC0448a, aVar2, appCompatActivity, aVar3), new wa.k(appCompatActivity, aVar3));
                break;
            case 5:
                cVar = new wa.n(enumC0448a, aVar2, appCompatActivity, i11, aVar3);
                dVar = new wa.b(appCompatActivity, aVar3);
                aVar2.b(cVar, dVar);
                break;
            case 6:
                if (aVar3 != null) {
                    aVar3.invoke();
                }
                break;
        }
        this.f33504c = 2;
        if (z.m(1000L, this) == aVar) {
            return aVar;
        }
        this.f33506e.f33423l.f269h = false;
        return w.f31842a;
    }
}
