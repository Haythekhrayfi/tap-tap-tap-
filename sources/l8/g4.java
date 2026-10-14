package l8;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class g4 implements w7.f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y9.z5 f32401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o8.n f32402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q8.d f32403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v9.d f32404d;

    public g4(y9.z5 z5Var, o8.n nVar, q8.d dVar, v9.d dVar2) {
        this.f32401a = z5Var;
        this.f32402b = nVar;
        this.f32403c = dVar;
        this.f32404d = dVar2;
    }

    @Override // w7.f.a
    public void a(Object obj) {
        String strB;
        String str = (String) obj;
        dd.d.a aVar = new dd.d.a((dd.d) dd.q.d(kc.t.n(this.f32401a.f44665v), new f4(this.f32404d, str)));
        o8.n nVar = this.f32402b;
        if (aVar.hasNext()) {
            y9.z5.h hVar = (y9.z5.h) aVar.next();
            if (aVar.hasNext()) {
                this.f32403c.b(new Throwable("Multiple options found with value = \"" + ((Object) str) + "\", selecting first one"));
            }
            v9.b<String> bVar = hVar.f44678a;
            if (bVar == null) {
                bVar = hVar.f44679b;
            }
            strB = bVar.b(this.f32404d);
        } else {
            this.f32403c.b(new Throwable("No option found with value = \"" + ((Object) str) + CoreConstants.DOUBLE_QUOTE_CHAR));
            strB = "";
        }
        nVar.setText(strB);
    }

    @Override // w7.f.a
    public void b(uc.l<? super String, jc.w> lVar) {
        this.f32402b.setValueUpdater(lVar);
    }
}
