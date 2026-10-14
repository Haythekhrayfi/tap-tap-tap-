package c8;

import com.developer.filepicker.model.DialogConfigs;
import fd.j0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x9.a f3626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f3627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q.a<o7.a, f> f3628c;

    public c(x9.a aVar, j jVar) {
        j0.i(aVar, "cache");
        j0.i(jVar, "temporaryCache");
        this.f3626a = aVar;
        this.f3627b = jVar;
        this.f3628c = new q.a<>();
    }

    public final f a(o7.a aVar) {
        f orDefault;
        j0.i(aVar, "tag");
        synchronized (this.f3628c) {
            f fVar = null;
            orDefault = this.f3628c.getOrDefault(aVar, null);
            if (orDefault == null) {
                String strD = this.f3626a.d(aVar.f33995a);
                if (strD != null) {
                    fVar = new f(Long.parseLong(strD));
                }
                this.f3628c.put(aVar, fVar);
                orDefault = fVar;
            }
        }
        return orDefault;
    }

    public final void b(o7.a aVar, long j10, boolean z10) {
        j0.i(aVar, "tag");
        if (j0.d(o7.a.f33994b, aVar)) {
            return;
        }
        synchronized (this.f3628c) {
            f fVarA = a(aVar);
            this.f3628c.put(aVar, fVarA == null ? new f(j10) : new f(j10, fVarA.f3635b));
            j jVar = this.f3627b;
            String str = aVar.f33995a;
            j0.h(str, "tag.id");
            String strValueOf = String.valueOf(j10);
            Objects.requireNonNull(jVar);
            j0.i(strValueOf, "stateId");
            jVar.a(str, DialogConfigs.DIRECTORY_SEPERATOR, strValueOf);
            if (!z10) {
                this.f3626a.c(aVar.f33995a, String.valueOf(j10));
            }
        }
    }

    public final void c(String str, e eVar, boolean z10) {
        j0.i(eVar, "divStatePath");
        String strB = eVar.b();
        String strA = eVar.a();
        if (strB == null || strA == null) {
            return;
        }
        synchronized (this.f3628c) {
            this.f3627b.a(str, strB, strA);
            if (!z10) {
                this.f3626a.b(str, strB, strA);
            }
        }
    }
}
