package l3;

/* JADX INFO: loaded from: classes.dex */
public class v<Model> implements n<Model, Model> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v<?> f32199a = new v<>();

    public static class a<Model> implements o<Model, Model> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a<?> f32200a = new a<>();

        @Deprecated
        public a() {
        }

        @Override // l3.o
        public n<Model, Model> a(r rVar) {
            return v.f32199a;
        }
    }

    public static class b<Model> implements e3.d<Model> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Model f32201c;

        public b(Model model) {
            this.f32201c = model;
        }

        @Override // e3.d
        public Class<Model> a() {
            return (Class<Model>) this.f32201c.getClass();
        }

        @Override // e3.d
        public void b() {
        }

        @Override // e3.d
        public void cancel() {
        }

        @Override // e3.d
        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // e3.d
        public void e(a3.g gVar, e3.d.a<? super Model> aVar) {
            aVar.f(this.f32201c);
        }
    }

    @Deprecated
    public v() {
    }

    @Override // l3.n
    public boolean a(Model model) {
        return true;
    }

    @Override // l3.n
    public n.a<Model> b(Model model, int i10, int i11, d3.e eVar) {
        return new n.a<>(new a4.c(model), new b(model));
    }
}
