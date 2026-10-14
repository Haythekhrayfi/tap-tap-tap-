package s5;

import t5.g;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements q5.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f35455b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f35456c = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35457a;

    public /* synthetic */ a(int i10) {
        this.f35457a = i10;
    }

    @Override // q5.b
    public final void encode(Object obj, q5.f fVar) {
        switch (this.f35457a) {
            case 0:
                e.a aVar = e.f35461e;
                throw new q5.c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            default:
                q5.e<Object> eVar = g.a.f35698d;
                throw new q5.c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
