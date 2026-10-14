package g3;

import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d implements g, e3.d.a<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<d3.c> f29787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h<?> f29788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g.a f29789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d3.c f29791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<l3.n<File, ?>> f29792h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f29793i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile l3.n.a<?> f29794j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public File f29795k;

    public d(h<?> hVar, g.a aVar) {
        List<d3.c> listA = hVar.a();
        this.f29790f = -1;
        this.f29787c = listA;
        this.f29788d = hVar;
        this.f29789e = aVar;
    }

    public d(List<d3.c> list, h<?> hVar, g.a aVar) {
        this.f29790f = -1;
        this.f29787c = list;
        this.f29788d = hVar;
        this.f29789e = aVar;
    }

    @Override // g3.g
    public boolean b() {
        while (true) {
            List<l3.n<File, ?>> list = this.f29792h;
            if (list != null) {
                if (this.f29793i < list.size()) {
                    this.f29794j = null;
                    boolean z10 = false;
                    while (!z10) {
                        if (!(this.f29793i < this.f29792h.size())) {
                            break;
                        }
                        List<l3.n<File, ?>> list2 = this.f29792h;
                        int i10 = this.f29793i;
                        this.f29793i = i10 + 1;
                        l3.n<File, ?> nVar = list2.get(i10);
                        File file = this.f29795k;
                        h<?> hVar = this.f29788d;
                        this.f29794j = nVar.b(file, hVar.f29805e, hVar.f29806f, hVar.f29809i);
                        if (this.f29794j != null && this.f29788d.g(this.f29794j.f32168c.a())) {
                            this.f29794j.f32168c.e(this.f29788d.f29815o, this);
                            z10 = true;
                        }
                    }
                    return z10;
                }
            }
            int i11 = this.f29790f + 1;
            this.f29790f = i11;
            if (i11 >= this.f29787c.size()) {
                return false;
            }
            d3.c cVar = this.f29787c.get(this.f29790f);
            h<?> hVar2 = this.f29788d;
            File fileB = hVar2.b().b(new e(cVar, hVar2.f29814n));
            this.f29795k = fileB;
            if (fileB != null) {
                this.f29791g = cVar;
                this.f29792h = this.f29788d.f29803c.f38b.f(fileB);
                this.f29793i = 0;
            }
        }
    }

    @Override // e3.d.a
    public void c(Exception exc) {
        this.f29789e.e(this.f29791g, exc, this.f29794j.f32168c, com.bumptech.glide.load.a.DATA_DISK_CACHE);
    }

    @Override // g3.g
    public void cancel() {
        l3.n.a<?> aVar = this.f29794j;
        if (aVar != null) {
            aVar.f32168c.cancel();
        }
    }

    @Override // e3.d.a
    public void f(Object obj) {
        this.f29789e.a(this.f29791g, obj, this.f29794j.f32168c, com.bumptech.glide.load.a.DATA_DISK_CACHE, this.f29791g);
    }
}
