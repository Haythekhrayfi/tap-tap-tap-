package w6;

import ch.qos.logback.core.CoreConstants;
import fd.j0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends vc.l implements uc.l<ae.a, q6.b> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fe.a f37126c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(fe.a aVar) {
        super(1);
        this.f37126c = aVar;
    }

    @Override // uc.l
    public q6.b invoke(ae.a aVar) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        j0.j(aVar, "it");
        fe.a aVar2 = this.f37126c;
        Constructor<?>[] constructors = q6.b.class.getConstructors();
        j0.e(constructors, "clazz.constructors");
        Constructor constructor = (Constructor) kc.j.r(constructors);
        if (constructor == null) {
            throw new IllegalStateException(("No constructor found for class '" + q6.b.class + CoreConstants.SINGLE_QUOTE_CHAR).toString());
        }
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        j0.e(parameterTypes, "ctor.parameterTypes");
        ArrayList arrayList = new ArrayList(parameterTypes.length);
        for (Class<?> cls : parameterTypes) {
            j0.e(cls, "it");
            arrayList.add(fd.f.c(aVar2, null, cls, null, 5));
        }
        Object[] array = arrayList.toArray(new Object[0]);
        if (array == null) {
            throw new jc.l("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Object objNewInstance = constructor.newInstance(Arrays.copyOf(array, array.length));
        Objects.requireNonNull(objNewInstance, "null cannot be cast to non-null type com.inscode.autoclicker.bus.RxEvents");
        return (q6.b) objNewInstance;
    }
}
