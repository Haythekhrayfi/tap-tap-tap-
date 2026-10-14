package s5;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes2.dex */
public class d implements q5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f35460a;

    public d(e eVar) {
        this.f35460a = eVar;
    }

    public void a(Object obj, Writer writer) throws IOException {
        e eVar = this.f35460a;
        f fVar = new f(writer, eVar.f35462a, eVar.f35463b, eVar.f35464c, eVar.f35465d);
        fVar.g(obj, false);
        fVar.i();
        fVar.f35468b.flush();
    }
}
