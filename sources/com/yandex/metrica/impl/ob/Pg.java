package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public final class Pg implements Og.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Og.b f14728a;

    public static final class a implements Xg {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.Xg
        public void a(Fg fg) {
            Og og = Og.this;
            Og.a(og, fg, Og.c(og));
        }

        @Override // com.yandex.metrica.impl.ob.Xg
        public void a(Throwable th) {
            Og og = Og.this;
            Og.a(og, null, Og.c(og));
        }
    }

    public Pg(Og.b bVar) {
        this.f14728a = bVar;
    }

    @Override // com.yandex.metrica.impl.ob.Og.a
    public void a() {
        Og.this.f14644g.a(new a());
    }
}
