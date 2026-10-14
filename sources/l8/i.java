package l8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends vc.l implements uc.a<jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y9.q.d f32429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vc.v f32430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f32431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j.a f32432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f32433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v9.d f32434h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(y9.q.d dVar, vc.v vVar, j jVar, j.a aVar, int i10, v9.d dVar2) {
        super(0);
        this.f32429c = dVar;
        this.f32430d = vVar;
        this.f32431e = jVar;
        this.f32432f = aVar;
        this.f32433g = i10;
        this.f32434h = dVar2;
    }

    @Override // uc.a
    public jc.w invoke() {
        List<y9.q> list = this.f32429c.f42109b;
        List<y9.q> listA = null;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            y9.q qVar = this.f32429c.f42108a;
            if (qVar != null) {
                listA = kc.k.a(qVar);
            }
        } else {
            listA = list;
        }
        if (listA == null || listA.isEmpty()) {
            int i10 = e9.a.f29114a;
        } else {
            j jVar = this.f32431e;
            j.a aVar = this.f32432f;
            int i11 = this.f32433g;
            y9.q.d dVar = this.f32429c;
            v9.d dVar2 = this.f32434h;
            for (y9.q qVar2 : listA) {
                jVar.f32461b.d(aVar.f32467a, i11, dVar.f42110c.b(dVar2), qVar2);
                jVar.f32462c.a(qVar2, aVar.f32467a.getExpressionResolver());
                jVar.a(aVar.f32467a, qVar2, null);
            }
            this.f32430d.f37003c = true;
        }
        return jc.w.f31842a;
    }
}
