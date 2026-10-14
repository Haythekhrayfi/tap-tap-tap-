package ue;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements d<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fd.i f36421a;

    public l(fd.i iVar) {
        this.f36421a = iVar;
    }

    @Override // ue.d
    public void a(b<Object> bVar, z<Object> zVar) {
        fd.i iVar;
        Object objF;
        j0.j(bVar, "call");
        j0.j(zVar, "response");
        if (zVar.b()) {
            objF = zVar.f36544b;
            if (objF == null) {
                Object objTag = bVar.request().tag(j.class);
                if (objTag == null) {
                    j0.q();
                    throw null;
                }
                j0.e(objTag, "call.request().tag(Invocation::class.java)!!");
                Method method = ((j) objTag).f36418a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Response from ");
                j0.e(method, "method");
                Class<?> declaringClass = method.getDeclaringClass();
                j0.e(declaringClass, "method.declaringClass");
                sb2.append(declaringClass.getName());
                sb2.append(CoreConstants.DOT);
                sb2.append(method.getName());
                sb2.append(" was null but response body type was declared as non-null");
                jc.d dVar = new jc.d(sb2.toString());
                iVar = this.f36421a;
                jc.i.a aVar = jc.i.f31813c;
                objF = h9.d.f(dVar);
            } else {
                iVar = this.f36421a;
                jc.i.a aVar2 = jc.i.f31813c;
            }
        } else {
            iVar = this.f36421a;
            h hVar = new h(zVar);
            jc.i.a aVar3 = jc.i.f31813c;
            objF = h9.d.f(hVar);
        }
        iVar.resumeWith(objF);
    }

    @Override // ue.d
    public void b(b<Object> bVar, Throwable th) {
        j0.j(bVar, "call");
        j0.j(th, "t");
        fd.i iVar = this.f36421a;
        jc.i.a aVar = jc.i.f31813c;
        iVar.resumeWith(h9.d.f(th));
    }
}
