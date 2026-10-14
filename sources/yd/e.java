package yd;

import fd.j0;
import java.util.Collection;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Objects;
import java.util.Stack;
import kc.t;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends l implements uc.a<zd.b<Object>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f.a f44888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ge.b f44889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ de.a f44890e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f.a aVar, ge.b bVar, de.a aVar2) {
        super(0);
        this.f44888c = aVar;
        this.f44889d = bVar;
        this.f44890e = aVar2;
    }

    @Override // uc.a
    public zd.b<Object> invoke() throws je.e {
        f.a aVar = this.f44888c;
        f fVar = aVar.f44899f;
        ge.b<?> bVar = this.f44889d;
        uc.a aVar2 = aVar.f44903j;
        de.a aVar3 = this.f44890e;
        ee.b bVar2 = fVar.f44891a;
        g gVar = new g(fVar, bVar, aVar2, aVar3);
        Objects.requireNonNull(bVar2);
        j0.j(bVar, "beanDefinition");
        j0.j(gVar, "execution");
        Stack<ge.b<?>> stack = bVar2.f29163a;
        boolean z10 = false;
        if (!(stack instanceof Collection) || !stack.isEmpty()) {
            Iterator<T> it = stack.iterator();
            while (it.hasNext()) {
                if (j0.d((ge.b) it.next(), bVar)) {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            throw new je.e("Cyclic call while resolving " + bVar + ". Definition is already in resolution in current call:\n\t" + t.w(bVar2.f29163a, "\n\t", null, null, 0, null, null, 62));
        }
        bVar2.f29163a.add(bVar);
        zd.b<Object> bVarInvoke = gVar.invoke();
        try {
            ge.b<?> bVarPop = bVar2.f29163a.pop();
            j0.e(bVarPop, "stack.pop()");
            ge.b<?> bVar3 = bVarPop;
            if (!(!j0.d(bVar3, bVar))) {
                return bVarInvoke;
            }
            bVar2.f29163a.clear();
            throw new je.e("Stack resolution error : was " + bVar3 + " but should be " + bVar);
        } catch (EmptyStackException unused) {
            throw new je.e("Stack resolution error while resolving " + bVar);
        }
    }
}
