package oc;

import fd.j0;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import jc.i;
import jc.w;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements mc.d<Object>, d, Serializable {
    private final mc.d<Object> completion;

    public a(mc.d<Object> dVar) {
        this.completion = dVar;
    }

    public mc.d<w> create(Object obj, mc.d<?> dVar) {
        j0.i(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public mc.d<w> create(mc.d<?> dVar) {
        j0.i(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        mc.d<Object> dVar = this.completion;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final mc.d<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        j0.i(this, "<this>");
        e eVar = (e) getClass().getAnnotation(e.class);
        String str = null;
        if (eVar == null) {
            return null;
        }
        int iV = eVar.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i10 = iIntValue >= 0 ? eVar.l()[iIntValue] : -1;
        f fVar = f.f34225a;
        j0.i(this, "continuation");
        f.a aVar = f.f34227c;
        if (aVar == null) {
            try {
                f.a aVar2 = new f.a(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                f.f34227c = aVar2;
                aVar = aVar2;
            } catch (Exception unused2) {
                aVar = f.f34226b;
                f.f34227c = aVar;
            }
        }
        if (aVar != f.f34226b) {
            Method method = aVar.f34228a;
            Object objInvoke = method != null ? method.invoke(getClass(), new Object[0]) : null;
            if (objInvoke != null) {
                Method method2 = aVar.f34229b;
                Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, new Object[0]) : null;
                if (objInvoke2 != null) {
                    Method method3 = aVar.f34230c;
                    Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
                    if (objInvoke3 instanceof String) {
                        str = (String) objInvoke3;
                    }
                }
            }
        }
        if (str == null) {
            strC = eVar.c();
        } else {
            strC = str + '/' + eVar.c();
        }
        return new StackTraceElement(strC, eVar.m(), eVar.f(), i10);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    @Override // mc.d
    public final void resumeWith(Object obj) {
        mc.d<Object> dVar = this;
        while (true) {
            j0.i(dVar, "frame");
            a aVar = (a) dVar;
            mc.d<Object> dVar2 = aVar.completion;
            j0.f(dVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == nc.a.COROUTINE_SUSPENDED) {
                    return;
                }
                i.a aVar2 = i.f31813c;
                i.a aVar3 = i.f31813c;
            } catch (Throwable th) {
                i.a aVar4 = i.f31813c;
                obj = h9.d.f(th);
            }
            aVar.releaseIntercepted();
            if (!(dVar2 instanceof a)) {
                dVar2.resumeWith(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sbA.append(stackTraceElement);
        return sbA.toString();
    }
}
