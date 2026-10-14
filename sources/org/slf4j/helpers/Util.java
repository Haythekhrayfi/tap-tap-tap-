package org.slf4j.helpers;

/* JADX INFO: loaded from: classes3.dex */
public final class Util {
    private static b SECURITY_MANAGER;
    private static boolean SECURITY_MANAGER_CREATION_ALREADY_ATTEMPTED;

    public static final class b extends SecurityManager {
        public b(a aVar) {
        }

        @Override // java.lang.SecurityManager
        public Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    private Util() {
    }

    public static Class<?> getCallingClass() {
        int i10;
        b securityManager = getSecurityManager();
        if (securityManager == null) {
            return null;
        }
        Class<?>[] classContext = securityManager.getClassContext();
        String name = Util.class.getName();
        int i11 = 0;
        while (i11 < classContext.length && !name.equals(classContext[i11].getName())) {
            i11++;
        }
        if (i11 >= classContext.length || (i10 = i11 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i10];
    }

    private static b getSecurityManager() {
        b bVar = SECURITY_MANAGER;
        if (bVar != null) {
            return bVar;
        }
        if (SECURITY_MANAGER_CREATION_ALREADY_ATTEMPTED) {
            return null;
        }
        b bVarSafeCreateSecurityManager = safeCreateSecurityManager();
        SECURITY_MANAGER = bVarSafeCreateSecurityManager;
        SECURITY_MANAGER_CREATION_ALREADY_ATTEMPTED = true;
        return bVarSafeCreateSecurityManager;
    }

    public static final void report(String str) {
        System.err.println("SLF4J: " + str);
    }

    public static final void report(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }

    private static b safeCreateSecurityManager() {
        try {
            return new b(null);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static boolean safeGetBooleanSystemProperty(String str) {
        String strSafeGetSystemProperty = safeGetSystemProperty(str);
        if (strSafeGetSystemProperty == null) {
            return false;
        }
        return strSafeGetSystemProperty.equalsIgnoreCase("true");
    }

    public static String safeGetSystemProperty(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null input");
        }
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
