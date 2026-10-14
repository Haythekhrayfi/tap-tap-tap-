package ch.qos.logback.classic.spi;

import ch.qos.logback.core.CoreConstants;
import java.net.URL;
import java.security.CodeSource;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class PackagingDataCalculator {
    public static final StackTraceElementProxy[] STEP_ARRAY_TEMPLATE = new StackTraceElementProxy[0];
    public HashMap<String, ClassPackagingData> cache = new HashMap<>();

    private Class<?> bestEffortLoadClass(ClassLoader classLoader, String str) {
        Class<?> clsLoadClass = loadClass(classLoader, str);
        if (clsLoadClass != null) {
            return clsLoadClass;
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != classLoader) {
            clsLoadClass = loadClass(contextClassLoader, str);
        }
        if (clsLoadClass != null) {
            return clsLoadClass;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private ClassPackagingData computeBySTEP(StackTraceElementProxy stackTraceElementProxy, ClassLoader classLoader) {
        String className = stackTraceElementProxy.ste.getClassName();
        ClassPackagingData classPackagingData = this.cache.get(className);
        if (classPackagingData != null) {
            return classPackagingData;
        }
        Class<?> clsBestEffortLoadClass = bestEffortLoadClass(classLoader, className);
        ClassPackagingData classPackagingData2 = new ClassPackagingData(getCodeLocation(clsBestEffortLoadClass), getImplementationVersion(clsBestEffortLoadClass), false);
        this.cache.put(className, classPackagingData2);
        return classPackagingData2;
    }

    private String getCodeLocation(Class<?> cls) {
        URL location;
        if (cls == null) {
            return "na";
        }
        try {
            CodeSource codeSource = cls.getProtectionDomain().getCodeSource();
            if (codeSource == null || (location = codeSource.getLocation()) == null) {
                return "na";
            }
            String string = location.toString();
            String codeLocation = getCodeLocation(string, '/');
            return codeLocation != null ? codeLocation : getCodeLocation(string, CoreConstants.ESCAPE_CHAR);
        } catch (Exception unused) {
            return "na";
        }
    }

    private String getCodeLocation(String str, char c10) {
        int iLastIndexOf = str.lastIndexOf(c10);
        if (isFolder(iLastIndexOf, str)) {
            return str.substring(str.lastIndexOf(c10, iLastIndexOf - 1) + 1);
        }
        if (iLastIndexOf > 0) {
            return str.substring(iLastIndexOf + 1);
        }
        return null;
    }

    private String getImplementationVersion(Class<?> cls) {
        Package r10;
        String implementationVersion;
        return (cls == null || (r10 = cls.getPackage()) == null || (implementationVersion = r10.getImplementationVersion()) == null) ? "na" : implementationVersion;
    }

    private boolean isFolder(int i10, String str) {
        return i10 != -1 && i10 + 1 == str.length();
    }

    private Class<?> loadClass(ClassLoader classLoader, String str) {
        if (classLoader == null) {
            return null;
        }
        try {
            return classLoader.loadClass(str);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private void populateFrames(StackTraceElementProxy[] stackTraceElementProxyArr) {
        int iFindNumberOfCommonFrames = STEUtil.findNumberOfCommonFrames(new Throwable("local stack reference").getStackTrace(), stackTraceElementProxyArr);
        int length = stackTraceElementProxyArr.length - iFindNumberOfCommonFrames;
        for (int i10 = 0; i10 < iFindNumberOfCommonFrames; i10++) {
            StackTraceElementProxy stackTraceElementProxy = stackTraceElementProxyArr[length + i10];
            stackTraceElementProxy.setClassPackagingData(computeBySTEP(stackTraceElementProxy, null));
        }
        populateUncommonFrames(iFindNumberOfCommonFrames, stackTraceElementProxyArr, null);
    }

    private void populateUncommonFrames(int i10, StackTraceElementProxy[] stackTraceElementProxyArr, ClassLoader classLoader) {
        int length = stackTraceElementProxyArr.length - i10;
        for (int i11 = 0; i11 < length; i11++) {
            StackTraceElementProxy stackTraceElementProxy = stackTraceElementProxyArr[i11];
            stackTraceElementProxy.setClassPackagingData(computeBySTEP(stackTraceElementProxy, classLoader));
        }
    }

    public void calculate(IThrowableProxy iThrowableProxy) {
        while (iThrowableProxy != null) {
            populateFrames(iThrowableProxy.getStackTraceElementProxyArray());
            IThrowableProxy[] suppressed = iThrowableProxy.getSuppressed();
            if (suppressed != null) {
                for (IThrowableProxy iThrowableProxy2 : suppressed) {
                    populateFrames(iThrowableProxy2.getStackTraceElementProxyArray());
                }
            }
            iThrowableProxy = iThrowableProxy.getCause();
        }
    }
}
