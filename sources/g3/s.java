package g3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class s<Data, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0.e<List<Throwable>> f29942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<? extends j<Data, ResourceType, Transcode>> f29943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29944c;

    public s(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<j<Data, ResourceType, Transcode>> list, o0.e<List<Throwable>> eVar) {
        this.f29942a = eVar;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f29943b = list;
        StringBuilder sbA = defpackage.a.a("Failed LoadPath{");
        sbA.append(cls.getSimpleName());
        sbA.append("->");
        sbA.append(cls2.getSimpleName());
        sbA.append("->");
        sbA.append(cls3.getSimpleName());
        sbA.append("}");
        this.f29944c = sbA.toString();
    }

    public u<Transcode> a(e3.e<Data> eVar, d3.e eVar2, int i10, int i11, j.a<ResourceType> aVar) throws q {
        List<Throwable> listB = this.f29942a.b();
        Objects.requireNonNull(listB, "Argument must not be null");
        List<Throwable> list = listB;
        try {
            int size = this.f29943b.size();
            u<Transcode> uVarA = null;
            for (int i12 = 0; i12 < size; i12++) {
                try {
                    uVarA = this.f29943b.get(i12).a(eVar, i10, i11, eVar2, aVar);
                } catch (q e10) {
                    list.add(e10);
                }
                if (uVarA != null) {
                    break;
                }
            }
            if (uVarA == null) {
                throw new q(this.f29944c, new ArrayList(list));
            }
            this.f29942a.a(list);
            return uVarA;
        } catch (Throwable th) {
            this.f29942a.a(list);
            throw th;
        }
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("LoadPath{decodePaths=");
        sbA.append(Arrays.toString(this.f29943b.toArray()));
        sbA.append('}');
        return sbA.toString();
    }
}
