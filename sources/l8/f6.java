package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class f6 implements w7.f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a8.a f32380a;

    public static final class a implements a8.a.InterfaceC0006a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uc.l<Long, jc.w> f32381a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(uc.l<? super Long, jc.w> lVar) {
            this.f32381a = lVar;
        }
    }

    public f6(a8.a aVar) {
        this.f32380a = aVar;
    }

    @Override // w7.f.a
    public void a(Object obj) {
        Long l10 = (Long) obj;
        if (l10 == null) {
            return;
        }
        a8.a aVar = this.f32380a;
        l10.longValue();
        aVar.a(l10.longValue());
    }

    @Override // w7.f.a
    public void b(uc.l<? super Long, jc.w> lVar) {
        this.f32380a.b(new a(lVar));
    }
}
