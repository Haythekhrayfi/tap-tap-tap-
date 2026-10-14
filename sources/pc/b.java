package pc;

import ch.qos.logback.core.CoreConstants;
import ed.u;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f34635a;

    /* JADX WARN: Code duplicated, block: B:72:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        a aVar;
        Object objNewInstance;
        String property = System.getProperty("java.specification.version");
        int i10 = 65542;
        if (property != null) {
            int iD = u.D(property, CoreConstants.DOT, 0, false, 6);
            try {
                if (iD < 0) {
                    i10 = Integer.parseInt(property) * 65536;
                } else {
                    int i11 = iD + 1;
                    int iD2 = u.D(property, CoreConstants.DOT, i11, false, 4);
                    if (iD2 < 0) {
                        iD2 = property.length();
                    }
                    String strSubstring = property.substring(0, iD);
                    j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    String strSubstring2 = property.substring(i11, iD2);
                    j0.h(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    i10 = (Integer.parseInt(strSubstring) * 65536) + Integer.parseInt(strSubstring2);
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (i10 >= 65544 || i10 < 65536) {
            try {
                Object objNewInstance2 = rc.a.class.newInstance();
                j0.h(objNewInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    try {
                        aVar = (a) objNewInstance2;
                    } catch (ClassCastException e10) {
                        ClassLoader classLoader = objNewInstance2.getClass().getClassLoader();
                        ClassLoader classLoader2 = a.class.getClassLoader();
                        if (j0.d(classLoader, classLoader2)) {
                            throw e10;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e10);
                    }
                } catch (ClassNotFoundException unused2) {
                    if (i10 < 65543) {
                        try {
                            objNewInstance = qc.a.class.newInstance();
                            j0.h(objNewInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                            try {
                                try {
                                    aVar = (a) objNewInstance;
                                } catch (ClassCastException e11) {
                                    ClassLoader classLoader3 = objNewInstance.getClass().getClassLoader();
                                    ClassLoader classLoader4 = a.class.getClassLoader();
                                    if (j0.d(classLoader3, classLoader4)) {
                                        throw e11;
                                    }
                                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e11);
                                }
                            } catch (ClassNotFoundException unused3) {
                                aVar = new a();
                            }
                        } catch (ClassNotFoundException unused4) {
                            Object objNewInstance3 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                            j0.h(objNewInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                            try {
                                aVar = (a) objNewInstance3;
                            } catch (ClassCastException e12) {
                                ClassLoader classLoader5 = objNewInstance3.getClass().getClassLoader();
                                ClassLoader classLoader6 = a.class.getClassLoader();
                                if (j0.d(classLoader5, classLoader6)) {
                                    throw e12;
                                }
                                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e12);
                            }
                        }
                    } else {
                        objNewInstance = qc.a.class.newInstance();
                        j0.h(objNewInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                        aVar = (a) objNewInstance;
                    }
                }
            } catch (ClassNotFoundException unused5) {
                Object objNewInstance4 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                j0.h(objNewInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    aVar = (a) objNewInstance4;
                } catch (ClassCastException e13) {
                    ClassLoader classLoader7 = objNewInstance4.getClass().getClassLoader();
                    ClassLoader classLoader8 = a.class.getClassLoader();
                    if (j0.d(classLoader7, classLoader8)) {
                        throw e13;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e13);
                }
            }
        } else if (i10 < 65543 || i10 < 65536) {
            objNewInstance = qc.a.class.newInstance();
            j0.h(objNewInstance, "forName(\"kotlin.internal…entations\").newInstance()");
            aVar = (a) objNewInstance;
        } else {
            aVar = new a();
        }
        f34635a = aVar;
    }
}
