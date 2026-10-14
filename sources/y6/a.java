package y6;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import android.os.Handler;
import android.util.SparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements le.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f38093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final jc.e f38094d;

    /* JADX INFO: renamed from: y6.a$a, reason: collision with other inner class name */
    public static final class C0467a extends vc.l implements uc.a<r6.e> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ le.a f38095c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f38096d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f38097e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f38098f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0467a(le.a aVar, String str, de.a aVar2, uc.a aVar3) {
            super(0);
            this.f38095c = aVar;
            this.f38096d = str;
            this.f38097e = aVar2;
            this.f38098f = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, r6.e] */
        @Override // uc.a
        public final r6.e invoke() {
            return this.f38095c.getKoin().f37311a.c(new yd.h(this.f38096d, vc.b0.a(r6.e.class), this.f38097e, this.f38098f));
        }
    }

    static {
        a aVar = new a();
        f38093c = aVar;
        f38094d = jc.f.b(new C0467a(aVar, "", null, ae.b.f348c));
    }

    public final void a(AccessibilityService accessibilityService, GestureDescription gestureDescription, AccessibilityService.GestureResultCallback gestureResultCallback, Handler handler) {
        boolean z10;
        fd.j0.i(gestureDescription, "gestureDescription");
        if (((r6.e) ((jc.k) f38094d).getValue()).b()) {
            try {
                accessibilityService.getClass().getSuperclass().getDeclaredField("mConnectionId");
                z10 = true;
            } catch (Exception unused) {
                z10 = false;
            }
            if (z10) {
                try {
                    b(accessibilityService, gestureDescription, gestureResultCallback, handler);
                    return;
                } catch (Exception e10) {
                    xe.a.f37601c.a(d0.b.a(e10, d0.c.a("[ClickService] DispatchRef Exception: ", e10, ' ')), new Object[0]);
                    e10.printStackTrace();
                }
            }
        }
        accessibilityService.dispatchGesture(gestureDescription, gestureResultCallback, handler);
    }

    public final void b(AccessibilityService accessibilityService, GestureDescription gestureDescription, AccessibilityService.GestureResultCallback gestureResultCallback, Handler handler) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Field declaredField = accessibilityService.getClass().getSuperclass().getDeclaredField("mGestureStatusCallbackInfos");
        Field declaredField2 = accessibilityService.getClass().getSuperclass().getDeclaredField("mConnectionId");
        Field declaredField3 = accessibilityService.getClass().getSuperclass().getDeclaredField("mLock");
        Field declaredField4 = accessibilityService.getClass().getSuperclass().getDeclaredField("mGestureStatusCallbackSequence");
        declaredField3.setAccessible(true);
        declaredField2.setAccessible(true);
        declaredField4.setAccessible(true);
        declaredField.setAccessible(true);
        int i10 = declaredField2.getInt(accessibilityService);
        Method declaredMethod = Class.forName("android.view.accessibility.AccessibilityInteractionClient").getDeclaredMethod("getInstance", new Class[0]);
        declaredMethod.setAccessible(true);
        Object objInvoke = declaredMethod.invoke(accessibilityService, new Object[0]);
        Method method = objInvoke.getClass().getMethod("getConnection", Integer.TYPE);
        method.setAccessible(true);
        Object objInvoke2 = method.invoke(objInvoke, Integer.valueOf(i10));
        Class<?>[] declaredClasses = Class.forName("android.accessibilityservice.GestureDescription").getDeclaredClasses();
        fd.j0.h(declaredClasses, "forName(\"android.accessi…         .declaredClasses");
        for (Class<?> cls : declaredClasses) {
            if (ed.u.x(cls.getName(), "MotionEventGenerator", false, 2)) {
                Method declaredMethod2 = cls.getDeclaredMethod("getGestureStepsFromGestureDescription", GestureDescription.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                Object objInvoke3 = declaredMethod2.invoke(accessibilityService, gestureDescription, 10);
                Object obj = declaredField3.get(accessibilityService);
                fd.j0.h(obj, "mLock");
                synchronized (obj) {
                    int i11 = declaredField4.getInt(accessibilityService) + 1;
                    declaredField4.setInt(accessibilityService, i11);
                    if (gestureResultCallback != null) {
                        Class<?>[] declaredClasses2 = Class.forName("android.accessibilityservice.AccessibilityService").getDeclaredClasses();
                        fd.j0.h(declaredClasses2, "forName(\"android.accessi…         .declaredClasses");
                        int length = declaredClasses2.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length) {
                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                            }
                            Class<?> cls2 = declaredClasses2[i12];
                            if (ed.u.x(cls2.getName(), "GestureResultCallbackInfo", false, 2)) {
                                Object obj2 = declaredField.get(accessibilityService);
                                if (obj2 == null) {
                                    declaredField.set(accessibilityService, new SparseArray());
                                }
                                Constructor<?>[] declaredConstructors = cls2.getDeclaredConstructors();
                                fd.j0.h(declaredConstructors, "gestureCallbackInfoClass.declaredConstructors");
                                Constructor constructor = (Constructor) kc.j.q(declaredConstructors);
                                constructor.setAccessible(true);
                                Object objNewInstance = constructor.newInstance(gestureDescription, gestureResultCallback, handler);
                                Method[] declaredMethods = obj2.getClass().getDeclaredMethods();
                                fd.j0.h(declaredMethods, "mGestureCallbackInfos.javaClass.declaredMethods");
                                int length2 = declaredMethods.length;
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= length2) {
                                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                                    }
                                    Method method2 = declaredMethods[i13];
                                    if (fd.j0.d(method2.getName(), "put")) {
                                        method2.setAccessible(true);
                                        method2.invoke(obj2, Integer.valueOf(i11), objNewInstance);
                                        break;
                                    }
                                    i13++;
                                }
                            } else {
                                i12++;
                            }
                        }
                    }
                    Class<?> cls3 = Class.forName("android.content.pm.ParceledListSlice");
                    Constructor<?>[] constructors = cls3.getConstructors();
                    fd.j0.h(constructors, "parceledListSliceClass.constructors");
                    Constructor constructor2 = (Constructor) kc.j.q(constructors);
                    constructor2.setAccessible(true);
                    Object objNewInstance2 = constructor2.newInstance(objInvoke3);
                    Method declaredMethod3 = objInvoke2.getClass().getDeclaredMethod("sendGesture", Integer.TYPE, cls3);
                    declaredMethod3.setAccessible(true);
                    declaredMethod3.invoke(objInvoke2, Integer.valueOf(i11), objNewInstance2);
                }
                return;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // le.a
    public wd.b getKoin() {
        return le.a.C0352a.a();
    }
}
