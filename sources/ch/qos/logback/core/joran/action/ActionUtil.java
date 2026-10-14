package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.util.ContextUtil;
import ch.qos.logback.core.util.OptionHelper;
import java.util.Properties;

/* JADX INFO: loaded from: classes.dex */
public class ActionUtil {

    public enum Scope {
        LOCAL,
        CONTEXT,
        SYSTEM
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3693a;

        static {
            int[] iArr = new int[Scope.values().length];
            f3693a = iArr;
            try {
                iArr[Scope.LOCAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3693a[Scope.CONTEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3693a[Scope.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static void setProperties(InterpretationContext interpretationContext, Properties properties, Scope scope) {
        int i10 = a.f3693a[scope.ordinal()];
        if (i10 == 1) {
            interpretationContext.addSubstitutionProperties(properties);
        } else if (i10 == 2) {
            new ContextUtil(interpretationContext.getContext()).addProperties(properties);
        } else {
            if (i10 != 3) {
                return;
            }
            OptionHelper.setSystemProperties(interpretationContext, properties);
        }
    }

    public static void setProperty(InterpretationContext interpretationContext, String str, String str2, Scope scope) {
        int i10 = a.f3693a[scope.ordinal()];
        if (i10 == 1) {
            interpretationContext.addSubstitutionProperty(str, str2);
        } else if (i10 == 2) {
            interpretationContext.getContext().putProperty(str, str2);
        } else {
            if (i10 != 3) {
                return;
            }
            OptionHelper.setSystemProperty(interpretationContext, str, str2);
        }
    }

    public static Scope stringToScope(String str) {
        Scope scope = Scope.SYSTEM;
        if (scope.toString().equalsIgnoreCase(str)) {
            return scope;
        }
        Scope scope2 = Scope.CONTEXT;
        return scope2.toString().equalsIgnoreCase(str) ? scope2 : Scope.LOCAL;
    }
}
