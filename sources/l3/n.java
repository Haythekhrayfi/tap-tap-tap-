package l3;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public interface n<Model, Data> {

    public static class a<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d3.c f32166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<d3.c> f32167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e3.d<Data> f32168c;

        public a(d3.c cVar, e3.d<Data> dVar) {
            this(cVar, Collections.emptyList(), dVar);
        }

        public a(d3.c cVar, List<d3.c> list, e3.d<Data> dVar) {
            Objects.requireNonNull(cVar, "Argument must not be null");
            this.f32166a = cVar;
            Objects.requireNonNull(list, "Argument must not be null");
            this.f32167b = list;
            Objects.requireNonNull(dVar, "Argument must not be null");
            this.f32168c = dVar;
        }
    }

    boolean a(Model model);

    a<Data> b(Model model, int i10, int i11, d3.e eVar);
}
